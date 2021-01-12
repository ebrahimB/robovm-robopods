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
package org.robovm.pods.applovinsdk;

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
/**
 * @deprecated Native ads have been deprecated and will be removed in a future SDK version.
 */
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALNativeAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALNativeAdPtr extends Ptr<ALNativeAd, ALNativeAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALNativeAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ALNativeAd() {}
    protected ALNativeAd(Handle h, long handle) { super(h, handle); }
    protected ALNativeAd(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adIdNumber")
    public native NSNumber getAdIdNumber();
    @Property(selector = "zoneIdentifier")
    public native String getZoneIdentifier();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "descriptionText")
    public native String getDescriptionText();
    @Property(selector = "captionText")
    public native String getCaptionText();
    @Property(selector = "ctaText")
    public native String getCtaText();
    @Property(selector = "iconURL")
    public native NSURL getIconURL();
    @Property(selector = "imageURL")
    public native NSURL getImageURL();
    @Property(selector = "starRating")
    public native NSNumber getStarRating();
    @Property(selector = "videoURL")
    public native NSURL getVideoURL();
    @Property(selector = "videoStartTrackingURL")
    public native NSURL getVideoStartTrackingURL();
    @Property(selector = "isImagePrecached")
    public native boolean isImagePrecached();
    @Property(selector = "isVideoPrecached")
    public native boolean isVideoPrecached();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "trackImpression")
    public native void trackImpression();
    @Method(selector = "trackImpressionAndNotify:")
    public native void trackImpressionAndNotify(ALPostbackDelegate postbackDelegate);
    @Method(selector = "videoEndTrackingURL:firstPlay:")
    public native NSURL videoEndTrackingURL(@MachineSizedUInt long percentViewed, boolean firstPlay);
    @Method(selector = "launchClickTarget")
    public native void launchClickTarget();
    /*</methods>*/
}
