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
package org.robovm.pods.kochava.core;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/KVAEventType/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements KVAAsForContextObjectProtocol, KVAFromObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class KVAEventTypePtr extends Ptr<KVAEventType, KVAEventTypePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(KVAEventType.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public KVAEventType() {}
    protected KVAEventType(Handle h, long handle) { super(h, handle); }
    protected KVAEventType(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "addToCart")
    public static native KVAEventType getAddToCart();
    @Property(selector = "addToWishList")
    public static native KVAEventType getAddToWishList();
    @Property(selector = "achievement")
    public static native KVAEventType getAchievement();
    @Property(selector = "checkoutStart")
    public static native KVAEventType getCheckoutStart();
    @Property(selector = "custom")
    public static native KVAEventType getCustom();
    @Property(selector = "levelComplete")
    public static native KVAEventType getLevelComplete();
    @Property(selector = "purchase")
    public static native KVAEventType getPurchase();
    @Property(selector = "rating")
    public static native KVAEventType getRating();
    @Property(selector = "registrationComplete")
    public static native KVAEventType getRegistrationComplete();
    @Property(selector = "search")
    public static native KVAEventType getSearch();
    @Property(selector = "tutorialComplete")
    public static native KVAEventType getTutorialComplete();
    @Property(selector = "view")
    public static native KVAEventType getView();
    @Property(selector = "adView")
    public static native KVAEventType getAdView();
    @Property(selector = "pushReceived")
    public static native KVAEventType getPushReceived();
    @Property(selector = "pushOpened")
    public static native KVAEventType getPushOpened();
    @Property(selector = "consentGranted")
    public static native KVAEventType getConsentGranted();
    @Property(selector = "deeplink")
    public static native KVAEventType getDeeplink();
    @Property(selector = "adClick")
    public static native KVAEventType getAdClick();
    @Property(selector = "startTrial")
    public static native KVAEventType getStartTrial();
    @Property(selector = "subscribe")
    public static native KVAEventType getSubscribe();
    @Property(selector = "nameString")
    public native String getNameString();
    @Property(selector = "setNameString:")
    public native void setNameString(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "kva_asForContextObjectWithContext:")
    public native NSObject kvaConvertForContext(KVAContext context);
    @Method(selector = "kva_fromObject:")
    public static native KVAEventType createFromObject(NSObject object);
    /*</methods>*/
}
