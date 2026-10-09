package org.andengine.p026b.p031c.p032a;

import android.view.View;

/* JADX INFO: renamed from: org.andengine.b.c.a.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0884a implements InterfaceC0886c {
    /* JADX INFO: renamed from: a */
    protected static void m3651a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            throw new IllegalStateException("This IResolutionPolicy requires MeasureSpec.EXACTLY ! That means ");
        }
    }
}
