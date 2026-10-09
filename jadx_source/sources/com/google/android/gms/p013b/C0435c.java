package com.google.android.gms.p013b;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.b.c */
/* JADX INFO: loaded from: classes.dex */
class C0435c implements InterfaceC0441i {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractC0434b f1599a;

    C0435c(AbstractC0434b abstractC0434b) {
        this.f1599a = abstractC0434b;
    }

    @Override // com.google.android.gms.p013b.InterfaceC0441i
    /* JADX INFO: renamed from: a */
    public void mo1826a(InterfaceC0433a interfaceC0433a) {
        this.f1599a.f1595a = interfaceC0433a;
        Iterator it = this.f1599a.f1597c.iterator();
        while (it.hasNext()) {
            ((InterfaceC0436d) it.next()).m1827a(this.f1599a.f1595a);
        }
        this.f1599a.f1597c.clear();
        this.f1599a.f1596b = null;
    }
}
