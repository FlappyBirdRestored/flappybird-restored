package com.google.android.gms.maps.p015a;

import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: com.google.android.gms.maps.a.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0677v {
    /* JADX INFO: renamed from: a */
    public static byte m2965a(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : (byte) 0;
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m2966a(byte b) {
        switch (b) {
            case C0467e.MapAttrs_mapType /* 0 */:
                return Boolean.FALSE;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                return Boolean.TRUE;
            default:
                return null;
        }
    }
}
