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
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADCustomEventRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADCustomEventRequestPtr extends Ptr<GADCustomEventRequest, GADCustomEventRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADCustomEventRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADCustomEventRequest() {}
    protected GADCustomEventRequest(Handle h, long handle) { super(h, handle); }
    protected GADCustomEventRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "userKeywords")
    public native NSArray<?> getUserKeywords();
    @Property(selector = "additionalParameters")
    public native NSDictionary<?, ?> getAdditionalParameters();
    @Property(selector = "isTesting")
    public native boolean isTesting();
    /**
     * @deprecated Deprecated and unsupported. Always NO.
     */
    @Deprecated
    @Property(selector = "userHasLocation")
    public native boolean isUserHasLocation();
    /**
     * @deprecated Deprecated and unsupported. Always 0.
     */
    @Deprecated
    @Property(selector = "userLatitude")
    public native @MachineSizedFloat double getUserLatitude();
    /**
     * @deprecated Deprecated and unsupported. Always 0.
     */
    @Deprecated
    @Property(selector = "userLongitude")
    public native @MachineSizedFloat double getUserLongitude();
    /**
     * @deprecated Deprecated and unsupported. Always 0.
     */
    @Deprecated
    @Property(selector = "userLocationAccuracyInMeters")
    public native @MachineSizedFloat double getUserLocationAccuracyInMeters();
    /**
     * @deprecated Deprecated and unsupported. Always nil.
     */
    @Deprecated
    @Property(selector = "userLocationDescription")
    public native String getUserLocationDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
