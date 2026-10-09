package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p013b.AbstractBinderC0438f;
import com.google.android.gms.p013b.InterfaceC0437e;

/* JADX INFO: renamed from: com.google.android.gms.internal.aw */
/* JADX INFO: loaded from: classes.dex */
class C0515aw implements InterfaceC0512at {

    /* JADX INFO: renamed from: a */
    private IBinder f1801a;

    C0515aw(IBinder iBinder) {
        this.f1801a = iBinder;
    }

    @Override // com.google.android.gms.internal.InterfaceC0512at
    /* JADX INFO: renamed from: a */
    public InterfaceC0437e mo2304a(InterfaceC0437e interfaceC0437e, int i, int i2, String str, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            parcelObtain.writeStrongBinder(interfaceC0437e != null ? interfaceC0437e.asBinder() : null);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i3);
            this.f1801a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0438f.m1828a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0512at
    /* JADX INFO: renamed from: a */
    public InterfaceC0437e mo2305a(InterfaceC0437e interfaceC0437e, int i, int i2, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            parcelObtain.writeStrongBinder(interfaceC0437e != null ? interfaceC0437e.asBinder() : null);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f1801a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0438f.m1828a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f1801a;
    }
}
