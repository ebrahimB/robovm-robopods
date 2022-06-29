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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTMSessionFetcherServiceProtocolAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GTMSessionFetcherServiceProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("callbackQueue")
    public DispatchQueue getCallbackQueue() { return null; }
    @NotImplemented("setCallbackQueue:")
    public void setCallbackQueue(DispatchQueue v) {}
    @NotImplemented("reuseSession")
    public boolean isReuseSession() { return false; }
    @NotImplemented("setReuseSession:")
    public void setReuseSession(boolean v) {}
    @NotImplemented("delegateQueue")
    public NSOperationQueue getDelegateQueue() { return null; }
    @NotImplemented("decorators")
    public NSArray<?> getDecorators() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("fetcherShouldBeginFetching:")
    public boolean fetcherShouldBeginFetching(GTMSessionFetcher fetcher) { return false; }
    @NotImplemented("fetcherDidCreateSession:")
    public void fetcherDidCreateSession(GTMSessionFetcher fetcher) {}
    @NotImplemented("fetcherDidBeginFetching:")
    public void fetcherDidBeginFetching(GTMSessionFetcher fetcher) {}
    @NotImplemented("fetcherDidStop:")
    public void fetcherDidStop(GTMSessionFetcher fetcher) {}
    @NotImplemented("fetcherWithRequest:")
    public GTMSessionFetcher getFetcher(NSURLRequest request) { return null; }
    @NotImplemented("isDelayingFetcher:")
    public boolean isDelayingFetcher(GTMSessionFetcher fetcher) { return false; }
    @NotImplemented("session")
    public NSURLSession session() { return null; }
    @NotImplemented("sessionForFetcherCreation")
    public NSURLSession sessionForFetcherCreation() { return null; }
    @NotImplemented("sessionDelegate")
    public NSURLSessionDelegate sessionDelegate() { return null; }
    @NotImplemented("stoppedAllFetchersDate")
    public NSDate stoppedAllFetchersDate() { return null; }
    /*</methods>*/
}
