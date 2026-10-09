package com.google.tagmanager.p020a;

/* JADX INFO: renamed from: com.google.tagmanager.a.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0832v extends AbstractC0794b {

    /* JADX INFO: renamed from: a */
    private AbstractC0818h f2459a = AbstractC0818h.f2420a;

    protected AbstractC0832v() {
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0832v m3495a(AbstractC0818h abstractC0818h) {
        this.f2459a = abstractC0818h;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC0832v mo1454a(AbstractC0830t abstractC0830t);

    @Override // com.google.tagmanager.p020a.InterfaceC0782ao
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC0830t mo1443p();

    @Override // com.google.tagmanager.p020a.AbstractC0794b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC0832v clone() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* JADX INFO: renamed from: r */
    public final AbstractC0818h m3496r() {
        return this.f2459a;
    }
}
