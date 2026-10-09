package com.google.android.gms.p013b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.b.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0438f extends Binder implements InterfaceC0437e {
    public AbstractBinderC0438f() {
        attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC0437e m1828a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0437e)) ? new C0439g(iBinder) : (InterfaceC0437e) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1598968902:
                parcel2.writeString("com.google.android.gms.dynamic.IObjectWrapper");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
