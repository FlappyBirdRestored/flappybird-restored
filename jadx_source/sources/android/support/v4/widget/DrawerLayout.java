package android.support.v4.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.C0101at;
import android.support.v4.view.C0123bo;
import android.support.v4.view.C0153n;
import android.support.v4.view.C0158s;
import android.support.v4.view.C0165z;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.C0467e;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    private static final int[] f381a = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: b */
    private int f382b;

    /* JADX INFO: renamed from: c */
    private int f383c;

    /* JADX INFO: renamed from: d */
    private float f384d;

    /* JADX INFO: renamed from: e */
    private Paint f385e;

    /* JADX INFO: renamed from: f */
    private final C0169ac f386f;

    /* JADX INFO: renamed from: g */
    private final C0169ac f387g;

    /* JADX INFO: renamed from: h */
    private final C0177f f388h;

    /* JADX INFO: renamed from: i */
    private final C0177f f389i;

    /* JADX INFO: renamed from: j */
    private int f390j;

    /* JADX INFO: renamed from: k */
    private boolean f391k;

    /* JADX INFO: renamed from: l */
    private boolean f392l;

    /* JADX INFO: renamed from: m */
    private int f393m;

    /* JADX INFO: renamed from: n */
    private int f394n;

    /* JADX INFO: renamed from: o */
    private boolean f395o;

    /* JADX INFO: renamed from: p */
    private boolean f396p;

    /* JADX INFO: renamed from: q */
    private InterfaceC0175d f397q;

    /* JADX INFO: renamed from: r */
    private float f398r;

    /* JADX INFO: renamed from: s */
    private float f399s;

    /* JADX INFO: renamed from: t */
    private Drawable f400t;

    /* JADX INFO: renamed from: u */
    private Drawable f401u;

    public class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f402a;

        /* JADX INFO: renamed from: b */
        float f403b;

        /* JADX INFO: renamed from: c */
        boolean f404c;

        /* JADX INFO: renamed from: d */
        boolean f405d;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f402a = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f402a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f381a);
            this.f402a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f402a = 0;
            this.f402a = layoutParams.f402a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f402a = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f402a = 0;
        }
    }

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C0176e();

        /* JADX INFO: renamed from: a */
        int f406a;

        /* JADX INFO: renamed from: b */
        int f407b;

        /* JADX INFO: renamed from: c */
        int f408c;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f406a = 0;
            this.f407b = 0;
            this.f408c = 0;
            this.f406a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f406a = 0;
            this.f407b = 0;
            this.f408c = 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f406a);
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f383c = -1728053248;
        this.f385e = new Paint();
        this.f392l = true;
        float f = getResources().getDisplayMetrics().density;
        this.f382b = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        this.f388h = new C0177f(this, 3);
        this.f389i = new C0177f(this, 5);
        this.f386f = C0169ac.m681a(this, 1.0f, this.f388h);
        this.f386f.m700a(1);
        this.f386f.m699a(f2);
        this.f388h.m746a(this.f386f);
        this.f387g = C0169ac.m681a(this, 1.0f, this.f389i);
        this.f387g.m700a(2);
        this.f387g.m699a(f2);
        this.f389i.m746a(this.f387g);
        setFocusableInTouchMode(true);
        C0101at.m506a(this, new C0174c(this));
        C0123bo.m558a(this, false);
    }

    /* JADX INFO: renamed from: b */
    static String m624b(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* JADX INFO: renamed from: e */
    private boolean m626e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).f404c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    private boolean m627f() {
        return m628g() != null;
    }

    /* JADX INFO: renamed from: g */
    private View m628g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m646g(childAt) && m649j(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    private static boolean m629k(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* JADX INFO: renamed from: a */
    public int m630a(View view) {
        int iM644e = m644e(view);
        if (iM644e == 3) {
            return this.f393m;
        }
        if (iM644e == 5) {
            return this.f394n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    View m631a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (((LayoutParams) childAt.getLayoutParams()).f405d) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    View m632a(int i) {
        int iM597a = C0153n.m597a(i, C0101at.m513e(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m644e(childAt) & 7) == iM597a) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m633a(int i, int i2) {
        int iM597a = C0153n.m597a(i2, C0101at.m513e(this));
        if (iM597a == 3) {
            this.f393m = i;
        } else if (iM597a == 5) {
            this.f394n = i;
        }
        if (i != 0) {
            (iM597a == 3 ? this.f386f : this.f387g).m718e();
        }
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                View viewM632a = m632a(iM597a);
                if (viewM632a != null) {
                    m648i(viewM632a);
                }
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                View viewM632a2 = m632a(iM597a);
                if (viewM632a2 != null) {
                    m647h(viewM632a2);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    void m634a(int i, int i2, View view) {
        int i3 = 1;
        int iM698a = this.f386f.m698a();
        int iM698a2 = this.f387g.m698a();
        if (iM698a != 1 && iM698a2 != 1) {
            i3 = (iM698a == 2 || iM698a2 == 2) ? 2 : 0;
        }
        if (view != null && i2 == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.f403b == 0.0f) {
                m639b(view);
            } else if (layoutParams.f403b == 1.0f) {
                m642c(view);
            }
        }
        if (i3 != this.f390j) {
            this.f390j = i3;
            if (this.f397q != null) {
                this.f397q.m736a(i3);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m635a(View view, float f) {
        if (this.f397q != null) {
            this.f397q.m738a(view, f);
        }
    }

    /* JADX INFO: renamed from: a */
    void m636a(boolean z) {
        int childCount = getChildCount();
        boolean zM704a = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (m646g(childAt) && (!z || layoutParams.f404c)) {
                zM704a = m637a(childAt, 3) ? zM704a | this.f386f.m704a(childAt, -childAt.getWidth(), childAt.getTop()) : zM704a | this.f387g.m704a(childAt, getWidth(), childAt.getTop());
                layoutParams.f404c = false;
            }
        }
        this.f388h.m745a();
        this.f389i.m745a();
        if (zM704a) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: a */
    boolean m637a(View view, int i) {
        return (m644e(view) & i) == i;
    }

    /* JADX INFO: renamed from: b */
    public void m638b() {
        m636a(false);
    }

    /* JADX INFO: renamed from: b */
    void m639b(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.f405d) {
            layoutParams.f405d = false;
            if (this.f397q != null) {
                this.f397q.m739b(view);
            }
            sendAccessibilityEvent(32);
        }
    }

    /* JADX INFO: renamed from: b */
    void m640b(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f == layoutParams.f403b) {
            return;
        }
        layoutParams.f403b = f;
        m635a(view, f);
    }

    /* JADX INFO: renamed from: c */
    void m641c() {
        if (this.f396p) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f396p = true;
    }

    /* JADX INFO: renamed from: c */
    void m642c(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.f405d) {
            return;
        }
        layoutParams.f405d = true;
        if (this.f397q != null) {
            this.f397q.m737a(view);
        }
        view.sendAccessibilityEvent(32);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i).getLayoutParams()).f403b);
        }
        this.f384d = fMax;
        if (this.f386f.m705a(true) || this.f387g.m705a(true)) {
            C0101at.m509b(this);
        }
    }

    /* JADX INFO: renamed from: d */
    float m643d(View view) {
        return ((LayoutParams) view.getLayoutParams()).f403b;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int left;
        int height = getHeight();
        boolean zM645f = m645f(view);
        int i = 0;
        int width = getWidth();
        int iSave = canvas.save();
        if (zM645f) {
            int childCount = getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                if (childAt == view || childAt.getVisibility() != 0 || !m629k(childAt) || !m646g(childAt)) {
                    left = width;
                } else if (childAt.getHeight() < height) {
                    left = width;
                } else if (m637a(childAt, 3)) {
                    int right = childAt.getRight();
                    if (right <= i) {
                        right = i;
                    }
                    i = right;
                    left = width;
                } else {
                    left = childAt.getLeft();
                    if (left >= width) {
                        left = width;
                    }
                }
                i2++;
                width = left;
            }
            canvas.clipRect(i, 0, width, getHeight());
        }
        int i3 = width;
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        if (this.f384d > 0.0f && zM645f) {
            this.f385e.setColor((((int) (((this.f383c & (-16777216)) >>> 24) * this.f384d)) << 24) | (this.f383c & 16777215));
            canvas.drawRect(i, 0.0f, i3, getHeight(), this.f385e);
        } else if (this.f400t != null && m637a(view, 3)) {
            int intrinsicWidth = this.f400t.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f386f.m706b(), 1.0f));
            this.f400t.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f400t.setAlpha((int) (255.0f * fMax));
            this.f400t.draw(canvas);
        } else if (this.f401u != null && m637a(view, 5)) {
            int intrinsicWidth2 = this.f401u.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f387g.m706b(), 1.0f));
            this.f401u.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f401u.setAlpha((int) (255.0f * fMax2));
            this.f401u.draw(canvas);
        }
        return zDrawChild;
    }

    /* JADX INFO: renamed from: e */
    int m644e(View view) {
        return C0153n.m597a(((LayoutParams) view.getLayoutParams()).f402a, C0101at.m513e(this));
    }

    /* JADX INFO: renamed from: f */
    boolean m645f(View view) {
        return ((LayoutParams) view.getLayoutParams()).f402a == 0;
    }

    /* JADX INFO: renamed from: g */
    boolean m646g(View view) {
        return (C0153n.m597a(((LayoutParams) view.getLayoutParams()).f402a, C0101at.m513e(view)) & 7) != 0;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: h */
    public void m647h(View view) {
        if (!m646g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        if (this.f392l) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f403b = 1.0f;
            layoutParams.f405d = true;
        } else if (m637a(view, 3)) {
            this.f386f.m704a(view, 0, view.getTop());
        } else {
            this.f387g.m704a(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    /* JADX INFO: renamed from: i */
    public void m648i(View view) {
        if (!m646g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        if (this.f392l) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f403b = 0.0f;
            layoutParams.f405d = false;
        } else if (m637a(view, 3)) {
            this.f386f.m704a(view, -view.getWidth(), view.getTop());
        } else {
            this.f387g.m704a(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    /* JADX INFO: renamed from: j */
    public boolean m649j(View view) {
        if (m646g(view)) {
            return ((LayoutParams) view.getLayoutParams()).f403b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f392l = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f392l = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0016  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int iM612a = C0165z.m612a(motionEvent);
        boolean zM703a = this.f386f.m703a(motionEvent) | this.f387g.m703a(motionEvent);
        switch (iM612a) {
            case C0467e.MapAttrs_mapType /* 0 */:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f398r = x;
                this.f399s = y;
                z = this.f384d > 0.0f && m645f(this.f386f.m716d((int) x, (int) y));
                this.f395o = false;
                this.f396p = false;
                break;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                m636a(true);
                this.f395o = false;
                this.f396p = false;
                z = false;
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                if (!this.f386f.m717d(3)) {
                    z = false;
                } else {
                    this.f388h.m745a();
                    this.f389i.m745a();
                    z = false;
                }
                break;
            default:
                z = false;
                break;
        }
        return zM703a || z || m626e() || this.f396p;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m627f()) {
            return super.onKeyDown(i, keyEvent);
        }
        C0158s.m602b(keyEvent);
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewM628g = m628g();
        if (viewM628g != null && m630a(viewM628g) == 0) {
            m638b();
        }
        return viewM628g != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        this.f391k = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m645f(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m637a(childAt, 3)) {
                        i5 = ((int) (measuredWidth * layoutParams.f403b)) + (-measuredWidth);
                        f = (measuredWidth + i5) / measuredWidth;
                    } else {
                        i5 = i6 - ((int) (measuredWidth * layoutParams.f403b));
                        f = (i6 - i5) / measuredWidth;
                    }
                    boolean z2 = f != layoutParams.f403b;
                    switch (layoutParams.f402a & 112) {
                        case 16:
                            int i8 = i4 - i2;
                            int i9 = (i8 - measuredHeight) / 2;
                            if (i9 < layoutParams.topMargin) {
                                i9 = layoutParams.topMargin;
                            } else if (i9 + measuredHeight > i8 - layoutParams.bottomMargin) {
                                i9 = (i8 - layoutParams.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i5, i9, measuredWidth + i5, measuredHeight + i9);
                            break;
                        case 80:
                            int i10 = i4 - i2;
                            childAt.layout(i5, (i10 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i10 - layoutParams.bottomMargin);
                            break;
                        default:
                            childAt.layout(i5, layoutParams.topMargin, measuredWidth + i5, measuredHeight + layoutParams.topMargin);
                            break;
                    }
                    if (z2) {
                        m640b(childAt, f);
                    }
                    int i11 = layoutParams.f403b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i11) {
                        childAt.setVisibility(i11);
                    }
                }
            }
        }
        this.f391k = false;
        this.f392l = false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046 A[PHI: r2
  0x0046: PHI (r2v14 int) = (r2v2 int), (r2v0 int) binds: [B:17:0x0044, B:4:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = 300;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            i3 = size2;
        } else {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 == Integer.MIN_VALUE || mode2 != 0) {
                i3 = size2;
            }
        }
        setMeasuredDimension(size, i3);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m645f(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((i3 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                } else {
                    if (!m646g(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    int iM644e = m644e(childAt) & 7;
                    if ((0 & iM644e) != 0) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m624b(iM644e) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    childAt.measure(getChildMeasureSpec(i, this.f382b + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), getChildMeasureSpec(i2, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewM632a;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f406a != 0 && (viewM632a = m632a(savedState.f406a)) != null) {
            m647h(viewM632a);
        }
        m633a(savedState.f407b, 3);
        m633a(savedState.f408c, 5);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m646g(childAt)) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f405d) {
                    savedState.f406a = layoutParams.f402a;
                    break;
                }
            }
        }
        savedState.f407b = this.f393m;
        savedState.f408c = this.f394n;
        return savedState;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewM631a;
        this.f386f.m707b(motionEvent);
        this.f387g.m707b(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case C0467e.MapAttrs_mapType /* 0 */:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f398r = x;
                this.f399s = y;
                this.f395o = false;
                this.f396p = false;
                return true;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                View viewM716d = this.f386f.m716d((int) x2, (int) y2);
                if (viewM716d == null || !m645f(viewM716d)) {
                    z = true;
                } else {
                    float f = x2 - this.f398r;
                    float f2 = y2 - this.f399s;
                    int iM715d = this.f386f.m715d();
                    z = (f * f) + (f2 * f2) >= ((float) (iM715d * iM715d)) || (viewM631a = m631a()) == null || m630a(viewM631a) == 2;
                }
                m636a(z);
                this.f395o = false;
                return true;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
            default:
                return true;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                m636a(true);
                this.f395o = false;
                this.f396p = false;
                return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f395o = z;
        if (z) {
            m636a(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f391k) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerListener(InterfaceC0175d interfaceC0175d) {
        this.f397q = interfaceC0175d;
    }

    public void setDrawerLockMode(int i) {
        m633a(i, 3);
        m633a(i, 5);
    }

    public void setScrimColor(int i) {
        this.f383c = i;
        invalidate();
    }
}
