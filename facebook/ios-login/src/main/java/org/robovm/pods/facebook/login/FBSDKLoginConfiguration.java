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
package org.robovm.pods.facebook.login;

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
import org.robovm.pods.facebook.core.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKLoginConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKLoginConfigurationPtr extends Ptr<FBSDKLoginConfiguration, FBSDKLoginConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKLoginConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKLoginConfiguration() {}
    protected FBSDKLoginConfiguration(Handle h, long handle) { super(h, handle); }
    protected FBSDKLoginConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPermissions:tracking:nonce:")
    public FBSDKLoginConfiguration(NSArray<NSString> permissions, FBSDKLoginTracking tracking, String nonce) { super((SkipInit) null); initObject(init(permissions, tracking, nonce)); }
    @Method(selector = "initWithPermissions:tracking:")
    public FBSDKLoginConfiguration(NSArray<NSString> permissions, FBSDKLoginTracking tracking) { super((SkipInit) null); initObject(init(permissions, tracking)); }
    @Method(selector = "initWithTracking:")
    public FBSDKLoginConfiguration(FBSDKLoginTracking tracking) { super((SkipInit) null); initObject(init(tracking)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "nonce")
    public native String getNonce();
    @Property(selector = "tracking")
    public native FBSDKLoginTracking getTracking();
    @Property(selector = "requestedPermissions")
    public native NSSet<NSObject> getRequestedPermissions();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPermissions:tracking:nonce:")
    protected native @Pointer long init(NSArray<NSString> permissions, FBSDKLoginTracking tracking, String nonce);
    @Method(selector = "initWithPermissions:tracking:")
    protected native @Pointer long init(NSArray<NSString> permissions, FBSDKLoginTracking tracking);
    @Method(selector = "initWithTracking:")
    protected native @Pointer long init(FBSDKLoginTracking tracking);
    /*</methods>*/
}
