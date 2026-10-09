package com.google.android.gms.maps.p015a;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0467e;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.p016a.InterfaceC0687a;
import com.google.android.gms.maps.model.p016a.InterfaceC0693g;
import com.google.android.gms.maps.model.p016a.InterfaceC0696j;
import com.google.android.gms.maps.model.p016a.InterfaceC0699m;
import com.google.android.gms.maps.model.p016a.InterfaceC0702p;
import com.google.android.gms.maps.model.p016a.InterfaceC0705s;
import com.google.android.gms.p013b.AbstractBinderC0438f;
import com.google.android.gms.p013b.InterfaceC0437e;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0660e extends Binder implements InterfaceC0659d {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0659d m2920a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0659d)) ? new C0661f(iBinder) : (InterfaceC0659d) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                CameraPosition cameraPositionA = mo2881a();
                parcel2.writeNoException();
                if (cameraPositionA == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                cameraPositionA.writeToParcel(parcel2, 1);
                return true;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                float fB = mo2905b();
                parcel2.writeNoException();
                parcel2.writeFloat(fB);
                return true;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                float fC = mo2908c();
                parcel2.writeNoException();
                parcel2.writeFloat(fC);
                return true;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2890a(AbstractBinderC0438f.m1828a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2906b(AbstractBinderC0438f.m1828a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2892a(AbstractBinderC0438f.m1828a(parcel.readStrongBinder()), AbstractBinderC0679x.m2969a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2891a(AbstractBinderC0438f.m1828a(parcel.readStrongBinder()), parcel.readInt(), AbstractBinderC0679x.m2969a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2910d();
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                InterfaceC0687a interfaceC0687aA = mo2882a(parcel.readInt() != 0 ? PolylineOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0687aA != null ? interfaceC0687aA.asBinder() : null);
                return true;
            case C0467e.MapAttrs_uiZoomControls /* 10 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                InterfaceC0702p interfaceC0702pA = mo2886a(parcel.readInt() != 0 ? PolygonOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0702pA != null ? interfaceC0702pA.asBinder() : null);
                return true;
            case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                InterfaceC0699m interfaceC0699mA = mo2885a(parcel.readInt() != 0 ? MarkerOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0699mA != null ? interfaceC0699mA.asBinder() : null);
                return true;
            case C0467e.MapAttrs_useViewLifecycle /* 12 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                InterfaceC0696j interfaceC0696jA = mo2884a(parcel.readInt() != 0 ? GroundOverlayOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0696jA != null ? interfaceC0696jA.asBinder() : null);
                return true;
            case C0467e.MapAttrs_zOrderOnTop /* 13 */:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                InterfaceC0705s interfaceC0705sA = mo2887a(parcel.readInt() != 0 ? TileOverlayOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0705sA != null ? interfaceC0705sA.asBinder() : null);
                return true;
            case 14:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2911e();
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                int iF = mo2912f();
                parcel2.writeNoException();
                parcel2.writeInt(iF);
                return true;
            case 16:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2888a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                boolean zG = mo2913g();
                parcel2.writeNoException();
                parcel2.writeInt(zG ? 1 : 0);
                return true;
            case 18:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2904a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                boolean zH = mo2914h();
                parcel2.writeNoException();
                parcel2.writeInt(zH ? 1 : 0);
                return true;
            case 20:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                boolean zB = mo2907b(parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(zB ? 1 : 0);
                return true;
            case 21:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                boolean zI = mo2915i();
                parcel2.writeNoException();
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 22:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2909c(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                Location locationJ = mo2916j();
                parcel2.writeNoException();
                if (locationJ == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                locationJ.writeToParcel(parcel2, 1);
                return true;
            case 24:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2903a(AbstractBinderC0663h.m2923a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                InterfaceC0674s interfaceC0674sK = mo2917k();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0674sK != null ? interfaceC0674sK.asBinder() : null);
                return true;
            case 26:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                InterfaceC0671p interfaceC0671pL = mo2918l();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0671pL != null ? interfaceC0671pL.asBinder() : null);
                return true;
            case 27:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2894a(AbstractBinderC0626ag.m2850a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 28:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2896a(AbstractBinderC0635ap.m2856a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 29:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2897a(AbstractBinderC0638as.m2858a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 30:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2898a(AbstractBinderC0641av.m2860a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2899a(AbstractBinderC0644ay.m2864a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 32:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2895a(AbstractBinderC0629aj.m2852a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 33:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2893a(AbstractBinderC0623ad.m2848a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 34:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                InterfaceC0437e interfaceC0437eM = mo2919m();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eM != null ? interfaceC0437eM.asBinder() : null);
                return true;
            case 35:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                InterfaceC0693g interfaceC0693gA = mo2883a(parcel.readInt() != 0 ? CircleOptions.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0693gA != null ? interfaceC0693gA.asBinder() : null);
                return true;
            case 36:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2901a(AbstractBinderC0651be.m2869a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 37:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2900a(AbstractBinderC0648bb.m2867a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 38:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2902a(AbstractBinderC0654bh.m2871a(parcel.readStrongBinder()), AbstractBinderC0438f.m1828a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 39:
                parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                mo2889a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
