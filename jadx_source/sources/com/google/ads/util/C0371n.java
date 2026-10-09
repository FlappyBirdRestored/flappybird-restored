package com.google.ads.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.util.DisplayMetrics;
import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: com.google.ads.util.n */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(C0467e.MapAttrs_cameraTilt)
public final class C0371n {
    /* JADX INFO: renamed from: a */
    private static int m1408a(Context context, float f, int i) {
        return (context.getApplicationInfo().flags & 8192) != 0 ? (int) (i / f) : i;
    }

    /* JADX INFO: renamed from: a */
    public static int m1409a(Context context, DisplayMetrics displayMetrics) {
        return m1408a(context, displayMetrics.density, displayMetrics.heightPixels);
    }

    /* JADX INFO: renamed from: a */
    public static void m1410a(Intent intent, String str) {
        intent.setPackage(str);
    }

    /* JADX INFO: renamed from: b */
    public static int m1411b(Context context, DisplayMetrics displayMetrics) {
        return m1408a(context, displayMetrics.density, displayMetrics.widthPixels);
    }
}
