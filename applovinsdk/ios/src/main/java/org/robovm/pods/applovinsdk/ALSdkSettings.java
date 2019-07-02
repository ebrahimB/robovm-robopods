/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.applovinsdk;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALSdkSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALSdkSettingsPtr extends Ptr<ALSdkSettings, ALSdkSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALSdkSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ALSdkSettings() {}
    protected ALSdkSettings(Handle h, long handle) { super(h, handle); }
    protected ALSdkSettings(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isTestAdsEnabled")
    public native boolean isTestAdsEnabled();
    @Property(selector = "setIsTestAdsEnabled:")
    public native void setIsTestAdsEnabled(boolean v);
    @Property(selector = "isVerboseLogging")
    public native boolean isVerboseLogging();
    @Property(selector = "setIsVerboseLogging:")
    public native void setIsVerboseLogging(boolean v);
    @Property(selector = "muted")
    public native boolean isMuted();
    @Property(selector = "setMuted:")
    public native void setMuted(boolean v);
    /**
     * @deprecated Manually managing what ads SDK should automatically preload has been deprecated and will be removed in a future SDK version.
     */
    @Deprecated
    @Property(selector = "autoPreloadAdSizes")
    public native String getAutoPreloadAdSizes();
    /**
     * @deprecated Manually managing what ads SDK should automatically preload has been deprecated and will be removed in a future SDK version.
     */
    @Deprecated
    @Property(selector = "setAutoPreloadAdSizes:")
    public native void setAutoPreloadAdSizes(String v);
    /**
     * @deprecated Manually managing what ads SDK should automatically preload has been deprecated and will be removed in a future SDK version.
     */
    @Deprecated
    @Property(selector = "autoPreloadAdTypes")
    public native String getAutoPreloadAdTypes();
    /**
     * @deprecated Manually managing what ads SDK should automatically preload has been deprecated and will be removed in a future SDK version.
     */
    @Deprecated
    @Property(selector = "setAutoPreloadAdTypes:")
    public native void setAutoPreloadAdTypes(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
