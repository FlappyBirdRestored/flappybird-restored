package com.google.android.gms.maps.p015a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.p016a.InterfaceC0699m;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.ak */
/* JADX INFO: loaded from: classes.dex */
class C0630ak implements InterfaceC0628ai {

    /* JADX INFO: renamed from: a */
    private IBinder f2133a;

    C0630ak(IBinder iBinder) {
        this.f2133a = iBinder;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0628ai
    /* JADX INFO: renamed from: a */
    public void mo2851a(InterfaceC0699m interfaceC0699m) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
            parcelObtain.writeStrongBinder(interfaceC0699m != null ? interfaceC0699m.asBinder() : null);
            this.f2133a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2133a;
    }
}
