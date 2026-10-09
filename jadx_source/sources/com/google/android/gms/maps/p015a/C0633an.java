package com.google.android.gms.maps.p015a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p013b.InterfaceC0437e;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.an */
/* JADX INFO: loaded from: classes.dex */
class C0633an implements InterfaceC0631al {

    /* JADX INFO: renamed from: a */
    private IBinder f2134a;

    C0633an(IBinder iBinder) {
        this.f2134a = iBinder;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0631al
    /* JADX INFO: renamed from: a */
    public void mo2853a(InterfaceC0437e interfaceC0437e) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnLocationChangeListener");
            parcelObtain.writeStrongBinder(interfaceC0437e != null ? interfaceC0437e.asBinder() : null);
            this.f2134a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2134a;
    }
}
