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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBAEMInvocation/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class FBAEMInvocationPtr extends Ptr<FBAEMInvocation, FBAEMInvocationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBAEMInvocation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBAEMInvocation() {}
    protected FBAEMInvocation(Handle h, long handle) { super(h, handle); }
    protected FBAEMInvocation(SkipInit skipInit) { super(skipInit); }
    public FBAEMInvocation(NSDictionary<?, ?> applinkData) { super((Handle) null, create(applinkData)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public FBAEMInvocation(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "campaignID")
    public native String getCampaignID();
    @Property(selector = "ACSToken")
    public native String getACSToken();
    @Property(selector = "ACSSharedSecret")
    public native String getACSSharedSecret();
    @Property(selector = "ACSConfigID")
    public native String getACSConfigID();
    @Property(selector = "businessID")
    public native String getBusinessID();
    @Property(selector = "catalogID")
    public native String getCatalogID();
    @Property(selector = "isTestMode")
    public native boolean isTestMode();
    @Property(selector = "hasSKAN")
    public native boolean hasSKAN();
    @Property(selector = "isConversionFilteringEligible")
    public native boolean isConversionFilteringEligible();
    @Property(selector = "timestamp")
    public native NSDate getTimestamp();
    @Property(selector = "configMode")
    public native String getConfigMode();
    @Property(selector = "configID")
    public native @MachineSizedSInt long getConfigID();
    @Property(selector = "recordedEvents")
    public native NSMutableSet<NSString> getRecordedEvents();
    @Property(selector = "recordedValues")
    public native NSMutableDictionary<?, ?> getRecordedValues();
    @Property(selector = "conversionValue")
    public native @MachineSizedSInt long getConversionValue();
    @Property(selector = "priority")
    public native @MachineSizedSInt long getPriority();
    @Property(selector = "conversionTimestamp")
    public native NSDate getConversionTimestamp();
    @Property(selector = "isAggregated")
    public native boolean isAggregated();
    @Property(selector = "setIsAggregated:")
    public native void setIsAggregated(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "attributeEvent:currency:value:parameters:configs:shouldUpdateCache:")
    public native boolean attributeEvent(String event, String currency, NSNumber value, NSDictionary<NSString, ?> parameters, NSDictionary<?, ?> configs, boolean shouldUpdateCache);
    @Method(selector = "updateConversionValueWithConfigs:event:shouldBoostPriority:")
    public native boolean updateConversionValue(NSDictionary<?, ?> configs, String event, boolean shouldBoostPriority);
    @Method(selector = "isOptimizedEvent:configs:")
    public native boolean isOptimizedEvent(String event, NSDictionary<?, ?> configs);
    @Method(selector = "isOutOfWindowWithConfigs:")
    public native boolean isOutOfWindow(NSDictionary<?, ?> configs);
    @Method(selector = "getHMAC:")
    public native String getHMAC(@MachineSizedSInt long delay);
    @Method(selector = "invocationWithAppLinkData:")
    protected static native @Pointer long create(NSDictionary<?, ?> applinkData);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
