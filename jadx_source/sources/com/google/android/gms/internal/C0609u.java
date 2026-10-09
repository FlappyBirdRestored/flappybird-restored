package com.google.android.gms.internal;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.C0432b;
import com.google.android.gms.C0444c;
import com.google.android.gms.C0466d;
import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: com.google.android.gms.internal.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0609u extends Button {
    public C0609u(Context context) {
        this(context, null);
    }

    public C0609u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX INFO: renamed from: a */
    private int m2769a(int i, int i2, int i3) {
        switch (i) {
            case C0467e.MapAttrs_mapType /* 0 */:
                return i2;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                return i3;
            default:
                throw new IllegalStateException("Unknown color scheme: " + i);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2770a(Resources resources) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        float f = resources.getDisplayMetrics().density;
        setMinHeight((int) ((f * 48.0f) + 0.5f));
        setMinWidth((int) ((f * 48.0f) + 0.5f));
    }

    /* JADX INFO: renamed from: b */
    private void m2771b(Resources resources, int i, int i2) {
        int iM2769a;
        switch (i) {
            case C0467e.MapAttrs_mapType /* 0 */:
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                iM2769a = m2769a(i2, C0444c.common_signin_btn_text_dark, C0444c.common_signin_btn_text_light);
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                iM2769a = m2769a(i2, C0444c.common_signin_btn_icon_dark, C0444c.common_signin_btn_icon_light);
                break;
            default:
                throw new IllegalStateException("Unknown button size: " + i);
        }
        if (iM2769a == -1) {
            throw new IllegalStateException("Could not find background resource!");
        }
        setBackgroundDrawable(resources.getDrawable(iM2769a));
    }

    /* JADX INFO: renamed from: c */
    private void m2772c(Resources resources, int i, int i2) {
        setTextColor(resources.getColorStateList(m2769a(i2, C0432b.common_signin_btn_text_dark, C0432b.common_signin_btn_text_light)));
        switch (i) {
            case C0467e.MapAttrs_mapType /* 0 */:
                setText(resources.getString(C0466d.common_signin_button_text));
                return;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                setText(resources.getString(C0466d.common_signin_button_text_long));
                return;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                setText((CharSequence) null);
                return;
            default:
                throw new IllegalStateException("Unknown button size: " + i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2773a(Resources resources, int i, int i2) {
        C0588do.m2707a(i >= 0 && i < 3, "Unknown button size " + i);
        C0588do.m2707a(i2 >= 0 && i2 < 2, "Unknown color scheme " + i2);
        m2770a(resources);
        m2771b(resources, i, i2);
        m2772c(resources, i, i2);
    }
}
