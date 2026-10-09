package org.andengine.opengl.p066c.p067a;

import java.util.ArrayList;
import org.andengine.opengl.p066c.AbstractC1007d;
import org.andengine.opengl.p066c.C1008e;
import org.andengine.opengl.p066c.C1009f;
import org.andengine.opengl.p066c.EnumC1002c;
import org.andengine.opengl.p066c.p067a.p070b.InterfaceC0998b;

/* JADX INFO: renamed from: org.andengine.opengl.c.a.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0999c extends AbstractC1007d implements InterfaceC0991a {

    /* JADX INFO: renamed from: g */
    protected final int f2891g;

    /* JADX INFO: renamed from: h */
    protected final int f2892h;

    /* JADX INFO: renamed from: i */
    protected final ArrayList f2893i;

    public AbstractC0999c(C1008e c1008e, int i, int i2, EnumC1002c enumC1002c, C1009f c1009f, InterfaceC0996b interfaceC0996b) {
        super(c1008e, enumC1002c, c1009f, interfaceC0996b);
        this.f2893i = new ArrayList();
        this.f2891g = i;
        this.f2892h = i2;
    }

    /* JADX INFO: renamed from: b */
    private void m3949b(InterfaceC0998b interfaceC0998b, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Illegal negative pTextureX supplied: '" + i + "'");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Illegal negative pTextureY supplied: '" + i2 + "'");
        }
        if (interfaceC0998b.mo3947c() + i > mo3920a() || interfaceC0998b.mo3948d() + i2 > mo3922b()) {
            throw new IllegalArgumentException("Supplied pTextureAtlasSource must not exceed bounds of Texture.");
        }
    }

    @Override // org.andengine.opengl.p066c.InterfaceC0990a
    /* JADX INFO: renamed from: a */
    public int mo3920a() {
        return this.f2891g;
    }

    @Override // org.andengine.opengl.p066c.p067a.InterfaceC0991a
    /* JADX INFO: renamed from: a */
    public void mo3931a(InterfaceC0998b interfaceC0998b, int i, int i2) {
        m3949b(interfaceC0998b, i, i2);
        interfaceC0998b.mo3944a(i);
        interfaceC0998b.mo3946b(i2);
        this.f2893i.add(interfaceC0998b);
        this.f2929e = true;
    }

    @Override // org.andengine.opengl.p066c.InterfaceC0990a
    /* JADX INFO: renamed from: b */
    public int mo3922b() {
        return this.f2892h;
    }

    @Override // org.andengine.opengl.p066c.AbstractC1007d
    @Deprecated
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public InterfaceC0996b mo3950h() {
        return m3952k();
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC0996b m3952k() {
        return (InterfaceC0996b) super.mo3950h();
    }
}
