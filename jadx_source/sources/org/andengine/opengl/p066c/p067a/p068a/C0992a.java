package org.andengine.opengl.p066c.p067a.p068a;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.util.ArrayList;
import org.andengine.opengl.p066c.C1008e;
import org.andengine.opengl.p066c.C1009f;
import org.andengine.opengl.p066c.EnumC1002c;
import org.andengine.opengl.p066c.p067a.AbstractC0999c;
import org.andengine.opengl.p066c.p067a.InterfaceC0996b;
import org.andengine.opengl.p066c.p067a.p068a.p069a.InterfaceC0994b;
import org.andengine.opengl.p066c.p071b.EnumC1001a;
import org.andengine.opengl.util.C1024e;
import org.andengine.p040d.p053f.C0944b;
import org.andengine.p040d.p054g.C0945a;

/* JADX INFO: renamed from: org.andengine.opengl.c.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0992a extends AbstractC0999c {

    /* JADX INFO: renamed from: j */
    private final EnumC1001a f2883j;

    public C0992a(C1008e c1008e, int i, int i2, EnumC1001a enumC1001a, C1009f c1009f, InterfaceC0996b interfaceC0996b) {
        super(c1008e, i, i2, enumC1001a.m3956b(), c1009f, interfaceC0996b);
        this.f2883j = enumC1001a;
    }

    public C0992a(C1008e c1008e, int i, int i2, C1009f c1009f) {
        this(c1008e, i, i2, EnumC1001a.RGBA_8888, c1009f, null);
    }

    @Override // org.andengine.opengl.p066c.AbstractC1007d
    /* JADX INFO: renamed from: e */
    protected void mo3932e(C1024e c1024e) {
        EnumC1002c enumC1002cM3956b = this.f2883j.m3956b();
        int iM3957a = enumC1002cM3956b.m3957a();
        int iM3958b = enumC1002cM3956b.m3958b();
        int iM3959c = enumC1002cM3956b.m3959c();
        GLES20.glTexImage2D(3553, 0, iM3957a, this.f2891g, this.f2892h, 0, iM3958b, iM3959c, null);
        boolean z = this.f2927c.f2950n;
        Bitmap.Config configM3955a = z ? this.f2883j.m3955a() : Bitmap.Config.ARGB_8888;
        ArrayList arrayList = this.f2893i;
        int size = arrayList.size();
        InterfaceC0996b interfaceC0996bK = m3952k();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            InterfaceC0994b interfaceC0994b = (InterfaceC0994b) arrayList.get(i2);
            try {
                Bitmap bitmapMo3935a = interfaceC0994b.mo3935a(configM3955a);
                if (bitmapMo3935a == null) {
                    throw new C0944b("Caused by: " + interfaceC0994b.getClass().toString() + " --> " + interfaceC0994b.toString() + " returned a null Bitmap.");
                }
                boolean z2 = C0945a.m3834a(bitmapMo3935a.getWidth()) && C0945a.m3834a(bitmapMo3935a.getHeight()) && enumC1002cM3956b == EnumC1002c.RGBA_8888;
                if (!z2) {
                    GLES20.glPixelStorei(3317, 1);
                }
                if (z) {
                    GLUtils.texSubImage2D(3553, 0, interfaceC0994b.mo3943a(), interfaceC0994b.mo3945b(), bitmapMo3935a, iM3958b, iM3959c);
                } else {
                    c1024e.m4032a(3553, 0, interfaceC0994b.mo3943a(), interfaceC0994b.mo3945b(), bitmapMo3935a, this.f2926b);
                }
                if (!z2) {
                    GLES20.glPixelStorei(3317, 4);
                }
                bitmapMo3935a.recycle();
                if (interfaceC0996bK != null) {
                    interfaceC0996bK.m3941a(this, interfaceC0994b);
                }
            } catch (C0944b e) {
                if (interfaceC0996bK == null) {
                    throw e;
                }
                interfaceC0996bK.m3942a(this, interfaceC0994b, e);
            }
            i = i2 + 1;
        }
    }
}
