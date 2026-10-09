package com.google.android.gms.plus;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: com.google.android.gms.plus.i */
/* JADX INFO: loaded from: classes.dex */
class C0757i implements InterfaceC0759k {

    /* JADX INFO: renamed from: a */
    private Context f2284a;

    private C0757i(Context context) {
        this.f2284a = context;
    }

    @Override // com.google.android.gms.plus.InterfaceC0759k
    /* JADX INFO: renamed from: a */
    public Drawable mo3234a(int i) {
        String str;
        try {
            Resources resources = this.f2284a.createPackageContext("com.google.android.gms", 4).getResources();
            switch (i) {
                case C0467e.MapAttrs_mapType /* 0 */:
                    str = "ic_plusone_small";
                    break;
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    str = "ic_plusone_medium";
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    str = "ic_plusone_tall";
                    break;
                default:
                    str = "ic_plusone_standard";
                    break;
            }
            return resources.getDrawable(resources.getIdentifier(str, "drawable", "com.google.android.gms"));
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    @Override // com.google.android.gms.plus.InterfaceC0759k
    /* JADX INFO: renamed from: a */
    public boolean mo3235a() {
        try {
            this.f2284a.createPackageContext("com.google.android.gms", 4).getResources();
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
