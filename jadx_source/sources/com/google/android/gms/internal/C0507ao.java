package com.google.android.gms.internal;

import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: com.google.android.gms.internal.ao */
/* JADX INFO: loaded from: classes.dex */
public final class C0507ao {
    /* JADX INFO: renamed from: a */
    public static String m2282a(int i) {
        switch (i) {
            case C0467e.MapAttrs_mapType /* 0 */:
                return "DAILY";
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                return "WEEKLY";
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                return "ALL_TIME";
            default:
                throw new IllegalArgumentException("Unknown time span " + i);
        }
    }
}
