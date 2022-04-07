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
package org.robovm.pods.appcenter.core;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSACChannelGroupProtocolAdapter/*</name>*/ 
    extends /*<extends>*/MSACChannelProtocolAdapter/*</extends>*/ 
    /*<implements>*/implements MSACChannelGroupProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("logUrl")
    public String getLogUrl() { return null; }
    @NotImplemented("setLogUrl:")
    public void setLogUrl(String v) {}
    @NotImplemented("appSecret")
    public String getAppSecret() { return null; }
    @NotImplemented("setAppSecret:")
    public void setAppSecret(String v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("addChannelUnitWithConfiguration:")
    public NSObject addChannelUnit(NSObject configuration) { return null; }
    @NotImplemented("addChannelUnitWithConfiguration:withIngestion:")
    public NSObject addChannelUnit(NSObject configuration, NSObject ingestion) { return null; }
    @NotImplemented("setMaxStorageSize:completionHandler:")
    public void setMaxStorageSize(@MachineSizedSInt long sizeInBytes, @Block VoidBooleanBlock completionHandler) {}
    @NotImplemented("channelUnitForGroupId:")
    public NSObject channelUnitForGroupId(String groupId) { return null; }
    /*</methods>*/
}
