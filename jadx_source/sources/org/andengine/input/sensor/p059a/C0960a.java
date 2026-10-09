package org.andengine.input.sensor.p059a;

import java.util.Arrays;
import org.andengine.input.sensor.C0959a;

/* JADX INFO: renamed from: org.andengine.input.sensor.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0960a extends C0959a {

    /* JADX INFO: renamed from: d */
    private static final InterfaceC0965f[] f2802d = new InterfaceC0965f[4];

    static {
        f2802d[0] = new C0961b();
        f2802d[1] = new C0962c();
        f2802d[2] = new C0963d();
        f2802d[3] = new C0964e();
    }

    @Override // org.andengine.input.sensor.C0959a
    /* JADX INFO: renamed from: a */
    public void mo3871a(float[] fArr) {
        super.mo3871a(fArr);
        f2802d[this.f2801c].mo3872a(this.f2799a);
    }

    @Override // org.andengine.input.sensor.C0959a
    public String toString() {
        return "Acceleration: " + Arrays.toString(this.f2799a);
    }
}
