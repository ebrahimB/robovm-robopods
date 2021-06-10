# Firebase iOS Dynamic Links framework

### Frameworks required for this pod: 
* FirebaseDynamicLinks.framework (from Firebase.zip/FirebaseDynamicLinks/FirebaseDynamicLinks.xcframework)

Plus ones required for ios-core module:
* FirebaseCore.framework (from Firebase.zip/FirebaseAnalytics/FirebaseCore.xcframework)
* GoogleUtilities.framework (from Firebase.zip/FirebaseAnalytics/GoogleUtilities.xcframework)
* PromisesObjC.framework (from Firebase.zip/FirebaseAnalytics/PromisesObjC.xcframework)

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseDynamicLinks.framework is located -->
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
   compile "io.github.dkimitsa.robovm:robopods-firebase-dynamic-links-ios:$altpodsVersion"
}
```
