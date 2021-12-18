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
package org.robovm.pods.appcenter.crashes;

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
import org.robovm.pods.appcenter.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSACErrorReport/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSACErrorReportPtr extends Ptr<MSACErrorReport, MSACErrorReportPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSACErrorReport.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSACErrorReport() {}
    protected MSACErrorReport(Handle h, long handle) { super(h, handle); }
    protected MSACErrorReport(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "incidentIdentifier")
    public native String getIncidentIdentifier();
    @Property(selector = "reporterKey")
    public native String getReporterKey();
    @Property(selector = "signal")
    public native String getSignal();
    @Property(selector = "exceptionName")
    public native String getExceptionName();
    @Property(selector = "exceptionReason")
    public native String getExceptionReason();
    @Property(selector = "appStartTime")
    public native NSDate getAppStartTime();
    @Property(selector = "appErrorTime")
    public native NSDate getAppErrorTime();
    @Property(selector = "archName")
    public native String getArchName();
    @Property(selector = "codeType")
    public native String getCodeType();
    @Property(selector = "applicationPath")
    public native String getApplicationPath();
    @Property(selector = "threads")
    public native NSArray<NSObject> getThreads();
    @Property(selector = "binaries")
    public native NSArray<NSObject> getBinaries();
    @Property(selector = "device")
    public native MSACDevice getDevice();
    @Property(selector = "appProcessIdentifier")
    public native @MachineSizedUInt long getAppProcessIdentifier();
    @Property(selector = "isAppKill")
    public native boolean isAppKill();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
