package com.google.ads.util;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.ads.util.af */
/* JADX INFO: loaded from: classes.dex */
public final class C0358af extends AbstractC0355ac {

    /* JADX INFO: renamed from: d */
    final /* synthetic */ AbstractC0353aa f1363d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0358af(AbstractC0353aa abstractC0353aa, String str, Object obj) {
        super(abstractC0353aa, str, new WeakReference(obj));
        this.f1363d = abstractC0353aa;
    }

    /* JADX INFO: renamed from: a */
    public Object m1381a() {
        return ((WeakReference) this.f1357a).get();
    }

    @Override // com.google.ads.util.AbstractC0355ac
    public String toString() {
        return this.f1363d.toString() + "." + this.f1358b + " = " + m1381a() + " (?)";
    }
}
