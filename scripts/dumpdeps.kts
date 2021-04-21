#!/usr/bin/env kotlinc -jvm-target 9 -cp dist/kotlinc/lib/kotlin-main-kts.jar -script
import java.io.File
import java.nio.file.Path
import kotlin.system.exitProcess

/**
 * Simple that builds dependency tree of firebase frameworks
 * @author dkimitsa
 */


// single point for logs
val log = log()
// check if Firebase exists
val firebaseRoot = Path.of(System.getProperty("user.home"), "Downloads", "Firebase").toFile().also {
    it.requiresIsDirectory { "Failed to Firebase directory ${it.canonicalPath}" }
    log.i("Firebase root found at ${it.canonicalPath}")
}

// list all possible frameworks
val frameworkPaths = firebaseRoot
    .walkTopDown()
    .filter {
        val cp = it.canonicalPath
        it.isDirectory && cp.endsWith(".framework") && (!cp.contains(".xcframework") || cp.contains("ios-arm64_armv7"))
    }.toList()

val symbolToFramework = mutableMapOf<String, String>()
val frameworkToImports = mutableMapOf<String, List<String>>()

// get dependencies
frameworkPaths.parallelStream().forEach { f ->
    val name = f.nameWithoutExtension
    val bin = File(f, name)
    val imports = execAndGetOutSequence("nm -g -u -j ${bin.canonicalPath}").filter {
        it.isNotBlank() && !it.contains(':')
    }.toList()
    val exports = execAndGetOutSequence("nm -g -U -j ${bin.canonicalPath}").filter {
        it.isNotBlank() && !it.contains(':')
    }.toList()

    synchronized(symbolToFramework) {
        exports.forEach { symbolToFramework[it] = name }
        frameworkToImports[name] = imports
    }
}

// build framework to framework dependency
val frameworkToFramework = frameworkToImports.map { e ->
    val depFrameworks = e.value.mapNotNullTo(mutableSetOf()) { symbol ->
        symbolToFramework[symbol].takeUnless { it == e.key }
    }
    e.key to depFrameworks.sorted()
}.toMap()

// build deep dependency
fun deepWalker(name: String, res: MutableSet<String> = mutableSetOf()): MutableSet<String> {
    frameworkToFramework[name]?.forEach {
        if (res.add(it)) {
            deepWalker(it, res)
        }
    }
    return res
}

// Firebase core is a special case as all Firebase frameworks depends on it
// get its dependencies
val firebaseCoreName = "FirebaseCore"
val firebaseCoreDependencies = deepWalker(firebaseCoreName).also { it.add(firebaseCoreName) }

// build dependency tree
frameworkToFramework.keys.sorted().forEach { key ->
    val dependenciesToExclude = if (key != firebaseCoreName) firebaseCoreDependencies else emptySet()
    val seen = mutableSetOf<String>().also { if (key != firebaseCoreName) it.addAll(dependenciesToExclude) }
    val dependencies = deepWalker(key, seen)
    println("$key:")
    dependencies.filter { !dependenciesToExclude.contains(it) }
        .sorted()
        .forEach { println("    $it") }
}
exitProcess(0)


fun File.requiresIsDirectory(msgProvider: () -> String) {
    if (!this.isDirectory)
        throw IllegalStateException(msgProvider())
}

fun execAndGetOutSequence(command: String) = sequence {
    val p = Runtime.getRuntime().exec(command)
    p.inputStream.bufferedReader().apply {
        var line: String?
        while (run { line = readLine(); line } != null) {
            yield(line!!)
        }
    }
    p.waitFor().also { code ->
        if (code != 0)
            error("non zero exit code $code when executing $command")
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

