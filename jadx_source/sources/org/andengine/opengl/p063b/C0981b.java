package org.andengine.opengl.p063b;

import android.opengl.GLES20;
import org.andengine.opengl.p073d.p074a.C1014c;
import org.andengine.opengl.util.C1024e;

/* JADX INFO: renamed from: org.andengine.opengl.b.b */
/* JADX INFO: loaded from: classes.dex */
public class C0981b extends C0988g {

    /* JADX INFO: renamed from: a */
    public static int f2848a = -1;

    /* JADX INFO: renamed from: b */
    public static int f2849b = -1;

    /* JADX INFO: renamed from: c */
    private static C0981b f2850c;

    private C0981b() {
        super("uniform mat4 u_modelViewProjectionMatrix;\nattribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_textureCoordinates;\nvarying vec4 v_color;\nvarying vec2 v_textureCoordinates;\nvoid main() {\n\tv_color = a_color;\n\tv_textureCoordinates = a_textureCoordinates;\n\tgl_Position = u_modelViewProjectionMatrix * a_position;\n}", "precision lowp float;\nuniform sampler2D u_texture_0;\nvarying lowp vec4 v_color;\nvarying mediump vec2 v_textureCoordinates;\nvoid main() {\n\tgl_FragColor = v_color * texture2D(u_texture_0, v_textureCoordinates);\n}");
    }

    /* JADX INFO: renamed from: a */
    public static C0981b m3903a() {
        if (f2850c == null) {
            f2850c = new C0981b();
        }
        return f2850c;
    }

    @Override // org.andengine.opengl.p063b.C0988g
    /* JADX INFO: renamed from: a */
    protected void mo3900a(C1024e c1024e) {
        GLES20.glBindAttribLocation(this.f2878h, 0, "a_position");
        GLES20.glBindAttribLocation(this.f2878h, 1, "a_color");
        GLES20.glBindAttribLocation(this.f2878h, 3, "a_textureCoordinates");
        super.mo3900a(c1024e);
        f2848a = m3912a("u_modelViewProjectionMatrix");
        f2849b = m3912a("u_texture_0");
    }

    @Override // org.andengine.opengl.p063b.C0988g
    /* JADX INFO: renamed from: a */
    public void mo3901a(C1024e c1024e, C1014c c1014c) {
        super.mo3901a(c1024e, c1014c);
        GLES20.glUniformMatrix4fv(f2848a, 1, false, c1024e.m4057p(), 0);
        GLES20.glUniform1i(f2849b, 0);
    }
}
