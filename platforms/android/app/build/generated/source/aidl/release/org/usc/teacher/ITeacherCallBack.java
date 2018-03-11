/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Radix\\project\\FpixTest\\platforms\\android\\app\\src\\main\\aidl\\org\\usc\\teacher\\ITeacherCallBack.aidl
 */
package org.usc.teacher;
/* Callback object, used for recieveing messages from the teacher service */
public interface ITeacherCallBack extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.usc.teacher.ITeacherCallBack
{
private static final java.lang.String DESCRIPTOR = "org.usc.teacher.ITeacherCallBack";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.usc.teacher.ITeacherCallBack interface,
 * generating a proxy if needed.
 */
public static org.usc.teacher.ITeacherCallBack asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.usc.teacher.ITeacherCallBack))) {
return ((org.usc.teacher.ITeacherCallBack)iin);
}
return new org.usc.teacher.ITeacherCallBack.Stub.Proxy(obj);
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
case TRANSACTION_onTextMessage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.onTextMessage(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onBytesMessage:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
this.onBytesMessage(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_studentConnected:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.studentConnected(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_studentDisconnected:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.studentDisconnected(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_studentUpdated:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.studentUpdated(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_studentImageUpdated:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.graphics.Bitmap _arg1;
if ((0!=data.readInt())) {
_arg1 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.studentImageUpdated(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.usc.teacher.ITeacherCallBack
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
/* custom api for sdk messaging: used for application legacy data, sent on top of SmartClass comunication layer *//* the messaging api allows third party application to take advantage of Smart Class communication layer and send and recieve messages to and from students *//* From Version 5.x *//* Invoked when teacher has recieved a custom text message *//* text: the text message sent by the student*/
@Override public void onTextMessage(java.lang.String text) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(text);
mRemote.transact(Stub.TRANSACTION_onTextMessage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 5.x *//* Invoked when teacher has recieved a custom byte array message *//* bytes: the byte array message sent by the student */
@Override public void onBytesMessage(byte[] bytes) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(bytes);
mRemote.transact(Stub.TRANSACTION_onBytesMessage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 5.x *//* Invoked when a new student has connected *//* studentID: the new student unique id */
@Override public void studentConnected(java.lang.String studentID) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(studentID);
mRemote.transact(Stub.TRANSACTION_studentConnected, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 5.x *//* Invoked when a student has disconnected *//* studentID: the students unique id */
@Override public void studentDisconnected(java.lang.String studentID) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(studentID);
mRemote.transact(Stub.TRANSACTION_studentDisconnected, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 5.x *//* Invoked when student data has beed updated ( fetch new data using: getStudentData in ITeacherService.aidl ) *//* studentID: the students unique id */
@Override public void studentUpdated(java.lang.String studentID) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(studentID);
mRemote.transact(Stub.TRANSACTION_studentUpdated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 5.x *//* Invoked when a new thumbnail image has arrived from a student *//* studentID: the students unique id *//* thumbnailBitmap: the students new thumbnail image */
@Override public void studentImageUpdated(java.lang.String studentID, android.graphics.Bitmap thumbnailBitmap) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(studentID);
if ((thumbnailBitmap!=null)) {
_data.writeInt(1);
thumbnailBitmap.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_studentImageUpdated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onTextMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onBytesMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_studentConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_studentDisconnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_studentUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_studentImageUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
/* custom api for sdk messaging: used for application legacy data, sent on top of SmartClass comunication layer *//* the messaging api allows third party application to take advantage of Smart Class communication layer and send and recieve messages to and from students *//* From Version 5.x *//* Invoked when teacher has recieved a custom text message *//* text: the text message sent by the student*/
public void onTextMessage(java.lang.String text) throws android.os.RemoteException;
/* From Version 5.x *//* Invoked when teacher has recieved a custom byte array message *//* bytes: the byte array message sent by the student */
public void onBytesMessage(byte[] bytes) throws android.os.RemoteException;
/* From Version 5.x *//* Invoked when a new student has connected *//* studentID: the new student unique id */
public void studentConnected(java.lang.String studentID) throws android.os.RemoteException;
/* From Version 5.x *//* Invoked when a student has disconnected *//* studentID: the students unique id */
public void studentDisconnected(java.lang.String studentID) throws android.os.RemoteException;
/* From Version 5.x *//* Invoked when student data has beed updated ( fetch new data using: getStudentData in ITeacherService.aidl ) *//* studentID: the students unique id */
public void studentUpdated(java.lang.String studentID) throws android.os.RemoteException;
/* From Version 5.x *//* Invoked when a new thumbnail image has arrived from a student *//* studentID: the students unique id *//* thumbnailBitmap: the students new thumbnail image */
public void studentImageUpdated(java.lang.String studentID, android.graphics.Bitmap thumbnailBitmap) throws android.os.RemoteException;
}
