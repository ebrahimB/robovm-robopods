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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UMONPlacementContent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UMONPlacementContentPtr extends Ptr<UMONPlacementContent, UMONPlacementContentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UMONPlacementContent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UMONPlacementContent() {}
    protected UMONPlacementContent(Handle h, long handle) { super(h, handle); }
    protected UMONPlacementContent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPlacementId:withParams:")
    public UMONPlacementContent(String placementId, NSDictionary<?, ?> params) { super((SkipInit) null); initObject(init(placementId, params)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isReady")
    public native boolean isReady();
    @Property(selector = "type")
    public native String getType();
    @Property(selector = "placementId")
    public native String getPlacementId();
    @Property(selector = "state")
    public native UnityMonetizationPlacementContentState getState();
    @Property(selector = "setState:")
    public native void setState(UnityMonetizationPlacementContentState v);
    @Property(selector = "userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Property(selector = "setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPlacementId:withParams:")
    protected native @Pointer long init(String placementId, NSDictionary<?, ?> params);
    @Method(selector = "sendCustomEvent:")
    public native void sendCustomEvent(UMONCustomEvent customEvent);
    @Method(selector = "sendCustomEvent:withUserInfo:")
    public native void sendCustomEvent(String type, NSDictionary<NSString, ?> userInfo);
    @Method(selector = "sendCustomEventWithType:")
    public native void sendCustomEvent(String type);
    @Method(selector = "defaultEventCategory")
    public native String defaultEventCategory();
    /*</methods>*/
}
