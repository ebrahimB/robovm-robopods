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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC11KochavaCore11KVALogLevel")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/KVALogLevel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements KVAFromObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class KVALogLevelPtr extends Ptr<KVALogLevel, KVALogLevelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(KVALogLevel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected KVALogLevel() {}
    protected KVALogLevel(Handle h, long handle) { super(h, handle); }
    protected KVALogLevel(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "nameString")
    public native String getNameString();
    @Property(selector = "setNameString:")
    public native void setNameString(String v);
    @Property(selector = "osLogType")
    public native int getOsLogType();
    @Property(selector = "setOsLogType:")
    public native void setOsLogType(int v);
    @Property(selector = "description")
    public native String getDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "kva_asForContextObjectWithContext:")
    public native NSObject kva_asForContextObjectWithContext(KVAContext context);
    @Method(selector = "never")
    public static native KVALogLevel never();
    @Method(selector = "error")
    public static native KVALogLevel error();
    @Method(selector = "warn")
    public static native KVALogLevel warn();
    @Method(selector = "info")
    public static native KVALogLevel info();
    @Method(selector = "debug")
    public static native KVALogLevel debug();
    @Method(selector = "trace")
    public static native KVALogLevel trace();
    @Method(selector = "always")
    public static native KVALogLevel always();
    @Method(selector = "dictionary")
    public static native NSDictionary<NSString, KVALogLevel> dictionary();
    @Method(selector = "kva_fromObject:")
    public static native KVALogLevel kva_fromObject(NSObject fromObject);
    @Method(selector = "logLevel:visibleBoolWithVisibleMaximumLogLevel:")
    public static native boolean isVisibleAtMaximumLogLevel(KVALogLevel logLevel, KVALogLevel visibleMaximumLogLevel);
    /*</methods>*/
}
