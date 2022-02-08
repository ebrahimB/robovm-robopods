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
/**
 * @deprecated `SDKError` is deprecated and will be removed in the next major release; use `ErrorFactory` and/or `NetworkErrorChecker` instead
 */
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKError/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKErrorPtr extends Ptr<FBSDKError, FBSDKErrorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKError() {}
    protected FBSDKError(Handle h, long handle) { super(h, handle); }
    protected FBSDKError(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "errorWithCode:message:")
    public static native NSError create(@MachineSizedSInt long code, String message);
    @Method(selector = "errorWithDomain:code:message:")
    public static native NSError create(String domain, @MachineSizedSInt long code, String message);
    @Method(selector = "errorWithCode:message:underlyingError:")
    public static native NSError create(@MachineSizedSInt long code, String message, NSError underlyingError);
    @Method(selector = "errorWithDomain:code:message:underlyingError:")
    public static native NSError create(String domain, @MachineSizedSInt long code, String message, NSError underlyingError);
    @Method(selector = "errorWithDomain:code:userInfo:message:underlyingError:")
    public static native NSError create(String domain, @MachineSizedSInt long code, NSDictionary<NSString, ?> userInfo, String message, NSError underlyingError);
    @Method(selector = "invalidArgumentErrorWithName:value:message:")
    public static native NSError createInvalidArgumentError(String name, NSObject value, String message);
    @Method(selector = "invalidArgumentErrorWithDomain:name:value:message:")
    public static native NSError createInvalidArgumentError(String domain, String name, NSObject value, String message);
    @Method(selector = "invalidArgumentErrorWithDomain:name:value:message:underlyingError:")
    public static native NSError createInvalidArgumentError(String domain, String name, NSObject value, String message, NSError underlyingError);
    @Method(selector = "requiredArgumentErrorWithDomain:name:message:")
    public static native NSError createInvalidArgumentError(String domain, String name, String message);
    @Method(selector = "unknownErrorWithMessage:")
    public static native NSError createUnknownError(String message);
    @Method(selector = "isNetworkError:")
    public static native boolean isNetworkError(NSError error);
    /*</methods>*/
}
