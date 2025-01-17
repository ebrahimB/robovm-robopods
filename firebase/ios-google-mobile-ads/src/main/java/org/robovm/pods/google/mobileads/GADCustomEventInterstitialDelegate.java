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
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Use GADMediationInterstitialAdEventDelegate instead.
 */
/*</javadoc>*/
/*<annotations>*/@Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/GADCustomEventInterstitialDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "customEventInterstitialDidReceiveAd:")
    void didReceiveAd(GADCustomEventInterstitial customEvent);
    @Method(selector = "customEventInterstitial:didFailAd:")
    void didFailAd(GADCustomEventInterstitial customEvent, NSError error);
    @Method(selector = "customEventInterstitialWasClicked:")
    void wasClicked(GADCustomEventInterstitial customEvent);
    @Method(selector = "customEventInterstitialWillPresent:")
    void willPresent(GADCustomEventInterstitial customEvent);
    @Method(selector = "customEventInterstitialWillDismiss:")
    void willDismiss(GADCustomEventInterstitial customEvent);
    @Method(selector = "customEventInterstitialDidDismiss:")
    void didDismiss(GADCustomEventInterstitial customEvent);
    /**
     * @deprecated Use customEventInterstitialDidReceiveAd:.
     */
    @Deprecated
    @Method(selector = "customEventInterstitial:didReceiveAd:")
    void didReceiveAd(GADCustomEventInterstitial customEvent, NSObject ad);
    /**
     * @deprecated Deprecated. No replacement.
     */
    @Deprecated
    @Method(selector = "customEventInterstitialWillLeaveApplication:")
    void willLeaveApplication(GADCustomEventInterstitial customEvent);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
