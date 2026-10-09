package com.google.android.gms.maps.p015a;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.bi */
/* JADX INFO: loaded from: classes.dex */
class C0655bi implements InterfaceC0653bg {

    /* JADX INFO: renamed from: a */
    private IBinder f2141a;

    C0655bi(IBinder iBinder) {
        this.f2141a = iBinder;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0653bg
    /* JADX INFO: renamed from: a */
    public void mo2870a(Bitmap bitmap) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
            if (bitmap != null) {
                parcelObtain.writeInt(1);
                bitmap.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2141a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2141a;
    }
}
