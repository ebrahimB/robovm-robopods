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
package org.robovm.pods.facebook.audience;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBAdViewDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBAdViewDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("viewControllerForPresentingModalView")
    public UIViewController getViewControllerForPresentingModalView() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("adViewDidClick:")
    public void didClick(FBAdView adView) {}
    @NotImplemented("adViewDidFinishHandlingClick:")
    public void didFinishHandlingClick(FBAdView adView) {}
    @NotImplemented("adViewDidLoad:")
    public void didLoad(FBAdView adView) {}
    @NotImplemented("adView:didFailWithError:")
    public void didFail(FBAdView adView, NSError error) {}
    @NotImplemented("adViewWillLogImpression:")
    public void willLogImpression(FBAdView adView) {}
    @NotImplemented("adView:setDynamicHeight:")
    public void setDynamicHeight(FBAdView adView, double dynamicHeight) {}
    @NotImplemented("adView:setDynamicPosition:")
    public void setDynamicPosition(FBAdView adView, @ByVal CGPoint dynamicPosition) {}
    @NotImplemented("adView:animateToPosition:withDuration:")
    public void animate(FBAdView controller, @ByVal CGPoint position, @MachineSizedFloat double duration) {}
    @NotImplemented("adView:fullscreenDidFailWithError:")
    public void fullscreenDidFail(FBAdView adView, NSError error) {}
    /*</methods>*/
}
