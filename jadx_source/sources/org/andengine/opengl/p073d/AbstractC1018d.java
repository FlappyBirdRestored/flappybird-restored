package org.andengine.opengl.p073d;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.andengine.opengl.p063b.C0988g;
import org.andengine.opengl.p073d.p074a.C1014c;
import org.andengine.opengl.util.BufferUtils;
import org.andengine.opengl.util.C1024e;
import org.andengine.p040d.C0936c;

/* JADX INFO: renamed from: org.andengine.opengl.d.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1018d implements InterfaceC1017c {

    /* JADX INFO: renamed from: c */
    protected final int f2972c;

    /* JADX INFO: renamed from: d */
    protected final boolean f2973d;

    /* JADX INFO: renamed from: e */
    protected final int f2974e;

    /* JADX INFO: renamed from: f */
    protected final ByteBuffer f2975f;

    /* JADX INFO: renamed from: g */
    protected int f2976g = -1;

    /* JADX INFO: renamed from: h */
    protected boolean f2977h = true;

    /* JADX INFO: renamed from: i */
    protected boolean f2978i;

    /* JADX INFO: renamed from: j */
    protected final C1019e f2979j;

    /* JADX INFO: renamed from: k */
    protected final C1014c f2980k;

    public AbstractC1018d(C1019e c1019e, int i, EnumC1011a enumC1011a, boolean z, C1014c c1014c) {
        this.f2979j = c1019e;
        this.f2972c = i;
        this.f2974e = enumC1011a.m3984a();
        this.f2973d = z;
        this.f2980k = c1014c;
        this.f2975f = BufferUtils.m4005a(i * 4);
        this.f2975f.order(ByteOrder.nativeOrder());
    }

    /* JADX INFO: renamed from: c */
    private void m3996c(C1024e c1024e) {
        this.f2976g = c1024e.m4049h();
        this.f2977h = true;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo3982a();

    @Override // org.andengine.opengl.p073d.InterfaceC1017c
    /* JADX INFO: renamed from: a */
    public void mo3989a(int i, int i2) {
        GLES20.glDrawArrays(i, 0, i2);
    }

    @Override // org.andengine.opengl.p073d.InterfaceC1017c
    /* JADX INFO: renamed from: a */
    public void mo3990a(C1024e c1024e) {
        c1024e.m4038b(this.f2976g);
        this.f2976g = -1;
    }

    @Override // org.andengine.opengl.p073d.InterfaceC1017c
    /* JADX INFO: renamed from: a */
    public void mo3991a(C1024e c1024e, C0988g c0988g) {
        m3997b(c1024e);
        c0988g.mo3901a(c1024e, this.f2980k);
    }

    /* JADX INFO: renamed from: b */
    public void m3997b(C1024e c1024e) {
        if (this.f2976g == -1) {
            m3996c(c1024e);
            if (this.f2979j != null) {
                this.f2979j.m4000a(this);
            }
        }
        c1024e.m4030a(this.f2976g);
        if (this.f2977h) {
            mo3982a();
            this.f2977h = false;
        }
    }

    @Override // org.andengine.opengl.p073d.InterfaceC1017c
    /* JADX INFO: renamed from: b */
    public void mo3992b(C1024e c1024e, C0988g c0988g) {
        c0988g.mo3902b(c1024e);
    }

    @Override // org.andengine.opengl.p073d.InterfaceC1017c
    /* JADX INFO: renamed from: b */
    public boolean mo3993b() {
        return this.f2973d;
    }

    @Override // org.andengine.p040d.InterfaceC0929b
    /* JADX INFO: renamed from: c */
    public boolean mo3698c() {
        return this.f2978i;
    }

    @Override // org.andengine.opengl.p073d.InterfaceC1017c
    /* JADX INFO: renamed from: d */
    public boolean mo3994d() {
        return this.f2976g != -1;
    }

    @Override // org.andengine.opengl.p073d.InterfaceC1017c
    /* JADX INFO: renamed from: e */
    public void mo3995e() {
        this.f2976g = -1;
        this.f2977h = true;
    }

    /* JADX INFO: renamed from: f */
    public void m3998f() {
        this.f2977h = true;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.f2978i) {
            return;
        }
        mo3713n();
    }

    @Override // org.andengine.p040d.InterfaceC0929b
    /* JADX INFO: renamed from: n */
    public void mo3713n() {
        if (this.f2978i) {
            throw new C0936c();
        }
        this.f2978i = true;
        if (this.f2979j != null) {
            this.f2979j.m4003b(this);
        }
        BufferUtils.m4006a(this.f2975f);
    }
}
