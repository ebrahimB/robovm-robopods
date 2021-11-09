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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKInternalUtility/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKInternalUtilityProtocol, FBSDKAppAvailabilityChecker, FBSDKAppURLSchemeProviding, FBSDKURLHosting/*</implements>*/ {

    /*<ptr>*/public static class FBSDKInternalUtilityPtr extends Ptr<FBSDKInternalUtility, FBSDKInternalUtilityPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKInternalUtility.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKInternalUtility() {}
    protected FBSDKInternalUtility(Handle h, long handle) { super(h, handle); }
    protected FBSDKInternalUtility(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedUtility")
    public static native FBSDKInternalUtility getSharedUtility();
    @Property(selector = "bundleForStrings")
    public native NSBundle getBundleForStrings();
    @Property(selector = "isMessengerAppInstalled")
    public native boolean isMessengerAppInstalled();
    @Property(selector = "isFacebookAppInstalled")
    public native boolean isFacebookAppInstalled();
    @Property(selector = "isMSQRDPlayerAppInstalled")
    public native boolean isMSQRDPlayerAppInstalled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated `FBSDK_CANOPENURL_FACEBOOK` is deprecated and will be removed in the next major release; please use `URLScheme.facebookApp` instead
     */
    @Deprecated
    @GlobalValue(symbol="FBSDK_CANOPENURL_FACEBOOK", optional=true)
    public static native String canOpenFACEBOOK();
    /**
     * @deprecated `FBSDK_CANOPENURL_FBAPI` is deprecated and will be removed in the next major release; please use `URLScheme.facebookAPI` instead
     */
    @Deprecated
    @GlobalValue(symbol="FBSDK_CANOPENURL_FBAPI", optional=true)
    public static native String canOpenFBAPI();
    /**
     * @deprecated `FBSDK_CANOPENURL_MESSENGER` is deprecated and will be removed in the next major release; please use `URLScheme.messengerApp` instead
     */
    @Deprecated
    @GlobalValue(symbol="FBSDK_CANOPENURL_MESSENGER", optional=true)
    public static native String canOpenMESSENGER();
    /**
     * @deprecated `FBSDK_CANOPENURL_MSQRD_PLAYER` is deprecated and will be removed in the next major release; please use `URLScheme.masqueradePlayer` instead
     */
    @Deprecated
    @GlobalValue(symbol="FBSDK_CANOPENURL_MSQRD_PLAYER", optional=true)
    public static native String canOpenMSQRD_PLAYER();
    /**
     * @deprecated `FBSDK_CANOPENURL_SHARE_EXTENSION` is deprecated and will be removed in the next major release; please use `URLScheme.facebookShareExtension` instead
     */
    @Deprecated
    @GlobalValue(symbol="FBSDK_CANOPENURL_SHARE_EXTENSION", optional=true)
    public static native String canOpenSHARE_EXTENSION();
    
    @Method(selector = "appURLWithHost:path:queryParameters:error:")
    public native NSURL appURL(String host, String path, NSDictionary<NSString, ?> queryParameters, NSError.NSErrorPtr errorRef);
    @Method(selector = "parametersFromFBURL:")
    public native NSDictionary<NSString, ?> parametersFromFBURL(NSURL url);
    @Method(selector = "facebookURLWithHostPrefix:path:queryParameters:error:")
    public native NSURL facebookURL(String hostPrefix, String path, NSDictionary<NSString, ?> queryParameters, NSError.NSErrorPtr errorRef);
    @Method(selector = "isBrowserURL:")
    public native boolean isBrowserURL(NSURL URL);
    @Method(selector = "object:isEqualToObject:")
    public native boolean compareUrls(NSObject object, NSObject other);
    @Method(selector = "extractPermissionsFromResponse:grantedPermissions:declinedPermissions:expiredPermissions:")
    public native void extractPermissions(NSDictionary<NSString, ?> responseObject, NSMutableSet<NSString> grantedPermissions, NSMutableSet<NSString> declinedPermissions, NSMutableSet<NSString> expiredPermissions);
    @Method(selector = "validateAppID")
    public native void validateAppID();
    @Method(selector = "validateRequiredClientAccessToken")
    public native String validateRequiredClientAccessToken();
    @Method(selector = "viewControllerForView:")
    public native UIViewController viewControllerForView(UIView view);
    @Method(selector = "isRegisteredURLScheme:")
    public native boolean isRegisteredURLScheme(String urlScheme);
    @Method(selector = "topMostViewController")
    public native UIViewController topMostViewController();
    @Method(selector = "findWindow")
    public native UIWindow findWindow();
    @Method(selector = "isRegisteredCanOpenURLScheme:")
    public native boolean isRegisteredCanOpenURLScheme(String urlScheme);
    @Method(selector = "URLWithScheme:host:path:queryParameters:error:")
    public native NSURL constructURL(String scheme, String host, String path, NSDictionary<NSString, ?> queryParameters, NSError.NSErrorPtr errorRef);
    @Method(selector = "registerTransientObject:")
    public native void registerTransientObject(NSObject object);
    @Method(selector = "unregisterTransientObject:")
    public native void unregisterTransientObject(NSObject object);
    @Method(selector = "checkRegisteredCanOpenURLScheme:")
    public native void checkRegisteredCanOpenURLScheme(String urlScheme);
    @Method(selector = "validateURLSchemes")
    public native void validateURLSchemes();
    @Method(selector = "appURLScheme")
    public native String appURLScheme();
    /*</methods>*/
}
