# Kochava iOS Core Module

The KochavaCore module provides core support for all modules within the Kochava SDK for the Apple platform.


### Frameworks required for this pod:
* KochavaCore.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where KochavaCore.framework is located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-kochava-core-ios:$altpodsVersion"
}
```

### Integration

[Kochava Apple SDK Integration](https://support.kochava.com/sdk-integration/sdk-kochavatracker-ios)
