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
package org.robovm.pods.kochava.tracker;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/KVADeeplink/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements KVAAsForContextObjectProtocol, KVAFromObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class KVADeeplinkPtr extends Ptr<KVADeeplink, KVADeeplinkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(KVADeeplink.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public KVADeeplink() {}
    protected KVADeeplink(Handle h, long handle) { super(h, handle); }
    protected KVADeeplink(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "destinationString")
    public native String getDestinationString();
    @Property(selector = "rawDictionary")
    public native NSDictionary<?, ?> getRawDictionary();
    @Property(selector = "setRawDictionary:")
    public native void setRawDictionary(NSDictionary<?, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "processWithURL:completionHandler:")
    public static native void process(NSURL url, @Block VoidBlock1<KVADeeplink> completionHandler);
    @Method(selector = "processWithURL:timeoutTimeInterval:completionHandler:")
    public static native void process(NSURL url, double timeoutTimeInterval, @Block VoidBlock1<KVADeeplink> completionHandler);
    @Method(selector = "processWithURL:processor:completionHandler:")
    public static native void process(NSURL url, KVADeeplinksProcessorProvider processor, @Block VoidBlock1<KVADeeplink> completionHandler);
    @Method(selector = "processWithURL:timeoutTimeInterval:processor:completionHandler:")
    public static native void process(NSURL url, double timeoutTimeInterval, KVADeeplinksProcessorProvider processor, @Block VoidBlock1<KVADeeplink> completionHandler);
    @Method(selector = "kva_asForContextObjectWithContext:")
    public native NSObject kvaConvertForContext(KVAContext context);
    @Method(selector = "kva_fromObject:")
    public static native KVADeeplink kva_fromObject(NSObject fromObject);
    /*</methods>*/
}
