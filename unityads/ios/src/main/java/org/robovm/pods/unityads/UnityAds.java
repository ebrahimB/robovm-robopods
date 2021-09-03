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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UnityAds/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UnityAdsPtr extends Ptr<UnityAds, UnityAdsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UnityAds.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UnityAds() {}
    protected UnityAds(Handle h, long handle) { super(h, handle); }
    protected UnityAds(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="UnityAdsModuleVersionNumber", optional=true)
    public static native double getVersionNumber();
    @GlobalValue(symbol="UnityAdsModuleVersionString", optional=true)
    public static native BytePtr getVersionString();
    
    /**
     * @deprecated Please migrate to using initialize without a delegate and add the delegate with the addDelegate method
     */
    @Deprecated
    @Method(selector = "initialize:delegate:")
    public static native void initialize(String gameId, UnityAdsDelegate delegate);
    @Method(selector = "initialize:")
    public static native void initialize(String gameId);
    @Method(selector = "initialize:initializationDelegate:")
    public static native void initialize(String gameId, UnityAdsInitializationDelegate initializationDelegate);
    /**
     * @deprecated Please migrate to using initialize without a delegate and add the delegate with the addDelegate method
     */
    @Deprecated
    @Method(selector = "initialize:delegate:testMode:")
    public static native void initialize(String gameId, UnityAdsDelegate delegate, boolean testMode);
    @Method(selector = "initialize:testMode:")
    public static native void initialize(String gameId, boolean testMode);
    @Method(selector = "initialize:testMode:initializationDelegate:")
    public static native void initialize(String gameId, boolean testMode, UnityAdsInitializationDelegate initializationDelegate);
    /**
     * @deprecated Please migrate to using initialize without a delegate and add the delegate with the addDelegate method
     */
    @Deprecated
    @Method(selector = "initialize:delegate:testMode:enablePerPlacementLoad:")
    public static native void initialize(String gameId, UnityAdsDelegate delegate, boolean testMode, boolean enablePerPlacementLoad);
    @Method(selector = "initialize:testMode:enablePerPlacementLoad:")
    public static native void initialize(String gameId, boolean testMode, boolean enablePerPlacementLoad);
    @Method(selector = "initialize:testMode:enablePerPlacementLoad:initializationDelegate:")
    public static native void initialize(String gameId, boolean testMode, boolean enablePerPlacementLoad, UnityAdsInitializationDelegate initializationDelegate);
    @Method(selector = "load:")
    public static native void load(String placementId);
    @Method(selector = "load:loadDelegate:")
    public static native void load(String placementId, UnityAdsLoadDelegate loadDelegate);
    @Method(selector = "load:options:loadDelegate:")
    public static native void load(String placementId, UADSLoadOptions options, UnityAdsLoadDelegate loadDelegate);
    /**
     * @deprecated Please migrate to using show call with placementId and showDelegate instead
     */
    @Deprecated
    @Method(selector = "show:")
    public static native void show(UIViewController viewController);
    /**
     * @deprecated Please migrate to using show call with showDelegate instead
     */
    @Deprecated
    @Method(selector = "show:placementId:")
    public static native void show(UIViewController viewController, String placementId);
    @Method(selector = "show:placementId:showDelegate:")
    public static native void show(UIViewController viewController, String placementId, UnityAdsShowDelegate showDelegate);
    /**
     * @deprecated Please migrate to using show call with showDelegate instead
     */
    @Deprecated
    @Method(selector = "show:placementId:options:")
    public static native void show(UIViewController viewController, String placementId, UADSShowOptions options);
    @Method(selector = "show:placementId:options:showDelegate:")
    public static native void show(UIViewController viewController, String placementId, UADSShowOptions options, UnityAdsShowDelegate showDelegate);
    /**
     * @deprecated Please migrate to using addDelegate and removeDelegate
     */
    @Deprecated
    @Method(selector = "getDelegate")
    public static native UnityAdsDelegate getDelegate();
    /**
     * @deprecated Please migrate to using addDelegate and removeDelegate
     */
    @Deprecated
    @Method(selector = "setDelegate:")
    public static native void setDelegate(UnityAdsDelegate delegate);
    @Method(selector = "addDelegate:")
    public static native void addDelegate(UnityAdsDelegate delegate);
    @Method(selector = "removeDelegate:")
    public static native void removeDelegate(UnityAdsDelegate delegate);
    @Method(selector = "getDebugMode")
    public static native boolean getDebugMode();
    @Method(selector = "setDebugMode:")
    public static native void setDebugMode(boolean enableDebugMode);
    @Method(selector = "isSupported")
    public static native boolean isSupported();
    /**
     * @deprecated Please migrate to using load call with UnityAdsLoadDelegate
     */
    @Deprecated
    @Method(selector = "isReady")
    public static native boolean isReady();
    /**
     * @deprecated Please migrate to using load call with UnityAdsLoadDelegate
     */
    @Deprecated
    @Method(selector = "isReady:")
    public static native boolean isReady(String placementId);
    @Method(selector = "getPlacementState")
    public static native UnityAdsPlacementState getPlacementState();
    @Method(selector = "getPlacementState:")
    public static native UnityAdsPlacementState getPlacementState(String placementId);
    @Method(selector = "getVersion")
    public static native String getVersion();
    @Method(selector = "isInitialized")
    public static native boolean isInitialized();
    @Method(selector = "getToken")
    public static native String getToken();
    /*</methods>*/
}
