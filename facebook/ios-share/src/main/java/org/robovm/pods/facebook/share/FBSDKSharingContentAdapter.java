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
import org.robovm.apple.coreanimation.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKSharingContentAdapter/*</name>*/ 
    extends /*<extends>*/FBSDKSharingValidatableAdapter/*</extends>*/ 
    /*<implements>*/implements FBSDKSharingContent/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("contentURL")
    public NSURL getContentURL() { return null; }
    @NotImplemented("setContentURL:")
    public void setContentURL(NSURL v) {}
    @NotImplemented("hashtag")
    public FBSDKHashtag getHashtag() { return null; }
    @NotImplemented("setHashtag:")
    public void setHashtag(FBSDKHashtag v) {}
    @NotImplemented("peopleIDs")
    public NSArray<NSString> getPeopleIDs() { return null; }
    @NotImplemented("setPeopleIDs:")
    public void setPeopleIDs(NSArray<NSString> v) {}
    @NotImplemented("placeID")
    public String getPlaceID() { return null; }
    @NotImplemented("setPlaceID:")
    public void setPlaceID(String v) {}
    @NotImplemented("ref")
    public String getRef() { return null; }
    @NotImplemented("setRef:")
    public void setRef(String v) {}
    @NotImplemented("pageID")
    public String getPageID() { return null; }
    @NotImplemented("setPageID:")
    public void setPageID(String v) {}
    @NotImplemented("shareUUID")
    public String getShareUUID() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("addParameters:bridgeOptions:")
    public NSDictionary<NSString, ?> addParameters(NSDictionary<NSString, ?> existingParameters, FBSDKShareBridgeOptions bridgeOptions) { return null; }
    /*</methods>*/
}
