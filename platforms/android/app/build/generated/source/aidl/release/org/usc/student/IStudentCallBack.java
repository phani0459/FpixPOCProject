/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Radix\\project\\FpixTest\\platforms\\android\\app\\src\\main\\aidl\\org\\usc\\student\\IStudentCallBack.aidl
 */
package org.usc.student;
/* Callback object, used for recieveing messages from the student service */
public interface IStudentCallBack extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.usc.student.IStudentCallBack
{
private static final java.lang.String DESCRIPTOR = "org.usc.student.IStudentCallBack";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.usc.student.IStudentCallBack interface,
 * generating a proxy if needed.
 */
public static org.usc.student.IStudentCallBack asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.usc.student.IStudentCallBack))) {
return ((org.usc.student.IStudentCallBack)iin);
}
return new org.usc.student.IStudentCallBack.Stub.Proxy(obj);
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
this.studentDisconnected();
reply.writeNoException();
return true;
}
case TRANSACTION_onStopCommand:
{
data.enforceInterface(DESCRIPTOR);
this.onStopCommand();
reply.writeNoException();
return true;
}
case TRANSACTION_onSilenceCommand:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onSilenceCommand(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.usc.student.IStudentCallBack
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
/* custom api for sdk messaging: used for application legacy data, sent on top of SmartClass comunication layer *//* the messaging api allows third party application to take advantage of Smart Class communication layer and send and recieve messages to and from students *//* From Version 5.x *//* Invoked when student has recieved a custom text message *//* text: the text message sent by the teacher*/
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
/* From Version 5.x *//* Invoked when student has recieved a custom byte array message *//* bytes: the byte array message sent by the teacher*/
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
/* From Version 5.x *//* Invoked when student is connected to a new teacher *//* teacherID: the new teacher unique id */
@Override public void studentConnected(java.lang.String teacherID) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(teacherID);
mRemote.transact(Stub.TRANSACTION_studentConnected, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 5.x *//* Invoked when student is disconnected*/
@Override public void studentDisconnected() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_studentDisconnected, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 5.x *//* Invoked when student has recieved a stop command*/
@Override public void onStopCommand() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onStopCommand, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* From Version 5.x *//* Invoked when student has recieved a silence ( attention) command *//* silence: true if student should enter attention mode and false if student is released from attention mode */
@Override public void onSilenceCommand(boolean silence) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((silence)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onSilenceCommand, _data, _reply, 0);
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
static final int TRANSACTION_onStopCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onSilenceCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
/* custom api for sdk messaging: used for application legacy data, sent on top of SmartClass comunication layer *//* the messaging api allows third party application to take advantage of Smart Class communication layer and send and recieve messages to and from students *//* From Version 5.x *//* Invoked when student has recieved a custom text message *//* text: the text message sent by the teacher*/
public void onTextMessage(java.lang.String text) throws android.os.RemoteException;
/* From Version 5.x *//* Invoked when student has recieved a custom byte array message *//* bytes: the byte array message sent by the teacher*/
public void onBytesMessage(byte[] bytes) throws android.os.RemoteException;
/* From Version 5.x *//* Invoked when student is connected to a new teacher *//* teacherID: the new teacher unique id */
public void studentConnected(java.lang.String teacherID) throws android.os.RemoteException;
/* From Version 5.x *//* Invoked when student is disconnected*/
public void studentDisconnected() throws android.os.RemoteException;
/* From Version 5.x *//* Invoked when student has recieved a stop command*/
public void onStopCommand() throws android.os.RemoteException;
/* From Version 5.x *//* Invoked when student has recieved a silence ( attention) command *//* silence: true if student should enter attention mode and false if student is released from attention mode */
public void onSilenceCommand(boolean silence) throws android.os.RemoteException;
}
