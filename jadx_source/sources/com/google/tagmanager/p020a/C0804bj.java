package com.google.tagmanager.p020a;

import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: com.google.tagmanager.a.bj */
/* JADX INFO: loaded from: classes.dex */
final class C0804bj {
    /* JADX INFO: renamed from: a */
    private static int m3375a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private static int m3376a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return (i2 << 8) ^ i;
    }

    /* JADX INFO: renamed from: a */
    private static int m3377a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return ((i2 << 8) ^ i) ^ (i3 << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        if (r8[r2] > (-65)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007d, code lost:
    
        if (r8[r2] > (-65)) goto L47;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m3378a(int r7, byte[] r8, int r9, int r10) {
        /*
            r3 = -32
            r4 = -96
            r1 = -1
            r6 = -65
            if (r7 == 0) goto L82
            if (r9 < r10) goto Lc
        Lb:
            return r7
        Lc:
            byte r5 = (byte) r7
            if (r5 >= r3) goto L1b
            r0 = -62
            if (r5 < r0) goto L19
            int r0 = r9 + 1
            r2 = r8[r9]
            if (r2 <= r6) goto L81
        L19:
            r7 = r1
            goto Lb
        L1b:
            r0 = -16
            if (r5 >= r0) goto L46
            int r0 = r7 >> 8
            r0 = r0 ^ (-1)
            byte r0 = (byte) r0
            if (r0 != 0) goto L31
            int r2 = r9 + 1
            r0 = r8[r9]
            if (r2 < r10) goto L32
            int r7 = m3376a(r5, r0)
            goto Lb
        L31:
            r2 = r9
        L32:
            if (r0 > r6) goto L44
            if (r5 != r3) goto L38
            if (r0 < r4) goto L44
        L38:
            r3 = -19
            if (r5 != r3) goto L3e
            if (r0 >= r4) goto L44
        L3e:
            int r9 = r2 + 1
            r0 = r8[r2]
            if (r0 <= r6) goto L82
        L44:
            r7 = r1
            goto Lb
        L46:
            int r0 = r7 >> 8
            r0 = r0 ^ (-1)
            byte r2 = (byte) r0
            r0 = 0
            if (r2 != 0) goto L59
            int r3 = r9 + 1
            r2 = r8[r9]
            if (r3 < r10) goto L87
            int r7 = m3376a(r5, r2)
            goto Lb
        L59:
            int r0 = r7 >> 16
            byte r0 = (byte) r0
            r4 = r2
            r3 = r9
        L5e:
            if (r0 != 0) goto L6b
            int r2 = r3 + 1
            r0 = r8[r3]
            if (r2 < r10) goto L6c
            int r7 = m3377a(r5, r4, r0)
            goto Lb
        L6b:
            r2 = r3
        L6c:
            if (r4 > r6) goto L7f
            int r3 = r5 << 28
            int r4 = r4 + 112
            int r3 = r3 + r4
            int r3 = r3 >> 30
            if (r3 != 0) goto L7f
            if (r0 > r6) goto L7f
            int r9 = r2 + 1
            r0 = r8[r2]
            if (r0 <= r6) goto L82
        L7f:
            r7 = r1
            goto Lb
        L81:
            r9 = r0
        L82:
            int r7 = m3381b(r8, r9, r10)
            goto Lb
        L87:
            r4 = r2
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.tagmanager.p020a.C0804bj.m3378a(int, byte[], int, int):int");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3379a(byte[] bArr) {
        return m3380a(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3380a(byte[] bArr, int i, int i2) {
        return m3381b(bArr, i, i2) == 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m3381b(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        return m3382c(bArr, i, i2);
    }

    /* JADX INFO: renamed from: c */
    private static int m3382c(byte[] bArr, int i, int i2) {
        int i3;
        while (i < i2) {
            int i4 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                if (b < -32) {
                    if (i4 >= i2) {
                        return b;
                    }
                    if (b >= -62) {
                        i3 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                }
                if (b >= -16) {
                    if (i4 >= i2 - 2) {
                        return m3383d(bArr, i4, i2);
                    }
                    int i5 = i4 + 1;
                    byte b2 = bArr[i4];
                    if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                        int i6 = i5 + 1;
                        if (bArr[i5] <= -65) {
                            i3 = i6 + 1;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i4 >= i2 - 1) {
                    return m3383d(bArr, i4, i2);
                }
                int i7 = i4 + 1;
                byte b3 = bArr[i4];
                if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                    i3 = i7 + 1;
                    if (bArr[i7] > -65) {
                    }
                }
                return -1;
                i = i3;
            } else {
                i = i4;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    private static int m3383d(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        switch (i2 - i) {
            case C0467e.MapAttrs_mapType /* 0 */:
                return m3375a(b);
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                return m3376a(b, bArr[i]);
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                return m3377a(b, bArr[i], bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }
}
