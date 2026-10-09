package org.andengine.opengl.p063b;

import android.opengl.GLES20;
import org.andengine.opengl.p073d.p074a.C1014c;
import org.andengine.opengl.util.C1024e;

/* JADX INFO: renamed from: org.andengine.opengl.b.d */
/* JADX INFO: loaded from: classes.dex */
public class C0985d extends C0988g {

    /* JADX INFO: renamed from: a */
    public static int f2858a = -1;

    /* JADX INFO: renamed from: b */
    public static int f2859b = -1;

    /* JADX INFO: renamed from: c */
    private static C0985d f2860c;

    private C0985d() {
        super("uniform mat4 u_modelViewProjectionMatrix;\nattribute vec4 a_position;\nattribute vec2 a_textureCoordinates;\nvarying vec2 v_textureCoordinates;\nvoid main() {\n\tv_textureCoordinates = a_textureCoordinates;\n\tgl_Position = u_modelViewProjectionMatrix * a_position;\n}", "precision lowp float;\nuniform sampler2D u_texture_0;\nvarying mediump vec2 v_textureCoordinates;\nvoid main() {\n\tgl_FragColor = texture2D(u_texture_0, v_textureCoordinates);\n}");
    }

    /* JADX INFO: renamed from: a */
    public static C0985d m3906a() {
        if (f2860c == null) {
            f2860c = new C0985d();
        }
        return f2860c;
    }

    @Override // org.andengine.opengl.p063b.C0988g
    /* JADX INFO: renamed from: a */
    protected void mo3900a(C1024e c1024e) {
        GLES20.glBindAttribLocation(this.f2878h, 0, "a_position");
        GLES20.glBindAttribLocation(this.f2878h, 3, "a_textureCoordinates");
        super.mo3900a(c1024e);
        f2858a = m3912a("u_modelViewProjectionMatrix");
        f2859b = m3912a("u_texture_0");
    }

    @Override // org.andengine.opengl.p063b.C0988g
    /* JADX INFO: renamed from: a */
    public void mo3901a(C1024e c1024e, C1014c c1014c) {
        GLES20.glDisableVertexAttribArray(1);
        super.mo3901a(c1024e, c1014c);
        GLES20.glUniformMatrix4fv(f2858a, 1, false, c1024e.m4057p(), 0);
        GLES20.glUniform1i(f2859b, 0);
    }

    @Override // org.andengine.opengl.p063b.C0988g
    /* JADX INFO: renamed from: b */
    public void mo3902b(C1024e c1024e) {
        GLES20.glEnableVertexAttribArray(1);
        super.mo3902b(c1024e);
    }
}
