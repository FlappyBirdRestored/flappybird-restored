package com.google.android.gms.maps.p015a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.at */
/* JADX INFO: loaded from: classes.dex */
class C0639at implements InterfaceC0637ar {

    /* JADX INFO: renamed from: a */
    private IBinder f2136a;

    C0639at(IBinder iBinder) {
        this.f2136a = iBinder;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0637ar
    /* JADX INFO: renamed from: a */
    public void mo2857a(LatLng latLng) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapLongClickListener");
            if (latLng != null) {
                parcelObtain.writeInt(1);
                latLng.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2136a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2136a;
    }
}
