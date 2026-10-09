package org.andengine.p033c.p037c;

import org.andengine.opengl.p063b.C0988g;
import org.andengine.p026b.p027a.C0874a;
import org.andengine.p040d.p047b.p048a.C0932c;

/* JADX INFO: renamed from: org.andengine.c.c.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0909c extends AbstractC0910d implements InterfaceC0907a {

    /* JADX INFO: renamed from: a */
    protected float f2690a;

    /* JADX INFO: renamed from: b */
    protected float f2691b;

    public AbstractC0909c(float f, float f2, float f3, float f4, C0988g c0988g) {
        super(f, f2, c0988g);
        this.f2690a = f3;
        this.f2691b = f4;
        m3726q();
        m3727r();
        m3728s();
    }

    @Override // org.andengine.p033c.p035b.InterfaceC0904d
    /* JADX INFO: renamed from: a */
    public boolean mo3718a(float f, float f2) {
        return C0932c.m3796a(this, f, f2);
    }

    @Override // org.andengine.p033c.C0896a
    /* JADX INFO: renamed from: a */
    public boolean mo3686a(C0874a c0874a) {
        return !C0932c.m3795a(c0874a, this);
    }

    @Override // org.andengine.p033c.C0896a, org.andengine.p033c.InterfaceC0906c
    /* JADX INFO: renamed from: h */
    public float[] mo3707h() {
        return m3688a_(this.f2690a * 0.5f, this.f2691b * 0.5f);
    }

    /* JADX INFO: renamed from: o */
    public float m3724o() {
        return this.f2690a;
    }

    /* JADX INFO: renamed from: p */
    public float m3725p() {
        return this.f2691b;
    }

    /* JADX INFO: renamed from: q */
    public void m3726q() {
        this.f2667y = this.f2690a * 0.5f;
        this.f2668z = this.f2691b * 0.5f;
    }

    /* JADX INFO: renamed from: r */
    public void m3727r() {
        this.f2638C = this.f2690a * 0.5f;
        this.f2639D = this.f2691b * 0.5f;
    }

    /* JADX INFO: renamed from: s */
    public void m3728s() {
        this.f2642G = this.f2690a * 0.5f;
        this.f2643H = this.f2691b * 0.5f;
    }
}
