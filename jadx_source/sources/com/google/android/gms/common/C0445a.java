package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import com.google.android.gms.C0467e;
import com.google.android.gms.internal.C0585dl;

/* JADX INFO: renamed from: com.google.android.gms.common.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0445a {

    /* JADX INFO: renamed from: a */
    public static final C0445a f1608a = new C0445a(0, null);

    /* JADX INFO: renamed from: b */
    private final PendingIntent f1609b;

    /* JADX INFO: renamed from: c */
    private final int f1610c;

    public C0445a(int i, PendingIntent pendingIntent) {
        this.f1610c = i;
        this.f1609b = pendingIntent;
    }

    /* JADX INFO: renamed from: c */
    private String m1836c() {
        switch (this.f1610c) {
            case C0467e.MapAttrs_mapType /* 0 */:
                return "SUCCESS";
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                return "SERVICE_MISSING";
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                return "SERVICE_DISABLED";
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                return "SIGN_IN_REQUIRED";
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                return "INVALID_ACCOUNT";
            case C0467e.MapAttrs_uiCompass /* 6 */:
                return "RESOLUTION_REQUIRED";
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                return "NETWORK_ERROR";
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                return "INTERNAL_ERROR";
            case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                return "SERVICE_INVALID";
            case C0467e.MapAttrs_uiZoomControls /* 10 */:
                return "DEVELOPER_ERROR";
            case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                return "LICENSE_CHECK_FAILED";
            default:
                return "unknown status code " + this.f1610c;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1837a(Activity activity, int i) throws IntentSender.SendIntentException {
        if (m1838a()) {
            activity.startIntentSenderForResult(this.f1609b.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m1838a() {
        return (this.f1610c == 0 || this.f1609b == null) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public int m1839b() {
        return this.f1610c;
    }

    public String toString() {
        return C0585dl.m2701a(this).m2703a("statusCode", m1836c()).m2703a("resolution", this.f1609b).toString();
    }
}
