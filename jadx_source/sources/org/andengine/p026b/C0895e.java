package org.andengine.p026b;

import org.andengine.p026b.p031c.C0887b;

/* JADX INFO: renamed from: org.andengine.b.e */
/* JADX INFO: loaded from: classes.dex */
public class C0895e extends ViewOnTouchListenerC0873a {

    /* JADX INFO: renamed from: e */
    private final long f2632e;

    public C0895e(C0887b c0887b, int i) {
        super(c0887b);
        this.f2632e = 1000000000 / ((long) i);
    }

    @Override // org.andengine.p026b.ViewOnTouchListenerC0873a
    /* JADX INFO: renamed from: a */
    public void mo3583a(long j) throws InterruptedException {
        long j2 = this.f2632e - j;
        if (j2 <= 0) {
            super.mo3583a(j);
        } else {
            Thread.sleep((int) (j2 / 1000000));
            super.mo3583a(j2 + j);
        }
    }
}
