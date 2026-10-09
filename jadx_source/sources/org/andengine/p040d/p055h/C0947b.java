package org.andengine.p040d.p055h;

import java.util.Comparator;

/* JADX INFO: renamed from: org.andengine.d.h.b */
/* JADX INFO: loaded from: classes.dex */
class C0947b implements Comparator {
    C0947b() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(InterfaceC0946a interfaceC0946a, InterfaceC0946a interfaceC0946a2) {
        float fM3840c = interfaceC0946a.m3840c();
        float fM3840c2 = interfaceC0946a2.m3840c();
        if (fM3840c < fM3840c2) {
            return 1;
        }
        return fM3840c > fM3840c2 ? -1 : 0;
    }
}
