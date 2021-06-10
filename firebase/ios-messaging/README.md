# Firebase iOS Messaging framework

### Frameworks required for this pod: 
* FirebaseMessaging.framework (from Firebase.zip/FirebaseMessaging/FirebaseMessaging.xcframework)
* FirebaseInstanceID.framework (from Firebase.zip/FirebaseMessaging/FirebaseInstanceID.xcframework)
* FirebaseInstallations.framework (from Firebase.zip/FirebaseAnalytics/FirebaseInstallations.xcframework)

Plus ones required for ios-core module:
* FirebaseCore.framework (from Firebase.zip/FirebaseAnalytics/FirebaseCore.xcframework)
* GoogleUtilities.framework (from Firebase.zip/FirebaseAnalytics/GoogleUtilities.xcframework)
* PromisesObjC.framework (from Firebase.zip/FirebaseAnalytics/PromisesObjC.xcframework)

### to use this pod configure your `robovm.xml`
[the official guide](https://firebase.google.com/docs/cloud-messaging/ios/client).

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FirebaseMessaging.framework (and other) are located -->
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
   compile "io.github.dkimitsa.robovm:robopods-firebase-messaging-ios:$altpodsVersion"
}
```

### Disable method swizzling
This is required to be done in case of RoboVM. Following steps to be done as specified in the [guide](https://firebase.google.com/docs/cloud-messaging/ios/client):
- add following lines to `info.plist`:  
```
<key>FirebaseAppDelegateProxyEnabled</key>
<false />
```
- explicitly map your APNs token to the FCM registration token in app delegate:  
```
@Override
public void didRegisterForRemoteNotifications(UIApplication application, NSData deviceToken) {
    super.didRegisterForRemoteNotifications(application, deviceToken);
    FIRMessaging.messaging().setAPNSToken(deviceToken);
}
```
 