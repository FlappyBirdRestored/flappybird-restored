package com.dotgears;

import android.util.Log;

/* JADX INFO: renamed from: com.dotgears.h */
/* JADX INFO: loaded from: classes.dex */
public class C0211h {

    /* JADX INFO: renamed from: l */
    public static String f614l = "0123456789";

    /* JADX INFO: renamed from: c */
    protected int f617c;

    /* JADX INFO: renamed from: d */
    protected int f618d;

    /* JADX INFO: renamed from: e */
    protected int f619e;

    /* JADX INFO: renamed from: f */
    protected int f620f;

    /* JADX INFO: renamed from: g */
    protected int f621g;

    /* JADX INFO: renamed from: h */
    protected float f622h;

    /* JADX INFO: renamed from: a */
    public C0212i[] f615a = new C0212i[256];

    /* JADX INFO: renamed from: b */
    protected int[] f616b = new int[256];

    /* JADX INFO: renamed from: i */
    public char[] f623i = new char[256];

    /* JADX INFO: renamed from: j */
    public char[] f624j = new char[256];

    /* JADX INFO: renamed from: k */
    public int f625k = 0;

    public C0211h(String str, int i) {
        C0212i[] c0212iArrM854a = C0210g.f583D.m854a(str);
        for (int i2 = 0; i2 < c0212iArrM854a.length; i2++) {
            int i3 = Integer.parseInt(c0212iArrM854a[i2].f627a.split("_")[1]);
            this.f615a[i3] = c0212iArrM854a[i2];
            this.f616b[i3] = c0212iArrM854a[i2].f628b;
            this.f617c = this.f617c > c0212iArrM854a[i2].f629c ? this.f617c : c0212iArrM854a[i2].f629c;
            Log.i("FlappyBird", "Number: " + c0212iArrM854a[i2].f627a + " " + i3);
        }
        this.f616b[32] = this.f616b[48];
        this.f618d = i;
    }

    /* JADX INFO: renamed from: a */
    public void m861a(int i, int i2) {
        this.f625k = 0;
        int i3 = i;
        while (i2 > 0) {
            if (i3 > 0) {
                int i4 = i3 % 10;
                i3 /= 10;
                this.f624j[this.f625k] = f614l.charAt(i4);
                this.f625k++;
            }
            i2--;
        }
        for (int i5 = 0; i5 < this.f625k; i5++) {
            this.f623i[i5] = this.f624j[(this.f625k - i5) - 1];
        }
        if (this.f625k == 0) {
            this.f623i[0] = '0';
            this.f625k = 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m862a(int i, int i2, int i3, float f) {
        this.f620f = i;
        this.f621g = i2;
        this.f619e = i3;
        this.f622h = f;
    }

    /* JADX INFO: renamed from: a */
    public void m863a(C0210g c0210g) {
        int i = this.f625k;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 + this.f616b[this.f623i[i3]]) - this.f618d;
        }
        int i4 = i2 + 2;
        int i5 = this.f617c;
        if ((this.f619e & 2) != 0) {
            this.f620f -= i4 / 2;
        } else if ((this.f619e & 1) != 0) {
            this.f620f -= i4;
        }
        if ((this.f619e & 4) != 0) {
            this.f621g -= i5 / 2;
        } else if ((this.f619e & 8) != 0) {
            this.f621g -= i5;
        }
        int i6 = this.f620f;
        int i7 = this.f621g;
        for (int i8 = 0; i8 < i; i8++) {
            if (this.f615a[this.f623i[i8]] != null) {
                c0210g.m850a(this.f615a[this.f623i[i8]], i6, i7, this.f622h);
            }
            i6 = (i6 + this.f616b[this.f623i[i8]]) - this.f618d;
        }
    }
}
