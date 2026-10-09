package com.google.android.gms.maps.p015a;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.y */
/* JADX INFO: loaded from: classes.dex */
class C0680y implements InterfaceC0678w {

    /* JADX INFO: renamed from: a */
    private IBinder f2152a;

    C0680y(IBinder iBinder) {
        this.f2152a = iBinder;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0678w
    /* JADX INFO: renamed from: a */
    public void mo2967a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICancelableCallback");
            this.f2152a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2152a;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0678w
    /* JADX INFO: renamed from: b */
    public void mo2968b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICancelableCallback");
            this.f2152a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
