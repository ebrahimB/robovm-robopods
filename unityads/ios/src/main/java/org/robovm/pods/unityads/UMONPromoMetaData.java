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
package org.robovm.pods.unityads;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UMONPromoMetaData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UMONPromoMetaDataPtr extends Ptr<UMONPromoMetaData, UMONPromoMetaDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UMONPromoMetaData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UMONPromoMetaData() {}
    protected UMONPromoMetaData(Handle h, long handle) { super(h, handle); }
    protected UMONPromoMetaData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBuilder:")
    public UMONPromoMetaData(UMONPromoMetaDataBuilder builder) { super((SkipInit) null); initObject(init(builder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "impressionDate")
    public native NSDate getImpressionDate();
    @Property(selector = "setImpressionDate:")
    public native void setImpressionDate(NSDate v);
    @Property(selector = "offerDuration")
    public native double getOfferDuration();
    @Property(selector = "premiumProduct")
    public native UPURProduct getPremiumProduct();
    @Property(selector = "costs")
    public native NSArray<UMONItem> getCosts();
    @Property(selector = "payouts")
    public native NSArray<UMONItem> getPayouts();
    @Property(selector = "userInfo")
    public native NSDictionary<NSString, ?> getUserInfo();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBuilder:")
    protected native @Pointer long init(UMONPromoMetaDataBuilder builder);
    @Method(selector = "isExpired")
    public native boolean isExpired();
    @Method(selector = "isPremium")
    public native boolean isPremium();
    @Method(selector = "timeRemaining")
    public native double timeRemaining();
    @Method(selector = "cost")
    public native UMONItem cost();
    @Method(selector = "payout")
    public native UMONItem payout();
    /*</methods>*/
}
