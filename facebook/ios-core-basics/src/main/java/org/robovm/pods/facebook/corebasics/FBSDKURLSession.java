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
package org.robovm.pods.facebook.corebasics;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKURLSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKURLSessionPtr extends Ptr<FBSDKURLSession, FBSDKURLSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKURLSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKURLSession() {}
    protected FBSDKURLSession(Handle h, long handle) { super(h, handle); }
    protected FBSDKURLSession(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDelegate:delegateQueue:")
    public FBSDKURLSession(NSURLSessionDataDelegate delegate, NSOperationQueue delegateQueue) { super((SkipInit) null); initObject(init(delegate, delegateQueue)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "session")
    public native NSURLSession getSession();
    @Property(selector = "setSession:")
    public native void setSession(NSURLSession v);
    @Property(selector = "delegate")
    public native NSURLSessionDataDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(NSURLSessionDataDelegate v);
    @Property(selector = "delegateQueue")
    public native NSOperationQueue getDelegateQueue();
    @Property(selector = "setDelegateQueue:")
    public native void setDelegateQueue(NSOperationQueue v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDelegate:delegateQueue:")
    protected native @Pointer long init(NSURLSessionDataDelegate delegate, NSOperationQueue delegateQueue);
    @Method(selector = "executeURLRequest:completionHandler:")
    public native void executeURLRequest(NSURLRequest request, @Block VoidBlock3<NSData, NSURLResponse, NSError> handler);
    @Method(selector = "updateSessionWithBlock:")
    public native void updateSession(@Block Runnable block);
    @Method(selector = "invalidateAndCancel")
    public native void invalidateAndCancel();
    @Method(selector = "valid")
    public native boolean valid();
    /*</methods>*/
}
