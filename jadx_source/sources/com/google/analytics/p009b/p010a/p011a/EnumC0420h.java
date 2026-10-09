package com.google.analytics.p009b.p010a.p011a;

import com.google.android.gms.C0467e;
import com.google.tagmanager.p020a.InterfaceC0771ad;
import com.google.tagmanager.p020a.InterfaceC0772ae;

/* JADX INFO: renamed from: com.google.analytics.b.a.a.h */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0420h implements InterfaceC0771ad {
    STRING(0, 1),
    LIST(1, 2),
    MAP(2, 3),
    MACRO_REFERENCE(3, 4),
    FUNCTION_ID(4, 5),
    INTEGER(5, 6),
    TEMPLATE(6, 7),
    BOOLEAN(7, 8);


    /* JADX INFO: renamed from: i */
    private static InterfaceC0772ae f1579i = new InterfaceC0772ae() { // from class: com.google.analytics.b.a.a.i
        @Override // com.google.tagmanager.p020a.InterfaceC0772ae
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EnumC0420h mo1468b(int i) {
            return EnumC0420h.m1805a(i);
        }
    };

    /* JADX INFO: renamed from: j */
    private final int f1581j;

    EnumC0420h(int i, int i2) {
        this.f1581j = i2;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC0420h m1805a(int i) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                return STRING;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                return LIST;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                return MAP;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                return MACRO_REFERENCE;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                return FUNCTION_ID;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                return INTEGER;
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                return TEMPLATE;
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                return BOOLEAN;
            default:
                return null;
        }
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0771ad
    /* JADX INFO: renamed from: a */
    public final int mo1466a() {
        return this.f1581j;
    }
}
