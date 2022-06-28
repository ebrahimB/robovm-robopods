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
import org.robovm.apple.coreanimation.*;
import org.robovm.pods.facebook.core.*;
import org.robovm.pods.facebook.corebasics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKLoginManagerLoginResult/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKLoginManagerLoginResultPtr extends Ptr<FBSDKLoginManagerLoginResult, FBSDKLoginManagerLoginResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKLoginManagerLoginResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKLoginManagerLoginResult() {}
    protected FBSDKLoginManagerLoginResult(Handle h, long handle) { super(h, handle); }
    protected FBSDKLoginManagerLoginResult(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithToken:authenticationToken:isCancelled:grantedPermissions:declinedPermissions:")
    public FBSDKLoginManagerLoginResult(FBSDKAccessToken token, FBSDKAuthenticationToken authenticationToken, boolean isCancelled, NSSet<NSString> grantedPermissions, NSSet<NSString> declinedPermissions) { super((SkipInit) null); initObject(init(token, authenticationToken, isCancelled, grantedPermissions, declinedPermissions)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "token")
    public native FBSDKAccessToken getToken();
    @Property(selector = "authenticationToken")
    public native FBSDKAuthenticationToken getAuthenticationToken();
    @Property(selector = "isCancelled")
    public native boolean isCancelled();
    @Property(selector = "grantedPermissions")
    public native NSSet<NSString> getGrantedPermissions();
    @Property(selector = "declinedPermissions")
    public native NSSet<NSString> getDeclinedPermissions();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithToken:authenticationToken:isCancelled:grantedPermissions:declinedPermissions:")
    protected native @Pointer long init(FBSDKAccessToken token, FBSDKAuthenticationToken authenticationToken, boolean isCancelled, NSSet<NSString> grantedPermissions, NSSet<NSString> declinedPermissions);
    @Method(selector = "addLoggingExtra:forKey:")
    public native void addLogging(NSObject object, String key);
    /*</methods>*/
}
