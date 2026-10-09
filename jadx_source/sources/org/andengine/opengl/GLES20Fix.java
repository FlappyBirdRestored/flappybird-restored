package org.andengine.opengl;

import org.andengine.p040d.p053f.C0943a;
import org.andengine.p040d.p056i.C0949a;

/* JADX INFO: loaded from: classes.dex */
public class GLES20Fix {

    /* JADX INFO: renamed from: a */
    private static boolean f2820a;

    /* JADX INFO: renamed from: b */
    private static final boolean f2821b;

    static {
        boolean z;
        try {
            System.loadLibrary("andengine");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            z = false;
        }
        f2820a = z;
        if (!C0949a.m3843a(8)) {
            f2821b = false;
        } else {
            if (!z) {
                throw new C0943a("Inherently incompatible device detected.");
            }
            f2821b = true;
        }
    }

    public static native void glVertexAttribPointer(int i, int i2, int i3, boolean z, int i4, int i5);
}
