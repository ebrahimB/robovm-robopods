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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKHashtag/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class FBSDKHashtagPtr extends Ptr<FBSDKHashtag, FBSDKHashtagPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKHashtag.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKHashtag() {}
    protected FBSDKHashtag(Handle h, long handle) { super(h, handle); }
    protected FBSDKHashtag(SkipInit skipInit) { super(skipInit); }
    public FBSDKHashtag(String hashtagString) { super((Handle) null, create(hashtagString)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public FBSDKHashtag(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "stringRepresentation")
    public native String getStringRepresentation();
    @Property(selector = "setStringRepresentation:")
    public native void setStringRepresentation(String v);
    @Property(selector = "isValid")
    public native boolean isValid();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqualToHashtag:")
    public native boolean isEqualToHashtag(FBSDKHashtag hashtag);
    @Method(selector = "hashtagWithString:")
    protected static native @Pointer long create(String hashtagString);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
