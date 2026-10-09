package com.google.android.gms.maps.p015a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.p013b.AbstractBinderC0438f;
import com.google.android.gms.p013b.InterfaceC0437e;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.c */
/* JADX INFO: loaded from: classes.dex */
class C0658c implements InterfaceC0619a {

    /* JADX INFO: renamed from: a */
    private IBinder f2145a;

    C0658c(IBinder iBinder) {
        this.f2145a = iBinder;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0619a
    /* JADX INFO: renamed from: a */
    public InterfaceC0437e mo2828a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            this.f2145a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0438f.m1828a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0619a
    /* JADX INFO: renamed from: a */
    public InterfaceC0437e mo2829a(float f) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            parcelObtain.writeFloat(f);
            this.f2145a.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0438f.m1828a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0619a
    /* JADX INFO: renamed from: a */
    public InterfaceC0437e mo2830a(float f, float f2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            parcelObtain.writeFloat(f);
            parcelObtain.writeFloat(f2);
            this.f2145a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0438f.m1828a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0619a
    /* JADX INFO: renamed from: a */
    public InterfaceC0437e mo2831a(float f, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            parcelObtain.writeFloat(f);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.f2145a.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0438f.m1828a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0619a
    /* JADX INFO: renamed from: a */
    public InterfaceC0437e mo2832a(CameraPosition cameraPosition) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (cameraPosition != null) {
                parcelObtain.writeInt(1);
                cameraPosition.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2145a.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0438f.m1828a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0619a
    /* JADX INFO: renamed from: a */
    public InterfaceC0437e mo2833a(LatLng latLng) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latLng != null) {
                parcelObtain.writeInt(1);
                latLng.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2145a.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0438f.m1828a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0619a
    /* JADX INFO: renamed from: a */
    public InterfaceC0437e mo2834a(LatLng latLng, float f) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latLng != null) {
                parcelObtain.writeInt(1);
                latLng.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeFloat(f);
            this.f2145a.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0438f.m1828a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0619a
    /* JADX INFO: renamed from: a */
    public InterfaceC0437e mo2835a(LatLngBounds latLngBounds, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latLngBounds != null) {
                parcelObtain.writeInt(1);
                latLngBounds.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeInt(i);
            this.f2145a.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0438f.m1828a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0619a
    /* JADX INFO: renamed from: a */
    public InterfaceC0437e mo2836a(LatLngBounds latLngBounds, int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latLngBounds != null) {
                parcelObtain.writeInt(1);
                latLngBounds.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.f2145a.transact(11, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0438f.m1828a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2145a;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0619a
    /* JADX INFO: renamed from: b */
    public InterfaceC0437e mo2837b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            this.f2145a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0438f.m1828a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0619a
    /* JADX INFO: renamed from: b */
    public InterfaceC0437e mo2838b(float f) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            parcelObtain.writeFloat(f);
            this.f2145a.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0438f.m1828a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
