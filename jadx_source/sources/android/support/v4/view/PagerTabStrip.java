package android.support.v4.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.C0467e;

/* JADX INFO: loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* JADX INFO: renamed from: f */
    private int f233f;

    /* JADX INFO: renamed from: g */
    private int f234g;

    /* JADX INFO: renamed from: h */
    private int f235h;

    /* JADX INFO: renamed from: i */
    private int f236i;

    /* JADX INFO: renamed from: j */
    private int f237j;

    /* JADX INFO: renamed from: k */
    private int f238k;

    /* JADX INFO: renamed from: l */
    private final Paint f239l;

    /* JADX INFO: renamed from: m */
    private final Rect f240m;

    /* JADX INFO: renamed from: n */
    private int f241n;

    /* JADX INFO: renamed from: o */
    private boolean f242o;

    /* JADX INFO: renamed from: p */
    private boolean f243p;

    /* JADX INFO: renamed from: q */
    private int f244q;

    /* JADX INFO: renamed from: r */
    private boolean f245r;

    /* JADX INFO: renamed from: s */
    private float f246s;

    /* JADX INFO: renamed from: t */
    private float f247t;

    /* JADX INFO: renamed from: u */
    private int f248u;

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f239l = new Paint();
        this.f240m = new Rect();
        this.f241n = 255;
        this.f242o = false;
        this.f243p = false;
        this.f233f = this.f256e;
        this.f239l.setColor(this.f233f);
        float f = context.getResources().getDisplayMetrics().density;
        this.f234g = (int) ((3.0f * f) + 0.5f);
        this.f235h = (int) ((6.0f * f) + 0.5f);
        this.f236i = (int) (64.0f * f);
        this.f238k = (int) ((16.0f * f) + 0.5f);
        this.f244q = (int) ((1.0f * f) + 0.5f);
        this.f237j = (int) ((f * 32.0f) + 0.5f);
        this.f248u = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f253b.setFocusable(true);
        this.f253b.setOnClickListener(new ViewOnClickListenerC0087af(this));
        this.f255d.setFocusable(true);
        this.f255d.setOnClickListener(new ViewOnClickListenerC0088ag(this));
        if (getBackground() == null) {
            this.f242o = true;
        }
    }

    @Override // android.support.v4.view.PagerTitleStrip
    /* JADX INFO: renamed from: a */
    void mo247a(int i, float f, boolean z) {
        Rect rect = this.f240m;
        int height = getHeight();
        int left = this.f254c.getLeft() - this.f238k;
        int right = this.f254c.getRight() + this.f238k;
        int i2 = height - this.f234g;
        rect.set(left, i2, right, height);
        super.mo247a(i, f, z);
        this.f241n = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f254c.getLeft() - this.f238k, i2, this.f254c.getRight() + this.f238k, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f242o;
    }

    @Override // android.support.v4.view.PagerTitleStrip
    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f237j);
    }

    public int getTabIndicatorColor() {
        return this.f233f;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f254c.getLeft() - this.f238k;
        int right = this.f254c.getRight() + this.f238k;
        int i = height - this.f234g;
        this.f239l.setColor((this.f241n << 24) | (this.f233f & 16777215));
        canvas.drawRect(left, i, right, height, this.f239l);
        if (this.f242o) {
            this.f239l.setColor((-16777216) | (this.f233f & 16777215));
            canvas.drawRect(getPaddingLeft(), height - this.f244q, getWidth() - getPaddingRight(), height, this.f239l);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f245r) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (action) {
            case C0467e.MapAttrs_mapType /* 0 */:
                this.f246s = x;
                this.f247t = y;
                this.f245r = false;
                break;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                if (x < this.f254c.getLeft() - this.f238k) {
                    this.f252a.setCurrentItem(this.f252a.getCurrentItem() - 1);
                } else if (x > this.f254c.getRight() + this.f238k) {
                    this.f252a.setCurrentItem(this.f252a.getCurrentItem() + 1);
                }
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                if (Math.abs(x - this.f246s) > this.f248u || Math.abs(y - this.f247t) > this.f248u) {
                    this.f245r = true;
                }
                break;
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (this.f243p) {
            return;
        }
        this.f242o = ((-16777216) & i) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f243p) {
            return;
        }
        this.f242o = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f243p) {
            return;
        }
        this.f242o = i == 0;
    }

    public void setDrawFullUnderline(boolean z) {
        this.f242o = z;
        this.f243p = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        if (i4 < this.f235h) {
            i4 = this.f235h;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.f233f = i;
        this.f239l.setColor(this.f233f);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(getContext().getResources().getColor(i));
    }

    @Override // android.support.v4.view.PagerTitleStrip
    public void setTextSpacing(int i) {
        if (i < this.f236i) {
            i = this.f236i;
        }
        super.setTextSpacing(i);
    }
}
