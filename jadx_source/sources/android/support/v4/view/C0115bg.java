package android.support.v4.view;

import android.view.View;

/* JADX INFO: renamed from: android.support.v4.view.bg */
/* JADX INFO: loaded from: classes.dex */
class C0115bg {
    /* JADX INFO: renamed from: a */
    public static void m545a(View view, Object obj) {
        view.setAccessibilityDelegate((View.AccessibilityDelegate) obj);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m546a(View view, int i) {
        return view.canScrollHorizontally(i);
    }
}
