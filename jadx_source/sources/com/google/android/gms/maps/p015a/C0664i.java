package com.google.android.gms.maps.p015a;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.i */
/* JADX INFO: loaded from: classes.dex */
class C0664i implements InterfaceC0662g {

    /* JADX INFO: renamed from: a */
    private IBinder f2147a;

    C0664i(IBinder iBinder) {
        this.f2147a = iBinder;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0662g
    /* JADX INFO: renamed from: a */
    public void mo2921a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            this.f2147a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0662g
    /* JADX INFO: renamed from: a */
    public void mo2922a(InterfaceC0631al interfaceC0631al) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
            parcelObtain.writeStrongBinder(interfaceC0631al != null ? interfaceC0631al.asBinder() : null);
            this.f2147a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2147a;
    }
}
