package org.andengine.p040d.p041a.p043b;

/* JADX INFO: renamed from: org.andengine.d.a.b.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0920b extends AbstractC0919a {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.andengine.p040d.p041a.p043b.AbstractC0919a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0921c mo3760c() {
        AbstractC0921c abstractC0921c = (AbstractC0921c) super.mo3760c();
        abstractC0921c.f2711b = this;
        return abstractC0921c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.andengine.p040d.p041a.p043b.AbstractC0919a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo3759b(AbstractC0921c abstractC0921c) {
        abstractC0921c.f2712c = false;
        abstractC0921c.m3771c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.andengine.p040d.p041a.p043b.AbstractC0919a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo3757a(AbstractC0921c abstractC0921c) {
        abstractC0921c.mo3768a();
        abstractC0921c.f2712c = true;
    }

    @Override // org.andengine.p040d.p041a.p043b.AbstractC0919a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized void mo3761c(AbstractC0921c abstractC0921c) {
        if (abstractC0921c.f2711b == null) {
            throw new IllegalArgumentException("PoolItem not assigned to a pool!");
        }
        if (!abstractC0921c.m3769a(this)) {
            throw new IllegalArgumentException("PoolItem from another pool!");
        }
        if (abstractC0921c.m3770b()) {
            throw new IllegalArgumentException("PoolItem already recycled!");
        }
        super.mo3761c((Object) abstractC0921c);
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m3767d(AbstractC0921c abstractC0921c) {
        return abstractC0921c.f2711b == this;
    }
}
