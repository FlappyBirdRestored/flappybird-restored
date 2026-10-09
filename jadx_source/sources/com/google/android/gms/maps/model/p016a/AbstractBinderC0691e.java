package com.google.android.gms.maps.model.p016a;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0467e;
import com.google.android.gms.p013b.InterfaceC0437e;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.a.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0691e extends Binder implements InterfaceC0690d {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0690d m3062a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0690d)) ? new C0692f(iBinder) : (InterfaceC0690d) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                InterfaceC0437e interfaceC0437eA = mo3057a(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eA != null ? interfaceC0437eA.asBinder() : null);
                return true;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                InterfaceC0437e interfaceC0437eA2 = mo3059a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eA2 != null ? interfaceC0437eA2.asBinder() : null);
                return true;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                InterfaceC0437e interfaceC0437eB = mo3060b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eB != null ? interfaceC0437eB.asBinder() : null);
                return true;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                InterfaceC0437e interfaceC0437eA3 = mo3055a();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eA3 != null ? interfaceC0437eA3.asBinder() : null);
                return true;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                InterfaceC0437e interfaceC0437eA4 = mo3056a(parcel.readFloat());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eA4 != null ? interfaceC0437eA4.asBinder() : null);
                return true;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                InterfaceC0437e interfaceC0437eA5 = mo3058a(parcel.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eA5 != null ? interfaceC0437eA5.asBinder() : null);
                return true;
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                InterfaceC0437e interfaceC0437eC = mo3061c(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eC != null ? interfaceC0437eC.asBinder() : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
