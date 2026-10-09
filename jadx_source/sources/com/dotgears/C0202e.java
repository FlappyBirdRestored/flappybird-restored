package com.dotgears;

/* JADX INFO: renamed from: com.dotgears.e */
/* JADX INFO: loaded from: classes.dex */
public class C0202e extends C0220q {
    public C0202e() {
        m923a("blink", 10, 10, 4, 4);
        m921a(0, "blink", new int[]{0, 1, 2, 1, 0}, 5, 10, false);
        this.f722m = false;
        this.f723n = false;
        m922a(0, true);
    }

    @Override // com.dotgears.C0220q, com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo826a(float f) {
        if (this.f722m) {
            super.mo826a(f);
            if (this.f719j == null || !this.f719j.f504a) {
                return;
            }
            this.f722m = false;
            this.f723n = false;
        }
    }

    @Override // com.dotgears.C0220q
    /* JADX INFO: renamed from: a */
    public void mo827a(int i, int i2) {
        super.mo827a(i, i2);
        m922a(0, true);
    }

    @Override // com.dotgears.C0220q, com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo828a(C0210g c0210g) {
        if (this.f723n) {
            super.mo828a(c0210g);
        }
    }
}
