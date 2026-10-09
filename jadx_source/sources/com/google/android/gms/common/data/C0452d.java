package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0588do;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.common.data.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0452d implements SafeParcelable {
    public static final C0454f CREATOR = new C0454f();

    /* JADX INFO: renamed from: e */
    private static final HashMap f1614e = (HashMap) null;

    /* JADX INFO: renamed from: f */
    private static final Object f1615f = new Object();

    /* JADX INFO: renamed from: l */
    private static final C0453e f1616l = new C0451c(new String[0], null);

    /* JADX INFO: renamed from: a */
    Bundle f1617a;

    /* JADX INFO: renamed from: b */
    int[] f1618b;

    /* JADX INFO: renamed from: c */
    int f1619c;

    /* JADX INFO: renamed from: d */
    boolean f1620d = false;

    /* JADX INFO: renamed from: g */
    private final int f1621g;

    /* JADX INFO: renamed from: h */
    private final String[] f1622h;

    /* JADX INFO: renamed from: i */
    private final CursorWindow[] f1623i;

    /* JADX INFO: renamed from: j */
    private final int f1624j;

    /* JADX INFO: renamed from: k */
    private final Bundle f1625k;

    C0452d(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f1621g = i;
        this.f1622h = strArr;
        this.f1623i = cursorWindowArr;
        this.f1624j = i2;
        this.f1625k = bundle;
    }

    /* JADX INFO: renamed from: a */
    private void m1850a(String str, int i) {
        if (this.f1617a == null || !this.f1617a.containsKey(str)) {
            throw new IllegalArgumentException("No such column: " + str);
        }
        if (m1865h()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.f1619c) {
            throw new CursorIndexOutOfBoundsException(i, this.f1619c);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m1851a(int i) {
        int i2 = 0;
        C0588do.m2706a(i >= 0 && i < this.f1619c);
        while (i2 < this.f1618b.length) {
            if (i < this.f1618b[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == this.f1618b.length ? i2 - 1 : i2;
    }

    /* JADX INFO: renamed from: a */
    public long m1852a(String str, int i, int i2) {
        m1850a(str, i);
        return this.f1623i[i2].getLong(i - this.f1618b[i2], this.f1617a.getInt(str));
    }

    /* JADX INFO: renamed from: a */
    public void m1853a() {
        this.f1617a = new Bundle();
        for (int i = 0; i < this.f1622h.length; i++) {
            this.f1617a.putInt(this.f1622h[i], i);
        }
        this.f1618b = new int[this.f1623i.length];
        int numRows = 0;
        for (int i2 = 0; i2 < this.f1623i.length; i2++) {
            this.f1618b[i2] = numRows;
            numRows += this.f1623i[i2].getNumRows();
        }
        this.f1619c = numRows;
    }

    /* JADX INFO: renamed from: b */
    int m1854b() {
        return this.f1621g;
    }

    /* JADX INFO: renamed from: b */
    public int m1855b(String str, int i, int i2) {
        m1850a(str, i);
        return this.f1623i[i2].getInt(i - this.f1618b[i2], this.f1617a.getInt(str));
    }

    /* JADX INFO: renamed from: c */
    public String m1856c(String str, int i, int i2) {
        m1850a(str, i);
        return this.f1623i[i2].getString(i - this.f1618b[i2], this.f1617a.getInt(str));
    }

    /* JADX INFO: renamed from: c */
    String[] m1857c() {
        return this.f1622h;
    }

    /* JADX INFO: renamed from: d */
    public boolean m1858d(String str, int i, int i2) {
        m1850a(str, i);
        return Long.valueOf(this.f1623i[i2].getLong(i - this.f1618b[i2], this.f1617a.getInt(str))).longValue() == 1;
    }

    /* JADX INFO: renamed from: d */
    CursorWindow[] m1859d() {
        return this.f1623i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public int m1860e() {
        return this.f1624j;
    }

    /* JADX INFO: renamed from: e */
    public Uri m1861e(String str, int i, int i2) {
        String strM1856c = m1856c(str, i, i2);
        if (strM1856c == null) {
            return null;
        }
        return Uri.parse(strM1856c);
    }

    /* JADX INFO: renamed from: f */
    public Bundle m1862f() {
        return this.f1625k;
    }

    /* JADX INFO: renamed from: f */
    public boolean m1863f(String str, int i, int i2) {
        m1850a(str, i);
        return this.f1623i[i2].isNull(i - this.f1618b[i2], this.f1617a.getInt(str));
    }

    /* JADX INFO: renamed from: g */
    public int m1864g() {
        return this.f1619c;
    }

    /* JADX INFO: renamed from: h */
    public boolean m1865h() {
        boolean z;
        synchronized (this) {
            z = this.f1620d;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C0454f.m1866a(this, parcel, i);
    }
}
