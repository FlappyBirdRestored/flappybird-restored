package com.google.android.gms.maps.p015a;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.bc */
/* JADX INFO: loaded from: classes.dex */
class C0649bc implements InterfaceC0647ba {

    /* JADX INFO: renamed from: a */
    private IBinder f2139a;

    C0649bc(IBinder iBinder) {
        this.f2139a = iBinder;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0647ba
    /* JADX INFO: renamed from: a */
    public boolean mo2866a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
            this.f2139a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2139a;
    }
}
