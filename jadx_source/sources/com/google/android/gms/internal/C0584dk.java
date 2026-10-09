package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p013b.AbstractBinderC0438f;
import com.google.android.gms.p013b.InterfaceC0437e;

/* JADX INFO: renamed from: com.google.android.gms.internal.dk */
/* JADX INFO: loaded from: classes.dex */
class C0584dk implements InterfaceC0582di {

    /* JADX INFO: renamed from: a */
    private IBinder f2061a;

    C0584dk(IBinder iBinder) {
        this.f2061a = iBinder;
    }

    @Override // com.google.android.gms.internal.InterfaceC0582di
    /* JADX INFO: renamed from: a */
    public InterfaceC0437e mo2698a(InterfaceC0437e interfaceC0437e, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
            parcelObtain.writeStrongBinder(interfaceC0437e != null ? interfaceC0437e.asBinder() : null);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.f2061a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0438f.m1828a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2061a;
    }
}
