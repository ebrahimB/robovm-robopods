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
import org.robovm.apple.coreanimation.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKShareVideo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKShareMedia, FBSDKSharingValidatable/*</implements>*/ {

    /*<ptr>*/public static class FBSDKShareVideoPtr extends Ptr<FBSDKShareVideo, FBSDKShareVideoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKShareVideo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKShareVideo() {}
    protected FBSDKShareVideo(Handle h, long handle) { super(h, handle); }
    protected FBSDKShareVideo(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithData:previewPhoto:")
    public FBSDKShareVideo(NSData data, FBSDKSharePhoto previewPhoto) { super((SkipInit) null); initObject(init(data, previewPhoto)); }
    @Method(selector = "initWithVideoAsset:previewPhoto:")
    public FBSDKShareVideo(PHAsset videoAsset, FBSDKSharePhoto previewPhoto) { super((SkipInit) null); initObject(init(videoAsset, previewPhoto)); }
    @Method(selector = "initWithVideoURL:previewPhoto:")
    public FBSDKShareVideo(NSURL videoURL, FBSDKSharePhoto previewPhoto) { super((SkipInit) null); initObject(init(videoURL, previewPhoto)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "data")
    public native NSData getData();
    @Property(selector = "setData:")
    public native void setData(NSData v);
    @Property(selector = "videoAsset")
    public native PHAsset getVideoAsset();
    @Property(selector = "setVideoAsset:")
    public native void setVideoAsset(PHAsset v);
    @Property(selector = "videoURL")
    public native NSURL getVideoURL();
    @Property(selector = "setVideoURL:")
    public native void setVideoURL(NSURL v);
    @Property(selector = "previewPhoto")
    public native FBSDKSharePhoto getPreviewPhoto();
    @Property(selector = "setPreviewPhoto:")
    public native void setPreviewPhoto(FBSDKSharePhoto v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithData:previewPhoto:")
    protected native @Pointer long init(NSData data, FBSDKSharePhoto previewPhoto);
    @Method(selector = "initWithVideoAsset:previewPhoto:")
    protected native @Pointer long init(PHAsset videoAsset, FBSDKSharePhoto previewPhoto);
    @Method(selector = "initWithVideoURL:previewPhoto:")
    protected native @Pointer long init(NSURL videoURL, FBSDKSharePhoto previewPhoto);
    public boolean validate(FBSDKShareBridgeOptions bridgeOptions) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = validate(bridgeOptions, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "validateWithOptions:error:")
    public native boolean validate(FBSDKShareBridgeOptions bridgeOptions, NSError.NSErrorPtr error);
    /*</methods>*/
}
