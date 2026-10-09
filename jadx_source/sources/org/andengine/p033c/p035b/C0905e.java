package org.andengine.p033c.p035b;

import android.util.SparseArray;
import com.google.android.gms.C0467e;
import org.andengine.input.p057a.C0950a;
import org.andengine.opengl.util.C1024e;
import org.andengine.p026b.p027a.C0874a;
import org.andengine.p026b.p029b.p030a.C0878a;
import org.andengine.p033c.C0896a;
import org.andengine.p033c.InterfaceC0906c;
import org.andengine.p033c.p035b.p036a.C0900a;
import org.andengine.p033c.p035b.p036a.InterfaceC0901b;
import org.andengine.p040d.p041a.p042a.C0918b;
import org.andengine.p040d.p051d.C0939a;

/* JADX INFO: renamed from: org.andengine.c.b.e */
/* JADX INFO: loaded from: classes.dex */
public class C0905e extends C0896a {

    /* JADX INFO: renamed from: I */
    protected C0905e f2673I;

    /* JADX INFO: renamed from: a */
    private float f2680a;

    /* JADX INFO: renamed from: b */
    private boolean f2681b;

    /* JADX INFO: renamed from: c */
    private boolean f2682c;

    /* JADX INFO: renamed from: d */
    private boolean f2683d;

    /* JADX INFO: renamed from: f */
    private InterfaceC0903c f2685f;

    /* JADX INFO: renamed from: g */
    private InterfaceC0902b f2686g;

    /* JADX INFO: renamed from: J */
    protected C0918b f2674J = new C0918b(4);

    /* JADX INFO: renamed from: e */
    private final C0878a f2684e = new C0878a();

    /* JADX INFO: renamed from: h */
    private InterfaceC0901b f2687h = new C0900a(C0939a.f2737b);

    /* JADX INFO: renamed from: i */
    private boolean f2688i = true;

    /* JADX INFO: renamed from: j */
    private boolean f2689j = true;

    /* JADX INFO: renamed from: K */
    private boolean f2675K = false;

    /* JADX INFO: renamed from: L */
    private boolean f2676L = false;

    /* JADX INFO: renamed from: M */
    private final SparseArray f2677M = new SparseArray();

    /* JADX INFO: renamed from: N */
    private boolean f2678N = false;

    /* JADX INFO: renamed from: O */
    private final SparseArray f2679O = new SparseArray();

    /* JADX INFO: renamed from: a */
    private Boolean m3721a(C0950a c0950a, float f, float f2, InterfaceC0904d interfaceC0904d) {
        float[] fArrM3720b = interfaceC0904d.m3720b(f, f2);
        float f3 = fArrM3720b[0];
        float f4 = fArrM3720b[1];
        if (interfaceC0904d.mo3719a(c0950a, f3, f4)) {
            return Boolean.TRUE;
        }
        if (this.f2686g != null) {
            return Boolean.valueOf(this.f2686g.m3717a(c0950a, interfaceC0904d, f3, f4));
        }
        return null;
    }

    @Override // org.andengine.p033c.C0896a
    /* JADX INFO: renamed from: a */
    protected void mo821a(float f) {
        this.f2680a += f;
        this.f2684e.mo3622a_(f);
        C0905e c0905e = this.f2673I;
        if (c0905e == null || !this.f2682c) {
            this.f2687h.mo3622a_(f);
            super.mo821a(f);
        }
        if (c0905e != null) {
            c0905e.mo3622a_(f);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3722a(InterfaceC0903c interfaceC0903c) {
        this.f2685f = interfaceC0903c;
    }

    @Override // org.andengine.p033c.C0896a, org.andengine.p033c.InterfaceC0906c
    /* JADX INFO: renamed from: a */
    public void mo3683a(InterfaceC0906c interfaceC0906c) {
    }

    /* JADX INFO: renamed from: a */
    public boolean mo3714a(C0950a c0950a) {
        int size;
        Boolean boolM3721a;
        Boolean boolM3721a2;
        int iM3853e = c0950a.m3853e();
        boolean zM3854f = c0950a.m3854f();
        boolean zM3856h = c0950a.m3856h();
        if (!zM3854f) {
            if (this.f2678N && ((InterfaceC0903c) this.f2679O.get(c0950a.m3852d())) != null) {
                switch (iM3853e) {
                    case C0467e.MapAttrs_cameraBearing /* 1 */:
                    case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                        this.f2679O.remove(c0950a.m3852d());
                        break;
                }
                Boolean boolValueOf = Boolean.valueOf(this.f2685f.mo822a(this, c0950a));
                if (boolValueOf != null && boolValueOf.booleanValue()) {
                    return true;
                }
            }
            if (this.f2675K) {
                SparseArray sparseArray = this.f2677M;
                InterfaceC0904d interfaceC0904d = (InterfaceC0904d) sparseArray.get(c0950a.m3852d());
                if (interfaceC0904d != null) {
                    float fM3849b = c0950a.m3849b();
                    float fM3851c = c0950a.m3851c();
                    switch (iM3853e) {
                        case C0467e.MapAttrs_cameraBearing /* 1 */:
                        case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                            sparseArray.remove(c0950a.m3852d());
                            break;
                    }
                    Boolean boolM3721a3 = m3721a(c0950a, fM3849b, fM3851c, interfaceC0904d);
                    if (boolM3721a3 != null && boolM3721a3.booleanValue()) {
                        return true;
                    }
                }
            }
        }
        if (this.f2673I != null) {
            if (mo3715b(c0950a)) {
                return true;
            }
            if (this.f2683d) {
                return false;
            }
        }
        float fM3849b2 = c0950a.m3849b();
        float fM3851c2 = c0950a.m3851c();
        C0918b c0918b = this.f2674J;
        if (c0918b != null && (size = c0918b.size()) > 0) {
            if (this.f2689j) {
                for (int i = 0; i < size; i++) {
                    InterfaceC0904d interfaceC0904d2 = (InterfaceC0904d) c0918b.get(i);
                    if (interfaceC0904d2.mo3718a(fM3849b2, fM3851c2) && (boolM3721a2 = m3721a(c0950a, fM3849b2, fM3851c2, interfaceC0904d2)) != null && boolM3721a2.booleanValue()) {
                        if ((this.f2675K && zM3854f) || (this.f2676L && zM3856h)) {
                            this.f2677M.put(c0950a.m3852d(), interfaceC0904d2);
                        }
                        return true;
                    }
                }
            } else {
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    InterfaceC0904d interfaceC0904d3 = (InterfaceC0904d) c0918b.get(i2);
                    if (interfaceC0904d3.mo3718a(fM3849b2, fM3851c2) && (boolM3721a = m3721a(c0950a, fM3849b2, fM3851c2, interfaceC0904d3)) != null && boolM3721a.booleanValue()) {
                        if ((this.f2675K && zM3854f) || (this.f2676L && zM3856h)) {
                            this.f2677M.put(c0950a.m3852d(), interfaceC0904d3);
                        }
                        return true;
                    }
                }
            }
        }
        if (this.f2685f == null) {
            return false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(this.f2685f.mo822a(this, c0950a));
        if (boolValueOf2 == null || !boolValueOf2.booleanValue()) {
            return false;
        }
        if (this.f2678N && zM3854f) {
            this.f2679O.put(c0950a.m3852d(), this.f2685f);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    protected boolean mo3715b(C0950a c0950a) {
        return this.f2673I.mo3714a(c0950a);
    }

    @Override // org.andengine.p033c.C0896a
    /* JADX INFO: renamed from: e */
    protected void mo3704e(C1024e c1024e, C0874a c0874a) {
        C0905e c0905e = this.f2673I;
        if (c0905e == null || !this.f2681b) {
            if (this.f2688i) {
                c1024e.m4054m();
                c0874a.m3629c(c1024e);
                c1024e.m4053l();
                this.f2687h.mo3641a(c1024e, c0874a);
                c1024e.m4055n();
            }
            c1024e.m4054m();
            mo3716f(c1024e, c0874a);
            c1024e.m4053l();
            super.mo3704e(c1024e, c0874a);
            c1024e.m4055n();
        }
        if (c0905e != null) {
            c0905e.mo3641a(c1024e, c0874a);
        }
    }

    /* JADX INFO: renamed from: f */
    protected void mo3716f(C1024e c1024e, C0874a c0874a) {
        c0874a.m3626b(c1024e);
    }
}
