package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: android.support.v4.widget.l */
/* JADX INFO: loaded from: classes.dex */
class C0183l {
    /* JADX INFO: renamed from: a */
    public static Object m760a(Context context) {
        return new EdgeEffect(context);
    }

    /* JADX INFO: renamed from: a */
    public static void m761a(Object obj, int i, int i2) {
        ((EdgeEffect) obj).setSize(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m762a(Object obj) {
        return ((EdgeEffect) obj).isFinished();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m763a(Object obj, float f) {
        ((EdgeEffect) obj).onPull(f);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m764a(Object obj, Canvas canvas) {
        return ((EdgeEffect) obj).draw(canvas);
    }

    /* JADX INFO: renamed from: b */
    public static void m765b(Object obj) {
        ((EdgeEffect) obj).finish();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m766c(Object obj) {
        EdgeEffect edgeEffect = (EdgeEffect) obj;
        edgeEffect.onRelease();
        return edgeEffect.isFinished();
    }
}
