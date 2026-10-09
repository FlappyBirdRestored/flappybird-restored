package com.google.android.gms.maps.p015a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0467e;
import com.google.android.gms.maps.model.p016a.AbstractBinderC0700n;
import com.google.android.gms.p013b.InterfaceC0437e;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.ad */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0623ad extends Binder implements InterfaceC0622ac {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0622ac m2848a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0622ac)) ? new C0624ae(iBinder) : (InterfaceC0622ac) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                InterfaceC0437e interfaceC0437eA = mo2846a(AbstractBinderC0700n.m3127a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eA != null ? interfaceC0437eA.asBinder() : null);
                return true;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                InterfaceC0437e interfaceC0437eB = mo2847b(AbstractBinderC0700n.m3127a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eB != null ? interfaceC0437eB.asBinder() : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
