package org.andengine.p026b.p029b;

import org.andengine.p040d.p041a.p042a.C0918b;

/* JADX INFO: renamed from: org.andengine.b.b.d */
/* JADX INFO: loaded from: classes.dex */
public class C0881d extends C0918b implements InterfaceC0880c {
    public C0881d() {
    }

    public C0881d(int i) {
        super(i);
    }

    @Override // org.andengine.p026b.p029b.InterfaceC0880c
    /* JADX INFO: renamed from: a_ */
    public void mo3622a_(float f) {
        for (int size = size() - 1; size >= 0; size--) {
            ((InterfaceC0880c) get(size)).mo3622a_(f);
        }
    }
}
