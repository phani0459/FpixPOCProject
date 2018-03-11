/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Radix\\project\\FpixTest\\platforms\\android\\app\\src\\main\\aidl\\com\\usc\\activation\\IActivationService.aidl
 */
package com.usc.activation;
public interface IActivationService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.usc.activation.IActivationService
{
private static final java.lang.String DESCRIPTOR = "com.usc.activation.IActivationService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.usc.activation.IActivationService interface,
 * generating a proxy if needed.
 */
public static com.usc.activation.IActivationService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.usc.activation.IActivationService))) {
return ((com.usc.activation.IActivationService)iin);
}
return new com.usc.activation.IActivationService.Stub.Proxy(obj);
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
case TRANSACTION_isActivated:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isActivated(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_activate:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.activate(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.usc.activation.IActivationService
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
@Override public boolean isActivated(int ProductType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(ProductType);
mRemote.transact(Stub.TRANSACTION_isActivated, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean activate(java.lang.String productID, int ProductType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(productID);
_data.writeInt(ProductType);
mRemote.transact(Stub.TRANSACTION_activate, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_isActivated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_activate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public boolean isActivated(int ProductType) throws android.os.RemoteException;
public boolean activate(java.lang.String productID, int ProductType) throws android.os.RemoteException;
}
