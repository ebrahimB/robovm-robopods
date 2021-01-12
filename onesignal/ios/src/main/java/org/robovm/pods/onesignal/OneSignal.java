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
package org.robovm.pods.onesignal;

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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OneSignal/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OneSignalPtr extends Ptr<OneSignal, OneSignalPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OneSignal.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OneSignal() {}
    protected OneSignal(Handle h, long handle) { super(h, handle); }
    protected OneSignal(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "inFocusDisplayType")
    public static native OSNotificationDisplayType getInFocusDisplayType();
    @Property(selector = "setInFocusDisplayType:")
    public static native void setInFocusDisplayType(OSNotificationDisplayType v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="ONESIGNAL_VERSION", optional=true)
    public static native String getVersion();
    
    @Method(selector = "initWithLaunchOptions:appId:")
    public static native ObjCClass Init(UIApplicationLaunchOptions launchOptions, String appId);
    @Method(selector = "initWithLaunchOptions:appId:handleNotificationAction:")
    public static native ObjCClass Init(UIApplicationLaunchOptions launchOptions, String appId, @Block VoidBlock1<OSNotificationOpenedResult> actionCallback);
    @Method(selector = "initWithLaunchOptions:appId:handleNotificationAction:settings:")
    public static native ObjCClass Init(UIApplicationLaunchOptions launchOptions, String appId, @Block VoidBlock1<OSNotificationOpenedResult> actionCallback, OSSettings settings);
    @Method(selector = "initWithLaunchOptions:appId:handleNotificationReceived:handleNotificationAction:settings:")
    public static native ObjCClass Init(UIApplicationLaunchOptions launchOptions, String appId, @Block VoidBlock1<OSNotification> receivedCallback, @Block VoidBlock1<OSNotificationOpenedResult> actionCallback, OSSettings settings);
    @Method(selector = "consentGranted:")
    public static native void consentGranted(boolean granted);
    @Method(selector = "requiresUserPrivacyConsent")
    public static native boolean requiresUserPrivacyConsent();
    @Method(selector = "setRequiresUserPrivacyConsent:")
    public static native void setRequiresUserPrivacyConsent(boolean required);
    @Method(selector = "app_id")
    public static native String getAppId();
    @Method(selector = "sdk_version_raw")
    public static native String getSdkVersionRaw();
    @Method(selector = "sdk_semantic_version")
    public static native String getSdkSemanticVersion();
    /**
     * @deprecated Please use promptForPushNotificationsWithUserResponse instead.
     */
    @Deprecated
    @Method(selector = "registerForPushNotifications")
    public static native void registerForPushNotifications();
    @Method(selector = "promptForPushNotificationsWithUserResponse:")
    public static native void promptForPushNotifications(@Block VoidBooleanBlock completionHandler);
    @Method(selector = "promptForPushNotificationsWithUserResponse:fallbackToSettings:")
    public static native void promptForPushNotifications(@Block VoidBooleanBlock completionHandler, boolean fallback);
    @Method(selector = "presentAppSettings")
    public static native void presentAppSettings();
    @Method(selector = "registerForProvisionalAuthorization:")
    public static native void registerForProvisionalAuthorization(@Block VoidBooleanBlock completionHandler);
    @Method(selector = "setLogLevel:visualLevel:")
    public static native void setLogLevel(OSLogLevel logLevel, OSLogLevel visualLogLevel);
    @Method(selector = "onesignal_Log:message:")
    public static native void onesignalLog(OSLogLevel logLevel, String message);
    @Method(selector = "sendTag:value:onSuccess:onFailure:")
    public static native void sendTag(String key, String value, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "sendTag:value:")
    public static native void sendTag(String key, String value);
    @Method(selector = "sendTags:onSuccess:onFailure:")
    public static native void sendTags(NSDictionary<?, ?> keyValuePair, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "sendTags:")
    public static native void sendTags(NSDictionary<?, ?> keyValuePair);
    @Method(selector = "sendTagsWithJsonString:")
    public static native void sendTags(String jsonString);
    @Method(selector = "getTags:onFailure:")
    public static native void getTags(@Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "getTags:")
    public static native void getTags(@Block VoidBlock1<NSDictionary<?, ?>> successBlock);
    @Method(selector = "deleteTag:onSuccess:onFailure:")
    public static native void deleteTag(String key, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "deleteTag:")
    public static native void deleteTag(String key);
    @Method(selector = "deleteTags:onSuccess:onFailure:")
    public static native void deleteTags(NSArray<?> keys, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "deleteTags:")
    public static native void deleteTags(NSArray<?> keys);
    @Method(selector = "deleteTagsWithJsonString:")
    public static native void deleteTags(String jsonString);
    /**
     * @deprecated Please refer to our new Email methods/functionality such as setEmail(). This method will be removed in a future version of the OneSignal SDK
     */
    @Deprecated
    @Method(selector = "syncHashedEmail:")
    public static native void syncHashedEmail(String email);
    /**
     * @deprecated Please use getPermissionSubscriptionState or addSubscriptionObserver and addPermissionObserver instead.
     */
    @Deprecated
    @Method(selector = "IdsAvailable:")
    public static native void IdsAvailable(@Block VoidBlock2<NSString, NSString> idsAvailableBlock);
    @Method(selector = "getPermissionSubscriptionState")
    public static native OSPermissionSubscriptionState getPermissionSubscriptionState();
    @Method(selector = "addPermissionObserver:")
    public static native void addPermissionObserver(OSPermissionObserver observer);
    @Method(selector = "removePermissionObserver:")
    public static native void removePermissionObserver(OSPermissionObserver observer);
    @Method(selector = "addSubscriptionObserver:")
    public static native void addSubscriptionObserver(OSSubscriptionObserver observer);
    @Method(selector = "removeSubscriptionObserver:")
    public static native void removeSubscriptionObserver(OSSubscriptionObserver observer);
    @Method(selector = "addEmailSubscriptionObserver:")
    public static native void addEmailSubscriptionObserver(OSEmailSubscriptionObserver observer);
    @Method(selector = "removeEmailSubscriptionObserver:")
    public static native void removeEmailSubscriptionObserver(OSEmailSubscriptionObserver observer);
    @Method(selector = "setSubscription:")
    public static native void setSubscription(boolean enable);
    @Method(selector = "isInAppMessagingPaused")
    public static native boolean isInAppMessagingPaused();
    @Method(selector = "pauseInAppMessages:")
    public static native void pauseInAppMessages(boolean pause);
    @Method(selector = "postNotification:")
    public static native void postNotification(NSDictionary<?, ?> jsonData);
    @Method(selector = "postNotification:onSuccess:onFailure:")
    public static native void postNotification(NSDictionary<?, ?> jsonData, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "postNotificationWithJsonString:onSuccess:onFailure:")
    public static native void postNotification(String jsonData, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "parseNSErrorAsJsonString:")
    public static native String parseNSErrorAsJsonString(NSError error);
    @Method(selector = "promptLocation")
    public static native void promptLocation();
    @Method(selector = "setLocationShared:")
    public static native void setLocationShared(boolean enable);
    @Method(selector = "isLocationShared")
    public static native boolean isLocationShared();
    @Method(selector = "setMSDKType:")
    public static native void setMSDKType(String type);
    @Method(selector = "setInAppMessageClickHandler:")
    public static native void setInAppMessageClickHandler(@Block VoidBlock1<OSInAppMessageAction> delegate);
    @Method(selector = "didReceiveNotificationExtensionRequest:withMutableNotificationContent:")
    public static native UNMutableNotificationContent didReceiveNotification(UNNotificationRequest request, UNMutableNotificationContent replacementContent);
    @Method(selector = "serviceExtensionTimeWillExpireRequest:withMutableNotificationContent:")
    public static native UNMutableNotificationContent serviceExtensionTimeWillExpire(UNNotificationRequest request, UNMutableNotificationContent replacementContent);
    @Method(selector = "setEmail:withEmailAuthHashToken:withSuccess:withFailure:")
    public static native void setEmail(String email, String hashToken, @Block Runnable successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "setEmail:withSuccess:withFailure:")
    public static native void setEmail(String email, @Block Runnable successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "logoutEmailWithSuccess:withFailure:")
    public static native void logoutEmail(@Block Runnable successBlock, @Block VoidBlock1<NSError> failureBlock);
    @Method(selector = "logoutEmail")
    public static native void logoutEmail();
    @Method(selector = "setEmail:")
    public static native void setEmail(String email);
    @Method(selector = "setEmail:withEmailAuthHashToken:")
    public static native void setEmail(String email, String hashToken);
    @Method(selector = "addTrigger:withValue:")
    public static native void addTrigger(String key, NSObject value);
    @Method(selector = "addTriggers:")
    public static native void addTriggers(NSDictionary<NSString, ?> triggers);
    @Method(selector = "removeTriggerForKey:")
    public static native void removeTriggerForKey(String key);
    @Method(selector = "removeTriggersForKeys:")
    public static native void removeTriggersForKeys(NSArray<NSString> keys);
    @Method(selector = "getTriggers")
    public static native NSDictionary<NSString, ?> getTriggers();
    @Method(selector = "getTriggerValueForKey:")
    public static native NSObject getTriggerValueForKey(String key);
    @Method(selector = "setExternalUserId:")
    public static native void setExternalUserId(String externalId);
    @Method(selector = "removeExternalUserId")
    public static native void removeExternalUserId();
    /*</methods>*/
}
