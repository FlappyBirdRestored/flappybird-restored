package com.dotgears;

import android.util.Log;

/* JADX INFO: renamed from: com.dotgears.j */
/* JADX INFO: loaded from: classes.dex */
public class C0213j {

    /* JADX INFO: renamed from: A */
    public static float f635A;

    /* JADX INFO: renamed from: B */
    public static float f636B;

    /* JADX INFO: renamed from: a */
    public static float[] f637a;

    /* JADX INFO: renamed from: b */
    public static float[] f638b;

    /* JADX INFO: renamed from: c */
    public static float[] f639c;

    /* JADX INFO: renamed from: d */
    public static float[] f640d;

    /* JADX INFO: renamed from: e */
    public static float[] f641e;

    /* JADX INFO: renamed from: f */
    public static float[] f642f;

    /* JADX INFO: renamed from: g */
    public static float[] f643g;

    /* JADX INFO: renamed from: h */
    public static float[] f644h;

    /* JADX INFO: renamed from: i */
    public static float[] f645i;

    /* JADX INFO: renamed from: j */
    public static float[] f646j;

    /* JADX INFO: renamed from: k */
    public static float[] f647k;

    /* JADX INFO: renamed from: l */
    public static float[] f648l;

    /* JADX INFO: renamed from: m */
    public static float[] f649m;

    /* JADX INFO: renamed from: n */
    public static float[] f650n;

    /* JADX INFO: renamed from: o */
    public static float[] f651o;

    /* JADX INFO: renamed from: p */
    public static float[] f652p;

    /* JADX INFO: renamed from: q */
    public static float[] f653q;

    /* JADX INFO: renamed from: r */
    public static float[] f654r;

    /* JADX INFO: renamed from: s */
    public static float[] f655s;

    /* JADX INFO: renamed from: t */
    public static float[] f656t;

    /* JADX INFO: renamed from: u */
    public static float[] f657u;

    /* JADX INFO: renamed from: v */
    public static float[] f658v;

    /* JADX INFO: renamed from: w */
    public static float[] f659w;

    /* JADX INFO: renamed from: x */
    public static C0213j f660x;

    /* JADX INFO: renamed from: y */
    public static int f661y;

    /* JADX INFO: renamed from: z */
    public static int f662z;

    C0213j() {
        f637a = new float[360];
        f638b = new float[360];
        for (int i = 0; i < 360; i++) {
            float f = (i * 3.1415925f) / 180.0f;
            f637a[i] = (float) Math.sin(f);
            f638b[i] = (float) Math.cos(f);
        }
        f639c = new float[101];
        f640d = new float[101];
        f641e = new float[101];
        f642f = new float[101];
        f643g = new float[101];
        f644h = new float[101];
        f645i = new float[101];
        f646j = new float[101];
        f647k = new float[101];
        f648l = new float[101];
        f649m = new float[101];
        f650n = new float[101];
        f651o = new float[101];
        f652p = new float[101];
        f653q = new float[101];
        f654r = new float[101];
        f655s = new float[101];
        f656t = new float[101];
        f657u = new float[101];
        f658v = new float[101];
        f659w = new float[101];
        for (int i2 = 0; i2 <= 100; i2++) {
            double d = ((double) i2) / 100.0d;
            f639c[i2] = (float) m902a(d);
            f640d[i2] = (float) m903b(d);
            f641e[i2] = (float) m871c(d);
            f642f[i2] = (float) m874d(d);
            f643g[i2] = (float) m876e(d);
            f644h[i2] = (float) m878f(d);
            f645i[i2] = (float) m880g(d);
            f646j[i2] = (float) m882h(d);
            f647k[i2] = (float) m884i(d);
            f648l[i2] = (float) m886j(d);
            f649m[i2] = (float) m888k(d);
            f650n[i2] = (float) m890l(d);
            f651o[i2] = (float) m904m(d);
            f652p[i2] = (float) m905n(d);
            f653q[i2] = (float) m906o(d);
            f654r[i2] = (float) m907p(d);
            f655s[i2] = (float) m908q(d);
            f656t[i2] = (float) m909r(d);
            f657u[i2] = (float) m910s(d);
            f658v[i2] = (float) m911t(d);
            f659w[i2] = (float) m912u(d);
        }
    }

    /* JADX INFO: renamed from: a */
    public static float m864a(float f) {
        float f2 = f;
        while (f2 > 360.0f) {
            f2 -= 360.0f;
        }
        while (f2 < 0.0f) {
            f2 += 360.0f;
        }
        return f2;
    }

    /* JADX INFO: renamed from: a */
    public static int m865a() {
        f662z = (36969 * (f662z & 65535)) + (f662z >> 16);
        f661y = ((f661y & 65535) * 18000) + (f661y >> 16);
        return Math.abs((f662z << 16) + f661y);
    }

    /* JADX INFO: renamed from: a */
    public static int m866a(int i, int i2) {
        return (m865a() % (i2 - i)) + i;
    }

    /* JADX INFO: renamed from: a */
    public static void m867a(float f, float f2, float f3, float f4, float f5) {
        float f6 = f - f3;
        float f7 = f2 - f4;
        float fM864a = m864a(f5);
        f635A = ((m872c(fM864a) * f6) - (m869b(fM864a) * f7)) + f3;
        f636B = (f6 * m869b(fM864a)) + (f7 * m872c(fM864a)) + f4;
    }

    /* JADX INFO: renamed from: a */
    public static void m868a(int i) {
        Log.i("FlappyBird", "Engine: Randomize " + i);
        f661y = i % 32000;
        f662z = i % 65535;
    }

    /* JADX INFO: renamed from: b */
    public static float m869b(float f) {
        return f637a[(int) f];
    }

    /* JADX INFO: renamed from: b */
    public static float m870b(int i) {
        return f645i[i];
    }

    /* JADX INFO: renamed from: c */
    static double m871c(double d) {
        return d < 0.5d ? 2.0d * d * d : ((((-2.0d) * d) * d) + (4.0d * d)) - 1.0d;
    }

    /* JADX INFO: renamed from: c */
    public static float m872c(float f) {
        return f638b[(int) f];
    }

    /* JADX INFO: renamed from: c */
    public static float m873c(int i) {
        return f640d[i];
    }

    /* JADX INFO: renamed from: d */
    static double m874d(double d) {
        return d * d * d;
    }

    /* JADX INFO: renamed from: d */
    public static float m875d(int i) {
        return f641e[i];
    }

    /* JADX INFO: renamed from: e */
    static double m876e(double d) {
        double d2 = d - 1.0d;
        return (d2 * d2 * d2) + 1.0d;
    }

    /* JADX INFO: renamed from: e */
    public static float m877e(int i) {
        return f642f[i];
    }

    /* JADX INFO: renamed from: f */
    static double m878f(double d) {
        if (d < 0.5d) {
            return 4.0d * d * d * d;
        }
        double d2 = (2.0d * d) - 2.0d;
        return (d2 * 0.5d * d2 * d2) + 1.0d;
    }

    /* JADX INFO: renamed from: f */
    public static float m879f(int i) {
        return f643g[i];
    }

    /* JADX INFO: renamed from: g */
    static double m880g(double d) {
        return d * d * d * d;
    }

    /* JADX INFO: renamed from: g */
    public static float m881g(int i) {
        return f644h[i];
    }

    /* JADX INFO: renamed from: h */
    static double m882h(double d) {
        double d2 = d - 1.0d;
        return (d2 * d2 * d2 * (1.0d - d)) + 1.0d;
    }

    /* JADX INFO: renamed from: h */
    public static float m883h(int i) {
        return f645i[i];
    }

    /* JADX INFO: renamed from: i */
    static double m884i(double d) {
        if (d < 0.5d) {
            return 8.0d * d * d * d * d;
        }
        double d2 = d - 1.0d;
        return (d2 * (-8.0d) * d2 * d2 * d2) + 1.0d;
    }

    /* JADX INFO: renamed from: i */
    public static float m885i(int i) {
        return f646j[i];
    }

    /* JADX INFO: renamed from: j */
    static double m886j(double d) {
        return d * d * d * d * d;
    }

    /* JADX INFO: renamed from: j */
    public static float m887j(int i) {
        return f647k[i];
    }

    /* JADX INFO: renamed from: k */
    static double m888k(double d) {
        double d2 = d - 1.0d;
        return (d2 * d2 * d2 * d2 * d2) + 1.0d;
    }

    /* JADX INFO: renamed from: k */
    public static float m889k(int i) {
        return f648l[i];
    }

    /* JADX INFO: renamed from: l */
    static double m890l(double d) {
        if (d < 0.5d) {
            return 16.0d * d * d * d * d * d;
        }
        double d2 = (2.0d * d) - 2.0d;
        return (d2 * 0.5d * d2 * d2 * d2 * d2) + 1.0d;
    }

    /* JADX INFO: renamed from: l */
    public static float m891l(int i) {
        return f649m[i];
    }

    /* JADX INFO: renamed from: m */
    public static float m892m(int i) {
        return f650n[i];
    }

    /* JADX INFO: renamed from: n */
    public static float m893n(int i) {
        return f651o[i];
    }

    /* JADX INFO: renamed from: o */
    public static float m894o(int i) {
        return f652p[i];
    }

    /* JADX INFO: renamed from: p */
    public static float m895p(int i) {
        return f653q[i];
    }

    /* JADX INFO: renamed from: q */
    public static float m896q(int i) {
        return f651o[i];
    }

    /* JADX INFO: renamed from: r */
    public static float m897r(int i) {
        return f652p[i];
    }

    /* JADX INFO: renamed from: s */
    public static float m898s(int i) {
        return f653q[i];
    }

    /* JADX INFO: renamed from: t */
    public static float m899t(int i) {
        return f657u[i];
    }

    /* JADX INFO: renamed from: u */
    public static float m900u(int i) {
        return f658v[i];
    }

    /* JADX INFO: renamed from: v */
    public static float m901v(int i) {
        return f659w[i];
    }

    /* JADX INFO: renamed from: a */
    double m902a(double d) {
        return d * d;
    }

    /* JADX INFO: renamed from: b */
    double m903b(double d) {
        return -((d - 2.0d) * d);
    }

    /* JADX INFO: renamed from: m */
    double m904m(double d) {
        return Math.sin(20.420352248333657d * d) * Math.pow(2.0d, 10.0d * (d - 1.0d));
    }

    /* JADX INFO: renamed from: n */
    double m905n(double d) {
        return (Math.sin((-20.420352248333657d) * (d + 1.0d)) * Math.pow(2.0d, (-10.0d) * d)) + 1.0d;
    }

    /* JADX INFO: renamed from: o */
    double m906o(double d) {
        return d < 0.5d ? Math.sin(20.420352248333657d * 2.0d * d) * 0.5d * Math.pow(2.0d, 10.0d * ((2.0d * d) - 1.0d)) : ((Math.sin((-20.420352248333657d) * (((2.0d * d) - 1.0d) + 1.0d)) * Math.pow(2.0d, (-10.0d) * ((2.0d * d) - 1.0d))) + 2.0d) * 0.5d;
    }

    /* JADX INFO: renamed from: p */
    double m907p(double d) {
        return ((d * d) * d) - (Math.sin(3.141592653589793d * d) * d);
    }

    /* JADX INFO: renamed from: q */
    double m908q(double d) {
        double d2 = 1.0d - d;
        return 1.0d - (((d2 * d2) * d2) - (d2 * Math.sin(3.141592653589793d * d2)));
    }

    /* JADX INFO: renamed from: r */
    double m909r(double d) {
        if (d < 0.5d) {
            double d2 = 2.0d * d;
            return (((d2 * d2) * d2) - (d2 * Math.sin(3.141592653589793d * d2))) * 0.5d;
        }
        double d3 = 1.0d - ((2.0d * d) - 1.0d);
        return ((1.0d - (((d3 * d3) * d3) - (d3 * Math.sin(3.141592653589793d * d3)))) * 0.5d) + 0.5d;
    }

    /* JADX INFO: renamed from: s */
    double m910s(double d) {
        return 1.0d - m911t(1.0d - d);
    }

    /* JADX INFO: renamed from: t */
    double m911t(double d) {
        if (d < 0.36363636363636365d) {
            return ((121.0d * d) * d) / 16.0d;
        }
        if (d < 0.7272727272727273d) {
            return (((9.075d * d) * d) - (9.9d * d)) + 3.4d;
        }
        return d < 0.9d ? (((12.066481994459833d * d) * d) - (19.63545706371191d * d)) + 8.898060941828255d : (((10.8d * d) * d) - (20.52d * d)) + 10.72d;
    }

    /* JADX INFO: renamed from: u */
    double m912u(double d) {
        return d < 0.5d ? m910s(d * 2.0d) * 0.5d : (m911t((d * 2.0d) - 1.0d) * 0.5d) + 0.5d;
    }
}
