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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAppEvents/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKAppEventsPtr extends Ptr<FBSDKAppEvents, FBSDKAppEventsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKAppEvents.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKAppEvents() {}
    protected FBSDKAppEvents(Handle h, long handle) { super(h, handle); }
    protected FBSDKAppEvents(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shared")
    public static native FBSDKAppEvents getShared();
    @Property(selector = "flushBehavior")
    public static native FBSDKAppEventsFlushBehavior getFlushBehavior();
    @Property(selector = "setFlushBehavior:")
    public static native void setFlushBehavior(FBSDKAppEventsFlushBehavior v);
    @Property(selector = "loggingOverrideAppID")
    public static native String getLoggingOverrideAppID();
    @Property(selector = "setLoggingOverrideAppID:")
    public static native void setLoggingOverrideAppID(String v);
    @Property(selector = "userID")
    public static native String getUserID();
    @Property(selector = "setUserID:")
    public static native void setUserID(String v);
    @Property(selector = "anonymousID")
    public static native String getAnonymousID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FBSDKAppEventsOverrideAppIDBundleKey", optional=true)
    public static native NSString getOverrideAppIDBundleKey();
    @Library(Library.INTERNAL)
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        @GlobalValue(symbol="FBSDKAppEventsLoggingResultNotification", optional=true)
        public static native NSString LoggingResult();
    }
    
    @Method(selector = "activateApp")
    public native void activateApp();
    @Method(selector = "setUserEmail:firstName:lastName:phone:dateOfBirth:gender:city:state:zip:country:")
    public native void setUserData(String email, String firstName, String lastName, String phone, String dateOfBirth, String gender, String city, String state, String zip, String country);
    @Method(selector = "getUserData")
    public native String getUserData();
    @Method(selector = "clearUserData")
    public native void clearUserData();
    @Method(selector = "setUserData:forType:")
    public native void setUserData(String data, NSString type);
    @Method(selector = "clearUserDataForType:")
    public native void clearUserDataForType(NSString type);
    @Method(selector = "logEvent:")
    public static native void logEvent(NSString eventName);
    @Method(selector = "logEvent:valueToSum:")
    public static native void logEvent(NSString eventName, double valueToSum);
    @Method(selector = "logEvent:parameters:")
    public static native void logEvent(NSString eventName, NSDictionary<NSString, ?> parameters);
    @Method(selector = "logEvent:valueToSum:parameters:")
    public static native void logEvent(NSString eventName, double valueToSum, NSDictionary<NSString, ?> parameters);
    @Method(selector = "logEvent:valueToSum:parameters:accessToken:")
    public static native void logEvent(NSString eventName, NSNumber valueToSum, NSDictionary<NSString, ?> parameters, FBSDKAccessToken accessToken);
    @Method(selector = "logPurchase:currency:")
    public static native void logPurchase(double purchaseAmount, String currency);
    @Method(selector = "logPurchase:currency:parameters:")
    public static native void logPurchase(double purchaseAmount, String currency, NSDictionary<NSString, ?> parameters);
    @Method(selector = "logPurchase:currency:parameters:accessToken:")
    public static native void logPurchase(double purchaseAmount, String currency, NSDictionary<NSString, ?> parameters, FBSDKAccessToken accessToken);
    @Method(selector = "logPushNotificationOpen:")
    public static native void logPushNotificationOpen(NSDictionary<NSString, ?> payload);
    @Method(selector = "logPushNotificationOpen:action:")
    public static native void logPushNotificationOpen(NSDictionary<NSString, ?> payload, String action);
    @Method(selector = "logProductItem:availability:condition:description:imageLink:link:title:priceAmount:currency:gtin:mpn:brand:parameters:")
    public static native void logProductItemAvailability(String itemID, FBSDKProductAvailability availability, FBSDKProductCondition condition, String description, String imageLink, String link, String title, double priceAmount, String currency, String gtin, String mpn, String brand, NSDictionary<NSString, ?> parameters);
    @Method(selector = "setPushNotificationsDeviceToken:")
    public static native void setPushNotificationsDeviceToken(NSData deviceToken);
    @Method(selector = "setPushNotificationsDeviceTokenString:")
    public static native void setPushNotificationsDeviceTokenString(String deviceTokenString);
    @Method(selector = "flush")
    public static native void flush();
    @Method(selector = "requestForCustomAudienceThirdPartyIDWithAccessToken:")
    public static native FBSDKGraphRequest requestForCustomAudienceThirdPartyID(FBSDKAccessToken accessToken);
    @Method(selector = "clearUserID")
    public static native void clearUserID();
    @Method(selector = "augmentHybridWKWebView:")
    public static native void augmentHybridWKWebView(WKWebView webView);
    @Method(selector = "setIsUnityInit:")
    public static native void setIsUnityInit(boolean isUnityInit);
    @Method(selector = "sendEventBindingsToUnity")
    public static native void sendEventBindingsToUnity();
    @Method(selector = "logInternalEvent:parameters:isImplicitlyLogged:")
    public static native void logInternalEvent(NSString eventName, NSDictionary<NSString, ?> parameters, boolean isImplicitlyLogged);
    @Method(selector = "logInternalEvent:parameters:isImplicitlyLogged:accessToken:")
    public static native void logInternalEvent(NSString eventName, NSDictionary<NSString, ?> parameters, boolean isImplicitlyLogged, FBSDKAccessToken accessToken);
    /*</methods>*/
}
