package org.andengine.p033c.p038d.p039a;

import org.andengine.opengl.p066c.p072c.InterfaceC1004b;
import org.andengine.opengl.p073d.C1016b;
import org.andengine.opengl.p073d.C1019e;
import org.andengine.opengl.p073d.EnumC1011a;
import org.andengine.opengl.p073d.p074a.C1014c;
import org.andengine.p033c.p038d.C0912a;

/* JADX INFO: renamed from: org.andengine.c.d.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0913a extends C1016b implements InterfaceC0914b {
    public C0913a(C1019e c1019e, int i, EnumC1011a enumC1011a, boolean z, C1014c c1014c) {
        super(c1019e, i, enumC1011a, z, c1014c);
    }

    @Override // org.andengine.p033c.p038d.p039a.InterfaceC0914b
    /* JADX INFO: renamed from: a */
    public void mo3745a(C0912a c0912a) {
        float[] fArr = this.f2970a;
        float fM3816f = c0912a.m3706g().m3816f();
        fArr[2] = fM3816f;
        fArr[7] = fM3816f;
        fArr[12] = fM3816f;
        fArr[17] = fM3816f;
        m3998f();
    }

    @Override // org.andengine.p033c.p038d.p039a.InterfaceC0914b
    /* JADX INFO: renamed from: a */
    public void mo3746a(C0912a c0912a, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float[] fArr = this.f2970a;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[5] = f3;
        fArr[6] = f4;
        fArr[10] = f5;
        fArr[11] = f6;
        fArr[15] = f7;
        fArr[16] = f8;
        m3998f();
    }

    @Override // org.andengine.p033c.p038d.p039a.InterfaceC0914b
    /* JADX INFO: renamed from: b */
    public void mo3747b(C0912a c0912a) {
        float[] fArr = this.f2970a;
        float fO = c0912a.m3724o();
        float fP = c0912a.m3725p();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = fP;
        fArr[10] = fO;
        fArr[11] = 0.0f;
        fArr[15] = fO;
        fArr[16] = fP;
        m3998f();
    }

    @Override // org.andengine.p033c.p038d.p039a.InterfaceC0914b
    /* JADX INFO: renamed from: c */
    public void mo3748c(C0912a c0912a) {
        float fMo3964d;
        float fMo3965e;
        float fMo3966f;
        float fMo3967g;
        float[] fArr = this.f2970a;
        InterfaceC1004b interfaceC1004bM3739t = c0912a.m3739t();
        if (c0912a.m3741v()) {
            if (c0912a.m3740u()) {
                fMo3964d = interfaceC1004bM3739t.mo3965e();
                fMo3965e = interfaceC1004bM3739t.mo3964d();
                fMo3966f = interfaceC1004bM3739t.mo3967g();
                fMo3967g = interfaceC1004bM3739t.mo3966f();
            } else {
                fMo3964d = interfaceC1004bM3739t.mo3964d();
                fMo3965e = interfaceC1004bM3739t.mo3965e();
                fMo3966f = interfaceC1004bM3739t.mo3967g();
                fMo3967g = interfaceC1004bM3739t.mo3966f();
            }
        } else if (c0912a.m3740u()) {
            fMo3964d = interfaceC1004bM3739t.mo3965e();
            fMo3965e = interfaceC1004bM3739t.mo3964d();
            fMo3966f = interfaceC1004bM3739t.mo3966f();
            fMo3967g = interfaceC1004bM3739t.mo3967g();
        } else {
            fMo3964d = interfaceC1004bM3739t.mo3964d();
            fMo3965e = interfaceC1004bM3739t.mo3965e();
            fMo3966f = interfaceC1004bM3739t.mo3966f();
            fMo3967g = interfaceC1004bM3739t.mo3967g();
        }
        if (interfaceC1004bM3739t.mo3968h()) {
            fArr[3] = fMo3965e;
            fArr[4] = fMo3966f;
            fArr[8] = fMo3964d;
            fArr[9] = fMo3966f;
            fArr[13] = fMo3965e;
            fArr[14] = fMo3967g;
            fArr[18] = fMo3964d;
            fArr[19] = fMo3967g;
        } else {
            fArr[3] = fMo3964d;
            fArr[4] = fMo3966f;
            fArr[8] = fMo3964d;
            fArr[9] = fMo3967g;
            fArr[13] = fMo3965e;
            fArr[14] = fMo3966f;
            fArr[18] = fMo3965e;
            fArr[19] = fMo3967g;
        }
        m3998f();
    }
}
