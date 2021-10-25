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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKTransformer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKTransformerPtr extends Ptr<FBSDKTransformer, FBSDKTransformerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKTransformer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKTransformer() {}
    protected FBSDKTransformer(Handle h, long handle) { super(h, handle); }
    protected FBSDKTransformer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FBSDKCATransform3DIdentity", optional=true)
    public static native @ByVal CATransform3D identity();
    
    @Method(selector = "CATransform3DMakeScale:sy:sz:")
    public native @ByVal CATransform3D makeScale(@MachineSizedFloat double sx, @MachineSizedFloat double sy, @MachineSizedFloat double sz);
    @Method(selector = "CATransform3DMakeTranslation:ty:tz:")
    public native @ByVal CATransform3D makeTranslation(@MachineSizedFloat double tx, @MachineSizedFloat double ty, @MachineSizedFloat double tz);
    @Method(selector = "CATransform3DConcat:b:")
    public native @ByVal CATransform3D concat(@ByVal CATransform3D a, @ByVal CATransform3D b);
    /*</methods>*/
}
