# OneSignal iOS

## Sample app

[Link](https://github.com/dkimitsa/robovm-samples/tree/alt/robopods/onesignal/ios)

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the following native frameworks:
- `OneSignal.framework`
- `OneSignalCore.framework`
- `OneSignalOutcomes.framework`

These can be downloaded from github release page.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where OneSignal.framework is located -->
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
   compile "io.github.dkimitsa.robovm:robopods-onesignal-ios:$altpodsVersion"
}
```

## OneSignal home page

[Link](https://github.com/OneSignal/OneSignal-iOS-SDK)