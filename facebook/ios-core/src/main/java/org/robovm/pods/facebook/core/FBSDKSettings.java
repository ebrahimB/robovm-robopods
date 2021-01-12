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
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKSettingsPtr extends Ptr<FBSDKSettings, FBSDKSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKSettings() {}
    protected FBSDKSettings(Handle h, long handle) { super(h, handle); }
    protected FBSDKSettings(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sdkVersion")
    public static native String getSdkVersion();
    @Property(selector = "defaultGraphAPIVersion")
    public static native String getDefaultGraphAPIVersion();
    @Property(selector = "JPEGCompressionQuality")
    public static native @MachineSizedFloat double getJPEGCompressionQuality();
    @Property(selector = "setJPEGCompressionQuality:")
    public static native void setJPEGCompressionQuality(@MachineSizedFloat double v);
    /**
     * @deprecated Auto-initialization will be removed in the next major version release.
     */
    @Deprecated
    @Property(selector = "isAutoInitEnabled")
    public static native boolean isAutoInitEnabled();
    /**
     * @deprecated Auto-initialization will be removed in the next major version release.
     */
    @Deprecated
    @Property(selector = "setAutoInitEnabled:")
    public static native void setAutoInitEnabled(boolean v);
    @Property(selector = "isAutoLogAppEventsEnabled")
    public static native boolean isAutoLogAppEventsEnabled();
    @Property(selector = "setAutoLogAppEventsEnabled:")
    public static native void setAutoLogAppEventsEnabled(boolean v);
    @Property(selector = "isCodelessDebugLogEnabled")
    public static native boolean isCodelessDebugLogEnabled();
    @Property(selector = "setCodelessDebugLogEnabled:")
    public static native void setCodelessDebugLogEnabled(boolean v);
    @Property(selector = "isAdvertiserIDCollectionEnabled")
    public static native boolean isAdvertiserIDCollectionEnabled();
    @Property(selector = "setAdvertiserIDCollectionEnabled:")
    public static native void setAdvertiserIDCollectionEnabled(boolean v);
    @Property(selector = "shouldLimitEventAndDataUsage")
    public static native boolean isLimitEventAndDataUsage();
    @Property(selector = "setLimitEventAndDataUsage:")
    public static native void setLimitEventAndDataUsage(boolean v);
    @Property(selector = "isGraphErrorRecoveryEnabled")
    public static native boolean isGraphErrorRecoveryEnabled();
    @Property(selector = "setGraphErrorRecoveryEnabled:")
    public static native void setGraphErrorRecoveryEnabled(boolean v);
    @Property(selector = "appID")
    public static native String getAppID();
    @Property(selector = "setAppID:")
    public static native void setAppID(String v);
    @Property(selector = "appURLSchemeSuffix")
    public static native String getAppURLSchemeSuffix();
    @Property(selector = "setAppURLSchemeSuffix:")
    public static native void setAppURLSchemeSuffix(String v);
    @Property(selector = "clientToken")
    public static native String getClientToken();
    @Property(selector = "setClientToken:")
    public static native void setClientToken(String v);
    @Property(selector = "displayName")
    public static native String getDisplayName();
    @Property(selector = "setDisplayName:")
    public static native void setDisplayName(String v);
    @Property(selector = "facebookDomainPart")
    public static native String getFacebookDomainPart();
    @Property(selector = "setFacebookDomainPart:")
    public static native void setFacebookDomainPart(String v);
    @Property(selector = "loggingBehaviors")
    public static native NSSet<NSString> getLoggingBehaviors();
    @Property(selector = "setLoggingBehaviors:")
    public static native void setLoggingBehaviors(NSSet<NSString> v);
    @Property(selector = "graphAPIVersion")
    public static native String getGraphAPIVersion();
    @Property(selector = "setGraphAPIVersion:")
    public static native void setGraphAPIVersion(String v);
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
