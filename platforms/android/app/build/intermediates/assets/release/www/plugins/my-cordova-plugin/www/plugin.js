cordova.define("my-cordova-plugin.plugin", function(require, exports, module) {

var exec = require('cordova/exec');

var PLUGIN_NAME = 'MyCordovaPlugin';

var MyCordovaPlugin = {
  echo: function(phrase, cb) {
    exec(cb, null, PLUGIN_NAME, 'echo', [phrase]);
  },
  getDate: function(cb) {
    exec(cb, null, PLUGIN_NAME, 'getDate', []);
  },
  activation: function(cb, phrase) {
    exec(cb, null, PLUGIN_NAME, 'activation', [phrase]);
  },
  student: function(cb, phrase) {
    exec(cb, null, PLUGIN_NAME, 'student-client', [phrase]);
  },
  service_availability: function(appName, cb) {
    exec(cb, null, PLUGIN_NAME, 'check-app-availability', [appName]);
  },
  showToast: function(message) {
    exec(null, null, PLUGIN_NAME, 'showToast', [message]);
  },
  showActivationDialog: function(message) {
    exec(null, null, PLUGIN_NAME, 'showActivationDialog', [message]);
  }, 
  connectBtn: function(message) {
    exec(null, null, PLUGIN_NAME, 'connectBtn', [message]);
  },
  connect_observer: function(cb, phrase) {
    exec(cb, null, PLUGIN_NAME, 'connect-observer', [phrase]);
  },
  registerCallBack: function(cb, phrase) {
    exec(cb, null, PLUGIN_NAME, 'registerCallBack', [phrase]);
  },
  customMessage: function(message) {
    exec(null, null, PLUGIN_NAME, 'customMessage', [message]);
  },
  stopAll: function(message) {
    exec(null, null, PLUGIN_NAME, 'stopAll', [message]);
  },
  raiseHand: function(message) {
    exec(null, null, PLUGIN_NAME, 'raiseHand', [message]);
  }, 
  handDown: function(message) {
    exec(null, null, PLUGIN_NAME, 'handDown', [message]);
  },
  connectTeacherBtn: function(message) {
    exec(null, null, PLUGIN_NAME, 'connectTeacherBtn', [message]);
  },
  getTeachers: function(cb, message) {
    exec(cb,null, PLUGIN_NAME, 'getTeachers', [message]);
  },
  setStudentName: function(cb, message) {
    exec(cb,null, PLUGIN_NAME, 'setStudentName', [message]);
  },
  selectTeacher: function(teacherName) {
    exec(null, null, PLUGIN_NAME, 'selectTeacher', [teacherName]);
  }, 
  teacher: function(cb, fromTeacher) {
    exec(cb, null, PLUGIN_NAME, 'teacherActivation', [fromTeacher]);
  },
  connectTeacherObserver: function(cb, phrase) {
    exec(cb, null, PLUGIN_NAME, 'connectTeacherObserver', [phrase]);
  }
};

module.exports = MyCordovaPlugin;

MyCordovaPlugin.install = function () {
  if (!window.plugins) {
    window.plugins = {};
  }

  window.plugins.MyCordovaPlugin = new MyCordovaPlugin();
  return window.plugins.MyCordovaPlugin;
};

cordova.addConstructor(MyCordovaPlugin.install);

});
