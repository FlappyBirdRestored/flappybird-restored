package com.google.analytics.p009b.p010a.p011a;

import com.google.android.gms.C0467e;
import com.google.tagmanager.p020a.InterfaceC0771ad;
import com.google.tagmanager.p020a.InterfaceC0772ae;

/* JADX INFO: renamed from: com.google.analytics.b.a.a.f */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0418f implements InterfaceC0771ad {
    ESCAPE_HTML(0, 1),
    ESCAPE_HTML_RCDATA(1, 2),
    ESCAPE_HTML_ATTRIBUTE(2, 3),
    ESCAPE_HTML_ATTRIBUTE_NOSPACE(3, 4),
    FILTER_HTML_ELEMENT_NAME(4, 5),
    FILTER_HTML_ATTRIBUTES(5, 6),
    ESCAPE_JS_STRING(6, 7),
    ESCAPE_JS_VALUE(7, 8),
    ESCAPE_JS_REGEX(8, 9),
    ESCAPE_CSS_STRING(9, 10),
    FILTER_CSS_VALUE(10, 11),
    ESCAPE_URI(11, 12),
    NORMALIZE_URI(12, 13),
    FILTER_NORMALIZE_URI(13, 14),
    NO_AUTOESCAPE(14, 15),
    TEXT(15, 17),
    CONVERT_JS_VALUE_TO_EXPRESSION(16, 16);


    /* JADX INFO: renamed from: r */
    private static InterfaceC0772ae f1568r = new InterfaceC0772ae() { // from class: com.google.analytics.b.a.a.g
        @Override // com.google.tagmanager.p020a.InterfaceC0772ae
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EnumC0418f mo1468b(int i) {
            return EnumC0418f.m1803a(i);
        }
    };

    /* JADX INFO: renamed from: s */
    private final int f1570s;

    EnumC0418f(int i, int i2) {
        this.f1570s = i2;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC0418f m1803a(int i) {
        switch (i) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                return ESCAPE_HTML;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                return ESCAPE_HTML_RCDATA;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                return ESCAPE_HTML_ATTRIBUTE;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                return ESCAPE_HTML_ATTRIBUTE_NOSPACE;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                return FILTER_HTML_ELEMENT_NAME;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                return FILTER_HTML_ATTRIBUTES;
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                return ESCAPE_JS_STRING;
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                return ESCAPE_JS_VALUE;
            case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                return ESCAPE_JS_REGEX;
            case C0467e.MapAttrs_uiZoomControls /* 10 */:
                return ESCAPE_CSS_STRING;
            case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                return FILTER_CSS_VALUE;
            case C0467e.MapAttrs_useViewLifecycle /* 12 */:
                return ESCAPE_URI;
            case C0467e.MapAttrs_zOrderOnTop /* 13 */:
                return NORMALIZE_URI;
            case 14:
                return FILTER_NORMALIZE_URI;
            case 15:
                return NO_AUTOESCAPE;
            case 16:
                return CONVERT_JS_VALUE_TO_EXPRESSION;
            case 17:
                return TEXT;
            default:
                return null;
        }
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0771ad
    /* JADX INFO: renamed from: a */
    public final int mo1466a() {
        return this.f1570s;
    }
}
