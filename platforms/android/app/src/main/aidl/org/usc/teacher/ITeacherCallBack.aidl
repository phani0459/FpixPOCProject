package org.usc.teacher;

import android.graphics.Bitmap;

/* Callback object, used for recieveing messages from the teacher service */
interface ITeacherCallBack {

	/* custom api for sdk messaging: used for application legacy data, sent on top of SmartClass comunication layer */
	/* the messaging api allows third party application to take advantage of Smart Class communication layer and send and recieve messages to and from students */
	
	/* From Version 5.x */
	/* Invoked when teacher has recieved a custom text message */
	/* text: the text message sent by the student*/	
	void onTextMessage(String text);
	
	/* From Version 5.x */
	/* Invoked when teacher has recieved a custom byte array message */
	/* bytes: the byte array message sent by the student */	
	void onBytesMessage(in byte[] bytes);
	
	/* From Version 5.x */
	/* Invoked when a new student has connected */
	/* studentID: the new student unique id */
	void studentConnected(String studentID);
	
	/* From Version 5.x */
	/* Invoked when a student has disconnected */
	/* studentID: the students unique id */
	void studentDisconnected(String studentID);
	
	/* From Version 5.x */
	/* Invoked when student data has beed updated ( fetch new data using: getStudentData in ITeacherService.aidl ) */
	/* studentID: the students unique id */
	void studentUpdated(String studentID);
	
	/* From Version 5.x */
	/* Invoked when a new thumbnail image has arrived from a student */
	/* studentID: the students unique id */
	/* thumbnailBitmap: the students new thumbnail image */
	void studentImageUpdated(String studentID,in Bitmap thumbnailBitmap);
	
	
}