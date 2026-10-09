package org.andengine.opengl.p061a;

import org.andengine.p040d.p051d.C0939a;

/* JADX INFO: renamed from: org.andengine.opengl.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0974b {

    /* JADX INFO: renamed from: a */
    private static final int f2829a = C0939a.f2728C;

    /* JADX INFO: renamed from: b */
    private static String f2830b = "";

    /* JADX INFO: renamed from: a */
    public static void m3892a() {
        m3893a("");
    }

    /* JADX INFO: renamed from: a */
    public static void m3893a(String str) {
        if (!str.endsWith("/") && str.length() != 0) {
            throw new IllegalStateException("pAssetBasePath must end with '/' or be lenght zero.");
        }
        f2830b = str;
    }
}
