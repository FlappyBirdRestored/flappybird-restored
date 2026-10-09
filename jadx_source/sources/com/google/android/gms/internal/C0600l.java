package com.google.android.gms.internal;

import android.util.Base64;

/* JADX INFO: renamed from: com.google.android.gms.internal.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0600l {
    /* JADX INFO: renamed from: a */
    public static String m2749a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    /* JADX INFO: renamed from: b */
    public static String m2750b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }
}
