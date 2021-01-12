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
package org.robovm.pods.applovinsdk;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALAdType/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALAdTypePtr extends Ptr<ALAdType, ALAdTypePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALAdType.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ALAdType() {}
    protected ALAdType(Handle h, long handle) { super(h, handle); }
    protected ALAdType(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "regular")
    public static native ALAdType getRegular();
    @Property(selector = "incentivized")
    public static native ALAdType getIncentivized();
    @Property(selector = "autoIncentivized")
    public static native ALAdType getAutoIncentivized();
    /**
     * @deprecated Retrieval of underlying string is deprecated and will be removed in a future SDK version.
     */
    @Deprecated
    @Property(selector = "label")
    public native String getLabel();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Deprecated
    @Method(selector = "typeNative")
    public static native ALAdType typeNative();
    /**
     * @deprecated Retrieval of all types is deprecated and will be removed in a future SDK version.
     */
    @Deprecated
    @Method(selector = "allTypes")
    public static native NSArray<?> allTypes();
    /**
     * @deprecated Class method `typeRegular` is deprecated and will be removed in a future SDK version. Please use ALAdType.regular instead.
     */
    @Deprecated
    @Method(selector = "typeRegular")
    public static native ALAdType typeRegular();
    /**
     * @deprecated Class method `typeIncentivized` is deprecated and will be removed in a future SDK version. Please use ALAdType.incentivized instead.
     */
    @Deprecated
    @Method(selector = "typeIncentivized")
    public static native ALAdType typeIncentivized();
    /*</methods>*/
}
