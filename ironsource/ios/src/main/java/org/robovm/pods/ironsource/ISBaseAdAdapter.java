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
package org.robovm.pods.ironsource;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISBaseAdAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ISBaseAdAdapterProtocol/*</implements>*/ {

    /*<ptr>*/public static class ISBaseAdAdapterPtr extends Ptr<ISBaseAdAdapter, ISBaseAdAdapterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISBaseAdAdapter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISBaseAdAdapter() {}
    protected ISBaseAdAdapter(Handle h, long handle) { super(h, handle); }
    protected ISBaseAdAdapter(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdUnit:adapterConfig:")
    public ISBaseAdAdapter(ISAdUnit adUnit, ISAdapterConfig adapterConfig) { super((SkipInit) null); initObject(init(adUnit, adapterConfig)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adUnit")
    public native ISAdUnit getAdUnit();
    @Property(selector = "setAdUnit:")
    public native void setAdUnit(ISAdUnit v);
    @Property(selector = "adapterConfig")
    public native ISAdapterConfig getAdapterConfig();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdUnit:adapterConfig:")
    protected native @Pointer long init(ISAdUnit adUnit, ISAdapterConfig adapterConfig);
    @Method(selector = "getNetworkAdapter")
    public native ISAdapterBaseProtocol getNetworkAdapter();
    @Method(selector = "releaseMemory")
    public native void releaseMemory();
    @Method(selector = "loadAdWithAdData:delegate:")
    public native void loadAd(ISAdData adData, ISAdapterAdDelegate delegate);
    /*</methods>*/
}
