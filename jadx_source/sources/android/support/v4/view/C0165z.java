package android.support.v4.view;

import android.os.Build;
import android.view.MotionEvent;

/* JADX INFO: renamed from: android.support.v4.view.z */
/* JADX INFO: loaded from: classes.dex */
public class C0165z {

    /* JADX INFO: renamed from: a */
    static final InterfaceC0084ac f374a;

    static {
        if (Build.VERSION.SDK_INT >= 5) {
            f374a = new C0083ab();
        } else {
            f374a = new C0082aa();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m612a(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }

    /* JADX INFO: renamed from: a */
    public static int m613a(MotionEvent motionEvent, int i) {
        return f374a.mo462a(motionEvent, i);
    }

    /* JADX INFO: renamed from: b */
    public static int m614b(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    /* JADX INFO: renamed from: b */
    public static int m615b(MotionEvent motionEvent, int i) {
        return f374a.mo463b(motionEvent, i);
    }

    /* JADX INFO: renamed from: c */
    public static float m616c(MotionEvent motionEvent, int i) {
        return f374a.mo464c(motionEvent, i);
    }

    /* JADX INFO: renamed from: c */
    public static int m617c(MotionEvent motionEvent) {
        return f374a.mo461a(motionEvent);
    }

    /* JADX INFO: renamed from: d */
    public static float m618d(MotionEvent motionEvent, int i) {
        return f374a.mo465d(motionEvent, i);
    }
}
