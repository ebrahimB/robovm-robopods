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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADCustomEventInterstitialDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GADCustomEventInterstitialDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("customEventInterstitialDidReceiveAd:")
    public void didReceiveAd(GADCustomEventInterstitial customEvent) {}
    @NotImplemented("customEventInterstitial:didFailAd:")
    public void didFailAd(GADCustomEventInterstitial customEvent, NSError error) {}
    @NotImplemented("customEventInterstitialWasClicked:")
    public void wasClicked(GADCustomEventInterstitial customEvent) {}
    @NotImplemented("customEventInterstitialWillPresent:")
    public void willPresent(GADCustomEventInterstitial customEvent) {}
    @NotImplemented("customEventInterstitialWillDismiss:")
    public void willDismiss(GADCustomEventInterstitial customEvent) {}
    @NotImplemented("customEventInterstitialDidDismiss:")
    public void didDismiss(GADCustomEventInterstitial customEvent) {}
    /**
     * @deprecated Use customEventInterstitialDidReceiveAd:.
     */
    @Deprecated
    @NotImplemented("customEventInterstitial:didReceiveAd:")
    public void didReceiveAd(GADCustomEventInterstitial customEvent, NSObject ad) {}
    /**
     * @deprecated Deprecated. No replacement.
     */
    @Deprecated
    @NotImplemented("customEventInterstitialWillLeaveApplication:")
    public void willLeaveApplication(GADCustomEventInterstitial customEvent) {}
    /*</methods>*/
}
