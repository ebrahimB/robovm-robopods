# Firebase iOS Analytics framework

### Frameworks required for this pod: 
* Firebase.zip/FirebaseAnalytics/FirebaseAnalytics.framework
* Firebase.zip/FirebaseAnalytics/GoogleAppMeasurement.framework
* FirebaseInstallations.framework (from Firebase.zip/FirebaseAnalytics/FirebaseInstallations.xcframework)
* FirebaseCoreDiagnostics.framework (from Firebase.zip/FirebaseAnalytics/FirebaseCoreDiagnostics.xcframework)
* GoogleDataTransport.framework (from Firebase.zip/FirebaseAnalytics/GoogleDataTransport.xcframework)  
* nanopb.framework (from Firebase.zip/FirebaseAnalytics/nanopb.xcframework)

Plus ones required for ios-core module:
* FirebaseCore.framework (from Firebase.zip/FirebaseAnalytics/FirebaseCore.xcframework)
* GoogleUtilities.framework (from Firebase.zip/FirebaseAnalytics/GoogleUtilities.xcframework)
* PromisesObjC.framework (from Firebase.zip/FirebaseAnalytics/PromisesObjC.xcframework)

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseAnalytics.framework is located -->
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
   compile "io.github.dkimitsa.robovm:robopods-firebase-analytics-ios:$altpodsVersion"
}
```
