package com.dotgears;

import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: com.dotgears.r */
/* JADX INFO: loaded from: classes.dex */
public class C0221r {

    /* JADX INFO: renamed from: b */
    public float f727b;

    /* JADX INFO: renamed from: c */
    public float f728c;

    /* JADX INFO: renamed from: d */
    public float f729d;

    /* JADX INFO: renamed from: e */
    public float f730e;

    /* JADX INFO: renamed from: f */
    public int f731f;

    /* JADX INFO: renamed from: h */
    private int f733h;

    /* JADX INFO: renamed from: i */
    private int f734i;

    /* JADX INFO: renamed from: j */
    private float f735j;

    /* JADX INFO: renamed from: g */
    public boolean f732g = true;

    /* JADX INFO: renamed from: a */
    public float f726a = 0.0f;

    /* JADX INFO: renamed from: a */
    public void m924a(float f) {
        if (this.f732g) {
            return;
        }
        this.f734i++;
        this.f727b = this.f734i * this.f735j;
        switch (this.f731f) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                this.f727b = C0213j.m870b((int) (this.f727b * 100.0f));
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                this.f727b = C0213j.m873c((int) (this.f727b * 100.0f));
                break;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                this.f727b = C0213j.m875d((int) (this.f727b * 100.0f));
                break;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                this.f727b = C0213j.m877e((int) (this.f727b * 100.0f));
                break;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                this.f727b = C0213j.m879f((int) (this.f727b * 100.0f));
                break;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                this.f727b = C0213j.m881g((int) (this.f727b * 100.0f));
                break;
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                this.f727b = C0213j.m883h((int) (this.f727b * 100.0f));
                break;
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                this.f727b = C0213j.m885i((int) (this.f727b * 100.0f));
                break;
            case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                this.f727b = C0213j.m887j((int) (this.f727b * 100.0f));
                break;
            case C0467e.MapAttrs_uiZoomControls /* 10 */:
                this.f727b = C0213j.m889k((int) (this.f727b * 100.0f));
                break;
            case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                this.f727b = C0213j.m891l((int) (this.f727b * 100.0f));
                break;
            case C0467e.MapAttrs_useViewLifecycle /* 12 */:
                this.f727b = C0213j.m892m((int) (this.f727b * 100.0f));
                break;
            case C0467e.MapAttrs_zOrderOnTop /* 13 */:
                this.f727b = C0213j.m893n((int) (this.f727b * 100.0f));
                break;
            case 14:
                this.f727b = C0213j.m894o((int) (this.f727b * 100.0f));
                break;
            case 15:
                this.f727b = C0213j.m895p((int) (this.f727b * 100.0f));
                break;
            case 16:
                this.f727b = C0213j.m896q((int) (this.f727b * 100.0f));
                break;
            case 17:
                this.f727b = C0213j.m897r((int) (this.f727b * 100.0f));
                break;
            case 18:
                this.f727b = C0213j.m898s((int) (this.f727b * 100.0f));
                break;
            case 19:
                this.f727b = C0213j.m899t((int) (this.f727b * 100.0f));
                break;
            case 20:
                this.f727b = C0213j.m900u((int) (this.f727b * 100.0f));
                break;
            case 21:
                this.f727b = C0213j.m901v((int) (this.f727b * 100.0f));
                break;
        }
        this.f726a = (this.f727b * this.f730e) + this.f728c;
        if (this.f734i == this.f733h) {
            this.f732g = true;
            this.f726a = this.f729d;
            this.f727b = 1.0f;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m925a(float f, float f2, int i, float f3) {
        this.f728c = f;
        this.f729d = f2;
        this.f730e = this.f729d - this.f728c;
        this.f733h = (int) (60.0f * f3);
        this.f735j = 1.0f / this.f733h;
        this.f734i = 0;
        this.f731f = i;
        this.f732g = false;
        this.f726a = this.f728c;
    }
}
