package org.andengine.opengl.p066c.p067a.p070b;

/* JADX INFO: renamed from: org.andengine.opengl.c.a.b.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0997a implements InterfaceC0998b {

    /* JADX INFO: renamed from: a */
    protected int f2887a;

    /* JADX INFO: renamed from: b */
    protected int f2888b;

    /* JADX INFO: renamed from: c */
    protected int f2889c;

    /* JADX INFO: renamed from: d */
    protected int f2890d;

    public AbstractC0997a(int i, int i2, int i3, int i4) {
        this.f2887a = i;
        this.f2888b = i2;
        this.f2889c = i3;
        this.f2890d = i4;
    }

    @Override // org.andengine.opengl.p066c.p067a.p070b.InterfaceC0998b
    /* JADX INFO: renamed from: a */
    public int mo3943a() {
        return this.f2887a;
    }

    @Override // org.andengine.opengl.p066c.p067a.p070b.InterfaceC0998b
    /* JADX INFO: renamed from: a */
    public void mo3944a(int i) {
        this.f2887a = i;
    }

    @Override // org.andengine.opengl.p066c.p067a.p070b.InterfaceC0998b
    /* JADX INFO: renamed from: b */
    public int mo3945b() {
        return this.f2888b;
    }

    @Override // org.andengine.opengl.p066c.p067a.p070b.InterfaceC0998b
    /* JADX INFO: renamed from: b */
    public void mo3946b(int i) {
        this.f2888b = i;
    }

    @Override // org.andengine.opengl.p066c.p067a.p070b.InterfaceC0998b
    /* JADX INFO: renamed from: c */
    public int mo3947c() {
        return this.f2889c;
    }

    @Override // org.andengine.opengl.p066c.p067a.p070b.InterfaceC0998b
    /* JADX INFO: renamed from: d */
    public int mo3948d() {
        return this.f2890d;
    }

    public String toString() {
        return String.valueOf(getClass().getSimpleName()) + "( " + mo3947c() + "x" + mo3948d() + " @ " + this.f2887a + "/" + this.f2888b + " )";
    }
}
