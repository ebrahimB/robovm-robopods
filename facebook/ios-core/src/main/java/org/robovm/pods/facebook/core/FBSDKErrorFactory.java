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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKErrorFactory/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKErrorCreating/*</implements>*/ {

    /*<ptr>*/public static class FBSDKErrorFactoryPtr extends Ptr<FBSDKErrorFactory, FBSDKErrorFactoryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKErrorFactory.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKErrorFactory() {}
    protected FBSDKErrorFactory(Handle h, long handle) { super(h, handle); }
    protected FBSDKErrorFactory(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "errorWithCode:userInfo:message:underlyingError:")
    public native NSError error(@MachineSizedSInt long code, NSDictionary<NSString, ?> userInfo, String message, NSError underlyingError);
    @Method(selector = "errorWithDomain:code:userInfo:message:underlyingError:")
    public native NSError error(String domain, @MachineSizedSInt long code, NSDictionary<NSString, ?> userInfo, String message, NSError underlyingError);
    @Method(selector = "invalidArgumentErrorWithName:value:message:underlyingError:")
    public native NSError invalidArgumentError(String name, NSObject value, String message, NSError underlyingError);
    @Method(selector = "invalidArgumentErrorWithDomain:name:value:message:underlyingError:")
    public native NSError invalidArgumentError(String domain, String name, NSObject value, String message, NSError underlyingError);
    @Method(selector = "requiredArgumentErrorWithName:message:underlyingError:")
    public native NSError requiredArgumentError(String name, String message, NSError underlyingError);
    @Method(selector = "requiredArgumentErrorWithDomain:name:message:underlyingError:")
    public native NSError requiredArgumentError(String domain, String name, String message, NSError underlyingError);
    @Method(selector = "unknownErrorWithMessage:userInfo:")
    public native NSError unknownError(String message, NSDictionary<NSString, ?> userInfo);
    /*</methods>*/
}
