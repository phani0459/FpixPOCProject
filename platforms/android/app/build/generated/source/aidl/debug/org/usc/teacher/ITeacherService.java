/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Radix\\project\\FpixPOCProject\\platforms\\android\\app\\src\\main\\aidl\\org\\usc\\teacher\\ITeacherService.aidl
 */
package org.usc.teacher;
public interface ITeacherService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.usc.teacher.ITeacherService
{
private static final java.lang.String DESCRIPTOR = "org.usc.teacher.ITeacherService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.usc.teacher.ITeacherService interface,
 * generating a proxy if needed.
 */
public static org.usc.teacher.ITeacherService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.usc.teacher.ITeacherService))) {
return ((org.usc.teacher.ITeacherService)iin);
}
return new org.usc.teacher.ITeacherService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_stop:
{
data.enforceInterface(DESCRIPTOR);
this.stop();
reply.writeNoException();
return true;
}
case TRANSACTION_attention:
{
data.enforceInterface(DESCRIPTOR);
this.attention();
reply.writeNoException();
return true;
}
case TRANSACTION_registerCallBack:
{
data.enforceInterface(DESCRIPTOR);
org.usc.teacher.ITeacherCallBack _arg0;
_arg0 = org.usc.teacher.ITeacherCallBack.Stub.asInterface(data.readStrongBinder());
this.registerCallBack(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setStudentSelected:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setStudentSelected(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getStudentData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.Map _result = this.getStudentData(_arg0);
reply.writeNoException();
reply.writeMap(_result);
return true;
}
case TRANSACTION_getStudents:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<java.lang.String> _result = this.getStudents();
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_setIntPrefrence:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.setIntPrefrence(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setStringPrefrence:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.setStringPrefrence(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setBoolPrefrence:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setBoolPrefrence(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getIntPrefrence:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _result = this.getIntPrefrence(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getStringPrefrence:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getStringPrefrence(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getBoolPrefrence:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _result = this.getBoolPrefrence(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_screenBroadcast:
{
data.enforceInterface(DESCRIPTOR);
this.screenBroadcast();
reply.writeNoException();
return true;
}
case TRANSACTION_remoteAssitance:
{
data.enforceInterface(DESCRIPTOR);
this.remoteAssitance();
reply.writeNoException();
return true;
}
case TRANSACTION_sendBytesMessage:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
this.sendBytesMessage(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_sendTextMessage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.sendTextMessage(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_sendFile:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
java.lang.String _result = this.sendFile(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_collectFile:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
java.lang.String _result = this.collectFile(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_hideTeacher:
{
data.enforceInterface(DESCRIPTOR);
this.hideTeacher();
reply.writeNoException();
return true;
}
case TRANSACTION_showTeacher:
{
data.enforceInterface(DESCRIPTOR);
this.showTeacher();
reply.writeNoException();
return true;
}
case TRANSACTION_sendChatMessage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.sendChatMessage(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_sendPopupMessage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.sendPopupMessage(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_createAndSavePopQuiz:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<java.lang.String> _arg1;
_arg1 = data.createStringArrayList();
java.lang.String _arg2;
_arg2 = data.readString();
this.createAndSavePopQuiz(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_slideShow:
{
data.enforceInterface(DESCRIPTOR);
this.slideShow();
reply.writeNoException();
return true;
}
case TRANSACTION_getAllStudentsPackages:
{
data.enforceInterface(DESCRIPTOR);
java.util.List _result = this.getAllStudentsPackages();
reply.writeNoException();
reply.writeList(_result);
return true;
}
case TRANSACTION_blockUnBlockApp:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.blockUnBlockApp(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_reboot:
{
data.enforceInterface(DESCRIPTOR);
this.reboot();
reply.writeNoException();
return true;
}
case TRANSACTION_shutdown:
{
data.enforceInterface(DESCRIPTOR);
this.shutdown();
reply.writeNoException();
return true;
}
case TRANSACTION_wakeUp:
{
data.enforceInterface(DESCRIPTOR);
this.wakeUp();
reply.writeNoException();
return true;
}
case TRANSACTION_sleep:
{
data.enforceInterface(DESCRIPTOR);
this.sleep();
reply.writeNoException();
return true;
}
case TRANSACTION_remoteInstall:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.remoteInstall(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_blockWeb:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.blockWeb(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_saveStudentAttendance:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.saveStudentAttendance(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_openWhiteBoard:
{
data.enforceInterface(DESCRIPTOR);
this.openWhiteBoard();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.usc.teacher.ITeacherService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/* From Version 5.x *//*
	 * send stop current operation to selected students ( or all if no one is selected )
	 */
@Override public void stop() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stop, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 5.x *//*
	 * send attention command to selected students ( or all if no one is selected )
	 */
@Override public void attention() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_attention, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 5.x *//*
    	register teacher callback handler ( see ITeacherCallBack.aidl )     
    */
@Override public void registerCallBack(org.usc.teacher.ITeacherCallBack cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerCallBack, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 5.x *//* select or unselect a student */
@Override public void setStudentSelected(java.lang.String studentID, boolean selected) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(studentID);
_data.writeInt(((selected)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setStudentSelected, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 5.x *//*
	 * get student information in a Map<String,String> with values: 
	 * ip, os, 
	 * handup: is hand raised, "true" or "false" values 
	 * selected: is selected, "true" or "false" values  
	 * battery: battery level ( since 8.x )
	 */
@Override public java.util.Map getStudentData(java.lang.String studentID) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.Map _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(studentID);
mRemote.transact(Stub.TRANSACTION_getStudentData, _data, _reply, 0);
_reply.readException();
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_result = _reply.readHashMap(cl);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/* From Version 5.x *//* get connected students list */
@Override public java.util.List<java.lang.String> getStudents() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getStudents, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/* From Version 5.x *//* set preferences */
@Override public void setIntPrefrence(java.lang.String key, int value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeInt(value);
mRemote.transact(Stub.TRANSACTION_setIntPrefrence, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setStringPrefrence(java.lang.String key, java.lang.String value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeString(value);
mRemote.transact(Stub.TRANSACTION_setStringPrefrence, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setBoolPrefrence(java.lang.String key, boolean value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeInt(((value)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setBoolPrefrence, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getIntPrefrence(java.lang.String key, int def) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeInt(def);
mRemote.transact(Stub.TRANSACTION_getIntPrefrence, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getStringPrefrence(java.lang.String key, java.lang.String def) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeString(def);
mRemote.transact(Stub.TRANSACTION_getStringPrefrence, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean getBoolPrefrence(java.lang.String key, boolean def) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeInt(((def)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getBoolPrefrence, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/* From Version 5.x *//*
	 * Broadcast the teachers screen to selected students ( or all if no one is selected )
	 */
@Override public void screenBroadcast() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_screenBroadcast, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 5.x *//* remote control and view the first selected student */
@Override public void remoteAssitance() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_remoteAssitance, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 5.x *//*
	 * Send byte array to selected students ( or all if no one is selected ), the student will
	 * receive the message in StudentClientCallBack onBytesMessage
	 */
@Override public void sendBytesMessage(byte[] bytes) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(bytes);
mRemote.transact(Stub.TRANSACTION_sendBytesMessage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 5.x *//*
	 * Send text to selected students ( or all if no one is selected ), the student will receive the
	 * message in StudentClientCallBack onTextMessage
	 */
@Override public void sendTextMessage(java.lang.String text) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(text);
mRemote.transact(Stub.TRANSACTION_sendTextMessage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String sendFile(java.lang.String src, java.lang.String dest, java.lang.String defaultFallBackLocaltion, int timeout) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(src);
_data.writeString(dest);
_data.writeString(defaultFallBackLocaltion);
_data.writeInt(timeout);
mRemote.transact(Stub.TRANSACTION_sendFile, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String collectFile(java.lang.String src, java.lang.String dest, java.lang.String defaultFallBackLocaltion, int timeout) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(src);
_data.writeString(dest);
_data.writeString(defaultFallBackLocaltion);
_data.writeInt(timeout);
mRemote.transact(Stub.TRANSACTION_collectFile, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/* From Version 5.x *//* Hide teacher from application drawer and notification bar ( floating toolbar ) */
@Override public void hideTeacher() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hideTeacher, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 5.x *//* Show teacher in application drawer ( add floating toolbar via preferences ) */
@Override public void showTeacher() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_showTeacher, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 8.x *//* send chat message to selected students ( or all if no one is selected ) */
@Override public void sendChatMessage(java.lang.String message) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(message);
mRemote.transact(Stub.TRANSACTION_sendChatMessage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 8.x *//* send popup message to selected students ( or all if no one is selected ) */
@Override public void sendPopupMessage(java.lang.String message) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(message);
mRemote.transact(Stub.TRANSACTION_sendPopupMessage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 8.x *//* Create a pop quiz file, 'answers' should contain at least one and up to 4 possible answers,  
		'quizFileDest' should be a valid path for the created quiz to be saved 
	*/
@Override public void createAndSavePopQuiz(java.lang.String question, java.util.List<java.lang.String> answers, java.lang.String quizFileDest) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(question);
_data.writeStringList(answers);
_data.writeString(quizFileDest);
mRemote.transact(Stub.TRANSACTION_createAndSavePopQuiz, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 8.x *//* start a slide show of the selected students screens ( slides interval can be configured via 'prefrence_slide_show_interval' preference */
@Override public void slideShow() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_slideShow, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 8.x *//* get students packages in a list of maps List<Map<String,String>>, each package info will be stored in a hash map with the keys: 'package','isblocked' */
@Override public java.util.List getAllStudentsPackages() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAllStudentsPackages, _data, _reply, 0);
_reply.readException();
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_result = _reply.readArrayList(cl);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/* From Version 8.x *//* set block or unblock for a package and send to selected students */
@Override public void blockUnBlockApp(java.lang.String packageName, boolean block) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(((block)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_blockUnBlockApp, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 8.x *//* reboot selected students */
@Override public void reboot() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_reboot, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 8.x *//* shutdown selected students */
@Override public void shutdown() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_shutdown, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 8.x *//* wake selected students */
@Override public void wakeUp() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_wakeUp, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 8.x *//* send sleep command to selected students */
@Override public void sleep() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_sleep, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 8.x *//* remote install apk to selected students */
@Override public void remoteInstall(java.lang.String fullPathToApk) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(fullPathToApk);
mRemote.transact(Stub.TRANSACTION_remoteInstall, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 8.x *//* block selected students web access */
@Override public void blockWeb(boolean isBlock) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isBlock)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_blockWeb, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 8.x *//* Safe students attendance to a file */
@Override public void saveStudentAttendance(java.lang.String pathToAttendaceFile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pathToAttendaceFile);
mRemote.transact(Stub.TRANSACTION_saveStudentAttendance, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 8.x *//* open a collaborative whiteboard */
@Override public void openWhiteBoard() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_openWhiteBoard, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_stop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_attention = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_registerCallBack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setStudentSelected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getStudentData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getStudents = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setIntPrefrence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setStringPrefrence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setBoolPrefrence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getIntPrefrence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getStringPrefrence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getBoolPrefrence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_screenBroadcast = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_remoteAssitance = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_sendBytesMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_sendTextMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_sendFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_collectFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_hideTeacher = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_showTeacher = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_sendChatMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_sendPopupMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_createAndSavePopQuiz = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_slideShow = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_getAllStudentsPackages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_blockUnBlockApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_reboot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_shutdown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_wakeUp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_sleep = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_remoteInstall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_blockWeb = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_saveStudentAttendance = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_openWhiteBoard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
}
/* From Version 5.x *//*
	 * send stop current operation to selected students ( or all if no one is selected )
	 */
public void stop() throws android.os.RemoteException;
/* From Version 5.x *//*
	 * send attention command to selected students ( or all if no one is selected )
	 */
public void attention() throws android.os.RemoteException;
/* From Version 5.x *//*
    	register teacher callback handler ( see ITeacherCallBack.aidl )     
    */
public void registerCallBack(org.usc.teacher.ITeacherCallBack cb) throws android.os.RemoteException;
/* From Version 5.x *//* select or unselect a student */
public void setStudentSelected(java.lang.String studentID, boolean selected) throws android.os.RemoteException;
/* From Version 5.x *//*
	 * get student information in a Map<String,String> with values: 
	 * ip, os, 
	 * handup: is hand raised, "true" or "false" values 
	 * selected: is selected, "true" or "false" values  
	 * battery: battery level ( since 8.x )
	 */
public java.util.Map getStudentData(java.lang.String studentID) throws android.os.RemoteException;
/* From Version 5.x *//* get connected students list */
public java.util.List<java.lang.String> getStudents() throws android.os.RemoteException;
/* From Version 5.x *//* set preferences */
public void setIntPrefrence(java.lang.String key, int value) throws android.os.RemoteException;
public void setStringPrefrence(java.lang.String key, java.lang.String value) throws android.os.RemoteException;
public void setBoolPrefrence(java.lang.String key, boolean value) throws android.os.RemoteException;
public int getIntPrefrence(java.lang.String key, int def) throws android.os.RemoteException;
public java.lang.String getStringPrefrence(java.lang.String key, java.lang.String def) throws android.os.RemoteException;
public boolean getBoolPrefrence(java.lang.String key, boolean def) throws android.os.RemoteException;
/* From Version 5.x *//*
	 * Broadcast the teachers screen to selected students ( or all if no one is selected )
	 */
public void screenBroadcast() throws android.os.RemoteException;
/* From Version 5.x *//* remote control and view the first selected student */
public void remoteAssitance() throws android.os.RemoteException;
/* From Version 5.x *//*
	 * Send byte array to selected students ( or all if no one is selected ), the student will
	 * receive the message in StudentClientCallBack onBytesMessage
	 */
public void sendBytesMessage(byte[] bytes) throws android.os.RemoteException;
/* From Version 5.x *//*
	 * Send text to selected students ( or all if no one is selected ), the student will receive the
	 * message in StudentClientCallBack onTextMessage
	 */
public void sendTextMessage(java.lang.String text) throws android.os.RemoteException;
public java.lang.String sendFile(java.lang.String src, java.lang.String dest, java.lang.String defaultFallBackLocaltion, int timeout) throws android.os.RemoteException;
public java.lang.String collectFile(java.lang.String src, java.lang.String dest, java.lang.String defaultFallBackLocaltion, int timeout) throws android.os.RemoteException;
/* From Version 5.x *//* Hide teacher from application drawer and notification bar ( floating toolbar ) */
public void hideTeacher() throws android.os.RemoteException;
/* From Version 5.x *//* Show teacher in application drawer ( add floating toolbar via preferences ) */
public void showTeacher() throws android.os.RemoteException;
/* From Version 8.x *//* send chat message to selected students ( or all if no one is selected ) */
public void sendChatMessage(java.lang.String message) throws android.os.RemoteException;
/* From Version 8.x *//* send popup message to selected students ( or all if no one is selected ) */
public void sendPopupMessage(java.lang.String message) throws android.os.RemoteException;
/* From Version 8.x *//* Create a pop quiz file, 'answers' should contain at least one and up to 4 possible answers,  
		'quizFileDest' should be a valid path for the created quiz to be saved 
	*/
public void createAndSavePopQuiz(java.lang.String question, java.util.List<java.lang.String> answers, java.lang.String quizFileDest) throws android.os.RemoteException;
/* From Version 8.x *//* start a slide show of the selected students screens ( slides interval can be configured via 'prefrence_slide_show_interval' preference */
public void slideShow() throws android.os.RemoteException;
/* From Version 8.x *//* get students packages in a list of maps List<Map<String,String>>, each package info will be stored in a hash map with the keys: 'package','isblocked' */
public java.util.List getAllStudentsPackages() throws android.os.RemoteException;
/* From Version 8.x *//* set block or unblock for a package and send to selected students */
public void blockUnBlockApp(java.lang.String packageName, boolean block) throws android.os.RemoteException;
/* From Version 8.x *//* reboot selected students */
public void reboot() throws android.os.RemoteException;
/* From Version 8.x *//* shutdown selected students */
public void shutdown() throws android.os.RemoteException;
/* From Version 8.x *//* wake selected students */
public void wakeUp() throws android.os.RemoteException;
/* From Version 8.x *//* send sleep command to selected students */
public void sleep() throws android.os.RemoteException;
/* From Version 8.x *//* remote install apk to selected students */
public void remoteInstall(java.lang.String fullPathToApk) throws android.os.RemoteException;
/* From Version 8.x *//* block selected students web access */
public void blockWeb(boolean isBlock) throws android.os.RemoteException;
/* From Version 8.x *//* Safe students attendance to a file */
public void saveStudentAttendance(java.lang.String pathToAttendaceFile) throws android.os.RemoteException;
/* From Version 8.x *//* open a collaborative whiteboard */
public void openWhiteBoard() throws android.os.RemoteException;
}
