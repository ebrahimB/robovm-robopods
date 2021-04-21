# Kochava iOS Tracker Module

The KochavaTracker module is an optional module within the Kochava SDK providing install attribution and analytics.

### Frameworks required for this pod:
* KochavaTracker.framework
* KochavaCore.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where KochavaTracker.framework is located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-kochava-tracker-ios:$altpodsVersion"
}
```

### Integration

[Kochava Apple SDK Integration](https://support.kochava.com/sdk-integration/sdk-kochavatracker-ios)
