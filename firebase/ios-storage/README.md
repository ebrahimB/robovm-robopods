# Firebase iOS Cloud Storage framework
Cloud Storage is built for app developers who need to store and serve user-generated content, such as photos or videos.

### Frameworks required for this pod:
* FirebaseStorage.framework (from Firebase.zip/FirebaseStorage/FirebaseStorage.xcframework)
* GTMSessionFetcher.framework (from Firebase.zip/FirebaseStorage/GTMSessionFetcher.xcframework)

Plus ones required for ios-core module:
* FirebaseCore.framework (from Firebase.zip/FirebaseAnalytics/FirebaseCore.xcframework)
* GoogleUtilities.framework (from Firebase.zip/FirebaseAnalytics/GoogleUtilities.xcframework)
* PromisesObjC.framework (from Firebase.zip/FirebaseAnalytics/PromisesObjC.xcframework)

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseStorage.framework is located -->
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
   compile "io.github.dkimitsa.robovm:robopods-firebase-storage-ios:$altpodsVersion"
}
```
