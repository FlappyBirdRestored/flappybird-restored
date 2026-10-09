package org.andengine.opengl.p063b;

import android.opengl.GLES20;
import org.andengine.opengl.p073d.p074a.C1014c;
import org.andengine.opengl.util.C1024e;

/* JADX INFO: renamed from: org.andengine.opengl.b.c */
/* JADX INFO: loaded from: classes.dex */
public class C0984c extends C0988g {

    /* JADX INFO: renamed from: a */
    public static int f2852a = -1;

    /* JADX INFO: renamed from: b */
    public static int f2853b = -1;

    /* JADX INFO: renamed from: c */
    public static int f2854c = -1;

    /* JADX INFO: renamed from: d */
    public static int f2855d = -1;

    /* JADX INFO: renamed from: e */
    public static int f2856e = -1;

    /* JADX INFO: renamed from: l */
    private static C0984c f2857l;

    private C0984c() {
        super("uniform mat4 u_modelViewProjectionMatrix;\nuniform float u_position_interpolation_mix_0;\nattribute vec4 a_position_0;\nattribute vec4 a_position_1;\nattribute vec2 a_textureCoordinates;\nvarying vec2 v_textureCoordinates;\nvoid main() {\n\tvec4 position = vec4(0, 0, 0, 1);\n\tposition.xy = mix(a_position_0.xy,a_position_1.xy,u_position_interpolation_mix_0);\n\tv_textureCoordinates = a_textureCoordinates;\n\tgl_Position = u_modelViewProjectionMatrix * position;\n}", "precision lowp float;\nuniform sampler2D u_texture_0;\nuniform sampler2D u_texture_1;\nuniform bool u_textureselect_texture_0;\nvarying mediump vec2 v_textureCoordinates;\nvoid main() {\n\tif(u_textureselect_texture_0) {\n\t\tgl_FragColor = texture2D(u_texture_0, v_textureCoordinates);\n\t} else {\n\t\tgl_FragColor = texture2D(u_texture_1, v_textureCoordinates);\n\t}\n}");
    }

    /* JADX INFO: renamed from: a */
    public static C0984c m3905a() {
        if (f2857l == null) {
            f2857l = new C0984c();
        }
        return f2857l;
    }

    @Override // org.andengine.opengl.p063b.C0988g
    /* JADX INFO: renamed from: a */
    protected void mo3900a(C1024e c1024e) {
        GLES20.glBindAttribLocation(this.f2878h, 4, "a_position_0");
        GLES20.glBindAttribLocation(this.f2878h, 5, "a_position_1");
        GLES20.glBindAttribLocation(this.f2878h, 3, "a_textureCoordinates");
        super.mo3900a(c1024e);
        f2852a = m3912a("u_modelViewProjectionMatrix");
        f2853b = m3912a("u_texture_0");
        f2854c = m3912a("u_texture_1");
        f2855d = m3912a("u_textureselect_texture_0");
        f2856e = m3912a("u_position_interpolation_mix_0");
    }

    @Override // org.andengine.opengl.p063b.C0988g
    /* JADX INFO: renamed from: a */
    public void mo3901a(C1024e c1024e, C1014c c1014c) {
        GLES20.glDisableVertexAttribArray(1);
        GLES20.glDisableVertexAttribArray(0);
        GLES20.glEnableVertexAttribArray(4);
        GLES20.glEnableVertexAttribArray(5);
        super.mo3901a(c1024e, c1014c);
        GLES20.glUniformMatrix4fv(f2852a, 1, false, c1024e.m4057p(), 0);
        GLES20.glUniform1i(f2853b, 0);
        GLES20.glUniform1i(f2854c, 1);
    }

    @Override // org.andengine.opengl.p063b.C0988g
    /* JADX INFO: renamed from: b */
    public void mo3902b(C1024e c1024e) {
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glDisableVertexAttribArray(4);
        GLES20.glDisableVertexAttribArray(5);
        super.mo3902b(c1024e);
    }
}
