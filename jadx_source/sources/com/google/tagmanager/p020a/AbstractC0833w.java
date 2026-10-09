package com.google.tagmanager.p020a;

/* JADX INFO: renamed from: com.google.tagmanager.a.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0833w extends AbstractC0832v implements InterfaceC0835y {

    /* JADX INFO: renamed from: a */
    private C0827q f2460a = C0827q.m3477b();

    /* JADX INFO: renamed from: b */
    private boolean f2461b;

    protected AbstractC0833w() {
    }

    /* JADX INFO: renamed from: a */
    private void m3498a() {
        if (this.f2461b) {
            return;
        }
        this.f2460a = this.f2460a.clone();
        this.f2461b = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public C0827q m3499b() {
        this.f2460a.m3483c();
        this.f2461b = false;
        return this.f2460a;
    }

    /* JADX INFO: renamed from: a */
    protected final void m3500a(AbstractC0834x abstractC0834x) {
        m3498a();
        this.f2460a.m3480a(abstractC0834x.f2462a);
    }

    @Override // com.google.tagmanager.p020a.AbstractC0832v, com.google.tagmanager.p020a.AbstractC0794b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC0833w clone() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* JADX INFO: renamed from: s */
    protected boolean m3501s() {
        return this.f2460a.m3485e();
    }
}
