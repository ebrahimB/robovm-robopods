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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKBridgeAPIRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKBridgeAPIRequestProtocol/*</implements>*/ {

    /*<ptr>*/public static class FBSDKBridgeAPIRequestPtr extends Ptr<FBSDKBridgeAPIRequest, FBSDKBridgeAPIRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKBridgeAPIRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKBridgeAPIRequest() {}
    protected FBSDKBridgeAPIRequest(Handle h, long handle) { super(h, handle); }
    protected FBSDKBridgeAPIRequest(SkipInit skipInit) { super(skipInit); }
    public FBSDKBridgeAPIRequest(FBSDKBridgeAPIProtocolType protocolType, String scheme, String methodName, String methodVersion, NSDictionary<NSString, ?> parameters, NSDictionary<NSString, ?> userInfo) { super((Handle) null, create(protocolType, scheme, methodName, methodVersion, parameters, userInfo)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "actionID")
    public native String getActionID();
    @Property(selector = "methodName")
    public native String getMethodName();
    @Property(selector = "methodVersion")
    public native String getMethodVersion();
    @Property(selector = "parameters")
    public native NSDictionary<NSString, ?> getParameters();
    @Property(selector = "protocolType")
    public native FBSDKBridgeAPIProtocolType getProtocolType();
    @Property(selector = "scheme")
    public native String getScheme();
    @Property(selector = "userInfo")
    public native NSDictionary<NSString, ?> getUserInfo();
    @Property(selector = "protocol")
    public native FBSDKBridgeAPIProtocol getProtocol();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "requestURL:")
    public native NSURL requestURL(NSError.NSErrorPtr errorRef);
    @Method(selector = "bridgeAPIRequestWithProtocolType:scheme:methodName:methodVersion:parameters:userInfo:")
    protected static native @Pointer long create(FBSDKBridgeAPIProtocolType protocolType, String scheme, String methodName, String methodVersion, NSDictionary<NSString, ?> parameters, NSDictionary<NSString, ?> userInfo);
    /*</methods>*/
}
