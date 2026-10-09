package com.google.ads.util;

/* JADX INFO: renamed from: com.google.ads.util.j */
/* JADX INFO: loaded from: classes.dex */
public class C0367j {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ boolean f1374a;

    static {
        f1374a = !C0367j.class.desiredAssertionStatus();
    }

    private C0367j() {
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m1403a(String str) {
        return m1404a(str.getBytes(), 0);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m1404a(byte[] bArr, int i) {
        return m1405a(bArr, 0, bArr.length, i);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m1405a(byte[] bArr, int i, int i2, int i3) {
        C0369l c0369l = new C0369l(i3, new byte[(i2 * 3) / 4]);
        if (!c0369l.m1406a(bArr, i, i2, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        if (c0369l.f1376b == c0369l.f1375a.length) {
            return c0369l.f1375a;
        }
        byte[] bArr2 = new byte[c0369l.f1376b];
        System.arraycopy(c0369l.f1375a, 0, bArr2, 0, c0369l.f1376b);
        return bArr2;
    }
}
