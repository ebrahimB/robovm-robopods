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
package org.robovm.pods.firebase.googlesignin;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GIDSignIn/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GIDSignInPtr extends Ptr<GIDSignIn, GIDSignInPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GIDSignIn.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GIDSignIn() {}
    protected GIDSignIn(Handle h, long handle) { super(h, handle); }
    protected GIDSignIn(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedInstance")
    public static native GIDSignIn getSharedInstance();
    @Property(selector = "currentUser")
    public native GIDGoogleUser getCurrentUser();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "handleURL:")
    public native boolean handleURL(NSURL url);
    @Method(selector = "hasPreviousSignIn")
    public native boolean hasPreviousSignIn();
    @Method(selector = "restorePreviousSignInWithCallback:")
    public native void restorePreviousSignIn(@Block VoidBlock2<GIDGoogleUser, NSError> callback);
    @Method(selector = "signInWithConfiguration:presentingViewController:callback:")
    public native void signIn(GIDConfiguration configuration, UIViewController presentingViewController, @Block VoidBlock2<GIDGoogleUser, NSError> callback);
    @Method(selector = "signInWithConfiguration:presentingViewController:hint:callback:")
    public native void signIn(GIDConfiguration configuration, UIViewController presentingViewController, String hint, @Block VoidBlock2<GIDGoogleUser, NSError> callback);
    @Method(selector = "signInWithConfiguration:presentingViewController:hint:additionalScopes:callback:")
    public native void signIn(GIDConfiguration configuration, UIViewController presentingViewController, String hint, NSArray<NSString> additionalScopes, @Block VoidBlock2<GIDGoogleUser, NSError> callback);
    @Method(selector = "addScopes:presentingViewController:callback:")
    public native void addScopes(NSArray<NSString> scopes, UIViewController presentingViewController, @Block VoidBlock2<GIDGoogleUser, NSError> callback);
    @Method(selector = "signOut")
    public native void signOut();
    @Method(selector = "disconnectWithCallback:")
    public native void disconnect(@Block VoidBlock1<NSError> callback);
    /*</methods>*/
}
