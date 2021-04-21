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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/KVAPartner/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements KVAAsForContextObjectProtocol, KVAConfigureWithObjectProtocol, KVAFromObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class KVAPartnerPtr extends Ptr<KVAPartner, KVAPartnerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(KVAPartner.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public KVAPartner() {}
    protected KVAPartner(Handle h, long handle) { super(h, handle); }
    protected KVAPartner(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "descriptionString")
    public native String getDescriptionString();
    @Property(selector = "nameString")
    public native String getNameString();
    @Property(selector = "responseBoolNumber")
    public native NSNumber getResponseBoolNumber();
    @Property(selector = "responseDate")
    public native NSDate getResponseDate();
    @Property(selector = "shouldPromptDueToBeingNewBool")
    public native boolean shouldPromptDueToBeingNewBool();
    @Property(selector = "setShouldPromptDueToBeingNewBool:")
    public native void setShouldPromptDueToBeingNewBool(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "didGrantDate")
    public native NSDate didGrantDate();
    @Method(selector = "didPromptWithDidGrantBoolNumber:date:")
    public native void didPrompt(NSNumber didGrantBoolNumber, NSDate date);
    @Method(selector = "isEffectivelyReferringToTheSamePartner:")
    public native boolean isEffectivelyReferringToTheSamePartner(KVAPartner anotherPartner);
    @Method(selector = "isGrantedBool")
    public native boolean isGrantedBool();
    @Method(selector = "isGrantedBoolNumber")
    public native NSNumber isGrantedBoolNumber();
    @Method(selector = "isGrantedDate")
    public native NSDate isGrantedDate();
    @Method(selector = "shouldBeIncludedInPromptBool")
    public native boolean shouldBeIncludedInPromptBool();
    @Method(selector = "shouldPromptBool")
    public native boolean shouldPromptBool();
    @Method(selector = "willPrompt")
    public native void willPrompt();
    @Method(selector = "kva_asForContextObjectWithContext:")
    public native NSObject kvaConvertForContext(KVAContext context);
    @Method(selector = "kva_configureWith:context:")
    public native void kvaConfigure(NSObject withObject, KVAContext context);
    @Method(selector = "kva_fromObject:")
    public static native KVAPartner kva_fromObject(NSObject fromObject);
    /*</methods>*/
}
