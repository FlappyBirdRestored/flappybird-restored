package org.andengine.p040d.p041a.p043b;

import org.andengine.p026b.p029b.InterfaceC0880c;
import org.andengine.p040d.p041a.p042a.C0917a;
import org.andengine.p040d.p041a.p044c.InterfaceC0926a;
import org.andengine.p040d.p041a.p044c.p045a.C0927a;

/* JADX INFO: renamed from: org.andengine.d.a.b.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0922d implements InterfaceC0880c {

    /* JADX INFO: renamed from: b */
    private final InterfaceC0926a f2714b = new C0927a(new C0917a());

    /* JADX INFO: renamed from: a */
    private final AbstractC0920b f2713a = new C0923e(this);

    /* JADX INFO: renamed from: a */
    protected abstract void mo3772a(AbstractC0921c abstractC0921c);

    @Override // org.andengine.p026b.p029b.InterfaceC0880c
    /* JADX INFO: renamed from: a_ */
    public void mo3622a_(float f) {
        InterfaceC0926a interfaceC0926a = this.f2714b;
        AbstractC0920b abstractC0920b = this.f2713a;
        while (true) {
            AbstractC0921c abstractC0921c = (AbstractC0921c) interfaceC0926a.mo3753a();
            if (abstractC0921c == null) {
                return;
            }
            mo3772a(abstractC0921c);
            abstractC0920b.mo3761c(abstractC0921c);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3773b(AbstractC0921c abstractC0921c) {
        if (abstractC0921c == null) {
            throw new IllegalArgumentException("PoolItem already recycled!");
        }
        if (!this.f2713a.m3767d(abstractC0921c)) {
            throw new IllegalArgumentException("PoolItem from another pool!");
        }
        this.f2714b.mo3754a(abstractC0921c);
    }

    /* JADX INFO: renamed from: c */
    protected abstract AbstractC0921c mo3774c();

    /* JADX INFO: renamed from: d */
    public AbstractC0921c m3775d() {
        return (AbstractC0921c) this.f2713a.m3762d();
    }
}
