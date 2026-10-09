package android.support.v4.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.p000a.C0000a;
import android.support.v4.widget.C0179h;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.google.android.gms.C0467e;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: A */
    private boolean f270A;

    /* JADX INFO: renamed from: B */
    private boolean f271B;

    /* JADX INFO: renamed from: C */
    private int f272C;

    /* JADX INFO: renamed from: D */
    private int f273D;

    /* JADX INFO: renamed from: E */
    private int f274E;

    /* JADX INFO: renamed from: F */
    private float f275F;

    /* JADX INFO: renamed from: G */
    private float f276G;

    /* JADX INFO: renamed from: H */
    private float f277H;

    /* JADX INFO: renamed from: I */
    private float f278I;

    /* JADX INFO: renamed from: J */
    private int f279J;

    /* JADX INFO: renamed from: K */
    private VelocityTracker f280K;

    /* JADX INFO: renamed from: L */
    private int f281L;

    /* JADX INFO: renamed from: M */
    private int f282M;

    /* JADX INFO: renamed from: N */
    private int f283N;

    /* JADX INFO: renamed from: O */
    private int f284O;

    /* JADX INFO: renamed from: P */
    private boolean f285P;

    /* JADX INFO: renamed from: Q */
    private C0179h f286Q;

    /* JADX INFO: renamed from: R */
    private C0179h f287R;

    /* JADX INFO: renamed from: S */
    private boolean f288S;

    /* JADX INFO: renamed from: T */
    private boolean f289T;

    /* JADX INFO: renamed from: U */
    private boolean f290U;

    /* JADX INFO: renamed from: V */
    private int f291V;

    /* JADX INFO: renamed from: W */
    private InterfaceC0138cc f292W;

    /* JADX INFO: renamed from: Z */
    private InterfaceC0138cc f293Z;

    /* JADX INFO: renamed from: aa */
    private InterfaceC0137cb f294aa;

    /* JADX INFO: renamed from: ab */
    private InterfaceC0139cd f295ab;

    /* JADX INFO: renamed from: ac */
    private Method f296ac;

    /* JADX INFO: renamed from: ad */
    private int f297ad;

    /* JADX INFO: renamed from: ae */
    private ArrayList f298ae;

    /* JADX INFO: renamed from: ag */
    private final Runnable f299ag;

    /* JADX INFO: renamed from: ah */
    private int f300ah;

    /* JADX INFO: renamed from: b */
    private int f301b;

    /* JADX INFO: renamed from: e */
    private final ArrayList f302e;

    /* JADX INFO: renamed from: f */
    private final C0134bz f303f;

    /* JADX INFO: renamed from: g */
    private final Rect f304g;

    /* JADX INFO: renamed from: h */
    private AbstractC0086ae f305h;

    /* JADX INFO: renamed from: i */
    private int f306i;

    /* JADX INFO: renamed from: j */
    private int f307j;

    /* JADX INFO: renamed from: k */
    private Parcelable f308k;

    /* JADX INFO: renamed from: l */
    private ClassLoader f309l;

    /* JADX INFO: renamed from: m */
    private Scroller f310m;

    /* JADX INFO: renamed from: n */
    private C0140ce f311n;

    /* JADX INFO: renamed from: o */
    private int f312o;

    /* JADX INFO: renamed from: p */
    private Drawable f313p;

    /* JADX INFO: renamed from: q */
    private int f314q;

    /* JADX INFO: renamed from: r */
    private int f315r;

    /* JADX INFO: renamed from: s */
    private float f316s;

    /* JADX INFO: renamed from: t */
    private float f317t;

    /* JADX INFO: renamed from: u */
    private int f318u;

    /* JADX INFO: renamed from: v */
    private int f319v;

    /* JADX INFO: renamed from: w */
    private boolean f320w;

    /* JADX INFO: renamed from: x */
    private boolean f321x;

    /* JADX INFO: renamed from: y */
    private boolean f322y;

    /* JADX INFO: renamed from: z */
    private int f323z;

    /* JADX INFO: renamed from: a */
    private static final int[] f266a = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: c */
    private static final Comparator f268c = new C0130bv();

    /* JADX INFO: renamed from: d */
    private static final Interpolator f269d = new InterpolatorC0131bw();

    /* JADX INFO: renamed from: af */
    private static final C0142cg f267af = new C0142cg();

    public class LayoutParams extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a */
        public boolean f324a;

        /* JADX INFO: renamed from: b */
        public int f325b;

        /* JADX INFO: renamed from: c */
        float f326c;

        /* JADX INFO: renamed from: d */
        boolean f327d;

        /* JADX INFO: renamed from: e */
        int f328e;

        /* JADX INFO: renamed from: f */
        int f329f;

        public LayoutParams() {
            super(-1, -1);
            this.f326c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f326c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f266a);
            this.f325b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = C0000a.m0a(new C0141cf());

        /* JADX INFO: renamed from: a */
        int f330a;

        /* JADX INFO: renamed from: b */
        Parcelable f331b;

        /* JADX INFO: renamed from: c */
        ClassLoader f332c;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f330a = parcel.readInt();
            this.f331b = parcel.readParcelable(classLoader);
            this.f332c = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f330a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f330a);
            parcel.writeParcelable(this.f331b, i);
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f302e = new ArrayList();
        this.f303f = new C0134bz();
        this.f304g = new Rect();
        this.f307j = -1;
        this.f308k = null;
        this.f309l = null;
        this.f316s = -3.4028235E38f;
        this.f317t = Float.MAX_VALUE;
        this.f323z = 1;
        this.f279J = -1;
        this.f288S = true;
        this.f289T = false;
        this.f299ag = new RunnableC0132bx(this);
        this.f300ah = 0;
        m276a();
    }

    /* JADX INFO: renamed from: a */
    private int m252a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f283N || Math.abs(i2) <= this.f281L) {
            i = (int) ((i >= this.f306i ? 0.4f : 0.6f) + i + f);
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f302e.size() > 0) {
            return Math.max(((C0134bz) this.f302e.get(0)).f360b, Math.min(i, ((C0134bz) this.f302e.get(this.f302e.size() - 1)).f360b));
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private Rect m253a(Rect rect, View view) {
        Rect rect2 = rect == null ? new Rect() : rect;
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    /* JADX INFO: renamed from: a */
    private void m255a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f302e.isEmpty()) {
            C0134bz c0134bzM285b = m285b(this.f306i);
            int iMin = (int) ((c0134bzM285b != null ? Math.min(c0134bzM285b.f363e, this.f317t) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (iMin != getScrollX()) {
                m260a(false);
                scrollTo(iMin, getScrollY());
                return;
            }
            return;
        }
        int paddingLeft = (int) ((((i - getPaddingLeft()) - getPaddingRight()) + i3) * (getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)));
        scrollTo(paddingLeft, getScrollY());
        if (this.f310m.isFinished()) {
            return;
        }
        this.f310m.startScroll(paddingLeft, 0, (int) (m285b(this.f306i).f363e * i), 0, this.f310m.getDuration() - this.f310m.timePassed());
    }

    /* JADX INFO: renamed from: a */
    private void m256a(int i, boolean z, int i2, boolean z2) {
        int iMax;
        C0134bz c0134bzM285b = m285b(i);
        if (c0134bzM285b != null) {
            iMax = (int) (Math.max(this.f316s, Math.min(c0134bzM285b.f363e, this.f317t)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (z) {
            m279a(iMax, 0, i2);
            if (z2 && this.f292W != null) {
                this.f292W.mo490a(i);
            }
            if (!z2 || this.f293Z == null) {
                return;
            }
            this.f293Z.mo490a(i);
            return;
        }
        if (z2 && this.f292W != null) {
            this.f292W.mo490a(i);
        }
        if (z2 && this.f293Z != null) {
            this.f293Z.mo490a(i);
        }
        m260a(false);
        scrollTo(iMax, 0);
        m266d(iMax);
    }

    /* JADX INFO: renamed from: a */
    private void m258a(C0134bz c0134bz, int i, C0134bz c0134bz2) {
        C0134bz c0134bz3;
        C0134bz c0134bz4;
        int iM471a = this.f305h.m471a();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.f312o / clientWidth : 0.0f;
        if (c0134bz2 != null) {
            int i2 = c0134bz2.f360b;
            if (i2 < c0134bz.f360b) {
                float fM483b = c0134bz2.f363e + c0134bz2.f362d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= c0134bz.f360b && i4 < this.f302e.size()) {
                    Object obj = this.f302e.get(i4);
                    while (true) {
                        c0134bz4 = (C0134bz) obj;
                        if (i3 <= c0134bz4.f360b || i4 >= this.f302e.size() - 1) {
                            break;
                        }
                        i4++;
                        obj = this.f302e.get(i4);
                    }
                    while (i3 < c0134bz4.f360b) {
                        fM483b += this.f305h.m483b(i3) + f;
                        i3++;
                    }
                    c0134bz4.f363e = fM483b;
                    fM483b += c0134bz4.f362d + f;
                    i3++;
                }
            } else if (i2 > c0134bz.f360b) {
                int size = this.f302e.size() - 1;
                float fM483b2 = c0134bz2.f363e;
                int i5 = i2 - 1;
                while (i5 >= c0134bz.f360b && size >= 0) {
                    Object obj2 = this.f302e.get(size);
                    while (true) {
                        c0134bz3 = (C0134bz) obj2;
                        if (i5 >= c0134bz3.f360b || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = this.f302e.get(size);
                    }
                    while (i5 > c0134bz3.f360b) {
                        fM483b2 -= this.f305h.m483b(i5) + f;
                        i5--;
                    }
                    fM483b2 -= c0134bz3.f362d + f;
                    c0134bz3.f363e = fM483b2;
                    i5--;
                }
            }
        }
        int size2 = this.f302e.size();
        float f2 = c0134bz.f363e;
        int i6 = c0134bz.f360b - 1;
        this.f316s = c0134bz.f360b == 0 ? c0134bz.f363e : -3.4028235E38f;
        this.f317t = c0134bz.f360b == iM471a + (-1) ? (c0134bz.f363e + c0134bz.f362d) - 1.0f : Float.MAX_VALUE;
        for (int i7 = i - 1; i7 >= 0; i7--) {
            C0134bz c0134bz5 = (C0134bz) this.f302e.get(i7);
            float fM483b3 = f2;
            while (i6 > c0134bz5.f360b) {
                fM483b3 -= this.f305h.m483b(i6) + f;
                i6--;
            }
            f2 = fM483b3 - (c0134bz5.f362d + f);
            c0134bz5.f363e = f2;
            if (c0134bz5.f360b == 0) {
                this.f316s = f2;
            }
            i6--;
        }
        float f3 = c0134bz.f363e + c0134bz.f362d + f;
        int i8 = c0134bz.f360b + 1;
        for (int i9 = i + 1; i9 < size2; i9++) {
            C0134bz c0134bz6 = (C0134bz) this.f302e.get(i9);
            float fM483b4 = f3;
            while (i8 < c0134bz6.f360b) {
                fM483b4 = this.f305h.m483b(i8) + f + fM483b4;
                i8++;
            }
            if (c0134bz6.f360b == iM471a - 1) {
                this.f317t = (c0134bz6.f362d + fM483b4) - 1.0f;
            }
            c0134bz6.f363e = fM483b4;
            f3 = fM483b4 + c0134bz6.f362d + f;
            i8++;
        }
        this.f289T = false;
    }

    /* JADX INFO: renamed from: a */
    private void m259a(MotionEvent motionEvent) {
        int iM614b = C0165z.m614b(motionEvent);
        if (C0165z.m615b(motionEvent, iM614b) == this.f279J) {
            int i = iM614b == 0 ? 1 : 0;
            this.f275F = C0165z.m616c(motionEvent, i);
            this.f279J = C0165z.m615b(motionEvent, i);
            if (this.f280K != null) {
                this.f280K.clear();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m260a(boolean z) {
        boolean z2 = this.f300ah == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            this.f310m.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f310m.getCurrX();
            int currY = this.f310m.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        this.f322y = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f302e.size(); i++) {
            C0134bz c0134bz = (C0134bz) this.f302e.get(i);
            if (c0134bz.f361c) {
                c0134bz.f361c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                C0101at.m507a(this, this.f299ag);
            } else {
                this.f299ag.run();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m261a(float f, float f2) {
        return (f < ((float) this.f273D) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f273D)) && f2 < 0.0f);
    }

    /* JADX INFO: renamed from: b */
    private void m263b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0101at.m504a(getChildAt(i), z ? 2 : 0, null);
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m264b(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        boolean zM749a = false;
        float f3 = this.f275F - f;
        this.f275F = f;
        float scrollX = getScrollX() + f3;
        int clientWidth = getClientWidth();
        float f4 = clientWidth * this.f316s;
        float f5 = clientWidth * this.f317t;
        C0134bz c0134bz = (C0134bz) this.f302e.get(0);
        C0134bz c0134bz2 = (C0134bz) this.f302e.get(this.f302e.size() - 1);
        if (c0134bz.f360b != 0) {
            f4 = c0134bz.f363e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c0134bz2.f360b != this.f305h.m471a() - 1) {
            f2 = c0134bz2.f363e * clientWidth;
            z2 = false;
        } else {
            f2 = f5;
        }
        if (scrollX < f4) {
            if (z) {
                zM749a = this.f286Q.m749a(Math.abs(f4 - scrollX) / clientWidth);
            }
        } else if (scrollX > f2) {
            zM749a = z2 ? this.f287R.m749a(Math.abs(scrollX - f2) / clientWidth) : false;
            f4 = f2;
        } else {
            f4 = scrollX;
        }
        this.f275F += f4 - ((int) f4);
        scrollTo((int) f4, getScrollY());
        m266d((int) f4);
        return zM749a;
    }

    /* JADX INFO: renamed from: c */
    private void m265c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m266d(int i) {
        if (this.f302e.size() == 0) {
            this.f290U = false;
            m278a(0, 0.0f, 0);
            if (this.f290U) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C0134bz c0134bzM270i = m270i();
        int clientWidth = getClientWidth();
        int i2 = this.f312o + clientWidth;
        float f = this.f312o / clientWidth;
        int i3 = c0134bzM270i.f360b;
        float f2 = ((i / clientWidth) - c0134bzM270i.f363e) / (c0134bzM270i.f362d + f);
        this.f290U = false;
        m278a(i3, f2, (int) (i2 * f2));
        if (this.f290U) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX INFO: renamed from: g */
    private void m268g() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= getChildCount()) {
                return;
            }
            if (!((LayoutParams) getChildAt(i2).getLayoutParams()).f324a) {
                removeViewAt(i2);
                i2--;
            }
            i = i2 + 1;
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: h */
    private void m269h() {
        if (this.f297ad != 0) {
            if (this.f298ae == null) {
                this.f298ae = new ArrayList();
            } else {
                this.f298ae.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f298ae.add(getChildAt(i));
            }
            Collections.sort(this.f298ae, f267af);
        }
    }

    /* JADX INFO: renamed from: i */
    private C0134bz m270i() {
        int i;
        C0134bz c0134bz;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f = clientWidth > 0 ? this.f312o / clientWidth : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        C0134bz c0134bz2 = null;
        while (i3 < this.f302e.size()) {
            C0134bz c0134bz3 = (C0134bz) this.f302e.get(i3);
            if (z || c0134bz3.f360b == i2 + 1) {
                i = i3;
                c0134bz = c0134bz3;
            } else {
                C0134bz c0134bz4 = this.f303f;
                c0134bz4.f363e = f2 + f3 + f;
                c0134bz4.f360b = i2 + 1;
                c0134bz4.f362d = this.f305h.m483b(c0134bz4.f360b);
                i = i3 - 1;
                c0134bz = c0134bz4;
            }
            float f4 = c0134bz.f363e;
            float f5 = c0134bz.f362d + f4 + f;
            if (!z && scrollX < f4) {
                return c0134bz2;
            }
            if (scrollX < f5 || i == this.f302e.size() - 1) {
                return c0134bz;
            }
            f3 = f4;
            i2 = c0134bz.f360b;
            z = false;
            f2 = c0134bz.f362d;
            c0134bz2 = c0134bz;
            i3 = i + 1;
        }
        return c0134bz2;
    }

    /* JADX INFO: renamed from: j */
    private void m271j() {
        this.f270A = false;
        this.f271B = false;
        if (this.f280K != null) {
            this.f280K.recycle();
            this.f280K = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int i) {
        if (this.f300ah == i) {
            return;
        }
        this.f300ah = i;
        if (this.f295ab != null) {
            m263b(i != 0);
        }
        if (this.f292W != null) {
            this.f292W.mo493b(i);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f321x != z) {
            this.f321x = z;
        }
    }

    /* JADX INFO: renamed from: a */
    float m272a(float f) {
        return (float) Math.sin((float) (((double) (f - 0.5f)) * 0.4712389167638204d));
    }

    /* JADX INFO: renamed from: a */
    C0134bz m273a(int i, int i2) {
        C0134bz c0134bz = new C0134bz();
        c0134bz.f360b = i;
        c0134bz.f359a = this.f305h.m475a((ViewGroup) this, i);
        c0134bz.f362d = this.f305h.m483b(i);
        if (i2 < 0 || i2 >= this.f302e.size()) {
            this.f302e.add(c0134bz);
        } else {
            this.f302e.add(i2, c0134bz);
        }
        return c0134bz;
    }

    /* JADX INFO: renamed from: a */
    C0134bz m274a(View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f302e.size()) {
                return null;
            }
            C0134bz c0134bz = (C0134bz) this.f302e.get(i2);
            if (this.f305h.m482a(view, c0134bz.f359a)) {
                return c0134bz;
            }
            i = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    InterfaceC0138cc m275a(InterfaceC0138cc interfaceC0138cc) {
        InterfaceC0138cc interfaceC0138cc2 = this.f293Z;
        this.f293Z = interfaceC0138cc;
        return interfaceC0138cc2;
    }

    /* JADX INFO: renamed from: a */
    void m276a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f310m = new Scroller(context, f269d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f274E = C0118bj.m555a(viewConfiguration);
        this.f281L = (int) (400.0f * f);
        this.f282M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f286Q = new C0179h(context);
        this.f287R = new C0179h(context);
        this.f283N = (int) (25.0f * f);
        this.f284O = (int) (2.0f * f);
        this.f272C = (int) (16.0f * f);
        C0101at.m506a(this, new C0136ca(this));
        if (C0101at.m511c(this) == 0) {
            C0101at.m510b(this, 1);
        }
    }

    /* JADX INFO: renamed from: a */
    void m277a(int i) {
        C0134bz c0134bz;
        int i2;
        String hexString;
        int i3;
        C0134bz c0134bz2;
        C0134bz c0134bzM274a;
        if (this.f306i != i) {
            int i4 = this.f306i < i ? 66 : 17;
            C0134bz c0134bzM285b = m285b(this.f306i);
            this.f306i = i;
            c0134bz = c0134bzM285b;
            i2 = i4;
        } else {
            c0134bz = null;
            i2 = 2;
        }
        if (this.f305h == null) {
            m269h();
            return;
        }
        if (this.f322y) {
            m269h();
            return;
        }
        if (getWindowToken() != null) {
            this.f305h.m480a((ViewGroup) this);
            int i5 = this.f323z;
            int iMax = Math.max(0, this.f306i - i5);
            int iM471a = this.f305h.m471a();
            int iMin = Math.min(iM471a - 1, i5 + this.f306i);
            if (iM471a != this.f301b) {
                try {
                    hexString = getResources().getResourceName(getId());
                } catch (Resources.NotFoundException e) {
                    hexString = Integer.toHexString(getId());
                }
                throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f301b + ", found: " + iM471a + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f305h.getClass());
            }
            int i6 = 0;
            while (true) {
                i3 = i6;
                if (i3 < this.f302e.size()) {
                    c0134bz2 = (C0134bz) this.f302e.get(i3);
                    if (c0134bz2.f360b >= this.f306i) {
                        if (c0134bz2.f360b != this.f306i) {
                            break;
                        } else {
                            break;
                        }
                    }
                    i6 = i3 + 1;
                }
                c0134bz2 = null;
                break;
            }
            C0134bz c0134bzM273a = (c0134bz2 != null || iM471a <= 0) ? c0134bz2 : m273a(this.f306i, i3);
            if (c0134bzM273a != null) {
                int i7 = i3 - 1;
                C0134bz c0134bz3 = i7 >= 0 ? (C0134bz) this.f302e.get(i7) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - c0134bzM273a.f362d) + (getPaddingLeft() / clientWidth);
                float f = 0.0f;
                int i8 = i3;
                int i9 = i7;
                for (int i10 = this.f306i - 1; i10 >= 0; i10--) {
                    if (f >= paddingLeft && i10 < iMax) {
                        if (c0134bz3 == null) {
                            break;
                        }
                        if (i10 == c0134bz3.f360b && !c0134bz3.f361c) {
                            this.f302e.remove(i9);
                            this.f305h.m481a((ViewGroup) this, i10, c0134bz3.f359a);
                            i9--;
                            i8--;
                            c0134bz3 = i9 >= 0 ? (C0134bz) this.f302e.get(i9) : null;
                        }
                    } else if (c0134bz3 == null || i10 != c0134bz3.f360b) {
                        f += m273a(i10, i9 + 1).f362d;
                        i8++;
                        c0134bz3 = i9 >= 0 ? (C0134bz) this.f302e.get(i9) : null;
                    } else {
                        f += c0134bz3.f362d;
                        i9--;
                        c0134bz3 = i9 >= 0 ? (C0134bz) this.f302e.get(i9) : null;
                    }
                }
                float f2 = c0134bzM273a.f362d;
                int i11 = i8 + 1;
                if (f2 < 2.0f) {
                    C0134bz c0134bz4 = i11 < this.f302e.size() ? (C0134bz) this.f302e.get(i11) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                    C0134bz c0134bz5 = c0134bz4;
                    int i12 = i11;
                    int i13 = this.f306i + 1;
                    while (i13 < iM471a) {
                        if (f2 >= paddingRight && i13 > iMin) {
                            if (c0134bz5 == null) {
                                break;
                            }
                            if (i13 == c0134bz5.f360b && !c0134bz5.f361c) {
                                this.f302e.remove(i12);
                                this.f305h.m481a((ViewGroup) this, i13, c0134bz5.f359a);
                                c0134bz5 = i12 < this.f302e.size() ? (C0134bz) this.f302e.get(i12) : null;
                            }
                        } else if (c0134bz5 == null || i13 != c0134bz5.f360b) {
                            C0134bz c0134bzM273a2 = m273a(i13, i12);
                            i12++;
                            f2 += c0134bzM273a2.f362d;
                            c0134bz5 = i12 < this.f302e.size() ? (C0134bz) this.f302e.get(i12) : null;
                        } else {
                            f2 += c0134bz5.f362d;
                            i12++;
                            c0134bz5 = i12 < this.f302e.size() ? (C0134bz) this.f302e.get(i12) : null;
                        }
                        i13++;
                        c0134bz5 = c0134bz5;
                        f2 = f2;
                    }
                }
                m258a(c0134bzM273a, i8, c0134bz);
            }
            this.f305h.m489b((ViewGroup) this, this.f306i, c0134bzM273a != null ? c0134bzM273a.f359a : null);
            this.f305h.m488b((ViewGroup) this);
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f329f = i14;
                if (!layoutParams.f324a && layoutParams.f326c == 0.0f && (c0134bzM274a = m274a(childAt)) != null) {
                    layoutParams.f326c = c0134bzM274a.f362d;
                    layoutParams.f328e = c0134bzM274a.f360b;
                }
            }
            m269h();
            if (hasFocus()) {
                View viewFindFocus = findFocus();
                C0134bz c0134bzM286b = viewFindFocus != null ? m286b(viewFindFocus) : null;
                if (c0134bzM286b == null || c0134bzM286b.f360b != this.f306i) {
                    for (int i15 = 0; i15 < getChildCount(); i15++) {
                        View childAt2 = getChildAt(i15);
                        C0134bz c0134bzM274a2 = m274a(childAt2);
                        if (c0134bzM274a2 != null && c0134bzM274a2.f360b == this.f306i && childAt2.requestFocus(i2)) {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected void m278a(int i, float f, int i2) {
        int measuredWidth;
        int i3;
        int i4;
        if (this.f291V > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i5 = 0;
            while (i5 < childCount) {
                View childAt = getChildAt(i5);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f324a) {
                    switch (layoutParams.f325b & 7) {
                        case C0467e.MapAttrs_cameraBearing /* 1 */:
                            measuredWidth = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            int i6 = paddingRight;
                            i3 = paddingLeft;
                            i4 = i6;
                            break;
                        case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                        case C0467e.MapAttrs_cameraTilt /* 4 */:
                        default:
                            measuredWidth = paddingLeft;
                            int i7 = paddingRight;
                            i3 = paddingLeft;
                            i4 = i7;
                            break;
                        case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                            int width2 = childAt.getWidth() + paddingLeft;
                            int i8 = paddingLeft;
                            i4 = paddingRight;
                            i3 = width2;
                            measuredWidth = i8;
                            break;
                        case C0467e.MapAttrs_cameraZoom /* 5 */:
                            measuredWidth = (width - paddingRight) - childAt.getMeasuredWidth();
                            int measuredWidth2 = paddingRight + childAt.getMeasuredWidth();
                            i3 = paddingLeft;
                            i4 = measuredWidth2;
                            break;
                    }
                    int left = (measuredWidth + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                } else {
                    int i9 = paddingRight;
                    i3 = paddingLeft;
                    i4 = i9;
                }
                i5++;
                int i10 = i4;
                paddingLeft = i3;
                paddingRight = i10;
            }
        }
        if (this.f292W != null) {
            this.f292W.mo491a(i, f, i2);
        }
        if (this.f293Z != null) {
            this.f293Z.mo491a(i, f, i2);
        }
        if (this.f295ab != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = getChildAt(i11);
                if (!((LayoutParams) childAt2.getLayoutParams()).f324a) {
                    this.f295ab.m570a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.f290U = true;
    }

    /* JADX INFO: renamed from: a */
    void m279a(int i, int i2, int i3) {
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            m260a(false);
            m288c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float fM272a = (i6 * m272a(Math.min(1.0f, (Math.abs(i4) * 1.0f) / clientWidth))) + i6;
        int iAbs2 = Math.abs(i3);
        if (iAbs2 > 0) {
            iAbs = Math.round(1000.0f * Math.abs(fM272a / iAbs2)) * 4;
        } else {
            iAbs = (int) (((Math.abs(i4) / ((clientWidth * this.f305h.m483b(this.f306i)) + this.f312o)) + 1.0f) * 100.0f);
        }
        this.f310m.startScroll(scrollX, scrollY, i4, i5, Math.min(iAbs, 600));
        C0101at.m509b(this);
    }

    /* JADX INFO: renamed from: a */
    public void m280a(int i, boolean z) {
        this.f322y = false;
        m281a(i, z, false);
    }

    /* JADX INFO: renamed from: a */
    void m281a(int i, boolean z, boolean z2) {
        m282a(i, z, z2, 0);
    }

    /* JADX INFO: renamed from: a */
    void m282a(int i, boolean z, boolean z2, int i2) {
        if (this.f305h == null || this.f305h.m471a() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f306i == i && this.f302e.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.f305h.m471a()) {
            i = this.f305h.m471a() - 1;
        }
        int i3 = this.f323z;
        if (i > this.f306i + i3 || i < this.f306i - i3) {
            for (int i4 = 0; i4 < this.f302e.size(); i4++) {
                ((C0134bz) this.f302e.get(i4)).f361c = true;
            }
        }
        boolean z3 = this.f306i != i;
        if (!this.f288S) {
            m277a(i);
            m256a(i, z, i2, z3);
            return;
        }
        this.f306i = i;
        if (z3 && this.f292W != null) {
            this.f292W.mo490a(i);
        }
        if (z3 && this.f293Z != null) {
            this.f293Z.mo490a(i);
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: a */
    public boolean m283a(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                return m289c(17);
            case 22:
                return m289c(66);
            case 61:
                if (Build.VERSION.SDK_INT < 11) {
                    return false;
                }
                if (C0158s.m600a(keyEvent)) {
                    return m289c(2);
                }
                if (C0158s.m601a(keyEvent, 1)) {
                    return m289c(1);
                }
                return false;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: a */
    protected boolean m284a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom() && m284a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && C0101at.m508a(view, -i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        C0134bz c0134bzM274a;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c0134bzM274a = m274a(childAt)) != null && c0134bzM274a.f360b == this.f306i) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        C0134bz c0134bzM274a;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c0134bzM274a = m274a(childAt)) != null && c0134bzM274a.f360b == this.f306i) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParamsGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        LayoutParams layoutParams2 = (LayoutParams) layoutParamsGenerateLayoutParams;
        layoutParams2.f324a |= view instanceof InterfaceC0133by;
        if (!this.f320w) {
            super.addView(view, i, layoutParamsGenerateLayoutParams);
        } else {
            if (layoutParams2 != null && layoutParams2.f324a) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f327d = true;
            addViewInLayout(view, i, layoutParamsGenerateLayoutParams);
        }
    }

    /* JADX INFO: renamed from: b */
    C0134bz m285b(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f302e.size()) {
                return null;
            }
            C0134bz c0134bz = (C0134bz) this.f302e.get(i3);
            if (c0134bz.f360b == i) {
                return c0134bz;
            }
            i2 = i3 + 1;
        }
    }

    /* JADX INFO: renamed from: b */
    C0134bz m286b(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return m274a(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* JADX INFO: renamed from: b */
    void m287b() {
        int i;
        boolean z;
        int iMax;
        boolean z2;
        int iM471a = this.f305h.m471a();
        this.f301b = iM471a;
        boolean z3 = this.f302e.size() < (this.f323z * 2) + 1 && this.f302e.size() < iM471a;
        boolean z4 = false;
        int i2 = this.f306i;
        boolean z5 = z3;
        int i3 = 0;
        while (i3 < this.f302e.size()) {
            C0134bz c0134bz = (C0134bz) this.f302e.get(i3);
            int iM472a = this.f305h.m472a(c0134bz.f359a);
            if (iM472a == -1) {
                i = i3;
                z = z4;
                iMax = i2;
                z2 = z5;
            } else if (iM472a == -2) {
                this.f302e.remove(i3);
                int i4 = i3 - 1;
                if (!z4) {
                    this.f305h.m480a((ViewGroup) this);
                    z4 = true;
                }
                this.f305h.m481a((ViewGroup) this, c0134bz.f360b, c0134bz.f359a);
                if (this.f306i == c0134bz.f360b) {
                    i = i4;
                    z = z4;
                    iMax = Math.max(0, Math.min(this.f306i, iM471a - 1));
                    z2 = true;
                } else {
                    i = i4;
                    z = z4;
                    iMax = i2;
                    z2 = true;
                }
            } else if (c0134bz.f360b != iM472a) {
                if (c0134bz.f360b == this.f306i) {
                    i2 = iM472a;
                }
                c0134bz.f360b = iM472a;
                i = i3;
                z = z4;
                iMax = i2;
                z2 = true;
            } else {
                i = i3;
                z = z4;
                iMax = i2;
                z2 = z5;
            }
            z5 = z2;
            i2 = iMax;
            z4 = z;
            i3 = i + 1;
        }
        if (z4) {
            this.f305h.m488b((ViewGroup) this);
        }
        Collections.sort(this.f302e, f268c);
        if (z5) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.f324a) {
                    layoutParams.f326c = 0.0f;
                }
            }
            m281a(i2, false, true);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: c */
    void m288c() {
        m277a(this.f306i);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00db  */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX INFO: renamed from: c */
    public boolean m289c(int i) {
        View view;
        boolean z;
        boolean zM290d;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            view = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z = false;
                    break;
                }
                if (parent == this) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (z) {
                view = viewFindFocus;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ").append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                view = null;
            }
        } else {
            view = viewFindFocus;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (viewFindNextFocus == null || viewFindNextFocus == view) {
            if (i == 17 || i == 1) {
                zM290d = m290d();
            } else if (i == 66 || i == 2) {
                zM290d = m291e();
            } else {
                zM290d = false;
            }
        } else if (i == 17) {
            zM290d = (view == null || m253a(this.f304g, viewFindNextFocus).left < m253a(this.f304g, view).left) ? viewFindNextFocus.requestFocus() : m290d();
        } else if (i == 66) {
            zM290d = (view == null || m253a(this.f304g, viewFindNextFocus).left > m253a(this.f304g, view).left) ? viewFindNextFocus.requestFocus() : m291e();
        } else {
            zM290d = false;
        }
        if (zM290d) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zM290d;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.f305h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.f316s));
        }
        if (i > 0) {
            return scrollX < ((int) (((float) clientWidth) * this.f317t));
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f310m.isFinished() || !this.f310m.computeScrollOffset()) {
            m260a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f310m.getCurrX();
        int currY = this.f310m.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m266d(currX)) {
                this.f310m.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0101at.m509b(this);
    }

    /* JADX INFO: renamed from: d */
    boolean m290d() {
        if (this.f306i <= 0) {
            return false;
        }
        m280a(this.f306i - 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m283a(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0134bz c0134bzM274a;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c0134bzM274a = m274a(childAt)) != null && c0134bzM274a.f360b == this.f306i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean zM750a = false;
        int iM502a = C0101at.m502a(this);
        if (iM502a == 0 || (iM502a == 1 && this.f305h != null && this.f305h.m471a() > 1)) {
            if (!this.f286Q.m748a()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f316s * width);
                this.f286Q.m747a(height, width);
                zM750a = false | this.f286Q.m750a(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f287R.m748a()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f317t + 1.0f)) * width2);
                this.f287R.m747a(height2, width2);
                zM750a |= this.f287R.m750a(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f286Q.m751b();
            this.f287R.m751b();
        }
        if (zM750a) {
            C0101at.m509b(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f313p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* JADX INFO: renamed from: e */
    boolean m291e() {
        if (this.f305h == null || this.f306i >= this.f305h.m471a() - 1) {
            return false;
        }
        m280a(this.f306i + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC0086ae getAdapter() {
        return this.f305h;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.f297ad == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.f298ae.get(i2)).getLayoutParams()).f329f;
    }

    public int getCurrentItem() {
        return this.f306i;
    }

    public int getOffscreenPageLimit() {
        return this.f323z;
    }

    public int getPageMargin() {
        return this.f312o;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f288S = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f299ag);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.f312o <= 0 || this.f313p == null || this.f302e.size() <= 0 || this.f305h == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f2 = this.f312o / width;
        C0134bz c0134bz = (C0134bz) this.f302e.get(0);
        float f3 = c0134bz.f363e;
        int size = this.f302e.size();
        int i = c0134bz.f360b;
        int i2 = ((C0134bz) this.f302e.get(size - 1)).f360b;
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            while (i4 > c0134bz.f360b && i3 < size) {
                i3++;
                c0134bz = (C0134bz) this.f302e.get(i3);
            }
            if (i4 == c0134bz.f360b) {
                f = (c0134bz.f363e + c0134bz.f362d) * width;
                f3 = c0134bz.f363e + c0134bz.f362d + f2;
            } else {
                float fM483b = this.f305h.m483b(i4);
                f = (f3 + fM483b) * width;
                f3 += fM483b + f2;
            }
            if (this.f312o + f > scrollX) {
                this.f313p.setBounds((int) f, this.f314q, (int) (this.f312o + f + 0.5f), this.f315r);
                this.f313p.draw(canvas);
            }
            if (f > scrollX + width) {
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f270A = false;
            this.f271B = false;
            this.f279J = -1;
            if (this.f280K == null) {
                return false;
            }
            this.f280K.recycle();
            this.f280K = null;
            return false;
        }
        if (action != 0) {
            if (this.f270A) {
                return true;
            }
            if (this.f271B) {
                return false;
            }
        }
        switch (action) {
            case C0467e.MapAttrs_mapType /* 0 */:
                float x = motionEvent.getX();
                this.f277H = x;
                this.f275F = x;
                float y = motionEvent.getY();
                this.f278I = y;
                this.f276G = y;
                this.f279J = C0165z.m615b(motionEvent, 0);
                this.f271B = false;
                this.f310m.computeScrollOffset();
                if (this.f300ah == 2 && Math.abs(this.f310m.getFinalX() - this.f310m.getCurrX()) > this.f284O) {
                    this.f310m.abortAnimation();
                    this.f322y = false;
                    m288c();
                    this.f270A = true;
                    m265c(true);
                    setScrollState(1);
                } else {
                    m260a(false);
                    this.f270A = false;
                }
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                int i = this.f279J;
                if (i != -1) {
                    int iM613a = C0165z.m613a(motionEvent, i);
                    float fM616c = C0165z.m616c(motionEvent, iM613a);
                    float f = fM616c - this.f275F;
                    float fAbs = Math.abs(f);
                    float fM618d = C0165z.m618d(motionEvent, iM613a);
                    float fAbs2 = Math.abs(fM618d - this.f278I);
                    if (f != 0.0f && !m261a(this.f275F, f) && m284a(this, false, (int) f, (int) fM616c, (int) fM618d)) {
                        this.f275F = fM616c;
                        this.f276G = fM618d;
                        this.f271B = true;
                        return false;
                    }
                    if (fAbs > this.f274E && 0.5f * fAbs > fAbs2) {
                        this.f270A = true;
                        m265c(true);
                        setScrollState(1);
                        this.f275F = f > 0.0f ? this.f277H + this.f274E : this.f277H - this.f274E;
                        this.f276G = fM618d;
                        setScrollingCacheEnabled(true);
                    } else if (fAbs2 > this.f274E) {
                        this.f271B = true;
                    }
                    if (this.f270A && m264b(fM616c)) {
                        C0101at.m509b(this);
                    }
                }
                break;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                m259a(motionEvent);
                break;
        }
        if (this.f280K == null) {
            this.f280K = VelocityTracker.obtain();
        }
        this.f280K.addMovement(motionEvent);
        return this.f270A;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0141  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0134bz c0134bzM274a;
        int i5;
        int i6;
        int iMax;
        int measuredHeight;
        int i7;
        int i8;
        int childCount = getChildCount();
        int i9 = i3 - i;
        int i10 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i11 = 0;
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f324a) {
                    int i13 = layoutParams.f325b & 7;
                    int i14 = layoutParams.f325b & 112;
                    switch (i13) {
                        case C0467e.MapAttrs_cameraBearing /* 1 */:
                            iMax = Math.max((i9 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                        case C0467e.MapAttrs_cameraTilt /* 4 */:
                        default:
                            iMax = paddingLeft;
                            break;
                        case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                            iMax = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case C0467e.MapAttrs_cameraZoom /* 5 */:
                            int measuredWidth = (i9 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            iMax = measuredWidth;
                            break;
                    }
                    switch (i14) {
                        case 16:
                            measuredHeight = Math.max((i10 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            int i15 = paddingBottom;
                            i7 = paddingTop;
                            i8 = i15;
                            break;
                        case 48:
                            int measuredHeight2 = childAt.getMeasuredHeight() + paddingTop;
                            int i16 = paddingTop;
                            i8 = paddingBottom;
                            i7 = measuredHeight2;
                            measuredHeight = i16;
                            break;
                        case 80:
                            measuredHeight = (i10 - paddingBottom) - childAt.getMeasuredHeight();
                            int measuredHeight3 = paddingBottom + childAt.getMeasuredHeight();
                            i7 = paddingTop;
                            i8 = measuredHeight3;
                            break;
                        default:
                            measuredHeight = paddingTop;
                            int i17 = paddingBottom;
                            i7 = paddingTop;
                            i8 = i17;
                            break;
                    }
                    int i18 = iMax + scrollX;
                    childAt.layout(i18, measuredHeight, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + measuredHeight);
                    i5 = i11 + 1;
                    i6 = i7;
                    paddingBottom = i8;
                } else {
                    i5 = i11;
                    i6 = paddingTop;
                }
            } else {
                i5 = i11;
                i6 = paddingTop;
            }
            i12++;
            paddingLeft = paddingLeft;
            paddingRight = paddingRight;
            paddingTop = i6;
            i11 = i5;
        }
        int i19 = (i9 - paddingLeft) - paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f324a && (c0134bzM274a = m274a(childAt2)) != null) {
                    int i21 = ((int) (c0134bzM274a.f363e * i19)) + paddingLeft;
                    if (layoutParams2.f327d) {
                        layoutParams2.f327d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (layoutParams2.f326c * i19), 1073741824), View.MeasureSpec.makeMeasureSpec((i10 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f314q = paddingTop;
        this.f315r = i10 - paddingBottom;
        this.f291V = i11;
        if (this.f288S) {
            m256a(this.f306i, false, 0, false);
        }
        this.f288S = false;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x010a A[PHI: r1
  0x010a: PHI (r1v18 int) = (r1v17 int), (r1v20 int) binds: [B:28:0x0088, B:30:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i3;
        int i4;
        int i5;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f273D = Math.min(measuredWidth / 10, this.f272C);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f324a) {
                int i7 = layoutParams2.f325b & 7;
                int i8 = layoutParams2.f325b & 112;
                int i9 = Integer.MIN_VALUE;
                int i10 = Integer.MIN_VALUE;
                boolean z = i8 == 48 || i8 == 80;
                boolean z2 = i7 == 3 || i7 == 5;
                if (z) {
                    i9 = 1073741824;
                } else if (z2) {
                    i10 = 1073741824;
                }
                if (layoutParams2.width != -2) {
                    i3 = 1073741824;
                    i4 = layoutParams2.width != -1 ? layoutParams2.width : paddingLeft;
                } else {
                    i3 = i9;
                    i4 = paddingLeft;
                }
                if (layoutParams2.height != -2) {
                    i10 = 1073741824;
                    if (layoutParams2.height != -1) {
                        i5 = layoutParams2.height;
                    } else {
                        i5 = measuredHeight;
                    }
                } else {
                    i5 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i3), View.MeasureSpec.makeMeasureSpec(i5, i10));
                if (z) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
        }
        this.f318u = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f319v = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f320w = true;
        m288c();
        this.f320w = false;
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f324a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (layoutParams.f326c * paddingLeft), 1073741824), this.f319v);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        C0134bz c0134bzM274a;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c0134bzM274a = m274a(childAt)) != null && c0134bzM274a.f360b == this.f306i && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.f305h != null) {
            this.f305h.m477a(savedState.f331b, savedState.f332c);
            m281a(savedState.f330a, false, true);
        } else {
            this.f307j = savedState.f330a;
            this.f308k = savedState.f331b;
            this.f309l = savedState.f332c;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f330a = this.f306i;
        if (this.f305h != null) {
            savedState.f331b = this.f305h.m484b();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m255a(i, i3, this.f312o, this.f312o);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM752c = false;
        if (this.f285P) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.f305h == null || this.f305h.m471a() == 0) {
            return false;
        }
        if (this.f280K == null) {
            this.f280K = VelocityTracker.obtain();
        }
        this.f280K.addMovement(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case C0467e.MapAttrs_mapType /* 0 */:
                this.f310m.abortAnimation();
                this.f322y = false;
                m288c();
                float x = motionEvent.getX();
                this.f277H = x;
                this.f275F = x;
                float y = motionEvent.getY();
                this.f278I = y;
                this.f276G = y;
                this.f279J = C0165z.m615b(motionEvent, 0);
                break;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                if (this.f270A) {
                    VelocityTracker velocityTracker = this.f280K;
                    velocityTracker.computeCurrentVelocity(1000, this.f282M);
                    int iM496a = (int) C0096ao.m496a(velocityTracker, this.f279J);
                    this.f322y = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    C0134bz c0134bzM270i = m270i();
                    m282a(m252a(c0134bzM270i.f360b, ((scrollX / clientWidth) - c0134bzM270i.f363e) / c0134bzM270i.f362d, iM496a, (int) (C0165z.m616c(motionEvent, C0165z.m613a(motionEvent, this.f279J)) - this.f277H)), true, true, iM496a);
                    this.f279J = -1;
                    m271j();
                    zM752c = this.f287R.m752c() | this.f286Q.m752c();
                }
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                if (!this.f270A) {
                    int iM613a = C0165z.m613a(motionEvent, this.f279J);
                    float fM616c = C0165z.m616c(motionEvent, iM613a);
                    float fAbs = Math.abs(fM616c - this.f275F);
                    float fM618d = C0165z.m618d(motionEvent, iM613a);
                    float fAbs2 = Math.abs(fM618d - this.f276G);
                    if (fAbs > this.f274E && fAbs > fAbs2) {
                        this.f270A = true;
                        m265c(true);
                        this.f275F = fM616c - this.f277H > 0.0f ? this.f277H + this.f274E : this.f277H - this.f274E;
                        this.f276G = fM618d;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.f270A) {
                    zM752c = false | m264b(C0165z.m616c(motionEvent, C0165z.m613a(motionEvent, this.f279J)));
                }
                break;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                if (this.f270A) {
                    m256a(this.f306i, true, 0, false);
                    this.f279J = -1;
                    m271j();
                    zM752c = this.f287R.m752c() | this.f286Q.m752c();
                }
                break;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                int iM614b = C0165z.m614b(motionEvent);
                this.f275F = C0165z.m616c(motionEvent, iM614b);
                this.f279J = C0165z.m615b(motionEvent, iM614b);
                break;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                m259a(motionEvent);
                this.f275F = C0165z.m616c(motionEvent, C0165z.m613a(motionEvent, this.f279J));
                break;
        }
        if (zM752c) {
            C0101at.m509b(this);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f320w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AbstractC0086ae abstractC0086ae) {
        if (this.f305h != null) {
            this.f305h.m485b(this.f311n);
            this.f305h.m480a((ViewGroup) this);
            for (int i = 0; i < this.f302e.size(); i++) {
                C0134bz c0134bz = (C0134bz) this.f302e.get(i);
                this.f305h.m481a((ViewGroup) this, c0134bz.f360b, c0134bz.f359a);
            }
            this.f305h.m488b((ViewGroup) this);
            this.f302e.clear();
            m268g();
            this.f306i = 0;
            scrollTo(0, 0);
        }
        AbstractC0086ae abstractC0086ae2 = this.f305h;
        this.f305h = abstractC0086ae;
        this.f301b = 0;
        if (this.f305h != null) {
            if (this.f311n == null) {
                this.f311n = new C0140ce(this, null);
            }
            this.f305h.m476a((DataSetObserver) this.f311n);
            this.f322y = false;
            boolean z = this.f288S;
            this.f288S = true;
            this.f301b = this.f305h.m471a();
            if (this.f307j >= 0) {
                this.f305h.m477a(this.f308k, this.f309l);
                m281a(this.f307j, false, true);
                this.f307j = -1;
                this.f308k = null;
                this.f309l = null;
            } else if (z) {
                requestLayout();
            } else {
                m288c();
            }
        }
        if (this.f294aa == null || abstractC0086ae2 == abstractC0086ae) {
            return;
        }
        this.f294aa.mo492a(abstractC0086ae2, abstractC0086ae);
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (Build.VERSION.SDK_INT >= 7) {
            if (this.f296ac == null) {
                try {
                    this.f296ac = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
                } catch (NoSuchMethodException e) {
                    Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e);
                }
            }
            try {
                this.f296ac.invoke(this, Boolean.valueOf(z));
            } catch (Exception e2) {
                Log.e("ViewPager", "Error changing children drawing order", e2);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f322y = false;
        m281a(i, !this.f288S, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f323z) {
            this.f323z = i;
            m288c();
        }
    }

    void setOnAdapterChangeListener(InterfaceC0137cb interfaceC0137cb) {
        this.f294aa = interfaceC0137cb;
    }

    public void setOnPageChangeListener(InterfaceC0138cc interfaceC0138cc) {
        this.f292W = interfaceC0138cc;
    }

    public void setPageMargin(int i) {
        int i2 = this.f312o;
        this.f312o = i;
        int width = getWidth();
        m255a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f313p = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f313p;
    }
}
