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
package org.robovm.pods.kochava.adnetwork;

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
import org.robovm.pods.kochava.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/KVAAdNetwork/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements KVAAdNetworkProtocol/*</implements>*/ {

    /*<ptr>*/public static class KVAAdNetworkPtr extends Ptr<KVAAdNetwork, KVAAdNetworkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(KVAAdNetwork.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public KVAAdNetwork() {}
    protected KVAAdNetwork(Handle h, long handle) { super(h, handle); }
    protected KVAAdNetwork(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "didRegisterAppForAttributionBlock")
    public native @Block VoidBlock1<KVAAdNetwork> getDidRegisterAppForAttributionBlock();
    @Property(selector = "setDidRegisterAppForAttributionBlock:")
    public native void setDidRegisterAppForAttributionBlock(@Block VoidBlock1<KVAAdNetwork> v);
    @Property(selector = "conversion")
    public native KVAAdNetworkConversion getConversion();
    @Property(selector = "setConversion:")
    public native void setConversion(KVAAdNetworkConversion v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="KochavaAdNetworkVersionNumber", optional=true)
    public static native double getVersionNumber();
    @GlobalValue(symbol="KochavaAdNetworkVersionString", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String getVersionString();
    
    @Method(selector = "kva_asForContextObjectWithContext:")
    public native NSObject kvaConvertForContext(KVAContext context);
    @Method(selector = "kva_configureWith:context:")
    public native void kvaConfigure(NSObject object, KVAContext context);
    @Method(selector = "kva_fromObject:")
    public static native KVAAdNetwork createFromObject(NSObject object);
    /*</methods>*/
}
