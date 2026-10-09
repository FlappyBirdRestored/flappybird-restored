package com.google.ads.util;

/* JADX INFO: renamed from: com.google.ads.util.ac */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0355ac {

    /* JADX INFO: renamed from: a */
    protected Object f1357a;

    /* JADX INFO: renamed from: b */
    protected final String f1358b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ AbstractC0353aa f1359c;

    private AbstractC0355ac(AbstractC0353aa abstractC0353aa, String str) {
        this(abstractC0353aa, str, (Object) null);
    }

    private AbstractC0355ac(AbstractC0353aa abstractC0353aa, String str, Object obj) {
        this.f1359c = abstractC0353aa;
        this.f1358b = str;
        abstractC0353aa.m1377a(this);
        this.f1357a = obj;
    }

    public String toString() {
        return this.f1359c.toString() + "." + this.f1358b + " = " + this.f1357a;
    }
}
