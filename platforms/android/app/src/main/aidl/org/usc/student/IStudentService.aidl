package org.usc.student;

import org.usc.student.IStudentCallBack;
import android.os.Parcelable;

interface IStudentService {


	/* From Version 5.x */
	/*
    	register student callback handler ( see IStudentCallBack.aidl )     
    */
    void registerCallBack(IStudentCallBack cb);
    
    /* From Version 5.x */
    /* get teacher data by teacher ID */     
    Map getTeacherData(String teacherID);
    
    /* From Version 5.x */
    /* get current selected teacher */
    String currentTeacher();
    
    /* From Version 5.x */
    /* get a list of visible teachers */
    List<String> getTeachers();   
    
    /* From Version 5.x */
    /* select teacher to connect to ( doesnt have to be currently visible )*/
    void selectTeacher(String teacherID);
    
    /* From Version 5.x */
    /* set preferences */
    void setIntPrefrence(String key,int value);
    void setStringPrefrence(String key,String value);
    void setBoolPrefrence(String key,boolean value);
        
    /* From Version 5.x */
    /* get preferences */
    int getIntPrefrence(String key,int def);
    String getStringPrefrence(String key,String def);
    boolean getBoolPrefrence(String key,boolean def);
    
    /* From Version 5.x */
     /*
	 * Send byte array message to current teacher, the teacher will receive the
	 * message in TeacherClientCallBack onBytesMessage
	 */
    void sendBytesMessage(in byte[] bytes);
    
    /* From Version 5.x */
    /*
	 * Send text to current teacher, the teacher will receive the
	 * message in TeacherClientCallBack onTextMessage
	 */
    void sendTextMessage(String text);
    
    /* From Version 5.x */
    /* raise hand on connected teacher */
    void raiseHand(boolean isRaise);  
    
    /* From Version 7.x */
    /* Stop all running commands */
    void doStopCommand();
    
    /* From Version 8.x */
    /* Hide student from application drawer and notification bar */
    
    void hideStudent();
    
    /* From Version 8.x */
    /* Show student in application drawer ( add to notification bar via preferences ) */
    
	void showStudent();
	
	/* From Version 8.x */
	/* send a file to the teacher */
	void sendFile(String srcFile);
	
       
}