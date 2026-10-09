package org.andengine.p033c.p037c;

import org.andengine.input.p057a.C0950a;
import org.andengine.opengl.p063b.C0988g;
import org.andengine.opengl.p066c.C1009f;
import org.andengine.opengl.p066c.InterfaceC0990a;
import org.andengine.opengl.p066c.p072c.InterfaceC1004b;
import org.andengine.opengl.p073d.InterfaceC1017c;
import org.andengine.opengl.util.C1024e;
import org.andengine.p026b.p027a.C0874a;
import org.andengine.p033c.C0896a;

/* JADX INFO: renamed from: org.andengine.c.c.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0910d extends C0896a implements InterfaceC0908b {

    /* JADX INFO: renamed from: c */
    protected int f2692c;

    /* JADX INFO: renamed from: d */
    protected int f2693d;

    /* JADX INFO: renamed from: e */
    protected boolean f2694e;

    /* JADX INFO: renamed from: f */
    protected C0988g f2695f;

    public AbstractC0910d(float f, float f2, C0988g c0988g) {
        super(f, f2);
        this.f2692c = 770;
        this.f2693d = 771;
        this.f2694e = false;
        this.f2695f = c0988g;
    }

    /* JADX INFO: renamed from: a */
    public void m3729a(int i, int i2) {
        this.f2692c = i;
        this.f2693d = i2;
    }

    /* JADX INFO: renamed from: a */
    protected void m3730a(InterfaceC0990a interfaceC0990a) {
        m3732a(interfaceC0990a.mo3930g());
    }

    /* JADX INFO: renamed from: a */
    protected void m3731a(InterfaceC1004b interfaceC1004b) {
        m3730a(interfaceC1004b.mo3960a());
    }

    /* JADX INFO: renamed from: a */
    protected void m3732a(C1009f c1009f) {
        if (c1009f.f2950n) {
            m3729a(1, 771);
        }
    }

    @Override // org.andengine.p033c.p035b.InterfaceC0904d
    /* JADX INFO: renamed from: a */
    public boolean mo3719a(C0950a c0950a, float f, float f2) {
        return false;
    }

    @Override // org.andengine.p033c.C0896a
    /* JADX INFO: renamed from: b */
    protected void mo3693b(C1024e c1024e, C0874a c0874a) {
        if (this.f2694e) {
            c1024e.m4034a();
            c1024e.m4031a(this.f2692c, this.f2693d);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3733b(boolean z) {
        this.f2694e = z;
    }

    @Override // org.andengine.p033c.C0896a
    /* JADX INFO: renamed from: d */
    protected void mo3700d(C1024e c1024e, C0874a c0874a) {
        if (this.f2694e) {
            c1024e.m4039b();
        }
    }

    @Override // org.andengine.p033c.C0896a, org.andengine.p040d.InterfaceC0929b
    /* JADX INFO: renamed from: n */
    public void mo3713n() {
        super.mo3713n();
        InterfaceC1017c interfaceC1017cA = m3680a();
        if (interfaceC1017cA == null || !interfaceC1017cA.mo3993b() || interfaceC1017cA.mo3698c()) {
            return;
        }
        interfaceC1017cA.mo3713n();
    }
}
