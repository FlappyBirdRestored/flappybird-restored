package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: com.google.android.gms.internal.bb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0521bb extends Binder implements InterfaceC0520ba {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0520ba m2353a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0520ba)) ? new C0522bc(iBinder) : (InterfaceC0520ba) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2325a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2328a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2343b(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2316a(parcel.readInt() != 0 ? C0503ak.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                String strA = mo2315a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2341b();
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2345c(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2317a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2323a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiZoomControls /* 10 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2347d(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2340a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_useViewLifecycle /* 12 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2329a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_zOrderOnTop /* 13 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2342b(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2322a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2318a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2339a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2348e(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2344c(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2320a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2335a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2338a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2333a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 24:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2349f(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2327a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? C0541bv.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 26:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2350g(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 27:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2336a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 28:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2331a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString(), parcel.createTypedArrayList(C0612x.CREATOR));
                parcel2.writeNoException();
                return true;
            case 29:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2334a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString(), parcel.createTypedArrayList(C0612x.CREATOR), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 30:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2324a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readInt() != 0 ? C0561co.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 31:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2332a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString(), parcel.createTypedArrayList(C0612x.CREATOR), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 32:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2321a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 33:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2351h(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 34:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2337a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 35:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2352i(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 36:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2326a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 37:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2330a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 38:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2346d(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 39:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                mo2319a(AbstractBinderC0510ar.m2303a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.plus.internal.IPlusService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
