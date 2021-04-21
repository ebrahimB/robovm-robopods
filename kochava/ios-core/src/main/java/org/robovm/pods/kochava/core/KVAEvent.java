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
package org.robovm.pods.kochava.core;

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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/KVAEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements KVAAsForContextObjectProtocol, KVAFromObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class KVAEventPtr extends Ptr<KVAEvent, KVAEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(KVAEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public KVAEvent() {}
    protected KVAEvent(Handle h, long handle) { super(h, handle); }
    protected KVAEvent(SkipInit skipInit) { super(skipInit); }
    public KVAEvent(KVAEventType eventType) { super((Handle) null, create(eventType)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "actionString")
    public native String getActionString();
    @Property(selector = "setActionString:")
    public native void setActionString(String v);
    @Property(selector = "adCampaignIdString")
    public native String getAdCampaignIdString();
    @Property(selector = "setAdCampaignIdString:")
    public native void setAdCampaignIdString(String v);
    @Property(selector = "adCampaignNameString")
    public native String getAdCampaignNameString();
    @Property(selector = "setAdCampaignNameString:")
    public native void setAdCampaignNameString(String v);
    @Property(selector = "adDeviceTypeString")
    public native String getAdDeviceTypeString();
    @Property(selector = "setAdDeviceTypeString:")
    public native void setAdDeviceTypeString(String v);
    @Property(selector = "adGroupIdString")
    public native String getAdGroupIdString();
    @Property(selector = "setAdGroupIdString:")
    public native void setAdGroupIdString(String v);
    @Property(selector = "adGroupNameString")
    public native String getAdGroupNameString();
    @Property(selector = "setAdGroupNameString:")
    public native void setAdGroupNameString(String v);
    @Property(selector = "adMediationNameString")
    public native String getAdMediationNameString();
    @Property(selector = "setAdMediationNameString:")
    public native void setAdMediationNameString(String v);
    @Property(selector = "adNetworkNameString")
    public native String getAdNetworkNameString();
    @Property(selector = "setAdNetworkNameString:")
    public native void setAdNetworkNameString(String v);
    @Property(selector = "adPlacementString")
    public native String getAdPlacementString();
    @Property(selector = "setAdPlacementString:")
    public native void setAdPlacementString(String v);
    @Property(selector = "adSizeString")
    public native String getAdSizeString();
    @Property(selector = "setAdSizeString:")
    public native void setAdSizeString(String v);
    @Property(selector = "adTypeString")
    public native String getAdTypeString();
    @Property(selector = "setAdTypeString:")
    public native void setAdTypeString(String v);
    @Property(selector = "appleWatchBool")
    public native boolean isAppleWatchBool();
    @Property(selector = "setAppleWatchBool:")
    public native void setAppleWatchBool(boolean v);
    @Property(selector = "appleWatchIdString")
    public native String getAppleWatchIdString();
    @Property(selector = "setAppleWatchIdString:")
    public native void setAppleWatchIdString(String v);
    @Property(selector = "appStoreReceiptBase64EncodedString")
    public native String getAppStoreReceiptBase64EncodedString();
    @Property(selector = "setAppStoreReceiptBase64EncodedString:")
    public native void setAppStoreReceiptBase64EncodedString(String v);
    @Property(selector = "backgroundBoolNumber")
    public native NSNumber getBackgroundBoolNumber();
    @Property(selector = "setBackgroundBoolNumber:")
    public native void setBackgroundBoolNumber(NSNumber v);
    @Property(selector = "checkoutAsGuestString")
    public native String getCheckoutAsGuestString();
    @Property(selector = "setCheckoutAsGuestString:")
    public native void setCheckoutAsGuestString(String v);
    @Property(selector = "completedBoolNumber")
    public native NSNumber getCompletedBoolNumber();
    @Property(selector = "setCompletedBoolNumber:")
    public native void setCompletedBoolNumber(NSNumber v);
    @Property(selector = "consent")
    public native KVAConsent getConsent();
    @Property(selector = "setConsent:")
    public native void setConsent(KVAConsent v);
    @Property(selector = "contentIdString")
    public native String getContentIdString();
    @Property(selector = "setContentIdString:")
    public native void setContentIdString(String v);
    @Property(selector = "contentTypeString")
    public native String getContentTypeString();
    @Property(selector = "setContentTypeString:")
    public native void setContentTypeString(String v);
    @Property(selector = "currencyString")
    public native String getCurrencyString();
    @Property(selector = "setCurrencyString:")
    public native void setCurrencyString(String v);
    @Property(selector = "customEventNameString")
    public native String getCustomEventNameString();
    @Property(selector = "setCustomEventNameString:")
    public native void setCustomEventNameString(String v);
    @Property(selector = "date")
    public native NSDate getDate();
    @Property(selector = "setDate:")
    public native void setDate(NSDate v);
    @Property(selector = "dateString")
    public native String getDateString();
    @Property(selector = "setDateString:")
    public native void setDateString(String v);
    @Property(selector = "descriptionString")
    public native String getDescriptionString();
    @Property(selector = "setDescriptionString:")
    public native void setDescriptionString(String v);
    @Property(selector = "destinationString")
    public native String getDestinationString();
    @Property(selector = "setDestinationString:")
    public native void setDestinationString(String v);
    @Property(selector = "durationTimeIntervalNumber")
    public native NSNumber getDurationTimeIntervalNumber();
    @Property(selector = "setDurationTimeIntervalNumber:")
    public native void setDurationTimeIntervalNumber(NSNumber v);
    @Property(selector = "endDate")
    public native NSDate getEndDate();
    @Property(selector = "setEndDate:")
    public native void setEndDate(NSDate v);
    @Property(selector = "endDateString")
    public native String getEndDateString();
    @Property(selector = "setEndDateString:")
    public native void setEndDateString(String v);
    @Property(selector = "eventType")
    public native KVAEventType getEventType();
    @Property(selector = "infoDictionary")
    public native NSDictionary<?, ?> getInfoDictionary();
    @Property(selector = "setInfoDictionary:")
    public native void setInfoDictionary(NSDictionary<?, ?> v);
    @Property(selector = "infoString")
    public native String getInfoString();
    @Property(selector = "setInfoString:")
    public native void setInfoString(String v);
    @Property(selector = "itemAddedFromString")
    public native String getItemAddedFromString();
    @Property(selector = "setItemAddedFromString:")
    public native void setItemAddedFromString(String v);
    @Property(selector = "levelString")
    public native String getLevelString();
    @Property(selector = "setLevelString:")
    public native void setLevelString(String v);
    @Property(selector = "maxRatingValueDoubleNumber")
    public native NSNumber getMaxRatingValueDoubleNumber();
    @Property(selector = "setMaxRatingValueDoubleNumber:")
    public native void setMaxRatingValueDoubleNumber(NSNumber v);
    @Property(selector = "nameString")
    public native String getNameString();
    @Property(selector = "setNameString:")
    public native void setNameString(String v);
    @Property(selector = "orderIdString")
    public native String getOrderIdString();
    @Property(selector = "setOrderIdString:")
    public native void setOrderIdString(String v);
    @Property(selector = "originString")
    public native String getOriginString();
    @Property(selector = "setOriginString:")
    public native void setOriginString(String v);
    @Property(selector = "payloadDictionary")
    public native NSDictionary<?, ?> getPayloadDictionary();
    @Property(selector = "setPayloadDictionary:")
    public native void setPayloadDictionary(NSDictionary<?, ?> v);
    @Property(selector = "priceDecimalNumber")
    public native NSDecimalNumber getPriceDecimalNumber();
    @Property(selector = "setPriceDecimalNumber:")
    public native void setPriceDecimalNumber(NSDecimalNumber v);
    @Property(selector = "priceDoubleNumber")
    public native NSNumber getPriceDoubleNumber();
    @Property(selector = "setPriceDoubleNumber:")
    public native void setPriceDoubleNumber(NSNumber v);
    @Property(selector = "quantityDoubleNumber")
    public native NSNumber getQuantityDoubleNumber();
    @Property(selector = "setQuantityDoubleNumber:")
    public native void setQuantityDoubleNumber(NSNumber v);
    @Property(selector = "ratingValueDoubleNumber")
    public native NSNumber getRatingValueDoubleNumber();
    @Property(selector = "setRatingValueDoubleNumber:")
    public native void setRatingValueDoubleNumber(NSNumber v);
    @Property(selector = "receiptIdString")
    public native String getReceiptIdString();
    @Property(selector = "setReceiptIdString:")
    public native void setReceiptIdString(String v);
    @Property(selector = "referralFromString")
    public native String getReferralFromString();
    @Property(selector = "setReferralFromString:")
    public native void setReferralFromString(String v);
    @Property(selector = "registrationMethodString")
    public native String getRegistrationMethodString();
    @Property(selector = "setRegistrationMethodString:")
    public native void setRegistrationMethodString(String v);
    @Property(selector = "resultsString")
    public native String getResultsString();
    @Property(selector = "setResultsString:")
    public native void setResultsString(String v);
    @Property(selector = "scoreString")
    public native String getScoreString();
    @Property(selector = "setScoreString:")
    public native void setScoreString(String v);
    @Property(selector = "searchTermString")
    public native String getSearchTermString();
    @Property(selector = "setSearchTermString:")
    public native void setSearchTermString(String v);
    @Property(selector = "serviceLocallyBool")
    public native boolean isServiceLocallyBool();
    @Property(selector = "setServiceLocallyBool:")
    public native void setServiceLocallyBool(boolean v);
    @Property(selector = "sourceString")
    public native String getSourceString();
    @Property(selector = "setSourceString:")
    public native void setSourceString(String v);
    @Property(selector = "spatialXDoubleNumber")
    public native NSNumber getSpatialXDoubleNumber();
    @Property(selector = "setSpatialXDoubleNumber:")
    public native void setSpatialXDoubleNumber(NSNumber v);
    @Property(selector = "spatialYDoubleNumber")
    public native NSNumber getSpatialYDoubleNumber();
    @Property(selector = "setSpatialYDoubleNumber:")
    public native void setSpatialYDoubleNumber(NSNumber v);
    @Property(selector = "spatialZDoubleNumber")
    public native NSNumber getSpatialZDoubleNumber();
    @Property(selector = "setSpatialZDoubleNumber:")
    public native void setSpatialZDoubleNumber(NSNumber v);
    @Property(selector = "startDate")
    public native NSDate getStartDate();
    @Property(selector = "setStartDate:")
    public native void setStartDate(NSDate v);
    @Property(selector = "startDateString")
    public native String getStartDateString();
    @Property(selector = "setStartDateString:")
    public native void setStartDateString(String v);
    @Property(selector = "successString")
    public native String getSuccessString();
    @Property(selector = "setSuccessString:")
    public native void setSuccessString(String v);
    @Property(selector = "userIdString")
    public native String getUserIdString();
    @Property(selector = "setUserIdString:")
    public native void setUserIdString(String v);
    @Property(selector = "uriString")
    public native String getUriString();
    @Property(selector = "setUriString:")
    public native void setUriString(String v);
    @Property(selector = "userNameString")
    public native String getUserNameString();
    @Property(selector = "setUserNameString:")
    public native void setUserNameString(String v);
    @Property(selector = "validatedString")
    public native String getValidatedString();
    @Property(selector = "setValidatedString:")
    public native void setValidatedString(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "eventNameString")
    public native String eventNameString();
    @Method(selector = "send")
    public native void send();
    @Method(selector = "sendWithSenderArray:")
    public native void send(NSArray<?> senderArray);
    @Method(selector = "eventWithType:")
    protected static native @Pointer long create(KVAEventType eventType);
    @Method(selector = "kva_asForContextObjectWithContext:")
    public native NSObject kvaConvertForContext(KVAContext context);
    @Method(selector = "kva_fromObject:")
    public static native KVAEvent kva_fromObject(NSObject fromObject);
    /*</methods>*/
}
