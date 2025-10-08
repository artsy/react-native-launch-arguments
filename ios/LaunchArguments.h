#import <React/RCTBridgeModule.h>

#ifdef RCT_NEW_ARCH_ENABLED
#import <React/RCTTurboModule.h>
#import "RCTNativeLaunchArgumentsSpec.h"

@interface LaunchArguments : NSObject <NativeLaunchArgumentsSpec>
#else
@interface LaunchArguments : NSObject <RCTBridgeModule>
#endif

@end
