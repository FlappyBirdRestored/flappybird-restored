package org.andengine.p021a.p024c;

import android.media.SoundPool;
import org.andengine.p021a.AbstractC0861a;
import org.andengine.p021a.p024c.p025a.C0869b;

/* JADX INFO: renamed from: org.andengine.a.c.a */
/* JADX INFO: loaded from: classes.dex */
public class C0867a extends AbstractC0861a {

    /* JADX INFO: renamed from: c */
    private int f2534c;

    /* JADX INFO: renamed from: d */
    private int f2535d;

    /* JADX INFO: renamed from: e */
    private boolean f2536e;

    /* JADX INFO: renamed from: f */
    private int f2537f;

    /* JADX INFO: renamed from: g */
    private float f2538g;

    C0867a(C0871c c0871c, int i) {
        super(c0871c);
        this.f2538g = 1.0f;
        this.f2534c = i;
    }

    /* JADX INFO: renamed from: j */
    private SoundPool m3568j() {
        return mo3555a().m3577c();
    }

    /* JADX INFO: renamed from: a */
    public void m3569a(boolean z) {
        this.f2536e = z;
    }

    @Override // org.andengine.p021a.AbstractC0861a
    /* JADX INFO: renamed from: c */
    protected void mo3557c() {
        throw new C0869b();
    }

    @Override // org.andengine.p021a.AbstractC0861a
    /* JADX INFO: renamed from: d */
    public void mo3558d() {
        super.mo3558d();
        float fB = m3556b();
        this.f2535d = m3568j().play(this.f2534c, this.f2527a * fB, this.f2528b * fB, 1, this.f2537f, this.f2538g);
    }

    @Override // org.andengine.p021a.AbstractC0861a, org.andengine.p021a.InterfaceC0866c
    /* JADX INFO: renamed from: e */
    public void mo3559e() {
        super.mo3559e();
        if (this.f2535d != 0) {
            m3568j().stop(this.f2535d);
        }
    }

    @Override // org.andengine.p021a.AbstractC0861a, org.andengine.p021a.InterfaceC0866c
    /* JADX INFO: renamed from: f */
    public void mo3560f() {
        m3561g();
        m3568j().unload(this.f2534c);
        this.f2534c = 0;
        this.f2536e = false;
        mo3555a().mo3565b(this);
        super.mo3560f();
    }

    /* JADX INFO: renamed from: h */
    public int m3570h() {
        return this.f2534c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.andengine.p021a.AbstractC0861a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0871c mo3555a() {
        return (C0871c) super.mo3555a();
    }
}
