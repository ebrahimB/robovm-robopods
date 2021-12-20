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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/KVALog/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class KVALogPtr extends Ptr<KVALog, KVALogPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(KVALog.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public KVALog() {}
    protected KVALog(Handle h, long handle) { super(h, handle); }
    protected KVALog(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shared")
    public static native KVALog getShared();
    @Property(selector = "level")
    public native KVALogLevel getLevel();
    @Property(selector = "setLevel:")
    public native void setLevel(KVALogLevel v);
    @Property(selector = "osLogEnabledBool")
    public native boolean isOsLogEnabledBool();
    @Property(selector = "setOsLogEnabledBool:")
    public native void setOsLogEnabledBool(boolean v);
    @Property(selector = "prettyPrintBool")
    public native boolean isPrettyPrintBool();
    @Property(selector = "setPrettyPrintBool:")
    public native void setPrettyPrintBool(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
