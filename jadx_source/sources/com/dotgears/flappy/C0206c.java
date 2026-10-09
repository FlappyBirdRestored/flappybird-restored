package com.dotgears.flappy;

import com.dotgears.C0203f;
import com.dotgears.C0210g;
import com.dotgears.C0211h;
import com.dotgears.C0212i;
import com.dotgears.C0213j;
import com.dotgears.C0215l;
import com.dotgears.C0216m;
import com.google.android.gms.C0467e;
import java.io.InputStream;

/* JADX INFO: renamed from: com.dotgears.flappy.c */
/* JADX INFO: loaded from: classes.dex */
public class C0206c extends C0210g {

    /* JADX INFO: renamed from: H */
    boolean f537H;

    /* JADX INFO: renamed from: I */
    boolean f538I;

    /* JADX INFO: renamed from: J */
    C0204a f539J;

    /* JADX INFO: renamed from: K */
    C0203f f540K;

    /* JADX INFO: renamed from: L */
    C0203f f541L;

    /* JADX INFO: renamed from: M */
    C0203f f542M;

    /* JADX INFO: renamed from: N */
    C0203f f543N;

    /* JADX INFO: renamed from: O */
    C0203f f544O;

    /* JADX INFO: renamed from: P */
    C0203f f545P;

    /* JADX INFO: renamed from: Q */
    C0203f f546Q;

    /* JADX INFO: renamed from: R */
    C0203f f547R;

    /* JADX INFO: renamed from: S */
    C0215l f548S;

    /* JADX INFO: renamed from: T */
    C0212i f549T;

    /* JADX INFO: renamed from: U */
    C0212i f550U;

    /* JADX INFO: renamed from: V */
    C0212i f551V;

    /* JADX INFO: renamed from: W */
    C0212i f552W;

    /* JADX INFO: renamed from: X */
    C0212i f553X;

    /* JADX INFO: renamed from: Y */
    C0212i f554Y;

    /* JADX INFO: renamed from: Z */
    C0212i f555Z;

    /* JADX INFO: renamed from: aa */
    C0212i f556aa;

    /* JADX INFO: renamed from: ab */
    C0212i f557ab;

    /* JADX INFO: renamed from: ac */
    int f558ac;

    /* JADX INFO: renamed from: ad */
    int f559ad;

    /* JADX INFO: renamed from: ae */
    int f560ae;

    /* JADX INFO: renamed from: af */
    int f561af;

    /* JADX INFO: renamed from: ag */
    int f562ag;

    /* JADX INFO: renamed from: ah */
    int f563ah;

    /* JADX INFO: renamed from: ai */
    int f564ai;

    /* JADX INFO: renamed from: aj */
    int f565aj;

    /* JADX INFO: renamed from: ak */
    int f566ak;

    /* JADX INFO: renamed from: al */
    C0209f f567al;

    /* JADX INFO: renamed from: am */
    C0208e f568am;

    /* JADX INFO: renamed from: an */
    C0211h f569an;

    /* JADX INFO: renamed from: ao */
    int f570ao;

    /* JADX INFO: renamed from: ap */
    private boolean f571ap;

    public C0206c(int i, int i2, InputStream inputStream) {
        super(i, i2, inputStream);
        this.f571ap = true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m833a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return i + i3 >= i5 && i <= i5 + i7 && i2 + i4 >= i6 && i2 <= i6 + i8;
    }

    @Override // com.dotgears.C0210g
    /* JADX INFO: renamed from: a */
    public void mo834a(int i, int i2) {
        if (this.f537H) {
            return;
        }
        if (i < this.f542M.f515b - 20 || i > this.f542M.f515b + this.f542M.f517d + 20 || i2 < this.f542M.f516c - 20 || i2 > this.f542M.f516c + this.f542M.f518e + 20) {
            if (!this.f539J.f532w) {
                if (this.f570ao > 0) {
                    this.f539J.m832b();
                }
            } else if (this.f567al.f673F && this.f567al.f582d == 1) {
                this.f567al.f582d = 2;
                this.f567al.f579a.m925a(1.0f, 0.0f, 0, 0.5f);
                this.f539J.f532w = false;
                this.f539J.m832b();
            }
        }
    }

    @Override // com.dotgears.C0210g
    /* JADX INFO: renamed from: a */
    public void mo835a(int i, int i2, int i3, int i4) {
        if (!this.f537H || i4 < 482 - this.f557ab.f629c || i4 > 482) {
            return;
        }
        m849a(7, (C0216m) null, 5);
    }

    @Override // com.dotgears.C0210g
    /* JADX INFO: renamed from: a */
    public void mo836a(int i, C0216m c0216m) {
        switch (i) {
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                this.f538I = true;
                m859c(0, this.f612y);
                this.f568am.m840a();
                m859c(8, 0);
                break;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                m859c(11, 0);
                break;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                m859c(13, 0);
                break;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                m839e();
                this.f540K.f673F = false;
                this.f545P.f673F = false;
                this.f547R.f673F = false;
                this.f537H = false;
                m852a(false, 0, 0.5f);
                this.f558ac = 0;
                this.f539J.m831a();
                this.f570ao = 2;
                this.f566ak = 1;
                this.f612y = 0;
                this.f567al.m841a();
                this.f584A++;
                m859c(7, 0);
                break;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                m839e();
                m852a(false, 0, 0.5f);
                m859c(6, 0);
                break;
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                m859c(3, 0);
                break;
        }
    }

    @Override // com.dotgears.C0210g
    /* JADX INFO: renamed from: b */
    public void mo837b(float f) {
        m850a(this.f549T, 0, 0, 1.0f);
        this.f558ac -= this.f570ao;
        if (this.f558ac <= -24) {
            this.f558ac = 0;
        }
        if (!this.f539J.f532w) {
            this.f562ag -= this.f570ao;
            this.f563ah -= this.f570ao;
            this.f564ai -= this.f570ao;
            if (this.f570ao > 0 && this.f566ak <= 0 && (this.f562ag == this.f539J.f711b || this.f562ag == this.f539J.f711b - 1)) {
                this.f612y++;
                m859c(9, 0);
            }
            if (this.f562ag < (-this.f554Y.f628b)) {
                this.f562ag = this.f563ah;
                this.f559ad = this.f560ae;
                this.f563ah = this.f564ai;
                this.f560ae = this.f561af;
                this.f564ai = this.f563ah + this.f565aj + this.f554Y.f628b;
                this.f561af = C0213j.m866a(180, 360);
                if (this.f566ak > 0) {
                    this.f566ak--;
                    if (this.f566ak == 0) {
                        this.f563ah = -this.f554Y.f628b;
                        this.f562ag = -this.f554Y.f628b;
                    }
                }
            }
        }
        this.f539J.mo826a(f);
        if (this.f537H) {
            m850a(this.f556aa, (288 - this.f556aa.f628b) >> 1, 150, 1.0f);
            this.f539J.f711b = (288 - this.f539J.f714e) >> 1;
            this.f539J.f712c = this.f556aa.f629c + 150 + 20;
            this.f539J.mo828a(this);
            m850a(this.f553X, this.f558ac, 512 - this.f553X.f629c, 1.0f);
        } else {
            if (this.f539J.f712c >= 400 - this.f539J.f715f && this.f570ao > 0) {
                m858c(1.0f);
                m844a(4, 0.5f);
                this.f570ao = 0;
                m859c(12, 0);
                m849a(2, this.f586C, 1000);
            }
            if (!this.f539J.f531v && this.f566ak <= 0 && this.f570ao > 0) {
                if (m833a(this.f539J.f711b, this.f539J.f712c, this.f539J.f714e, this.f539J.f715f, this.f562ag, (this.f559ad - this.f555Z.f629c) - 96, this.f555Z.f628b, this.f555Z.f629c)) {
                    m858c(1.0f);
                    m844a(4, 0.5f);
                    this.f570ao = 0;
                    m859c(12, 0);
                    m849a(3, (C0216m) null, 500);
                    m849a(2, this.f586C, 1000);
                } else if (m833a(this.f539J.f711b, this.f539J.f712c, this.f539J.f714e, this.f539J.f715f, this.f562ag, this.f559ad, this.f554Y.f628b, this.f554Y.f629c)) {
                    m858c(1.0f);
                    m844a(4, 0.5f);
                    this.f539J.f531v = true;
                    this.f570ao = 0;
                    m859c(12, 0);
                    m849a(3, (C0216m) null, 500);
                    m849a(2, this.f586C, 1000);
                }
                if (m833a(this.f539J.f711b, this.f539J.f712c, this.f539J.f714e, this.f539J.f715f, this.f563ah, (this.f560ae - this.f555Z.f629c) - 96, this.f555Z.f628b, this.f555Z.f629c) || m833a(this.f539J.f711b, this.f539J.f712c, this.f539J.f714e, this.f539J.f715f, this.f563ah, this.f560ae, this.f554Y.f628b, this.f554Y.f629c)) {
                    m858c(1.0f);
                    m844a(4, 0.5f);
                    this.f539J.f531v = true;
                    this.f570ao = 0;
                    m859c(12, 0);
                    m849a(3, (C0216m) null, 500);
                    m849a(2, this.f586C, 1000);
                }
            }
            if (this.f566ak <= 0) {
                m850a(this.f554Y, this.f562ag, this.f559ad, 1.0f);
                m850a(this.f555Z, this.f562ag, (this.f559ad - this.f555Z.f629c) - 96, 1.0f);
                m850a(this.f554Y, this.f563ah, this.f560ae, 1.0f);
                m850a(this.f555Z, this.f563ah, (this.f560ae - this.f555Z.f629c) - 96, 1.0f);
                if (this.f564ai < 288) {
                    m850a(this.f554Y, this.f564ai, this.f561af, 1.0f);
                    m850a(this.f555Z, this.f564ai, (this.f561af - this.f555Z.f629c) - 96, 1.0f);
                }
            }
            if (this.f586C.f673F && this.f586C.f701k == 2 && !this.f540K.f673F) {
                this.f540K.m829a((288 - ((this.f540K.f517d + this.f545P.f517d) + 16)) >> 1, 340);
                this.f545P.m829a(this.f540K.f515b + this.f540K.f517d + 16, 340);
            }
            if (this.f568am.f673F) {
                this.f568am.mo826a(f);
                this.f568am.mo828a(this);
            } else {
                this.f569an.m862a(144, 100, 6, 1.0f);
                this.f569an.m861a(this.f612y, 20);
                this.f569an.m863a(this);
            }
            this.f539J.mo828a(this);
            m850a(this.f553X, this.f558ac, 512 - this.f553X.f629c, 1.0f);
        }
        if (this.f567al.f673F) {
            this.f567al.mo826a(f);
            this.f567al.mo828a(this);
        }
        if (this.f537H) {
            m850a(this.f557ab, (288 - this.f557ab.f628b) >> 1, 432 - this.f557ab.f629c, 1.0f);
        }
        if (this.f540K.f673F) {
            this.f540K.mo826a(f);
            this.f540K.mo828a(this);
            this.f545P.mo826a(f);
            this.f545P.mo828a(this);
            if (this.f540K.f521h) {
                m852a(true, 5, 0.5f);
                m859c(10, 0);
            }
            if (this.f545P.f521h) {
                m859c(1, 0);
                m859c(10, 0);
            }
            if (this.f547R.f673F) {
                this.f547R.mo826a(f);
                this.f547R.mo828a(this);
                if (this.f547R.f521h) {
                    m859c(2, 0);
                }
            }
        }
    }

    @Override // com.dotgears.C0210g
    /* JADX INFO: renamed from: c */
    public void mo838c() {
        this.f569an = new C0205b();
        this.f540K = new C0203f();
        this.f540K.m830a("button_play");
        this.f545P = new C0203f();
        this.f545P.m830a("button_score");
        this.f541L = new C0203f();
        this.f541L.m830a("button_ok");
        this.f544O = new C0203f();
        this.f544O.m830a("button_menu");
        this.f542M = new C0203f();
        this.f542M.m830a("button_pause");
        this.f543N = new C0203f();
        this.f543N.m830a("button_resume");
        this.f546Q = new C0203f();
        this.f546Q.m830a("button_share");
        this.f547R = new C0203f();
        this.f547R.m830a("button_rate");
        this.f548S = new C0215l("number_score");
        this.f550U = m855b("bg_day");
        this.f551V = m855b("bg_night");
        this.f552W = m855b("bg_forest");
        this.f553X = m855b("land");
        this.f554Y = m855b("pipe_up");
        this.f555Z = m855b("pipe_down");
        this.f556aa = m855b("title");
        this.f557ab = m855b("brand_copyright");
        this.f565aj = (288 - ((this.f554Y.f628b * 3) / 2)) / 2;
        this.f562ag = this.f565aj - (this.f554Y.f628b >> 1);
        this.f559ad = 274;
        this.f563ah = this.f562ag + this.f565aj + this.f554Y.f628b;
        this.f560ae = 274;
        this.f564ai = this.f563ah + this.f565aj + this.f554Y.f628b;
        this.f561af = 274;
        this.f539J = new C0204a();
        this.f539J.m831a();
        this.f567al = new C0209f();
        this.f568am = new C0208e();
        this.f537H = true;
        m849a(6, this, 1);
    }

    /* JADX INFO: renamed from: e */
    public void m839e() {
        if (C0213j.m865a() % 10 > 3) {
            this.f549T = this.f550U;
        } else {
            this.f549T = this.f551V;
        }
        this.f601n.m917b();
        this.f540K.m829a((288 - ((this.f540K.f517d + this.f545P.f517d) + 16)) >> 1, 340);
        this.f545P.m829a(this.f540K.f515b + this.f540K.f517d + 16, 340);
        this.f547R.m829a((288 - this.f547R.f517d) >> 1, 270);
        this.f567al.f673F = false;
        this.f568am.f673F = false;
        this.f586C.f673F = false;
        this.f586C.f674G = false;
        this.f541L.f673F = false;
        this.f541L.f674G = false;
        this.f544O.f673F = false;
        this.f544O.f674G = false;
        this.f542M.f673F = false;
        this.f542M.f674G = false;
        this.f543N.f673F = false;
        this.f543N.f674G = false;
        this.f546Q.f673F = false;
        this.f546Q.f674G = false;
        this.f537H = true;
        this.f558ac = 0;
        this.f539J.m831a();
        this.f570ao = 2;
        this.f566ak = 1;
        this.f612y = 0;
    }
}
