package com.google.android.gms.maps.p015a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.ah */
/* JADX INFO: loaded from: classes.dex */
class C0627ah implements InterfaceC0625af {

    /* JADX INFO: renamed from: a */
    private IBinder f2132a;

    C0627ah(IBinder iBinder) {
        this.f2132a = iBinder;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0625af
    /* JADX INFO: renamed from: a */
    public void mo2849a(CameraPosition cameraPosition) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnCameraChangeListener");
            if (cameraPosition != null) {
                parcelObtain.writeInt(1);
                cameraPosition.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2132a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2132a;
    }
}
