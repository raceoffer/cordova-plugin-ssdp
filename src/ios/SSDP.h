#include <netinet/in.h>
#include <sys/socket.h>
#include <unistd.h>
#include <arpa/inet.h>
#import <Cordova/CDVPlugin.h>
#import <Cordova/CDVInvokedUrlCommand.h>
#import "GCDAsyncUdpSocket.h"
#import "SSDPServiceBrowser.h"

@interface SSDP : CDVPlugin <GCDAsyncUdpSocketDelegate, SSDPServiceBrowserDelegate> {
    
}

- (void)startSearching:(CDVInvokedUrlCommand*)command;
- (void)startAdvertising:(CDVInvokedUrlCommand*)command;
- (void)stop:(CDVInvokedUrlCommand*)command;
- (void)setNetworkGoneCallback:(CDVInvokedUrlCommand*)command;
- (void)setDeviceDiscoveredCallback:(CDVInvokedUrlCommand*)command;
- (void)setDeviceGoneCallback:(CDVInvokedUrlCommand*)command;

@end
