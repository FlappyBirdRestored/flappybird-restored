package com.google.android.gms.maps.p015a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.p016a.InterfaceC0699m;
import com.google.android.gms.p013b.AbstractBinderC0438f;
import com.google.android.gms.p013b.InterfaceC0437e;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.ae */
/* JADX INFO: loaded from: classes.dex */
class C0624ae implements InterfaceC0622ac {

    /* JADX INFO: renamed from: a */
    private IBinder f2131a;

    C0624ae(IBinder iBinder) {
        this.f2131a = iBinder;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0622ac
    /* JADX INFO: renamed from: a */
    public InterfaceC0437e mo2846a(InterfaceC0699m interfaceC0699m) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            parcelObtain.writeStrongBinder(interfaceC0699m != null ? interfaceC0699m.asBinder() : null);
            this.f2131a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0438f.m1828a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2131a;
    }

    @Override // com.google.android.gms.maps.p015a.InterfaceC0622ac
    /* JADX INFO: renamed from: b */
    public InterfaceC0437e mo2847b(InterfaceC0699m interfaceC0699m) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            parcelObtain.writeStrongBinder(interfaceC0699m != null ? interfaceC0699m.asBinder() : null);
            this.f2131a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return AbstractBinderC0438f.m1828a(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
