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
package org.robovm.pods.kochava.core;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/KVALogLevel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements KVAAsForContextObjectProtocol, KVAFromObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class KVALogLevelPtr extends Ptr<KVALogLevel, KVALogLevelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(KVALogLevel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public KVALogLevel() {}
    protected KVALogLevel(Handle h, long handle) { super(h, handle); }
    protected KVALogLevel(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "never")
    public static native KVALogLevel getNever();
    @Property(selector = "error")
    public static native KVALogLevel getError();
    @Property(selector = "warn")
    public static native KVALogLevel getWarn();
    @Property(selector = "info")
    public static native KVALogLevel getInfo();
    @Property(selector = "debug")
    public static native KVALogLevel getDebug();
    @Property(selector = "trace")
    public static native KVALogLevel getTrace();
    @Property(selector = "always")
    public static native KVALogLevel getAlways();
    @Property(selector = "nameString")
    public native String getNameString();
    @Property(selector = "setNameString:")
    public native void setNameString(String v);
    @Property(selector = "levelInt")
    public native @MachineSizedSInt long getLevelInt();
    @Property(selector = "setLevelInt:")
    public native void setLevelInt(@MachineSizedSInt long v);
    @Property(selector = "os_log_type")
    public native byte getOs_log_type();
    @Property(selector = "setOs_log_type:")
    public native void setOs_log_type(byte v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "logLevel:visibleBoolWithVisibleMaximumLogLevel:")
    public static native boolean isVisibleAtMaximumLogLevel(KVALogLevel logLevel, KVALogLevel visibleMaximumLogLevel);
    @Method(selector = "kva_asForContextObjectWithContext:")
    public native NSObject kvaConvertForContext(KVAContext context);
    @Method(selector = "kva_fromObject:")
    public static native KVALogLevel kva_fromObject(NSObject fromObject);
    /*</methods>*/
}
