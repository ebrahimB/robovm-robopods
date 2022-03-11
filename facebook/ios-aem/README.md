# Facebook iOS AEM Kit framework

### Use the dynamic version of frameworks
FBAEMKit.framework is available for a download as `FacebookSDK_Dynamic.framework.zip`.

### Frameworks required for this pod:
* FBAEMKit.framework

### to use this pod configure your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>  <!-- path where FBAEMKit.framework is located -->
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
   compile "io.github.dkimitsa.robovm:robopods-facebook-aem-ios:$altpodsVersion"
}
```