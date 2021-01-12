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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKGameRequestContent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKCopying, FBSDKSharingValidation, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class FBSDKGameRequestContentPtr extends Ptr<FBSDKGameRequestContent, FBSDKGameRequestContentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKGameRequestContent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKGameRequestContent() {}
    protected FBSDKGameRequestContent(Handle h, long handle) { super(h, handle); }
    protected FBSDKGameRequestContent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public FBSDKGameRequestContent(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "actionType")
    public native FBSDKGameRequestActionType getActionType();
    @Property(selector = "setActionType:")
    public native void setActionType(FBSDKGameRequestActionType v);
    @Property(selector = "data")
    public native String getData();
    @Property(selector = "setData:")
    public native void setData(String v);
    @Property(selector = "filters")
    public native FBSDKGameRequestFilter getFilters();
    @Property(selector = "setFilters:")
    public native void setFilters(FBSDKGameRequestFilter v);
    @Property(selector = "message")
    public native String getMessage();
    @Property(selector = "setMessage:")
    public native void setMessage(String v);
    @Property(selector = "objectID")
    public native String getObjectID();
    @Property(selector = "setObjectID:")
    public native void setObjectID(String v);
    @Property(selector = "recipients")
    public native NSArray<NSString> getRecipients();
    @Property(selector = "setRecipients:")
    public native void setRecipients(NSArray<NSString> v);
    @Property(selector = "recipientSuggestions")
    public native NSArray<NSString> getRecipientSuggestions();
    @Property(selector = "setRecipientSuggestions:")
    public native void setRecipientSuggestions(NSArray<NSString> v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqualToGameRequestContent:")
    public native boolean isEqualToGameRequestContent(FBSDKGameRequestContent content);
    @Method(selector = "copy")
    public native NSObject copy();
    @Method(selector = "validateWithOptions:error:")
    public native boolean validate(FBSDKShareBridgeOptions bridgeOptions, NSError.NSErrorPtr errorRef);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
