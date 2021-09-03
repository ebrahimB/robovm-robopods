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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UMONPromoMetaDataBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UMONPromoMetaDataBuilderPtr extends Ptr<UMONPromoMetaDataBuilder, UMONPromoMetaDataBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UMONPromoMetaDataBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UMONPromoMetaDataBuilder() {}
    protected UMONPromoMetaDataBuilder(Handle h, long handle) { super(h, handle); }
    protected UMONPromoMetaDataBuilder(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "impressionDate")
    public native NSDate getImpressionDate();
    @Property(selector = "setImpressionDate:")
    public native void setImpressionDate(NSDate v);
    @Property(selector = "offerDuration")
    public native double getOfferDuration();
    @Property(selector = "setOfferDuration:")
    public native void setOfferDuration(double v);
    @Property(selector = "premiumProduct")
    public native UPURProduct getPremiumProduct();
    @Property(selector = "setPremiumProduct:")
    public native void setPremiumProduct(UPURProduct v);
    @Property(selector = "costs")
    public native NSArray<UMONItem> getCosts();
    @Property(selector = "setCosts:")
    public native void setCosts(NSArray<UMONItem> v);
    @Property(selector = "payouts")
    public native NSArray<UMONItem> getPayouts();
    @Property(selector = "setPayouts:")
    public native void setPayouts(NSArray<UMONItem> v);
    @Property(selector = "userInfo")
    public native NSDictionary<NSString, ?> getUserInfo();
    @Property(selector = "setUserInfo:")
    public native void setUserInfo(NSDictionary<NSString, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
