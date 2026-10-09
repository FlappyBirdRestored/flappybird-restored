package android.support.v4.widget;

import android.support.v4.view.C0101at;
import android.view.View;

/* JADX INFO: renamed from: android.support.v4.widget.u */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0192u implements Runnable {

    /* JADX INFO: renamed from: a */
    final View f476a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ SlidingPaneLayout f477b;

    RunnableC0192u(SlidingPaneLayout slidingPaneLayout, View view) {
        this.f477b = slidingPaneLayout;
        this.f476a = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f476a.getParent() == this.f477b) {
            C0101at.m504a(this.f476a, 0, null);
            this.f477b.m665g(this.f476a);
        }
        this.f477b.f428t.remove(this);
    }
}
