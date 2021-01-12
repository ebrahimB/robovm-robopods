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
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/GADUnifiedNativeAssetIdentifier/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADUnifiedNativeAssetIdentifier/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/GADUnifiedNativeAssetIdentifier/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static GADUnifiedNativeAssetIdentifier toObject(Class<GADUnifiedNativeAssetIdentifier> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return GADUnifiedNativeAssetIdentifier.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(GADUnifiedNativeAssetIdentifier o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<GADUnifiedNativeAssetIdentifier> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<GADUnifiedNativeAssetIdentifier> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(GADUnifiedNativeAssetIdentifier.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<GADUnifiedNativeAssetIdentifier> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (GADUnifiedNativeAssetIdentifier o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final GADUnifiedNativeAssetIdentifier HeadlineAsset = new GADUnifiedNativeAssetIdentifier("HeadlineAsset");
    public static final GADUnifiedNativeAssetIdentifier CallToActionAsset = new GADUnifiedNativeAssetIdentifier("CallToActionAsset");
    public static final GADUnifiedNativeAssetIdentifier IconAsset = new GADUnifiedNativeAssetIdentifier("IconAsset");
    public static final GADUnifiedNativeAssetIdentifier BodyAsset = new GADUnifiedNativeAssetIdentifier("BodyAsset");
    public static final GADUnifiedNativeAssetIdentifier StoreAsset = new GADUnifiedNativeAssetIdentifier("StoreAsset");
    public static final GADUnifiedNativeAssetIdentifier PriceAsset = new GADUnifiedNativeAssetIdentifier("PriceAsset");
    public static final GADUnifiedNativeAssetIdentifier ImageAsset = new GADUnifiedNativeAssetIdentifier("ImageAsset");
    public static final GADUnifiedNativeAssetIdentifier StarRatingAsset = new GADUnifiedNativeAssetIdentifier("StarRatingAsset");
    public static final GADUnifiedNativeAssetIdentifier AdvertiserAsset = new GADUnifiedNativeAssetIdentifier("AdvertiserAsset");
    public static final GADUnifiedNativeAssetIdentifier MediaViewAsset = new GADUnifiedNativeAssetIdentifier("MediaViewAsset");
    public static final GADUnifiedNativeAssetIdentifier AdChoicesViewAsset = new GADUnifiedNativeAssetIdentifier("AdChoicesViewAsset");
    /*</constants>*/
    
    private static /*<name>*/GADUnifiedNativeAssetIdentifier/*</name>*/[] values = new /*<name>*/GADUnifiedNativeAssetIdentifier/*</name>*/[] {/*<value_list>*/HeadlineAsset, CallToActionAsset, IconAsset, BodyAsset, StoreAsset, PriceAsset, ImageAsset, StarRatingAsset, AdvertiserAsset, MediaViewAsset, AdChoicesViewAsset/*</value_list>*/};
    
    /*<name>*/GADUnifiedNativeAssetIdentifier/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/GADUnifiedNativeAssetIdentifier/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/GADUnifiedNativeAssetIdentifier/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/GADUnifiedNativeAssetIdentifier/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="GADUnifiedNativeHeadlineAsset", optional=true)
        public static native NSString HeadlineAsset();
        @GlobalValue(symbol="GADUnifiedNativeCallToActionAsset", optional=true)
        public static native NSString CallToActionAsset();
        @GlobalValue(symbol="GADUnifiedNativeIconAsset", optional=true)
        public static native NSString IconAsset();
        @GlobalValue(symbol="GADUnifiedNativeBodyAsset", optional=true)
        public static native NSString BodyAsset();
        @GlobalValue(symbol="GADUnifiedNativeStoreAsset", optional=true)
        public static native NSString StoreAsset();
        @GlobalValue(symbol="GADUnifiedNativePriceAsset", optional=true)
        public static native NSString PriceAsset();
        @GlobalValue(symbol="GADUnifiedNativeImageAsset", optional=true)
        public static native NSString ImageAsset();
        @GlobalValue(symbol="GADUnifiedNativeStarRatingAsset", optional=true)
        public static native NSString StarRatingAsset();
        @GlobalValue(symbol="GADUnifiedNativeAdvertiserAsset", optional=true)
        public static native NSString AdvertiserAsset();
        @GlobalValue(symbol="GADUnifiedNativeMediaViewAsset", optional=true)
        public static native NSString MediaViewAsset();
        @GlobalValue(symbol="GADUnifiedNativeAdChoicesViewAsset", optional=true)
        public static native NSString AdChoicesViewAsset();
        /*</values>*/
    }
}
