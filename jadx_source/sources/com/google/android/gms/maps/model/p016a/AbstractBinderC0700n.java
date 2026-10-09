package com.google.android.gms.maps.model.p016a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0467e;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.p013b.AbstractBinderC0438f;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.a.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0700n extends Binder implements InterfaceC0699m {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0699m m3127a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0699m)) ? new C0701o(iBinder) : (InterfaceC0699m) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo3103a();
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                String strB = mo3111b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo3107a(parcel.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                LatLng latLngC = mo3115c();
                parcel2.writeNoException();
                if (latLngC == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                latLngC.writeToParcel(parcel2, 1);
                return true;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo3108a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                String strD = mo3117d();
                parcel2.writeNoException();
                parcel2.writeString(strD);
                return true;
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo3113b(parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                String strE = mo3118e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo3109a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiZoomControls /* 10 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                boolean zF = mo3119f();
                parcel2.writeNoException();
                parcel2.writeInt(zF ? 1 : 0);
                return true;
            case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo3120g();
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_useViewLifecycle /* 12 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo3121h();
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_zOrderOnTop /* 13 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                boolean zI = mo3122i();
                parcel2.writeNoException();
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo3114b(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                boolean zJ = mo3123j();
                parcel2.writeNoException();
                parcel2.writeInt(zJ ? 1 : 0);
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                boolean zA = mo3110a(m3127a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(zA ? 1 : 0);
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                int iK = mo3124k();
                parcel2.writeNoException();
                parcel2.writeInt(iK);
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo3106a(AbstractBinderC0438f.m1828a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo3105a(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo3116c(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                boolean zL = mo3125l();
                parcel2.writeNoException();
                parcel2.writeInt(zL ? 1 : 0);
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo3104a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                float fM = mo3126m();
                parcel2.writeNoException();
                parcel2.writeFloat(fM);
                return true;
            case 24:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                mo3112b(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
