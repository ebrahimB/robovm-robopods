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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKShareCameraEffectContent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKSharingContent/*</implements>*/ {

    /*<ptr>*/public static class FBSDKShareCameraEffectContentPtr extends Ptr<FBSDKShareCameraEffectContent, FBSDKShareCameraEffectContentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKShareCameraEffectContent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKShareCameraEffectContent() {}
    protected FBSDKShareCameraEffectContent(Handle h, long handle) { super(h, handle); }
    protected FBSDKShareCameraEffectContent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "effectID")
    public native String getEffectID();
    @Property(selector = "setEffectID:")
    public native void setEffectID(String v);
    @Property(selector = "effectArguments")
    public native FBSDKCameraEffectArguments getEffectArguments();
    @Property(selector = "setEffectArguments:")
    public native void setEffectArguments(FBSDKCameraEffectArguments v);
    @Property(selector = "effectTextures")
    public native FBSDKCameraEffectTextures getEffectTextures();
    @Property(selector = "setEffectTextures:")
    public native void setEffectTextures(FBSDKCameraEffectTextures v);
    @Property(selector = "contentURL")
    public native NSURL getContentURL();
    @Property(selector = "setContentURL:")
    public native void setContentURL(NSURL v);
    @Property(selector = "hashtag")
    public native FBSDKHashtag getHashtag();
    @Property(selector = "setHashtag:")
    public native void setHashtag(FBSDKHashtag v);
    @Property(selector = "peopleIDs")
    public native NSArray<NSString> getPeopleIDs();
    @Property(selector = "setPeopleIDs:")
    public native void setPeopleIDs(NSArray<NSString> v);
    @Property(selector = "placeID")
    public native String getPlaceID();
    @Property(selector = "setPlaceID:")
    public native void setPlaceID(String v);
    @Property(selector = "ref")
    public native String getRef();
    @Property(selector = "setRef:")
    public native void setRef(String v);
    @Property(selector = "pageID")
    public native String getPageID();
    @Property(selector = "setPageID:")
    public native void setPageID(String v);
    @Property(selector = "shareUUID")
    public native String getShareUUID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addParameters:bridgeOptions:")
    public native NSDictionary<NSString, ?> addParameters(NSDictionary<NSString, ?> existingParameters, FBSDKShareBridgeOptions bridgeOptions);
    @Method(selector = "validateWithOptions:error:")
    public native boolean validate(FBSDKShareBridgeOptions bridgeOptions, NSError.NSErrorPtr error);
    /*</methods>*/
}
