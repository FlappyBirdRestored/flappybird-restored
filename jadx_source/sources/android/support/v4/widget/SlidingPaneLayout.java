package android.support.v4.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.C0101at;
import android.support.v4.view.C0165z;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.gms.C0467e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    static final InterfaceC0196y f409a;

    /* JADX INFO: renamed from: b */
    private int f410b;

    /* JADX INFO: renamed from: c */
    private int f411c;

    /* JADX INFO: renamed from: d */
    private Drawable f412d;

    /* JADX INFO: renamed from: e */
    private final int f413e;

    /* JADX INFO: renamed from: f */
    private boolean f414f;

    /* JADX INFO: renamed from: g */
    private View f415g;

    /* JADX INFO: renamed from: h */
    private float f416h;

    /* JADX INFO: renamed from: i */
    private float f417i;

    /* JADX INFO: renamed from: j */
    private int f418j;

    /* JADX INFO: renamed from: k */
    private boolean f419k;

    /* JADX INFO: renamed from: l */
    private int f420l;

    /* JADX INFO: renamed from: m */
    private float f421m;

    /* JADX INFO: renamed from: n */
    private float f422n;

    /* JADX INFO: renamed from: o */
    private InterfaceC0194w f423o;

    /* JADX INFO: renamed from: p */
    private final C0169ac f424p;

    /* JADX INFO: renamed from: q */
    private boolean f425q;

    /* JADX INFO: renamed from: r */
    private boolean f426r;

    /* JADX INFO: renamed from: s */
    private final Rect f427s;

    /* JADX INFO: renamed from: t */
    private final ArrayList f428t;

    public class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: e */
        private static final int[] f429e = {R.attr.layout_weight};

        /* JADX INFO: renamed from: a */
        public float f430a;

        /* JADX INFO: renamed from: b */
        boolean f431b;

        /* JADX INFO: renamed from: c */
        boolean f432c;

        /* JADX INFO: renamed from: d */
        Paint f433d;

        public LayoutParams() {
            super(-1, -1);
            this.f430a = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f430a = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f429e);
            this.f430a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f430a = 0.0f;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f430a = 0.0f;
        }
    }

    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C0195x();

        /* JADX INFO: renamed from: a */
        boolean f434a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f434a = parcel.readInt() != 0;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f434a ? 1 : 0);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            f409a = new C0168ab();
        } else if (i >= 16) {
            f409a = new C0167aa();
        } else {
            f409a = new C0197z();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f410b = -858993460;
        this.f426r = true;
        this.f427s = new Rect();
        this.f428t = new ArrayList();
        float f = context.getResources().getDisplayMetrics().density;
        this.f413e = (int) ((32.0f * f) + 0.5f);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        C0101at.m506a(this, new C0191t(this));
        C0101at.m510b(this, 1);
        this.f424p = C0169ac.m681a(this, 0.5f, new C0193v(this));
        this.f424p.m700a(1);
        this.f424p.m699a(f * 400.0f);
    }

    /* JADX INFO: renamed from: a */
    private void m650a(float f) {
        LayoutParams layoutParams = (LayoutParams) this.f415g.getLayoutParams();
        boolean z = layoutParams.f432c && layoutParams.leftMargin <= 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.f415g) {
                int i2 = (int) ((1.0f - this.f417i) * this.f420l);
                this.f417i = f;
                childAt.offsetLeftAndRight(i2 - ((int) ((1.0f - f) * this.f420l)));
                if (z) {
                    m654a(childAt, 1.0f - this.f417i, this.f411c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m651a(int i) {
        LayoutParams layoutParams = (LayoutParams) this.f415g.getLayoutParams();
        this.f416h = (i - (getPaddingLeft() + layoutParams.leftMargin)) / this.f418j;
        if (this.f420l != 0) {
            m650a(this.f416h);
        }
        if (layoutParams.f432c) {
            m654a(this.f415g, this.f416h, this.f410b);
        }
        m667a(this.f415g);
    }

    /* JADX INFO: renamed from: a */
    private void m654a(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f <= 0.0f || i == 0) {
            if (C0101at.m512d(view) != 0) {
                if (layoutParams.f433d != null) {
                    layoutParams.f433d.setColorFilter(null);
                }
                RunnableC0192u runnableC0192u = new RunnableC0192u(this, view);
                this.f428t.add(runnableC0192u);
                C0101at.m507a(this, runnableC0192u);
                return;
            }
            return;
        }
        int i2 = (((int) ((((-16777216) & i) >>> 24) * f)) << 24) | (16777215 & i);
        if (layoutParams.f433d == null) {
            layoutParams.f433d = new Paint();
        }
        layoutParams.f433d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
        if (C0101at.m512d(view) != 2) {
            C0101at.m504a(view, 2, layoutParams.f433d);
        }
        m665g(view);
    }

    /* JADX INFO: renamed from: a */
    private boolean m657a(View view, int i) {
        if (!this.f426r && !m668a(0.0f, i)) {
            return false;
        }
        this.f425q = false;
        return true;
    }

    /* JADX INFO: renamed from: b */
    private boolean m659b(View view, int i) {
        if (!this.f426r && !m668a(1.0f, i)) {
            return false;
        }
        this.f425q = true;
        return true;
    }

    /* JADX INFO: renamed from: f */
    private static boolean m664f(View view) {
        Drawable background;
        if (C0101at.m515g(view)) {
            return true;
        }
        return Build.VERSION.SDK_INT < 18 && (background = view.getBackground()) != null && background.getOpacity() == -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m665g(View view) {
        f409a.mo677a(this, view);
    }

    /* JADX INFO: renamed from: a */
    void m666a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m667a(View view) {
        if (this.f423o != null) {
            this.f423o.m797a(view, this.f416h);
        }
    }

    /* JADX INFO: renamed from: a */
    boolean m668a(float f, int i) {
        if (!this.f414f) {
            return false;
        }
        if (!this.f424p.m704a(this.f415g, (int) (((LayoutParams) this.f415g.getLayoutParams()).leftMargin + getPaddingLeft() + (this.f418j * f)), this.f415g.getTop())) {
            return false;
        }
        m666a();
        C0101at.m509b(this);
        return true;
    }

    /* JADX INFO: renamed from: b */
    void m669b(View view) {
        if (this.f423o != null) {
            this.f423o.m796a(view);
        }
        sendAccessibilityEvent(32);
    }

    /* JADX INFO: renamed from: b */
    public boolean m670b() {
        return m659b(this.f415g, 0);
    }

    /* JADX INFO: renamed from: c */
    void m671c(View view) {
        if (this.f423o != null) {
            this.f423o.m798b(view);
        }
        sendAccessibilityEvent(32);
    }

    /* JADX INFO: renamed from: c */
    public boolean m672c() {
        return m657a(this.f415g, 0);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f424p.m705a(true)) {
            if (this.f414f) {
                C0101at.m509b(this);
            } else {
                this.f424p.m719f();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    void m673d(View view) {
        int bottom;
        int top;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view == null || !m664f(view)) {
            bottom = 0;
            top = 0;
            right = 0;
            left = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt == view) {
                return;
            }
            childAt.setVisibility((Math.max(paddingLeft, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(width, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m674d() {
        return !this.f414f || this.f416h == 1.0f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || this.f412d == null) {
            return;
        }
        int intrinsicWidth = this.f412d.getIntrinsicWidth();
        int left = childAt.getLeft();
        this.f412d.setBounds(left - intrinsicWidth, childAt.getTop(), left, childAt.getBottom());
        this.f412d.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean zDrawChild;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iSave = canvas.save(2);
        if (this.f414f && !layoutParams.f431b && this.f415g != null) {
            canvas.getClipBounds(this.f427s);
            this.f427s.right = Math.min(this.f427s.right, this.f415g.getLeft());
            canvas.clipRect(this.f427s);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            zDrawChild = super.drawChild(canvas, view, j);
        } else if (!layoutParams.f432c || this.f416h <= 0.0f) {
            if (view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(false);
            }
            zDrawChild = super.drawChild(canvas, view, j);
        } else {
            if (!view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(true);
            }
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                canvas.drawBitmap(drawingCache, view.getLeft(), view.getTop(), layoutParams.f433d);
                zDrawChild = false;
            } else {
                Log.e("SlidingPaneLayout", "drawChild: child view " + view + " returned null drawing cache");
                zDrawChild = super.drawChild(canvas, view, j);
            }
        }
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    /* JADX INFO: renamed from: e */
    public boolean m675e() {
        return this.f414f;
    }

    /* JADX INFO: renamed from: e */
    boolean m676e(View view) {
        if (view == null) {
            return false;
        }
        return this.f414f && ((LayoutParams) view.getLayoutParams()).f432c && this.f416h > 0.0f;
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
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f411c;
    }

    public int getParallaxDistance() {
        return this.f420l;
    }

    public int getSliderFadeColor() {
        return this.f410b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f426r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f426r = true;
        int size = this.f428t.size();
        for (int i = 0; i < size; i++) {
            ((RunnableC0192u) this.f428t.get(i)).run();
        }
        this.f428t.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int iM612a = C0165z.m612a(motionEvent);
        if (!this.f414f && iM612a == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f425q = !this.f424p.m711b(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f414f || (this.f419k && iM612a != 0)) {
            this.f424p.m718e();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (iM612a == 3 || iM612a == 1) {
            this.f424p.m718e();
            return false;
        }
        switch (iM612a) {
            case C0467e.MapAttrs_mapType /* 0 */:
                this.f419k = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f421m = x;
                this.f422n = y;
                z = this.f424p.m711b(this.f415g, (int) x, (int) y) && m676e(this.f415g);
                break;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
            default:
                z = false;
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float fAbs = Math.abs(x2 - this.f421m);
                float fAbs2 = Math.abs(y2 - this.f422n);
                if (fAbs > this.f424p.m715d() && fAbs2 > fAbs) {
                    this.f424p.m718e();
                    this.f419k = true;
                    return false;
                }
                z = false;
                break;
                break;
        }
        return this.f424p.m703a(motionEvent) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f426r) {
            this.f416h = (this.f414f && this.f425q) ? 1.0f : 0.0f;
        }
        int i8 = 0;
        int i9 = paddingLeft;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                i6 = i9;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f431b) {
                    int iMin = (Math.min(paddingLeft, (i7 - paddingRight) - this.f413e) - i9) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.f418j = iMin;
                    layoutParams.f432c = ((layoutParams.leftMargin + i9) + iMin) + (measuredWidth / 2) > i7 - paddingRight;
                    i6 = layoutParams.leftMargin + ((int) (iMin * this.f416h)) + i9;
                    i5 = 0;
                } else if (!this.f414f || this.f420l == 0) {
                    i5 = 0;
                    i6 = paddingLeft;
                } else {
                    i5 = (int) ((1.0f - this.f416h) * this.f420l);
                    i6 = paddingLeft;
                }
                int i10 = i6 - i5;
                childAt.layout(i10, paddingTop, i10 + measuredWidth, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft += childAt.getWidth();
            }
            i8++;
            i9 = i6;
        }
        if (this.f426r) {
            if (this.f414f) {
                if (this.f420l != 0) {
                    m650a(this.f416h);
                }
                if (((LayoutParams) this.f415g.getLayoutParams()).f432c) {
                    m654a(this.f415g, this.f416h, this.f410b);
                }
            } else {
                for (int i11 = 0; i11 < childCount; i11++) {
                    m654a(getChildAt(i11), 0.0f, this.f410b);
                }
            }
            m673d(this.f415g);
        }
        this.f426r = false;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0247  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9 A[PHI: r2
  0x00c9: PHI (r2v12 float) = (r2v11 float), (r2v14 float) binds: [B:35:0x00bb, B:37:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:54:0x0107  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110  */
    /* JADX WARN: Code duplicated, block: B:58:0x0115  */
    /* JADX WARN: Code duplicated, block: B:59:0x011e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0127  */
    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0133  */
    /* JADX WARN: Code duplicated, block: B:64:0x013c  */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int paddingTop;
        int paddingTop2;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int i6;
        int iMakeMeasureSpec3;
        int iMakeMeasureSpec4;
        int measuredHeight;
        int i7;
        boolean z;
        int i8;
        int i9;
        boolean z2;
        float f;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                i3 = mode2;
                i4 = 300;
                i5 = size2;
            } else {
                i3 = mode2;
                i4 = size;
                i5 = size2;
            }
        } else if (mode2 != 0) {
            i3 = mode2;
            i4 = size;
            i5 = size2;
        } else {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
            if (mode2 == 0) {
                i3 = Integer.MIN_VALUE;
                i4 = size;
                i5 = 300;
            } else {
                i3 = mode2;
                i4 = size;
                i5 = size2;
            }
        }
        switch (i3) {
            case Integer.MIN_VALUE:
                paddingTop = 0;
                paddingTop2 = (i5 - getPaddingTop()) - getPaddingBottom();
                break;
            case 1073741824:
                paddingTop = (i5 - getPaddingTop()) - getPaddingBottom();
                paddingTop2 = paddingTop;
                break;
            default:
                paddingTop = 0;
                paddingTop2 = -1;
                break;
        }
        boolean z3 = false;
        int paddingLeft = (i4 - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f415g = null;
        int i10 = 0;
        int iMin = paddingTop;
        float f2 = 0.0f;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f432c = false;
                i8 = paddingLeft;
                f = f2;
                i9 = iMin;
                z2 = z3;
            } else if (layoutParams.f430a > 0.0f) {
                f2 += layoutParams.f430a;
                if (layoutParams.width == 0) {
                    i8 = paddingLeft;
                    f = f2;
                    i9 = iMin;
                    z2 = z3;
                } else {
                    i6 = layoutParams.leftMargin + layoutParams.rightMargin;
                    if (layoutParams.width == -2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4 - i6, Integer.MIN_VALUE);
                    } else if (layoutParams.width == -1) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4 - i6, 1073741824);
                    } else {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                    }
                    if (layoutParams.height == -2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop2, Integer.MIN_VALUE);
                    } else if (layoutParams.height == -1) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop2, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                    }
                    childAt.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    int measuredWidth = childAt.getMeasuredWidth();
                    measuredHeight = childAt.getMeasuredHeight();
                    if (i3 == Integer.MIN_VALUE && measuredHeight > iMin) {
                        iMin = Math.min(measuredHeight, paddingTop2);
                    }
                    i7 = paddingLeft - measuredWidth;
                    if (i7 < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    layoutParams.f431b = z;
                    boolean z4 = z | z3;
                    if (layoutParams.f431b) {
                        this.f415g = childAt;
                    }
                    i8 = i7;
                    i9 = iMin;
                    float f3 = f2;
                    z2 = z4;
                    f = f3;
                }
            } else {
                i6 = layoutParams.leftMargin + layoutParams.rightMargin;
                if (layoutParams.width == -2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4 - i6, Integer.MIN_VALUE);
                } else if (layoutParams.width == -1) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4 - i6, 1073741824);
                } else {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                }
                if (layoutParams.height == -2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop2, Integer.MIN_VALUE);
                } else if (layoutParams.height == -1) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                }
                childAt.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                int measuredWidth2 = childAt.getMeasuredWidth();
                measuredHeight = childAt.getMeasuredHeight();
                if (i3 == Integer.MIN_VALUE) {
                    iMin = Math.min(measuredHeight, paddingTop2);
                }
                i7 = paddingLeft - measuredWidth2;
                if (i7 < 0) {
                    z = true;
                } else {
                    z = false;
                }
                layoutParams.f431b = z;
                boolean z5 = z | z3;
                if (layoutParams.f431b) {
                    this.f415g = childAt;
                }
                i8 = i7;
                i9 = iMin;
                float f4 = f2;
                z2 = z5;
                f = f4;
            }
            i10++;
            z3 = z2;
            iMin = i9;
            f2 = f;
            paddingLeft = i8;
        }
        if (z3 || f2 > 0.0f) {
            int i11 = i4 - this.f413e;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getVisibility() != 8) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != 8) {
                        boolean z6 = layoutParams2.width == 0 && layoutParams2.f430a > 0.0f;
                        int measuredWidth3 = z6 ? 0 : childAt2.getMeasuredWidth();
                        if (!z3 || childAt2 == this.f415g) {
                            if (layoutParams2.f430a > 0.0f) {
                                if (layoutParams2.width != 0) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                } else if (layoutParams2.height == -2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop2, Integer.MIN_VALUE);
                                } else {
                                    iMakeMeasureSpec = layoutParams2.height == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop2, 1073741824) : View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                                }
                                if (z3) {
                                    int i13 = i4 - (layoutParams2.rightMargin + layoutParams2.leftMargin);
                                    int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                                    if (measuredWidth3 != i13) {
                                        childAt2.measure(iMakeMeasureSpec5, iMakeMeasureSpec);
                                    }
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(((int) ((layoutParams2.f430a * Math.max(0, paddingLeft)) / f2)) + measuredWidth3, 1073741824), iMakeMeasureSpec);
                                }
                            }
                        } else if (layoutParams2.width < 0 && (measuredWidth3 > i11 || layoutParams2.f430a > 0.0f)) {
                            if (!z6) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            } else if (layoutParams2.height == -2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop2, Integer.MIN_VALUE);
                            } else {
                                iMakeMeasureSpec2 = layoutParams2.height == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop2, 1073741824) : View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), iMakeMeasureSpec2);
                        }
                    }
                }
            }
        }
        setMeasuredDimension(i4, iMin);
        this.f414f = z3;
        if (this.f424p.m698a() == 0 || z3) {
            return;
        }
        this.f424p.m719f();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f434a) {
            m670b();
        } else {
            m672c();
        }
        this.f425q = savedState.f434a;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f434a = m675e() ? m674d() : this.f425q;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f426r = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f414f) {
            return super.onTouchEvent(motionEvent);
        }
        this.f424p.m707b(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case C0467e.MapAttrs_mapType /* 0 */:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f421m = x;
                this.f422n = y;
                return true;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                if (!m676e(this.f415g)) {
                    return true;
                }
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float f = x2 - this.f421m;
                float f2 = y2 - this.f422n;
                int iM715d = this.f424p.m715d();
                if ((f * f) + (f2 * f2) >= iM715d * iM715d || !this.f424p.m711b(this.f415g, (int) x2, (int) y2)) {
                    return true;
                }
                m657a(this.f415g, 0);
                return true;
            default:
                return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f414f) {
            return;
        }
        this.f425q = view == this.f415g;
    }

    public void setCoveredFadeColor(int i) {
        this.f411c = i;
    }

    public void setPanelSlideListener(InterfaceC0194w interfaceC0194w) {
        this.f423o = interfaceC0194w;
    }

    public void setParallaxDistance(int i) {
        this.f420l = i;
        requestLayout();
    }

    public void setShadowDrawable(Drawable drawable) {
        this.f412d = drawable;
    }

    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setSliderFadeColor(int i) {
        this.f410b = i;
    }
}
