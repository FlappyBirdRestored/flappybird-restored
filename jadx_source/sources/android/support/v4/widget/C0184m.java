package android.support.v4.widget;

import android.content.Context;
import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: android.support.v4.widget.m */
/* JADX INFO: loaded from: classes.dex */
public class C0184m {

    /* JADX INFO: renamed from: b */
    static final InterfaceC0185n f472b;

    /* JADX INFO: renamed from: a */
    Object f473a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 14) {
            f472b = new C0188q();
        } else if (i >= 9) {
            f472b = new C0187p();
        } else {
            f472b = new C0186o();
        }
    }

    C0184m(Context context, Interpolator interpolator) {
        this.f473a = f472b.mo776a(context, interpolator);
    }

    /* JADX INFO: renamed from: a */
    public static C0184m m767a(Context context, Interpolator interpolator) {
        return new C0184m(context, interpolator);
    }

    /* JADX INFO: renamed from: a */
    public void m768a(int i, int i2, int i3, int i4, int i5) {
        f472b.mo777a(this.f473a, i, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: a */
    public boolean m769a() {
        return f472b.mo778a(this.f473a);
    }

    /* JADX INFO: renamed from: b */
    public int m770b() {
        return f472b.mo779b(this.f473a);
    }

    /* JADX INFO: renamed from: c */
    public int m771c() {
        return f472b.mo780c(this.f473a);
    }

    /* JADX INFO: renamed from: d */
    public int m772d() {
        return f472b.mo783f(this.f473a);
    }

    /* JADX INFO: renamed from: e */
    public int m773e() {
        return f472b.mo784g(this.f473a);
    }

    /* JADX INFO: renamed from: f */
    public boolean m774f() {
        return f472b.mo781d(this.f473a);
    }

    /* JADX INFO: renamed from: g */
    public void m775g() {
        f472b.mo782e(this.f473a);
    }
}
