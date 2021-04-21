# Firebase iOS Crashlytics framework

### Frameworks required for this pod: 
* FirebaseCrashlytics.framework (from Firebase.zip/FirebaseCrashlytics/FirebaseCrashlytics.xcframework)
* FirebaseInstallations.framework (from Firebase.zip/FirebaseAnalytics/FirebaseInstallations.xcframework)
* GoogleDataTransport.framework (from Firebase.zip/FirebaseAnalytics/GoogleDataTransport.xcframework)
* nanopb.framework (from Firebase.zip/FirebaseAnalytics/nanopb.xcframework)

Plus ones required for ios-core module:
* FirebaseCore.framework (from Firebase.zip/FirebaseAnalytics/FirebaseCore.xcframework)
* GoogleUtilities.framework (from Firebase.zip/FirebaseAnalytics/GoogleUtilities.xcframework)
* PromisesObjC.framework (from Firebase.zip/FirebaseAnalytics/PromisesObjC.xcframework)

### Way to report uncaught Java exception
Firebase provides `FIRExceptionModel` to report not native exceptions and display proper lines/function names. To use this approach register handler by invoking `FIRCrashlytics.registerDefaultJavaUncaughtExceptionHandler()`. More details in [blog post](https://dkimitsa.github.io/2020/07/08/firebase-and-java-stacktraces/).

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseCrashlytics.framework (and other) are located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-firebase-crashlytics-ios:$altpodsVersion"
}
```
