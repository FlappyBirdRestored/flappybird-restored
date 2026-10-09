package com.google.ads.util;

/* JADX INFO: renamed from: com.google.ads.util.ae */
/* JADX INFO: loaded from: classes.dex */
public final class C0357ae extends AbstractC0355ac {

    /* JADX INFO: renamed from: d */
    final /* synthetic */ AbstractC0353aa f1361d;

    /* JADX INFO: renamed from: e */
    private boolean f1362e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0357ae(AbstractC0353aa abstractC0353aa, String str) {
        super(abstractC0353aa, str);
        this.f1361d = abstractC0353aa;
        this.f1362e = false;
        this.f1362e = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0357ae(AbstractC0353aa abstractC0353aa, String str, Object obj) {
        super(abstractC0353aa, str, obj);
        this.f1361d = abstractC0353aa;
        this.f1362e = false;
        this.f1362e = false;
    }

    /* JADX INFO: renamed from: a */
    public synchronized Object m1379a() {
        return this.f1357a;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1380a(Object obj) {
        C0364g.m1399d("State changed - " + this.f1361d.toString() + "." + this.f1358b + ": '" + obj + "' <-- '" + this.f1357a + "'.");
        this.f1357a = obj;
        this.f1362e = true;
    }

    @Override // com.google.ads.util.AbstractC0355ac
    public String toString() {
        return super.toString() + (this.f1362e ? " (*)" : "");
    }
}
