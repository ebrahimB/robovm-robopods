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
package org.robovm.pods.singular;

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
import org.robovm.apple.webkit.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Singular/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SingularPtr extends Ptr<Singular, SingularPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Singular.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public Singular() {}
    protected Singular(Handle h, long handle) { super(h, handle); }
    protected Singular(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "applicationName")
    public native String getApplicationName();
    @Property(selector = "applicationIdentifier")
    public native String getApplicationIdentifier();
    @Property(selector = "minSessionDuration")
    public native int getMinSessionDuration();
    @Property(selector = "setMinSessionDuration:")
    public native void setMinSessionDuration(int v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "start:")
    public static native boolean start(SingularConfig config);
    @Method(selector = "startSession:withKey:")
    public static native void startSession(String apiKey, String apiSecret);
    @Method(selector = "startSession:withKey:andLaunchOptions:withSingularLinkHandler:")
    public static native boolean startSession(String apiKey, String apiSecret, NSDictionary<?, ?> launchOptions, @Block VoidBlock1<SingularLinkParams> handler);
    @Method(selector = "startSession:withKey:andLaunchOptions:withSingularLinkHandler:andShortLinkResolveTimeout:")
    public static native boolean startSession(String apiKey, String apiSecret, NSDictionary<?, ?> launchOptions, @Block VoidBlock1<SingularLinkParams> handler, @MachineSizedSInt long timeoutSec);
    @Method(selector = "startSession:withKey:andLaunchOptions:withSingularLinkHandler:andSupportedDomains:")
    public static native boolean startSession(String apiKey, String apiSecret, NSDictionary<?, ?> launchOptions, @Block VoidBlock1<SingularLinkParams> handler, NSArray<?> domains);
    @Method(selector = "startSession:withKey:andLaunchOptions:withSingularLinkHandler:andShortLinkResolveTimeout:andSupportedDomains:")
    public static native boolean startSession(String apiKey, String apiSecret, NSDictionary<?, ?> launchOptions, @Block VoidBlock1<SingularLinkParams> handler, @MachineSizedSInt long timeoutSec, NSArray<?> domains);
    @Method(selector = "startSession:withKey:andUserActivity:withSingularLinkHandler:")
    public static native boolean startSession(String apiKey, String apiSecret, NSUserActivity userActivity, @Block VoidBlock1<SingularLinkParams> handler);
    @Method(selector = "startSession:withKey:andUserActivity:withSingularLinkHandler:andShortLinkResolveTimeout:")
    public static native boolean startSession(String apiKey, String apiSecret, NSUserActivity userActivity, @Block VoidBlock1<SingularLinkParams> handler, @MachineSizedSInt long timeoutSec);
    @Method(selector = "startSession:withKey:andUserActivity:withSingularLinkHandler:andSupportedDomains:")
    public static native boolean startSession(String apiKey, String apiSecret, NSUserActivity userActivity, @Block VoidBlock1<SingularLinkParams> handler, NSArray<?> domains);
    @Method(selector = "startSession:withKey:andUserActivity:withSingularLinkHandler:andShortLinkResolveTimeout:andSupportedDomains:")
    public static native boolean startSession(String apiKey, String apiSecret, NSUserActivity userActivity, @Block VoidBlock1<SingularLinkParams> handler, @MachineSizedSInt long timeoutSec, NSArray<?> domains);
    @Method(selector = "startSession:withKey:andLaunchOptions:")
    public static native void startSession(String apiKey, String apiSecret, NSDictionary<?, ?> launchOptions);
    @Method(selector = "startSession:withKey:andLaunchURL:")
    public static native void startSession(String apiKey, String apiSecret, NSURL url);
    @Method(selector = "reStartSession:withKey:")
    public static native void reStartSession(String apiKey, String apiSecret);
    @Method(selector = "sessionStarted")
    public static native boolean sessionStarted();
    @Method(selector = "endSession")
    public static native void endSession();
    @Method(selector = "event:")
    public static native void event(String name);
    @Method(selector = "event:withArgs:")
    public static native void event(String name, NSDictionary<?, ?> args);
    @Method(selector = "setDeviceCustomUserId:")
    public static native void setDeviceCustomUserId(String customUserId);
    @Method(selector = "registerDeviceTokenForUninstall:")
    public static native void registerDeviceTokenForUninstall(NSData deviceToken);
    @Method(selector = "registerDeferredDeepLinkHandler:")
    public static native void registerDeferredDeepLinkHandler(@Block VoidBlock1<String> handler);
    @Method(selector = "setDeferredDeepLinkTimeout:")
    public static native int setDeferredDeepLinkTimeout(int duration);
    @Method(selector = "shared")
    public static native Singular shared();
    @Method(selector = "sessionDuration")
    public static native double sessionDuration();
    @Method(selector = "sessionStartDate")
    public static native NSDate sessionStartDate();
    @Method(selector = "sessionID")
    public static native String sessionID();
    @Method(selector = "version")
    public static native String version();
    @Method(selector = "singularID")
    public static native String singularID();
    @Method(selector = "singularKeyspace")
    public static native String singularKeyspace();
    @Method(selector = "setBufferLimit:")
    public static native void setBufferLimit(int size);
    @Method(selector = "processJSRequestWK:withURL:")
    public static native boolean processJSRequestWK(WKWebView webView, NSURLRequest url);
    @Method(selector = "setMinSessionDuration:")
    public static native void setMinimalSessionDuration(int seconds);
    @Method(selector = "initializeApStore")
    public static native void initializeApStore();
    @Method(selector = "setAllowAutoIAPComplete:")
    public static native void setAllowAutoIAPComplete(boolean v);
    @Method(selector = "iapComplete:")
    public static native void iapComplete(NSObject transaction);
    @Method(selector = "iapComplete:withName:")
    public static native void iapComplete(NSObject transaction, String name);
    @Method(selector = "setGender:")
    public static native void setGender(String gender);
    @Method(selector = "setAge:")
    public static native void setAge(NSObject age);
    @Method(selector = "batchInterval")
    public static native int batchInterval();
    @Method(selector = "setBatchInterval:")
    public static native void setBatchInterval(int interval);
    @Method(selector = "batchesEvents")
    public static native boolean batchesEvents();
    @Method(selector = "setBatchesEvents:")
    public static native void setBatchesEvents(boolean v);
    @Method(selector = "sendAllBatches")
    public static native void sendAllBatches();
    @Method(selector = "revenue:")
    public static native void revenue(NSObject transaction);
    @Method(selector = "revenue:withAttributes:")
    public static native void revenue(NSObject transaction, NSDictionary<?, ?> attributes);
    @Method(selector = "revenue:amount:")
    public static native void revenue(String currency, double amount);
    @Method(selector = "revenue:amount:withAttributes:")
    public static native void revenue(String currency, double amount, NSDictionary<?, ?> attributes);
    @Method(selector = "revenue:amount:productSKU:productName:productCategory:productQuantity:productPrice:")
    public static native void revenue(String currency, double amount, String productSKU, String productName, String productCategory, int productQuantity, double productPrice);
    @Method(selector = "customRevenue:transaction:")
    public static native void customRevenue(String eventname, NSObject transaction);
    @Method(selector = "customRevenue:transaction:withAttributes:")
    public static native void customRevenue(String eventname, NSObject transaction, NSDictionary<?, ?> attributes);
    @Method(selector = "customRevenue:currency:amount:")
    public static native void customRevenue(String eventname, String currency, double amount);
    @Method(selector = "customRevenue:currency:amount:withAttributes:")
    public static native void customRevenue(String eventname, String currency, double amount, NSDictionary<?, ?> attributes);
    @Method(selector = "customRevenue:currency:amount:productSKU:productName:productCategory:productQuantity:productPrice:")
    public static native void customRevenue(String eventname, String currency, double amount, String productSKU, String productName, String productCategory, int productQuantity, double productPrice);
    @Method(selector = "setCustomUserId:")
    public static native void setCustomUserId(String customUserId);
    @Method(selector = "unsetCustomUserId")
    public static native void unsetCustomUserId();
    @Method(selector = "setSessionTimeout:")
    public static native void setSessionTimeout(int timeout);
    @Method(selector = "getFirstSessionUnixTime")
    public static native @MachineSizedSInt long getFirstSessionUnixTime();
    @Method(selector = "setWrapperName:andVersion:")
    public static native void setWrapperName(String name, String version);
    @Method(selector = "getGlobalProperties")
    public static native NSDictionary<?, ?> getGlobalProperties();
    @Method(selector = "setGlobalProperty:andValue:overrideExisting:")
    public static native boolean setGlobalProperty(String key, String value, boolean overrideExisting);
    @Method(selector = "unsetGlobalProperty:")
    public static native void unsetGlobalProperty(String key);
    @Method(selector = "clearGlobalProperties")
    public static native void clearGlobalProperties();
    @Method(selector = "trackingOptIn")
    public static native void trackingOptIn();
    @Method(selector = "trackingUnder13")
    public static native void trackingUnder13();
    @Method(selector = "stopAllTracking")
    public static native void stopAllTracking();
    @Method(selector = "resumeAllTracking")
    public static native void resumeAllTracking();
    @Method(selector = "isAllTrackingStopped")
    public static native boolean isAllTrackingStopped();
    @Method(selector = "limitDataSharing:")
    public static native void limitDataSharing(boolean shouldLimitDataSharing);
    @Method(selector = "getLimitDataSharing")
    public static native boolean getLimitDataSharing();
    @Method(selector = "skanRegisterAppForAdNetworkAttribution")
    public static native void skanRegisterAppForAdNetworkAttribution();
    @Method(selector = "skanUpdateConversionValue:")
    public static native boolean skanUpdateConversionValue(@MachineSizedSInt long conversionValue);
    @Method(selector = "skanGetConversionValue")
    public static native NSNumber skanGetConversionValue();
    @Method(selector = "isSingularLink:")
    public static native boolean isSingularLink(NSObject linkHolder);
    @Method(selector = "adRevenue:")
    public static native void adRevenue(SingularAdData adData);
    /*</methods>*/
}
