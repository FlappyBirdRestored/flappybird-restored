package android.support.v4.view;

import android.view.VelocityTracker;

/* JADX INFO: renamed from: android.support.v4.view.ap */
/* JADX INFO: loaded from: classes.dex */
class C0097ap implements InterfaceC0099ar {
    C0097ap() {
    }

    @Override // android.support.v4.view.InterfaceC0099ar
    /* JADX INFO: renamed from: a */
    public float mo498a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity();
    }

    @Override // android.support.v4.view.InterfaceC0099ar
    /* JADX INFO: renamed from: b */
    public float mo499b(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity();
    }
}
