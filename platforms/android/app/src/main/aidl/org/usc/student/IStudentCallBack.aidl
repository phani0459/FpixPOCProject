package org.usc.student;

import android.graphics.Bitmap;

/* Callback object, used for recieveing messages from the student service */
interface IStudentCallBack {

	/* custom api for sdk messaging: used for application legacy data, sent on top of SmartClass comunication layer */
	/* the messaging api allows third party application to take advantage of Smart Class communication layer and send and recieve messages to and from students */
	
	/* From Version 5.x */
	/* Invoked when student has recieved a custom text message */
	/* text: the text message sent by the teacher*/	
	void onTextMessage(String text);
	
	/* From Version 5.x */
	/* Invoked when student has recieved a custom byte array message */
	/* bytes: the byte array message sent by the teacher*/	
	void onBytesMessage(in byte[] bytes);
	
	/* From Version 5.x */
	/* Invoked when student is connected to a new teacher */
	/* teacherID: the new teacher unique id */
	void studentConnected(String teacherID);
	
	/* From Version 5.x */
	/* Invoked when student is disconnected*/	
	void studentDisconnected();	
	
	/* From Version 5.x */
	/* Invoked when student has recieved a stop command*/
	void onStopCommand();
	
	
	/* From Version 5.x */
	/* Invoked when student has recieved a silence ( attention) command */
	/* silence: true if student should enter attention mode and false if student is released from attention mode */
	void onSilenceCommand(boolean silence);
	
	
}