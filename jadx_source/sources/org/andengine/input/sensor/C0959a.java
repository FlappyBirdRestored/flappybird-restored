package org.andengine.input.sensor;

import java.util.Arrays;

/* JADX INFO: renamed from: org.andengine.input.sensor.a */
/* JADX INFO: loaded from: classes.dex */
public class C0959a {

    /* JADX INFO: renamed from: a */
    protected final float[] f2799a;

    /* JADX INFO: renamed from: b */
    protected int f2800b;

    /* JADX INFO: renamed from: c */
    protected int f2801c;

    /* JADX INFO: renamed from: a */
    public void mo3870a(int i) {
        this.f2800b = i;
    }

    /* JADX INFO: renamed from: a */
    public void mo3871a(float[] fArr) {
        System.arraycopy(fArr, 0, this.f2799a, 0, fArr.length);
    }

    public String toString() {
        return "Values: " + Arrays.toString(this.f2799a);
    }
}
