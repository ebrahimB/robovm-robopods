/*
 *    HelpshiftAll.h
 *    SDK Version 7.8.2-withCampaigns
 *
 *    Get the documentation at http://www.helpshift.com/docs
 *
 */

#import <Foundation/Foundation.h>
#import "HelpshiftCore.h"

@interface HelpshiftAll : NSObject <HsApiProvider>
/**
 *  Returns the shared instance object of the HelpshiftAll class
 *
 *  @return Object of HelpshiftAll class.
 */
+ (HelpshiftAll *) sharedInstance;

@end