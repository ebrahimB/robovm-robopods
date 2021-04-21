# Kochava KochavaAdNetwork Module
The KochavaAdNetwork module is an optional module within the Kochava SDK providing advertising network support, and is a high-level interface to Apple's SKAdNetwork.

### Frameworks required for this pod:
* KochavaAdNetwork.framework
* KochavaCore.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where KochavaAdNetwork.framework is located -->
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "io.github.dkimitsa.robovm:robopods-kochava-ads-ios:$altpodsVersion"
}
```

### Integration
[Kochava Apple SDK Integration](https://support.kochava.com/sdk-integration/sdk-kochavatracker-ios)
