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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSRequestBadgeCount/*</name>*/ 
    extends /*<extends>*/OneSignalRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSRequestBadgeCountPtr extends Ptr<OSRequestBadgeCount, OSRequestBadgeCountPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSRequestBadgeCount.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSRequestBadgeCount() {}
    protected OSRequestBadgeCount(Handle h, long handle) { super(h, handle); }
    protected OSRequestBadgeCount(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "withUserId:appId:badgeCount:emailAuthToken:externalIdAuthToken:")
    public static native OSRequestBadgeCount createWithEmailAuth(String userId, String appId, NSNumber badgeCount, String emailAuthHash, String externalIdAuthToken);
    @Method(selector = "withUserId:appId:badgeCount:smsAuthToken:externalIdAuthToken:")
    public static native OSRequestBadgeCount createWithSmsAuth(String userId, String appId, NSNumber badgeCount, String smsAuthToken, String externalIdAuthToken);
    /*</methods>*/
}
