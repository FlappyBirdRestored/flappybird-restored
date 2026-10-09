package org.andengine.input.sensor.p060b;

import android.hardware.SensorManager;
import com.google.android.gms.C0467e;
import java.util.Arrays;
import org.andengine.input.sensor.C0959a;

/* JADX INFO: renamed from: org.andengine.input.sensor.b.b */
/* JADX INFO: loaded from: classes.dex */
public class C0969b extends C0959a {

    /* JADX INFO: renamed from: d */
    private final float[] f2809d;

    /* JADX INFO: renamed from: e */
    private final float[] f2810e;

    /* JADX INFO: renamed from: f */
    private final float[] f2811f;

    /* JADX INFO: renamed from: g */
    private int f2812g;

    /* JADX INFO: renamed from: a */
    private void m3877a() {
        SensorManager.getRotationMatrix(this.f2811f, null, this.f2809d, this.f2810e);
        switch (this.f2801c) {
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                SensorManager.remapCoordinateSystem(this.f2811f, 2, 129, this.f2811f);
                break;
        }
        float[] fArr = this.f2799a;
        SensorManager.getOrientation(this.f2811f, fArr);
        for (int length = fArr.length - 1; length >= 0; length--) {
            fArr[length] = fArr[length] * 57.295776f;
        }
    }

    @Override // org.andengine.input.sensor.C0959a
    @Deprecated
    /* JADX INFO: renamed from: a */
    public void mo3870a(int i) {
        super.mo3870a(i);
    }

    @Override // org.andengine.input.sensor.C0959a
    @Deprecated
    /* JADX INFO: renamed from: a */
    public void mo3871a(float[] fArr) {
        super.mo3871a(fArr);
    }

    /* JADX INFO: renamed from: b */
    public void m3878b(int i) {
        super.mo3870a(i);
    }

    /* JADX INFO: renamed from: b */
    public void m3879b(float[] fArr) {
        System.arraycopy(fArr, 0, this.f2809d, 0, fArr.length);
        m3877a();
    }

    /* JADX INFO: renamed from: c */
    public void m3880c(int i) {
        this.f2812g = i;
    }

    /* JADX INFO: renamed from: c */
    public void m3881c(float[] fArr) {
        System.arraycopy(fArr, 0, this.f2810e, 0, fArr.length);
        m3877a();
    }

    @Override // org.andengine.input.sensor.C0959a
    public String toString() {
        return "Orientation: " + Arrays.toString(this.f2799a);
    }
}
