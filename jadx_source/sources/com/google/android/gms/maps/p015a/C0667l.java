package com.google.android.gms.maps.p015a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.p013b.AbstractBinderC0438f;
import com.google.android.gms.p013b.InterfaceC0437e;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.l */
/* JADX INFO: loaded from: classes.dex */
class C0667l implements InterfaceC0665j {

    /* JADX INFO: renamed from: a */
    private IBinder f2148a;

    C0667l(IBinder iBinder) {
        this.f2148a = iBinder;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0665j
    /* JADX INFO: renamed from: a */
    public InterfaceC0437e mo2924a(InterfaceC0437e interfaceC0437e, InterfaceC0437e interfaceC0437e2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            parcelObtain.writeStrongBinder(interfaceC0437e != null ? interfaceC0437e.asBinder() : null);
            parcelObtain.writeStrongBinder(interfaceC0437e2 != null ? interfaceC0437e2.asBinder() : null);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2148a.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0438f.m1828a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0665j
    /* JADX INFO: renamed from: a */
    public InterfaceC0659d mo2925a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            this.f2148a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0660e.m2920a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0665j
    /* JADX INFO: renamed from: a */
    public void mo2926a(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2148a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0665j
    /* JADX INFO: renamed from: a */
    public void mo2927a(InterfaceC0437e interfaceC0437e, GoogleMapOptions googleMapOptions, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            parcelObtain.writeStrongBinder(interfaceC0437e != null ? interfaceC0437e.asBinder() : null);
            if (googleMapOptions != null) {
                parcelObtain.writeInt(1);
                googleMapOptions.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2148a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2148a;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0665j
    /* JADX INFO: renamed from: b */
    public void mo2928b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            this.f2148a.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0665j
    /* JADX INFO: renamed from: b */
    public void mo2929b(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2148a.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            if (parcelObtain2.readInt() != 0) {
                bundle.readFromParcel(parcelObtain2);
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0665j
    /* JADX INFO: renamed from: c */
    public void mo2930c() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            this.f2148a.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0665j
    /* JADX INFO: renamed from: d */
    public void mo2931d() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            this.f2148a.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0665j
    /* JADX INFO: renamed from: e */
    public void mo2932e() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            this.f2148a.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0665j
    /* JADX INFO: renamed from: f */
    public void mo2933f() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            this.f2148a.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0665j
    /* JADX INFO: renamed from: g */
    public boolean mo2934g() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            this.f2148a.transact(11, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
