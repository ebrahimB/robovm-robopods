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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALVariableService/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALVariableServicePtr extends Ptr<ALVariableService, ALVariableServicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALVariableService.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ALVariableService() {}
    protected ALVariableService(Handle h, long handle) { super(h, handle); }
    protected ALVariableService(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @deprecated This API has been deprecated. Please use our SDK's initialization callback to retrieve variables instead.
     */
    @Deprecated
    @Property(selector = "delegate")
    public native ALVariableServiceDelegate getDelegate();
    /**
     * @deprecated This API has been deprecated. Please use our SDK's initialization callback to retrieve variables instead.
     */
    @Deprecated
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(ALVariableServiceDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "boolForKey:")
    public native boolean boolForKey(String key);
    @Method(selector = "boolForKey:defaultValue:")
    public native boolean getBool(String key, boolean defaultValue);
    @Method(selector = "stringForKey:")
    public native String stringForKey(String key);
    @Method(selector = "stringForKey:defaultValue:")
    public native String getString(String key, String defaultValue);
    /**
     * @deprecated This API has been deprecated. Please use our SDK's initialization callback to retrieve variables instead.
     */
    @Deprecated
    @Method(selector = "loadVariables")
    public native void loadVariables();
    /*</methods>*/
}
