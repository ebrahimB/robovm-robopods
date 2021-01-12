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
@Marshaler(/*<name>*/FBSDKHTTPMethod/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKHTTPMethod/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/FBSDKHTTPMethod/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static FBSDKHTTPMethod toObject(Class<FBSDKHTTPMethod> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return FBSDKHTTPMethod.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(FBSDKHTTPMethod o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<FBSDKHTTPMethod> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<FBSDKHTTPMethod> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(FBSDKHTTPMethod.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<FBSDKHTTPMethod> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (FBSDKHTTPMethod o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final FBSDKHTTPMethod GET = new FBSDKHTTPMethod("GET");
    public static final FBSDKHTTPMethod POST = new FBSDKHTTPMethod("POST");
    public static final FBSDKHTTPMethod DELETE = new FBSDKHTTPMethod("DELETE");
    /*</constants>*/
    
    private static /*<name>*/FBSDKHTTPMethod/*</name>*/[] values = new /*<name>*/FBSDKHTTPMethod/*</name>*/[] {/*<value_list>*/GET, POST, DELETE/*</value_list>*/};
    
    /*<name>*/FBSDKHTTPMethod/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/FBSDKHTTPMethod/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/FBSDKHTTPMethod/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/FBSDKHTTPMethod/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="FBSDKHTTPMethodGET", optional=true)
        public static native NSString GET();
        @GlobalValue(symbol="FBSDKHTTPMethodPOST", optional=true)
        public static native NSString POST();
        @GlobalValue(symbol="FBSDKHTTPMethodDELETE", optional=true)
        public static native NSString DELETE();
        /*</values>*/
    }
}
