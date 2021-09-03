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
package org.robovm.pods.unityads;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UADSInAppPurchaseMetaData/*</name>*/ 
    extends /*<extends>*/UADSMetaData/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UADSInAppPurchaseMetaDataPtr extends Ptr<UADSInAppPurchaseMetaData, UADSInAppPurchaseMetaDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UADSInAppPurchaseMetaData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UADSInAppPurchaseMetaData() {}
    protected UADSInAppPurchaseMetaData(Handle h, long handle) { super(h, handle); }
    protected UADSInAppPurchaseMetaData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCategory:")
    public UADSInAppPurchaseMetaData(String category) { super(category); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setProductId:")
    public native void setProductId(String productId);
    @Method(selector = "setPrice:")
    public native void setPrice(NSNumber price);
    @Method(selector = "setCurrency:")
    public native void setCurrency(String currency);
    @Method(selector = "setReceiptPurchaseData:")
    public native void setReceiptPurchaseData(String receiptPurchaseData);
    @Method(selector = "setSignature:")
    public native void setSignature(String signature);
    /*</methods>*/
}
