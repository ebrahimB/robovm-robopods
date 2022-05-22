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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBAEMAdvertiserMultiEntryRule/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBAEMAdvertiserRuleMatching, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class FBAEMAdvertiserMultiEntryRulePtr extends Ptr<FBAEMAdvertiserMultiEntryRule, FBAEMAdvertiserMultiEntryRulePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBAEMAdvertiserMultiEntryRule.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBAEMAdvertiserMultiEntryRule() {}
    protected FBAEMAdvertiserMultiEntryRule(Handle h, long handle) { super(h, handle); }
    protected FBAEMAdvertiserMultiEntryRule(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithOperator:rules:")
    public FBAEMAdvertiserMultiEntryRule(FBAEMAdvertiserRuleOperator operator_, NSArray<?> rules) { super((SkipInit) null); initObject(init(operator_, rules)); }
    @Method(selector = "initWithCoder:")
    public FBAEMAdvertiserMultiEntryRule(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithOperator:rules:")
    protected native @Pointer long init(FBAEMAdvertiserRuleOperator operator_, NSArray<?> rules);
    @Method(selector = "isMatchedEventParameters:")
    public native boolean isMatchedEventParameters(NSDictionary<NSString, ?> eventParams);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</methods>*/
}
