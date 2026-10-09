package com.google.android.gms.maps.p015a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.p013b.AbstractBinderC0438f;
import com.google.android.gms.p013b.InterfaceC0437e;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.r */
/* JADX INFO: loaded from: classes.dex */
class C0673r implements InterfaceC0671p {

    /* JADX INFO: renamed from: a */
    private IBinder f2150a;

    C0673r(IBinder iBinder) {
        this.f2150a = iBinder;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0671p
    /* JADX INFO: renamed from: a */
    public InterfaceC0437e mo2945a(LatLng latLng) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (latLng != null) {
                parcelObtain.writeInt(1);
                latLng.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2150a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0438f.m1828a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0671p
    /* JADX INFO: renamed from: a */
    public LatLng mo2946a(InterfaceC0437e interfaceC0437e) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            parcelObtain.writeStrongBinder(interfaceC0437e != null ? interfaceC0437e.asBinder() : null);
            this.f2150a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0671p
    /* JADX INFO: renamed from: a */
    public VisibleRegion mo2947a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            this.f2150a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? VisibleRegion.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2150a;
    }
}
