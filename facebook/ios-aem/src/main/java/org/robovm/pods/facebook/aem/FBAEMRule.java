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
package org.robovm.pods.facebook.aem;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBAEMRule/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class FBAEMRulePtr extends Ptr<FBAEMRule, FBAEMRulePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBAEMRule.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBAEMRule() {}
    protected FBAEMRule(Handle h, long handle) { super(h, handle); }
    protected FBAEMRule(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithJSON:")
    public FBAEMRule(NSDictionary<NSString, ?> dict) { super((SkipInit) null); initObject(init(dict)); }
    @Method(selector = "initWithCoder:")
    public FBAEMRule(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "conversionValue")
    public native @MachineSizedSInt long getConversionValue();
    @Property(selector = "priority")
    public native @MachineSizedSInt long getPriority();
    @Property(selector = "events")
    public native NSArray<FBAEMEvent> getEvents();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithJSON:")
    protected native @Pointer long init(NSDictionary<NSString, ?> dict);
    @Method(selector = "containsEvent:")
    public native boolean containsEvent(String event);
    @Method(selector = "isMatchedWithRecordedEvents:recordedValues:")
    public native boolean isMatched(NSSet<NSString> recordedEvents, NSDictionary<?, ?> recordedValues);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    @Method(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</methods>*/
}
