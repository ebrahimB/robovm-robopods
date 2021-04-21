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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/GTMSessionFetcherServiceProtocol/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "callbackQueue")
    DispatchQueue getCallbackQueue();
    @Property(selector = "setCallbackQueue:")
    void setCallbackQueue(DispatchQueue v);
    @Property(selector = "reuseSession")
    boolean isReuseSession();
    @Property(selector = "setReuseSession:")
    void setReuseSession(boolean v);
    @Property(selector = "delegateQueue")
    NSOperationQueue getDelegateQueue();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "fetcherShouldBeginFetching:")
    boolean fetcherShouldBeginFetching(GTMSessionFetcher fetcher);
    @Method(selector = "fetcherDidCreateSession:")
    void fetcherDidCreateSession(GTMSessionFetcher fetcher);
    @Method(selector = "fetcherDidBeginFetching:")
    void fetcherDidBeginFetching(GTMSessionFetcher fetcher);
    @Method(selector = "fetcherDidStop:")
    void fetcherDidStop(GTMSessionFetcher fetcher);
    @Method(selector = "fetcherWithRequest:")
    GTMSessionFetcher getFetcher(NSURLRequest request);
    @Method(selector = "isDelayingFetcher:")
    boolean isDelayingFetcher(GTMSessionFetcher fetcher);
    @Method(selector = "session")
    NSURLSession session();
    @Method(selector = "sessionForFetcherCreation")
    NSURLSession sessionForFetcherCreation();
    @Method(selector = "sessionDelegate")
    NSURLSessionDelegate sessionDelegate();
    @Method(selector = "stoppedAllFetchersDate")
    NSDate stoppedAllFetchersDate();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
