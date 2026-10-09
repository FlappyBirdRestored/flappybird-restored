package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.C0452d;

/* JADX INFO: renamed from: com.google.android.gms.internal.af */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0498af extends Binder implements InterfaceC0496ad {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0496ad m2253a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0496ad)) ? new C0499ag(iBinder) : (InterfaceC0496ad) iInterfaceQueryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 5001:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2143a(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5002:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2145a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5003:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                String strA = mo2140a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 5004:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                Bundle bundleB = mo2169b();
                parcel2.writeNoException();
                if (bundleB == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundleB.writeToParcel(parcel2, 1);
                return true;
            case 5005:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2144a(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5006:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2184c();
                parcel2.writeNoException();
                return true;
            case 5007:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                String strD = mo2194d();
                parcel2.writeNoException();
                parcel2.writeString(strD);
                return true;
            case 5008:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2152a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5009:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2159a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5010:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2174b(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5011:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2163a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0, parcel.createLongArray());
                parcel2.writeNoException();
                return true;
            case 5012:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                String strE = mo2200e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 5013:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                C0452d c0452dF = mo2204f();
                parcel2.writeNoException();
                if (c0452dF == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                c0452dF.writeToParcel(parcel2, 1);
                return true;
            case 5014:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2187c(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5015:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2147a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5016:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2157a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5017:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2172b(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5018:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2197d(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5019:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2153a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5020:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2175b(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5021:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2149a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5022:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2185c(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5023:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2158a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5024:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2177b(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5025:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2154a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5026:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2195d(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5027:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2201e(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5028:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2165a(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5029:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2183b(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5030:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2150a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readStrongBinder(), parcel.readInt(), parcel.createStringArray(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5031:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2151a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readStrongBinder(), parcel.readString(), parcel.readInt() != 0, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5032:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2203e(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5033:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                int iA = mo2137a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.createByteArray(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iA);
                return true;
            case 5034:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                int iA2 = mo2138a(parcel.createByteArray(), parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                parcel2.writeInt(iA2);
                return true;
            case 5035:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                String strB = mo2170b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case 5036:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2142a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5037:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2206f(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5038:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2178b(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5039:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2160a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5040:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2179b(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5041:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2188c(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5042:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2208g(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5043:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2212h(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5044:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2146a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5045:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2155a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5046:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2173b(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5047:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2205f(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5048:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2186c(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5049:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2207g(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5050:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2191c(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5051:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2167a(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5052:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2214i(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5053:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                int iJ = mo2215j(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iJ);
                return true;
            case 5054:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2162a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5055:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2192c(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5056:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2211h(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5057:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2217l(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5058:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2148a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5059:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2171b(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 5060:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                int iD = mo2193d(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iD);
                return true;
            case 5061:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2216k(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5062:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2213i(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5063:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2164a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5064:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                String strA2 = mo2141a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strA2);
                return true;
            case 5065:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2166a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5066:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                Uri uriE = mo2199e(parcel.readString());
                parcel2.writeNoException();
                if (uriE == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                uriE.writeToParcel(parcel2, 1);
                return true;
            case 5067:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                boolean zG = mo2209g();
                parcel2.writeNoException();
                parcel2.writeInt(zG ? 1 : 0);
                return true;
            case 5068:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2168a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5501:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2176b(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5502:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                C0452d c0452dH = mo2210h();
                parcel2.writeNoException();
                if (c0452dH == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                c0452dH.writeToParcel(parcel2, 1);
                return true;
            case 6001:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2182b(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6002:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2161a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6003:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2196d(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6004:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2202e(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6501:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2156a(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6502:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2181b(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6503:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2190c(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6504:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2189c(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6505:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2198d(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6506:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                mo2180b(AbstractBinderC0493aa.m2086a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6507:
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                ParcelFileDescriptor parcelFileDescriptorA = mo2139a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (parcelFileDescriptorA == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                parcelFileDescriptorA.writeToParcel(parcel2, 1);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.games.internal.IGamesService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
