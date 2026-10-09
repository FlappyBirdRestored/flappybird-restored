package org.andengine.p033c.p035b;

import org.andengine.input.p057a.C0950a;
import org.andengine.opengl.util.C1024e;
import org.andengine.p026b.p027a.C0874a;

/* JADX INFO: renamed from: org.andengine.c.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C0899a extends C0905e {

    /* JADX INFO: renamed from: a */
    protected C0874a f2669a;

    public C0899a() {
        this(null);
    }

    public C0899a(C0874a c0874a) {
        this.f2669a = c0874a;
    }

    @Override // org.andengine.p033c.p035b.C0905e
    /* JADX INFO: renamed from: a */
    public boolean mo3714a(C0950a c0950a) {
        if (this.f2669a == null) {
            return false;
        }
        this.f2669a.m3619a(c0950a);
        if (super.mo3714a(c0950a)) {
            return true;
        }
        this.f2669a.m3625b(c0950a);
        return false;
    }

    @Override // org.andengine.p033c.p035b.C0905e
    /* JADX INFO: renamed from: b */
    protected boolean mo3715b(C0950a c0950a) {
        if (!(this.f2673I instanceof C0899a)) {
            return super.mo3715b(c0950a);
        }
        this.f2669a.m3625b(c0950a);
        boolean zMo3715b = super.mo3715b(c0950a);
        this.f2669a.m3619a(c0950a);
        return zMo3715b;
    }

    @Override // org.andengine.p033c.p035b.C0905e
    /* JADX INFO: renamed from: f */
    protected void mo3716f(C1024e c1024e, C0874a c0874a) {
        this.f2669a.m3632d(c1024e);
    }
}
