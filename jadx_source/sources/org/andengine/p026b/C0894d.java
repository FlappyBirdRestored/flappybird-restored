package org.andengine.p026b;

import android.os.Process;
import org.andengine.p026b.p029b.p030a.C0878a;
import org.andengine.p040d.p052e.C0941a;

/* JADX INFO: renamed from: org.andengine.b.d */
/* JADX INFO: loaded from: classes.dex */
public class C0894d extends Thread {

    /* JADX INFO: renamed from: a */
    private ViewOnTouchListenerC0873a f2630a;

    /* JADX INFO: renamed from: b */
    private final C0878a f2631b;

    public C0894d() {
        super(C0894d.class.getSimpleName());
        this.f2631b = new C0878a();
    }

    /* JADX INFO: renamed from: a */
    public void m3679a(ViewOnTouchListenerC0873a viewOnTouchListenerC0873a) {
        this.f2630a = viewOnTouchListenerC0873a;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(this.f2630a.m3598d().m3665l());
        while (true) {
            try {
                this.f2631b.mo3622a_(0.0f);
                this.f2630a.m3607m();
            } catch (InterruptedException e) {
                C0941a.m3823a(String.valueOf(getClass().getSimpleName()) + " interrupted. Don't worry - this " + e.getClass().getSimpleName() + " is most likely expected!", e);
                interrupt();
                return;
            }
        }
    }
}
