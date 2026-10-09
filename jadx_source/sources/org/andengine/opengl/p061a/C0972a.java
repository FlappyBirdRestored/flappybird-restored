package org.andengine.opengl.p061a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import org.andengine.opengl.p066c.EnumC1002c;
import org.andengine.opengl.p066c.InterfaceC0990a;
import org.andengine.opengl.util.C1024e;
import org.andengine.p040d.p054g.C0945a;

/* JADX INFO: renamed from: org.andengine.opengl.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0972a {

    /* JADX INFO: renamed from: a */
    protected final Paint f2822a;

    /* JADX INFO: renamed from: b */
    protected final Paint.FontMetrics f2823b;

    /* JADX INFO: renamed from: c */
    protected final Canvas f2824c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC0990a f2825d;

    /* JADX INFO: renamed from: e */
    private final SparseArray f2826e;

    /* JADX INFO: renamed from: f */
    private final ArrayList f2827f;

    /* JADX INFO: renamed from: g */
    private final Paint f2828g;

    /* JADX INFO: renamed from: a */
    public float m3887a() {
        return this.f2823b.ascent;
    }

    /* JADX INFO: renamed from: a */
    protected Bitmap m3888a(C0976d c0976d) {
        String strValueOf = String.valueOf(c0976d.f2832a);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c0976d.f2835d + 2, c0976d.f2836e + 2, Bitmap.Config.ARGB_8888);
        this.f2824c.setBitmap(bitmapCreateBitmap);
        this.f2824c.drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), this.f2828g);
        m3889a(strValueOf, -c0976d.f2837f, -(c0976d.f2838g + m3887a()));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: a */
    protected void m3889a(String str, float f, float f2) {
        this.f2824c.drawText(str, f + 1.0f, 1.0f + f2, this.f2822a);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m3890a(C1024e c1024e) {
        if (this.f2825d.mo3925c()) {
            ArrayList arrayList = this.f2827f;
            if (arrayList.size() > 0) {
                this.f2825d.mo3927d(c1024e);
                EnumC1002c enumC1002cMo3929f = this.f2825d.mo3929f();
                boolean z = this.f2825d.mo3930g().f2950n;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C0976d c0976d = (C0976d) arrayList.get(size);
                    if (!c0976d.m3898a()) {
                        Bitmap bitmapM3888a = m3888a(c0976d);
                        boolean z2 = C0945a.m3834a(bitmapM3888a.getWidth()) && C0945a.m3834a(bitmapM3888a.getHeight()) && enumC1002cMo3929f == EnumC1002c.RGBA_8888;
                        if (!z2) {
                            GLES20.glPixelStorei(3317, 1);
                        }
                        if (z) {
                            GLUtils.texSubImage2D(3553, 0, c0976d.f2833b, c0976d.f2834c, bitmapM3888a);
                        } else {
                            c1024e.m4032a(3553, 0, c0976d.f2833b, c0976d.f2834c, bitmapM3888a, enumC1002cMo3929f);
                        }
                        if (!z2) {
                            GLES20.glPixelStorei(3317, 4);
                        }
                        bitmapM3888a.recycle();
                    }
                }
                arrayList.clear();
                System.gc();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m3891b() {
        ArrayList arrayList = this.f2827f;
        SparseArray sparseArray = this.f2826e;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            arrayList.add((C0976d) sparseArray.valueAt(size));
        }
    }
}
