package org.andengine.opengl.view;

import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: renamed from: org.andengine.opengl.view.a */
/* JADX INFO: loaded from: classes.dex */
public class C1026a implements GLSurfaceView.EGLConfigChooser {

    /* JADX INFO: renamed from: a */
    private static final int[] f3020a = new int[1];

    /* JADX INFO: renamed from: b */
    private static final int[] f3021b = {12324, 5, 12323, 6, 12322, 5, 12321, 0, 12325, 0, 12326, 0, 12352, 4, 12338, 1, 12337, 2, 12344};

    /* JADX INFO: renamed from: c */
    private static final int[] f3022c = {12324, 5, 12323, 6, 12322, 5, 12321, 0, 12325, 0, 12326, 0, 12352, 4, 12512, 1, 12513, 2, 12344};

    /* JADX INFO: renamed from: d */
    private static final int[] f3023d = {12324, 5, 12323, 6, 12322, 5, 12321, 0, 12325, 0, 12326, 0, 12352, 4, 12344};

    /* JADX INFO: renamed from: e */
    private final boolean f3024e;

    /* JADX INFO: renamed from: f */
    private boolean f3025f;

    /* JADX INFO: renamed from: g */
    private boolean f3026g;

    /* JADX INFO: renamed from: h */
    private int f3027h = -1;

    /* JADX INFO: renamed from: i */
    private int f3028i = -1;

    /* JADX INFO: renamed from: j */
    private int f3029j = -1;

    /* JADX INFO: renamed from: k */
    private int f3030k = -1;

    /* JADX INFO: renamed from: l */
    private int f3031l = -1;

    /* JADX INFO: renamed from: m */
    private int f3032m = -1;

    public C1026a(boolean z) {
        this.f3024e = z;
    }

    /* JADX INFO: renamed from: a */
    private static int m4061a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, f3020a) ? f3020a[0] : i2;
    }

    /* JADX INFO: renamed from: a */
    private static int m4062a(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
        if (egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, f3020a)) {
            return f3020a[0];
        }
        throw new IllegalArgumentException("EGLCONFIG_FALLBACK failed!");
    }

    /* JADX INFO: renamed from: a */
    private EGLConfig m4063a(EGL10 egl10, EGLDisplay eGLDisplay, EnumC1027b enumC1027b) {
        f3020a[0] = 0;
        if (this.f3024e) {
            int iM4062a = m4062a(egl10, eGLDisplay, f3021b);
            if (iM4062a > 0) {
                this.f3025f = true;
                return m4064a(egl10, eGLDisplay, f3021b, iM4062a, enumC1027b);
            }
            int iM4062a2 = m4062a(egl10, eGLDisplay, f3022c);
            if (iM4062a2 > 0) {
                this.f3026g = true;
                return m4064a(egl10, eGLDisplay, f3022c, iM4062a2, enumC1027b);
            }
        }
        int iM4062a3 = m4062a(egl10, eGLDisplay, f3023d);
        if (iM4062a3 > 0) {
            return m4064a(egl10, eGLDisplay, f3023d, iM4062a3, enumC1027b);
        }
        throw new IllegalArgumentException("No " + EGLConfig.class.getSimpleName() + " found!");
    }

    /* JADX INFO: renamed from: a */
    private EGLConfig m4064a(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr, int i, EnumC1027b enumC1027b) {
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        if (egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i, f3020a)) {
            return m4065a(egl10, eGLDisplay, eGLConfigArr, enumC1027b);
        }
        throw new IllegalArgumentException("findEGLConfig failed!");
    }

    /* JADX INFO: renamed from: a */
    private EGLConfig m4065a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr, EnumC1027b enumC1027b) {
        for (EGLConfig eGLConfig : eGLConfigArr) {
            if (eGLConfig != null) {
                int iM4061a = m4061a(egl10, eGLDisplay, eGLConfig, 12324, 0);
                int iM4061a2 = m4061a(egl10, eGLDisplay, eGLConfig, 12323, 0);
                int iM4061a3 = m4061a(egl10, eGLDisplay, eGLConfig, 12322, 0);
                int iM4061a4 = m4061a(egl10, eGLDisplay, eGLConfig, 12321, 0);
                int iM4061a5 = m4061a(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int iM4061a6 = m4061a(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (enumC1027b.mo4073a(iM4061a, iM4061a2, iM4061a3, iM4061a4, iM4061a5, iM4061a6)) {
                    this.f3027h = iM4061a;
                    this.f3028i = iM4061a2;
                    this.f3029j = iM4061a3;
                    this.f3030k = iM4061a4;
                    this.f3031l = iM4061a5;
                    this.f3032m = iM4061a6;
                    return eGLConfig;
                }
            }
        }
        throw new IllegalArgumentException("No EGLConfig found!");
    }

    /* JADX INFO: renamed from: a */
    public boolean m4066a() {
        return this.f3026g;
    }

    /* JADX INFO: renamed from: b */
    public int m4067b() {
        return this.f3027h;
    }

    /* JADX INFO: renamed from: c */
    public int m4068c() {
        return this.f3028i;
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        try {
            return m4063a(egl10, eGLDisplay, EnumC1027b.f3033a);
        } catch (IllegalArgumentException e) {
            try {
                return m4063a(egl10, eGLDisplay, EnumC1027b.f3034b);
            } catch (IllegalArgumentException e2) {
                try {
                    return m4063a(egl10, eGLDisplay, EnumC1027b.f3035c);
                } catch (IllegalArgumentException e3) {
                    return m4063a(egl10, eGLDisplay, EnumC1027b.f3036d);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public int m4069d() {
        return this.f3029j;
    }

    /* JADX INFO: renamed from: e */
    public int m4070e() {
        return this.f3030k;
    }

    /* JADX INFO: renamed from: f */
    public int m4071f() {
        return this.f3031l;
    }

    /* JADX INFO: renamed from: g */
    public int m4072g() {
        return this.f3032m;
    }
}
