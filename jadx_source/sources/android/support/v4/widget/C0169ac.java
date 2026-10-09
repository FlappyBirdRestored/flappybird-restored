package android.support.v4.widget;

import android.content.Context;
import android.support.v4.view.C0096ao;
import android.support.v4.view.C0165z;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.google.android.gms.C0467e;
import java.util.Arrays;

/* JADX INFO: renamed from: android.support.v4.widget.ac */
/* JADX INFO: loaded from: classes.dex */
public class C0169ac {

    /* JADX INFO: renamed from: v */
    private static final Interpolator f438v = new InterpolatorC0170ad();

    /* JADX INFO: renamed from: a */
    private int f439a;

    /* JADX INFO: renamed from: b */
    private int f440b;

    /* JADX INFO: renamed from: d */
    private float[] f442d;

    /* JADX INFO: renamed from: e */
    private float[] f443e;

    /* JADX INFO: renamed from: f */
    private float[] f444f;

    /* JADX INFO: renamed from: g */
    private float[] f445g;

    /* JADX INFO: renamed from: h */
    private int[] f446h;

    /* JADX INFO: renamed from: i */
    private int[] f447i;

    /* JADX INFO: renamed from: j */
    private int[] f448j;

    /* JADX INFO: renamed from: k */
    private int f449k;

    /* JADX INFO: renamed from: l */
    private VelocityTracker f450l;

    /* JADX INFO: renamed from: m */
    private float f451m;

    /* JADX INFO: renamed from: n */
    private float f452n;

    /* JADX INFO: renamed from: o */
    private int f453o;

    /* JADX INFO: renamed from: p */
    private int f454p;

    /* JADX INFO: renamed from: q */
    private C0184m f455q;

    /* JADX INFO: renamed from: r */
    private final AbstractC0172af f456r;

    /* JADX INFO: renamed from: s */
    private View f457s;

    /* JADX INFO: renamed from: t */
    private boolean f458t;

    /* JADX INFO: renamed from: u */
    private final ViewGroup f459u;

    /* JADX INFO: renamed from: c */
    private int f441c = -1;

    /* JADX INFO: renamed from: w */
    private final Runnable f460w = new RunnableC0171ae(this);

    private C0169ac(Context context, ViewGroup viewGroup, AbstractC0172af abstractC0172af) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0172af == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f459u = viewGroup;
        this.f456r = abstractC0172af;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f453o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f440b = viewConfiguration.getScaledTouchSlop();
        this.f451m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f452n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f455q = C0184m.m767a(context, f438v);
    }

    /* JADX INFO: renamed from: a */
    private float m678a(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            return 0.0f;
        }
        if (fAbs > f3) {
            return f <= 0.0f ? -f3 : f3;
        }
        return f;
    }

    /* JADX INFO: renamed from: a */
    private int m679a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f459u.getWidth();
        int i4 = width / 2;
        float fM688b = (m688b(Math.min(1.0f, Math.abs(i) / width)) * i4) + i4;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fM688b / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: a */
    private int m680a(View view, int i, int i2, int i3, int i4) {
        int iM689b = m689b(i3, (int) this.f452n, (int) this.f451m);
        int iM689b2 = m689b(i4, (int) this.f452n, (int) this.f451m);
        int iAbs = Math.abs(i);
        int iAbs2 = Math.abs(i2);
        int iAbs3 = Math.abs(iM689b);
        int iAbs4 = Math.abs(iM689b2);
        int i5 = iAbs3 + iAbs4;
        int i6 = iAbs + iAbs2;
        return (int) (((iM689b2 != 0 ? iAbs4 / i5 : iAbs2 / i6) * m679a(i2, iM689b2, this.f456r.m727b(view))) + ((iM689b != 0 ? iAbs3 / i5 : iAbs / i6) * m679a(i, iM689b, this.f456r.mo720a(view))));
    }

    /* JADX INFO: renamed from: a */
    public static C0169ac m681a(ViewGroup viewGroup, float f, AbstractC0172af abstractC0172af) {
        C0169ac c0169acM682a = m682a(viewGroup, abstractC0172af);
        c0169acM682a.f440b = (int) (c0169acM682a.f440b * (1.0f / f));
        return c0169acM682a;
    }

    /* JADX INFO: renamed from: a */
    public static C0169ac m682a(ViewGroup viewGroup, AbstractC0172af abstractC0172af) {
        return new C0169ac(viewGroup.getContext(), viewGroup, abstractC0172af);
    }

    /* JADX INFO: renamed from: a */
    private void m683a(float f, float f2) {
        this.f458t = true;
        this.f456r.mo724a(this.f457s, f, f2);
        this.f458t = false;
        if (this.f439a == 1) {
            m713c(0);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m684a(float f, float f2, int i) {
        m695f(i);
        float[] fArr = this.f442d;
        this.f444f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f443e;
        this.f445g[i] = f2;
        fArr2[i] = f2;
        this.f446h[i] = m693e((int) f, (int) f2);
        this.f449k |= 1 << i;
    }

    /* JADX INFO: renamed from: a */
    private boolean m685a(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f446h[i] & i2) != i2 || (this.f454p & i2) == 0 || (this.f448j[i] & i2) == i2 || (this.f447i[i] & i2) == i2) {
            return false;
        }
        if (fAbs <= this.f440b && fAbs2 <= this.f440b) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f456r.mo731b(i2)) {
            return (this.f447i[i] & i2) == 0 && fAbs > ((float) this.f440b);
        }
        int[] iArr = this.f448j;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m686a(int i, int i2, int i3, int i4) {
        int left = this.f457s.getLeft();
        int top = this.f457s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f455q.m775g();
            m713c(0);
            return false;
        }
        this.f455q.m768a(left, top, i5, i6, m680a(this.f457s, i5, i6, i3, i4));
        m713c(2);
        return true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m687a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f456r.mo720a(view) > 0;
        boolean z2 = this.f456r.m727b(view) > 0;
        if (z && z2) {
            return (f * f) + (f2 * f2) > ((float) (this.f440b * this.f440b));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f440b);
        }
        return z2 && Math.abs(f2) > ((float) this.f440b);
    }

    /* JADX INFO: renamed from: b */
    private float m688b(float f) {
        return (float) Math.sin((float) (((double) (f - 0.5f)) * 0.4712389167638204d));
    }

    /* JADX INFO: renamed from: b */
    private int m689b(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        if (iAbs > i3) {
            return i <= 0 ? -i3 : i3;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    private void m690b(float f, float f2, int i) {
        int i2 = m685a(f, f2, i, 1) ? 1 : 0;
        if (m685a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m685a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m685a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f447i;
            iArr[i] = iArr[i] | i2;
            this.f456r.mo729b(i2, i);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m691b(int i, int i2, int i3, int i4) {
        int iMo721a;
        int iMo728b;
        int left = this.f457s.getLeft();
        int top = this.f457s.getTop();
        if (i3 != 0) {
            iMo721a = this.f456r.mo721a(this.f457s, i, i3);
            this.f457s.offsetLeftAndRight(iMo721a - left);
        } else {
            iMo721a = i;
        }
        if (i4 != 0) {
            iMo728b = this.f456r.mo728b(this.f457s, i2, i4);
            this.f457s.offsetTopAndBottom(iMo728b - top);
        } else {
            iMo728b = i2;
        }
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.f456r.mo725a(this.f457s, iMo721a, iMo728b, iMo721a - left, iMo728b - top);
    }

    /* JADX INFO: renamed from: c */
    private void m692c(MotionEvent motionEvent) {
        int iM617c = C0165z.m617c(motionEvent);
        for (int i = 0; i < iM617c; i++) {
            int iM615b = C0165z.m615b(motionEvent, i);
            float fM616c = C0165z.m616c(motionEvent, i);
            float fM618d = C0165z.m618d(motionEvent, i);
            this.f444f[iM615b] = fM616c;
            this.f445g[iM615b] = fM618d;
        }
    }

    /* JADX INFO: renamed from: e */
    private int m693e(int i, int i2) {
        int i3 = i < this.f459u.getLeft() + this.f453o ? 1 : 0;
        if (i2 < this.f459u.getTop() + this.f453o) {
            i3 |= 4;
        }
        if (i > this.f459u.getRight() - this.f453o) {
            i3 |= 2;
        }
        return i2 > this.f459u.getBottom() - this.f453o ? i3 | 8 : i3;
    }

    /* JADX INFO: renamed from: e */
    private void m694e(int i) {
        if (this.f442d == null) {
            return;
        }
        this.f442d[i] = 0.0f;
        this.f443e[i] = 0.0f;
        this.f444f[i] = 0.0f;
        this.f445g[i] = 0.0f;
        this.f446h[i] = 0;
        this.f447i[i] = 0;
        this.f448j[i] = 0;
        this.f449k &= (1 << i) ^ (-1);
    }

    /* JADX INFO: renamed from: f */
    private void m695f(int i) {
        if (this.f442d == null || this.f442d.length <= i) {
            float[] fArr = new float[i + 1];
            float[] fArr2 = new float[i + 1];
            float[] fArr3 = new float[i + 1];
            float[] fArr4 = new float[i + 1];
            int[] iArr = new int[i + 1];
            int[] iArr2 = new int[i + 1];
            int[] iArr3 = new int[i + 1];
            if (this.f442d != null) {
                System.arraycopy(this.f442d, 0, fArr, 0, this.f442d.length);
                System.arraycopy(this.f443e, 0, fArr2, 0, this.f443e.length);
                System.arraycopy(this.f444f, 0, fArr3, 0, this.f444f.length);
                System.arraycopy(this.f445g, 0, fArr4, 0, this.f445g.length);
                System.arraycopy(this.f446h, 0, iArr, 0, this.f446h.length);
                System.arraycopy(this.f447i, 0, iArr2, 0, this.f447i.length);
                System.arraycopy(this.f448j, 0, iArr3, 0, this.f448j.length);
            }
            this.f442d = fArr;
            this.f443e = fArr2;
            this.f444f = fArr3;
            this.f445g = fArr4;
            this.f446h = iArr;
            this.f447i = iArr2;
            this.f448j = iArr3;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m696g() {
        if (this.f442d == null) {
            return;
        }
        Arrays.fill(this.f442d, 0.0f);
        Arrays.fill(this.f443e, 0.0f);
        Arrays.fill(this.f444f, 0.0f);
        Arrays.fill(this.f445g, 0.0f);
        Arrays.fill(this.f446h, 0);
        Arrays.fill(this.f447i, 0);
        Arrays.fill(this.f448j, 0);
        this.f449k = 0;
    }

    /* JADX INFO: renamed from: h */
    private void m697h() {
        this.f450l.computeCurrentVelocity(1000, this.f451m);
        m683a(m678a(C0096ao.m496a(this.f450l, this.f441c), this.f452n, this.f451m), m678a(C0096ao.m497b(this.f450l, this.f441c), this.f452n, this.f451m));
    }

    /* JADX INFO: renamed from: a */
    public int m698a() {
        return this.f439a;
    }

    /* JADX INFO: renamed from: a */
    public void m699a(float f) {
        this.f452n = f;
    }

    /* JADX INFO: renamed from: a */
    public void m700a(int i) {
        this.f454p = i;
    }

    /* JADX INFO: renamed from: a */
    public void m701a(View view, int i) {
        if (view.getParent() != this.f459u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f459u + ")");
        }
        this.f457s = view;
        this.f441c = i;
        this.f456r.mo730b(view, i);
        m713c(1);
    }

    /* JADX INFO: renamed from: a */
    public boolean m702a(int i, int i2) {
        if (this.f458t) {
            return m686a(i, i2, (int) C0096ao.m496a(this.f450l, this.f441c), (int) C0096ao.m497b(this.f450l, this.f441c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX INFO: renamed from: a */
    public boolean m703a(MotionEvent motionEvent) {
        View viewM716d;
        View viewM716d2;
        int iM612a = C0165z.m612a(motionEvent);
        int iM614b = C0165z.m614b(motionEvent);
        if (iM612a == 0) {
            m718e();
        }
        if (this.f450l == null) {
            this.f450l = VelocityTracker.obtain();
        }
        this.f450l.addMovement(motionEvent);
        switch (iM612a) {
            case C0467e.MapAttrs_mapType /* 0 */:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int iM615b = C0165z.m615b(motionEvent, 0);
                m684a(x, y, iM615b);
                View viewM716d3 = m716d((int) x, (int) y);
                if (viewM716d3 == this.f457s && this.f439a == 2) {
                    m710b(viewM716d3, iM615b);
                }
                int i = this.f446h[iM615b];
                if ((this.f454p & i) != 0) {
                    this.f456r.mo723a(i & this.f454p, iM615b);
                }
                break;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                m718e();
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                int iM617c = C0165z.m617c(motionEvent);
                for (int i2 = 0; i2 < iM617c; i2++) {
                    int iM615b2 = C0165z.m615b(motionEvent, i2);
                    float fM616c = C0165z.m616c(motionEvent, i2);
                    float fM618d = C0165z.m618d(motionEvent, i2);
                    float f = fM616c - this.f442d[iM615b2];
                    float f2 = fM618d - this.f443e[iM615b2];
                    m690b(f, f2, iM615b2);
                    if (this.f439a == 1 || ((viewM716d = m716d((int) fM616c, (int) fM618d)) != null && m687a(viewM716d, f, f2) && m710b(viewM716d, iM615b2))) {
                        m692c(motionEvent);
                    }
                    break;
                }
                m692c(motionEvent);
                break;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                int iM615b3 = C0165z.m615b(motionEvent, iM614b);
                float fM616c2 = C0165z.m616c(motionEvent, iM614b);
                float fM618d2 = C0165z.m618d(motionEvent, iM614b);
                m684a(fM616c2, fM618d2, iM615b3);
                if (this.f439a == 0) {
                    int i3 = this.f446h[iM615b3];
                    if ((this.f454p & i3) != 0) {
                        this.f456r.mo723a(i3 & this.f454p, iM615b3);
                    }
                } else if (this.f439a == 2 && (viewM716d2 = m716d((int) fM616c2, (int) fM618d2)) == this.f457s) {
                    m710b(viewM716d2, iM615b3);
                }
                break;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                m694e(C0165z.m615b(motionEvent, iM614b));
                break;
        }
        return this.f439a == 1;
    }

    /* JADX INFO: renamed from: a */
    public boolean m704a(View view, int i, int i2) {
        this.f457s = view;
        this.f441c = -1;
        return m686a(i, i2, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public boolean m705a(boolean z) {
        boolean zM769a;
        if (this.f439a == 2) {
            boolean zM774f = this.f455q.m774f();
            int iM770b = this.f455q.m770b();
            int iM771c = this.f455q.m771c();
            int left = iM770b - this.f457s.getLeft();
            int top = iM771c - this.f457s.getTop();
            if (left != 0) {
                this.f457s.offsetLeftAndRight(left);
            }
            if (top != 0) {
                this.f457s.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f456r.mo725a(this.f457s, iM770b, iM771c, left, top);
            }
            if (zM774f && iM770b == this.f455q.m772d() && iM771c == this.f455q.m773e()) {
                this.f455q.m775g();
                zM769a = this.f455q.m769a();
            } else {
                zM769a = zM774f;
            }
            if (!zM769a) {
                if (z) {
                    this.f459u.post(this.f460w);
                } else {
                    m713c(0);
                }
            }
        }
        return this.f439a == 2;
    }

    /* JADX INFO: renamed from: b */
    public int m706b() {
        return this.f453o;
    }

    /* JADX INFO: renamed from: b */
    public void m707b(MotionEvent motionEvent) {
        int i;
        int i2 = 0;
        int iM612a = C0165z.m612a(motionEvent);
        int iM614b = C0165z.m614b(motionEvent);
        if (iM612a == 0) {
            m718e();
        }
        if (this.f450l == null) {
            this.f450l = VelocityTracker.obtain();
        }
        this.f450l.addMovement(motionEvent);
        switch (iM612a) {
            case C0467e.MapAttrs_mapType /* 0 */:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int iM615b = C0165z.m615b(motionEvent, 0);
                View viewM716d = m716d((int) x, (int) y);
                m684a(x, y, iM615b);
                m710b(viewM716d, iM615b);
                int i3 = this.f446h[iM615b];
                if ((this.f454p & i3) != 0) {
                    this.f456r.mo723a(i3 & this.f454p, iM615b);
                }
                break;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                if (this.f439a == 1) {
                    m697h();
                }
                m718e();
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                if (this.f439a != 1) {
                    int iM617c = C0165z.m617c(motionEvent);
                    while (i2 < iM617c) {
                        int iM615b2 = C0165z.m615b(motionEvent, i2);
                        float fM616c = C0165z.m616c(motionEvent, i2);
                        float fM618d = C0165z.m618d(motionEvent, i2);
                        float f = fM616c - this.f442d[iM615b2];
                        float f2 = fM618d - this.f443e[iM615b2];
                        m690b(f, f2, iM615b2);
                        if (this.f439a != 1) {
                            View viewM716d2 = m716d((int) fM616c, (int) fM618d);
                            if (!m687a(viewM716d2, f, f2) || !m710b(viewM716d2, iM615b2)) {
                                i2++;
                            }
                        }
                        m692c(motionEvent);
                        break;
                    }
                    m692c(motionEvent);
                } else {
                    int iM613a = C0165z.m613a(motionEvent, this.f441c);
                    float fM616c2 = C0165z.m616c(motionEvent, iM613a);
                    float fM618d2 = C0165z.m618d(motionEvent, iM613a);
                    int i4 = (int) (fM616c2 - this.f444f[this.f441c]);
                    int i5 = (int) (fM618d2 - this.f445g[this.f441c]);
                    m691b(this.f457s.getLeft() + i4, this.f457s.getTop() + i5, i4, i5);
                    m692c(motionEvent);
                }
                break;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                if (this.f439a == 1) {
                    m683a(0.0f, 0.0f);
                }
                m718e();
                break;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                int iM615b3 = C0165z.m615b(motionEvent, iM614b);
                float fM616c3 = C0165z.m616c(motionEvent, iM614b);
                float fM618d3 = C0165z.m618d(motionEvent, iM614b);
                m684a(fM616c3, fM618d3, iM615b3);
                if (this.f439a == 0) {
                    m710b(m716d((int) fM616c3, (int) fM618d3), iM615b3);
                    int i6 = this.f446h[iM615b3];
                    if ((this.f454p & i6) != 0) {
                        this.f456r.mo723a(i6 & this.f454p, iM615b3);
                    }
                } else if (m714c((int) fM616c3, (int) fM618d3)) {
                    m710b(this.f457s, iM615b3);
                }
                break;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                int iM615b4 = C0165z.m615b(motionEvent, iM614b);
                if (this.f439a == 1 && iM615b4 == this.f441c) {
                    int iM617c2 = C0165z.m617c(motionEvent);
                    while (true) {
                        if (i2 >= iM617c2) {
                            i = -1;
                        } else {
                            int iM615b5 = C0165z.m615b(motionEvent, i2);
                            if (iM615b5 != this.f441c) {
                                if (m716d((int) C0165z.m616c(motionEvent, i2), (int) C0165z.m618d(motionEvent, i2)) == this.f457s && m710b(this.f457s, iM615b5)) {
                                    i = this.f441c;
                                }
                            }
                            i2++;
                        }
                    }
                    if (i == -1) {
                        m697h();
                    }
                }
                m694e(iM615b4);
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m708b(int i) {
        return (this.f449k & (1 << i)) != 0;
    }

    /* JADX INFO: renamed from: b */
    public boolean m709b(int i, int i2) {
        if (!m708b(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f444f[i2] - this.f442d[i2];
        float f2 = this.f445g[i2] - this.f443e[i2];
        if (z && z2) {
            return (f * f) + (f2 * f2) > ((float) (this.f440b * this.f440b));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f440b);
        }
        return z2 && Math.abs(f2) > ((float) this.f440b);
    }

    /* JADX INFO: renamed from: b */
    boolean m710b(View view, int i) {
        if (view == this.f457s && this.f441c == i) {
            return true;
        }
        if (view == null || !this.f456r.mo726a(view, i)) {
            return false;
        }
        this.f441c = i;
        m701a(view, i);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m711b(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* JADX INFO: renamed from: c */
    public View m712c() {
        return this.f457s;
    }

    /* JADX INFO: renamed from: c */
    void m713c(int i) {
        if (this.f439a != i) {
            this.f439a = i;
            this.f456r.mo722a(i);
            if (i == 0) {
                this.f457s = null;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m714c(int i, int i2) {
        return m711b(this.f457s, i, i2);
    }

    /* JADX INFO: renamed from: d */
    public int m715d() {
        return this.f440b;
    }

    /* JADX INFO: renamed from: d */
    public View m716d(int i, int i2) {
        for (int childCount = this.f459u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f459u.getChildAt(this.f456r.m732c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m717d(int i) {
        int length = this.f442d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m709b(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m718e() {
        this.f441c = -1;
        m696g();
        if (this.f450l != null) {
            this.f450l.recycle();
            this.f450l = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m719f() {
        m718e();
        if (this.f439a == 2) {
            int iM770b = this.f455q.m770b();
            int iM771c = this.f455q.m771c();
            this.f455q.m775g();
            int iM770b2 = this.f455q.m770b();
            int iM771c2 = this.f455q.m771c();
            this.f456r.mo725a(this.f457s, iM770b2, iM771c2, iM770b2 - iM770b, iM771c2 - iM771c);
        }
        m713c(0);
    }
}
