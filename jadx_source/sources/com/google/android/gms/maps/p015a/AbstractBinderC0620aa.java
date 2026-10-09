package com.google.android.gms.maps.p015a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0467e;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.p016a.InterfaceC0690d;
import com.google.android.gms.p013b.AbstractBinderC0438f;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.aa */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0620aa extends Binder implements InterfaceC0681z {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0681z m2839a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0681z)) ? new C0621ab(iBinder) : (InterfaceC0681z) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                mo2842a(AbstractBinderC0438f.m1828a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                InterfaceC0665j interfaceC0665jB = mo2844b(AbstractBinderC0438f.m1828a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0665jB != null ? interfaceC0665jB.asBinder() : null);
                return true;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                InterfaceC0668m interfaceC0668mA = mo2841a(AbstractBinderC0438f.m1828a(parcel.readStrongBinder()), parcel.readInt() != 0 ? GoogleMapOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0668mA != null ? interfaceC0668mA.asBinder() : null);
                return true;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                InterfaceC0619a interfaceC0619aA = mo2840a();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0619aA != null ? interfaceC0619aA.asBinder() : null);
                return true;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                InterfaceC0690d interfaceC0690dB = mo2845b();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0690dB != null ? interfaceC0690dB.asBinder() : null);
                return true;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                mo2843a(AbstractBinderC0438f.m1828a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.ICreator");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
