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
package org.robovm.pods.fyber.core;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IAUnitDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements IAUnitDelegate/*</implements>*/ {

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
    @NotImplemented("IAParentViewControllerForUnitController:")
    public UIViewController IAParentViewControllerForUnitController(IAUnitController unitController) { return null; }
    @NotImplemented("IAAdDidReceiveClick:")
    public void IAAdDidReceiveClick(IAUnitController unitController) {}
    @NotImplemented("IAAdWillLogImpression:")
    public void IAAdWillLogImpression(IAUnitController unitController) {}
    @NotImplemented("IAAdDidReward:")
    public void IAAdDidReward(IAUnitController unitController) {}
    @NotImplemented("IAUnitControllerWillPresentFullscreen:")
    public void IAUnitControllerWillPresentFullscreen(IAUnitController unitController) {}
    @NotImplemented("IAUnitControllerDidPresentFullscreen:")
    public void IAUnitControllerDidPresentFullscreen(IAUnitController unitController) {}
    @NotImplemented("IAUnitControllerWillDismissFullscreen:")
    public void IAUnitControllerWillDismissFullscreen(IAUnitController unitController) {}
    @NotImplemented("IAUnitControllerDidDismissFullscreen:")
    public void IAUnitControllerDidDismissFullscreen(IAUnitController unitController) {}
    @NotImplemented("IAUnitControllerWillOpenExternalApp:")
    public void IAUnitControllerWillOpenExternalApp(IAUnitController unitController) {}
    @NotImplemented("IAAdDidExpire:")
    public void IAAdDidExpire(IAUnitController unitController) {}
    /*</methods>*/
}