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
package org.robovm.pods.facebook.corebasics;

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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKFileManagingAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKFileManaging/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("URLForDirectory:inDomain:appropriateForURL:create:error:")
    public NSURL getURL(NSSearchPathDirectory directory, NSSearchPathDomainMask domain, NSURL url, boolean shouldCreate, NSError.NSErrorPtr error) { return null; }
    @NotImplemented("createDirectoryAtPath:withIntermediateDirectories:attributes:error:")
    public boolean createDirectory(String path, boolean createIntermediates, NSDictionary<NSString, ?> attributes, NSError.NSErrorPtr error) { return false; }
    @NotImplemented("fileExistsAtPath:")
    public boolean fileExistsAtPath(String path) { return false; }
    @NotImplemented("removeItemAtPath:error:")
    public boolean removeItem(String path, NSError.NSErrorPtr error) { return false; }
    @NotImplemented("contentsOfDirectoryAtPath:error:")
    public NSArray<NSString> getContentsOfDirectory(String path, NSError.NSErrorPtr error) { return null; }
    /*</methods>*/
}
