package org.andengine.p021a.p023b;

/* JADX INFO: renamed from: org.andengine.a.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C0864a {

    /* JADX INFO: renamed from: a */
    private static String f2533a = "";

    /* JADX INFO: renamed from: a */
    public static void m3566a() {
        m3567a("");
    }

    /* JADX INFO: renamed from: a */
    public static void m3567a(String str) {
        if (!str.endsWith("/") && str.length() != 0) {
            throw new IllegalStateException("pAssetBasePath must end with '/' or be lenght zero.");
        }
        f2533a = str;
    }
}
