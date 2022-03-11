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
package org.robovm.pods.adapty;

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
import org.robovm.apple.storekit.*;
import org.robovm.apple.iad.*;
import org.robovm.apple.apptrackingtransparency.*;
import org.robovm.apple.adsupport.*;
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/AdaptyDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "didReceiveUpdatedPurchaserInfo:")
    void didReceiveUpdatedPurchaserInfo(PurchaserInfoModel purchaserInfo);
    @Method(selector = "didReceivePromo:")
    void didReceivePromo(PromoModel promo);
    @Method(selector = "paymentQueueWithShouldAddStorePaymentFor:defermentCompletion:")
    void paymentQueueWithShouldAddStorePaymentForProduct(ProductModel product, @Block("(@Block)") VoidBlock1<VoidBlock5<PurchaserInfoModel, NSString, NSDictionary<NSString, ?>, ProductModel, AdaptyError>> makeDeferredPurchase);
    @Method(selector = "didReceivePaywallsForConfigWithPaywalls:")
    void didReceivePaywallsForConfigWithPaywalls(NSArray<PaywallModel> paywalls);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}