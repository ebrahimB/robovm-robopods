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
package org.robovm.pods.firebase.googlesignin;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTMSessionCookieStorage/*</name>*/ 
    extends /*<extends>*/NSHTTPCookieStorage/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GTMSessionCookieStoragePtr extends Ptr<GTMSessionCookieStorage, GTMSessionCookieStoragePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GTMSessionCookieStorage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GTMSessionCookieStorage() {}
    protected GTMSessionCookieStorage(Handle h, long handle) { super(h, handle); }
    protected GTMSessionCookieStorage(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedHTTPCookieStorage")
    public static native NSHTTPCookieStorage getSharedHTTPCookieStorage();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setCookies:")
    public native void setCookies(NSArray<NSHTTPCookie> cookies);
    @Method(selector = "removeAllCookies")
    public native void removeAllCookies();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "sharedCookieStorageForGroupContainerIdentifier:")
    public static native NSHTTPCookieStorage getSharedCookieStorageForGroupContainer(String identifier);
    /*</methods>*/
}
