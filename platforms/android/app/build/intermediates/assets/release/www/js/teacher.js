/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
var app = {
    // Application Constructor
    initialize: function() {
        document.addEventListener('deviceready', this.onDeviceReady.bind(this), false);
        document.getElementById("activate").addEventListener("click", this.checkAppAvailability);
        document.getElementById("connect").addEventListener("click", this.connectTeacherService);
        document.getElementById("register_callBack").addEventListener("click", this.registerCallBack);
        document.getElementById("sendmessage").addEventListener("click", this.sendMessage);
        document.getElementById("attention").addEventListener("click", this.attention);
        document.getElementById("stop").addEventListener("click", this.stopAll);
        document.getElementById("screen_broadcast").addEventListener("click", this.screenBraodCast);
        document.getElementById("remote_assist").addEventListener("click", this.remoteAssistance);
    },

    // deviceready Event Handler
    //
    // Bind any cordova events here. Common events are:
    // 'pause', 'resume', etc.
    onDeviceReady: function() {
    	MyCordovaPlugin.teacher(function(isDisable) {
    		sendCommandsEnabled(isDisable);
        }, "just in case");
    	
    	MyCordovaPlugin.activation("com.usco.teacher");

    	MyCordovaPlugin.connectTeacherObserver(function(isDisable) {
    		sendCommandsEnabled(isDisable);
    	}, "dummy phrase");

    },

    checkAppAvailability: function() {
        
        MyCordovaPlugin.service_availability("com.usco.teacher", function(isServiceAvailable) {
            if (isServiceAvailable) {
            	activateClient();
            } else {
            	MyCordovaPlugin.showToast("Please install Teacher Service");
            }
        });

    },

    connectTeacherService: function() {
        
        MyCordovaPlugin.service_availability("com.usco.teacher", function(isServiceAvailable) {
            if (isServiceAvailable) {
            	MyCordovaPlugin.connectBtn("2");
            } else {
            	MyCordovaPlugin.showToast("Please install Teacher Service");
            }
        });

    },

    registerCallBack: function() {
    	
    },

    sendMessage: function() {
    	
    },

    stopAll: function() {
    	
    },

    screenBraodCast: function() {
    	
    },

    remoteAssistance: function() {
		
    },

    attention: function() {

    }

};

  function activateClient() {
		MyCordovaPlugin.showActivationDialog("USC-TEACHER-DEMO");
  }

 function sendCommandsEnabled(isDisable) {
    	var divTwo = document.getElementById("divTwo");
    	all = divTwo.getElementsByTagName('button');
    	
    	var i;
		for (i = 0; i < all.length; i++) {
    		all[i].disabled = true;
		}


		var divThree = document.getElementById("divThree");
    	threeAll = divThree.getElementsByTagName('button');
    	
		for (i = 0; i < threeAll.length; i++) {
    		threeAll[i].disabled = isDisable;
		}

        var divFour = document.getElementById("divFour");
        all = divFour.getElementsByTagName('button');
        
        for (i = 0; i < all.length; i++) {
            all[i].disabled = isDisable;
        }
 }

app.initialize();