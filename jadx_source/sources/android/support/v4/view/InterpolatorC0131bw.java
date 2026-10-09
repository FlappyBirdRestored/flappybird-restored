package android.support.v4.view;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: android.support.v4.view.bw */
/* JADX INFO: loaded from: classes.dex */
final class InterpolatorC0131bw implements Interpolator {
    InterpolatorC0131bw() {
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
