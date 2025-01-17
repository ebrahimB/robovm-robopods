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
package org.robovm.pods.adapty;

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
import org.robovm.apple.storekit.*;
import org.robovm.apple.iad.*;
import org.robovm.apple.apptrackingtransparency.*;
import org.robovm.apple.adsupport.*;
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/AdaptyErrorCode/*</name>*/ implements ValuedEnum {
    /*<values>*/
    None(-1L),
    Unknown(0L),
    ClientInvalid(1L),
    PaymentCancelled(2L),
    PaymentInvalid(3L),
    PaymentNotAllowed(4L),
    StoreProductNotAvailable(5L),
    CloudServicePermissionDenied(6L),
    CloudServiceNetworkConnectionFailed(7L),
    CloudServiceRevoked(8L),
    PrivacyAcknowledgementRequired(9L),
    UnauthorizedRequestData(10L),
    InvalidOfferIdentifier(11L),
    InvalidSignature(12L),
    MissingOfferParams(13L),
    InvalidOfferPrice(14L),
    NoProductIDsFound(1000L),
    NoProductsFound(1001L),
    ProductRequestFailed(1002L),
    CantMakePayments(1003L),
    NoPurchasesToRestore(1004L),
    CantReadReceipt(1005L),
    ProductPurchaseFailed(1006L),
    MissingOfferSigningParams(1007L),
    FallbackPaywallsNotRequired(1008L),
    EmptyResponse(2000L),
    EmptyData(2001L),
    AuthenticationError(2002L),
    BadRequest(2003L),
    ServerError(2004L),
    Failed(2005L),
    UnableToDecode(2006L),
    MissingParam(2007L),
    InvalidProperty(2008L),
    EncodingFailed(2009L),
    MissingURL(2010L),
    AnalyticsDisabled(3000L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/AdaptyErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/AdaptyErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/AdaptyErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/AdaptyErrorCode/*</name>*/.class.getName());
    }
}
