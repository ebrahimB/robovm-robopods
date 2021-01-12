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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKProfilePictureView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKProfilePictureViewPtr extends Ptr<FBSDKProfilePictureView, FBSDKProfilePictureViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKProfilePictureView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKProfilePictureView() {}
    protected FBSDKProfilePictureView(Handle h, long handle) { super(h, handle); }
    protected FBSDKProfilePictureView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:profile:")
    public FBSDKProfilePictureView(@ByVal CGRect frame, FBSDKProfile profile) { super((SkipInit) null); initObject(init(frame, profile)); }
    @Method(selector = "initWithProfile:")
    public FBSDKProfilePictureView(FBSDKProfile profile) { super((SkipInit) null); initObject(init(profile)); }
    @Method(selector = "initWithFrame:")
    public FBSDKProfilePictureView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public FBSDKProfilePictureView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "pictureMode")
    public native FBSDKProfilePictureMode getPictureMode();
    @Property(selector = "setPictureMode:")
    public native void setPictureMode(FBSDKProfilePictureMode v);
    @Property(selector = "profileID")
    public native String getProfileID();
    @Property(selector = "setProfileID:")
    public native void setProfileID(String v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrame:profile:")
    protected native @Pointer long init(@ByVal CGRect frame, FBSDKProfile profile);
    @Method(selector = "initWithProfile:")
    protected native @Pointer long init(FBSDKProfile profile);
    @Method(selector = "setNeedsImageUpdate")
    public native void setNeedsImageUpdate();
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
