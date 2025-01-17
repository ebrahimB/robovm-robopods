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
package org.robovm.pods.facebook.core;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.webkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC12FBSDKCoreKit25FBSDKAppEventsCAPIManager")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAppEventsCAPIManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKCAPIReporter/*</implements>*/ {

    /*<ptr>*/public static class FBSDKAppEventsCAPIManagerPtr extends Ptr<FBSDKAppEventsCAPIManager, FBSDKAppEventsCAPIManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKAppEventsCAPIManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKAppEventsCAPIManager() {}
    protected FBSDKAppEventsCAPIManager(Handle h, long handle) { super(h, handle); }
    protected FBSDKAppEventsCAPIManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "configureWithFactory:settings:")
    public native void configure(FBSDKGraphRequestFactoryProtocol factory, FBSDKSettingsProtocol settings);
    @Method(selector = "enable")
    public native void enable();
    @Method(selector = "recordEvent:")
    public native void recordEvent(NSDictionary<NSString, ?> parameters);
    @Method(selector = "shared")
    public static native FBSDKAppEventsCAPIManager shared();
    /*</methods>*/
}
