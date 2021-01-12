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
package org.robovm.pods.appcenter.core;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/MSACFlags/*</name>*/ extends Bits</*<name>*/MSACFlags/*</name>*/> {
    /*<values>*/
    public static final MSACFlags None = new MSACFlags(0L);
    public static final MSACFlags Normal = new MSACFlags(1L);
    public static final MSACFlags Critical = new MSACFlags(2L);
    /**
     * @deprecated please use MSACFlagsNormal
     */
    @Deprecated
    public static final MSACFlags PersistenceNormal = new MSACFlags(1L);
    /**
     * @deprecated please use MSACFlagsCritical
     */
    @Deprecated
    public static final MSACFlags PersistenceCritical = new MSACFlags(2L);
    public static final MSACFlags Default = new MSACFlags(1L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MSACFlags/*</name>*/[] values = _values(/*<name>*/MSACFlags/*</name>*/.class);

    public /*<name>*/MSACFlags/*</name>*/(long value) { super(value); }
    private /*<name>*/MSACFlags/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MSACFlags/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MSACFlags/*</name>*/(value, mask);
    }
    protected /*<name>*/MSACFlags/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MSACFlags/*</name>*/[] values() {
        return values.clone();
    }
}
