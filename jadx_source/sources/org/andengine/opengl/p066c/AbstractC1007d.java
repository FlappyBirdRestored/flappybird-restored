package org.andengine.opengl.p066c;

import org.andengine.opengl.util.C1024e;

/* JADX INFO: renamed from: org.andengine.opengl.c.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1007d implements InterfaceC0990a {

    /* JADX INFO: renamed from: a */
    protected final C1008e f2925a;

    /* JADX INFO: renamed from: b */
    protected final EnumC1002c f2926b;

    /* JADX INFO: renamed from: c */
    protected final C1009f f2927c;

    /* JADX INFO: renamed from: d */
    protected int f2928d = -1;

    /* JADX INFO: renamed from: e */
    protected boolean f2929e = false;

    /* JADX INFO: renamed from: f */
    protected InterfaceC1000b f2930f;

    public AbstractC1007d(C1008e c1008e, EnumC1002c enumC1002c, C1009f c1009f, InterfaceC1000b interfaceC1000b) {
        this.f2925a = c1008e;
        this.f2926b = enumC1002c;
        this.f2927c = c1009f;
        this.f2930f = interfaceC1000b;
    }

    @Override // org.andengine.opengl.p066c.InterfaceC0990a
    /* JADX INFO: renamed from: a */
    public void mo3921a(C1024e c1024e) {
        this.f2928d = c1024e.m4050i();
        c1024e.m4042d(this.f2928d);
        mo3932e(c1024e);
        this.f2927c.m3981a();
        this.f2929e = false;
        if (this.f2930f != null) {
            this.f2930f.m3953a(this);
        }
    }

    @Override // org.andengine.opengl.p066c.InterfaceC0990a
    /* JADX INFO: renamed from: b */
    public void mo3923b(C1024e c1024e) {
        c1024e.m4044e(this.f2928d);
        this.f2928d = -1;
        if (this.f2930f != null) {
            this.f2930f.m3954b(this);
        }
    }

    @Override // org.andengine.opengl.p066c.InterfaceC0990a
    /* JADX INFO: renamed from: c */
    public void mo3924c(C1024e c1024e) {
        mo3923b(c1024e);
        mo3921a(c1024e);
    }

    @Override // org.andengine.opengl.p066c.InterfaceC0990a
    /* JADX INFO: renamed from: c */
    public boolean mo3925c() {
        return this.f2928d != -1;
    }

    @Override // org.andengine.opengl.p066c.InterfaceC0990a
    /* JADX INFO: renamed from: d */
    public void mo3926d() {
        this.f2928d = -1;
    }

    @Override // org.andengine.opengl.p066c.InterfaceC0990a
    /* JADX INFO: renamed from: d */
    public void mo3927d(C1024e c1024e) {
        c1024e.m4042d(this.f2928d);
    }

    /* JADX INFO: renamed from: e */
    protected abstract void mo3932e(C1024e c1024e);

    @Override // org.andengine.opengl.p066c.InterfaceC0990a
    /* JADX INFO: renamed from: e */
    public boolean mo3928e() {
        return this.f2929e;
    }

    @Override // org.andengine.opengl.p066c.InterfaceC0990a
    /* JADX INFO: renamed from: f */
    public EnumC1002c mo3929f() {
        return this.f2926b;
    }

    @Override // org.andengine.opengl.p066c.InterfaceC0990a
    /* JADX INFO: renamed from: g */
    public C1009f mo3930g() {
        return this.f2927c;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC1000b mo3950h() {
        return this.f2930f;
    }

    /* JADX INFO: renamed from: i */
    public void m3975i() {
        this.f2925a.m3978a(this);
    }
}
