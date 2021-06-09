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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKBridgeAPI/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKBridgeAPIPtr extends Ptr<FBSDKBridgeAPI, FBSDKBridgeAPIPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKBridgeAPI.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKBridgeAPI() {}
    protected FBSDKBridgeAPI(Handle h, long handle) { super(h, handle); }
    protected FBSDKBridgeAPI(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithProcessInfo:")
    public FBSDKBridgeAPI(NSObject processInfo) { super((SkipInit) null); initObject(init(processInfo)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedInstance")
    public static native FBSDKBridgeAPI getSharedInstance();
    @Property(selector = "isActive")
    public native boolean isActive();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library(Library.INTERNAL)
    public static class Keys {
        static { Bro.bind(Keys.class); }

        @GlobalValue(symbol="FBSDKBridgeAPIAppIDKey", optional=true)
        public static native NSString EventAppID();
        @GlobalValue(symbol="FBSDKBridgeAPISchemeSuffixKey", optional=true)
        public static native NSString EventSchemeSuffix();
        @GlobalValue(symbol="FBSDKBridgeAPIVersionKey", optional=true)
        public static native NSString EventVersion();
    }
    
    @Method(selector = "initWithProcessInfo:")
    protected native @Pointer long init(NSObject processInfo);
    @Method(selector = "openBridgeAPIRequest:useSafariViewController:fromViewController:completionBlock:")
    public native void openBridgeAPIRequest(FBSDKBridgeAPIRequestProtocol request, boolean useSafariViewController, UIViewController fromViewController, @Block VoidBlock1<FBSDKBridgeAPIResponse> completionBlock);
    @Method(selector = "openURLWithSafariViewController:sender:fromViewController:handler:")
    public native void openURLWithSafariViewController(NSURL url, FBSDKURLOpening sender, UIViewController fromViewController, @Block VoidBlock2<Boolean, NSError> handler);
    @Method(selector = "openURL:sender:handler:")
    public native void openURL(NSURL url, FBSDKURLOpening sender, @Block VoidBlock2<Boolean, NSError> handler);
    @Method(selector = "sessionCompletionHandler")
    public native @Block VoidBlock2<NSURL, NSError> sessionCompletionHandler();
    /*</methods>*/
}
