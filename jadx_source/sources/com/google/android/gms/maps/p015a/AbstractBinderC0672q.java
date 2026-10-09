package com.google.android.gms.maps.p015a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0467e;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.p013b.AbstractBinderC0438f;
import com.google.android.gms.p013b.InterfaceC0437e;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0672q extends Binder implements InterfaceC0671p {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0671p m2948a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0671p)) ? new C0673r(iBinder) : (InterfaceC0671p) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                LatLng latLngA = mo2946a(AbstractBinderC0438f.m1828a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                if (latLngA != null) {
                    parcel2.writeInt(1);
                    latLngA.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                InterfaceC0437e interfaceC0437eA = mo2945a(parcel.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eA != null ? interfaceC0437eA.asBinder() : null);
                return true;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                VisibleRegion visibleRegionA = mo2947a();
                parcel2.writeNoException();
                if (visibleRegionA != null) {
                    parcel2.writeInt(1);
                    visibleRegionA.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IProjectionDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
