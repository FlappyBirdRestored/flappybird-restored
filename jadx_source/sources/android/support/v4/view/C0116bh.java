package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: android.support.v4.view.bh */
/* JADX INFO: loaded from: classes.dex */
class C0116bh {
    /* JADX INFO: renamed from: a */
    public static void m547a(View view) {
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: a */
    public static void m548a(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    /* JADX INFO: renamed from: a */
    public static void m549a(View view, int i, int i2, int i3, int i4) {
        view.postInvalidate(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public static void m550a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* JADX INFO: renamed from: b */
    public static int m551b(View view) {
        return view.getImportantForAccessibility();
    }

    /* JADX INFO: renamed from: c */
    public static ViewParent m552c(View view) {
        return view.getParentForAccessibility();
    }
}
