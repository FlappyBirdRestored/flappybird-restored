package org.andengine.p033c.p035b.p036a;

import android.opengl.GLES20;
import org.andengine.opengl.util.C1024e;
import org.andengine.p026b.p027a.C0874a;
import org.andengine.p040d.p051d.C0939a;
import org.andengine.p040d.p055h.C0948c;

/* JADX INFO: renamed from: org.andengine.c.b.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0900a implements InterfaceC0901b {

    /* JADX INFO: renamed from: a */
    private C0948c f2670a = null;

    /* JADX INFO: renamed from: b */
    private final C0939a f2671b = new C0939a(0.0f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: c */
    private boolean f2672c = true;

    protected C0900a() {
    }

    public C0900a(C0939a c0939a) {
        this.f2671b.m3809a(c0939a);
    }

    @Override // org.andengine.p026b.p029b.InterfaceC0879b
    /* JADX INFO: renamed from: a */
    public void mo3641a(C1024e c1024e, C0874a c0874a) {
        if (this.f2672c) {
            GLES20.glClearColor(this.f2671b.m3807a(), this.f2671b.m3811b(), this.f2671b.m3813c(), this.f2671b.m3814d());
            GLES20.glClear(16384);
        }
    }

    @Override // org.andengine.p026b.p029b.InterfaceC0880c
    /* JADX INFO: renamed from: a_ */
    public void mo3622a_(float f) {
        if (this.f2670a != null) {
            this.f2670a.mo3622a_(f);
        }
    }
}
