//
//  MAAdDelegate.h
//  AppLovinSDK
//
//  Created by Thomas So on 8/10/18.
//  Copyright © 2020 AppLovin Corporation. All rights reserved.
//

#import "MAAd.h"
#import "MAError.h"

NS_ASSUME_NONNULL_BEGIN

/**
 * This protocol defines a listener intended to be notified about ad events.
 */
@protocol MAAdDelegate<NSObject>

/**
 * The SDK invokes this callback when it successfully loads an ad.
 *
 * The SDK invokes this callback on the UI thread.
 *
 * @param ad The ad that the SDK finished successfully loaded for.
 */
- (void)didLoadAd:(MAAd *)ad;

/**
 * The SDK invokes this callback when it fails to load an ad.
 *
 * To see the error code, see @code -[MAError code] @endcode. See @code MAErrorCode.h @endcode for a list of error codes.
 * To see a description of the error, see @code -[MAError message] @endcode.
 * To see the error code and reasons for each ad network that failed to load, see @code -[MAError adLoadFailureInfo] @endcode.
 *
 * The SDK invokes this callback on the UI thread.
 *
 * @param adUnitIdentifier  The ad unit ID that the SDK failed to load an ad for.
 * @param error                          An object that encapsulates the failure info.
 */
- (void)didFailToLoadAdForAdUnitIdentifier:(NSString *)adUnitIdentifier withError:(MAError *)error;

/**
 * The SDK invokes this callback when it successfully displays a fullscreen ad.
 *
 * The SDK invokes this callback on the UI thread.
 *
 * @param ad The ad that the SDK finished successfully displayed for.
 */
- (void)didDisplayAd:(MAAd *)ad;

/**
 * The SDK invokes this callback when it finishes displaying the ad.
 *
 * The SDK invokes this callback on the UI thread.
 *
 * @param ad The ad that the SDK finished displaying for.
 */
- (void)didHideAd:(MAAd *)ad;

/**
 * The SDK invokes this callback when a user clicks the ad.
 *
 * The SDK invokes this callback on the UI thread.
 *
 * @param ad The ad that the user clicked for.
 */
- (void)didClickAd:(MAAd *)ad;

/**
 * The SDK invokes this callback when it fails to successfully display a fullscreen ad.
 *
 * To see the error code, see @code -[MAError code] @endcode. See @code MAErrorCode.h @endcode for a list of error codes.
 * To see the error reason, see @code -[MAError message] @endcode.
 *
 * The SDK invokes this callback on the UI thread.
 *
 * @param ad       The ad that the SDK failed to display for.
 * @param error An object that encapsulates the failure info.
 */
- (void)didFailToDisplayAd:(MAAd *)ad withError:(MAError *)error;

@optional

/**
 * The SDK invokes this callback when it detects a revenue event for an ad.
 *
 * The SDK invokes this callback on the UI thread.
 *
 * @param ad The ad for which the revenue event was detected.
 */
- (void)didPayRevenueForAd:(MAAd *)ad;

- (void)didFailToLoadAdForAdUnitIdentifier:(NSString *)adUnitIdentifier withErrorCode:(NSInteger)errorCode
__deprecated_msg("This callback has been deprecated and will be removed in a future SDK version. Please use -[MAAdDelegate didFailToLoadAdForAdUnitIdentifier:withError:] instead.");
- (void)didFailToDisplayAd:(MAAd *)ad withErrorCode:(NSInteger)errorCode
__deprecated_msg("This callback has been deprecated and will be removed in a future SDK version. Please use -[MAAdDelegate didFailToDisplayAd:withError:] instead.");

@end

NS_ASSUME_NONNULL_END
