#include "AppDelegate.h"
#include "GeneratedPluginRegistrant.h"

@import AppCenter;

@implementation AppDelegate

- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {
  [MSAppCenter setLogLevel: MSLogLevelVerbose]; 
  [GeneratedPluginRegistrant registerWithRegistry:self];
  // Override point for customization after application launch.
  return [super application:application didFinishLaunchingWithOptions:launchOptions];
}

@end
