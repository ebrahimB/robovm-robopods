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
    public FBSDKAuthenticationTokenClaims(String encodedClaims, String expectedNonce) { super((Handle) null, create(encodedClaims, expectedNonce)); retain(getHandle()); }
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
    public native double getExp();
    @Property(selector = "iat")
    public native double getIat();
    @Property(selector = "sub")
    public native String getSub();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "givenName")
    public native String getGivenName();
    @Property(selector = "middleName")
    public native String getMiddleName();
    @Property(selector = "familyName")
    public native String getFamilyName();
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
    @Property(selector = "userHometown")
    public native NSDictionary<NSString, NSString> getUserHometown();
    @Property(selector = "userLocation")
    public native NSDictionary<NSString, NSString> getUserLocation();
    @Property(selector = "userGender")
    public native String getUserGender();
    @Property(selector = "userLink")
    public native String getUserLink();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "claimsFromEncodedString:nonce:")
    protected static native @Pointer long create(String encodedClaims, String expectedNonce);
    /*</methods>*/
}
