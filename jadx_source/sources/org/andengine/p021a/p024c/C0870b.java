package org.andengine.p021a.p024c;

import android.content.Context;

/* JADX INFO: renamed from: org.andengine.a.c.b */
/* JADX INFO: loaded from: classes.dex */
public class C0870b {

    /* JADX INFO: renamed from: a */
    private static String f2539a = "";

    /* JADX INFO: renamed from: a */
    public static C0867a m3572a(C0871c c0871c, Context context, String str) {
        C0867a c0867a;
        synchronized (c0871c) {
            c0867a = new C0867a(c0871c, c0871c.m3577c().load(context.getAssets().openFd(String.valueOf(f2539a) + str), 1));
            c0871c.mo3563a(c0867a);
        }
        return c0867a;
    }

    /* JADX INFO: renamed from: a */
    public static void m3573a() {
        m3574a("");
    }

    /* JADX INFO: renamed from: a */
    public static void m3574a(String str) {
        if (!str.endsWith("/") && str.length() != 0) {
            throw new IllegalStateException("pAssetBasePath must end with '/' or be lenght zero.");
        }
        f2539a = str;
    }
}
