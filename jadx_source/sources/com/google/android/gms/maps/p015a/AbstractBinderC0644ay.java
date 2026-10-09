package com.google.android.gms.maps.p015a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0467e;
import com.google.android.gms.maps.model.p016a.AbstractBinderC0700n;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.ay */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0644ay extends Binder implements InterfaceC0643ax {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0643ax m2864a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0643ax)) ? new C0645az(iBinder) : (InterfaceC0643ax) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                mo2861a(AbstractBinderC0700n.m3127a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                mo2862b(AbstractBinderC0700n.m3127a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                mo2863c(AbstractBinderC0700n.m3127a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
