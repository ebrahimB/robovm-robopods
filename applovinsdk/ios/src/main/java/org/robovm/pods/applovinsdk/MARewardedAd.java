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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MARewardedAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MARewardedAdPtr extends Ptr<MARewardedAd, MARewardedAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MARewardedAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MARewardedAd() {}
    protected MARewardedAd(Handle h, long handle) { super(h, handle); }
    protected MARewardedAd(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MARewardedAdDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MARewardedAdDelegate v);
    @Property(selector = "revenueDelegate")
    public native MAAdRevenueDelegate getRevenueDelegate();
    @Property(selector = "setRevenueDelegate:", strongRef = true)
    public native void setRevenueDelegate(MAAdRevenueDelegate v);
    @Property(selector = "adReviewDelegate")
    public native MAAdReviewDelegate getAdReviewDelegate();
    @Property(selector = "setAdReviewDelegate:", strongRef = true)
    public native void setAdReviewDelegate(MAAdReviewDelegate v);
    @Property(selector = "adUnitIdentifier")
    public native String getAdUnitIdentifier();
    @Property(selector = "isReady")
    public native boolean isReady();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadAd")
    public native void loadAd();
    @Method(selector = "showAd")
    public native void showAd();
    @Method(selector = "showAdForPlacement:")
    public native void showAdForPlacement(String placement);
    @Method(selector = "showAdForPlacement:customData:")
    public native void showAdForPlacement(String placement, String customData);
    @Method(selector = "showAdForPlacement:customData:viewController:")
    public native void showAdForPlacement(String placement, String customData, UIViewController viewController);
    @Method(selector = "setExtraParameterForKey:value:")
    public native void setExtraParameter(String key, String value);
    @Method(selector = "setLocalExtraParameterForKey:value:")
    public native void setLocalExtraParameter(String key, NSObject value);
    @Method(selector = "sharedWithAdUnitIdentifier:")
    public static native MARewardedAd getShared(String adUnitIdentifier);
    @Method(selector = "sharedWithAdUnitIdentifier:sdk:")
    public static native MARewardedAd getShared(String adUnitIdentifier, ALSdk sdk);
    /*</methods>*/
}
