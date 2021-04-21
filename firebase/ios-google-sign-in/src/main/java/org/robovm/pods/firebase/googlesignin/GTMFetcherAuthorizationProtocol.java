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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/GTMFetcherAuthorizationProtocol/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "userEmail")
    String getUserEmail();
    @Property(selector = "canAuthorize")
    boolean canAuthorize();
    @Property(selector = "shouldAuthorizeAllRequests")
    boolean shouldAuthorizeAllRequests();
    @Property(selector = "setShouldAuthorizeAllRequests:")
    void setShouldAuthorizeAllRequests(boolean v);
    @Property(selector = "fetcherService")
    GTMSessionFetcherServiceProtocol getFetcherService();
    @Property(selector = "setFetcherService:", strongRef = true)
    void setFetcherService(GTMSessionFetcherServiceProtocol v);
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "authorizeRequest:delegate:didFinishSelector:")
    void authorizeRequest(NSMutableURLRequest request, NSObject delegate, Selector sel);
    @Method(selector = "stopAuthorization")
    void stopAuthorization();
    @Method(selector = "stopAuthorizationForRequest:")
    void stopAuthorizationForRequest(NSURLRequest request);
    @Method(selector = "isAuthorizingRequest:")
    boolean isAuthorizingRequest(NSURLRequest request);
    @Method(selector = "isAuthorizedRequest:")
    boolean isAuthorizedRequest(NSURLRequest request);
    @Method(selector = "authorizeRequest:completionHandler:")
    void authorizeRequest(NSMutableURLRequest request, @Block VoidBlock1<NSError> handler);
    @Method(selector = "primeForRefresh")
    boolean primeForRefresh();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
