# Firebase iOS Cloud Firestore framework

### Frameworks required for this pod: 
* FirebaseFirestore.framework(from Firebase.zip/FirebaseFirestore/FirebaseFirestore.xcframework)
* abseil.framework (from Firebase.zip/FirebaseFirestore/abseil.xcframework)
* BoringSSL-GRPC.framework (from Firebase.zip/FirebaseFirestore/BoringSSL-GRPC.xcframework)
* gRPC-C++.framework (from Firebase.zip/FirebaseFirestore/gRPC-C++.xcframework)
* gRPC-Core.framework (from Firebase.zipFirebaseFirestore/gRPC-Core.xcframework)
* leveldb-library.framework (from Firebase.zip/FirebaseFirestore/leveldb-library.xcframework)
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
        <path>libs</path>  <!-- path where FirebaseFirestore.framework is located -->
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
   compile "io.github.dkimitsa.robovm:robopods-firebase-firestore-ios:$altpodsVersion"
}
```
