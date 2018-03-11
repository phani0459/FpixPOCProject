package org.usc.teacher;

import org.usc.teacher.ITeacherCallBack;

interface ITeacherService {

	/* From Version 5.x */
	/*
	 * send stop current operation to selected students ( or all if no one is selected )
	 */
	 
	void stop();
    
    /* From Version 5.x */
    /*
	 * send attention command to selected students ( or all if no one is selected )
	 */
    
    void attention();
    
    /* From Version 5.x */
    /*
    	register teacher callback handler ( see ITeacherCallBack.aidl )     
    */
    
    void registerCallBack(ITeacherCallBack cb);
    
    /* From Version 5.x */
    /* select or unselect a student */
    
    void setStudentSelected(String studentID,boolean selected);
    
    /* From Version 5.x */
    /*
	 * get student information in a Map<String,String> with values: 
	 * ip, os, 
	 * handup: is hand raised, "true" or "false" values 
	 * selected: is selected, "true" or "false" values  
	 * battery: battery level ( since 8.x )
	 */
    
    Map getStudentData(String studentID);
    
    /* From Version 5.x */
    /* get connected students list */
     
    List<String> getStudents();
    
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
	 * Broadcast the teachers screen to selected students ( or all if no one is selected )
	 */
    
    void screenBroadcast();
    
    /* From Version 5.x */
    /* remote control and view the first selected student */
    
    void remoteAssitance();
    
    /* From Version 5.x */
    /*
	 * Send byte array to selected students ( or all if no one is selected ), the student will
	 * receive the message in StudentClientCallBack onBytesMessage
	 */
    
    void sendBytesMessage(in byte[] bytes);
    
    /* From Version 5.x */
    /*
	 * Send text to selected students ( or all if no one is selected ), the student will receive the
	 * message in StudentClientCallBack onTextMessage
	 */
    
    void sendTextMessage(String text);    
    
    /* From Version 5.x */
    /*
	 * send file synchronously to selected students ( or all if no one is selected ) src: full path
	 * of source file dest full path of destination file in the students device
	 * defaultFallBackLocaltion: location in students device were to place the file if the 'dest'
	 * value is not valid timeout: timeout in milliseconds to wait for send to complete or -1 for
	 * infinite
	 */
	
    String sendFile(String src,String dest,String defaultFallBackLocaltion,int timeout);
    
    /* From Version 5.x */
    /*
	 * collect file synchronously from selected students ( or all if no one is selected ) src: full
	 * path of source file in the students device dest full path of destination file in the teachers
	 * device defaultFallBackLocaltion: location in teachers device were to place the file if the
	 * 'dest' value is not valid timeout: timeout in milliseconds to wait for transfer to complete
	 * or -1 for infinite
	 */
	
    String collectFile(String src,String dest,String defaultFallBackLocaltion,int timeout);
    
    /* From Version 5.x */
    /* Hide teacher from application drawer and notification bar ( floating toolbar ) */
    void hideTeacher();
    
    /* From Version 5.x */
    /* Show teacher in application drawer ( add floating toolbar via preferences ) */
	void showTeacher();
	
	
	/* From Version 8.x */
	/* send chat message to selected students ( or all if no one is selected ) */
	void sendChatMessage(String message);
	
	/* From Version 8.x */
	/* send popup message to selected students ( or all if no one is selected ) */
	void sendPopupMessage(String message);
	
	/* From Version 8.x */
	/* Create a pop quiz file, 'answers' should contain at least one and up to 4 possible answers,  
		'quizFileDest' should be a valid path for the created quiz to be saved 
	*/
	void createAndSavePopQuiz(String question,in List<String> answers,String quizFileDest);
	
	/* From Version 8.x */
	/* start a slide show of the selected students screens ( slides interval can be configured via 'prefrence_slide_show_interval' preference */
	void slideShow();
	
	/* From Version 8.x */
	/* get students packages in a list of maps List<Map<String,String>>, each package info will be stored in a hash map with the keys: 'package','isblocked' */
	List getAllStudentsPackages();
	
	/* From Version 8.x */
	/* set block or unblock for a package and send to selected students */
	void blockUnBlockApp(String packageName, boolean block);
	
	/* From Version 8.x */
	/* reboot selected students */
	void reboot();
	
	/* From Version 8.x */
	/* shutdown selected students */
	void shutdown();
	
	/* From Version 8.x */
	/* wake selected students */
	void wakeUp();
	
	/* From Version 8.x */
	/* send sleep command to selected students */
	void sleep();
	
	/* From Version 8.x */
	/* remote install apk to selected students */
	void remoteInstall(String fullPathToApk);
	
	/* From Version 8.x */
	/* block selected students web access */
	void blockWeb(boolean isBlock);
	
	/* From Version 8.x */
	/* Safe students attendance to a file */
	void saveStudentAttendance(String pathToAttendaceFile);
	
	/* From Version 8.x */
	/* open a collaborative whiteboard */
	void openWhiteBoard();
	
}