package org.andengine.opengl.p063b;

import android.opengl.GLES20;
import java.util.HashMap;
import org.andengine.opengl.p063b.p064a.C0978a;
import org.andengine.opengl.p063b.p064a.C0979b;
import org.andengine.opengl.p063b.p064a.C0980c;
import org.andengine.opengl.p063b.p065b.C0983b;
import org.andengine.opengl.p063b.p065b.InterfaceC0982a;
import org.andengine.opengl.p073d.p074a.C1014c;
import org.andengine.opengl.util.C1024e;

/* JADX INFO: renamed from: org.andengine.opengl.b.g */
/* JADX INFO: loaded from: classes.dex */
public class C0988g {

    /* JADX INFO: renamed from: a */
    private static final int[] f2870a = new int[1];

    /* JADX INFO: renamed from: b */
    private static final int[] f2871b = new int[1];

    /* JADX INFO: renamed from: c */
    private static final int[] f2872c = new int[1];

    /* JADX INFO: renamed from: d */
    private static final int[] f2873d = new int[1];

    /* JADX INFO: renamed from: e */
    private static final int[] f2874e = new int[1];

    /* JADX INFO: renamed from: l */
    private static final byte[] f2875l = new byte[64];

    /* JADX INFO: renamed from: f */
    protected final InterfaceC0982a f2876f;

    /* JADX INFO: renamed from: g */
    protected final InterfaceC0982a f2877g;

    /* JADX INFO: renamed from: h */
    protected int f2878h;

    /* JADX INFO: renamed from: i */
    protected boolean f2879i;

    /* JADX INFO: renamed from: j */
    protected final HashMap f2880j;

    /* JADX INFO: renamed from: k */
    protected final HashMap f2881k;

    public C0988g(String str, String str2) {
        this(new C0983b(str), new C0983b(str2));
    }

    public C0988g(InterfaceC0982a interfaceC0982a, InterfaceC0982a interfaceC0982a2) {
        this.f2878h = -1;
        this.f2880j = new HashMap();
        this.f2881k = new HashMap();
        this.f2876f = interfaceC0982a;
        this.f2877g = interfaceC0982a2;
    }

    /* JADX INFO: renamed from: a */
    private static int m3909a(String str, int i) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader == 0) {
            throw new C0979b("Could not create Shader of type: '" + i + '\"');
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        GLES20.glGetShaderiv(iGlCreateShader, 35713, f2870a, 0);
        if (f2870a[0] == 0) {
            throw new C0978a(GLES20.glGetShaderInfoLog(iGlCreateShader), str);
        }
        return iGlCreateShader;
    }

    /* JADX INFO: renamed from: a */
    private void m3910a() {
        this.f2880j.clear();
        f2871b[0] = 0;
        GLES20.glGetProgramiv(this.f2878h, 35718, f2871b, 0);
        int i = f2871b[0];
        for (int i2 = 0; i2 < i; i2++) {
            GLES20.glGetActiveUniform(this.f2878h, i2, 64, f2872c, 0, f2873d, 0, f2874e, 0, f2875l, 0);
            int i3 = f2872c[0];
            if (i3 == 0) {
                while (i3 < 64 && f2875l[i3] != 0) {
                    i3++;
                }
            }
            String str = new String(f2875l, 0, i3);
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f2878h, str);
            if (iGlGetUniformLocation == -1) {
                int i4 = 0;
                while (i4 < 64 && f2875l[i4] != 0) {
                    i4++;
                }
                str = new String(f2875l, 0, i4);
                iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f2878h, str);
                if (iGlGetUniformLocation == -1) {
                    throw new C0980c("Invalid location for uniform: '" + str + "'.");
                }
            }
            this.f2880j.put(str, Integer.valueOf(iGlGetUniformLocation));
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    private void m3911c() {
        this.f2881k.clear();
        f2871b[0] = 0;
        GLES20.glGetProgramiv(this.f2878h, 35721, f2871b, 0);
        int i = f2871b[0];
        for (int i2 = 0; i2 < i; i2++) {
            GLES20.glGetActiveAttrib(this.f2878h, i2, 64, f2872c, 0, f2873d, 0, f2874e, 0, f2875l, 0);
            int i3 = f2872c[0];
            if (i3 == 0) {
                while (i3 < 64 && f2875l[i3] != 0) {
                    i3++;
                }
            }
            String str = new String(f2875l, 0, i3);
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f2878h, str);
            if (iGlGetAttribLocation == -1) {
                int i4 = 0;
                while (i4 < 64 && f2875l[i4] != 0) {
                    i4++;
                }
                str = new String(f2875l, 0, i4);
                iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f2878h, str);
                if (iGlGetAttribLocation == -1) {
                    throw new C0980c("Invalid location for attribute: '" + str + "'.");
                }
            }
            this.f2881k.put(str, Integer.valueOf(iGlGetAttribLocation));
        }
    }

    /* JADX INFO: renamed from: a */
    public int m3912a(String str) {
        Integer num = (Integer) this.f2880j.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new C0979b("Unexpected uniform: '" + str + "'. Existing uniforms: " + this.f2880j.toString());
    }

    /* JADX INFO: renamed from: a */
    protected void mo3900a(C1024e c1024e) {
        GLES20.glLinkProgram(this.f2878h);
        GLES20.glGetProgramiv(this.f2878h, 35714, f2870a, 0);
        if (f2870a[0] == 0) {
            throw new C0980c(GLES20.glGetProgramInfoLog(this.f2878h));
        }
        m3911c();
        m3910a();
        this.f2879i = true;
    }

    /* JADX INFO: renamed from: a */
    public void mo3901a(C1024e c1024e, C1014c c1014c) {
        if (!this.f2879i) {
            m3915c(c1024e);
        }
        c1024e.m4040c(this.f2878h);
        c1014c.m3986a();
    }

    /* JADX INFO: renamed from: a */
    public void m3913a(boolean z) {
        this.f2879i = z;
    }

    /* JADX INFO: renamed from: b */
    public void mo3902b(C1024e c1024e) {
    }

    /* JADX INFO: renamed from: b */
    public boolean m3914b() {
        return this.f2879i;
    }

    /* JADX INFO: renamed from: c */
    protected void m3915c(C1024e c1024e) {
        String strMo3904a = this.f2876f.mo3904a(c1024e);
        int iM3909a = m3909a(strMo3904a, 35633);
        String strMo3904a2 = this.f2877g.mo3904a(c1024e);
        int iM3909a2 = m3909a(strMo3904a2, 35632);
        this.f2878h = GLES20.glCreateProgram();
        GLES20.glAttachShader(this.f2878h, iM3909a);
        GLES20.glAttachShader(this.f2878h, iM3909a2);
        try {
            mo3900a(c1024e);
            GLES20.glDeleteShader(iM3909a);
            GLES20.glDeleteShader(iM3909a2);
        } catch (C0980c e) {
            throw new C0980c("VertexShaderSource:\n##########################\n" + strMo3904a + "\n##########################\n\nFragmentShaderSource:\n##########################\n" + strMo3904a2 + "\n##########################", e);
        }
    }
}
