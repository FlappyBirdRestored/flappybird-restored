package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.cf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0552cf extends Binder implements InterfaceC0551ce {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0551ce m2598a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateService");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0551ce)) ? new C0553cg(iBinder) : (InterfaceC0551ce) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 5001:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                int iA = mo2589a();
                parcel2.writeNoException();
                parcel2.writeInt(iA);
                return true;
            case 5002:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                int iB = mo2594b();
                parcel2.writeNoException();
                parcel2.writeInt(iB);
                return true;
            case 5003:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                mo2593a(AbstractBinderC0548cb.m2501a(parcel.readStrongBinder()), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 5004:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                mo2591a(AbstractBinderC0548cb.m2501a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5005:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                mo2590a(AbstractBinderC0548cb.m2501a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5006:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                mo2592a(AbstractBinderC0548cb.m2501a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 5007:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                mo2596b(AbstractBinderC0548cb.m2501a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5008:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                mo2595b(AbstractBinderC0548cb.m2501a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5009:
                parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
                mo2597c(AbstractBinderC0548cb.m2501a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.appstate.internal.IAppStateService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
