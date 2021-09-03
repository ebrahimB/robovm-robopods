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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UMONNativePromoAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UMONNativePromoAdapterPtr extends Ptr<UMONNativePromoAdapter, UMONNativePromoAdapterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UMONNativePromoAdapter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UMONNativePromoAdapter() {}
    protected UMONNativePromoAdapter(Handle h, long handle) { super(h, handle); }
    protected UMONNativePromoAdapter(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPromo:")
    public UMONNativePromoAdapter(UMONPromoAdPlacementContent promo) { super((SkipInit) null); initObject(init(promo)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPromo:")
    protected native @Pointer long init(UMONPromoAdPlacementContent promo);
    @Method(selector = "promoDidShow")
    public native void promoDidShow();
    @Method(selector = "promoDidShow:")
    public native void promoDidShow(UMONNativePromoShowType showType);
    @Method(selector = "promoDidClick")
    public native void promoDidClick();
    @Method(selector = "promoDidClose")
    public native void promoDidClose();
    @Method(selector = "metadata")
    public native UMONPromoMetaData metadata();
    /*</methods>*/
}
