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
package org.robovm.pods.onesignal;

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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSInAppMessageAction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSInAppMessageActionPtr extends Ptr<OSInAppMessageAction, OSInAppMessageActionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSInAppMessageAction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSInAppMessageAction() {}
    protected OSInAppMessageAction(Handle h, long handle) { super(h, handle); }
    protected OSInAppMessageAction(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "clickName")
    public native String getClickName();
    @Property(selector = "setClickName:")
    public native void setClickName(String v);
    @Property(selector = "clickUrl")
    public native NSURL getClickUrl();
    @Property(selector = "setClickUrl:")
    public native void setClickUrl(NSURL v);
    @Property(selector = "firstClick")
    public native boolean isFirstClick();
    @Property(selector = "setFirstClick:")
    public native void setFirstClick(boolean v);
    @Property(selector = "closesMessage")
    public native boolean isClosesMessage();
    @Property(selector = "setClosesMessage:")
    public native void setClosesMessage(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
