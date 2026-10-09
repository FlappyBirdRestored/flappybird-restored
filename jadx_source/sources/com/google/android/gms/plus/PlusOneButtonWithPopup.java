package com.google.android.gms.plus;

import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.AbstractBinderC0517ay;
import com.google.android.gms.internal.C0524be;
import com.google.android.gms.internal.InterfaceC0516ax;

/* JADX INFO: loaded from: classes.dex */
public final class PlusOneButtonWithPopup extends ViewGroup {

    /* JADX INFO: renamed from: a */
    private View f2256a;

    /* JADX INFO: renamed from: b */
    private int f2257b;

    /* JADX INFO: renamed from: c */
    private int f2258c;

    /* JADX INFO: renamed from: d */
    private View.OnClickListener f2259d;

    /* JADX INFO: renamed from: e */
    private String f2260e;

    /* JADX INFO: renamed from: f */
    private String f2261f;

    public PlusOneButtonWithPopup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2257b = PlusOneButton.m3210a(context, attributeSet);
        this.f2258c = PlusOneButton.m3213b(context, attributeSet);
        this.f2256a = new C0754f(context, this.f2257b);
        addView(this.f2256a);
    }

    /* JADX INFO: renamed from: a */
    private int m3215a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        switch (mode) {
            case Integer.MIN_VALUE:
            case 1073741824:
                return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - i2, mode);
            default:
                return i;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3216a() {
        if (this.f2256a != null) {
            removeView(this.f2256a);
        }
        this.f2256a = C0524be.m2361a(getContext(), this.f2257b, this.f2258c, this.f2260e, this.f2261f);
        if (this.f2259d != null) {
            setOnClickListener(this.f2259d);
        }
        addView(this.f2256a);
    }

    /* JADX INFO: renamed from: b */
    private InterfaceC0516ax m3217b() throws RemoteException {
        InterfaceC0516ax interfaceC0516axM2311a = AbstractBinderC0517ay.m2311a((IBinder) this.f2256a.getTag());
        if (interfaceC0516axM2311a != null) {
            return interfaceC0516axM2311a;
        }
        if (Log.isLoggable("PlusOneButtonWithPopup", 5)) {
            Log.w("PlusOneButtonWithPopup", "Failed to get PlusOneDelegate");
        }
        throw new RemoteException();
    }

    public PendingIntent getResolution() {
        if (this.f2256a != null) {
            try {
                return m3217b().mo2308a();
            } catch (RemoteException e) {
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2256a.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        this.f2256a.measure(m3215a(i, paddingLeft), m3215a(i2, paddingTop));
        setMeasuredDimension(paddingLeft + this.f2256a.getMeasuredWidth(), paddingTop + this.f2256a.getMeasuredHeight());
    }

    public void setAnnotation(int i) {
        this.f2258c = i;
        m3216a();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f2259d = onClickListener;
        this.f2256a.setOnClickListener(onClickListener);
    }

    public void setSize(int i) {
        this.f2257b = i;
        m3216a();
    }
}
