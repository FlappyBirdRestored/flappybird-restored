package org.andengine.opengl.p073d;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import org.andengine.opengl.p073d.p074a.C1014c;
import org.andengine.opengl.util.BufferUtils;
import org.andengine.p040d.p056i.C0949a;

/* JADX INFO: renamed from: org.andengine.opengl.d.b */
/* JADX INFO: loaded from: classes.dex */
public class C1016b extends AbstractC1018d {

    /* JADX INFO: renamed from: a */
    protected final float[] f2970a;

    /* JADX INFO: renamed from: b */
    protected final FloatBuffer f2971b;

    public C1016b(C1019e c1019e, int i, EnumC1011a enumC1011a, boolean z, C1014c c1014c) {
        super(c1019e, i, enumC1011a, z, c1014c);
        this.f2970a = new float[i];
        if (C0949a.f2786d) {
            this.f2971b = this.f2975f.asFloatBuffer();
        } else {
            this.f2971b = null;
        }
    }

    @Override // org.andengine.opengl.p073d.AbstractC1018d
    /* JADX INFO: renamed from: a */
    protected void mo3982a() {
        if (!C0949a.f2786d) {
            BufferUtils.m4007a(this.f2975f, this.f2970a, this.f2970a.length, 0);
            GLES20.glBufferData(34962, this.f2975f.limit(), this.f2975f, this.f2974e);
        } else {
            this.f2971b.position(0);
            this.f2971b.put(this.f2970a);
            GLES20.glBufferData(34962, this.f2975f.capacity(), this.f2975f, this.f2974e);
        }
    }
}
