package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: com.google.android.gms.internal.ch */
/* JADX INFO: loaded from: classes.dex */
public final class C0554ch extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a */
    private int f1975a;

    /* JADX INFO: renamed from: b */
    private long f1976b;

    /* JADX INFO: renamed from: c */
    private int f1977c;

    /* JADX INFO: renamed from: d */
    private int f1978d;

    /* JADX INFO: renamed from: e */
    private int f1979e;

    /* JADX INFO: renamed from: f */
    private int f1980f;

    /* JADX INFO: renamed from: g */
    private int f1981g;

    /* JADX INFO: renamed from: h */
    private boolean f1982h;

    /* JADX INFO: renamed from: i */
    private boolean f1983i;

    /* JADX INFO: renamed from: j */
    private C0558cl f1984j;

    /* JADX INFO: renamed from: k */
    private Drawable f1985k;

    /* JADX INFO: renamed from: l */
    private Drawable f1986l;

    /* JADX INFO: renamed from: m */
    private boolean f1987m;

    /* JADX INFO: renamed from: n */
    private boolean f1988n;

    /* JADX INFO: renamed from: o */
    private boolean f1989o;

    /* JADX INFO: renamed from: p */
    private int f1990p;

    public C0554ch(Drawable drawable, Drawable drawable2) {
        this(null);
        drawable = drawable == null ? C0556cj.f1991a : drawable;
        this.f1985k = drawable;
        drawable.setCallback(this);
        this.f1984j.f1994b |= drawable.getChangingConfigurations();
        drawable2 = drawable2 == null ? C0556cj.f1991a : drawable2;
        this.f1986l = drawable2;
        drawable2.setCallback(this);
        this.f1984j.f1994b |= drawable2.getChangingConfigurations();
    }

    C0554ch(C0558cl c0558cl) {
        this.f1975a = 0;
        this.f1979e = 255;
        this.f1981g = 0;
        this.f1982h = true;
        this.f1984j = new C0558cl(c0558cl);
    }

    /* JADX INFO: renamed from: a */
    public void m2599a(int i) {
        this.f1977c = 0;
        this.f1978d = this.f1979e;
        this.f1981g = 0;
        this.f1980f = i;
        this.f1975a = 1;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: a */
    public boolean m2600a() {
        if (!this.f1987m) {
            this.f1988n = (this.f1985k.getConstantState() == null || this.f1986l.getConstantState() == null) ? false : true;
            this.f1987m = true;
        }
        return this.f1988n;
    }

    /* JADX INFO: renamed from: b */
    public Drawable m2601b() {
        return this.f1986l;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z = true;
        boolean z2 = false;
        switch (this.f1975a) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                this.f1976b = SystemClock.uptimeMillis();
                this.f1975a = 2;
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                if (this.f1976b >= 0) {
                    float fUptimeMillis = (SystemClock.uptimeMillis() - this.f1976b) / this.f1980f;
                    z = fUptimeMillis >= 1.0f;
                    if (z) {
                        this.f1975a = 0;
                    }
                    this.f1981g = (int) ((Math.min(fUptimeMillis, 1.0f) * (this.f1978d - this.f1977c)) + this.f1977c);
                    break;
                }
            default:
                z2 = z;
                break;
        }
        int i = this.f1981g;
        boolean z3 = this.f1982h;
        Drawable drawable = this.f1985k;
        Drawable drawable2 = this.f1986l;
        if (z2) {
            if (!z3 || i == 0) {
                drawable.draw(canvas);
            }
            if (i == this.f1979e) {
                drawable2.setAlpha(this.f1979e);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z3) {
            drawable.setAlpha(this.f1979e - i);
        }
        drawable.draw(canvas);
        if (z3) {
            drawable.setAlpha(this.f1979e);
        }
        if (i > 0) {
            drawable2.setAlpha(i);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.f1979e);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f1984j.f1993a | this.f1984j.f1994b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (!m2600a()) {
            return null;
        }
        this.f1984j.f1993a = getChangingConfigurations();
        return this.f1984j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f1985k.getIntrinsicHeight(), this.f1986l.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f1985k.getIntrinsicWidth(), this.f1986l.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (!this.f1989o) {
            this.f1990p = Drawable.resolveOpacity(this.f1985k.getOpacity(), this.f1986l.getOpacity());
            this.f1989o = true;
        }
        return this.f1990p;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback;
        if (!C0604p.m2754a() || (callback = getCallback()) == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f1983i && super.mutate() == this) {
            if (!m2600a()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.f1985k.mutate();
            this.f1986l.mutate();
            this.f1983i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f1985k.setBounds(rect);
        this.f1986l.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback;
        if (!C0604p.m2754a() || (callback = getCallback()) == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f1981g == this.f1979e) {
            this.f1981g = i;
        }
        this.f1979e = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1985k.setColorFilter(colorFilter);
        this.f1986l.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback;
        if (!C0604p.m2754a() || (callback = getCallback()) == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
