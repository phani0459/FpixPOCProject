/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Radix\\project\\FpixTest\\platforms\\android\\app\\src\\main\\aidl\\org\\usc\\student\\IStudentService.aidl
 */
package org.usc.student;
public interface IStudentService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.usc.student.IStudentService
{
private static final java.lang.String DESCRIPTOR = "org.usc.student.IStudentService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.usc.student.IStudentService interface,
 * generating a proxy if needed.
 */
public static org.usc.student.IStudentService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.usc.student.IStudentService))) {
return ((org.usc.student.IStudentService)iin);
}
return new org.usc.student.IStudentService.Stub.Proxy(obj);
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
case TRANSACTION_registerCallBack:
{
data.enforceInterface(DESCRIPTOR);
org.usc.student.IStudentCallBack _arg0;
_arg0 = org.usc.student.IStudentCallBack.Stub.asInterface(data.readStrongBinder());
this.registerCallBack(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getTeacherData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.Map _result = this.getTeacherData(_arg0);
reply.writeNoException();
reply.writeMap(_result);
return true;
}
case TRANSACTION_currentTeacher:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.currentTeacher();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getTeachers:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<java.lang.String> _result = this.getTeachers();
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_selectTeacher:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.selectTeacher(_arg0);
reply.writeNoException();
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
case TRANSACTION_raiseHand:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.raiseHand(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_doStopCommand:
{
data.enforceInterface(DESCRIPTOR);
this.doStopCommand();
reply.writeNoException();
return true;
}
case TRANSACTION_hideStudent:
{
data.enforceInterface(DESCRIPTOR);
this.hideStudent();
reply.writeNoException();
return true;
}
case TRANSACTION_showStudent:
{
data.enforceInterface(DESCRIPTOR);
this.showStudent();
reply.writeNoException();
return true;
}
case TRANSACTION_sendFile:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.sendFile(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.usc.student.IStudentService
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
    	register student callback handler ( see IStudentCallBack.aidl )     
    */
@Override public void registerCallBack(org.usc.student.IStudentCallBack cb) throws android.os.RemoteException
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
/* From Version 5.x *//* get teacher data by teacher ID */
@Override public java.util.Map getTeacherData(java.lang.String teacherID) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.Map _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(teacherID);
mRemote.transact(Stub.TRANSACTION_getTeacherData, _data, _reply, 0);
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
@Override public java.lang.String currentTeacher() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_currentTeacher, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/* From Version 5.x *//* get a list of visible teachers */
@Override public java.util.List<java.lang.String> getTeachers() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTeachers, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/* From Version 5.x *//* select teacher to connect to ( doesnt have to be currently visible )*/
@Override public void selectTeacher(java.lang.String teacherID) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(teacherID);
mRemote.transact(Stub.TRANSACTION_selectTeacher, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
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
	 * Send byte array message to current teacher, the teacher will receive the
	 * message in TeacherClientCallBack onBytesMessage
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
	 * Send text to current teacher, the teacher will receive the
	 * message in TeacherClientCallBack onTextMessage
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
/* From Version 5.x *//* raise hand on connected teacher */
@Override public void raiseHand(boolean isRaise) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isRaise)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_raiseHand, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 7.x *//* Stop all running commands */
@Override public void doStopCommand() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_doStopCommand, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 8.x *//* Hide student from application drawer and notification bar */
@Override public void hideStudent() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hideStudent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 8.x *//* Show student in application drawer ( add to notification bar via preferences ) */
@Override public void showStudent() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_showStudent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 8.x *//* send a file to the teacher */
@Override public void sendFile(java.lang.String srcFile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(srcFile);
mRemote.transact(Stub.TRANSACTION_sendFile, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_registerCallBack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getTeacherData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_currentTeacher = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getTeachers = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_selectTeacher = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setIntPrefrence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setStringPrefrence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setBoolPrefrence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getIntPrefrence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getStringPrefrence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getBoolPrefrence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_sendBytesMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_sendTextMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_raiseHand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_doStopCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_hideStudent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_showStudent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_sendFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
}
/* From Version 5.x *//*
    	register student callback handler ( see IStudentCallBack.aidl )     
    */
public void registerCallBack(org.usc.student.IStudentCallBack cb) throws android.os.RemoteException;
/* From Version 5.x *//* get teacher data by teacher ID */
public java.util.Map getTeacherData(java.lang.String teacherID) throws android.os.RemoteException;
public java.lang.String currentTeacher() throws android.os.RemoteException;
/* From Version 5.x *//* get a list of visible teachers */
public java.util.List<java.lang.String> getTeachers() throws android.os.RemoteException;
/* From Version 5.x *//* select teacher to connect to ( doesnt have to be currently visible )*/
public void selectTeacher(java.lang.String teacherID) throws android.os.RemoteException;
/* From Version 5.x *//* set preferences */
public void setIntPrefrence(java.lang.String key, int value) throws android.os.RemoteException;
public void setStringPrefrence(java.lang.String key, java.lang.String value) throws android.os.RemoteException;
public void setBoolPrefrence(java.lang.String key, boolean value) throws android.os.RemoteException;
public int getIntPrefrence(java.lang.String key, int def) throws android.os.RemoteException;
public java.lang.String getStringPrefrence(java.lang.String key, java.lang.String def) throws android.os.RemoteException;
public boolean getBoolPrefrence(java.lang.String key, boolean def) throws android.os.RemoteException;
/* From Version 5.x *//*
	 * Send byte array message to current teacher, the teacher will receive the
	 * message in TeacherClientCallBack onBytesMessage
	 */
public void sendBytesMessage(byte[] bytes) throws android.os.RemoteException;
/* From Version 5.x *//*
	 * Send text to current teacher, the teacher will receive the
	 * message in TeacherClientCallBack onTextMessage
	 */
public void sendTextMessage(java.lang.String text) throws android.os.RemoteException;
/* From Version 5.x *//* raise hand on connected teacher */
public void raiseHand(boolean isRaise) throws android.os.RemoteException;
/* From Version 7.x *//* Stop all running commands */
public void doStopCommand() throws android.os.RemoteException;
/* From Version 8.x *//* Hide student from application drawer and notification bar */
public void hideStudent() throws android.os.RemoteException;
/* From Version 8.x *//* Show student in application drawer ( add to notification bar via preferences ) */
public void showStudent() throws android.os.RemoteException;
/* From Version 8.x *//* send a file to the teacher */
public void sendFile(java.lang.String srcFile) throws android.os.RemoteException;
}
