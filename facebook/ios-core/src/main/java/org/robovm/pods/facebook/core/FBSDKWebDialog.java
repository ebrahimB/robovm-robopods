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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKWebDialog/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKWebDialogPtr extends Ptr<FBSDKWebDialog, FBSDKWebDialogPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKWebDialog.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKWebDialog() {}
    protected FBSDKWebDialog(Handle h, long handle) { super(h, handle); }
    protected FBSDKWebDialog(SkipInit skipInit) { super(skipInit); }
    public FBSDKWebDialog(String name, FBSDKWebDialogDelegate delegate) { super((Handle) null, create(name, delegate)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shouldDeferVisibility")
    public native boolean shouldDeferVisibility();
    @Property(selector = "setShouldDeferVisibility:")
    public native void setShouldDeferVisibility(boolean v);
    @Property(selector = "windowFinder")
    public native FBSDKWindowFinding getWindowFinder();
    @Property(selector = "setWindowFinder:")
    public native void setWindowFinder(FBSDKWindowFinding v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "dialogWithName:delegate:")
    protected static native @Pointer long create(String name, FBSDKWebDialogDelegate delegate);
    @Method(selector = "createAndShowWithName:parameters:frame:delegate:windowFinder:")
    public static native FBSDKWebDialog createAndShow(String name, NSDictionary<NSString, ?> parameters, @ByVal CGRect frame, FBSDKWebDialogDelegate delegate, FBSDKWindowFinding windowFinder);
    /*</methods>*/
}
