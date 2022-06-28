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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKURLSessionTask/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKURLSessionTaskPtr extends Ptr<FBSDKURLSessionTask, FBSDKURLSessionTaskPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKURLSessionTask.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKURLSessionTask() {}
    protected FBSDKURLSessionTask(Handle h, long handle) { super(h, handle); }
    protected FBSDKURLSessionTask(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRequest:fromSession:completionHandler:")
    public FBSDKURLSessionTask(NSURLRequest request, FBSDKSessionProviding session, @Block VoidBlock3<NSData, NSURLResponse, NSError> handler) { super((SkipInit) null); initObject(init(request, session, handler)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "task")
    public native FBSDKSessionDataTask getTask();
    @Property(selector = "setTask:")
    public native void setTask(FBSDKSessionDataTask v);
    @Property(selector = "state")
    public native NSURLSessionTaskState getState();
    @Property(selector = "requestStartDate")
    public native NSDate getRequestStartDate();
    @Property(selector = "handler")
    public native @Block VoidBlock3<NSData, NSURLResponse, NSError> getHandler();
    @Property(selector = "setHandler:")
    public native void setHandler(@Block VoidBlock3<NSData, NSURLResponse, NSError> v);
    @Property(selector = "requestStartTime")
    public native long getRequestStartTime();
    @Property(selector = "setRequestStartTime:")
    public native void setRequestStartTime(long v);
    @Property(selector = "loggerSerialNumber")
    public native @MachineSizedUInt long getLoggerSerialNumber();
    @Property(selector = "setLoggerSerialNumber:")
    public native void setLoggerSerialNumber(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRequest:fromSession:completionHandler:")
    protected native @Pointer long init(NSURLRequest request, FBSDKSessionProviding session, @Block VoidBlock3<NSData, NSURLResponse, NSError> handler);
    @Method(selector = "start")
    public native void start();
    @Method(selector = "cancel")
    public native void cancel();
    /*</methods>*/
}
