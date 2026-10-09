package org.andengine.opengl.util;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteOrder;
import java.util.Arrays;
import javax.microedition.khronos.egl.EGLConfig;
import org.andengine.opengl.p066c.EnumC1002c;
import org.andengine.opengl.view.C1026a;
import org.andengine.p026b.p031c.C0889d;
import org.andengine.p040d.p052e.C0941a;

/* JADX INFO: renamed from: org.andengine.opengl.util.e */
/* JADX INFO: loaded from: classes.dex */
public class C1024e {

    /* JADX INFO: renamed from: b */
    private String f2993b;

    /* JADX INFO: renamed from: c */
    private String f2994c;

    /* JADX INFO: renamed from: d */
    private String f2995d;

    /* JADX INFO: renamed from: e */
    private int f2996e;

    /* JADX INFO: renamed from: f */
    private int f2997f;

    /* JADX INFO: renamed from: g */
    private int f2998g;

    /* JADX INFO: renamed from: h */
    private int f2999h;

    /* JADX INFO: renamed from: i */
    private int f3000i;

    /* JADX INFO: renamed from: a */
    private final int[] f2992a = new int[1];

    /* JADX INFO: renamed from: j */
    private int f3001j = -1;

    /* JADX INFO: renamed from: k */
    private int f3002k = -1;

    /* JADX INFO: renamed from: l */
    private int f3003l = -1;

    /* JADX INFO: renamed from: m */
    private final int[] f3004m = new int[31];

    /* JADX INFO: renamed from: n */
    private int f3005n = -1;

    /* JADX INFO: renamed from: o */
    private int f3006o = 0;

    /* JADX INFO: renamed from: p */
    private int f3007p = -1;

    /* JADX INFO: renamed from: q */
    private int f3008q = -1;

    /* JADX INFO: renamed from: r */
    private boolean f3009r = true;

    /* JADX INFO: renamed from: s */
    private boolean f3010s = true;

    /* JADX INFO: renamed from: t */
    private boolean f3011t = false;

    /* JADX INFO: renamed from: u */
    private boolean f3012u = false;

    /* JADX INFO: renamed from: v */
    private boolean f3013v = false;

    /* JADX INFO: renamed from: w */
    private float f3014w = 1.0f;

    /* JADX INFO: renamed from: x */
    private final C1021b f3015x = new C1021b();

    /* JADX INFO: renamed from: y */
    private final C1021b f3016y = new C1021b();

    /* JADX INFO: renamed from: z */
    private final float[] f3017z = new float[16];

    /* JADX INFO: renamed from: A */
    private final float[] f2990A = new float[16];

    /* JADX INFO: renamed from: B */
    private final float[] f2991B = new float[16];

    /* JADX INFO: renamed from: a */
    public void m4025a(float f, float f2) {
        this.f3015x.m4017a(f, f2);
    }

    /* JADX INFO: renamed from: a */
    public void m4026a(float f, float f2, float f3) {
        this.f3015x.m4018a(f, f2, f3);
    }

    /* JADX INFO: renamed from: a */
    public void m4027a(float f, float f2, float f3, float f4) {
        this.f3015x.m4019a(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: a */
    public void m4028a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f3016y.m4020a(f, f2, f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: a */
    public void m4029a(float f, float f2, int i) {
        this.f3015x.m4022b(f, f2, i);
    }

    /* JADX INFO: renamed from: a */
    public void m4030a(int i) {
        if (this.f3001j != i) {
            this.f3001j = i;
            GLES20.glBindBuffer(34962, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m4031a(int i, int i2) {
        if (this.f3007p == i && this.f3008q == i2) {
            return;
        }
        this.f3007p = i;
        this.f3008q = i2;
        GLES20.glBlendFunc(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public void m4032a(int i, int i2, int i3, int i4, Bitmap bitmap, EnumC1002c enumC1002c) {
        GLES20.glTexSubImage2D(i, i2, i3, i4, bitmap.getWidth(), bitmap.getHeight(), enumC1002c.m3958b(), enumC1002c.m3959c(), C1020a.m4008a(bitmap, enumC1002c, ByteOrder.BIG_ENDIAN));
    }

    /* JADX INFO: renamed from: a */
    public void m4033a(C0889d c0889d, C1026a c1026a, EGLConfig eGLConfig) {
        this.f2993b = GLES20.glGetString(7938);
        this.f2994c = GLES20.glGetString(7937);
        this.f2995d = GLES20.glGetString(7939);
        this.f2996e = m4046f(34921);
        this.f2997f = m4046f(36347);
        this.f2998g = m4046f(36349);
        this.f3000i = m4046f(34930);
        this.f2999h = m4046f(3379);
        C0941a.m3825b("VERSION: " + this.f2993b);
        C0941a.m3825b("RENDERER: " + this.f2994c);
        C0941a.m3825b("EGLCONFIG: " + EGLConfig.class.getSimpleName() + "(Red=" + c1026a.m4067b() + ", Green=" + c1026a.m4068c() + ", Blue=" + c1026a.m4069d() + ", Alpha=" + c1026a.m4070e() + ", Depth=" + c1026a.m4071f() + ", Stencil=" + c1026a.m4072g() + ")");
        C0941a.m3825b("EXTENSIONS: " + this.f2995d);
        C0941a.m3825b("MAX_VERTEX_ATTRIBS: " + this.f2996e);
        C0941a.m3825b("MAX_VERTEX_UNIFORM_VECTORS: " + this.f2997f);
        C0941a.m3825b("MAX_FRAGMENT_UNIFORM_VECTORS: " + this.f2998g);
        C0941a.m3825b("MAX_TEXTURE_IMAGE_UNITS: " + this.f3000i);
        C0941a.m3825b("MAX_TEXTURE_SIZE: " + this.f2999h);
        this.f3015x.m4024d();
        this.f3016y.m4024d();
        this.f3001j = -1;
        this.f3002k = -1;
        this.f3003l = -1;
        Arrays.fill(this.f3004m, -1);
        this.f3005n = -1;
        this.f3006o = 0;
        this.f3007p = -1;
        this.f3008q = -1;
        m4043d();
        m4047f();
        m4039b();
        m4041c();
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glEnableVertexAttribArray(3);
        this.f3014w = 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public boolean m4034a() {
        if (this.f3012u) {
            return true;
        }
        this.f3012u = true;
        GLES20.glEnable(3042);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m4035a(boolean z) {
        return z ? m4043d() : m4045e();
    }

    /* JADX INFO: renamed from: b */
    public void m4036b(float f, float f2, float f3) {
        this.f3016y.m4018a(f, f2, f3);
    }

    /* JADX INFO: renamed from: b */
    public void m4037b(float f, float f2, float f3, float f4) {
        this.f3016y.m4019a(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: b */
    public void m4038b(int i) {
        if (this.f3001j == i) {
            this.f3001j = -1;
        }
        this.f2992a[0] = i;
        GLES20.glDeleteBuffers(1, this.f2992a, 0);
    }

    /* JADX INFO: renamed from: b */
    public boolean m4039b() {
        if (!this.f3012u) {
            return false;
        }
        this.f3012u = false;
        GLES20.glDisable(3042);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m4040c(int i) {
        if (this.f3003l != i) {
            this.f3003l = i;
            GLES20.glUseProgram(i);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m4041c() {
        if (!this.f3013v) {
            return false;
        }
        this.f3013v = false;
        GLES20.glDisable(2884);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m4042d(int i) {
        if (this.f3004m[this.f3006o] != i) {
            this.f3004m[this.f3006o] = i;
            GLES20.glBindTexture(3553, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m4043d() {
        if (this.f3009r) {
            return true;
        }
        this.f3009r = true;
        GLES20.glEnable(3024);
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m4044e(int i) {
        if (this.f3004m[this.f3006o] == i) {
            this.f3004m[this.f3006o] = -1;
        }
        this.f2992a[0] = i;
        GLES20.glDeleteTextures(1, this.f2992a, 0);
    }

    /* JADX INFO: renamed from: e */
    public boolean m4045e() {
        if (!this.f3009r) {
            return false;
        }
        this.f3009r = false;
        GLES20.glDisable(3024);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public int m4046f(int i) {
        GLES20.glGetIntegerv(i, this.f2992a, 0);
        return this.f2992a[0];
    }

    /* JADX INFO: renamed from: f */
    public boolean m4047f() {
        if (this.f3010s) {
            return true;
        }
        this.f3010s = true;
        GLES20.glEnable(2929);
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean m4048g() {
        if (!this.f3010s) {
            return false;
        }
        this.f3010s = false;
        GLES20.glDisable(2929);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public int m4049h() {
        GLES20.glGenBuffers(1, this.f2992a, 0);
        return this.f2992a[0];
    }

    /* JADX INFO: renamed from: i */
    public int m4050i() {
        GLES20.glGenTextures(1, this.f2992a, 0);
        return this.f2992a[0];
    }

    /* JADX INFO: renamed from: j */
    public void m4051j() {
        this.f3015x.m4021b();
    }

    /* JADX INFO: renamed from: k */
    public void m4052k() {
        this.f3015x.m4023c();
    }

    /* JADX INFO: renamed from: l */
    public void m4053l() {
        this.f3015x.m4016a();
    }

    /* JADX INFO: renamed from: m */
    public void m4054m() {
        this.f3016y.m4021b();
    }

    /* JADX INFO: renamed from: n */
    public void m4055n() {
        this.f3016y.m4023c();
    }

    /* JADX INFO: renamed from: o */
    public void m4056o() {
        this.f3016y.m4016a();
    }

    /* JADX INFO: renamed from: p */
    public float[] m4057p() {
        Matrix.multiplyMM(this.f2991B, 0, this.f3016y.f2987a, this.f3016y.f2988b, this.f3015x.f2987a, this.f3015x.f2988b);
        return this.f2991B;
    }
}
