package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.de */
/* JADX INFO: loaded from: classes.dex */
class C0578de implements InterfaceC0576dc {

    /* JADX INFO: renamed from: a */
    private IBinder f2059a;

    C0578de(IBinder iBinder) {
        this.f2059a = iBinder;
    }

    @Override // com.google.android.gms.internal.InterfaceC0576dc
    /* JADX INFO: renamed from: a */
    public void mo2654a(int i, IBinder iBinder, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsCallbacks");
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2059a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2059a;
    }
}
