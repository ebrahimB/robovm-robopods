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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKSettingsProtocol/*</implements>*/ {

    /*<ptr>*/public static class FBSDKSettingsPtr extends Ptr<FBSDKSettings, FBSDKSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKSettings() {}
    protected FBSDKSettings(Handle h, long handle) { super(h, handle); }
    protected FBSDKSettings(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedSettings")
    public static native FBSDKSettings getSharedSettings();
    @Property(selector = "sdkVersion")
    public static native String getFbSdkVersion();
    @Property(selector = "defaultGraphAPIVersion")
    public static native String getDefaultGraphAPIVersion();
    @Property(selector = "JPEGCompressionQuality")
    public static native @MachineSizedFloat double getJPEGCompressionQuality();
    @Property(selector = "setJPEGCompressionQuality:")
    public static native void setJPEGCompressionQuality(@MachineSizedFloat double v);
    @Property(selector = "isAutoLogAppEventsEnabled")
    public static native boolean isFbSdkIsAutoLogAppEventsEnabled();
    @Property(selector = "setAutoLogAppEventsEnabled:")
    public static native void setFbSdkIsAutoLogAppEventsEnabled(boolean v);
    @Property(selector = "isCodelessDebugLogEnabled")
    public static native boolean isCodelessDebugLogEnabled();
    @Property(selector = "setCodelessDebugLogEnabled:")
    public static native void setCodelessDebugLogEnabled(boolean v);
    @Property(selector = "isAdvertiserIDCollectionEnabled")
    public static native boolean isAdvertiserIDCollectionEnabled();
    @Property(selector = "setAdvertiserIDCollectionEnabled:")
    public static native void setAdvertiserIDCollectionEnabled(boolean v);
    @Property(selector = "isSKAdNetworkReportEnabled")
    public static native boolean isFbSdkIsSKAdNetworkReportEnabled();
    @Property(selector = "setSKAdNetworkReportEnabled:")
    public static native void setFbSdkIsSKAdNetworkReportEnabled(boolean v);
    @Property(selector = "shouldLimitEventAndDataUsage")
    public static native boolean isLimitEventAndDataUsage();
    @Property(selector = "setLimitEventAndDataUsage:")
    public static native void setLimitEventAndDataUsage(boolean v);
    @Property(selector = "shouldUseCachedValuesForExpensiveMetadata")
    public static native boolean shouldUseCachedValuesForExpensiveMetadata();
    @Property(selector = "setShouldUseCachedValuesForExpensiveMetadata:")
    public static native void setShouldUseCachedValuesForExpensiveMetadata(boolean v);
    @Property(selector = "isGraphErrorRecoveryEnabled")
    public static native boolean isFbSdkIsGraphErrorRecoveryEnabled();
    @Property(selector = "setGraphErrorRecoveryEnabled:")
    public static native void setFbSdkIsGraphErrorRecoveryEnabled(boolean v);
    @Property(selector = "appID")
    public static native String getFbSdkAppID();
    @Property(selector = "setAppID:")
    public static native void setFbSdkAppID(String v);
    @Property(selector = "appURLSchemeSuffix")
    public static native String getAppURLSchemeSuffix();
    @Property(selector = "setAppURLSchemeSuffix:")
    public static native void setAppURLSchemeSuffix(String v);
    @Property(selector = "clientToken")
    public static native String getFbSdkClientToken();
    @Property(selector = "setClientToken:")
    public static native void setFbSdkClientToken(String v);
    @Property(selector = "displayName")
    public static native String getDisplayName();
    @Property(selector = "setDisplayName:")
    public static native void setDisplayName(String v);
    @Property(selector = "facebookDomainPart")
    public static native String getFacebookDomainPart();
    @Property(selector = "setFacebookDomainPart:")
    public static native void setFacebookDomainPart(String v);
    @Property(selector = "loggingBehaviors")
    public static native NSSet<NSString> getFbSdkLoggingBehaviors();
    @Property(selector = "setLoggingBehaviors:")
    public static native void setFbSdkLoggingBehaviors(NSSet<NSString> v);
    @Property(selector = "graphAPIVersion")
    public static native String getFbSdkGetGraphAPIVersion();
    @Property(selector = "setGraphAPIVersion:")
    public static native void setFbSdkGetGraphAPIVersion(String v);
    @Property(selector = "userAgentSuffix")
    public static native String getUserAgentSuffix();
    @Property(selector = "setUserAgentSuffix:")
    public static native void setUserAgentSuffix(String v);
    @Property(selector = "appID")
    public native String getAppID();
    @Property(selector = "setAppID:")
    public native void setAppID(String v);
    @Property(selector = "isDataProcessingRestricted")
    public native boolean isDataProcessingRestricted();
    @Property(selector = "isAutoLogAppEventsEnabled")
    public native boolean isAutoLogAppEventsEnabled();
    @Property(selector = "isSetATETimeExceedsInstallTime")
    public native boolean isSetATETimeExceedsInstallTime();
    @Property(selector = "isSKAdNetworkReportEnabled")
    public native boolean isSKAdNetworkReportEnabled();
    @Property(selector = "loggingBehaviors")
    public native NSSet<NSString> getLoggingBehaviors();
    @Property(selector = "advertisingTrackingStatus")
    public native FBSDKAdvertisingTrackingStatus getAdvertisingTrackingStatus();
    @Property(selector = "installTimestamp")
    public native NSDate getInstallTimestamp();
    @Property(selector = "advertiserTrackingEnabledTimestamp")
    public native NSDate getAdvertiserTrackingEnabledTimestamp();
    @Property(selector = "shouldLimitEventAndDataUsage")
    public native boolean shouldLimitEventAndDataUsage();
    @Property(selector = "shouldUseTokenOptimizations")
    public native boolean shouldUseTokenOptimizations();
    @Property(selector = "setShouldUseTokenOptimizations:")
    public native void setShouldUseTokenOptimizations(boolean v);
    @Property(selector = "graphAPIVersion")
    public native String getGraphAPIVersion();
    @Property(selector = "isGraphErrorRecoveryEnabled")
    public native boolean isGraphErrorRecoveryEnabled();
    @Property(selector = "graphAPIDebugParamValue")
    public native String getGraphAPIDebugParamValue();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isAdvertiserTrackingEnabled")
    public static native boolean isAdvertiserTrackingEnabled();
    @Method(selector = "setAdvertiserTrackingEnabled:")
    public static native boolean setAdvertiserTrackingEnabled(boolean advertiserTrackingEnabled);
    @Method(selector = "setDataProcessingOptions:")
    public static native void setDataProcessingOptions(NSArray<NSString> options);
    @Method(selector = "setDataProcessingOptions:country:state:")
    public static native void setDataProcessingOptions(NSArray<NSString> options, int country, int state);
    @Method(selector = "enableLoggingBehavior:")
    public static native void enableLoggingBehavior(FBSDKLoggingBehavior loggingBehavior);
    @Method(selector = "disableLoggingBehavior:")
    public static native void disableLoggingBehavior(FBSDKLoggingBehavior loggingBehavior);
    /*</methods>*/
}
