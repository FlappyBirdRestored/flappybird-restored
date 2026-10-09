package com.google.android.gms.maps.model.p016a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0467e;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.a.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0703q extends Binder implements InterfaceC0702p {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0702p m3148a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0702p)) ? new C0704r(iBinder) : (InterfaceC0702p) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                mo3128a();
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                String strB = mo3134b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                mo3131a(parcel.createTypedArrayList(LatLng.CREATOR));
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                List listC = mo3139c();
                parcel2.writeNoException();
                parcel2.writeTypedList(listC);
                return true;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                mo3137b(parcel.readArrayList(getClass().getClassLoader()));
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                List listD = mo3140d();
                parcel2.writeNoException();
                parcel2.writeList(listD);
                return true;
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                mo3129a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                float fE = mo3141e();
                parcel2.writeNoException();
                parcel2.writeFloat(fE);
                return true;
            case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                mo3130a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiZoomControls /* 10 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                int iF = mo3142f();
                parcel2.writeNoException();
                parcel2.writeInt(iF);
                return true;
            case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                mo3136b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_useViewLifecycle /* 12 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                int iG = mo3143g();
                parcel2.writeNoException();
                parcel2.writeInt(iG);
                return true;
            case C0467e.MapAttrs_zOrderOnTop /* 13 */:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                mo3135b(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                float fH = mo3144h();
                parcel2.writeNoException();
                parcel2.writeFloat(fH);
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                mo3132a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                boolean zI = mo3145i();
                parcel2.writeNoException();
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                mo3138b(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                boolean zJ = mo3146j();
                parcel2.writeNoException();
                parcel2.writeInt(zJ ? 1 : 0);
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                boolean zA = mo3133a(m3148a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(zA ? 1 : 0);
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                int iK = mo3147k();
                parcel2.writeNoException();
                parcel2.writeInt(iK);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
