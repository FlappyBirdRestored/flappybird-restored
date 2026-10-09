package com.google.android.gms.maps.model.p016a;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.a.u */
/* JADX INFO: loaded from: classes.dex */
class C0707u implements InterfaceC0705s {

    /* JADX INFO: renamed from: a */
    private IBinder f2241a;

    C0707u(IBinder iBinder) {
        this.f2241a = iBinder;
    }

    @Override // com.google.android.gms.maps.model.p016a.InterfaceC0705s
    /* JADX INFO: renamed from: a */
    public void mo3149a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            this.f2241a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.model.p016a.InterfaceC0705s
    /* JADX INFO: renamed from: a */
    public void mo3150a(float f) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            parcelObtain.writeFloat(f);
            this.f2241a.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.model.p016a.InterfaceC0705s
    /* JADX INFO: renamed from: a */
    public void mo3151a(boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            parcelObtain.writeInt(z ? 1 : 0);
            this.f2241a.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.model.p016a.InterfaceC0705s
    /* JADX INFO: renamed from: a */
    public boolean mo3152a(InterfaceC0705s interfaceC0705s) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            parcelObtain.writeStrongBinder(interfaceC0705s != null ? interfaceC0705s.asBinder() : null);
            this.f2241a.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2241a;
    }

    @Override // com.google.android.gms.maps.model.p016a.InterfaceC0705s
    /* JADX INFO: renamed from: b */
    public void mo3153b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            this.f2241a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.model.p016a.InterfaceC0705s
    /* JADX INFO: renamed from: c */
    public String mo3154c() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            this.f2241a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.model.p016a.InterfaceC0705s
    /* JADX INFO: renamed from: d */
    public float mo3155d() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            this.f2241a.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readFloat();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.model.p016a.InterfaceC0705s
    /* JADX INFO: renamed from: e */
    public boolean mo3156e() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            this.f2241a.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.model.p016a.InterfaceC0705s
    /* JADX INFO: renamed from: f */
    public int mo3157f() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            this.f2241a.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
