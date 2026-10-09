package org.andengine.opengl.p066c.p067a.p068a;

import android.content.Context;
import android.content.res.AssetManager;
import org.andengine.opengl.p066c.p067a.p068a.p069a.C0993a;
import org.andengine.opengl.p066c.p067a.p068a.p069a.InterfaceC0994b;
import org.andengine.opengl.p066c.p072c.C1005c;
import org.andengine.opengl.p066c.p072c.C1006d;

/* JADX INFO: renamed from: org.andengine.opengl.c.a.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0995b {

    /* JADX INFO: renamed from: a */
    private static String f2886a = "";

    /* JADX INFO: renamed from: a */
    public static C1005c m3936a(C0992a c0992a, Context context, String str, int i, int i2) {
        return m3937a(c0992a, context.getAssets(), str, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static C1005c m3937a(C0992a c0992a, AssetManager assetManager, String str, int i, int i2) {
        return m3938a(c0992a, C0993a.m3933a(assetManager, String.valueOf(f2886a) + str), i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static C1005c m3938a(C0992a c0992a, InterfaceC0994b interfaceC0994b, int i, int i2) {
        return C1006d.m3973a(c0992a, interfaceC0994b, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static void m3939a() {
        m3940a("");
    }

    /* JADX INFO: renamed from: a */
    public static void m3940a(String str) {
        if (!str.endsWith("/") && str.length() != 0) {
            throw new IllegalArgumentException("pAssetBasePath must end with '/' or be lenght zero.");
        }
        f2886a = str;
    }
}
