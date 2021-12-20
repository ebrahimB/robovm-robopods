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
package org.robovm.pods.kochava.tracker;

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
import org.robovm.pods.kochava.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/KVAPushNotificationsToken/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements KVAAsForContextObjectProtocol, KVAFromObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class KVAPushNotificationsTokenPtr extends Ptr<KVAPushNotificationsToken, KVAPushNotificationsTokenPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(KVAPushNotificationsToken.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public KVAPushNotificationsToken() {}
    protected KVAPushNotificationsToken(Handle h, long handle) { super(h, handle); }
    protected KVAPushNotificationsToken(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "data")
    public native NSData getData();
    @Property(selector = "providedDate")
    public native NSDate getProvidedDate();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "registerWithData:")
    public static native void register(NSData deviceTokenData);
    @Method(selector = "registerWithDataHexString:")
    public static native void register(String deviceTokenDataHexString);
    @Method(selector = "registerWithData:registrarArray:")
    public static native void register(NSData tokenData, NSArray<?> registrarArray);
    @Method(selector = "registerWithDataHexString:registrarArray:")
    public static native void register(String deviceTokenDataHexString, NSArray<?> registrarArray);
    @Method(selector = "kva_asForContextObjectWithContext:")
    public native NSObject kvaConvertForContext(KVAContext context);
    @Method(selector = "kva_fromObject:")
    public static native KVAPushNotificationsToken createFromObject(NSObject object);
    /*</methods>*/
}
