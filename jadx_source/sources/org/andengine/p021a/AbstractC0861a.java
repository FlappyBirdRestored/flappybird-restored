package org.andengine.p021a;

/* JADX INFO: renamed from: org.andengine.a.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0861a implements InterfaceC0866c {

    /* JADX INFO: renamed from: a */
    protected float f2527a = 1.0f;

    /* JADX INFO: renamed from: b */
    protected float f2528b = 1.0f;

    /* JADX INFO: renamed from: c */
    private final InterfaceC0872d f2529c;

    /* JADX INFO: renamed from: d */
    private boolean f2530d;

    public AbstractC0861a(InterfaceC0872d interfaceC0872d) {
        this.f2529c = interfaceC0872d;
    }

    /* JADX INFO: renamed from: a */
    protected InterfaceC0872d mo3555a() {
        m3561g();
        return this.f2529c;
    }

    /* JADX INFO: renamed from: b */
    protected float m3556b() {
        m3561g();
        return this.f2529c.mo3562a();
    }

    /* JADX INFO: renamed from: c */
    protected abstract void mo3557c();

    /* JADX INFO: renamed from: d */
    public void mo3558d() {
        m3561g();
    }

    @Override // org.andengine.p021a.InterfaceC0866c
    /* JADX INFO: renamed from: e */
    public void mo3559e() {
        m3561g();
    }

    @Override // org.andengine.p021a.InterfaceC0866c
    /* JADX INFO: renamed from: f */
    public void mo3560f() {
        m3561g();
        this.f2530d = true;
    }

    /* JADX INFO: renamed from: g */
    protected void m3561g() {
        if (this.f2530d) {
            mo3557c();
        }
    }
}
