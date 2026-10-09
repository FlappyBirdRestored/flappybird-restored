package org.andengine.opengl.p063b;

import android.opengl.GLES20;
import org.andengine.opengl.p073d.p074a.C1014c;
import org.andengine.opengl.util.C1024e;

/* JADX INFO: renamed from: org.andengine.opengl.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C0977a extends C0988g {

    /* JADX INFO: renamed from: a */
    public static int f2846a = -1;

    /* JADX INFO: renamed from: b */
    private static C0977a f2847b;

    private C0977a() {
        super("uniform mat4 u_modelViewProjectionMatrix;\nattribute vec4 a_position;\nattribute vec4 a_color;\nvarying vec4 v_color;\nvoid main() {\n\tgl_Position = u_modelViewProjectionMatrix * a_position;\n\tv_color = a_color;\n}", "precision lowp float;\nvarying vec4 v_color;\nvoid main() {\n\tgl_FragColor = v_color;\n}");
    }

    /* JADX INFO: renamed from: a */
    public static C0977a m3899a() {
        if (f2847b == null) {
            f2847b = new C0977a();
        }
        return f2847b;
    }

    @Override // org.andengine.opengl.p063b.C0988g
    /* JADX INFO: renamed from: a */
    protected void mo3900a(C1024e c1024e) {
        GLES20.glBindAttribLocation(this.f2878h, 0, "a_position");
        GLES20.glBindAttribLocation(this.f2878h, 1, "a_color");
        super.mo3900a(c1024e);
        f2846a = m3912a("u_modelViewProjectionMatrix");
    }

    @Override // org.andengine.opengl.p063b.C0988g
    /* JADX INFO: renamed from: a */
    public void mo3901a(C1024e c1024e, C1014c c1014c) {
        GLES20.glDisableVertexAttribArray(3);
        super.mo3901a(c1024e, c1014c);
        GLES20.glUniformMatrix4fv(f2846a, 1, false, c1024e.m4057p(), 0);
    }

    @Override // org.andengine.opengl.p063b.C0988g
    /* JADX INFO: renamed from: b */
    public void mo3902b(C1024e c1024e) {
        GLES20.glEnableVertexAttribArray(3);
        super.mo3902b(c1024e);
    }
}
