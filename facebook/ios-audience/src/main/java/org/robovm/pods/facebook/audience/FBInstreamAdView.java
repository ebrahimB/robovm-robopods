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
package org.robovm.pods.facebook.audience;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Instream ads have been deprecated.
 */
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBInstreamAdView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBInstreamAdViewPtr extends Ptr<FBInstreamAdView, FBInstreamAdViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBInstreamAdView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBInstreamAdView() {}
    protected FBInstreamAdView(Handle h, long handle) { super(h, handle); }
    protected FBInstreamAdView(SkipInit skipInit) { super(skipInit); }
    /**
     * @deprecated Instream ads have been deprecated. Initialiser will return nil.
     */
    @Deprecated
    @Method(selector = "initWithPlacementID:")
    public FBInstreamAdView(String placementID) { super((SkipInit) null); initObject(init(placementID)); }
    @Method(selector = "initWithFrame:")
    public FBInstreamAdView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public FBInstreamAdView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isAdValid")
    public native boolean isAdValid();
    @Property(selector = "delegate")
    public native FBInstreamAdViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBInstreamAdViewDelegate v);
    @Property(selector = "placementID")
    public native String getPlacementID();
    @Property(selector = "extraHint")
    public native FBAdExtraHint getExtraHint();
    @Property(selector = "setExtraHint:")
    public native void setExtraHint(FBAdExtraHint v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated Instream ads have been deprecated. Initialiser will return nil.
     */
    @Deprecated
    @Method(selector = "initWithPlacementID:")
    protected native @Pointer long init(String placementID);
    /**
     * @deprecated Instream ads have been deprecated. Calling this method will have no effect.
     */
    @Deprecated
    @Method(selector = "loadAd")
    public native void loadAd();
    /**
     * @deprecated Instream ads have been deprecated. Calling this method will have no effect.
     */
    @Deprecated
    @Method(selector = "loadAdWithBidPayload:")
    public native void loadAd(String bidPayload);
    /**
     * @deprecated Instream ads have been deprecated. Calling this method will have no effect.
     */
    @Deprecated
    @Method(selector = "showAdFromRootViewController:")
    public native boolean showAdFromRootViewController(UIViewController rootViewController);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
