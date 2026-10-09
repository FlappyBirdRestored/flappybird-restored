package org.andengine.opengl.p066c;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import org.andengine.opengl.p063b.C0985d;
import org.andengine.opengl.p073d.AbstractC1018d;
import org.andengine.opengl.p073d.EnumC1011a;
import org.andengine.opengl.p073d.p074a.C1014c;
import org.andengine.opengl.p073d.p074a.C1015d;
import org.andengine.opengl.util.C1024e;

/* JADX INFO: renamed from: org.andengine.opengl.c.g */
/* JADX INFO: loaded from: classes.dex */
public class C1010g extends AbstractC1018d {

    /* JADX INFO: renamed from: a */
    public static final C1014c f2951a = new C1015d(2).m3988a(0, "a_position", 2, 5126, false).m3988a(3, "a_textureCoordinates", 2, 5126, false).m3987a();

    /* JADX INFO: renamed from: b */
    protected final FloatBuffer f2952b;

    public C1010g() {
        super(null, 12, EnumC1011a.STATIC, true, f2951a);
        this.f2952b = this.f2975f.asFloatBuffer();
        this.f2952b.put(0, 0.0f);
        this.f2952b.put(1, 0.0f);
        this.f2952b.put(2, 0.0f);
        this.f2952b.put(3, 0.0f);
        this.f2952b.put(4, 1.0f);
        this.f2952b.put(5, 0.0f);
        this.f2952b.put(6, 1.0f);
        this.f2952b.put(7, 0.0f);
        this.f2952b.put(8, 0.0f);
        this.f2952b.put(9, 1.0f);
        this.f2952b.put(10, 0.0f);
        this.f2952b.put(11, 1.0f);
    }

    @Override // org.andengine.opengl.p073d.AbstractC1018d
    /* JADX INFO: renamed from: a */
    protected void mo3982a() {
        GLES20.glBufferData(34962, this.f2975f.limit(), this.f2975f, this.f2974e);
    }

    /* JADX INFO: renamed from: a */
    public void m3983a(C1024e c1024e, InterfaceC0990a interfaceC0990a) {
        interfaceC0990a.mo3927d(c1024e);
        mo3991a(c1024e, C0985d.m3906a());
        c1024e.m4051j();
        c1024e.m4053l();
        c1024e.m4026a(1000000.0f, 1000000.0f, 0.0f);
        c1024e.m4029a(1.0E-4f, 1.0E-4f, 0);
        mo3989a(4, 3);
        c1024e.m4052k();
        mo3992b(c1024e, C0985d.m3906a());
    }
}
