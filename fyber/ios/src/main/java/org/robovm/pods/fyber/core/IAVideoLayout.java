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
package org.robovm.pods.fyber.core;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IAVideoLayout/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IAVideoLayoutPtr extends Ptr<IAVideoLayout, IAVideoLayoutPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IAVideoLayout.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public IAVideoLayout() {}
    protected IAVideoLayout(Handle h, long handle) { super(h, handle); }
    protected IAVideoLayout(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isActionButtonVisibleInFeed")
    public native boolean isActionButtonIsVisibleInFeed();
    @Property(selector = "setActionButtonIsVisibleInFeed:")
    public native void setActionButtonIsVisibleInFeed(boolean v);
    @Property(selector = "isProgressBarVisibleInFeed")
    public native boolean isProgressBarIsVisibleInFeed();
    @Property(selector = "setProgressBarIsVisibleInFeed:")
    public native void setProgressBarIsVisibleInFeed(boolean v);
    @Property(selector = "progressBarFillColor")
    public native UIColor getProgressBarFillColor();
    @Property(selector = "setProgressBarFillColor:")
    public native void setProgressBarFillColor(UIColor v);
    @Property(selector = "progressBarBackColor")
    public native UIColor getProgressBarBackColor();
    @Property(selector = "setProgressBarBackColor:")
    public native void setProgressBarBackColor(UIColor v);
    @Property(selector = "videoClickActionType")
    public native IAVideoClickActionType getVideoClickActionType();
    @Property(selector = "setVideoClickActionType:")
    public native void setVideoClickActionType(IAVideoClickActionType v);
    @Property(selector = "themeColor")
    public native UIColor getThemeColor();
    @Property(selector = "setThemeColor:")
    public native void setThemeColor(UIColor v);
    @Property(selector = "backgroundThemeColor")
    public native UIColor getBackgroundThemeColor();
    @Property(selector = "setBackgroundThemeColor:")
    public native void setBackgroundThemeColor(UIColor v);
    @Property(selector = "controlStrokeColor")
    public native UIColor getControlStrokeColor();
    @Property(selector = "setControlStrokeColor:")
    public native void setControlStrokeColor(UIColor v);
    @Property(selector = "controlFillColor")
    public native UIColor getControlFillColor();
    @Property(selector = "setControlFillColor:")
    public native void setControlFillColor(UIColor v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setTopLeftControlType:topRightControlType:bottomLeftControlType:bottomRightControlType:")
    public native void setTopLeftControlType(IAVideoLayoutControlType topLeftControlType, IAVideoLayoutControlType topRightControlType, IAVideoLayoutControlType bottomLeftControlType, IAVideoLayoutControlType bottomRightControlType);
    @Method(selector = "controlByType:")
    public native UIView controlByType(IAVideoLayoutControlType type);
    @Method(selector = "interstitialSkipLabel")
    public native UILabel interstitialSkipLabel();
    /*</methods>*/
}
