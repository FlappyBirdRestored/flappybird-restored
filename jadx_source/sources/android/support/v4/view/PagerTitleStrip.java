package android.support.v4.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class PagerTitleStrip extends ViewGroup implements InterfaceC0133by {

    /* JADX INFO: renamed from: n */
    private static final int[] f249n = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: o */
    private static final int[] f250o = {R.attr.textAllCaps};

    /* JADX INFO: renamed from: q */
    private static final InterfaceC0091aj f251q;

    /* JADX INFO: renamed from: a */
    ViewPager f252a;

    /* JADX INFO: renamed from: b */
    TextView f253b;

    /* JADX INFO: renamed from: c */
    TextView f254c;

    /* JADX INFO: renamed from: d */
    TextView f255d;

    /* JADX INFO: renamed from: e */
    int f256e;

    /* JADX INFO: renamed from: f */
    private int f257f;

    /* JADX INFO: renamed from: g */
    private float f258g;

    /* JADX INFO: renamed from: h */
    private int f259h;

    /* JADX INFO: renamed from: i */
    private int f260i;

    /* JADX INFO: renamed from: j */
    private boolean f261j;

    /* JADX INFO: renamed from: k */
    private boolean f262k;

    /* JADX INFO: renamed from: l */
    private final C0090ai f263l;

    /* JADX INFO: renamed from: m */
    private WeakReference f264m;

    /* JADX INFO: renamed from: p */
    private int f265p;

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f251q = new C0093al();
        } else {
            f251q = new C0092ak();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.f257f = -1;
        this.f258g = -1.0f;
        this.f263l = new C0090ai(this);
        TextView textView = new TextView(context);
        this.f253b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f254c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f255d = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f249n);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f253b.setTextAppearance(context, resourceId);
            this.f254c.setTextAppearance(context, resourceId);
            this.f255d.setTextAppearance(context, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            m249a(0, dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.f253b.setTextColor(color);
            this.f254c.setTextColor(color);
            this.f255d.setTextColor(color);
        }
        this.f260i = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.f256e = this.f254c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f253b.setEllipsize(TextUtils.TruncateAt.END);
        this.f254c.setEllipsize(TextUtils.TruncateAt.END);
        this.f255d.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f250o);
            z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f253b);
            setSingleLineAllCaps(this.f254c);
            setSingleLineAllCaps(this.f255d);
        } else {
            this.f253b.setSingleLine();
            this.f254c.setSingleLine();
            this.f255d.setSingleLine();
        }
        this.f259h = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        f251q.mo494a(textView);
    }

    /* JADX INFO: renamed from: a */
    public void m249a(int i, float f) {
        this.f253b.setTextSize(i, f);
        this.f254c.setTextSize(i, f);
        this.f255d.setTextSize(i, f);
    }

    /* JADX INFO: renamed from: a */
    void mo247a(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        if (i != this.f257f) {
            m250a(i, this.f252a.getAdapter());
        } else if (!z && f == this.f258g) {
            return;
        }
        this.f262k = true;
        int measuredWidth = this.f253b.getMeasuredWidth();
        int measuredWidth2 = this.f254c.getMeasuredWidth();
        int measuredWidth3 = this.f255d.getMeasuredWidth();
        int i5 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i6 = paddingRight + i5;
        int i7 = (width - (paddingLeft + i5)) - i6;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i8 = ((width - i6) - ((int) (f2 * i7))) - (measuredWidth2 / 2);
        int i9 = i8 + measuredWidth2;
        int baseline = this.f253b.getBaseline();
        int baseline2 = this.f254c.getBaseline();
        int baseline3 = this.f255d.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i10 = iMax - baseline;
        int i11 = iMax - baseline2;
        int i12 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(this.f253b.getMeasuredHeight() + i10, this.f254c.getMeasuredHeight() + i11), this.f255d.getMeasuredHeight() + i12);
        switch (this.f260i & 112) {
            case 16:
                int i13 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
                i2 = i13 + i10;
                i3 = i11 + i13;
                i4 = i13 + i12;
                break;
            case 80:
                int i14 = (height - paddingBottom) - iMax2;
                i2 = i14 + i10;
                i3 = i11 + i14;
                i4 = i14 + i12;
                break;
            default:
                i2 = paddingTop + i10;
                i3 = i11 + paddingTop;
                i4 = paddingTop + i12;
                break;
        }
        this.f254c.layout(i8, i3, i9, this.f254c.getMeasuredHeight() + i3);
        int iMin = Math.min(paddingLeft, (i8 - this.f259h) - measuredWidth);
        this.f253b.layout(iMin, i2, measuredWidth + iMin, this.f253b.getMeasuredHeight() + i2);
        int iMax3 = Math.max((width - paddingRight) - measuredWidth3, this.f259h + i9);
        this.f255d.layout(iMax3, i4, iMax3 + measuredWidth3, this.f255d.getMeasuredHeight() + i4);
        this.f258g = f;
        this.f262k = false;
    }

    /* JADX INFO: renamed from: a */
    void m250a(int i, AbstractC0086ae abstractC0086ae) {
        CharSequence charSequenceM473a = null;
        int iM471a = abstractC0086ae != null ? abstractC0086ae.m471a() : 0;
        this.f261j = true;
        this.f253b.setText((i < 1 || abstractC0086ae == null) ? null : abstractC0086ae.m473a(i - 1));
        this.f254c.setText((abstractC0086ae == null || i >= iM471a) ? null : abstractC0086ae.m473a(i));
        if (i + 1 < iM471a && abstractC0086ae != null) {
            charSequenceM473a = abstractC0086ae.m473a(i + 1);
        }
        this.f255d.setText(charSequenceM473a);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (width * 0.8f), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE);
        this.f253b.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f254c.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f255d.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f257f = i;
        if (!this.f262k) {
            mo247a(i, this.f258g, false);
        }
        this.f261j = false;
    }

    /* JADX INFO: renamed from: a */
    void m251a(AbstractC0086ae abstractC0086ae, AbstractC0086ae abstractC0086ae2) {
        if (abstractC0086ae != null) {
            abstractC0086ae.m485b(this.f263l);
            this.f264m = null;
        }
        if (abstractC0086ae2 != null) {
            abstractC0086ae2.m476a((DataSetObserver) this.f263l);
            this.f264m = new WeakReference(abstractC0086ae2);
        }
        if (this.f252a != null) {
            this.f257f = -1;
            this.f258g = -1.0f;
            m250a(this.f252a.getCurrentItem(), abstractC0086ae2);
            requestLayout();
        }
    }

    int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f259h;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        AbstractC0086ae adapter = viewPager.getAdapter();
        viewPager.m275a(this.f263l);
        viewPager.setOnAdapterChangeListener(this.f263l);
        this.f252a = viewPager;
        m251a(this.f264m != null ? (AbstractC0086ae) this.f264m.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f252a != null) {
            m251a(this.f252a.getAdapter(), (AbstractC0086ae) null);
            this.f252a.m275a((InterfaceC0138cc) null);
            this.f252a.setOnAdapterChangeListener(null);
            this.f252a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f252a != null) {
            mo247a(this.f257f, this.f258g >= 0.0f ? this.f258g : 0.0f, true);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int minHeight = getMinHeight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (size * 0.8f), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - paddingTop, Integer.MIN_VALUE);
        this.f253b.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f254c.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f255d.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        if (mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(size, Math.max(minHeight, this.f254c.getMeasuredHeight() + paddingTop));
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f261j) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i) {
        this.f260i = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f) {
        this.f265p = ((int) (255.0f * f)) & 255;
        int i = (this.f265p << 24) | (this.f256e & 16777215);
        this.f253b.setTextColor(i);
        this.f255d.setTextColor(i);
    }

    public void setTextColor(int i) {
        this.f256e = i;
        this.f254c.setTextColor(i);
        int i2 = (this.f265p << 24) | (this.f256e & 16777215);
        this.f253b.setTextColor(i2);
        this.f255d.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.f259h = i;
        requestLayout();
    }
}
