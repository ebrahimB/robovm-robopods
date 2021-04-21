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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTMFetcherAuthorizationProtocolAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GTMFetcherAuthorizationProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("userEmail")
    public String getUserEmail() { return null; }
    @NotImplemented("canAuthorize")
    public boolean canAuthorize() { return false; }
    @NotImplemented("shouldAuthorizeAllRequests")
    public boolean shouldAuthorizeAllRequests() { return false; }
    @NotImplemented("setShouldAuthorizeAllRequests:")
    public void setShouldAuthorizeAllRequests(boolean v) {}
    @NotImplemented("fetcherService")
    public GTMSessionFetcherServiceProtocol getFetcherService() { return null; }
    @NotImplemented("setFetcherService:")
    public void setFetcherService(GTMSessionFetcherServiceProtocol v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("authorizeRequest:delegate:didFinishSelector:")
    public void authorizeRequest(NSMutableURLRequest request, NSObject delegate, Selector sel) {}
    @NotImplemented("stopAuthorization")
    public void stopAuthorization() {}
    @NotImplemented("stopAuthorizationForRequest:")
    public void stopAuthorizationForRequest(NSURLRequest request) {}
    @NotImplemented("isAuthorizingRequest:")
    public boolean isAuthorizingRequest(NSURLRequest request) { return false; }
    @NotImplemented("isAuthorizedRequest:")
    public boolean isAuthorizedRequest(NSURLRequest request) { return false; }
    @NotImplemented("authorizeRequest:completionHandler:")
    public void authorizeRequest(NSMutableURLRequest request, @Block VoidBlock1<NSError> handler) {}
    @NotImplemented("primeForRefresh")
    public boolean primeForRefresh() { return false; }
    /*</methods>*/
}
