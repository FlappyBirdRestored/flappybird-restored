package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.safeparcel.c */
/* JADX INFO: loaded from: classes.dex */
public class C0465c {
    /* JADX INFO: renamed from: a */
    public static int m1941a(Parcel parcel) {
        return m1960b(parcel, 20293);
    }

    /* JADX INFO: renamed from: a */
    public static void m1942a(Parcel parcel, int i) {
        m1963c(parcel, i);
    }

    /* JADX INFO: renamed from: a */
    public static void m1943a(Parcel parcel, int i, byte b) {
        m1961b(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* JADX INFO: renamed from: a */
    public static void m1944a(Parcel parcel, int i, double d) {
        m1961b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* JADX INFO: renamed from: a */
    public static void m1945a(Parcel parcel, int i, float f) {
        m1961b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* JADX INFO: renamed from: a */
    public static void m1946a(Parcel parcel, int i, int i2) {
        m1961b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* JADX INFO: renamed from: a */
    public static void m1947a(Parcel parcel, int i, long j) {
        m1961b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* JADX INFO: renamed from: a */
    public static void m1948a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                m1961b(parcel, i, 0);
            }
        } else {
            int iM1960b = m1960b(parcel, i);
            parcel.writeBundle(bundle);
            m1963c(parcel, iM1960b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1949a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                m1961b(parcel, i, 0);
            }
        } else {
            int iM1960b = m1960b(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m1963c(parcel, iM1960b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1950a(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 == null) {
            if (z) {
                m1961b(parcel, i, 0);
            }
        } else {
            int iM1960b = m1960b(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m1963c(parcel, iM1960b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1951a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                m1961b(parcel, i, 0);
            }
        } else {
            int iM1960b = m1960b(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m1963c(parcel, iM1960b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1952a(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                m1961b(parcel, i, 0);
            }
        } else {
            int iM1960b = m1960b(parcel, i);
            parcel.writeString(str);
            m1963c(parcel, iM1960b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1953a(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                m1961b(parcel, i, 0);
            }
        } else {
            int iM1960b = m1960b(parcel, i);
            parcel.writeStringList(list);
            m1963c(parcel, iM1960b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1954a(Parcel parcel, int i, short s) {
        m1961b(parcel, i, 4);
        parcel.writeInt(s);
    }

    /* JADX INFO: renamed from: a */
    public static void m1955a(Parcel parcel, int i, boolean z) {
        m1961b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m1956a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                m1961b(parcel, i, 0);
            }
        } else {
            int iM1960b = m1960b(parcel, i);
            parcel.writeByteArray(bArr);
            m1963c(parcel, iM1960b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1957a(Parcel parcel, int i, Parcelable[] parcelableArr, int i2, boolean z) {
        if (parcelableArr == null) {
            if (z) {
                m1961b(parcel, i, 0);
                return;
            }
            return;
        }
        int iM1960b = m1960b(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m1959a(parcel, parcelable, i2);
            }
        }
        m1963c(parcel, iM1960b);
    }

    /* JADX INFO: renamed from: a */
    public static void m1958a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                m1961b(parcel, i, 0);
            }
        } else {
            int iM1960b = m1960b(parcel, i);
            parcel.writeStringArray(strArr);
            m1963c(parcel, iM1960b);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1959a(Parcel parcel, Parcelable parcelable, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    /* JADX INFO: renamed from: b */
    private static int m1960b(Parcel parcel, int i) {
        parcel.writeInt((-65536) | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX INFO: renamed from: b */
    private static void m1961b(Parcel parcel, int i, int i2) {
        if (i2 < 65535) {
            parcel.writeInt((i2 << 16) | i);
        } else {
            parcel.writeInt((-65536) | i);
            parcel.writeInt(i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1962b(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                m1961b(parcel, i, 0);
                return;
            }
            return;
        }
        int iM1960b = m1960b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m1959a(parcel, parcelable, 0);
            }
        }
        m1963c(parcel, iM1960b);
    }

    /* JADX INFO: renamed from: c */
    private static void m1963c(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    /* JADX INFO: renamed from: c */
    public static void m1964c(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                m1961b(parcel, i, 0);
            }
        } else {
            int iM1960b = m1960b(parcel, i);
            parcel.writeList(list);
            m1963c(parcel, iM1960b);
        }
    }
}
