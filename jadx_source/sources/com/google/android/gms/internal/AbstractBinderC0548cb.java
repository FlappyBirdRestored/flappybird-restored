package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.C0452d;

/* JADX INFO: renamed from: com.google.android.gms.internal.cb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0548cb extends Binder implements InterfaceC0547ca {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0547ca m2501a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0547ca)) ? new C0550cd(iBinder) : (InterfaceC0547ca) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 5001:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                mo2499a(parcel.readInt(), parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5002:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                mo2500a(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5003:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                mo2498a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5004:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                mo2496a();
                parcel2.writeNoException();
                return true;
            case 5005:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                mo2497a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.appstate.internal.IAppStateCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
