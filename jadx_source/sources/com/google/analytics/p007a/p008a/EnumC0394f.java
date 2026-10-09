package com.google.analytics.p007a.p008a;

import com.google.android.gms.C0467e;
import com.google.tagmanager.p020a.InterfaceC0771ad;
import com.google.tagmanager.p020a.InterfaceC0772ae;

/* JADX INFO: renamed from: com.google.analytics.a.a.f */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0394f implements InterfaceC0771ad {
    NO_CACHE(0, 1),
    PRIVATE(1, 2),
    PUBLIC(2, 3);


    /* JADX INFO: renamed from: d */
    private static InterfaceC0772ae f1419d = new InterfaceC0772ae() { // from class: com.google.analytics.a.a.g
        @Override // com.google.tagmanager.p020a.InterfaceC0772ae
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EnumC0394f mo1468b(int i) {
            return EnumC0394f.m1465a(i);
        }
    };

    /* JADX INFO: renamed from: e */
    private final int f1421e;

    EnumC0394f(int i, int i2) {
        this.f1421e = i2;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC0394f m1465a(int i) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                return NO_CACHE;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                return PRIVATE;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                return PUBLIC;
            default:
                return null;
        }
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0771ad
    /* JADX INFO: renamed from: a */
    public final int mo1466a() {
        return this.f1421e;
    }
}
