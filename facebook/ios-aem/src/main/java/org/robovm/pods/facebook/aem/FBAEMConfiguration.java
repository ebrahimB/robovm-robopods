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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBAEMConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class FBAEMConfigurationPtr extends Ptr<FBAEMConfiguration, FBAEMConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBAEMConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBAEMConfiguration() {}
    protected FBAEMConfiguration(Handle h, long handle) { super(h, handle); }
    protected FBAEMConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithJSON:")
    public FBAEMConfiguration(NSDictionary<NSString, ?> dict) { super((SkipInit) null); initObject(init(dict)); }
    @Method(selector = "initWithCoder:")
    public FBAEMConfiguration(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "cutoffTime")
    public native @MachineSizedSInt long getCutoffTime();
    @Property(selector = "validFrom")
    public native @MachineSizedSInt long getValidFrom();
    @Property(selector = "defaultCurrency")
    public native String getDefaultCurrency();
    @Property(selector = "configMode")
    public native String getConfigMode();
    @Property(selector = "businessID")
    public native String getBusinessID();
    @Property(selector = "matchingRule")
    public native FBAEMAdvertiserRuleMatching getMatchingRule();
    @Property(selector = "conversionValueRules")
    public native NSArray<FBAEMRule> getConversionValueRules();
    @Property(selector = "eventSet")
    public native NSSet<NSString> getEventSet();
    @Property(selector = "currencySet")
    public native NSSet<NSString> getCurrencySet();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithJSON:")
    protected native @Pointer long init(NSDictionary<NSString, ?> dict);
    @Method(selector = "isSameValidFrom:businessID:")
    public native boolean isSame(@MachineSizedSInt long validFrom, String businessID);
    @Method(selector = "isSameBusinessID:")
    public native boolean isSameBusinessID(String businessID);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "ruleProvider")
    public static native FBAEMAdvertiserRuleProviding ruleProvider();
    @Method(selector = "configureWithRuleProvider:")
    public static native void configureWithRuleProvider$(FBAEMAdvertiserRuleProviding ruleProvider);
    @Method(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</methods>*/
}
