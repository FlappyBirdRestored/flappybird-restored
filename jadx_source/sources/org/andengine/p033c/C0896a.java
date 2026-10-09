package org.andengine.p033c;

import org.andengine.opengl.util.C1024e;
import org.andengine.p026b.p027a.C0874a;
import org.andengine.p026b.p029b.C0881d;
import org.andengine.p033c.p034a.C0897a;
import org.andengine.p040d.C0936c;
import org.andengine.p040d.p041a.p042a.C0918b;
import org.andengine.p040d.p041a.p046d.C0928a;
import org.andengine.p040d.p050c.InterfaceC0937a;
import org.andengine.p040d.p051d.C0939a;

/* JADX INFO: renamed from: org.andengine.c.a */
/* JADX INFO: loaded from: classes.dex */
public class C0896a implements InterfaceC0906c {

    /* JADX INFO: renamed from: a */
    private static final float[] f2633a = new float[2];

    /* JADX INFO: renamed from: b */
    private static final float[] f2634b = new float[2];

    /* JADX INFO: renamed from: c */
    private static final InterfaceC0937a f2635c = new C0898b();

    /* JADX INFO: renamed from: A */
    protected float f2636A;

    /* JADX INFO: renamed from: B */
    protected float f2637B;

    /* JADX INFO: renamed from: C */
    protected float f2638C;

    /* JADX INFO: renamed from: D */
    protected float f2639D;

    /* JADX INFO: renamed from: E */
    protected float f2640E;

    /* JADX INFO: renamed from: F */
    protected float f2641F;

    /* JADX INFO: renamed from: G */
    protected float f2642G;

    /* JADX INFO: renamed from: H */
    protected float f2643H;

    /* JADX INFO: renamed from: I */
    private C0928a f2644I;

    /* JADX INFO: renamed from: J */
    private C0928a f2645J;

    /* JADX INFO: renamed from: d */
    private InterfaceC0906c f2646d;

    /* JADX INFO: renamed from: e */
    private C0897a f2647e;

    /* JADX INFO: renamed from: f */
    private C0881d f2648f;

    /* JADX INFO: renamed from: g */
    private boolean f2649g;

    /* JADX INFO: renamed from: h */
    private boolean f2650h;

    /* JADX INFO: renamed from: i */
    private C0928a f2651i;

    /* JADX INFO: renamed from: j */
    private C0928a f2652j;

    /* JADX INFO: renamed from: k */
    protected boolean f2653k;

    /* JADX INFO: renamed from: l */
    protected boolean f2654l;

    /* JADX INFO: renamed from: m */
    protected boolean f2655m;

    /* JADX INFO: renamed from: n */
    protected boolean f2656n;

    /* JADX INFO: renamed from: o */
    protected boolean f2657o;

    /* JADX INFO: renamed from: p */
    protected boolean f2658p;

    /* JADX INFO: renamed from: q */
    protected boolean f2659q;

    /* JADX INFO: renamed from: r */
    protected int f2660r;

    /* JADX INFO: renamed from: s */
    protected int f2661s;

    /* JADX INFO: renamed from: t */
    protected C0918b f2662t;

    /* JADX INFO: renamed from: u */
    protected C0939a f2663u;

    /* JADX INFO: renamed from: v */
    protected float f2664v;

    /* JADX INFO: renamed from: w */
    protected float f2665w;

    /* JADX INFO: renamed from: x */
    protected float f2666x;

    /* JADX INFO: renamed from: y */
    protected float f2667y;

    /* JADX INFO: renamed from: z */
    protected float f2668z;

    public C0896a() {
        this(0.0f, 0.0f);
    }

    public C0896a(float f, float f2) {
        this.f2654l = true;
        this.f2657o = true;
        this.f2660r = Integer.MIN_VALUE;
        this.f2661s = 0;
        this.f2663u = new C0939a(1.0f, 1.0f, 1.0f, 1.0f);
        this.f2666x = 0.0f;
        this.f2667y = 0.0f;
        this.f2668z = 0.0f;
        this.f2636A = 1.0f;
        this.f2637B = 1.0f;
        this.f2638C = 0.0f;
        this.f2639D = 0.0f;
        this.f2640E = 0.0f;
        this.f2641F = 0.0f;
        this.f2642G = 0.0f;
        this.f2643H = 0.0f;
        this.f2649g = true;
        this.f2650h = true;
        this.f2664v = f;
        this.f2665w = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    protected void m3680a() {
        this.f2662t = new C0918b(4);
    }

    /* JADX INFO: renamed from: c */
    private void m3681c(InterfaceC0906c interfaceC0906c) {
        if (interfaceC0906c.mo3701d()) {
            throw new IllegalStateException("pEntity '" + interfaceC0906c.getClass().getSimpleName() + "' already has a parent: '" + interfaceC0906c.mo3702e().getClass().getSimpleName() + "'. New parent: '" + getClass().getSimpleName() + "'!");
        }
    }

    /* JADX INFO: renamed from: a */
    protected void mo821a(float f) {
        if (this.f2647e != null) {
            this.f2647e.mo3622a_(f);
        }
        if (this.f2648f != null) {
            this.f2648f.mo3622a_(f);
        }
        if (this.f2662t == null || this.f2658p) {
            return;
        }
        C0918b c0918b = this.f2662t;
        int size = c0918b.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC0906c) c0918b.get(i)).mo3622a_(f);
        }
    }

    @Override // org.andengine.p033c.InterfaceC0906c
    /* JADX INFO: renamed from: a */
    public void mo3682a(StringBuilder sb) {
        sb.append(getClass().getSimpleName());
        if (this.f2662t == null || this.f2662t.size() <= 0) {
            return;
        }
        sb.append(" [");
        C0918b c0918b = this.f2662t;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= c0918b.size()) {
                sb.append("]");
                return;
            }
            ((InterfaceC0906c) c0918b.get(i2)).mo3682a(sb);
            if (i2 < c0918b.size() - 1) {
                sb.append(", ");
            }
            i = i2 + 1;
        }
    }

    @Override // org.andengine.p033c.InterfaceC0906c
    /* JADX INFO: renamed from: a */
    public void mo3683a(InterfaceC0906c interfaceC0906c) {
        this.f2646d = interfaceC0906c;
    }

    /* JADX INFO: renamed from: a */
    protected void m3684a(C1024e c1024e) {
        m3692b(c1024e);
        m3696c(c1024e);
        m3699d(c1024e);
        m3703e(c1024e);
    }

    @Override // org.andengine.p026b.p029b.InterfaceC0879b
    /* JADX INFO: renamed from: a */
    public final void mo3641a(C1024e c1024e, C0874a c0874a) {
        if (this.f2654l) {
            if (this.f2655m && mo3686a(c0874a)) {
                return;
            }
            mo3704e(c1024e, c0874a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3685a(boolean z) {
        this.f2654l = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo3686a(C0874a c0874a) {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public float[] m3687a(float f, float f2, float[] fArr) {
        C0928a c0928aMo3710k = mo3710k();
        fArr[0] = f;
        fArr[1] = f2;
        c0928aMo3710k.m3785a(fArr);
        return fArr;
    }

    @Override // org.andengine.p026b.p029b.InterfaceC0880c
    /* JADX INFO: renamed from: a_ */
    public final void mo3622a_(float f) {
        if (this.f2656n) {
            return;
        }
        mo821a(f);
    }

    /* JADX INFO: renamed from: a_ */
    public float[] m3688a_(float f, float f2) {
        return m3687a(f, f2, f2634b);
    }

    /* JADX INFO: renamed from: b */
    protected void mo3689b() {
    }

    /* JADX INFO: renamed from: b */
    public void m3690b(float f) {
        if (this.f2663u.m3810a(f)) {
            mo3689b();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3691b(InterfaceC0906c interfaceC0906c) {
        m3681c(interfaceC0906c);
        if (this.f2662t == null) {
            m3680a();
        }
        this.f2662t.add(interfaceC0906c);
        interfaceC0906c.mo3683a(this);
        interfaceC0906c.mo3712m();
    }

    /* JADX INFO: renamed from: b */
    protected void m3692b(C1024e c1024e) {
        c1024e.m4026a(this.f2664v, this.f2665w, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    protected void mo3693b(C1024e c1024e, C0874a c0874a) {
    }

    /* JADX INFO: renamed from: b */
    public float[] m3694b(float f, float f2) {
        return m3695b(f, f2, f2633a);
    }

    /* JADX INFO: renamed from: b */
    public float[] m3695b(float f, float f2, float[] fArr) {
        fArr[0] = f;
        fArr[1] = f2;
        mo3711l().m3785a(fArr);
        return fArr;
    }

    /* JADX INFO: renamed from: c */
    protected void m3696c(C1024e c1024e) {
        float f = this.f2666x;
        if (f != 0.0f) {
            float f2 = this.f2667y;
            float f3 = this.f2668z;
            c1024e.m4026a(f2, f3, 0.0f);
            c1024e.m4027a(f, 0.0f, 0.0f, 1.0f);
            c1024e.m4026a(-f2, -f3, 0.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    protected void mo3697c(C1024e c1024e, C0874a c0874a) {
    }

    @Override // org.andengine.p040d.InterfaceC0929b
    /* JADX INFO: renamed from: c */
    public boolean mo3698c() {
        return this.f2653k;
    }

    /* JADX INFO: renamed from: d */
    protected void m3699d(C1024e c1024e) {
        float f = this.f2640E;
        float f2 = this.f2641F;
        if (f == 0.0f && f2 == 0.0f) {
            return;
        }
        float f3 = this.f2642G;
        float f4 = this.f2643H;
        c1024e.m4026a(f3, f4, 0.0f);
        c1024e.m4025a(f, f2);
        c1024e.m4026a(-f3, -f4, 0.0f);
    }

    /* JADX INFO: renamed from: d */
    protected void mo3700d(C1024e c1024e, C0874a c0874a) {
    }

    @Override // org.andengine.p033c.InterfaceC0906c
    /* JADX INFO: renamed from: d */
    public boolean mo3701d() {
        return this.f2646d != null;
    }

    @Override // org.andengine.p033c.InterfaceC0906c
    /* JADX INFO: renamed from: e */
    public InterfaceC0906c mo3702e() {
        return this.f2646d;
    }

    /* JADX INFO: renamed from: e */
    protected void m3703e(C1024e c1024e) {
        float f = this.f2636A;
        float f2 = this.f2637B;
        if (f == 1.0f && f2 == 1.0f) {
            return;
        }
        float f3 = this.f2638C;
        float f4 = this.f2639D;
        c1024e.m4026a(f3, f4, 0.0f);
        c1024e.m4029a(f, f2, 1);
        c1024e.m4026a(-f3, -f4, 0.0f);
    }

    /* JADX INFO: renamed from: e */
    protected void mo3704e(C1024e c1024e, C0874a c0874a) {
        int i = 0;
        c1024e.m4051j();
        m3684a(c1024e);
        C0918b c0918b = this.f2662t;
        if (c0918b == null || !this.f2657o) {
            mo3693b(c1024e, c0874a);
            mo3697c(c1024e, c0874a);
            mo3700d(c1024e, c0874a);
        } else {
            if (this.f2659q) {
                C0911d.m3734a().m3735a(this.f2662t);
                this.f2659q = false;
            }
            int size = c0918b.size();
            while (i < size) {
                InterfaceC0906c interfaceC0906c = (InterfaceC0906c) c0918b.get(i);
                if (interfaceC0906c.mo3705f() >= 0) {
                    break;
                }
                interfaceC0906c.mo3641a(c1024e, c0874a);
                i++;
            }
            mo3693b(c1024e, c0874a);
            mo3697c(c1024e, c0874a);
            mo3700d(c1024e, c0874a);
            while (i < size) {
                ((InterfaceC0906c) c0918b.get(i)).mo3641a(c1024e, c0874a);
                i++;
            }
        }
        c1024e.m4052k();
    }

    @Override // org.andengine.p033c.InterfaceC0906c
    /* JADX INFO: renamed from: f */
    public int mo3705f() {
        return this.f2661s;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.f2653k) {
            return;
        }
        mo3713n();
    }

    /* JADX INFO: renamed from: g */
    public C0939a m3706g() {
        return this.f2663u;
    }

    @Override // org.andengine.p033c.InterfaceC0906c
    /* JADX INFO: renamed from: h */
    public float[] mo3707h() {
        return m3688a_(0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: i */
    public C0928a m3708i() {
        if (this.f2651i == null) {
            this.f2651i = new C0928a();
        }
        C0928a c0928a = this.f2651i;
        if (this.f2649g) {
            c0928a.m3781a();
            float f = this.f2636A;
            float f2 = this.f2637B;
            if (f != 1.0f || f2 != 1.0f) {
                float f3 = this.f2638C;
                float f4 = this.f2639D;
                c0928a.m3783a(-f3, -f4);
                c0928a.m3786b(f, f2);
                c0928a.m3783a(f3, f4);
            }
            float f5 = this.f2640E;
            float f6 = this.f2641F;
            if (f5 != 0.0f || f6 != 0.0f) {
                float f7 = this.f2642G;
                float f8 = this.f2643H;
                c0928a.m3783a(-f7, -f8);
                c0928a.m3788c(f5, f6);
                c0928a.m3783a(f7, f8);
            }
            float f9 = this.f2666x;
            if (f9 != 0.0f) {
                float f10 = this.f2667y;
                float f11 = this.f2668z;
                c0928a.m3783a(-f10, -f11);
                c0928a.m3782a(f9);
                c0928a.m3783a(f10, f11);
            }
            c0928a.m3783a(this.f2664v, this.f2665w);
            this.f2649g = false;
        }
        return c0928a;
    }

    /* JADX INFO: renamed from: j */
    public C0928a m3709j() {
        if (this.f2652j == null) {
            this.f2652j = new C0928a();
        }
        C0928a c0928a = this.f2652j;
        if (this.f2650h) {
            c0928a.m3781a();
            c0928a.m3783a(-this.f2664v, -this.f2665w);
            float f = this.f2666x;
            if (f != 0.0f) {
                float f2 = this.f2667y;
                float f3 = this.f2668z;
                c0928a.m3783a(-f2, -f3);
                c0928a.m3782a(-f);
                c0928a.m3783a(f2, f3);
            }
            float f4 = this.f2640E;
            float f5 = this.f2641F;
            if (f4 != 0.0f || f5 != 0.0f) {
                float f6 = this.f2642G;
                float f7 = this.f2643H;
                c0928a.m3783a(-f6, -f7);
                c0928a.m3788c(-f4, -f5);
                c0928a.m3783a(f6, f7);
            }
            float f8 = this.f2636A;
            float f9 = this.f2637B;
            if (f8 != 1.0f || f9 != 1.0f) {
                float f10 = this.f2638C;
                float f11 = this.f2639D;
                c0928a.m3783a(-f10, -f11);
                c0928a.m3786b(1.0f / f8, 1.0f / f9);
                c0928a.m3783a(f10, f11);
            }
            this.f2650h = false;
        }
        return c0928a;
    }

    @Override // org.andengine.p033c.InterfaceC0906c
    /* JADX INFO: renamed from: k */
    public C0928a mo3710k() {
        if (this.f2644I == null) {
            this.f2644I = new C0928a();
        }
        C0928a c0928a = this.f2644I;
        c0928a.m3784a(m3708i());
        InterfaceC0906c interfaceC0906c = this.f2646d;
        if (interfaceC0906c != null) {
            c0928a.m3787b(interfaceC0906c.mo3710k());
        }
        return c0928a;
    }

    @Override // org.andengine.p033c.InterfaceC0906c
    /* JADX INFO: renamed from: l */
    public C0928a mo3711l() {
        if (this.f2645J == null) {
            this.f2645J = new C0928a();
        }
        C0928a c0928a = this.f2645J;
        c0928a.m3784a(m3709j());
        InterfaceC0906c interfaceC0906c = this.f2646d;
        if (interfaceC0906c != null) {
            c0928a.m3789c(interfaceC0906c.mo3711l());
        }
        return c0928a;
    }

    @Override // org.andengine.p033c.InterfaceC0906c
    /* JADX INFO: renamed from: m */
    public void mo3712m() {
    }

    @Override // org.andengine.p040d.InterfaceC0929b
    /* JADX INFO: renamed from: n */
    public void mo3713n() {
        if (this.f2653k) {
            throw new C0936c();
        }
        this.f2653k = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        mo3682a(sb);
        return sb.toString();
    }
}
