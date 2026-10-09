package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.C0452d;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

/* JADX INFO: renamed from: com.google.android.gms.internal.aa */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0493aa extends Binder implements InterfaceC0613y {
    public AbstractBinderC0493aa() {
        attachInterface(this, "com.google.android.gms.games.internal.IGamesCallbacks");
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC0613y m2086a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0613y)) ? new C0495ac(iBinder) : (InterfaceC0613y) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 5001:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2098a(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5002:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2100a(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5003:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2106b(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5004:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2107b(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5005:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2101a(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5006:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2112c(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5007:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2115d(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5008:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2117e(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5009:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2119f(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5010:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2121g(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5011:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2122h(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5012:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2125k(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5013:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2096a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5014:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2126l(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5015:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2105b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5016:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2095a();
                parcel2.writeNoException();
                return true;
            case 5017:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2123i(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5018:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2127m(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5019:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2128n(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5020:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2111c(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5021:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2129o(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5022:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2130p(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5023:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2131q(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5024:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2132r(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5025:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2133s(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5026:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2102a(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5027:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2108b(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5028:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2113c(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5029:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2116d(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5030:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2118e(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5031:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2120f(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 5032:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2103a(parcel.readInt() != 0 ? (RealTimeMessage) RealTimeMessage.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5033:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2097a(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5034:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2099a(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5035:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2135u(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5036:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2110c(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5037:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2124j(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5038:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2134t(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5039:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2136v(parcel.readInt() != 0 ? C0452d.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5040:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2114d(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 6001:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2104a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6002:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                mo2109b(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.games.internal.IGamesCallbacks");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
