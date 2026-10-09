package org.andengine.p033c.p038d;

import org.andengine.opengl.p063b.C0981b;
import org.andengine.opengl.p063b.C0988g;
import org.andengine.opengl.p066c.p072c.InterfaceC1004b;
import org.andengine.opengl.p073d.C1019e;
import org.andengine.opengl.p073d.EnumC1011a;
import org.andengine.opengl.p073d.p074a.C1014c;
import org.andengine.opengl.p073d.p074a.C1015d;
import org.andengine.opengl.util.C1024e;
import org.andengine.p026b.p027a.C0874a;
import org.andengine.p033c.p037c.AbstractC0909c;
import org.andengine.p033c.p038d.p039a.C0913a;
import org.andengine.p033c.p038d.p039a.InterfaceC0914b;

/* JADX INFO: renamed from: org.andengine.c.d.a */
/* JADX INFO: loaded from: classes.dex */
public class C0912a extends AbstractC0909c {

    /* JADX INFO: renamed from: g */
    public static final C1014c f2698g = new C1015d(3).m3988a(0, "a_position", 2, 5126, false).m3988a(1, "a_color", 4, 5121, true).m3988a(3, "a_textureCoordinates", 2, 5126, false).m3987a();

    /* JADX INFO: renamed from: I */
    protected boolean f2699I;

    /* JADX INFO: renamed from: h */
    public InterfaceC1004b f2700h;

    /* JADX INFO: renamed from: i */
    protected final InterfaceC0914b f2701i;

    /* JADX INFO: renamed from: j */
    protected boolean f2702j;

    public C0912a(float f, float f2, float f3, float f4, InterfaceC1004b interfaceC1004b, InterfaceC0914b interfaceC0914b, C0988g c0988g) {
        super(f, f2, f3, f4, c0988g);
        this.f2700h = interfaceC1004b;
        this.f2701i = interfaceC0914b;
        m3733b(true);
        m3731a(interfaceC1004b);
        m3743x();
        mo3689b();
        m3744y();
    }

    public C0912a(float f, float f2, float f3, float f4, InterfaceC1004b interfaceC1004b, C1019e c1019e, EnumC1011a enumC1011a) {
        this(f, f2, f3, f4, interfaceC1004b, c1019e, enumC1011a, C0981b.m3903a());
    }

    public C0912a(float f, float f2, float f3, float f4, InterfaceC1004b interfaceC1004b, C1019e c1019e, EnumC1011a enumC1011a, C0988g c0988g) {
        this(f, f2, f3, f4, interfaceC1004b, new C0913a(c1019e, 20, enumC1011a, true, f2698g), c0988g);
    }

    public C0912a(float f, float f2, InterfaceC1004b interfaceC1004b, C1019e c1019e) {
        this(f, f2, interfaceC1004b.mo3962b(), interfaceC1004b.mo3963c(), interfaceC1004b, c1019e, EnumC1011a.STATIC);
    }

    /* JADX INFO: renamed from: a */
    protected void m3736a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f2701i.mo3746a(this, f, f2, f3, f4, f5, f6, f7, f8);
    }

    /* JADX INFO: renamed from: a */
    public void m3737a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f2664v = f;
        this.f2665w = f2;
        this.f2690a = f3 - f;
        this.f2691b = f4 - f2;
        m3736a(f9, f10, f11, f12, f13, f14, f15, f16);
        this.f2700h.mo3961a(f5, f6, f7, f8);
        m3744y();
    }

    @Override // org.andengine.p033c.C0896a
    /* JADX INFO: renamed from: b */
    protected void mo3689b() {
        this.f2701i.mo3745a(this);
    }

    /* JADX INFO: renamed from: b */
    public void m3738b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f2664v = f;
        this.f2665w = f2;
        this.f2690a = f3 - f;
        this.f2691b = f4 - f2;
        m3743x();
        this.f2700h.mo3961a(f5, f6, f7, f8);
        m3744y();
    }

    @Override // org.andengine.p033c.p037c.AbstractC0910d, org.andengine.p033c.C0896a
    /* JADX INFO: renamed from: b */
    protected void mo3693b(C1024e c1024e, C0874a c0874a) {
        super.mo3693b(c1024e, c0874a);
        m3739t().mo3960a().mo3927d(c1024e);
        this.f2701i.mo3991a(c1024e, this.f2695f);
    }

    @Override // org.andengine.p033c.C0896a
    /* JADX INFO: renamed from: c */
    protected void mo3697c(C1024e c1024e, C0874a c0874a) {
        this.f2701i.mo3989a(5, 4);
    }

    @Override // org.andengine.p033c.p037c.AbstractC0910d, org.andengine.p033c.C0896a
    /* JADX INFO: renamed from: d */
    protected void mo3700d(C1024e c1024e, C0874a c0874a) {
        this.f2701i.mo3992b(c1024e, this.f2695f);
        super.mo3700d(c1024e, c0874a);
    }

    /* JADX INFO: renamed from: t */
    public InterfaceC1004b m3739t() {
        return this.f2700h;
    }

    /* JADX INFO: renamed from: u */
    public boolean m3740u() {
        return this.f2699I;
    }

    /* JADX INFO: renamed from: v */
    public boolean m3741v() {
        return this.f2702j;
    }

    @Override // org.andengine.p033c.p037c.InterfaceC0908b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public InterfaceC0914b mo3723a() {
        return this.f2701i;
    }

    /* JADX INFO: renamed from: x */
    protected void m3743x() {
        this.f2701i.mo3747b(this);
    }

    /* JADX INFO: renamed from: y */
    protected void m3744y() {
        this.f2701i.mo3748c(this);
    }
}
