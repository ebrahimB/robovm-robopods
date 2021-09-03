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
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library(Library.INTERNAL)/*</annotations>*/
public enum /*<name>*/UPURStore/*</name>*/ implements ValuedEnum {
    /*<values>*/
    NotSpecified(0L),
    GooglePlay(1L),
    AmazonAppStore(2L),
    CloudMoolah(3L),
    SamsungApps(4L),
    XiaomiMiPay(5L),
    MacAppStore(6L),
    AppleAppStore(7L),
    WinRT(8L),
    TizenStore(9L),
    FacebookStore(10L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(UPURStore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    @Bridge(symbol="NSStringFromUPURAppStore", optional=true)
    public native String toString();
    /*</methods>*/

    private final long n;

    private /*<name>*/UPURStore/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/UPURStore/*</name>*/ valueOf(long n) {
        for (/*<name>*/UPURStore/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/UPURStore/*</name>*/.class.getName());
    }
}
