package com.google.android.gms.plus;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: com.google.android.gms.plus.j */
/* JADX INFO: loaded from: classes.dex */
class C0758j implements InterfaceC0759k {

    /* JADX INFO: renamed from: a */
    private Context f2285a;

    private C0758j(Context context) {
        this.f2285a = context;
    }

    @Override // com.google.android.gms.plus.InterfaceC0759k
    /* JADX INFO: renamed from: a */
    public Drawable mo3234a(int i) {
        String str;
        switch (i) {
            case C0467e.MapAttrs_mapType /* 0 */:
                str = "ic_plusone_small_off_client";
                break;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                str = "ic_plusone_medium_off_client";
                break;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                str = "ic_plusone_tall_off_client";
                break;
            default:
                str = "ic_plusone_standard_off_client";
                break;
        }
        return this.f2285a.getResources().getDrawable(this.f2285a.getResources().getIdentifier(str, "drawable", this.f2285a.getPackageName()));
    }

    @Override // com.google.android.gms.plus.InterfaceC0759k
    /* JADX INFO: renamed from: a */
    public boolean mo3235a() {
        return (this.f2285a.getResources().getIdentifier("ic_plusone_small_off_client", "drawable", this.f2285a.getPackageName()) == 0 || this.f2285a.getResources().getIdentifier("ic_plusone_medium_off_client", "drawable", this.f2285a.getPackageName()) == 0 || this.f2285a.getResources().getIdentifier("ic_plusone_tall_off_client", "drawable", this.f2285a.getPackageName()) == 0 || this.f2285a.getResources().getIdentifier("ic_plusone_standard_off_client", "drawable", this.f2285a.getPackageName()) == 0) ? false : true;
    }
}
