package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* JADX INFO: renamed from: android.support.v4.widget.r */
/* JADX INFO: loaded from: classes.dex */
class C0189r {
    /* JADX INFO: renamed from: a */
    public static Object m785a(Context context, Interpolator interpolator) {
        return interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    /* JADX INFO: renamed from: a */
    public static void m786a(Object obj, int i, int i2, int i3, int i4, int i5) {
        ((OverScroller) obj).startScroll(i, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m787a(Object obj) {
        return ((OverScroller) obj).isFinished();
    }

    /* JADX INFO: renamed from: b */
    public static int m788b(Object obj) {
        return ((OverScroller) obj).getCurrX();
    }

    /* JADX INFO: renamed from: c */
    public static int m789c(Object obj) {
        return ((OverScroller) obj).getCurrY();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m790d(Object obj) {
        return ((OverScroller) obj).computeScrollOffset();
    }

    /* JADX INFO: renamed from: e */
    public static void m791e(Object obj) {
        ((OverScroller) obj).abortAnimation();
    }

    /* JADX INFO: renamed from: f */
    public static int m792f(Object obj) {
        return ((OverScroller) obj).getFinalX();
    }

    /* JADX INFO: renamed from: g */
    public static int m793g(Object obj) {
        return ((OverScroller) obj).getFinalY();
    }
}
