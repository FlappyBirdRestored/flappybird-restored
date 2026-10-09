package com.google.android.gms.maps.p015a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.p016a.AbstractBinderC0691e;
import com.google.android.gms.maps.model.p016a.InterfaceC0690d;
import com.google.android.gms.p013b.InterfaceC0437e;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.ab */
/* JADX INFO: loaded from: classes.dex */
class C0621ab implements InterfaceC0681z {

    /* JADX INFO: renamed from: a */
    private IBinder f2130a;

    C0621ab(IBinder iBinder) {
        this.f2130a = iBinder;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0681z
    /* JADX INFO: renamed from: a */
    public InterfaceC0619a mo2840a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            this.f2130a.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0646b.m2865a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0681z
    /* JADX INFO: renamed from: a */
    public InterfaceC0668m mo2841a(InterfaceC0437e interfaceC0437e, GoogleMapOptions googleMapOptions) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            parcelObtain.writeStrongBinder(interfaceC0437e != null ? interfaceC0437e.asBinder() : null);
            if (googleMapOptions != null) {
                parcelObtain.writeInt(1);
                googleMapOptions.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2130a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0669n.m2944a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0681z
    /* JADX INFO: renamed from: a */
    public void mo2842a(InterfaceC0437e interfaceC0437e) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            parcelObtain.writeStrongBinder(interfaceC0437e != null ? interfaceC0437e.asBinder() : null);
            this.f2130a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0681z
    /* JADX INFO: renamed from: a */
    public void mo2843a(InterfaceC0437e interfaceC0437e, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            parcelObtain.writeStrongBinder(interfaceC0437e != null ? interfaceC0437e.asBinder() : null);
            parcelObtain.writeInt(i);
            this.f2130a.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2130a;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0681z
    /* JADX INFO: renamed from: b */
    public InterfaceC0665j mo2844b(InterfaceC0437e interfaceC0437e) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            parcelObtain.writeStrongBinder(interfaceC0437e != null ? interfaceC0437e.asBinder() : null);
            this.f2130a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0666k.m2935a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0681z
    /* JADX INFO: renamed from: b */
    public InterfaceC0690d mo2845b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            this.f2130a.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0691e.m3062a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
