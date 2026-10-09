package org.andengine.opengl.view;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.andengine.opengl.util.C1024e;
import org.andengine.p026b.ViewOnTouchListenerC0873a;
import org.andengine.p026b.p031c.C0889d;
import org.andengine.p040d.p052e.C0941a;

/* JADX INFO: renamed from: org.andengine.opengl.view.g */
/* JADX INFO: loaded from: classes.dex */
public class C1032g implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: a */
    final ViewOnTouchListenerC0873a f3038a;

    /* JADX INFO: renamed from: b */
    final C1026a f3039b;

    /* JADX INFO: renamed from: c */
    final boolean f3040c;

    /* JADX INFO: renamed from: d */
    final InterfaceC1033h f3041d;

    /* JADX INFO: renamed from: e */
    final C1024e f3042e = new C1024e();

    public C1032g(ViewOnTouchListenerC0873a viewOnTouchListenerC0873a, C1026a c1026a, InterfaceC1033h interfaceC1033h) {
        this.f3038a = viewOnTouchListenerC0873a;
        this.f3039b = c1026a;
        this.f3041d = interfaceC1033h;
        this.f3040c = this.f3038a.m3598d().m3658e().m3670a();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        synchronized (C1024e.class) {
            if (this.f3040c && this.f3039b.m4066a()) {
                GLES20.glClear(32768);
            }
            try {
                this.f3038a.m3586a(this.f3042e);
            } catch (InterruptedException e) {
                C0941a.m3827b("GLThread interrupted!", e);
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f3038a.m3582a(i, i2);
        GLES20.glViewport(0, 0, i, i2);
        this.f3042e.m4056o();
        if (this.f3041d != null) {
            this.f3041d.mo4075a(this.f3042e, i, i2);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        synchronized (C1024e.class) {
            C0889d c0889dM3658e = this.f3038a.m3598d().m3658e();
            this.f3042e.m4033a(c0889dM3658e, this.f3039b, eGLConfig);
            this.f3042e.m4048g();
            this.f3042e.m4034a();
            this.f3042e.m4035a(c0889dM3658e.m3671b());
            if (this.f3041d != null) {
                this.f3041d.mo4074a(this.f3042e);
            }
        }
    }
}
