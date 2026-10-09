package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.safeparcel.a */
/* JADX INFO: loaded from: classes.dex */
public class C0463a {
    /* JADX INFO: renamed from: a */
    public static int m1907a(int i) {
        return 65535 & i;
    }

    /* JADX INFO: renamed from: a */
    public static int m1908a(Parcel parcel) {
        return parcel.readInt();
    }

    /* JADX INFO: renamed from: a */
    public static int m1909a(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m1910a(Parcel parcel, int i, Parcelable.Creator creator) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iM1909a + iDataPosition);
        return parcelable;
    }

    /* JADX INFO: renamed from: a */
    private static void m1911a(Parcel parcel, int i, int i2) {
        int iM1909a = m1909a(parcel, i);
        if (iM1909a != i2) {
            throw new C0464b("Expected size " + i2 + " got " + iM1909a + " (0x" + Integer.toHexString(iM1909a) + ")", parcel);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1912a(Parcel parcel, int i, List list, ClassLoader classLoader) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(iM1909a + iDataPosition);
    }

    /* JADX INFO: renamed from: b */
    public static int m1913b(Parcel parcel) {
        int iM1908a = m1908a(parcel);
        int iM1909a = m1909a(parcel, iM1908a);
        int iDataPosition = parcel.dataPosition();
        if (m1907a(iM1908a) != 20293) {
            throw new C0464b("Expected object header. Got 0x" + Integer.toHexString(iM1908a), parcel);
        }
        int i = iDataPosition + iM1909a;
        if (i < iDataPosition || i > parcel.dataSize()) {
            throw new C0464b("Size read is invalid start=" + iDataPosition + " end=" + i, parcel);
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static void m1914b(Parcel parcel, int i) {
        parcel.setDataPosition(m1909a(parcel, i) + parcel.dataPosition());
    }

    /* JADX INFO: renamed from: b */
    public static Object[] m1915b(Parcel parcel, int i, Parcelable.Creator creator) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iM1909a + iDataPosition);
        return objArrCreateTypedArray;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m1916c(Parcel parcel, int i, Parcelable.Creator creator) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iM1909a + iDataPosition);
        return arrayListCreateTypedArrayList;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1917c(Parcel parcel, int i) {
        m1911a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* JADX INFO: renamed from: d */
    public static byte m1918d(Parcel parcel, int i) {
        m1911a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* JADX INFO: renamed from: e */
    public static short m1919e(Parcel parcel, int i) {
        m1911a(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* JADX INFO: renamed from: f */
    public static int m1920f(Parcel parcel, int i) {
        m1911a(parcel, i, 4);
        return parcel.readInt();
    }

    /* JADX INFO: renamed from: g */
    public static long m1921g(Parcel parcel, int i) {
        m1911a(parcel, i, 8);
        return parcel.readLong();
    }

    /* JADX INFO: renamed from: h */
    public static BigInteger m1922h(Parcel parcel, int i) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iM1909a + iDataPosition);
        return new BigInteger(bArrCreateByteArray);
    }

    /* JADX INFO: renamed from: i */
    public static float m1923i(Parcel parcel, int i) {
        m1911a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* JADX INFO: renamed from: j */
    public static double m1924j(Parcel parcel, int i) {
        m1911a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* JADX INFO: renamed from: k */
    public static BigDecimal m1925k(Parcel parcel, int i) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i2 = parcel.readInt();
        parcel.setDataPosition(iM1909a + iDataPosition);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i2);
    }

    /* JADX INFO: renamed from: l */
    public static String m1926l(Parcel parcel, int i) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iM1909a + iDataPosition);
        return string;
    }

    /* JADX INFO: renamed from: m */
    public static IBinder m1927m(Parcel parcel, int i) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iM1909a + iDataPosition);
        return strongBinder;
    }

    /* JADX INFO: renamed from: n */
    public static Bundle m1928n(Parcel parcel, int i) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iM1909a + iDataPosition);
        return bundle;
    }

    /* JADX INFO: renamed from: o */
    public static byte[] m1929o(Parcel parcel, int i) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iM1909a + iDataPosition);
        return bArrCreateByteArray;
    }

    /* JADX INFO: renamed from: p */
    public static boolean[] m1930p(Parcel parcel, int i) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(iM1909a + iDataPosition);
        return zArrCreateBooleanArray;
    }

    /* JADX INFO: renamed from: q */
    public static int[] m1931q(Parcel parcel, int i) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iM1909a + iDataPosition);
        return iArrCreateIntArray;
    }

    /* JADX INFO: renamed from: r */
    public static long[] m1932r(Parcel parcel, int i) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iM1909a + iDataPosition);
        return jArrCreateLongArray;
    }

    /* JADX INFO: renamed from: s */
    public static BigInteger[] m1933s(Parcel parcel, int i) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bigIntegerArr[i3] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(iDataPosition + iM1909a);
        return bigIntegerArr;
    }

    /* JADX INFO: renamed from: t */
    public static float[] m1934t(Parcel parcel, int i) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(iM1909a + iDataPosition);
        return fArrCreateFloatArray;
    }

    /* JADX INFO: renamed from: u */
    public static double[] m1935u(Parcel parcel, int i) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        double[] dArrCreateDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(iM1909a + iDataPosition);
        return dArrCreateDoubleArray;
    }

    /* JADX INFO: renamed from: v */
    public static BigDecimal[] m1936v(Parcel parcel, int i) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArrCreateByteArray = parcel.createByteArray();
            bigDecimalArr[i3] = new BigDecimal(new BigInteger(bArrCreateByteArray), parcel.readInt());
        }
        parcel.setDataPosition(iDataPosition + iM1909a);
        return bigDecimalArr;
    }

    /* JADX INFO: renamed from: w */
    public static String[] m1937w(Parcel parcel, int i) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iM1909a + iDataPosition);
        return strArrCreateStringArray;
    }

    /* JADX INFO: renamed from: x */
    public static ArrayList m1938x(Parcel parcel, int i) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iM1909a + iDataPosition);
        return arrayListCreateStringArrayList;
    }

    /* JADX INFO: renamed from: y */
    public static Parcel m1939y(Parcel parcel, int i) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.appendFrom(parcel, iDataPosition, iM1909a);
        parcel.setDataPosition(iM1909a + iDataPosition);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: z */
    public static Parcel[] m1940z(Parcel parcel, int i) {
        int iM1909a = m1909a(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM1909a == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        Parcel[] parcelArr = new Parcel[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = parcel.readInt();
            if (i4 != 0) {
                int iDataPosition2 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i4);
                parcelArr[i3] = parcelObtain;
                parcel.setDataPosition(i4 + iDataPosition2);
            } else {
                parcelArr[i3] = null;
            }
        }
        parcel.setDataPosition(iDataPosition + iM1909a);
        return parcelArr;
    }
}
