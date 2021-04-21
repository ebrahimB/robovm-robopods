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
package org.robovm.pods.kochava.tracker;

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
import org.robovm.pods.kochava.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/KVATracker/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements KVAAsForContextObjectProtocol, KVAConfigureWithObjectProtocol, KVAFromObjectProtocol, KVASharedPropertyProvider, KVADeeplinksProcessorProvider, KVAEventSenderProvider, KVAPrivacyProfileRegistrarProvider, KVAPushNotificationsTokenAdderRemoverProvider/*</implements>*/ {

    /*<ptr>*/public static class KVATrackerPtr extends Ptr<KVATracker, KVATrackerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(KVATracker.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public KVATracker() {}
    protected KVATracker(Handle h, long handle) { super(h, handle); }
    protected KVATracker(SkipInit skipInit) { super(skipInit); }
    public KVATracker(String storageIdString) { super((Handle) null, create(storageIdString)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shared")
    public static native KVATracker getShared();
    @Property(selector = "sharedStorageIdString")
    public static native String getSharedStorageIdString();
    @Property(selector = "setSharedStorageIdString:")
    public static native void setSharedStorageIdString(String v);
    @Property(selector = "startedBool")
    public native boolean isStartedBool();
    @Property(selector = "adNetwork")
    public native NSObject getAdNetwork();
    @Property(selector = "appLimitAdTrackingBool")
    public native boolean isAppLimitAdTrackingBool();
    @Property(selector = "setAppLimitAdTrackingBool:")
    public native void setAppLimitAdTrackingBool(boolean v);
    @Property(selector = "appTrackingTransparency")
    public native KVAAppTrackingTransparency getAppTrackingTransparency();
    @Property(selector = "attribution")
    public native KVAAttribution getAttribution();
    @Property(selector = "consent")
    public native KVAConsent getConsent();
    @Property(selector = "customIdentifiers")
    public native KVACustomIdentifiers getCustomIdentifiers();
    @Property(selector = "deeplinks")
    public native KVADeeplinksProcessor getDeepLinkProcessor();
    @Property(selector = "deviceIdString")
    public native String getDeviceIdString();
    @Property(selector = "events")
    public native KVAEvents getEvents();
    @Property(selector = "identityLink")
    public native KVAIdentityLink getIdentityLink();
    @Property(selector = "locationServices")
    public native NSObject getLocationServices();
    @Property(selector = "privacy")
    public native KVAPrivacyProfileRegistrar getPrivacyProfileRegistrar();
    @Property(selector = "pushNotifications")
    public native KVAPushNotifications getPushNotifications();
    @Property(selector = "sleepBool")
    public native boolean isSleepBool();
    @Property(selector = "setSleepBool:")
    public native void setSleepBool(boolean v);
    /*</properties>*/

    // dkimitsa: manually added code
    public KVADeeplinks getDeepLinks() {
        // simulating KVADeeplinks<KVADeeplinksProcessor> *deeplinks;
        return (KVADeeplinks)getDeepLinkProcessor();
    }
    public KVAPrivacy getPrivacy() {
        // simulating KVAPrivacy<KVAPrivacyProfileRegistrar>;
        return (KVAPrivacy)getPrivacyProfileRegistrar();
    }
    // dkimitsa: end of manually added code

    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="KochavaTrackerVersionNumber", optional=true)
    public static native double getVersionNumber();
    @GlobalValue(symbol="KochavaTrackerVersionString", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String getVersionString();
    
    @Method(selector = "invalidate")
    public native void invalidate();
    @Method(selector = "startWithAppGUIDString:")
    public native void startUsingAppGUID(String appGUIDString);
    @Method(selector = "startWithPartnerNameString:")
    public native void startUsingPartnerName(String partnerNameString);
    @Method(selector = "executeAdvancedInstructionWithIdentifierString:valueObject:")
    public native void executeAdvancedInstruction(String identifierString, NSObject valueObject);
    @Method(selector = "tracker")
    public static native KVATracker tracker();
    @Method(selector = "trackerWithStorageIdString:")
    protected static native @Pointer long create(String storageIdString);
    @Method(selector = "sdkVersionString")
    public native String sdkVersionString();
    @Method(selector = "kva_asForContextObjectWithContext:")
    public native NSObject kvaConvertForContext(KVAContext context);
    @Method(selector = "kva_configureWith:context:")
    public native void kvaConfigure(NSObject withObject, KVAContext context);
    @Method(selector = "kva_fromObject:")
    public static native KVATracker kva_fromObject(NSObject fromObject);
    /*</methods>*/
}
