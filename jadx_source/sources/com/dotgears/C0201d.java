package com.dotgears;

/* JADX INFO: renamed from: com.dotgears.d */
/* JADX INFO: loaded from: classes.dex */
public class C0201d {

    /* JADX INFO: renamed from: a */
    public boolean f504a;

    /* JADX INFO: renamed from: b */
    public String f505b;

    /* JADX INFO: renamed from: c */
    public int f506c;

    /* JADX INFO: renamed from: d */
    public int[] f507d;

    /* JADX INFO: renamed from: e */
    public float f508e;

    /* JADX INFO: renamed from: f */
    public boolean f509f;

    /* JADX INFO: renamed from: g */
    public int f510g;

    /* JADX INFO: renamed from: h */
    public int f511h;

    /* JADX INFO: renamed from: i */
    public int f512i;

    /* JADX INFO: renamed from: j */
    public int f513j;

    public C0201d(int i, String str, int[] iArr, int i2, int i3, boolean z) {
        this.f505b = str;
        this.f506c = i2;
        this.f507d = new int[this.f506c];
        System.arraycopy(iArr, 0, this.f507d, 0, this.f506c);
        this.f508e = 1000 / i3;
        this.f509f = z;
        this.f510g = i;
    }

    /* JADX INFO: renamed from: a */
    public void m823a() {
        this.f511h = 0;
        this.f512i = 0;
        this.f513j = this.f507d[0];
    }

    /* JADX INFO: renamed from: a */
    public void m824a(float f) {
        if (this.f504a) {
            return;
        }
        this.f511h += 15;
        if (this.f511h >= this.f508e) {
            this.f511h = 0;
            this.f512i++;
            if (this.f512i >= this.f506c) {
                if (this.f509f) {
                    this.f512i = 0;
                } else {
                    this.f504a = true;
                }
                this.f512i = 0;
            }
            this.f513j = this.f507d[this.f512i];
        }
    }

    /* JADX INFO: renamed from: b */
    void m825b() {
        if (!this.f509f && this.f504a) {
            m823a();
        }
        this.f504a = false;
    }
}
