package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0467e;
import com.google.android.gms.p013b.AbstractBinderC0438f;
import com.google.android.gms.p013b.InterfaceC0437e;

/* JADX INFO: renamed from: com.google.android.gms.internal.au */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0513au extends Binder implements InterfaceC0512at {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0512at m2306a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0512at)) ? new C0515aw(iBinder) : (InterfaceC0512at) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                InterfaceC0437e interfaceC0437eA = mo2304a(AbstractBinderC0438f.m1828a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eA != null ? interfaceC0437eA.asBinder() : null);
                return true;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                InterfaceC0437e interfaceC0437eA2 = mo2305a(AbstractBinderC0438f.m1828a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(interfaceC0437eA2 != null ? interfaceC0437eA2.asBinder() : null);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
