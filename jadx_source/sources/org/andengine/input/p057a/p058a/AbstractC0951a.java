package org.andengine.input.p057a.p058a;

import android.view.MotionEvent;
import org.andengine.input.p057a.C0950a;
import org.andengine.p040d.p041a.p043b.AbstractC0925g;

/* JADX INFO: renamed from: org.andengine.input.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0951a implements InterfaceC0954d {

    /* JADX INFO: renamed from: a */
    private InterfaceC0955e f2794a;

    /* JADX INFO: renamed from: b */
    private final AbstractC0925g f2795b = new C0952b(this);

    /* JADX INFO: renamed from: a */
    protected void m3861a(float f, float f2, int i, int i2, MotionEvent motionEvent) {
        C0950a c0950aM3845a = C0950a.m3845a(f, f2, i, i2, MotionEvent.obtain(motionEvent));
        C0953c c0953c = (C0953c) this.f2795b.m3775d();
        c0953c.m3864a(c0950aM3845a);
        this.f2795b.m3773b(c0953c);
    }

    @Override // org.andengine.input.p057a.p058a.InterfaceC0954d
    /* JADX INFO: renamed from: a */
    public void mo3862a(InterfaceC0955e interfaceC0955e) {
        this.f2794a = interfaceC0955e;
    }

    @Override // org.andengine.p026b.p029b.InterfaceC0880c
    /* JADX INFO: renamed from: a_ */
    public void mo3622a_(float f) {
        this.f2795b.mo3622a_(f);
    }
}
