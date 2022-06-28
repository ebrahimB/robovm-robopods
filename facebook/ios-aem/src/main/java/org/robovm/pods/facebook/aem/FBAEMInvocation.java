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
    @Method(selector = "initWithAppLinkData:")
    public FBAEMInvocation(NSDictionary<?, ?> appLinkData) { super((SkipInit) null); initObject(init(appLinkData)); }
    @Method(selector = "initWithCoder:")
    public FBAEMInvocation(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "campaignID")
    public native String getCampaignID();
    @Property(selector = "acsToken")
    public native String getAcsToken();
    @Property(selector = "acsConfigurationID")
    public native String getAcsConfigurationID();
    @Property(selector = "businessID")
    public native String getBusinessID();
    @Property(selector = "catalogID")
    public native String getCatalogID();
    @Property(selector = "isTestMode")
    public native boolean isTestMode();
    @Property(selector = "hasStoreKitAdNetwork")
    public native boolean hasStoreKitAdNetwork();
    @Property(selector = "setHasStoreKitAdNetwork:")
    public native void setHasStoreKitAdNetwork(boolean v);
    @Property(selector = "isConversionFilteringEligible")
    public native boolean isConversionFilteringEligible();
    @Property(selector = "setIsConversionFilteringEligible:")
    public native void setIsConversionFilteringEligible(boolean v);
    @Property(selector = "configurationID")
    public native @MachineSizedSInt long getConfigurationID();
    @Property(selector = "conversionValue")
    public native @MachineSizedSInt long getConversionValue();
    @Property(selector = "isAggregated")
    public native boolean isAggregated();
    @Property(selector = "setIsAggregated:")
    public native void setIsAggregated(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAppLinkData:")
    protected native @Pointer long init(NSDictionary<?, ?> appLinkData);
    @Method(selector = "attributeEvent:currency:value:parameters:configurations:shouldUpdateCache:")
    public native boolean attributeEvent(String event, String potentialValueCurrency, NSNumber potentialValue, NSDictionary<NSString, ?> parameters, NSDictionary<?, ?> configurations, boolean shouldUpdateCache);
    @Method(selector = "updateConversionValueWithConfigurations:event:shouldBoostPriority:")
    public native boolean updateConversionValue(NSDictionary<?, ?> configurations, String event, boolean shouldBoostPriority);
    @Method(selector = "isOptimizedEvent:configurations:")
    public native boolean isOptimizedEvent(String event, NSDictionary<?, ?> configurations);
    @Method(selector = "isOutOfWindowWithConfigurations:")
    public native boolean isOutOfWindow(NSDictionary<?, ?> configurations);
    @Method(selector = "getHMACWithDelay:")
    public native String getHMAC(@MachineSizedSInt long delay);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</methods>*/
}
