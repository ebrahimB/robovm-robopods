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
package org.robovm.pods.facebook.aem;

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
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/FBAEMAdvertiserRuleOperator/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Unknown(0L),
    And(1L),
    Or(2L),
    Not(3L),
    Contains(4L),
    NotContains(5L),
    StartsWith(6L),
    CaseInsensitiveContains(7L),
    CaseInsensitiveNotContains(8L),
    CaseInsensitiveStartsWith(9L),
    RegexMatch(10L),
    Equal(11L),
    NotEqual(12L),
    LessThan(13L),
    LessThanOrEqual(14L),
    GreaterThan(15L),
    GreaterThanOrEqual(16L),
    CaseInsensitiveIsAny(17L),
    CaseInsensitiveIsNotAny(18L),
    IsAny(19L),
    IsNotAny(20L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/FBAEMAdvertiserRuleOperator/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/FBAEMAdvertiserRuleOperator/*</name>*/ valueOf(long n) {
        for (/*<name>*/FBAEMAdvertiserRuleOperator/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/FBAEMAdvertiserRuleOperator/*</name>*/.class.getName());
    }
}
