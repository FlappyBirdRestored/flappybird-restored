package org.andengine.opengl.util;

import java.nio.ByteBuffer;
import org.andengine.p040d.p052e.C0941a;
import org.andengine.p040d.p056i.C0949a;

/* JADX INFO: loaded from: classes.dex */
public class BufferUtils {

    /* JADX INFO: renamed from: a */
    private static final boolean f2983a;

    /* JADX INFO: renamed from: b */
    private static final boolean f2984b;

    /* JADX INFO: renamed from: c */
    private static final boolean f2985c;

    static {
        boolean z;
        try {
            System.loadLibrary("andengine");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            z = false;
        }
        f2983a = z;
        if (!f2983a) {
            f2985c = false;
            if (C0949a.m3844a(11, 13)) {
                C0941a.m3828c("Creating a " + ByteBuffer.class.getSimpleName() + " will actually allocate 4x the memory than requested!");
            }
            f2984b = false;
            return;
        }
        if (C0949a.m3844a(11, 13)) {
            f2985c = true;
        } else {
            f2985c = false;
        }
        if (C0949a.m3843a(8)) {
            f2984b = true;
        } else {
            f2984b = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ByteBuffer m4005a(int i) {
        return f2985c ? jniAllocateDirect(i) : ByteBuffer.allocateDirect(i);
    }

    /* JADX INFO: renamed from: a */
    public static void m4006a(ByteBuffer byteBuffer) {
        if (f2985c) {
            jniFreeDirect(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4007a(ByteBuffer byteBuffer, float[] fArr, int i, int i2) {
        if (f2984b) {
            jniPut(byteBuffer, fArr, i, i2);
        } else {
            for (int i3 = i2; i3 < i2 + i; i3++) {
                byteBuffer.putFloat(fArr[i3]);
            }
        }
        byteBuffer.position(0);
        byteBuffer.limit(i << 2);
    }

    private static native ByteBuffer jniAllocateDirect(int i);

    private static native void jniFreeDirect(ByteBuffer byteBuffer);

    private static native void jniPut(ByteBuffer byteBuffer, float[] fArr, int i, int i2);
}
