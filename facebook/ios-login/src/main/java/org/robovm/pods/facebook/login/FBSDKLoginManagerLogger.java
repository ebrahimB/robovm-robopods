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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKLoginManagerLogger/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKLoginManagerLoggerPtr extends Ptr<FBSDKLoginManagerLogger, FBSDKLoginManagerLoggerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKLoginManagerLogger.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKLoginManagerLogger() {}
    protected FBSDKLoginManagerLogger(Handle h, long handle) { super(h, handle); }
    protected FBSDKLoginManagerLogger(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithParameters:tracking:")
    public FBSDKLoginManagerLogger(NSDictionary<NSString, ?> parameters, FBSDKLoginTracking tracking) { super((SkipInit) null); initObject(init(parameters, tracking)); }
    @Method(selector = "initWithLoggingToken:tracking:")
    public FBSDKLoginManagerLogger(String loggingToken, FBSDKLoginTracking tracking) { super((SkipInit) null); initObject(init(loggingToken, tracking)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithParameters:tracking:")
    protected native @Pointer long init(NSDictionary<NSString, ?> parameters, FBSDKLoginTracking tracking);
    @Method(selector = "initWithLoggingToken:tracking:")
    protected native @Pointer long init(String loggingToken, FBSDKLoginTracking tracking);
    @Method(selector = "startSessionForLoginManager:")
    public native void startSessionForLoginManager(FBSDKLoginManager loginManager);
    @Method(selector = "endSession")
    public native void endSession();
    @Method(selector = "startAuthMethod:")
    public native void startAuthMethod(String authMethod);
    @Method(selector = "endLoginWithResult:error:")
    public native void endLogin(FBSDKLoginManagerLoginResult result, NSError error);
    @Method(selector = "postLoginHeartbeat")
    public native void postLoginHeartbeat();
    @Method(selector = "willAttemptAppSwitchingBehaviorWithUrlScheme:")
    public native void willAttemptAppSwitchingBehavior(String urlScheme);
    @Method(selector = "clientStateForAuthMethod:andExistingState:logger:")
    public static native String getClientState(String authMethod, NSDictionary<NSString, ?> existingState, FBSDKLoginManagerLogger logger);
    /*</methods>*/
}
