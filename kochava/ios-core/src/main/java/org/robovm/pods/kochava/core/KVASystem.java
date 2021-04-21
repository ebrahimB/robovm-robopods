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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/KVASystem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class KVASystemPtr extends Ptr<KVASystem, KVASystemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(KVASystem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public KVASystem() {}
    protected KVASystem(Handle h, long handle) { super(h, handle); }
    protected KVASystem(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shared")
    public static native KVASystem getShared();
    @Property(selector = "messagesAppViewControllerDidBecomeActiveSourceString")
    public static native String getMessagesAppViewControllerDidBecomeActiveSourceString();
    @Property(selector = "messagesAppViewControllerDidResignActiveSourceString")
    public static native String getMessagesAppViewControllerDidResignActiveSourceString();
    @Property(selector = "appClipBool")
    public native boolean isAppClipBool();
    @Property(selector = "setAppClipBool:")
    public native void setAppClipBool(boolean v);
    @Property(selector = "appExtensionBool")
    public native boolean isAppExtensionBool();
    @Property(selector = "stateActiveBool")
    public native boolean isStateActiveBool();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="KochavaCoreVersionNumber", optional=true)
    public static native double getVersionNumber();
    @GlobalValue(symbol="KochavaCoreVersionString", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String getVersionString();
    
    @Method(selector = "stateActiveDidBecome")
    public native void stateActiveDidBecome();
    @Method(selector = "stateActiveDidBecomeWithSourceString:")
    public native void stateActiveDidBecome(String sourceString);
    @Method(selector = "stateActiveWillResign")
    public native void stateActiveWillResign();
    @Method(selector = "stateActiveWillResignWithSourceString:")
    public native void stateActiveWillResign(String sourceString);
    /*</methods>*/
}
