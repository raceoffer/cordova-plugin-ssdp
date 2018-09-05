const exec = require('cordova/exec');

exports.startSearching = function(target) {
  return new Promise(function(success, error) {
    exec(success, error, "Ssdp", "startSearching", [target])
  });
}

exports.startAdvertising = function(target) {
  return new Promise(function(success, error) {
    exec(success, error, "Ssdp", "startAdvertising", [target])
  });
}

exports.stop = function() {
  return new Promise(function(success, error) {
    exec(success, error, "Ssdp", "stop", []);
  });
}

exports.setDiscoveredCallback = function(callback) {
  exec(callback, null, "Ssdp", "setDiscoveredCallback", []);
}