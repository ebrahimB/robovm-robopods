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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UMONItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UMONItemPtr extends Ptr<UMONItem, UMONItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UMONItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UMONItem() {}
    protected UMONItem(Handle h, long handle) { super(h, handle); }
    protected UMONItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBuilder:")
    public UMONItem(UMONItemBuilder builder) { super((SkipInit) null); initObject(init(builder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "productId")
    public native String getProductId();
    @Property(selector = "quantity")
    public native double getQuantity();
    @Property(selector = "type")
    public native String getType();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBuilder:")
    protected native @Pointer long init(UMONItemBuilder builder);
    @Method(selector = "build:")
    public static native UMONItem build(@Block VoidBlock1<UMONItemBuilder> buildBlock);
    /*</methods>*/
}
