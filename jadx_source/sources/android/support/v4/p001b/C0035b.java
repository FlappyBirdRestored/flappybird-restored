package android.support.v4.p001b;

import java.util.Map;

/* JADX INFO: renamed from: android.support.v4.b.b */
/* JADX INFO: loaded from: classes.dex */
class C0035b extends AbstractC0039f {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0034a f185a;

    C0035b(C0034a c0034a) {
        this.f185a = c0034a;
    }

    @Override // android.support.v4.p001b.AbstractC0039f
    /* JADX INFO: renamed from: a */
    protected int mo187a() {
        return this.f185a.f212h;
    }

    @Override // android.support.v4.p001b.AbstractC0039f
    /* JADX INFO: renamed from: a */
    protected int mo188a(Object obj) {
        return obj == null ? this.f185a.m215a() : this.f185a.m217a(obj, obj.hashCode());
    }

    @Override // android.support.v4.p001b.AbstractC0039f
    /* JADX INFO: renamed from: a */
    protected Object mo189a(int i, int i2) {
        return this.f185a.f211g[(i << 1) + i2];
    }

    @Override // android.support.v4.p001b.AbstractC0039f
    /* JADX INFO: renamed from: a */
    protected Object mo190a(int i, Object obj) {
        return this.f185a.m218a(i, obj);
    }

    @Override // android.support.v4.p001b.AbstractC0039f
    /* JADX INFO: renamed from: a */
    protected void mo191a(int i) {
        this.f185a.m222d(i);
    }

    @Override // android.support.v4.p001b.AbstractC0039f
    /* JADX INFO: renamed from: a */
    protected void mo192a(Object obj, Object obj2) {
        this.f185a.put(obj, obj2);
    }

    @Override // android.support.v4.p001b.AbstractC0039f
    /* JADX INFO: renamed from: b */
    protected int mo193b(Object obj) {
        return this.f185a.m216a(obj);
    }

    @Override // android.support.v4.p001b.AbstractC0039f
    /* JADX INFO: renamed from: b */
    protected Map mo194b() {
        return this.f185a;
    }

    @Override // android.support.v4.p001b.AbstractC0039f
    /* JADX INFO: renamed from: c */
    protected void mo195c() {
        this.f185a.clear();
    }
}
