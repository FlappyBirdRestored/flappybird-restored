package com.google.android.gms.plus;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: com.google.android.gms.plus.f */
/* JADX INFO: loaded from: classes.dex */
public class C0754f extends FrameLayout {
    public C0754f(Context context, int i) {
        super(context);
        Button button = new Button(context);
        button.setEnabled(false);
        button.setBackgroundDrawable(m3233a().mo3234a(i));
        Point pointM3232a = m3232a(i);
        addView(button, new FrameLayout.LayoutParams(pointM3232a.x, pointM3232a.y, 17));
    }

    /* JADX INFO: renamed from: a */
    private Point m3232a(int i) {
        int i2 = 24;
        int i3 = 20;
        Point point = new Point();
        switch (i) {
            case C0467e.MapAttrs_mapType /* 0 */:
                i3 = 14;
                break;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                i2 = 32;
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                i2 = 50;
                break;
            default:
                i2 = 38;
                i3 = 24;
                break;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float fApplyDimension = TypedValue.applyDimension(1, i2, displayMetrics);
        float fApplyDimension2 = TypedValue.applyDimension(1, i3, displayMetrics);
        point.x = (int) (((double) fApplyDimension) + 0.5d);
        point.y = (int) (((double) fApplyDimension2) + 0.5d);
        return point;
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC0759k m3233a() {
        InterfaceC0759k c0757i = new C0757i(getContext());
        if (!c0757i.mo3235a()) {
            c0757i = new C0758j(getContext());
        }
        return !c0757i.mo3235a() ? new C0756h(getContext()) : c0757i;
    }
}
