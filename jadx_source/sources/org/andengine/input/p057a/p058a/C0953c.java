package org.andengine.input.p057a.p058a;

import org.andengine.input.p057a.C0950a;
import org.andengine.p040d.p041a.p043b.AbstractRunnableC0924f;

/* JADX INFO: renamed from: org.andengine.input.a.a.c */
/* JADX INFO: loaded from: classes.dex */
class C0953c extends AbstractRunnableC0924f {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractC0951a f2797a;

    /* JADX INFO: renamed from: d */
    private C0950a f2798d;

    C0953c(AbstractC0951a abstractC0951a) {
        this.f2797a = abstractC0951a;
    }

    @Override // org.andengine.p040d.p041a.p043b.AbstractC0921c
    /* JADX INFO: renamed from: a */
    protected void mo3768a() {
        super.mo3768a();
        C0950a c0950a = this.f2798d;
        c0950a.m3859k().recycle();
        c0950a.m3847a();
    }

    /* JADX INFO: renamed from: a */
    public void m3864a(C0950a c0950a) {
        this.f2798d = c0950a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2797a.f2794a.mo3590a(this.f2798d);
    }
}
