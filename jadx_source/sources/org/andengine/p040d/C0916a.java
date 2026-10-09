package org.andengine.p040d;

import android.app.Activity;
import android.view.Window;

/* JADX INFO: renamed from: org.andengine.d.a */
/* JADX INFO: loaded from: classes.dex */
public class C0916a {
    /* JADX INFO: renamed from: a */
    public static void m3750a(Activity activity) {
        Window window = activity.getWindow();
        window.addFlags(1024);
        window.clearFlags(2048);
        window.requestFeature(1);
    }

    /* JADX INFO: renamed from: b */
    public static void m3751b(Activity activity) {
        activity.getWindow().addFlags(128);
    }
}
