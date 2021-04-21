#!/usr/bin/env kotlinc -jvm-target 9 -cp dist/kotlinc/lib/kotlin-main-kts.jar -script
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import java.io.File
import java.io.InputStream
import java.io.PrintStream
import java.nio.file.Path
import javax.xml.parsers.DocumentBuilderFactory
import kotlin.concurrent.thread
import kotlin.system.exitProcess

/**
 * Simple script that copies Facebook frameworks from ~/Download/Facebook/
 * - deletes old header files
 * - deletes old java bindings
 * - fetches version iformation and updates maven pom.xml files
 * - automatically performs bindings
 *
 * robovm-bro-gen/ is expected to be located same root as robovm-robopods
 * preparation:
 *   - download FacebookSDK_Dynamic.framework.zip from github release page
 *   - unpack and rename `~/Downloads/Carthage` into `~/Downloads/Facebook`
 *   - download FFBAudienceNetwork-x.x.x.zip, copy FFBAudienceNetwork-x.x.x.zip/Dynamic/FBAudienceNetwork.framework to ~/Downloads/Facebook/Build/iOS
 *
 * important: to be run in robovm-robopods/facebook folder
 *
 * @author dkimitsa
 */

// lock around README.md in case it is being updated from multiple threads
val readmeLock = Object()

// single point for logs
val log = log()

// robovm-bro-gen project expected next to robovm-robopods
val broGenScript: File = Path.of("../../robovm-bro-gen/bro-gen.rb").toFile().also {
    it.requiresCanExecute { "Failed to locate bro-gen script at ${it.canonicalPath}" }
    log.i("bro-gen found at ${it.canonicalPath}")
}

// check if Firebase exists
val facebookRoot: File = Path.of(System.getProperty("user.home"), "Downloads", "Facebook/Build/iOS").toFile().also {
    it.requiresIsDirectory { "Failed to Facebook directory ${it.canonicalPath}" }
    log.i("Facebook root found at ${it.canonicalPath}")
}

fun extractVersionFromHeader(frameworkName: String, header: File, versionTag: String): String {
    return header.readLines()
        .find { it.startsWith("#define $versionTag @\"") && it.endsWith("\"") }
        ?.substringAfter('\"')?.substringBefore('\"')
        ?: error("Filed to evaluate $frameworkName version")
}

// Facebook version -- extract from header
val facebookversion = extractVersionFromHeader(
    "FacebookSDK",
    File(facebookRoot, "FBSDKCoreKit.framework/Headers/FBSDKCoreKit.h"),
    "FBSDK_VERSION_STRING"
)
// list of known frameworks and ways to process it
val knownFrameworks = mapOf<String, (String) -> Unit>(
    "FBSDKCoreKit" to {
        processFramework(
            artifact = it,
            moduleFolder = "ios-core",
            yaml = "facebook-core.yaml"
        )
    },
    "FBSDKLoginKit" to {
        processFramework(
            artifact = it,
            moduleFolder = "ios-login",
            yaml = "facebook-login.yaml"
        )
    },
    "FBSDKShareKit" to {
        processFramework(
            artifact = it,
            moduleFolder = "ios-share",
            yaml = "facebook-share.yaml"
        )
    },
    "FBAudienceNetwork" to {
        processFramework(
            artifact = it,
            moduleFolder = "ios-audience",
            yaml = "facebook-audience.yaml",
            version = extractVersionFromHeader(
                "FBAudienceNetwork",
                File(facebookRoot, "FBAudienceNetwork.framework/Headers/FBAudienceNetwork.h"),
                "FB_AD_SDK_VERSION"
            )
        )
    },
)


// parse arguments
var parallelBuild = false
val frameworkToProcess = mutableListOf<String>()
args.forEach { arg ->
    if (arg.startsWith("-")) {
        when (arg) {
            "-v" -> log.verbose = true
            "-p" -> parallelBuild = true
            "-h" -> printHelpAndExit(0)
            "--help" -> printHelpAndExit(0)
            else -> {
                println("Error: unknown argument $arg")
                printHelpAndExit(-1)
            }
        }
    } else {
        if (!knownFrameworks.keys.contains(arg)) {
            println("Error: unknown framework $arg")
            printHelpAndExit(-1)
        }
        frameworkToProcess.add(arg)
    }
}

if (frameworkToProcess.isEmpty())
    frameworkToProcess.addAll(knownFrameworks.keys)

frameworkToProcess.run { if (parallelBuild && size > 1) parallelStream() else stream() }
    .forEach { framework -> knownFrameworks[framework]?.invoke(framework) }

println("bye-bye")

fun printHelpAndExit(code: Int) {
    println("usage:")
    println("kotlinc -jvm-target 9 -script scripts/harvester.kts -- [--help] [-v] [-p] [framework1 framework2 ...]")
    println("   --help, -h : prints this help and exits")
    println("           -v : enables verbose output")
    println("           -p : enables parallel processing")
    println("   frameworkX : list of frameworks to process. if not specified all frameworks will be processed")
    println("Known frameworks:")
    knownFrameworks.keys.sorted().forEach { println("    $it") }
    exitProcess(code)
}

// common framework processing code
fun processFramework(
    artifact: String,
    artifactType: String = ".framework",
    moduleFolder: String,
    yaml: String,
    version: String = facebookversion
) {
    val framework = artifact + artifactType
    log.d("$framework:  <<<< starting processing, version $version")

    // check if source folder exists
    val sourceHeadersDir = File(
        facebookRoot, framework + File.separatorChar + "Headers"
    ).also {
        it.requiresIsDirectory { "Missing header folder for $framework at ${it.canonicalPath}" }
    }

    // remove destination headers folder
    val destHeadersDir = Path.of(moduleFolder, "src", "main", "bro-gen", framework, "Headers").toFile()
    if (destHeadersDir.exists()) {
        log.i("$framework:  Removing existing headers @${destHeadersDir.canonicalPath}")
        destHeadersDir.requiresDeleteRecursively()
    }

    // copy new headers
    destHeadersDir.requireMkdirs()
    log.i("$framework:  Copy headers from ${sourceHeadersDir.canonicalPath}")
    log.i("$framework:                 to ${destHeadersDir.canonicalPath}")
    sourceHeadersDir.copyRecursively(destHeadersDir)

    // remove java folder
    val javaFolder = Path.of(moduleFolder, "src", "main", "java").toFile()
    if (javaFolder.exists()) {
        log.i("$framework:  Removing existing java folder @${javaFolder.canonicalPath}")
        javaFolder.requiresDeleteRecursively()
    }

    // check if yaml file exists
    val yamlFile = Path.of(moduleFolder, "src", "main", "bro-gen", yaml).toFile()
        .also { it.requiresIsFile { "$framework is missing yaml-file ${it.canonicalPath}" } }

    // generating bindings
    val broGenCmd = "${broGenScript.canonicalPath} ${javaFolder.canonicalPath} ${yamlFile.canonicalPath}"
    log.i("$framework:  Invoking bro-gen with command: $broGenCmd")
    exec("$framework:    ", broGenCmd)

    // updating version string in pom file
    val pomFile = Path.of(moduleFolder, "pom.xml").toFile()
        .also { it.requiresIsFile { "$framework is missing pom.xml ${it.canonicalPath}" } }
    val artifactTitleWithVersion = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(pomFile)
        .getElementByTagName("name")?.getTextValue()
        ?: error("Failed to get <name> from ${pomFile.canonicalPath}")
    val artifactTitle =
        artifactTitleWithVersion.indexOf("iOS v").takeIf { it > 0 }
            ?.let { artifactTitleWithVersion.substring(0, it).trim() }
            ?: error("'iOS v' is missing in artifact <name> in ${pomFile.canonicalPath}")

    // updating the version in module POM file
    val newTitle = "$artifactTitle iOS v${version}"
    log.i("$framework:  Replacing <name> from: $artifactTitleWithVersion")
    log.i("$framework:                   with: $newTitle")
    pomFile.readText().replaceFirst(artifactTitleWithVersion, newTitle).run { pomFile.writeText(this) }

    // updating the version in README file
    synchronized(readmeLock) {
        val readmeFile = Path.of("README.md").toFile()
            .also { it.requiresIsFile { "$framework is missing ${it.canonicalPath}" } }
        var original: String? = null
        var replacement: String? = null
        readmeFile.readLines().map { line ->
            if (replacement == null && line.startsWith("|")) {
                val cols = line.split("|").toMutableList()
                if (cols.size == 5 && cols[1].contains("($moduleFolder/)")) {
                    cols[3] = " $version".padEnd(cols[3].length)
                    original = line
                    replacement = cols.joinToString("|")
                    replacement
                } else line
            } else line
        }.run {
            if (replacement == null || original == null)
                error("$framework version entry ($moduleFolder/) is not found in ${readmeFile.canonicalPath}")
            log.i("$framework:  Replacing README.md version from: $original")
            log.i("$framework:                                to: $replacement")
            readmeFile.writeText(this.joinToString(System.lineSeparator()))
        }
    }

    log.d("$framework:  <<<< finished processing")
}

fun File.requiresCanExecute(msgProvider: () -> String) {
    if (!this.canExecute())
        throw IllegalStateException(msgProvider())
}

fun File.requiresIsDirectory(msgProvider: () -> String) {
    if (!this.isDirectory)
        throw IllegalStateException(msgProvider())
}

fun File.requiresIsFile(msgProvider: () -> String) {
    if (!this.isFile)
        throw IllegalStateException(msgProvider())
}

fun File.requiresDeleteRecursively() {
    if (!this.deleteRecursively())
        throw IllegalStateException("Failed to delete ${this.canonicalPath}")
}

fun File.requireMkdirs(): File {
    if (!this.mkdirs())
        throw IllegalStateException("Failed to mkdirs ${this.canonicalPath}")
    return this
}

fun exec(prefix: String, command: String) {
    val p = Runtime.getRuntime().exec(command)
    thread { p.errorStream.pipeTo(System.err, prefix) }
    thread { p.inputStream.pipeTo(System.out, prefix) }
    p.waitFor().also { code ->
        if (code != 0)
            error("non zero exit code $code when executing $command")
    }
}

fun InputStream.pipeTo(out: PrintStream, prefix: String) = thread {
    this@pipeTo.bufferedReader().apply {
        try {
            var line: String?
            while (run { line = readLine(); line } != null) {
                out.println(prefix + line)
            }
        } catch (ignore: Throwable) {
        }
    }
}

class log {
    var verbose = false

    val allowedI: Boolean
        get() = verbose

    fun i(msg: String) {
        if (allowedI)
            println(msg)
    }

    val allowedD = true
    fun d(msg: String) {
        if (allowedD)
            println(msg)
    }
}

fun Document.getElementByTagName(tagName: String): Element? {
    return this.documentElement.getElementByTagName(tagName)
}

fun Element.getElementByTagName(tagName: String): Element? {
    for (i in 0 until childNodes.length) {
        val item = childNodes.item(i)
        if (item.nodeType == Node.ELEMENT_NODE && (item as? Element)?.tagName == tagName)
            return item
    }
    return null
}

fun Element.getTextValue(): String? {
    for (i in 0 until childNodes.length) {
        val item = childNodes.item(i)
        if (item.nodeType == Node.TEXT_NODE)
            return item.nodeValue
    }
    return null
}