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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/KVAProduct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements KVAAsForContextObjectProtocol, KVAFromObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class KVAProductPtr extends Ptr<KVAProduct, KVAProductPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(KVAProduct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public KVAProduct() {}
    protected KVAProduct(Handle h, long handle) { super(h, handle); }
    protected KVAProduct(SkipInit skipInit) { super(skipInit); }
    public KVAProduct(String apiVersionString, String buildDateString, String bundleIdentifierString, String bundleTypeString, NSArray<NSString> compilerFlagNameStringArray, NSDictionary<?, ?> compilerFlagPredicateSubstitutionVariablesDictionary, String moduleNameString, String nameString, String organizationNameString, String reverseDomainNameString, String versionString) { super((Handle) null, create(apiVersionString, buildDateString, bundleIdentifierString, bundleTypeString, compilerFlagNameStringArray, compilerFlagPredicateSubstitutionVariablesDictionary, moduleNameString, nameString, organizationNameString, reverseDomainNameString, versionString)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "apiVersionString")
    public native String getApiVersionString();
    @Property(selector = "buildDateString")
    public native String getBuildDateString();
    @Property(selector = "bundleIdentifierString")
    public native String getBundleIdentifierString();
    @Property(selector = "bundleTypeString")
    public native String getBundleTypeString();
    @Property(selector = "compilerFlagNameStringArray")
    public native NSArray<NSString> getCompilerFlagNameStringArray();
    @Property(selector = "compilerFlagPredicateSubstitutionVariablesDictionary")
    public native NSDictionary<?, ?> getCompilerFlagPredicateSubstitutionVariablesDictionary();
    @Property(selector = "logLevel")
    public native KVALogLevel getLogLevel();
    @Property(selector = "setLogLevel:")
    public native void setLogLevel(KVALogLevel v);
    @Property(selector = "moduleNameString")
    public native String getModuleNameString();
    @Property(selector = "nameString")
    public native String getNameString();
    @Property(selector = "nameWithVersionString")
    public native String getNameWithVersionString();
    @Property(selector = "standardVersionInfoString")
    public native String getStandardVersionInfoString();
    @Property(selector = "organizationNameString")
    public native String getOrganizationNameString();
    @Property(selector = "reverseDomainNameString")
    public native String getReverseDomainNameString();
    @Property(selector = "versionString")
    public native String getVersionString();
    @Property(selector = "wrapperProduct")
    public native KVAProduct getWrapperProduct();
    @Property(selector = "setWrapperProduct:")
    public native void setWrapperProduct(KVAProduct v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "register")
    public native void register();
    @Method(selector = "resetWithDeleteLocalDataBool:")
    public native void reset(boolean deleteLocalDataBool);
    @Method(selector = "resetWithDeleteLocalDataBool:completionClosure:")
    public native void reset(boolean deleteLocalDataBool, @Block Runnable completionClosure);
    @Method(selector = "shutdownWithDeleteLocalDataBool:")
    public native void shutdown(boolean deleteLocalDataBool);
    @Method(selector = "shutdownWithDeleteLocalDataBool:completionClosure:")
    public native void shutdown(boolean deleteLocalDataBool, @Block Runnable completionClosure);
    @Method(selector = "productWithAPIVersionString:buildDateString:bundleIdentifierString:bundleTypeString:compilerFlagNameStringArray:compilerFlagPredicateSubstitutionVariablesDictionary:moduleNameString:nameString:organizationNameString:reverseDomainNameString:versionString:")
    protected static native @Pointer long create(String apiVersionString, String buildDateString, String bundleIdentifierString, String bundleTypeString, NSArray<NSString> compilerFlagNameStringArray, NSDictionary<?, ?> compilerFlagPredicateSubstitutionVariablesDictionary, String moduleNameString, String nameString, String organizationNameString, String reverseDomainNameString, String versionString);
    @Method(selector = "kva_asForContextObjectWithContext:")
    public native NSObject kvaConvertForContext(KVAContext context);
    @Method(selector = "kva_fromObject:")
    public static native KVAProduct createFromObject(NSObject object);
    /*</methods>*/
}
