package com.dotgears;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.dotgears.g */
/* JADX INFO: loaded from: classes.dex */
public class C0210g extends C0216m {

    /* JADX INFO: renamed from: D */
    public static C0210g f583D;

    /* JADX INFO: renamed from: A */
    public int f584A;

    /* JADX INFO: renamed from: B */
    public C0215l f585B;

    /* JADX INFO: renamed from: C */
    public C0219p f586C;

    /* JADX INFO: renamed from: e */
    public int f592e;

    /* JADX INFO: renamed from: f */
    public C0221r f593f;

    /* JADX INFO: renamed from: g */
    public int f594g;

    /* JADX INFO: renamed from: h */
    public C0221r f595h;

    /* JADX INFO: renamed from: i */
    public int f596i;

    /* JADX INFO: renamed from: j */
    public int f597j;

    /* JADX INFO: renamed from: k */
    public int f598k;

    /* JADX INFO: renamed from: l */
    public int f599l;

    /* JADX INFO: renamed from: m */
    public C0217n f600m;

    /* JADX INFO: renamed from: n */
    public C0217n f601n;

    /* JADX INFO: renamed from: o */
    protected C0212i f602o;

    /* JADX INFO: renamed from: p */
    protected C0212i f603p;

    /* JADX INFO: renamed from: r */
    public boolean f605r;

    /* JADX INFO: renamed from: u */
    protected int f608u;

    /* JADX INFO: renamed from: v */
    int f609v;

    /* JADX INFO: renamed from: y */
    public int f612y;

    /* JADX INFO: renamed from: z */
    public int f613z;

    /* JADX INFO: renamed from: b */
    public int[] f589b = new int[50];

    /* JADX INFO: renamed from: c */
    public int[] f590c = new int[50];

    /* JADX INFO: renamed from: d */
    public C0216m[] f591d = new C0216m[50];

    /* JADX INFO: renamed from: q */
    public int f604q = 1;

    /* JADX INFO: renamed from: s */
    protected int[] f606s = new int[10];

    /* JADX INFO: renamed from: t */
    protected int[] f607t = new int[10];

    /* JADX INFO: renamed from: w */
    int[] f610w = new int[50];

    /* JADX INFO: renamed from: x */
    double[] f611x = new double[50];

    /* JADX INFO: renamed from: E */
    public final float f587E = 0.015f;

    /* JADX INFO: renamed from: a */
    public C0212i[] f588a = new C0212i[512];

    public C0210g(int i, int i2, InputStream inputStream) {
        this.f613z = i;
        this.f584A = i2;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                if (line.length() > 1) {
                    String[] strArrSplit = line.split("\\s+");
                    C0212i c0212i = new C0212i(strArrSplit[0], Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), Float.parseFloat(strArrSplit[3]), Float.parseFloat(strArrSplit[4]), Float.parseFloat(strArrSplit[5]), Float.parseFloat(strArrSplit[6]));
                    c0212i.f632f = c0212i.f630d + c0212i.f632f;
                    c0212i.f633g = c0212i.f631e + c0212i.f633g;
                    this.f588a[c0212i.f634i] = c0212i;
                    Log.i("FlappyBird", c0212i.f627a + " " + c0212i.f628b + " " + c0212i.f629c + " " + c0212i.f630d + " " + c0212i.f631e + " " + c0212i.f632f + " " + c0212i.f633g);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m842a() {
        C0213j.f660x = new C0213j();
        this.f593f = new C0221r();
        this.f595h = new C0221r();
        this.f602o = m855b("black");
        this.f603p = m855b("white");
        this.f608u = 0;
        this.f600m = new C0217n();
        for (int i = 0; i < 20; i++) {
            this.f600m.m916a(new C0218o());
        }
        this.f601n = new C0217n();
        for (int i2 = 0; i2 < 10; i2++) {
            this.f601n.m916a(new C0202e());
        }
        this.f585B = new C0215l("number_score");
        this.f586C = new C0219p();
        this.f599l = 0;
        this.f605r = false;
        this.f609v = 0;
        m860d();
        mo838c();
        m852a(false, 0, 0.5f);
    }

    /* JADX INFO: renamed from: a */
    public void m843a(int i) {
        m859c(0, i);
        if (i > this.f613z) {
            this.f613z = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m844a(int i, float f) {
    }

    /* JADX INFO: renamed from: a */
    public void mo834a(int i, int i2) {
    }

    /* JADX INFO: renamed from: a */
    public void m845a(int i, int i2, int i3, float f, float f2, float f3) {
        C0212i c0212i = this.f588a[i];
        m846a(i2, i3, (int) (i2 + (c0212i.f628b * f)), (int) (i3 + (c0212i.f629c * f2)), c0212i.f630d, c0212i.f631e, c0212i.f632f, c0212i.f633g, f3);
    }

    /* JADX INFO: renamed from: a */
    public void mo835a(int i, int i2, int i3, int i4) {
    }

    /* JADX INFO: renamed from: a */
    public void m846a(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5) {
        C0200c.m818a(i, i2, i3, i4, f, f2, f3, f4, f5);
    }

    /* JADX INFO: renamed from: a */
    public void m847a(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5, int i5) {
        C0200c.m819a(i, i2, i3, i4, f, f2, f3, f4, f5, i5);
    }

    /* JADX INFO: renamed from: a */
    public void m848a(int i, int i2, int i3, int i4, int i5, float f) {
        C0212i c0212i = this.f588a[i];
        m846a(i2, i3, i2 + i4, i3 + i5, c0212i.f630d, c0212i.f631e, c0212i.f632f, c0212i.f633g, f);
    }

    /* JADX INFO: renamed from: a */
    public void mo836a(int i, C0216m c0216m) {
    }

    /* JADX INFO: renamed from: a */
    public void m849a(int i, C0216m c0216m, int i2) {
        this.f590c[this.f592e] = i;
        this.f591d[this.f592e] = c0216m;
        this.f589b[this.f592e] = i2;
        this.f592e++;
        if (this.f592e >= 50) {
            this.f592e = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m850a(C0212i c0212i, int i, int i2, float f) {
        m846a(i, i2, i + c0212i.f628b, i2 + c0212i.f629c, c0212i.f630d, c0212i.f631e, c0212i.f632f, c0212i.f633g, f);
    }

    /* JADX INFO: renamed from: a */
    public void m851a(C0212i c0212i, int i, int i2, float f, int i3) {
        m847a(i, i2, i + c0212i.f628b, i2 + c0212i.f629c, c0212i.f630d, c0212i.f631e, c0212i.f632f, c0212i.f633g, f, i3);
    }

    /* JADX INFO: renamed from: a */
    public void m852a(boolean z, int i, float f) {
        if (this.f593f.f732g) {
            if (z) {
                this.f593f.m925a(0.0f, 1.0f, 5, f);
            } else {
                this.f593f.m925a(1.0f, 0.0f, 5, f);
            }
            this.f593f.m924a(0.0f);
            this.f594g = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m853a(float[] fArr, float[] fArr2) {
        for (int i = 0; i < 10; i++) {
            this.f606s[i] = (int) fArr[i];
            this.f607t[i] = (int) fArr2[i];
        }
        this.f608u = 10;
    }

    /* JADX INFO: renamed from: a */
    public C0212i[] m854a(String str) {
        int i = 0;
        for (int i2 = 0; i2 < 512; i2++) {
            if (this.f588a[i2] != null && this.f588a[i2].f627a.startsWith(str)) {
                i++;
            }
        }
        if (i <= 0) {
            return null;
        }
        C0212i[] c0212iArr = new C0212i[i];
        int i3 = 0;
        for (int i4 = 0; i4 < 512; i4++) {
            if (this.f588a[i4] != null && this.f588a[i4].f627a.startsWith(str)) {
                c0212iArr[i3] = this.f588a[i4];
                i3++;
            }
        }
        return c0212iArr;
    }

    /* JADX INFO: renamed from: b */
    public C0212i m855b(String str) {
        for (int i = 0; i < 512; i++) {
            if (this.f588a[i] != null && this.f588a[i].f627a.startsWith(str)) {
                return this.f588a[i];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m856b() {
        this.f609v = 0;
        if (!this.f605r) {
            for (int i = 0; i < 50; i++) {
                if (this.f589b[i] > 0) {
                    int[] iArr = this.f589b;
                    iArr[i] = iArr[i] - 30;
                    if (this.f589b[i] <= 0) {
                        mo836a(this.f590c[i], this.f591d[i]);
                    }
                }
            }
        }
        mo837b(0.015f);
        if (!this.f605r) {
            this.f586C.mo826a(0.015f);
            this.f601n.mo826a(0.015f);
            if (!this.f593f.f732g || this.f593f.f726a != 0.0f) {
                this.f593f.m924a(0.015f);
                if (this.f593f.f732g) {
                    mo836a(this.f594g, this);
                }
            }
            if (!this.f595h.f732g || this.f595h.f726a != 0.0f) {
                this.f595h.m924a(0.015f);
            }
            if (this.f599l > 0) {
                this.f599l--;
                this.f596i = C0213j.m866a(-this.f598k, this.f598k);
                this.f597j = C0213j.m866a(-this.f598k, this.f598k);
            } else {
                this.f596i = 0;
                this.f597j = 0;
            }
        }
        this.f586C.mo828a(this);
        this.f601n.mo828a(this);
        if (!this.f593f.f732g || this.f593f.f726a != 0.0f) {
            m848a(this.f602o.f634i, -144, -256, 864, 1536, this.f593f.f726a);
        }
        if (this.f595h.f732g && this.f595h.f726a == 0.0f) {
            return;
        }
        m848a(this.f603p.f634i, -144, -256, 864, 1536, this.f595h.f726a);
    }

    /* JADX INFO: renamed from: b */
    public void mo837b(float f) {
    }

    /* JADX INFO: renamed from: b */
    public void m857b(int i, int i2) {
        ((C0202e) this.f601n.m918c()).mo827a(i, i2);
    }

    /* JADX INFO: renamed from: c */
    public void mo838c() {
    }

    /* JADX INFO: renamed from: c */
    public void m858c(float f) {
        if (this.f595h.f732g) {
            this.f595h.m925a(1.0f, 0.0f, 11, f);
            this.f595h.m924a(0.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m859c(int i, int i2) {
        this.f610w[this.f609v] = i;
        this.f611x[this.f609v] = i2;
        this.f609v++;
    }

    /* JADX INFO: renamed from: d */
    public void m860d() {
        this.f592e = 0;
        for (int i = 0; i < 50; i++) {
            this.f589b[i] = 0;
        }
    }
}
