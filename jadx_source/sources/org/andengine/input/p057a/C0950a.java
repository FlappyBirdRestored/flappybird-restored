package org.andengine.input.p057a;

import android.view.MotionEvent;

/* JADX INFO: renamed from: org.andengine.input.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0950a {

    /* JADX INFO: renamed from: f */
    private static final C0958b f2788f = new C0958b(null);

    /* JADX INFO: renamed from: a */
    protected int f2789a;

    /* JADX INFO: renamed from: b */
    protected float f2790b;

    /* JADX INFO: renamed from: c */
    protected float f2791c;

    /* JADX INFO: renamed from: d */
    protected int f2792d;

    /* JADX INFO: renamed from: e */
    protected MotionEvent f2793e;

    /* JADX INFO: renamed from: a */
    public static C0950a m3845a(float f, float f2, int i, int i2, MotionEvent motionEvent) {
        C0950a c0950a = (C0950a) f2788f.m3762d();
        c0950a.m3846b(f, f2, i, i2, motionEvent);
        return c0950a;
    }

    /* JADX INFO: renamed from: b */
    private void m3846b(float f, float f2, int i, int i2, MotionEvent motionEvent) {
        this.f2790b = f;
        this.f2791c = f2;
        this.f2792d = i;
        this.f2789a = i2;
        this.f2793e = motionEvent;
    }

    /* JADX INFO: renamed from: a */
    public void m3847a() {
        f2788f.mo3761c(this);
    }

    /* JADX INFO: renamed from: a */
    public void m3848a(float f, float f2) {
        this.f2790b = f;
        this.f2791c = f2;
    }

    /* JADX INFO: renamed from: b */
    public float m3849b() {
        return this.f2790b;
    }

    /* JADX INFO: renamed from: b */
    public void m3850b(float f, float f2) {
        this.f2790b += f;
        this.f2791c += f2;
    }

    /* JADX INFO: renamed from: c */
    public float m3851c() {
        return this.f2791c;
    }

    /* JADX INFO: renamed from: d */
    public int m3852d() {
        return this.f2789a;
    }

    /* JADX INFO: renamed from: e */
    public int m3853e() {
        return this.f2792d;
    }

    /* JADX INFO: renamed from: f */
    public boolean m3854f() {
        return this.f2792d == 0;
    }

    /* JADX INFO: renamed from: g */
    public boolean m3855g() {
        return this.f2792d == 1;
    }

    /* JADX INFO: renamed from: h */
    public boolean m3856h() {
        return this.f2792d == 2;
    }

    /* JADX INFO: renamed from: i */
    public boolean m3857i() {
        return this.f2792d == 3;
    }

    /* JADX INFO: renamed from: j */
    public boolean m3858j() {
        return this.f2792d == 4;
    }

    /* JADX INFO: renamed from: k */
    public MotionEvent m3859k() {
        return this.f2793e;
    }
}
