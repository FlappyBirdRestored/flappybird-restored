package android.support.v4.widget;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: android.support.v4.widget.ad */
/* JADX INFO: loaded from: classes.dex */
final class InterpolatorC0170ad implements Interpolator {
    InterpolatorC0170ad() {
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
