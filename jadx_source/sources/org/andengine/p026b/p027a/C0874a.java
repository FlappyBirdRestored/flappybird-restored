package org.andengine.p026b.p027a;

import org.andengine.input.p057a.C0950a;
import org.andengine.opengl.util.C1024e;
import org.andengine.p026b.p027a.p028a.C0875a;
import org.andengine.p026b.p029b.C0881d;
import org.andengine.p026b.p029b.InterfaceC0880c;
import org.andengine.p033c.InterfaceC0906c;
import org.andengine.p040d.p054g.C0945a;

/* JADX INFO: renamed from: org.andengine.b.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0874a implements InterfaceC0880c {

    /* JADX INFO: renamed from: a */
    static final float[] f2570a = new float[2];

    /* JADX INFO: renamed from: b */
    protected float f2571b;

    /* JADX INFO: renamed from: c */
    protected float f2572c;

    /* JADX INFO: renamed from: d */
    protected float f2573d;

    /* JADX INFO: renamed from: e */
    protected float f2574e;

    /* JADX INFO: renamed from: h */
    protected int f2577h;

    /* JADX INFO: renamed from: i */
    protected int f2578i;

    /* JADX INFO: renamed from: j */
    protected int f2579j;

    /* JADX INFO: renamed from: k */
    protected int f2580k;

    /* JADX INFO: renamed from: l */
    protected boolean f2581l;

    /* JADX INFO: renamed from: m */
    protected C0881d f2582m;

    /* JADX INFO: renamed from: p */
    private C0875a f2585p;

    /* JADX INFO: renamed from: q */
    private InterfaceC0906c f2586q;

    /* JADX INFO: renamed from: n */
    private float f2583n = -1.0f;

    /* JADX INFO: renamed from: o */
    private float f2584o = 1.0f;

    /* JADX INFO: renamed from: f */
    protected float f2575f = 0.0f;

    /* JADX INFO: renamed from: g */
    protected float f2576g = 0.0f;

    public C0874a(float f, float f2, float f3, float f4) {
        m3616a(f, f2, f + f3, f2 + f4);
    }

    /* JADX INFO: renamed from: a */
    private void m3608a(C0950a c0950a, float f, float f2) {
        float fM3614a = m3614a();
        float fM3623b = m3623b();
        float fM3627c = m3627c();
        c0950a.m3848a(fM3614a + ((fM3623b - fM3614a) * f), ((m3630d() - fM3627c) * f2) + fM3627c);
    }

    /* JADX INFO: renamed from: a */
    private static void m3609a(C1024e c1024e, float f, float f2, float f3) {
        c1024e.m4036b(f, f2, 0.0f);
        c1024e.m4037b(f3, 0.0f, 0.0f, 1.0f);
        c1024e.m4036b(-f, -f2, 0.0f);
    }

    /* JADX INFO: renamed from: e */
    private void m3610e(C0950a c0950a) {
        float f = this.f2575f;
        if (f != 0.0f) {
            f2570a[0] = c0950a.m3849b();
            f2570a[1] = c0950a.m3851c();
            C0945a.m3835a(f2570a, -f, m3635g(), m3636h());
            c0950a.m3848a(f2570a[0], f2570a[1]);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m3611f(C0950a c0950a) {
        float f = this.f2575f;
        if (f != 0.0f) {
            f2570a[0] = c0950a.m3849b();
            f2570a[1] = c0950a.m3851c();
            C0945a.m3836b(f2570a, f, m3635g(), m3636h());
            c0950a.m3848a(f2570a[0], f2570a[1]);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m3612g(C0950a c0950a) {
        float f = -this.f2576g;
        if (f != 0.0f) {
            f2570a[0] = c0950a.m3849b();
            f2570a[1] = c0950a.m3851c();
            C0945a.m3835a(f2570a, f, (this.f2572c - this.f2571b) * 0.5f, (this.f2574e - this.f2573d) * 0.5f);
            c0950a.m3848a(f2570a[0], f2570a[1]);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m3613h(C0950a c0950a) {
        float f = -this.f2576g;
        if (f != 0.0f) {
            f2570a[0] = c0950a.m3849b();
            f2570a[1] = c0950a.m3851c();
            C0945a.m3836b(f2570a, f, (this.f2572c - this.f2571b) * 0.5f, (this.f2574e - this.f2573d) * 0.5f);
            c0950a.m3848a(f2570a[0], f2570a[1]);
        }
    }

    /* JADX INFO: renamed from: a */
    public float m3614a() {
        return this.f2571b;
    }

    /* JADX INFO: renamed from: a */
    public void m3615a(float f, float f2) {
        float fM3635g = f - m3635g();
        float fM3636h = f2 - m3636h();
        this.f2571b += fM3635g;
        this.f2572c = fM3635g + this.f2572c;
        this.f2573d += fM3636h;
        this.f2574e += fM3636h;
    }

    /* JADX INFO: renamed from: a */
    public void m3616a(float f, float f2, float f3, float f4) {
        this.f2571b = f;
        this.f2572c = f3;
        this.f2573d = f2;
        this.f2574e = f4;
    }

    /* JADX INFO: renamed from: a */
    public void m3617a(int i, int i2, int i3, int i4) {
        if (this.f2580k == 0 && this.f2579j == 0) {
            m3624b(i, i2, i3, i4);
        } else {
            if (this.f2579j == i3 && this.f2580k == i4) {
                return;
            }
            m3618a(this.f2577h, this.f2578i, this.f2579j, this.f2580k, i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m3618a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f2581l) {
            float fM3635g = m3635g();
            float fM3636h = m3636h();
            float fM3633e = (i7 / i3) * m3633e() * 0.5f;
            float fM3634f = (i8 / i4) * m3634f() * 0.5f;
            m3616a(fM3635g - fM3633e, fM3636h - fM3634f, fM3633e + fM3635g, fM3634f + fM3636h);
        }
        this.f2577h = i5;
        this.f2578i = i6;
        this.f2579j = i7;
        this.f2580k = i8;
    }

    /* JADX INFO: renamed from: a */
    public void m3619a(C0950a c0950a) {
        m3611f(c0950a);
        m3628c(c0950a);
        m3612g(c0950a);
    }

    /* JADX INFO: renamed from: a */
    public void m3620a(C0950a c0950a, int i, int i2) {
        float f;
        float f2;
        float fM3849b = c0950a.m3849b();
        float fM3851c = c0950a.m3851c();
        float f3 = this.f2575f;
        if (f3 == 0.0f) {
            f = fM3849b / i;
            f2 = fM3851c / i2;
        } else if (f3 == 180.0f) {
            f = 1.0f - (fM3849b / i);
            f2 = 1.0f - (fM3851c / i2);
        } else {
            f2570a[0] = fM3849b;
            f2570a[1] = fM3851c;
            C0945a.m3835a(f2570a, f3, i >> 1, i2 >> 1);
            f = f2570a[0] / i;
            f2 = f2570a[1] / i2;
        }
        m3608a(c0950a, f, f2);
    }

    /* JADX INFO: renamed from: a */
    public void m3621a(C1024e c1024e) {
        if (this.f2585p != null) {
            this.f2585p.mo3641a(c1024e, this);
        }
    }

    @Override // org.andengine.p026b.p029b.InterfaceC0880c
    /* JADX INFO: renamed from: a_ */
    public void mo3622a_(float f) {
        if (this.f2582m != null) {
            this.f2582m.mo3622a_(f);
        }
        if (this.f2585p != null) {
            this.f2585p.mo3622a_(f);
        }
        m3640l();
    }

    /* JADX INFO: renamed from: b */
    public float m3623b() {
        return this.f2572c;
    }

    /* JADX INFO: renamed from: b */
    protected void m3624b(int i, int i2, int i3, int i4) {
        this.f2577h = i;
        this.f2578i = i2;
        this.f2579j = i3;
        this.f2580k = i4;
    }

    /* JADX INFO: renamed from: b */
    public void m3625b(C0950a c0950a) {
        m3613h(c0950a);
        m3631d(c0950a);
        m3610e(c0950a);
    }

    /* JADX INFO: renamed from: b */
    public void m3626b(C1024e c1024e) {
        c1024e.m4028a(m3614a(), m3623b(), m3630d(), m3627c(), this.f2583n, this.f2584o);
        float f = this.f2575f;
        if (f != 0.0f) {
            m3609a(c1024e, m3635g(), m3636h(), f);
        }
    }

    /* JADX INFO: renamed from: c */
    public float m3627c() {
        return this.f2573d;
    }

    /* JADX INFO: renamed from: c */
    protected void m3628c(C0950a c0950a) {
        c0950a.m3850b(-this.f2571b, -this.f2573d);
    }

    /* JADX INFO: renamed from: c */
    public void m3629c(C1024e c1024e) {
        float fM3633e = m3633e();
        float fM3634f = m3634f();
        c1024e.m4028a(0.0f, fM3633e, fM3634f, 0.0f, this.f2583n, this.f2584o);
        float f = this.f2575f;
        if (f != 0.0f) {
            m3609a(c1024e, fM3633e * 0.5f, fM3634f * 0.5f, f);
        }
    }

    /* JADX INFO: renamed from: d */
    public float m3630d() {
        return this.f2574e;
    }

    /* JADX INFO: renamed from: d */
    protected void m3631d(C0950a c0950a) {
        c0950a.m3850b(this.f2571b, this.f2573d);
    }

    /* JADX INFO: renamed from: d */
    public void m3632d(C1024e c1024e) {
        float fM3633e = m3633e();
        float fM3634f = m3634f();
        c1024e.m4028a(0.0f, fM3633e, fM3634f, 0.0f, this.f2583n, this.f2584o);
        float f = this.f2576g;
        if (f != 0.0f) {
            m3609a(c1024e, fM3633e * 0.5f, fM3634f * 0.5f, f);
        }
    }

    /* JADX INFO: renamed from: e */
    public float m3633e() {
        return this.f2572c - this.f2571b;
    }

    /* JADX INFO: renamed from: f */
    public float m3634f() {
        return this.f2574e - this.f2573d;
    }

    /* JADX INFO: renamed from: g */
    public float m3635g() {
        return (this.f2571b + this.f2572c) * 0.5f;
    }

    /* JADX INFO: renamed from: h */
    public float m3636h() {
        return (this.f2573d + this.f2574e) * 0.5f;
    }

    /* JADX INFO: renamed from: i */
    public C0875a m3637i() {
        return this.f2585p;
    }

    /* JADX INFO: renamed from: j */
    public boolean m3638j() {
        return this.f2585p != null;
    }

    /* JADX INFO: renamed from: k */
    public float m3639k() {
        return this.f2575f;
    }

    /* JADX INFO: renamed from: l */
    public void m3640l() {
        if (this.f2586q != null) {
            float[] fArrMo3707h = this.f2586q.mo3707h();
            m3615a(fArrMo3707h[0], fArrMo3707h[1]);
        }
    }
}
