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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UMONShowAdPlacementContent/*</name>*/ 
    extends /*<extends>*/UMONRewardablePlacementContent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UMONShowAdPlacementContentPtr extends Ptr<UMONShowAdPlacementContent, UMONShowAdPlacementContentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UMONShowAdPlacementContent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UMONShowAdPlacementContent() {}
    protected UMONShowAdPlacementContent(Handle h, long handle) { super(h, handle); }
    protected UMONShowAdPlacementContent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPlacementId:withParams:")
    public UMONShowAdPlacementContent(String placementId, NSDictionary<?, ?> params) { super(placementId, params); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native UMONShowAdDelegate getDelegate();
    @Property(selector = "setDelegate:")
    public native void setDelegate(UMONShowAdDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "show:")
    public native void show(UIViewController viewController);
    @Method(selector = "show:withDelegate:")
    public native void show(UIViewController viewController, UMONShowAdDelegate delegate);
    /*</methods>*/
}
