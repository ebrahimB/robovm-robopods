# Singular SDK iOS

## Install Instructions

### 3rd party native framework
This RoboPod requires you to add the native `libSingular.a`.

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <libs>
        <lib>libs/libSingular.a</lib>  <!-- path to libSingular.a -->
    </libs>
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
   compile "io.github.dkimitsa.robovm:robopods-singular-ios:$altpodsVersion"
}
```

## Adapty home page

https://github.com/adaptyteam/AdaptySDK-iOS
