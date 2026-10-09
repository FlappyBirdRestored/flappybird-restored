package org.andengine.input.p057a.p058a;

import android.view.MotionEvent;
import com.google.android.gms.C0467e;

/* JADX INFO: renamed from: org.andengine.input.a.a.f */
/* JADX INFO: loaded from: classes.dex */
public class C0956f extends AbstractC0951a {
    /* JADX INFO: renamed from: a */
    private void m3866a(int i, MotionEvent motionEvent) {
        int iM3868c = m3868c(motionEvent);
        m3861a(motionEvent.getX(iM3868c), motionEvent.getY(iM3868c), i, motionEvent.getPointerId(iM3868c), motionEvent);
    }

    /* JADX INFO: renamed from: b */
    private void m3867b(MotionEvent motionEvent) {
        for (int pointerCount = motionEvent.getPointerCount() - 1; pointerCount >= 0; pointerCount--) {
            m3861a(motionEvent.getX(pointerCount), motionEvent.getY(pointerCount), 2, motionEvent.getPointerId(pointerCount), motionEvent);
        }
    }

    /* JADX INFO: renamed from: c */
    private static int m3868c(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    @Override // org.andengine.input.p057a.p058a.InterfaceC0954d
    /* JADX INFO: renamed from: a */
    public void mo3865a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        switch (action) {
            case C0467e.MapAttrs_mapType /* 0 */:
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                m3866a(0, motionEvent);
                return;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
            case C0467e.MapAttrs_uiCompass /* 6 */:
                m3866a(1, motionEvent);
                return;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                m3867b(motionEvent);
                return;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                m3866a(action, motionEvent);
                return;
            default:
                throw new IllegalArgumentException("Invalid Action detected: " + action);
        }
    }
}
