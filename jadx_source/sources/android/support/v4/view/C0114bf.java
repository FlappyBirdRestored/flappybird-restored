package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: renamed from: android.support.v4.view.bf */
/* JADX INFO: loaded from: classes.dex */
class C0114bf {
    /* JADX INFO: renamed from: a */
    public static int m542a(View view) {
        return view.getLayerType();
    }

    /* JADX INFO: renamed from: a */
    static long m543a() {
        return ValueAnimator.getFrameDelay();
    }

    /* JADX INFO: renamed from: a */
    public static void m544a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }
}
