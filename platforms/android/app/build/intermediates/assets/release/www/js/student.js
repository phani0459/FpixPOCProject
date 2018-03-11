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
        document.getElementById("connect").addEventListener("click", this.connectStudentService);
        document.getElementById("register_callBack").addEventListener("click", this.registerCallBack);
        document.getElementById("sendmessage").addEventListener("click", this.sendMessage);
        document.getElementById("stop_all").addEventListener("click", this.stopAll);
        document.getElementById("raise_hand").addEventListener("click", this.raiseHand);
        document.getElementById("hand_down").addEventListener("click", this.handDown);
        document.getElementById("set_name").addEventListener("click", this.setName);
        document.getElementById("get_teachers").addEventListener("click", this.getTeachers);
    },

    // deviceready Event Handler
    //
    // Bind any cordova events here. Common events are:
    // 'pause', 'resume', etc.
    onDeviceReady: function() {
    	MyCordovaPlugin.student(function(isDisable) {
    		sendCommandsEnabled(isDisable);
        }, "just in case");
    	
    	MyCordovaPlugin.activation(function() {}, "com.usco.student");

    	MyCordovaPlugin.connect_observer(function(isDisable) {
    		sendCommandsEnabled(isDisable);
    	}, "dummy phrase");

    },

    checkAppAvailability: function() {
        
        MyCordovaPlugin.service_availability("com.usco.student", function(isServiceAvailable) {
            if (isServiceAvailable) {
            	activateClient();
            } else {
            	MyCordovaPlugin.showToast("Please install Student Service");
            }
        });

    },

    connectStudentService: function() {
        
        MyCordovaPlugin.service_availability("com.usco.student", function(isServiceAvailable) {
            if (isServiceAvailable) {
            	MyCordovaPlugin.connectBtn("connectBtn");
            } else {
            	MyCordovaPlugin.showToast("Please install Student Service");
            }
        });

    },

    registerCallBack: function() {
    	MyCordovaPlugin.registerCallBack(function() {}, "dummy phrase");
    },

    sendMessage: function() {
    	MyCordovaPlugin.customMessage("dummy phrase");
    },

    stopAll: function() {
    	MyCordovaPlugin.stopAll("dummy phrase");
    },

    raiseHand: function() {
    	MyCordovaPlugin.raiseHand("dummy phrase");
    },

    handDown: function() {
		MyCordovaPlugin.handDown("dummy phrase");
    },

    setName: function() {
        MyCordovaPlugin.setStudentName(function() {}, "dummy phrase");
    }, 

    getTeachers: function() {
        MyCordovaPlugin.getTeachers(function(teacherJson) {
            console.log(teacherJson);
        }, "dummy");
    }

};

    function activateClient() {
	   MyCordovaPlugin.showActivationDialog("showActivationDialog");
    }

    function sendCommandsEnabled(isDisable) {
        var divTwo = document.getElementById("divTwo");
        all = divTwo.getElementsByTagName('button');
    	
    	var i;
    	for (i = 0; i < all.length; i++) {
    		all[i].disabled = isDisable;
    	}


    	var divThree = document.getElementById("divThree");
    	threeAll = divThree.getElementsByTagName('button');
    	
    	for (i = 0; i < threeAll.length; i++) {
    		threeAll[i].disabled = isDisable;
    	}
    }


/*    var teacher_val = document.getElementsByName("selectTeacher");
    for(i=0;i<teacher_val.length;i++){
        alert(this.id)
    }
    
    $('input[name="selectTeacher"]').click(function(){});
*/


app.initialize();