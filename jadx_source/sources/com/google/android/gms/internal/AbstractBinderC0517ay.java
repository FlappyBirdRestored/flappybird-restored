package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: com.google.android.gms.internal.ay */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0517ay extends Binder implements InterfaceC0516ax {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0516ax m2311a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusOneDelegate");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0516ax)) ? new C0518az(iBinder) : (InterfaceC0516ax) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneDelegate");
                PendingIntent pendingIntentA = mo2308a();
                parcel2.writeNoException();
                if (pendingIntentA == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                pendingIntentA.writeToParcel(parcel2, 1);
                return true;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneDelegate");
                mo2309b();
                parcel2.writeNoException();
                return true;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneDelegate");
                mo2310c();
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.plus.internal.IPlusOneDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
