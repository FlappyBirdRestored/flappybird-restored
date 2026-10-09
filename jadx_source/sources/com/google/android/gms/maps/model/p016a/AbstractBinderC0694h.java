package com.google.android.gms.maps.model.p016a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0467e;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.a.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0694h extends Binder implements InterfaceC0693g {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0693g m3081a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0693g)) ? new C0695i(iBinder) : (InterfaceC0693g) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                mo3063a();
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                String strB = mo3070b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                mo3067a(parcel.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                LatLng latLngC = mo3073c();
                parcel2.writeNoException();
                if (latLngC == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                latLngC.writeToParcel(parcel2, 1);
                return true;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                mo3064a(parcel.readDouble());
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                double d = mo3074d();
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                mo3065a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                float fE = mo3075e();
                parcel2.writeNoException();
                parcel2.writeFloat(fE);
                return true;
            case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                mo3066a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiZoomControls /* 10 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                int iF = mo3076f();
                parcel2.writeNoException();
                parcel2.writeInt(iF);
                return true;
            case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                mo3072b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_useViewLifecycle /* 12 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                int iG = mo3077g();
                parcel2.writeNoException();
                parcel2.writeInt(iG);
                return true;
            case C0467e.MapAttrs_zOrderOnTop /* 13 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                mo3071b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                float fH = mo3078h();
                parcel2.writeNoException();
                parcel2.writeFloat(fH);
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                mo3068a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                boolean zI = mo3079i();
                parcel2.writeNoException();
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                boolean zA = mo3069a(m3081a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(zA ? 1 : 0);
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                int iJ = mo3080j();
                parcel2.writeNoException();
                parcel2.writeInt(iJ);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.ICircleDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
