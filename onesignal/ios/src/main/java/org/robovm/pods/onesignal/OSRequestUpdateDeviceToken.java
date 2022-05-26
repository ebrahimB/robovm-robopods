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
package org.robovm.pods.onesignal;

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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSRequestUpdateDeviceToken/*</name>*/ 
    extends /*<extends>*/OneSignalRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSRequestUpdateDeviceTokenPtr extends Ptr<OSRequestUpdateDeviceToken, OSRequestUpdateDeviceTokenPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSRequestUpdateDeviceToken.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSRequestUpdateDeviceToken() {}
    protected OSRequestUpdateDeviceToken(Handle h, long handle) { super(h, handle); }
    protected OSRequestUpdateDeviceToken(SkipInit skipInit) { super(skipInit); }
    public OSRequestUpdateDeviceToken(String userId, String appId, String identifier, NSNumber notificationTypes, String externalIdAuthToken) { super((Handle) null, create(userId, appId, identifier, notificationTypes, externalIdAuthToken)); retain(getHandle()); }
    public OSRequestUpdateDeviceToken(String userId, String appId, String identifier, String parentId, String emailAuthHash, String email, String externalIdAuthToken) { super((Handle) null, create(userId, appId, identifier, parentId, emailAuthHash, email, externalIdAuthToken)); retain(getHandle()); }
    public OSRequestUpdateDeviceToken(String userId, String appId, String identifier, String smsAuthToken, String externalIdAuthToken) { super((Handle) null, create(userId, appId, identifier, smsAuthToken, externalIdAuthToken)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "withUserId:appId:deviceToken:notificationTypes:externalIdAuthToken:")
    protected static native @Pointer long create(String userId, String appId, String identifier, NSNumber notificationTypes, String externalIdAuthToken);
    @Method(selector = "withUserId:appId:deviceToken:withParentId:emailAuthToken:email:externalIdAuthToken:")
    protected static native @Pointer long create(String userId, String appId, String identifier, String parentId, String emailAuthHash, String email, String externalIdAuthToken);
    @Method(selector = "withUserId:appId:deviceToken:smsAuthToken:externalIdAuthToken:")
    protected static native @Pointer long create(String userId, String appId, String identifier, String smsAuthToken, String externalIdAuthToken);
    /*</methods>*/
}
