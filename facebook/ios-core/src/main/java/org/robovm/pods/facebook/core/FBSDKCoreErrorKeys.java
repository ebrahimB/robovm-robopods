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
/*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/FBSDKCoreErrorKeys/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKCoreErrorKeys/*</name>*/ 
    extends /*<extends>*/NSErrorUserInfoKey/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/FBSDKCoreErrorKeys/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static FBSDKCoreErrorKeys toObject(Class<FBSDKCoreErrorKeys> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return FBSDKCoreErrorKeys.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(FBSDKCoreErrorKeys o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<FBSDKCoreErrorKeys> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<FBSDKCoreErrorKeys> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(FBSDKCoreErrorKeys.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<FBSDKCoreErrorKeys> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (FBSDKCoreErrorKeys o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final FBSDKCoreErrorKeys ArgumentCollection = new FBSDKCoreErrorKeys("ArgumentCollection");
    public static final FBSDKCoreErrorKeys ArgumentName = new FBSDKCoreErrorKeys("ArgumentName");
    public static final FBSDKCoreErrorKeys ArgumentValue = new FBSDKCoreErrorKeys("ArgumentValue");
    public static final FBSDKCoreErrorKeys DeveloperMessage = new FBSDKCoreErrorKeys("DeveloperMessage");
    public static final FBSDKCoreErrorKeys LocalizedDescription = new FBSDKCoreErrorKeys("LocalizedDescription");
    public static final FBSDKCoreErrorKeys LocalizedTitle = new FBSDKCoreErrorKeys("LocalizedTitle");
    public static final FBSDKCoreErrorKeys GraphRequestError = new FBSDKCoreErrorKeys("GraphRequestError");
    public static final FBSDKCoreErrorKeys ErrorGraphErrorCode = new FBSDKCoreErrorKeys("ErrorGraphErrorCode");
    public static final FBSDKCoreErrorKeys ErrorGraphErrorSubcode = new FBSDKCoreErrorKeys("ErrorGraphErrorSubcode");
    public static final FBSDKCoreErrorKeys ErrorHTTPStatusCode = new FBSDKCoreErrorKeys("ErrorHTTPStatusCode");
    public static final FBSDKCoreErrorKeys ErrorParsedJSONResponse = new FBSDKCoreErrorKeys("ErrorParsedJSONResponse");
    /*</constants>*/
    
    private static /*<name>*/FBSDKCoreErrorKeys/*</name>*/[] values = new /*<name>*/FBSDKCoreErrorKeys/*</name>*/[] {/*<value_list>*/ArgumentCollection, ArgumentName, ArgumentValue, DeveloperMessage, LocalizedDescription, LocalizedTitle, GraphRequestError, ErrorGraphErrorCode, ErrorGraphErrorSubcode, ErrorHTTPStatusCode, ErrorParsedJSONResponse/*</value_list>*/};
    
    /*<name>*/FBSDKCoreErrorKeys/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/FBSDKCoreErrorKeys/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/FBSDKCoreErrorKeys/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/FBSDKCoreErrorKeys/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="FBSDKErrorArgumentCollectionKey", optional=true)
        public static native NSString ArgumentCollection();
        @GlobalValue(symbol="FBSDKErrorArgumentNameKey", optional=true)
        public static native NSString ArgumentName();
        @GlobalValue(symbol="FBSDKErrorArgumentValueKey", optional=true)
        public static native NSString ArgumentValue();
        @GlobalValue(symbol="FBSDKErrorDeveloperMessageKey", optional=true)
        public static native NSString DeveloperMessage();
        @GlobalValue(symbol="FBSDKErrorLocalizedDescriptionKey", optional=true)
        public static native NSString LocalizedDescription();
        @GlobalValue(symbol="FBSDKErrorLocalizedTitleKey", optional=true)
        public static native NSString LocalizedTitle();
        @GlobalValue(symbol="FBSDKGraphRequestErrorKey", optional=true)
        public static native NSString GraphRequestError();
        @GlobalValue(symbol="FBSDKGraphRequestErrorGraphErrorCodeKey", optional=true)
        public static native NSString ErrorGraphErrorCode();
        @GlobalValue(symbol="FBSDKGraphRequestErrorGraphErrorSubcodeKey", optional=true)
        public static native NSString ErrorGraphErrorSubcode();
        @GlobalValue(symbol="FBSDKGraphRequestErrorHTTPStatusCodeKey", optional=true)
        public static native NSString ErrorHTTPStatusCode();
        @GlobalValue(symbol="FBSDKGraphRequestErrorParsedJSONResponseKey", optional=true)
        public static native NSString ErrorParsedJSONResponse();
        /*</values>*/
    }
}
