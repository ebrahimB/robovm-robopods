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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAuthenticationTokenClaims/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKAuthenticationTokenClaimsPtr extends Ptr<FBSDKAuthenticationTokenClaims, FBSDKAuthenticationTokenClaimsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKAuthenticationTokenClaims.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKAuthenticationTokenClaims() {}
    protected FBSDKAuthenticationTokenClaims(Handle h, long handle) { super(h, handle); }
    protected FBSDKAuthenticationTokenClaims(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "jti")
    public native String getJti();
    @Property(selector = "iss")
    public native String getIss();
    @Property(selector = "aud")
    public native String getAud();
    @Property(selector = "nonce")
    public native String getNonce();
    @Property(selector = "exp")
    public native @MachineSizedSInt long getExp();
    @Property(selector = "iat")
    public native @MachineSizedSInt long getIat();
    @Property(selector = "sub")
    public native String getSub();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "email")
    public native String getEmail();
    @Property(selector = "picture")
    public native String getPicture();
    @Property(selector = "userFriends")
    public native NSArray<NSString> getUserFriends();
    @Property(selector = "userBirthday")
    public native String getUserBirthday();
    @Property(selector = "userAgeRange")
    public native NSDictionary<NSString, NSNumber> getUserAgeRange();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
