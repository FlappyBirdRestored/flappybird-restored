package com.google.android.gms.maps.model.p016a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0467e;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.a.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0697k extends Binder implements InterfaceC0696j {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0696j m3102a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0696j)) ? new C0698l(iBinder) : (InterfaceC0696j) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                mo3082a();
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                String strB = mo3089b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                mo3085a(parcel.readInt() != 0 ? LatLng.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                LatLng latLngC = mo3091c();
                parcel2.writeNoException();
                if (latLngC == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                latLngC.writeToParcel(parcel2, 1);
                return true;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                mo3083a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                mo3084a(parcel.readFloat(), parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                float fD = mo3093d();
                parcel2.writeNoException();
                parcel2.writeFloat(fD);
                return true;
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                float fE = mo3095e();
                parcel2.writeNoException();
                parcel2.writeFloat(fE);
                return true;
            case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                mo3086a(parcel.readInt() != 0 ? LatLngBounds.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiZoomControls /* 10 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                LatLngBounds latLngBoundsF = mo3096f();
                parcel2.writeNoException();
                if (latLngBoundsF == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                latLngBoundsF.writeToParcel(parcel2, 1);
                return true;
            case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                mo3090b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_useViewLifecycle /* 12 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                float fG = mo3097g();
                parcel2.writeNoException();
                parcel2.writeFloat(fG);
                return true;
            case C0467e.MapAttrs_zOrderOnTop /* 13 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                mo3092c(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                float fH = mo3098h();
                parcel2.writeNoException();
                parcel2.writeFloat(fH);
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                mo3087a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                boolean zI = mo3099i();
                parcel2.writeNoException();
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                mo3094d(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                float fJ = mo3100j();
                parcel2.writeNoException();
                parcel2.writeFloat(fJ);
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                boolean zA = mo3088a(m3102a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(zA ? 1 : 0);
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                int iK = mo3101k();
                parcel2.writeNoException();
                parcel2.writeInt(iK);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
