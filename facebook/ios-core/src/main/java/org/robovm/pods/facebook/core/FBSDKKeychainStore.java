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
package org.robovm.pods.facebook.core;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKKeychainStore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKKeychainStoreProtocol/*</implements>*/ {

    /*<ptr>*/public static class FBSDKKeychainStorePtr extends Ptr<FBSDKKeychainStore, FBSDKKeychainStorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKKeychainStore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKKeychainStore() {}
    protected FBSDKKeychainStore(Handle h, long handle) { super(h, handle); }
    protected FBSDKKeychainStore(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithService:accessGroup:")
    public FBSDKKeychainStore(String service, String accessGroup) { super((SkipInit) null); initObject(init(service, accessGroup)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "service")
    public native String getService();
    @Property(selector = "accessGroup")
    public native String getAccessGroup();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithService:accessGroup:")
    protected native @Pointer long init(String service, String accessGroup);
    @Method(selector = "setData:forKey:accessibility:")
    public native boolean setData(NSData value, String key, VoidPtr accessibility);
    @Method(selector = "dataForKey:")
    public native NSData dataForKey(String key);
    @Method(selector = "queryForKey:")
    public native NSMutableDictionary<NSString, ?> queryForKey(String key);
    @Method(selector = "stringForKey:")
    public native String stringForKey(String key);
    @Method(selector = "dictionaryForKey:")
    public native NSDictionary<NSString, ?> dictionaryForKey(String key);
    @Method(selector = "setString:forKey:accessibility:")
    public native boolean setString(String value, String key, VoidPtr accessibility);
    @Method(selector = "setDictionary:forKey:accessibility:")
    public native boolean setDictionary(NSDictionary<NSString, ?> value, String key, VoidPtr accessibility);
    /*</methods>*/
}
