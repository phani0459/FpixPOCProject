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
        document.getElementById("get_students").addEventListener("click", this.getStudents);
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
    	MyCordovaPlugin.registerCallBack(function() {}, "teacher");
    },

    sendMessage: function() {
    	
    },

    stopAll: function() {
    	
    },

    screenBraodCast: function() {
    	MyCordovaPlugin.screenBraodCast("screenBraodCast");
    },

    remoteAssistance: function() {
	   MyCordovaPlugin.remoteAssistance("remoteAssistance");	
    },

    attention: function() {
        MyCordovaPlugin.attention("attention");
    },

    getStudents: function() {
        MyCordovaPlugin.getStudents(function(studentJson) {
            var node = document.getElementById("studentsList");
                while (node.hasChildNodes()) {
                   node.removeChild(node.lastChild);
            }
           $.each(studentJson, function (index, value) {
                var htmlCode = '<div class="teacher"> <label class = "left" for="student' + index + '">';
                htmlCode = htmlCode + value;
                htmlCode = htmlCode + '</label>' + 
                    ' <input  class = "right" type="checkbox" id="student' + index + '" name="selectStudent" value="' + value + '"> </div>'
                console.log(value);
                var radioBtn = $(htmlCode);
                radioBtn.appendTo('.listStudent');
            });
           $('.listStudent input[name="selectStudent"]').change(function(){
                var checkBoxvalue = $(this).val();
                console.log(checkBoxvalue)
                MyCordovaPlugin.selectStudent(checkBoxvalue, "" + this.checked);
            });
        }, "dummy");
    }

};

  function activateClient() {
		MyCordovaPlugin.showActivationDialog("USC-TEACHER-DEMO");
  }

 function sendCommandsEnabled(isDisable) {
    	/*var divTwo = document.getElementById("divTwo");
    	all = divTwo.getElementsByTagName('button');
    	
    	var i;
		for (i = 0; i < all.length; i++) {
    		all[i].disabled = isDisable;
		}
*/

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