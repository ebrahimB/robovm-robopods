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
package org.robovm.pods.branchmetrics;

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
import org.robovm.apple.corespotlight.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NSErrorExtensions/*</name>*/ 
    extends /*<extends>*/NSExtensions/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSErrorExtensions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    private NSErrorExtensions() {}
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "bncErrorDomain")
    protected static native String getClassDomain(ObjCClass clazz);
    public static String getClassDomain() { return getClassDomain(ObjCClass.getByType(NSError.class)); }
    @Method(selector = "branchErrorWithCode:")
    protected static native NSError createBranchError(ObjCClass clazz, BNCErrorCode errorCode);
    public static NSError createBranchError(BNCErrorCode errorCode) { return createBranchError(ObjCClass.getByType(NSError.class), errorCode); }
    @Method(selector = "branchErrorWithCode:error:")
    protected static native NSError createBranchError(ObjCClass clazz, BNCErrorCode errorCode, NSError error);
    public static NSError createBranchError(BNCErrorCode errorCode, NSError error) { return createBranchError(ObjCClass.getByType(NSError.class), errorCode, error); }
    @Method(selector = "branchErrorWithCode:localizedMessage:")
    protected static native NSError createBranchError(ObjCClass clazz, BNCErrorCode errorCode, String message);
    public static NSError createBranchError(BNCErrorCode errorCode, String message) { return createBranchError(ObjCClass.getByType(NSError.class), errorCode, message); }
    /*</methods>*/
}
