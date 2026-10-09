package android.support.v4.view;

import android.view.MotionEvent;

/* JADX INFO: renamed from: android.support.v4.view.ad */
/* JADX INFO: loaded from: classes.dex */
class C0085ad {
    /* JADX INFO: renamed from: a */
    public static int m466a(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    /* JADX INFO: renamed from: a */
    public static int m467a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    /* JADX INFO: renamed from: b */
    public static int m468b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    /* JADX INFO: renamed from: c */
    public static float m469c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    /* JADX INFO: renamed from: d */
    public static float m470d(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }
}
