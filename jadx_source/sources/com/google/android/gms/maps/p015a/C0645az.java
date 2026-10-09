package com.google.android.gms.maps.p015a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.p016a.InterfaceC0699m;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.az */
/* JADX INFO: loaded from: classes.dex */
class C0645az implements InterfaceC0643ax {

    /* JADX INFO: renamed from: a */
    private IBinder f2138a;

    C0645az(IBinder iBinder) {
        this.f2138a = iBinder;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0643ax
    /* JADX INFO: renamed from: a */
    public void mo2861a(InterfaceC0699m interfaceC0699m) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
            parcelObtain.writeStrongBinder(interfaceC0699m != null ? interfaceC0699m.asBinder() : null);
            this.f2138a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2138a;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0643ax
    /* JADX INFO: renamed from: b */
    public void mo2862b(InterfaceC0699m interfaceC0699m) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
            parcelObtain.writeStrongBinder(interfaceC0699m != null ? interfaceC0699m.asBinder() : null);
            this.f2138a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0643ax
    /* JADX INFO: renamed from: c */
    public void mo2863c(InterfaceC0699m interfaceC0699m) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
            parcelObtain.writeStrongBinder(interfaceC0699m != null ? interfaceC0699m.asBinder() : null);
            this.f2138a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
