package org.andengine.p026b.p029b;

import org.andengine.opengl.util.C1024e;
import org.andengine.p026b.p027a.C0874a;
import org.andengine.p040d.p041a.p042a.C0918b;

/* JADX INFO: renamed from: org.andengine.b.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C0877a extends C0918b implements InterfaceC0879b {
    public C0877a() {
    }

    public C0877a(int i) {
        super(i);
    }

    @Override // org.andengine.p026b.p029b.InterfaceC0879b
    /* JADX INFO: renamed from: a */
    public void mo3641a(C1024e c1024e, C0874a c0874a) {
        for (int size = size() - 1; size >= 0; size--) {
            ((InterfaceC0879b) get(size)).mo3641a(c1024e, c0874a);
        }
    }
}
