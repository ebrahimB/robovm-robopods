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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UnityAdsDelegateUtil/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UnityAdsDelegateUtilPtr extends Ptr<UnityAdsDelegateUtil, UnityAdsDelegateUtilPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UnityAdsDelegateUtil.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UnityAdsDelegateUtil() {}
    protected UnityAdsDelegateUtil(Handle h, long handle) { super(h, handle); }
    protected UnityAdsDelegateUtil(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "unityAdsReady:")
    public static native void unityAdsReady(String placementId);
    @Method(selector = "unityAdsDidError:withMessage:")
    public static native void unityAdsDidError(UnityAdsError error, String message);
    @Method(selector = "unityAdsDidStart:")
    public static native void unityAdsDidStart(String placementId);
    @Method(selector = "unityAdsDidFinish:withFinishState:")
    public static native void unityAdsDidFinish(String placementId, UnityAdsFinishState state);
    @Method(selector = "unityAdsDoClick:")
    public static native void unityAdsDoClick(String placementId);
    @Method(selector = "unityAdsPlacementStateChange:oldState:newState:")
    public static native void unityAdsPlacementStateChange(String placementId, UnityAdsPlacementState oldState, UnityAdsPlacementState newState);
    /*</methods>*/
}
