package com.google.android.gms.maps.p015a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0467e;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.p013b.InterfaceC0437e;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0646b extends Binder implements InterfaceC0619a {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0619a m2865a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0619a)) ? new C0658c(iBinder) : (InterfaceC0619a) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                InterfaceC0437e interfaceC0437eA = mo2828a();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eA != null ? interfaceC0437eA.asBinder() : null);
                return true;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                InterfaceC0437e interfaceC0437eB = mo2837b();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eB != null ? interfaceC0437eB.asBinder() : null);
                return true;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                InterfaceC0437e interfaceC0437eA2 = mo2830a(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eA2 != null ? interfaceC0437eA2.asBinder() : null);
                return true;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                InterfaceC0437e interfaceC0437eA3 = mo2829a(parcel.readFloat());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eA3 != null ? interfaceC0437eA3.asBinder() : null);
                return true;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                InterfaceC0437e interfaceC0437eB2 = mo2838b(parcel.readFloat());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eB2 != null ? interfaceC0437eB2.asBinder() : null);
                return true;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                InterfaceC0437e interfaceC0437eA4 = mo2831a(parcel.readFloat(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eA4 != null ? interfaceC0437eA4.asBinder() : null);
                return true;
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                InterfaceC0437e interfaceC0437eA5 = mo2832a(parcel.readInt() != 0 ? CameraPosition.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eA5 != null ? interfaceC0437eA5.asBinder() : null);
                return true;
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                InterfaceC0437e interfaceC0437eA6 = mo2833a(parcel.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eA6 != null ? interfaceC0437eA6.asBinder() : null);
                return true;
            case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                InterfaceC0437e interfaceC0437eA7 = mo2834a(parcel.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcel) : null, parcel.readFloat());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eA7 != null ? interfaceC0437eA7.asBinder() : null);
                return true;
            case C0467e.MapAttrs_uiZoomControls /* 10 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                InterfaceC0437e interfaceC0437eA8 = mo2835a(parcel.readInt() != 0 ? LatLngBounds.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eA8 != null ? interfaceC0437eA8.asBinder() : null);
                return true;
            case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                InterfaceC0437e interfaceC0437eA9 = mo2836a(parcel.readInt() != 0 ? LatLngBounds.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eA9 != null ? interfaceC0437eA9.asBinder() : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
