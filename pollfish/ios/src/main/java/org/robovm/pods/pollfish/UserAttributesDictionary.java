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
package org.robovm.pods.pollfish;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UserAttributesDictionary/*</name>*/ 
    extends /*<extends>*/NSMutableDictionary/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UserAttributesDictionaryPtr extends Ptr<UserAttributesDictionary, UserAttributesDictionaryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UserAttributesDictionary.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UserAttributesDictionary() {}
    protected UserAttributesDictionary(Handle h, long handle) { super(h, handle); }
    protected UserAttributesDictionary(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithObjects:forKeys:count:")
    public UserAttributesDictionary(NSObject.NSObjectPtr objects, NSObject.NSObjectPtr keys, @MachineSizedUInt long count) { super((SkipInit) null); initObject(init(objects, keys, count)); }
    @Method(selector = "initWithCapacity:")
    public UserAttributesDictionary(@MachineSizedUInt long numItems) { super(numItems); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithObjects:forKeys:count:")
    protected native @Pointer long init(NSObject.NSObjectPtr objects, NSObject.NSObjectPtr keys, @MachineSizedUInt long count);
    @Method(selector = "setGender:")
    private native UserAttributesDictionary setGender0(NSString gender);
    @Method(selector = "setYearOfBirth:")
    private native UserAttributesDictionary setYearOfBirth0(NSString year_of_birth);
    @Method(selector = "setMaritalStatus:")
    private native UserAttributesDictionary setMaritalStatus0(NSString marital_status);
    @Method(selector = "setParentalStatus:")
    private native UserAttributesDictionary setParentalStatus0(NSString parental_status);
    @Method(selector = "setEducation:")
    private native UserAttributesDictionary setEducation0(NSString education_level);
    @Method(selector = "setEmployment:")
    private native UserAttributesDictionary setEmployment0(NSString employment_status);
    @Method(selector = "setCareer:")
    private native UserAttributesDictionary setCareer0(NSString career_status);
    @Method(selector = "setSpokenLanguage:")
    private native UserAttributesDictionary setSpokenLanguage0(NSString spoken_language);
    @Method(selector = "setOrganizationRole:")
    private native UserAttributesDictionary setOrganizationRole0(NSString organization_role);
    @Method(selector = "setNumberOfEmployees:")
    private native UserAttributesDictionary setNumberOfEmployees0(NSString number_of_employees);
    @Method(selector = "setRace:")
    private native UserAttributesDictionary setRace0(NSString race);
    @Method(selector = "setIncome:")
    private native UserAttributesDictionary setIncome0(NSString income);
    @Method(selector = "setCustomAttributeWithKey:andValue:")
    public native UserAttributesDictionary setCustomAttribute(String attr_key, String attr_value);
    /*</methods>*/
}
