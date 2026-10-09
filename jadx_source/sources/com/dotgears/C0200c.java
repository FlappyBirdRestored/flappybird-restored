package com.dotgears;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import com.dotgears.flappy.C0206c;
import com.dotgears.flappybird.R;
import com.google.android.gms.C0467e;
import org.andengine.input.p057a.C0950a;
import org.andengine.opengl.p066c.p072c.C1005c;
import org.andengine.p033c.p035b.C0905e;
import org.andengine.p033c.p035b.InterfaceC0903c;
import org.andengine.p033c.p038d.C0912a;

/* JADX INFO: renamed from: com.dotgears.c */
/* JADX INFO: loaded from: classes.dex */
public class C0200c extends C0905e implements InterfaceC0903c {

    /* JADX INFO: renamed from: a */
    public static C0912a[] f494a;

    /* JADX INFO: renamed from: c */
    static int f495c;

    /* JADX INFO: renamed from: d */
    public GameActivity f497d;

    /* JADX INFO: renamed from: e */
    public int f498e;

    /* JADX INFO: renamed from: b */
    public final int f496b = 50;

    /* JADX INFO: renamed from: f */
    float[] f499f = new float[10];

    /* JADX INFO: renamed from: g */
    float[] f500g = new float[10];

    /* JADX INFO: renamed from: h */
    boolean f501h = false;

    /* JADX INFO: renamed from: i */
    int f502i = 0;

    /* JADX INFO: renamed from: j */
    int f503j = 0;

    public C0200c(GameActivity gameActivity, C1005c c1005c) {
        this.f497d = gameActivity;
        this.f498e = gameActivity.getSharedPreferences("FlappyBird", 0).getInt("score", 0);
        C0210g.f583D = new C0206c(this.f498e, 0, gameActivity.getApplication().getResources().openRawResource(R.raw.atlas));
        C0210g.f583D.m842a();
        C0213j.m868a((int) System.currentTimeMillis());
        f494a = new C0912a[50];
        for (int i = 0; i < 50; i++) {
            f494a[i] = new C0912a(0.0f, 0.0f, c1005c.m3969i(), gameActivity.m4095x().m3601g());
            f494a[i].m3685a(false);
            m3691b(f494a[i]);
        }
        m3722a((InterfaceC0903c) this);
    }

    /* JADX INFO: renamed from: a */
    public static void m818a(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5) {
        C0912a c0912a = f494a[f495c];
        c0912a.m3738b(i, i2, i3, i4, f, f2, f3, f4);
        c0912a.m3690b(f5);
        c0912a.m3685a(true);
        f495c++;
    }

    /* JADX INFO: renamed from: a */
    public static void m819a(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5, float f6) {
        C0912a c0912a = f494a[f495c];
        C0213j.m867a(i, i2, (i + i3) * 0.5f, (i2 + i4) * 0.5f, f6);
        float f7 = C0213j.f635A - i;
        float f8 = C0213j.f636B - i2;
        C0213j.m867a(i, i4, (i + i3) * 0.5f, (i2 + i4) * 0.5f, f6);
        float f9 = C0213j.f635A - i;
        float f10 = C0213j.f636B - i2;
        C0213j.m867a(i3, i2, (i + i3) * 0.5f, (i2 + i4) * 0.5f, f6);
        float f11 = C0213j.f635A - i;
        float f12 = C0213j.f636B - i2;
        C0213j.m867a(i3, i4, (i + i3) * 0.5f, (i2 + i4) * 0.5f, f6);
        c0912a.m3737a(i, i2, i3, i4, f, f2, f3, f4, f7, f8, f9, f10, f11, f12, C0213j.f635A - i, C0213j.f636B - i2);
        c0912a.m3690b(f5);
        c0912a.m3685a(true);
        f495c++;
    }

    /* JADX INFO: renamed from: a */
    public void m820a() {
        for (int i = 0; i < 50; i++) {
            f494a[i].m3685a(false);
        }
        f495c = 0;
    }

    @Override // org.andengine.p033c.p035b.C0905e, org.andengine.p033c.C0896a
    /* JADX INFO: renamed from: a */
    protected void mo821a(float f) {
        super.mo821a(f);
        m820a();
        C0210g.f583D.m853a(this.f499f, this.f500g);
        if (this.f501h) {
            C0210g.f583D.mo834a(this.f502i, this.f503j);
            C0210g.f583D.mo835a(this.f502i, this.f503j, this.f502i, this.f503j);
            this.f501h = false;
        }
        C0210g.f583D.m856b();
        for (int i = 0; i < C0210g.f583D.f609v; i++) {
            switch (C0210g.f583D.f610w[i]) {
                case C0467e.MapAttrs_mapType /* 0 */:
                    int i2 = (int) C0210g.f583D.f611x[i];
                    if (this.f497d.m816o()) {
                        this.f497d.f485g.m3252b().m2008a("CgkI5J2sk6QXEAIQAA", i2);
                    }
                    if (i2 > this.f498e) {
                        SharedPreferences.Editor editorEdit = this.f497d.getSharedPreferences("FlappyBird", 0).edit();
                        editorEdit.clear();
                        editorEdit.putInt("score", (int) C0210g.f583D.f611x[i]);
                        editorEdit.commit();
                        this.f498e = i2;
                    }
                    break;
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    if (this.f497d.m816o()) {
                        this.f497d.startActivityForResult(this.f497d.m815n().m2006a("CgkI5J2sk6QXEAIQAA"), 1);
                    } else {
                        this.f497d.m817p();
                    }
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse("http://www.amazon.com/gp/mas/dl/android?p=com.dotgears.flappybird"));
                    this.f497d.startActivity(intent);
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    this.f497d.m805d();
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    this.f497d.m804c();
                    break;
                case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                    this.f497d.m805d();
                    break;
                case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                    this.f497d.m806e();
                    break;
                case C0467e.MapAttrs_uiZoomControls /* 10 */:
                    this.f497d.m809h();
                    break;
                case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                    this.f497d.m807f();
                    break;
                case C0467e.MapAttrs_useViewLifecycle /* 12 */:
                    this.f497d.m808g();
                    break;
                case C0467e.MapAttrs_zOrderOnTop /* 13 */:
                    this.f497d.m810i();
                    break;
            }
        }
    }

    @Override // org.andengine.p033c.p035b.InterfaceC0903c
    /* JADX INFO: renamed from: a */
    public boolean mo822a(C0905e c0905e, C0950a c0950a) {
        if (c0950a.m3854f()) {
            if (C0210g.f583D != null) {
                this.f501h = true;
                this.f502i = (int) c0950a.m3849b();
                this.f503j = (int) c0950a.m3851c();
            }
            this.f499f[c0950a.m3852d() % 10] = c0950a.m3849b();
            this.f500g[c0950a.m3852d() % 10] = c0950a.m3851c();
        } else if (c0950a.m3855g() || c0950a.m3858j() || c0950a.m3857i()) {
            C0210g c0210g = C0210g.f583D;
            this.f499f[c0950a.m3852d() % 10] = -100.0f;
            this.f500g[c0950a.m3852d() % 10] = -100.0f;
        }
        return true;
    }
}
