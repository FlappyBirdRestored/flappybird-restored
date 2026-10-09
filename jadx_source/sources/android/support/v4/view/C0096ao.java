package android.support.v4.view;

import android.os.Build;
import android.view.VelocityTracker;

/* JADX INFO: renamed from: android.support.v4.view.ao */
/* JADX INFO: loaded from: classes.dex */
public class C0096ao {

    /* JADX INFO: renamed from: a */
    static final InterfaceC0099ar f354a;

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f354a = new C0098aq();
        } else {
            f354a = new C0097ap();
        }
    }

    /* JADX INFO: renamed from: a */
    public static float m496a(VelocityTracker velocityTracker, int i) {
        return f354a.mo498a(velocityTracker, i);
    }

    /* JADX INFO: renamed from: b */
    public static float m497b(VelocityTracker velocityTracker, int i) {
        return f354a.mo499b(velocityTracker, i);
    }
}
