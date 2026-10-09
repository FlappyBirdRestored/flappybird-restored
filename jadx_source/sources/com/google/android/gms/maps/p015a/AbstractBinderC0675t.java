package com.google.android.gms.maps.p015a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0675t extends Binder implements InterfaceC0674s {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0674s m2964a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0674s)) ? new C0676u(iBinder) : (InterfaceC0674s) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                mo2949a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                mo2951b(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                mo2953c(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                mo2955d(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                mo2957e(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                mo2959f(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                mo2961g(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                mo2963h(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                boolean zA = mo2950a();
                parcel2.writeNoException();
                parcel2.writeInt(zA ? 1 : 0);
                return true;
            case C0467e.MapAttrs_uiZoomControls /* 10 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                boolean zB = mo2952b();
                parcel2.writeNoException();
                parcel2.writeInt(zB ? 1 : 0);
                return true;
            case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                boolean zC = mo2954c();
                parcel2.writeNoException();
                parcel2.writeInt(zC ? 1 : 0);
                return true;
            case C0467e.MapAttrs_useViewLifecycle /* 12 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                boolean zD = mo2956d();
                parcel2.writeNoException();
                parcel2.writeInt(zD ? 1 : 0);
                return true;
            case C0467e.MapAttrs_zOrderOnTop /* 13 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                boolean zE = mo2958e();
                parcel2.writeNoException();
                parcel2.writeInt(zE ? 1 : 0);
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                boolean zF = mo2960f();
                parcel2.writeNoException();
                parcel2.writeInt(zF ? 1 : 0);
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                boolean zG = mo2962g();
                parcel2.writeNoException();
                parcel2.writeInt(zG ? 1 : 0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
