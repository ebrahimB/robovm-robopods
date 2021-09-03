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
/**
 * @deprecated Please use the UnityAds interface
 */
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UnityMonetization/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UnityMonetizationPtr extends Ptr<UnityMonetization, UnityMonetizationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UnityMonetization.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UnityMonetization() {}
    protected UnityMonetization(Handle h, long handle) { super(h, handle); }
    protected UnityMonetization(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setDelegate:")
    public static native void setDelegate(UnityMonetizationDelegate delegate);
    @Method(selector = "getDelegate")
    public static native UnityMonetizationDelegate getDelegate();
    @Method(selector = "isReady:")
    public static native boolean isReady(String placementId);
    @Method(selector = "getPlacementContent:")
    public static native UMONPlacementContent getPlacementContent(String placementId);
    @Method(selector = "initialize:delegate:")
    public static native void initialize(String gameId, UnityMonetizationDelegate delegate);
    @Method(selector = "initialize:delegate:testMode:")
    public static native void initialize(String gameId, UnityMonetizationDelegate delegate, boolean testMode);
    /*</methods>*/
}
