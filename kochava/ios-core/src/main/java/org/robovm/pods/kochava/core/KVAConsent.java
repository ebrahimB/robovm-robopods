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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/KVAConsent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements KVAAsForContextObjectProtocol, KVAConfigureWithObjectProtocol, KVAFromObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class KVAConsentPtr extends Ptr<KVAConsent, KVAConsentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(KVAConsent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public KVAConsent() {}
    protected KVAConsent(Handle h, long handle) { super(h, handle); }
    protected KVAConsent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "descriptionString")
    public native String getDescriptionString();
    @Property(selector = "didUpdateBlock")
    public native @Block VoidBlock1<KVAConsent> getDidUpdateBlock();
    @Property(selector = "setDidUpdateBlock:")
    public native void setDidUpdateBlock(@Block VoidBlock1<KVAConsent> v);
    @Property(selector = "intelligentManagementBool")
    public native boolean isIntelligentManagementBool();
    @Property(selector = "setIntelligentManagementBool:")
    public native void setIntelligentManagementBool(boolean v);
    @Property(selector = "manualManagedRequirementsBool")
    public native boolean isManualManagedRequirementsBool();
    @Property(selector = "setManualManagedRequirementsBool:")
    public native void setManualManagedRequirementsBool(boolean v);
    @Property(selector = "partnerArray")
    public native NSArray<KVAPartner> getPartnerArray();
    @Property(selector = "promptIdString")
    public native String getPromptIdString();
    @Property(selector = "requiredBool")
    public native boolean isRequiredBool();
    @Property(selector = "setRequiredBool:")
    public native void setRequiredBool(boolean v);
    @Property(selector = "requiredBoolNumber")
    public native NSNumber getRequiredBoolNumber();
    @Property(selector = "setRequiredBoolNumber:")
    public native void setRequiredBoolNumber(NSNumber v);
    @Property(selector = "responseDate")
    public native NSDate getResponseDate();
    @Property(selector = "responseBoolNumber")
    public native NSNumber getResponseBoolNumber();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "didPromptWithDidGrantBoolNumber:")
    public native void didPrompt(NSNumber didGrantBoolNumber);
    @Method(selector = "isGrantedBool")
    public native boolean isGrantedBool();
    @Method(selector = "isGrantedBoolNumber")
    public native NSNumber isGrantedBoolNumber();
    @Method(selector = "isGrantedDate")
    public native NSDate isGrantedDate();
    /**
     * @deprecated Deprecated in 4.2.0.  Please use mayCollectBool instead.
     */
    @Deprecated
    @Method(selector = "mayCalculateBool")
    public native boolean mayCalculateBool();
    @Method(selector = "mayCollectBool")
    public native boolean mayCollectBool();
    @Method(selector = "mayKeepBool")
    public native boolean mayKeepBool();
    @Method(selector = "mayPersistBool")
    public native boolean mayPersistBool();
    @Method(selector = "mayShareBool")
    public native boolean mayShareBool();
    @Method(selector = "shouldPromptBool")
    public native boolean shouldPromptBool();
    @Method(selector = "willPrompt")
    public native void willPrompt();
    @Method(selector = "kva_asForContextObjectWithContext:")
    public native NSObject kvaConvertForContext(KVAContext context);
    @Method(selector = "kva_configureWith:context:")
    public native void kvaConfigure(NSObject withObject, KVAContext context);
    @Method(selector = "kva_fromObject:")
    public static native KVAConsent kva_fromObject(NSObject fromObject);
    /*</methods>*/
}
