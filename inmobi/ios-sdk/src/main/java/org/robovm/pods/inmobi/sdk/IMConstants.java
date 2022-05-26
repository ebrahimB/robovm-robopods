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
package org.robovm.pods.inmobi.sdk;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IMConstants/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(IMConstants.class); }/*</bind>*/
    /*<constants>*/
    public static final String IM_GDPR_CONSENT_AVAILABLE = "gdpr_consent_available";
    public static final String IM_GDPR_CONSENT_IAB = "gdpr_consent";
    public static final String IM_SUBJECT_TO_GDPR = "gdpr";
    public static final String IM_PARTNER_GDPR_CONSENT_AVAILABLE = "partner_gdpr_consent_available";
    public static final String IM_PARTNER_GDPR_APPLIES = "partner_gdpr_applies";
    /*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="InMobiSDKVersionNumber", optional=true)
    public static native double InMobiSDKVersionNumber();
    @GlobalValue(symbol="InMobiSDKVersionNumber", optional=true)
    public static native void InMobiSDKVersionNumber(double v);
    @GlobalValue(symbol="InMobiSDKVersionString", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String VersionString();
    @GlobalValue(symbol="kUnifiedAuctionEndPointUrl", optional=true)
    public static native String AuctionEndPointUrl();
    @GlobalValue(symbol="kASIMInterstitialBaseVCCloseButtonDelay", optional=true)
    public static native double getInterstitialBaseVCCloseButtonDelay();
    @Library(Library.INTERNAL)
    public static class AdMarkupTypes {
        static { Bro.bind(AdMarkupTypes.class); }

        @GlobalValue(symbol="kASIMAdMarkupTypeMediationJSON", optional=true)
        public static native NSString MediationJSON();
    }

    @Library(Library.INTERNAL)
    public static class AuctionKeys {
        static { Bro.bind(AuctionKeys.class); }

        @GlobalValue(symbol="kASIMUnifiedAuction_RequestID_Key", optional=true)
        public static native NSString RequestID();
        @GlobalValue(symbol="kASIMUnifiedAuction_AdType_Key", optional=true)
        public static native NSString AdType();
        @GlobalValue(symbol="kASIMUnifiedAuction_AdSetAuctionMeta_Key", optional=true)
        public static native NSString AdSetAuctionMeta();
        @GlobalValue(symbol="kASIMUnifiedAuction_ImpressionId_Key", optional=true)
        public static native NSString ImpressionId();
        @GlobalValue(symbol="kASIMUnifiedAuction_AdAuctionMeta_Key", optional=true)
        public static native NSString AdAuctionMeta();
        @GlobalValue(symbol="kASIMUnifiedAuction_DynamicBid_Key", optional=true)
        public static native NSString DynamicBid();
        @GlobalValue(symbol="kASIMUnifiedAuction_Macros_Key", optional=true)
        public static native NSString Macros();
    }

    @Library(Library.INTERNAL)
    public static class BannerRefresh {
        static { Bro.bind(BannerRefresh.class); }

        @GlobalValue(symbol="kASIMBannerRefreshUnset", optional=true)
        public static native double Unset();
        @GlobalValue(symbol="kASIMBannerRefreshDisabledForAS", optional=true)
        public static native double DisabledForAS();
        @GlobalValue(symbol="kASIMBannerRefreshDefault", optional=true)
        public static native double Default();
        @GlobalValue(symbol="kASIMBannerRefreshMinimum", optional=true)
        public static native double Minimum();
    }

    @Library(Library.INTERNAL)
    public static class EventTypes {
        static { Bro.bind(EventTypes.class); }

        @GlobalValue(symbol="kASBannerRenderedEventType", optional=true)
        public static native NSString BannerRendered();
        @GlobalValue(symbol="kASVASTImpressionEventType", optional=true)
        public static native NSString VASTImpression();
    }

    @Library(Library.INTERNAL)
    public static class KeyStoreKeys {
        static { Bro.bind(KeyStoreKeys.class); }

        @GlobalValue(symbol="kASIMKVStoreSDKSettings", optional=true)
        public static native NSString SDKSettings();
        @GlobalValue(symbol="kASIMKVStoreMappingManagers", optional=true)
        public static native NSString MappingManagers();
        @GlobalValue(symbol="kASIMKVStorePlacementInfo", optional=true)
        public static native NSString PlacementInfo();
        @GlobalValue(symbol="kASIMKVStoreTrueBaseEventUrls", optional=true)
        public static native NSString TrueBaseEventUrls();
    }

    @Library(Library.INTERNAL)
    public static class MetaInfo {
        static { Bro.bind(MetaInfo.class); }

        @GlobalValue(symbol="kASIMUnifiedMediationNetworkName", optional=true)
        public static native NSString MediationNetworkName();
        @GlobalValue(symbol="kASIMUnifiedSDKName", optional=true)
        public static native NSString SDKName();
    }

    @Library(Library.INTERNAL)
    public static class MimeType {
        static { Bro.bind(MimeType.class); }

        @GlobalValue(symbol="kASTextHtmlMimeType", optional=true)
        public static native NSString TextHtml();
        @GlobalValue(symbol="kASTextXmlMimeType", optional=true)
        public static native NSString TextXml();
        @GlobalValue(symbol="kASApplicationJsonMimeType", optional=true)
        public static native NSString ApplicationJson();
    }

    @Library(Library.INTERNAL)
    public static class NSCoddingKeys {
        static { Bro.bind(NSCoddingKeys.class); }

        @GlobalValue(symbol="kASIMCodingIntTypeKey", optional=true)
        public static native NSString IntType();
        @GlobalValue(symbol="kASIMCodingIMAccountIdKey", optional=true)
        public static native NSString IMAccountId();
        @GlobalValue(symbol="kASIMCodingASAppIdKey", optional=true)
        public static native NSString ASAppId();
        @GlobalValue(symbol="kASIMCodingPrimaryAcctIdKey", optional=true)
        public static native NSString PrimaryAcctId();
        @GlobalValue(symbol="kASIMCodingSecondaryAcctIdKey", optional=true)
        public static native NSString SecondaryAcctId();
        @GlobalValue(symbol="kASIMCodingAppIdKey", optional=true)
        public static native NSString AppId();
        @GlobalValue(symbol="kASIMCodingLocationKey", optional=true)
        public static native NSString Location();
        @GlobalValue(symbol="kASIMCodingBSSIDKey", optional=true)
        public static native NSString BSSID();
        @GlobalValue(symbol="kASIMCodingCellKey", optional=true)
        public static native NSString Cell();
        @GlobalValue(symbol="kASIMCodingMappingTableKey", optional=true)
        public static native NSString MappingTable();
        @GlobalValue(symbol="kASIMCodingMappingASKey", optional=true)
        public static native NSString MappingAS();
        @GlobalValue(symbol="kASIMCodingMappingIMKey", optional=true)
        public static native NSString MappingIM();
        @GlobalValue(symbol="kASIMCodingASPlacementKey", optional=true)
        public static native NSString ASPlacement();
        @GlobalValue(symbol="kASIMCodingIMPlacementKey", optional=true)
        public static native NSString IMPlacement();
        @GlobalValue(symbol="kASIMCodingPreinitBannerRefresh", optional=true)
        public static native NSString PreinitBannerRefresh();
        @GlobalValue(symbol="kASIMCodingHasDynamicKey", optional=true)
        public static native NSString HasDynamic();
        @GlobalValue(symbol="kASIMCodingHasRewardsKey", optional=true)
        public static native NSString HasRewards();
        @GlobalValue(symbol="kASIMCodingIsDebugKey", optional=true)
        public static native NSString IsDebug();
        @GlobalValue(symbol="kASIMCodingPubKeysKey", optional=true)
        public static native NSString PubKeys();
        @GlobalValue(symbol="kASIMCodingUserIdKey", optional=true)
        public static native NSString UserId();
        @GlobalValue(symbol="kASIMCodingSecureOnlyKey", optional=true)
        public static native NSString SecureOnly();
        @GlobalValue(symbol="kASIMCodingKeywordsKey", optional=true)
        public static native NSString Keywords();
        @GlobalValue(symbol="kASIMCodingExtKey", optional=true)
        public static native NSString Ext();
        @GlobalValue(symbol="kASIMCodingExtrasKey", optional=true)
        public static native NSString Extras();
        @GlobalValue(symbol="kASIMCodingRefreshEnabledKey", optional=true)
        public static native NSString RefreshEnabled();
        @GlobalValue(symbol="kASIMCodingRefreshIntervalKey", optional=true)
        public static native NSString RefreshInterval();
        @GlobalValue(symbol="kASIMCodingAnimationTypeKey", optional=true)
        public static native NSString AnimationType();
        @GlobalValue(symbol="kASIMCodingPrimaryFlow", optional=true)
        public static native NSString PrimaryFlow();
    }

    @Library(Library.INTERNAL)
    public static class PlacementInfo {
        static { Bro.bind(PlacementInfo.class); }

        @GlobalValue(symbol="kPlacementInfoASPlacementKey", optional=true)
        public static native NSString ASPlacementKey();
        @GlobalValue(symbol="kPlacementInfoIMPlacementKey", optional=true)
        public static native NSString IMPlacementKey();
        @GlobalValue(symbol="kPlacementInfoBannerRefresh", optional=true)
        public static native NSString BannerRefresh();
    }

    @Library(Library.INTERNAL)
    public static class PreInitKeys {
        static { Bro.bind(PreInitKeys.class); }

        @GlobalValue(symbol="kASApplicationKey", optional=true)
        public static native NSString Application();
        @GlobalValue(symbol="kASVersionKey", optional=true)
        public static native NSString Version();
        @GlobalValue(symbol="kASIPhoneSDK", optional=true)
        public static native NSString IPhoneSDK();
        @GlobalValue(symbol="kASAsPlcId", optional=true)
        public static native NSString AsPlcId();
        @GlobalValue(symbol="kASGDPRConsentKey", optional=true)
        public static native NSString GDPRConsent();
        @GlobalValue(symbol="kASAppId", optional=true)
        public static native NSString AppId();
        @GlobalValue(symbol="kASContentTypeKey", optional=true)
        public static native NSString ContentType();
    }

    @Library(Library.INTERNAL)
    public static class TimeoutDefaults {
        static { Bro.bind(TimeoutDefaults.class); }

        @GlobalValue(symbol="kASIMUnifiedStep0_Preinit_TimeoutDefaultVal", optional=true)
        public static native double Step0_Preinit();
        @GlobalValue(symbol="kASIMUnifiedStep1a_Mutt_TimeoutDefaultVal", optional=true)
        public static native double Step1a_Mutt();
        @GlobalValue(symbol="kASIMUnifiedStep1b_MediationLoad_TimeoutDefaultVal", optional=true)
        public static native double Step1b_MediationLoad();
        @GlobalValue(symbol="kASIMUnifiedStep2u_UnifiedAuction_UTimeoutDefaultVal", optional=true)
        public static native double Step2u_UnifiedAuction();
        @GlobalValue(symbol="kASIMUnifiedStep3r_Render_TimeoutDefaultVal", optional=true)
        public static native double Step3r_Render();
        @GlobalValue(symbol="kASIMUnifiedStep4s_Show_TimeoutDefaultVal", optional=true)
        public static native double Step4s_Show();
    }
    /*</methods>*/
}
