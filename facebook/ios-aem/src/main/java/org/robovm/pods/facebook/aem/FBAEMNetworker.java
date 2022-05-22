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
package org.robovm.pods.facebook.aem;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBAEMNetworker/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBAEMNetworking, NSURLSessionDataDelegate/*</implements>*/ {

    /*<ptr>*/public static class FBAEMNetworkerPtr extends Ptr<FBAEMNetworker, FBAEMNetworkerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBAEMNetworker.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBAEMNetworker() {}
    protected FBAEMNetworker(Handle h, long handle) { super(h, handle); }
    protected FBAEMNetworker(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "userAgentSuffix")
    public native String getUserAgentSuffix();
    @Property(selector = "setUserAgentSuffix:")
    public native void setUserAgentSuffix(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "startGraphRequestWithGraphPath:parameters:tokenString:HTTPMethod:completion:")
    public native void startGraphRequest(String graphPath, NSDictionary<NSString, ?> parameters, String tokenString, String method, @Block VoidBlock2<NSObject, NSError> completion);
    @Method(selector = "URLSession:dataTask:didReceiveResponse:completionHandler:")
    public native void didReceiveResponse(NSURLSession session, NSURLSessionDataTask dataTask, NSURLResponse response, @Block VoidBlock1<NSURLSessionResponseDisposition> completionHandler);
    @Method(selector = "URLSession:dataTask:didBecomeDownloadTask:")
    public native void didBecomeDownloadTask(NSURLSession session, NSURLSessionDataTask dataTask, NSURLSessionDownloadTask downloadTask);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "URLSession:dataTask:didBecomeStreamTask:")
    public native void didBecomeStreamTask(NSURLSession session, NSURLSessionDataTask dataTask, NSURLSessionStreamTask streamTask);
    @Method(selector = "URLSession:dataTask:didReceiveData:")
    public native void didReceiveData(NSURLSession session, NSURLSessionDataTask dataTask, NSData data);
    @Method(selector = "URLSession:dataTask:willCacheResponse:completionHandler:")
    public native void willCacheResponse(NSURLSession session, NSURLSessionDataTask dataTask, NSCachedURLResponse proposedResponse, @Block VoidBlock1<NSCachedURLResponse> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "URLSession:task:willBeginDelayedRequest:completionHandler:")
    public native void willBeginDelayedRequest(NSURLSession session, NSURLSessionTask task, NSURLRequest request, @Block VoidBlock2<NSURLSessionDelayedRequestDisposition, NSURLRequest> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "URLSession:taskIsWaitingForConnectivity:")
    public native void taskIsWaitingForConnectivity(NSURLSession session, NSURLSessionTask task);
    @Method(selector = "URLSession:task:willPerformHTTPRedirection:newRequest:completionHandler:")
    public native void willPerformHTTPRedirection(NSURLSession session, NSURLSessionTask task, NSHTTPURLResponse response, NSURLRequest request, @Block VoidBlock1<NSURLRequest> completionHandler);
    @Method(selector = "URLSession:task:didReceiveChallenge:completionHandler:")
    public native void didReceiveChallenge(NSURLSession session, NSURLSessionTask task, NSURLAuthenticationChallenge challenge, @Block VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential> completionHandler);
    @Method(selector = "URLSession:task:needNewBodyStream:")
    public native void needNewBodyStream(NSURLSession session, NSURLSessionTask task, @Block VoidBlock1<NSInputStream> completionHandler);
    @Method(selector = "URLSession:task:didSendBodyData:totalBytesSent:totalBytesExpectedToSend:")
    public native void didSendBodyData(NSURLSession session, NSURLSessionTask task, long bytesSent, long totalBytesSent, long totalBytesExpectedToSend);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "URLSession:task:didFinishCollectingMetrics:")
    public native void didFinishCollectingMetrics(NSURLSession session, NSURLSessionTask task, NSURLSessionTaskMetrics metrics);
    @Method(selector = "URLSession:task:didCompleteWithError:")
    public native void didComplete(NSURLSession session, NSURLSessionTask task, NSError error);
    @Method(selector = "URLSession:didBecomeInvalidWithError:")
    public native void didBecomeInvalid(NSURLSession session, NSError error);
    @Method(selector = "URLSession:didReceiveChallenge:completionHandler:")
    public native void didReceiveChallenge(NSURLSession session, NSURLAuthenticationChallenge challenge, @Block VoidBlock2<NSURLSessionAuthChallengeDisposition, NSURLCredential> completionHandler);
    @Method(selector = "URLSessionDidFinishEventsForBackgroundURLSession:")
    public native void didFinishEvents(NSURLSession session);
    /*</methods>*/
}
