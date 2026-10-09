package android.support.v4.p001b;

/* JADX INFO: renamed from: android.support.v4.b.c */
/* JADX INFO: loaded from: classes.dex */
class C0036c {

    /* JADX INFO: renamed from: a */
    static final int[] f186a = new int[0];

    /* JADX INFO: renamed from: b */
    static final long[] f187b = new long[0];

    /* JADX INFO: renamed from: c */
    static final Object[] f188c = new Object[0];

    /* JADX INFO: renamed from: a */
    public static int m196a(int i) {
        return m199b(i * 4) / 4;
    }

    /* JADX INFO: renamed from: a */
    static int m197a(int[] iArr, int i, int i2) {
        int i3 = 0;
        int i4 = i - 1;
        while (i3 <= i4) {
            int i5 = (i3 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i3 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return i3 ^ (-1);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m198a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: renamed from: b */
    public static int m199b(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            if (i <= (1 << i2) - 12) {
                return (1 << i2) - 12;
            }
        }
        return i;
    }
}
