package org.andengine.opengl.p066c.p072c;

import org.andengine.opengl.p066c.InterfaceC0990a;

/* JADX INFO: renamed from: org.andengine.opengl.c.c.c */
/* JADX INFO: loaded from: classes.dex */
public class C1005c extends AbstractC1003a {

    /* JADX INFO: renamed from: b */
    protected float f2915b;

    /* JADX INFO: renamed from: c */
    protected float f2916c;

    /* JADX INFO: renamed from: d */
    protected float f2917d;

    /* JADX INFO: renamed from: e */
    protected float f2918e;

    /* JADX INFO: renamed from: f */
    protected float f2919f;

    /* JADX INFO: renamed from: g */
    protected float f2920g;

    /* JADX INFO: renamed from: h */
    protected float f2921h;

    /* JADX INFO: renamed from: i */
    protected float f2922i;

    /* JADX INFO: renamed from: j */
    protected final float f2923j;

    /* JADX INFO: renamed from: k */
    protected final boolean f2924k;

    public C1005c(InterfaceC0990a interfaceC0990a, float f, float f2, float f3, float f4, float f5, boolean z) {
        super(interfaceC0990a);
        this.f2915b = f;
        this.f2916c = f2;
        if (z) {
            this.f2924k = true;
            this.f2917d = f4;
            this.f2918e = f3;
        } else {
            this.f2924k = false;
            this.f2917d = f3;
            this.f2918e = f4;
        }
        this.f2923j = f5;
        m3972l();
    }

    public C1005c(InterfaceC0990a interfaceC0990a, float f, float f2, float f3, float f4, boolean z) {
        this(interfaceC0990a, f, f2, f3, f4, 1.0f, z);
    }

    @Override // org.andengine.opengl.p066c.p072c.InterfaceC1004b
    /* JADX INFO: renamed from: a */
    public void mo3961a(float f, float f2, float f3, float f4) {
        this.f2919f = f;
        this.f2921h = f2;
        this.f2920g = f3;
        this.f2922i = f4;
    }

    @Override // org.andengine.opengl.p066c.p072c.InterfaceC1004b
    /* JADX INFO: renamed from: b */
    public float mo3962b() {
        return this.f2924k ? this.f2918e * this.f2923j : this.f2917d * this.f2923j;
    }

    @Override // org.andengine.opengl.p066c.p072c.InterfaceC1004b
    /* JADX INFO: renamed from: c */
    public float mo3963c() {
        return this.f2924k ? this.f2917d * this.f2923j : this.f2918e * this.f2923j;
    }

    @Override // org.andengine.opengl.p066c.p072c.InterfaceC1004b
    /* JADX INFO: renamed from: d */
    public float mo3964d() {
        return this.f2919f;
    }

    @Override // org.andengine.opengl.p066c.p072c.InterfaceC1004b
    /* JADX INFO: renamed from: e */
    public float mo3965e() {
        return this.f2920g;
    }

    @Override // org.andengine.opengl.p066c.p072c.InterfaceC1004b
    /* JADX INFO: renamed from: f */
    public float mo3966f() {
        return this.f2921h;
    }

    @Override // org.andengine.opengl.p066c.p072c.InterfaceC1004b
    /* JADX INFO: renamed from: g */
    public float mo3967g() {
        return this.f2922i;
    }

    @Override // org.andengine.opengl.p066c.p072c.InterfaceC1004b
    /* JADX INFO: renamed from: h */
    public boolean mo3968h() {
        return this.f2924k;
    }

    /* JADX INFO: renamed from: i */
    public C1005c m3969i() {
        return this.f2924k ? new C1005c(this.f2914a, this.f2915b, this.f2916c, this.f2918e, this.f2917d, this.f2923j, this.f2924k) : new C1005c(this.f2914a, this.f2915b, this.f2916c, this.f2917d, this.f2918e, this.f2923j, this.f2924k);
    }

    /* JADX INFO: renamed from: j */
    public float m3970j() {
        return this.f2915b;
    }

    /* JADX INFO: renamed from: k */
    public float m3971k() {
        return this.f2916c;
    }

    /* JADX INFO: renamed from: l */
    public void m3972l() {
        InterfaceC0990a interfaceC0990a = this.f2914a;
        float fMo3920a = interfaceC0990a.mo3920a();
        float fMo3922b = interfaceC0990a.mo3922b();
        float fM3970j = m3970j();
        float fM3971k = m3971k();
        this.f2919f = fM3970j / fMo3920a;
        this.f2920g = (fM3970j + this.f2917d) / fMo3920a;
        this.f2921h = fM3971k / fMo3922b;
        this.f2922i = (this.f2918e + fM3971k) / fMo3922b;
    }
}
