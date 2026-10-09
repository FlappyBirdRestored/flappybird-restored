package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.internal.C0588do;
import com.google.android.gms.internal.C0589dp;
import com.google.android.gms.internal.C0609u;
import com.google.android.gms.p013b.C0443k;

/* JADX INFO: loaded from: classes.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private int f1604a;

    /* JADX INFO: renamed from: b */
    private int f1605b;

    /* JADX INFO: renamed from: c */
    private View f1606c;

    /* JADX INFO: renamed from: d */
    private View.OnClickListener f1607d;

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1607d = null;
        m1835a(0, 0);
    }

    /* JADX INFO: renamed from: a */
    private static Button m1833a(Context context, int i, int i2) {
        C0609u c0609u = new C0609u(context);
        c0609u.m2773a(context.getResources(), i, i2);
        return c0609u;
    }

    /* JADX INFO: renamed from: a */
    private void m1834a(Context context) {
        if (this.f1606c != null) {
            removeView(this.f1606c);
        }
        try {
            this.f1606c = C0589dp.m2711a(context, this.f1604a, this.f1605b);
        } catch (C0443k e) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            this.f1606c = m1833a(context, this.f1604a, this.f1605b);
        }
        addView(this.f1606c);
        this.f1606c.setEnabled(isEnabled());
        this.f1606c.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: a */
    public void m1835a(int i, int i2) {
        C0588do.m2707a(i >= 0 && i < 3, "Unknown button size " + i);
        C0588do.m2707a(i2 >= 0 && i2 < 2, "Unknown color scheme " + i2);
        this.f1604a = i;
        this.f1605b = i2;
        m1834a(getContext());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f1607d == null || view != this.f1606c) {
            return;
        }
        this.f1607d.onClick(this);
    }

    public void setColorScheme(int i) {
        m1835a(this.f1604a, i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f1606c.setEnabled(z);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f1607d = onClickListener;
        if (this.f1606c != null) {
            this.f1606c.setOnClickListener(this);
        }
    }

    public void setSize(int i) {
        m1835a(i, this.f1605b);
    }
}
