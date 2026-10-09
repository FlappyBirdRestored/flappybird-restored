package com.dotgears.flappy;

import com.dotgears.C0202e;
import com.dotgears.C0210g;
import com.dotgears.C0212i;
import com.dotgears.C0213j;
import com.dotgears.C0216m;
import com.dotgears.C0220q;

/* JADX INFO: renamed from: com.dotgears.flappy.a */
/* JADX INFO: loaded from: classes.dex */
public class C0204a extends C0220q {

    /* JADX INFO: renamed from: A */
    private C0202e f524A;

    /* JADX INFO: renamed from: B */
    private int f525B = 30;

    /* JADX INFO: renamed from: q */
    float f526q;

    /* JADX INFO: renamed from: r */
    float f527r;

    /* JADX INFO: renamed from: s */
    float f528s;

    /* JADX INFO: renamed from: t */
    float f529t;

    /* JADX INFO: renamed from: u */
    float f530u;

    /* JADX INFO: renamed from: v */
    boolean f531v;

    /* JADX INFO: renamed from: w */
    boolean f532w;

    /* JADX INFO: renamed from: x */
    int f533x;

    /* JADX INFO: renamed from: y */
    float f534y;

    /* JADX INFO: renamed from: z */
    int f535z;

    public C0204a() {
        m923a("bird", 20, 20, 14, 14);
        int[] iArr = {0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1};
        m921a(0, "flap", iArr, 12, 30, false);
        m921a(1, "auto", iArr, 12, 10, true);
        this.f532w = true;
        this.f535z = C0213j.m865a() % 3;
        this.f524A = new C0202e();
    }

    /* JADX INFO: renamed from: a */
    public void m831a() {
        super.mo827a(80, 246);
        this.f526q = 0.0f;
        this.f529t = 0.0f;
        this.f530u = 1.0f;
        this.f528s = 0.4f;
        this.f531v = false;
        this.f532w = true;
        this.f533x = 0;
        m922a(1, true);
        this.f535z = C0213j.m865a() % 3;
    }

    @Override // com.dotgears.C0220q, com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo826a(float f) {
        super.mo826a(f);
        if (this.f532w) {
            this.f533x += 8;
            if (this.f533x == 360) {
                this.f533x = 0;
            }
            this.f534y = C0213j.m869b(this.f533x) * 4.0f;
            return;
        }
        this.f534y = 0.0f;
        this.f529t += this.f530u;
        if (this.f529t > 8.0f) {
            this.f529t = 8.0f;
        }
        this.f712c = (int) (this.f712c + this.f529t);
        if (this.f712c > 400 - this.f715f) {
            this.f712c = 400 - this.f715f;
            this.f530u = 0.0f;
            this.f529t = 0.0f;
        }
        this.f526q += this.f527r;
        this.f527r += this.f528s;
        if (this.f526q < -20.0f) {
            this.f526q = -20.0f;
        }
        if (this.f526q > 90.0f) {
            this.f526q = 90.0f;
        }
        this.f525B--;
        if (this.f525B == 0) {
            this.f525B = 30;
        }
        if (this.f524A.f722m) {
            this.f524A.mo826a(f);
        }
    }

    @Override // com.dotgears.C0220q, com.dotgears.C0216m
    /* JADX INFO: renamed from: a */
    public void mo828a(C0210g c0210g) {
        if (this.f723n) {
            C0212i c0212i = this.f725p[(this.f535z * 3) + 1];
            if (this.f719j != null && !this.f719j.f504a) {
                c0212i = this.f725p[this.f719j.f513j + (this.f535z * 3)];
            }
            c0210g.m851a(c0212i, this.f711b - this.f716g, ((int) this.f534y) + (this.f712c - this.f717h), 1.0f, (int) this.f526q);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m832b() {
        if (this.f532w) {
            this.f532w = false;
        }
        if (this.f712c >= 0 && !this.f531v) {
            m922a(0, true);
            this.f529t = -5.0f;
            this.f530u = 0.3f;
            this.f527r = -10.0f;
            this.f528s = 0.4f;
            C0206c.f583D.m849a(4, (C0216m) null, 5);
        }
    }
}
