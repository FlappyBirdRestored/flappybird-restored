package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.az */
/* JADX INFO: loaded from: classes.dex */
class C0518az implements InterfaceC0516ax {

    /* JADX INFO: renamed from: a */
    private IBinder f1802a;

    C0518az(IBinder iBinder) {
        this.f1802a = iBinder;
    }

    @Override // com.google.android.gms.internal.InterfaceC0516ax
    /* JADX INFO: renamed from: a */
    public PendingIntent mo2308a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneDelegate");
            this.f1802a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f1802a;
    }

    @Override // com.google.android.gms.internal.InterfaceC0516ax
    /* JADX INFO: renamed from: b */
    public void mo2309b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneDelegate");
            this.f1802a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.InterfaceC0516ax
    /* JADX INFO: renamed from: c */
    public void mo2310c() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusOneDelegate");
            this.f1802a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
