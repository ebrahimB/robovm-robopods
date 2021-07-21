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
package org.robovm.pods.firebase.googlesignin;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GIDConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class GIDConfigurationPtr extends Ptr<GIDConfiguration, GIDConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GIDConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GIDConfiguration() {}
    protected GIDConfiguration(Handle h, long handle) { super(h, handle); }
    protected GIDConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithClientID:")
    public GIDConfiguration(String clientID) { super((SkipInit) null); initObject(init(clientID)); }
    @Method(selector = "initWithClientID:serverClientID:")
    public GIDConfiguration(String clientID, String serverClientID) { super((SkipInit) null); initObject(init(clientID, serverClientID)); }
    @Method(selector = "initWithClientID:serverClientID:hostedDomain:openIDRealm:")
    public GIDConfiguration(String clientID, String serverClientID, String hostedDomain, String openIDRealm) { super((SkipInit) null); initObject(init(clientID, serverClientID, hostedDomain, openIDRealm)); }
    @Method(selector = "initWithCoder:")
    public GIDConfiguration(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "clientID")
    public native String getClientID();
    @Property(selector = "serverClientID")
    public native String getServerClientID();
    @Property(selector = "hostedDomain")
    public native String getHostedDomain();
    @Property(selector = "openIDRealm")
    public native String getOpenIDRealm();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithClientID:")
    protected native @Pointer long init(String clientID);
    @Method(selector = "initWithClientID:serverClientID:")
    protected native @Pointer long init(String clientID, String serverClientID);
    @Method(selector = "initWithClientID:serverClientID:hostedDomain:openIDRealm:")
    protected native @Pointer long init(String clientID, String serverClientID, String hostedDomain, String openIDRealm);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
