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
package org.robovm.pods.facebook.core;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.webkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAppEventParameterProduct/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(FBSDKAppEventParameterProduct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FBSDKAppEventParameterProductCategory", optional=true)
    public static native NSString Category();
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel0", optional=true)
    public static native NSString CustomLabel0();
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel1", optional=true)
    public static native NSString CustomLabel1();
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel2", optional=true)
    public static native NSString CustomLabel2();
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel3", optional=true)
    public static native NSString CustomLabel3();
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel4", optional=true)
    public static native NSString CustomLabel4();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIOSUrl", optional=true)
    public static native NSString AppLinkIOSUrl();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIOSAppStoreID", optional=true)
    public static native NSString AppLinkIOSAppStoreID();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIOSAppName", optional=true)
    public static native NSString AppLinkIOSAppName();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPhoneUrl", optional=true)
    public static native NSString AppLinkIPhoneUrl();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPhoneAppStoreID", optional=true)
    public static native NSString AppLinkIPhoneAppStoreID();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPhoneAppName", optional=true)
    public static native NSString AppLinkIPhoneAppName();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPadUrl", optional=true)
    public static native NSString AppLinkIPadUrl();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPadAppStoreID", optional=true)
    public static native NSString AppLinkIPadAppStoreID();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPadAppName", optional=true)
    public static native NSString AppLinkIPadAppName();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkAndroidUrl", optional=true)
    public static native NSString AppLinkAndroidUrl();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkAndroidPackage", optional=true)
    public static native NSString AppLinkAndroidPackage();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkAndroidAppName", optional=true)
    public static native NSString AppLinkAndroidAppName();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkWindowsPhoneUrl", optional=true)
    public static native NSString AppLinkWindowsPhoneUrl();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkWindowsPhoneAppID", optional=true)
    public static native NSString AppLinkWindowsPhoneAppID();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkWindowsPhoneAppName", optional=true)
    public static native NSString AppLinkWindowsPhoneAppName();
    /*</methods>*/
}
