# Firebase iOS Google SignIn framework

### Frameworks required for this pod: 
* Firebase.zip/GoogleSignIn/GoogleSignIn.framework
* AppAuth.framework (from Firebase.zip/GoogleSignIn/AppAuth.xcframework)
* GTMAppAuth.framework (from Firebase.zip/GoogleSignIn/GTMAppAuth.xcframework)
* GTMSessionFetcher.framework (from Firebase.zip/GoogleSignIn/GTMSessionFetcher.xcframework)

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where GoogleSignIn.framework (and other) are located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
repositories {
    maven { url 'https://oss.sonatype.org/content/repositories/snapshots' }
}
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-firebase-google-signin-ios:$altpodsVersion"
}
```