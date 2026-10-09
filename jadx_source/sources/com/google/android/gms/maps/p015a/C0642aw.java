package com.google.android.gms.maps.p015a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.p016a.InterfaceC0699m;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.aw */
/* JADX INFO: loaded from: classes.dex */
class C0642aw implements InterfaceC0640au {

    /* JADX INFO: renamed from: a */
    private IBinder f2137a;

    C0642aw(IBinder iBinder) {
        this.f2137a = iBinder;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0640au
    /* JADX INFO: renamed from: a */
    public boolean mo2859a(InterfaceC0699m interfaceC0699m) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerClickListener");
            parcelObtain.writeStrongBinder(interfaceC0699m != null ? interfaceC0699m.asBinder() : null);
            this.f2137a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2137a;
    }
}
