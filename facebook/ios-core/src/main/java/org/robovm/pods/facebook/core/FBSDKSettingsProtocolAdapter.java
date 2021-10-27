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
package org.robovm.pods.facebook.core;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.webkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKSettingsProtocolAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKSettingsProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("appID")
    public String getAppID() { return null; }
    @NotImplemented("setAppID:")
    public void setAppID(String v) {}
    @NotImplemented("isDataProcessingRestricted")
    public boolean isDataProcessingRestricted() { return false; }
    @NotImplemented("isAutoLogAppEventsEnabled")
    public boolean isAutoLogAppEventsEnabled() { return false; }
    @NotImplemented("isSetATETimeExceedsInstallTime")
    public boolean isSetATETimeExceedsInstallTime() { return false; }
    @NotImplemented("isSKAdNetworkReportEnabled")
    public boolean isSKAdNetworkReportEnabled() { return false; }
    @NotImplemented("loggingBehaviors")
    public NSSet<NSString> getLoggingBehaviors() { return null; }
    @NotImplemented("advertisingTrackingStatus")
    public FBSDKAdvertisingTrackingStatus getAdvertisingTrackingStatus() { return null; }
    @NotImplemented("installTimestamp")
    public NSDate getInstallTimestamp() { return null; }
    @NotImplemented("advertiserTrackingEnabledTimestamp")
    public NSDate getAdvertiserTrackingEnabledTimestamp() { return null; }
    @NotImplemented("shouldLimitEventAndDataUsage")
    public boolean shouldLimitEventAndDataUsage() { return false; }
    @NotImplemented("shouldUseTokenOptimizations")
    public boolean shouldUseTokenOptimizations() { return false; }
    @NotImplemented("setShouldUseTokenOptimizations:")
    public void setShouldUseTokenOptimizations(boolean v) {}
    @NotImplemented("graphAPIVersion")
    public String getGraphAPIVersion() { return null; }
    @NotImplemented("isGraphErrorRecoveryEnabled")
    public boolean isGraphErrorRecoveryEnabled() { return false; }
    @NotImplemented("graphAPIDebugParamValue")
    public String getGraphAPIDebugParamValue() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
