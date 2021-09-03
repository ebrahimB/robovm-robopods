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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UPURProductBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UPURProductBuilderPtr extends Ptr<UPURProductBuilder, UPURProductBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UPURProductBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UPURProductBuilder() {}
    protected UPURProductBuilder(Handle h, long handle) { super(h, handle); }
    protected UPURProductBuilder(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "productId")
    public native String getProductId();
    @Property(selector = "setProductId:")
    public native void setProductId(String v);
    @Property(selector = "localizedPriceString")
    public native String getLocalizedPriceString();
    @Property(selector = "setLocalizedPriceString:")
    public native void setLocalizedPriceString(String v);
    @Property(selector = "localizedTitle")
    public native String getLocalizedTitle();
    @Property(selector = "setLocalizedTitle:")
    public native void setLocalizedTitle(String v);
    @Property(selector = "isoCurrencyCode")
    public native String getIsoCurrencyCode();
    @Property(selector = "setIsoCurrencyCode:")
    public native void setIsoCurrencyCode(String v);
    @Property(selector = "localizedPrice")
    public native NSDecimalNumber getLocalizedPrice();
    @Property(selector = "setLocalizedPrice:")
    public native void setLocalizedPrice(NSDecimalNumber v);
    @Property(selector = "localizedDescription")
    public native String getLocalizedDescription();
    @Property(selector = "setLocalizedDescription:")
    public native void setLocalizedDescription(String v);
    @Property(selector = "productType")
    public native String getProductType();
    @Property(selector = "setProductType:")
    public native void setProductType(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
