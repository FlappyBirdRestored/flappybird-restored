package android.support.v4.app;

import android.view.animation.Animation;

/* JADX INFO: renamed from: android.support.v4.app.q */
/* JADX INFO: loaded from: classes.dex */
class AnimationAnimationListenerC0024q implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Fragment f171a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0022o f172b;

    AnimationAnimationListenerC0024q(C0022o c0022o, Fragment fragment) {
        this.f172b = c0022o;
        this.f171a = fragment;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        if (this.f171a.f28b != null) {
            this.f171a.f28b = null;
            this.f172b.m123a(this.f171a, this.f171a.f29c, 0, 0, false);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
