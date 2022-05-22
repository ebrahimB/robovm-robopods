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
package org.robovm.pods.facebook.share;

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
import org.robovm.apple.photos.*;
import org.robovm.pods.facebook.core.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKSharePhoto/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKShareMedia, FBSDKSharingValidation/*</implements>*/ {

    /*<ptr>*/public static class FBSDKSharePhotoPtr extends Ptr<FBSDKSharePhoto, FBSDKSharePhotoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKSharePhoto.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKSharePhoto() {}
    protected FBSDKSharePhoto(Handle h, long handle) { super(h, handle); }
    protected FBSDKSharePhoto(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithImage:isUserGenerated:")
    public FBSDKSharePhoto(UIImage image, boolean isUserGenerated) { super((SkipInit) null); initObject(init(image, isUserGenerated)); }
    @Method(selector = "initWithImageURL:isUserGenerated:")
    public FBSDKSharePhoto(NSURL imageURL, boolean isUserGenerated) { super((SkipInit) null); initObject(init(imageURL, isUserGenerated)); }
    @Method(selector = "initWithPhotoAsset:isUserGenerated:")
    public FBSDKSharePhoto(PHAsset photoAsset, boolean isUserGenerated) { super((SkipInit) null); initObject(init(photoAsset, isUserGenerated)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    @Property(selector = "imageURL")
    public native NSURL getImageURL();
    @Property(selector = "setImageURL:")
    public native void setImageURL(NSURL v);
    @Property(selector = "photoAsset")
    public native PHAsset getPhotoAsset();
    @Property(selector = "setPhotoAsset:")
    public native void setPhotoAsset(PHAsset v);
    @Property(selector = "isUserGenerated")
    public native boolean isUserGenerated();
    @Property(selector = "setIsUserGenerated:")
    public native void setIsUserGenerated(boolean v);
    @Property(selector = "caption")
    public native String getCaption();
    @Property(selector = "setCaption:")
    public native void setCaption(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithImage:isUserGenerated:")
    protected native @Pointer long init(UIImage image, boolean isUserGenerated);
    @Method(selector = "initWithImageURL:isUserGenerated:")
    protected native @Pointer long init(NSURL imageURL, boolean isUserGenerated);
    @Method(selector = "initWithPhotoAsset:isUserGenerated:")
    protected native @Pointer long init(PHAsset photoAsset, boolean isUserGenerated);
    @Method(selector = "validateWithOptions:error:")
    public native boolean validate(FBSDKShareBridgeOptions bridgeOptions, NSError.NSErrorPtr error);
    /*</methods>*/
}
