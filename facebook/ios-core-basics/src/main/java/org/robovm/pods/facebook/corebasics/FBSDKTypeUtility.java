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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKTypeUtility/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKTypeUtilityPtr extends Ptr<FBSDKTypeUtility, FBSDKTypeUtilityPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKTypeUtility.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKTypeUtility() {}
    protected FBSDKTypeUtility(Handle h, long handle) { super(h, handle); }
    protected FBSDKTypeUtility(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "arrayValue:")
    public static native NSArray<?> arrayValue(NSObject object);
    @Method(selector = "array:objectAtIndex:")
    public static native NSObject getObject(NSArray<?> array, @MachineSizedUInt long index);
    @Method(selector = "array:addObject:")
    public static native void addObject(NSMutableArray<?> array, NSObject object);
    @Method(selector = "boolValue:")
    public static native boolean boolValue(NSObject object);
    @Method(selector = "dictionaryValue:")
    public static native NSDictionary<NSString, ?> dictionaryValue(NSObject object);
    @Method(selector = "dictionary:objectForKey:ofType:")
    public static native NSObject getObject(NSDictionary<NSString, ?> dictionary, String key, Class<?> type);
    @Method(selector = "dictionary:setObject:forKey:")
    public static native void setObject(NSMutableDictionary<?, ?> dictionary, NSObject object, NSObject key);
    @Method(selector = "dictionary:enumerateKeysAndObjectsUsingBlock:")
    public static native void enumerateKeysAndObjects(NSDictionary<NSString, ?> dictionary, @Block VoidBlock3<NSObject, NSObject, BooleanPtr> block);
    @Method(selector = "integerValue:")
    public static native @MachineSizedSInt long integerValue(NSObject object);
    @Method(selector = "doubleValue:")
    public static native double doubleValue(NSObject object);
    @Method(selector = "numberValue:")
    public static native NSNumber numberValue(NSObject object);
    @Method(selector = "stringValueOrNil:")
    public static native String stringValueOrNil(NSObject object);
    @Method(selector = "objectValue:")
    public static native NSObject objectValue(NSObject object);
    @Method(selector = "coercedToStringValue:")
    public static native String coercedToStringValue(NSObject object);
    @Method(selector = "timeIntervalValue:")
    public static native double timeIntervalValue(NSObject object);
    @Method(selector = "unsignedIntegerValue:")
    public static native @MachineSizedUInt long unsignedIntegerValue(NSObject object);
    @Method(selector = "coercedToURLValue:")
    public static native NSURL coercedToURLValue(NSObject object);
    public static NSData getDataFromJSONObject(NSObject obj, NSJSONWritingOptions opt) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = getDataFromJSONObject(obj, opt, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "dataWithJSONObject:options:error:")
    private static native NSData getDataFromJSONObject(NSObject obj, NSJSONWritingOptions opt, NSError.NSErrorPtr error);
    public static NSObject getJSONObjectFromData(NSData data, NSJSONReadingOptions opt) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSObject result = getJSONObjectFromData(data, opt, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "JSONObjectWithData:options:error:")
    private static native NSObject getJSONObjectFromData(NSData data, NSJSONReadingOptions opt, NSError.NSErrorPtr error);
    /*</methods>*/
}
