package org.andengine.p040d.p051d;

/* JADX INFO: renamed from: org.andengine.d.d.a */
/* JADX INFO: loaded from: classes.dex */
public class C0939a {

    /* JADX INFO: renamed from: K */
    private float f2762K;

    /* JADX INFO: renamed from: L */
    private float f2763L;

    /* JADX INFO: renamed from: M */
    private float f2764M;

    /* JADX INFO: renamed from: N */
    private float f2765N;

    /* JADX INFO: renamed from: O */
    private int f2766O;

    /* JADX INFO: renamed from: P */
    private float f2767P;

    /* JADX INFO: renamed from: a */
    public static final C0939a f2736a = new C0939a(1.0f, 1.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: b */
    public static final C0939a f2737b = new C0939a(0.0f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: c */
    public static final C0939a f2738c = new C0939a(1.0f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: d */
    public static final C0939a f2739d = new C0939a(1.0f, 1.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: e */
    public static final C0939a f2740e = new C0939a(0.0f, 1.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f */
    public static final C0939a f2741f = new C0939a(0.0f, 1.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: g */
    public static final C0939a f2742g = new C0939a(0.0f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: h */
    public static final C0939a f2743h = new C0939a(1.0f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: i */
    public static final C0939a f2744i = new C0939a(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: j */
    public static final int f2745j = f2736a.m3815e();

    /* JADX INFO: renamed from: k */
    public static final int f2746k = f2737b.m3815e();

    /* JADX INFO: renamed from: l */
    public static final int f2747l = f2738c.m3815e();

    /* JADX INFO: renamed from: m */
    public static final int f2748m = f2739d.m3815e();

    /* JADX INFO: renamed from: n */
    public static final int f2749n = f2740e.m3815e();

    /* JADX INFO: renamed from: o */
    public static final int f2750o = f2741f.m3815e();

    /* JADX INFO: renamed from: p */
    public static final int f2751p = f2742g.m3815e();

    /* JADX INFO: renamed from: q */
    public static final int f2752q = f2743h.m3815e();

    /* JADX INFO: renamed from: r */
    public static final int f2753r = f2744i.m3815e();

    /* JADX INFO: renamed from: s */
    public static final float f2754s = f2736a.m3816f();

    /* JADX INFO: renamed from: t */
    public static final float f2755t = f2737b.m3816f();

    /* JADX INFO: renamed from: u */
    public static final float f2756u = f2738c.m3816f();

    /* JADX INFO: renamed from: v */
    public static final float f2757v = f2739d.m3816f();

    /* JADX INFO: renamed from: w */
    public static final float f2758w = f2740e.m3816f();

    /* JADX INFO: renamed from: x */
    public static final float f2759x = f2741f.m3816f();

    /* JADX INFO: renamed from: y */
    public static final float f2760y = f2742g.m3816f();

    /* JADX INFO: renamed from: z */
    public static final float f2761z = f2743h.m3816f();

    /* JADX INFO: renamed from: A */
    public static final float f2726A = f2744i.m3816f();

    /* JADX INFO: renamed from: B */
    public static final int f2727B = f2736a.m3817g();

    /* JADX INFO: renamed from: C */
    public static final int f2728C = f2737b.m3817g();

    /* JADX INFO: renamed from: D */
    public static final int f2729D = f2738c.m3817g();

    /* JADX INFO: renamed from: E */
    public static final int f2730E = f2739d.m3817g();

    /* JADX INFO: renamed from: F */
    public static final int f2731F = f2740e.m3817g();

    /* JADX INFO: renamed from: G */
    public static final int f2732G = f2741f.m3817g();

    /* JADX INFO: renamed from: H */
    public static final int f2733H = f2742g.m3817g();

    /* JADX INFO: renamed from: I */
    public static final int f2734I = f2743h.m3817g();

    /* JADX INFO: renamed from: J */
    public static final int f2735J = f2744i.m3817g();

    public C0939a(float f, float f2, float f3, float f4) {
        m3808a(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: h */
    private final void m3805h() {
        this.f2766O = (this.f2766O & 16777215) | (((int) (255.0f * this.f2765N)) << 24);
        this.f2767P = C0940b.m3818a(this.f2766O);
    }

    /* JADX INFO: renamed from: i */
    private final void m3806i() {
        this.f2766O = C0940b.m3820b(this.f2762K, this.f2763L, this.f2764M, this.f2765N);
        this.f2767P = C0940b.m3818a(this.f2766O);
    }

    /* JADX INFO: renamed from: a */
    public final float m3807a() {
        return this.f2762K;
    }

    /* JADX INFO: renamed from: a */
    public final void m3808a(float f, float f2, float f3, float f4) {
        this.f2762K = f;
        this.f2763L = f2;
        this.f2764M = f3;
        this.f2765N = f4;
        m3806i();
    }

    /* JADX INFO: renamed from: a */
    public final void m3809a(C0939a c0939a) {
        this.f2762K = c0939a.f2762K;
        this.f2763L = c0939a.f2763L;
        this.f2764M = c0939a.f2764M;
        this.f2765N = c0939a.f2765N;
        this.f2766O = c0939a.f2766O;
        this.f2767P = c0939a.f2767P;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3810a(float f) {
        if (this.f2765N == f) {
            return false;
        }
        this.f2765N = f;
        m3805h();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final float m3811b() {
        return this.f2763L;
    }

    /* JADX INFO: renamed from: b */
    public boolean m3812b(C0939a c0939a) {
        return this.f2766O == c0939a.f2766O;
    }

    /* JADX INFO: renamed from: c */
    public final float m3813c() {
        return this.f2764M;
    }

    /* JADX INFO: renamed from: d */
    public final float m3814d() {
        return this.f2765N;
    }

    /* JADX INFO: renamed from: e */
    public final int m3815e() {
        return this.f2766O;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return m3812b((C0939a) obj);
    }

    /* JADX INFO: renamed from: f */
    public final float m3816f() {
        return this.f2767P;
    }

    /* JADX INFO: renamed from: g */
    public final int m3817g() {
        return C0940b.m3819a(this.f2762K, this.f2763L, this.f2764M, this.f2765N);
    }

    public int hashCode() {
        return this.f2766O;
    }

    public String toString() {
        return "[Red: " + this.f2762K + ", Green: " + this.f2763L + ", Blue: " + this.f2764M + ", Alpha: " + this.f2765N + "]";
    }
}
