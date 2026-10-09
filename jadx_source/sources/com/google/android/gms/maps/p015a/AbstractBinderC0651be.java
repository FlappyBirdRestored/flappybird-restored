package com.google.android.gms.maps.p015a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0467e;
import com.google.android.gms.p013b.AbstractBinderC0438f;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.be */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0651be extends Binder implements InterfaceC0650bd {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0650bd m2869a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0650bd)) ? new C0652bf(iBinder) : (InterfaceC0650bd) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                mo2868a(AbstractBinderC0438f.m1828a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
