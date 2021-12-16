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
package org.robovm.pods.facebook.core;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.webkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedUIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/FBSDKFeature/*</name>*/ implements ValuedEnum {
    /*<values>*/
    None(0L),
    Core(16777216L),
    AppEvents(16842752L),
    CodelessEvents(16843008L),
    RestrictiveDataFiltering(16843264L),
    AAM(16843520L),
    PrivacyProtection(16843776L),
    SuggestedEvents(16843777L),
    IntelligentIntegrity(16843778L),
    ModelRequest(16843779L),
    EventDeactivation(16844032L),
    SKAdNetwork(16844288L),
    SKAdNetworkConversionValue(16844289L),
    ATELogging(16844544L),
    AEM(16844800L),
    AEMCatalogReport(16844801L),
    Instrument(16908288L),
    CrashReport(16908544L),
    CrashShield(16908545L),
    ErrorReport(16908800L),
    Login(33554432L),
    Share(50331648L),
    GamingServices(67108864L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/FBSDKFeature/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/FBSDKFeature/*</name>*/ valueOf(long n) {
        for (/*<name>*/FBSDKFeature/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/FBSDKFeature/*</name>*/.class.getName());
    }
}
