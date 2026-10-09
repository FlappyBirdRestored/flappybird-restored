package com.google.android.gms.plus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.C0524be;
import com.google.android.gms.internal.C0590dq;

/* JADX INFO: loaded from: classes.dex */
public final class PlusOneButton extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private View f2250a;

    /* JADX INFO: renamed from: b */
    private int f2251b;

    /* JADX INFO: renamed from: c */
    private int f2252c;

    /* JADX INFO: renamed from: d */
    private String f2253d;

    /* JADX INFO: renamed from: e */
    private int f2254e;

    /* JADX INFO: renamed from: f */
    private InterfaceC0753e f2255f;

    public PlusOneButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2251b = m3210a(context, attributeSet);
        this.f2252c = m3213b(context, attributeSet);
        this.f2254e = -1;
        m3212a(getContext());
        if (isInEditMode()) {
        }
    }

    /* JADX INFO: renamed from: a */
    protected static int m3210a(Context context, AttributeSet attributeSet) {
        String strM2714a = C0590dq.m2714a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeSet, true, false, "PlusOneButton");
        if ("SMALL".equalsIgnoreCase(strM2714a)) {
            return 0;
        }
        if ("MEDIUM".equalsIgnoreCase(strM2714a)) {
            return 1;
        }
        return "TALL".equalsIgnoreCase(strM2714a) ? 2 : 3;
    }

    /* JADX INFO: renamed from: a */
    private void m3212a(Context context) {
        if (this.f2250a != null) {
            removeView(this.f2250a);
        }
        this.f2250a = C0524be.m2360a(context, this.f2251b, this.f2252c, this.f2253d, this.f2254e);
        setOnPlusOneClickListener(this.f2255f);
        addView(this.f2250a);
    }

    /* JADX INFO: renamed from: b */
    protected static int m3213b(Context context, AttributeSet attributeSet) {
        String strM2714a = C0590dq.m2714a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeSet, true, false, "PlusOneButton");
        if ("INLINE".equalsIgnoreCase(strM2714a)) {
            return 2;
        }
        return !"NONE".equalsIgnoreCase(strM2714a) ? 1 : 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2250a.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        View view = this.f2250a;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setAnnotation(int i) {
        this.f2252c = i;
        m3212a(getContext());
    }

    public void setOnPlusOneClickListener(InterfaceC0753e interfaceC0753e) {
        this.f2255f = interfaceC0753e;
        this.f2250a.setOnClickListener(new ViewOnClickListenerC0752d(this, interfaceC0753e));
    }

    public void setSize(int i) {
        this.f2251b = i;
        m3212a(getContext());
    }
}
