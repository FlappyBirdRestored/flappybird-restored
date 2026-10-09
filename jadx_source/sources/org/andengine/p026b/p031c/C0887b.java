package org.andengine.p026b.p031c;

import org.andengine.p026b.C0882c;
import org.andengine.p026b.C0894d;
import org.andengine.p026b.p027a.C0874a;
import org.andengine.p026b.p031c.p032a.InterfaceC0886c;

/* JADX INFO: renamed from: org.andengine.b.c.b */
/* JADX INFO: loaded from: classes.dex */
public class C0887b {

    /* JADX INFO: renamed from: a */
    private C0882c f2601a;

    /* JADX INFO: renamed from: b */
    private final boolean f2602b;

    /* JADX INFO: renamed from: c */
    private final EnumC0890e f2603c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0886c f2604d;

    /* JADX INFO: renamed from: e */
    private final C0874a f2605e;

    /* JADX INFO: renamed from: j */
    private C0894d f2610j;

    /* JADX INFO: renamed from: f */
    private final C0892g f2606f = new C0892g();

    /* JADX INFO: renamed from: g */
    private final C0883a f2607g = new C0883a();

    /* JADX INFO: renamed from: h */
    private final C0889d f2608h = new C0889d();

    /* JADX INFO: renamed from: i */
    private EnumC0893h f2609i = EnumC0893h.SCREEN_ON;

    /* JADX INFO: renamed from: k */
    private int f2611k = 0;

    public C0887b(boolean z, EnumC0890e enumC0890e, InterfaceC0886c interfaceC0886c, C0874a c0874a) {
        this.f2602b = z;
        this.f2603c = enumC0890e;
        this.f2604d = interfaceC0886c;
        this.f2605e = c0874a;
    }

    /* JADX INFO: renamed from: a */
    public C0887b m3653a(EnumC0893h enumC0893h) {
        this.f2609i = enumC0893h;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m3654a() {
        return this.f2601a != null;
    }

    /* JADX INFO: renamed from: b */
    public C0882c m3655b() {
        return this.f2601a;
    }

    /* JADX INFO: renamed from: c */
    public C0892g m3656c() {
        return this.f2606f;
    }

    /* JADX INFO: renamed from: d */
    public C0883a m3657d() {
        return this.f2607g;
    }

    /* JADX INFO: renamed from: e */
    public C0889d m3658e() {
        return this.f2608h;
    }

    /* JADX INFO: renamed from: f */
    public boolean m3659f() {
        return this.f2602b;
    }

    /* JADX INFO: renamed from: g */
    public EnumC0890e m3660g() {
        return this.f2603c;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC0886c m3661h() {
        return this.f2604d;
    }

    /* JADX INFO: renamed from: i */
    public C0874a m3662i() {
        return this.f2605e;
    }

    /* JADX INFO: renamed from: j */
    public boolean m3663j() {
        return this.f2610j != null;
    }

    /* JADX INFO: renamed from: k */
    public C0894d m3664k() {
        return this.f2610j;
    }

    /* JADX INFO: renamed from: l */
    public int m3665l() {
        return this.f2611k;
    }

    /* JADX INFO: renamed from: m */
    public EnumC0893h m3666m() {
        return this.f2609i;
    }
}
