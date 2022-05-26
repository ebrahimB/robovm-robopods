#!/bin/sh
set -e
pod install 
pod update 
pushd Pods
xcodebuild -configuration Release -sdk iphoneos -scheme Adapty build \
         CODE_SIGNING_REQUIRED=NO CODE_SIGNING_ALLOWED=NO \
         CONFIGURATION_BUILD_DIR=../
popd