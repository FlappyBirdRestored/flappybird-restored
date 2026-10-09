package org.andengine.p026b.p031c.p032a;

import android.view.View;
import org.andengine.opengl.view.RenderSurfaceView;

/* JADX INFO: renamed from: org.andengine.b.c.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0885b extends AbstractC0884a {

    /* JADX INFO: renamed from: a */
    private final float f2593a;

    /* JADX INFO: renamed from: b */
    private final float f2594b;

    /* JADX INFO: renamed from: c */
    private float f2595c;

    /* JADX INFO: renamed from: d */
    private float f2596d;

    /* JADX INFO: renamed from: e */
    private float f2597e;

    /* JADX INFO: renamed from: f */
    private float f2598f;

    /* JADX INFO: renamed from: g */
    private float f2599g;

    /* JADX INFO: renamed from: h */
    private float f2600h;

    public C0885b(float f, float f2) {
        this.f2593a = f;
        this.f2594b = f2;
    }

    @Override // org.andengine.p026b.p031c.p032a.InterfaceC0886c
    /* JADX INFO: renamed from: a */
    public void mo3652a(RenderSurfaceView renderSurfaceView, int i, int i2) {
        float f;
        float f2;
        float f3;
        AbstractC0884a.m3651a(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f4 = this.f2593a / this.f2594b;
        if (size / size2 < f4) {
            f2 = size2 * f4;
            f = size2;
            f3 = this.f2594b / f;
        } else {
            f = size / f4;
            f2 = size;
            f3 = this.f2593a / f2;
        }
        this.f2595c = size * f3;
        this.f2596d = f3 * size2;
        this.f2597e = (this.f2593a - this.f2595c) / 2.0f;
        this.f2598f = this.f2595c + this.f2597e;
        this.f2600h = (this.f2594b - this.f2596d) / 2.0f;
        this.f2599g = this.f2596d + this.f2600h;
        renderSurfaceView.m4059a((int) f2, (int) f);
    }
}
