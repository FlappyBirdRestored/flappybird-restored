package com.google.android.gms.maps.p015a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p013b.InterfaceC0437e;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.bf */
/* JADX INFO: loaded from: classes.dex */
class C0652bf implements InterfaceC0650bd {

    /* JADX INFO: renamed from: a */
    private IBinder f2140a;

    C0652bf(IBinder iBinder) {
        this.f2140a = iBinder;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0650bd
    /* JADX INFO: renamed from: a */
    public void mo2868a(InterfaceC0437e interfaceC0437e) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
            parcelObtain.writeStrongBinder(interfaceC0437e != null ? interfaceC0437e.asBinder() : null);
            this.f2140a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2140a;
    }
}
