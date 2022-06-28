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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKBasicUtility/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKBasicUtilityPtr extends Ptr<FBSDKBasicUtility, FBSDKBasicUtilityPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKBasicUtility.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKBasicUtility() {}
    protected FBSDKBasicUtility(Handle h, long handle) { super(h, handle); }
    protected FBSDKBasicUtility(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="fb_dispatch_on_main_thread", optional=true)
    public static native void dispatchOnMainThread(@Block Runnable block);
    @Bridge(symbol="fb_dispatch_on_default_thread", optional=true)
    public static native void dispatchOnDefaultThread(@Block Runnable block);
    
    @Method(selector = "JSONStringForObject:error:invalidObjectHandler:")
    public static native String getJSONStringForObject(NSObject object, NSError.NSErrorPtr errorRef, @Block Block2<NSObject, BooleanPtr, NSObject> invalidObjectHandler);
    public static boolean setJSONStringForObject(NSMutableDictionary<?, ?> dictionary, NSObject object, NSObject key) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setJSONStringForObject(dictionary, object, key, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "dictionary:setJSONStringForObject:forKey:error:")
    private static native boolean setJSONStringForObject(NSMutableDictionary<?, ?> dictionary, NSObject object, NSObject key, NSError.NSErrorPtr errorRef);
    public static NSObject objectForJSONString(String string) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSObject result = objectForJSONString(string, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "objectForJSONString:error:")
    private static native NSObject objectForJSONString(String string, NSError.NSErrorPtr errorRef);
    @Method(selector = "queryStringWithDictionary:error:invalidObjectHandler:")
    public static native String queryString(NSDictionary<NSString, ?> dictionary, NSError.NSErrorPtr errorRef, @Block Block2<NSObject, BooleanPtr, NSObject> invalidObjectHandler);
    @Method(selector = "convertRequestValue:")
    public static native NSObject convertRequestValue(NSObject value);
    @Method(selector = "URLEncode:")
    public static native String URLEncode(String value);
    @Method(selector = "dictionaryWithQueryString:")
    public static native NSDictionary<NSString, NSString> dictionaryFromQueryString(String queryString);
    @Method(selector = "URLDecode:")
    public static native String URLDecode(String value);
    @Method(selector = "gzip:")
    public static native NSData gzip(NSData data);
    @Method(selector = "anonymousID")
    public static native String anonymousID();
    @Method(selector = "persistenceFilePath:")
    public static native String persistenceFilePath(String filename);
    @Method(selector = "SHA256Hash:")
    public static native String SHA256Hash(NSObject input);
    /*</methods>*/
}
