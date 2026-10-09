package org.andengine.opengl.util;

import android.graphics.Bitmap;
import com.google.android.gms.C0467e;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.andengine.opengl.p066c.EnumC1002c;

/* JADX INFO: renamed from: org.andengine.opengl.util.a */
/* JADX INFO: loaded from: classes.dex */
public class C1020a {

    /* JADX INFO: renamed from: a */
    private static /* synthetic */ int[] f2986a;

    /* JADX INFO: renamed from: a */
    public static Buffer m4008a(Bitmap bitmap, EnumC1002c enumC1002c, ByteOrder byteOrder) {
        int[] iArrM4011a = m4011a(bitmap);
        switch (m4010a()[enumC1002c.ordinal()]) {
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                return ShortBuffer.wrap(m4014c(iArrM4011a, byteOrder));
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
            default:
                throw new IllegalArgumentException("Unexpected " + EnumC1002c.class.getSimpleName() + ": '" + enumC1002c + "'.");
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                return IntBuffer.wrap(m4012a(iArrM4011a, byteOrder == ByteOrder.LITTLE_ENDIAN ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN));
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                return ShortBuffer.wrap(m4013b(iArrM4011a, byteOrder));
            case C0467e.MapAttrs_uiCompass /* 6 */:
                return ByteBuffer.wrap(m4009a(iArrM4011a));
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m4009a(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int length = iArr.length - 1; length >= 0; length--) {
            bArr[length] = (byte) ((iArr[length] >> 24) & 255);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ int[] m4010a() {
        int[] iArr = f2986a;
        if (iArr == null) {
            iArr = new int[EnumC1002c.valuesCustom().length];
            try {
                iArr[EnumC1002c.AI_88.ordinal()] = 8;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnumC1002c.A_8.ordinal()] = 6;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnumC1002c.I_8.ordinal()] = 7;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EnumC1002c.RGBA_4444.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[EnumC1002c.RGBA_5551.ordinal()] = 3;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[EnumC1002c.RGBA_8888.ordinal()] = 4;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[EnumC1002c.RGB_565.ordinal()] = 5;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[EnumC1002c.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError e8) {
            }
            f2986a = iArr;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: a */
    public static int[] m4011a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return iArr;
    }

    /* JADX INFO: renamed from: a */
    public static int[] m4012a(int[] iArr, ByteOrder byteOrder) {
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            for (int length = iArr.length - 1; length >= 0; length--) {
                int i = iArr[length];
                iArr[length] = ((i >> 16) & 255) | ((-16711936) & i) | ((i << 16) & 16711680);
            }
        } else {
            for (int length2 = iArr.length - 1; length2 >= 0; length2--) {
                int i2 = iArr[length2];
                iArr[length2] = ((i2 >> 24) & 255) | ((i2 << 8) & (-256));
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public static short[] m4013b(int[] iArr, ByteOrder byteOrder) {
        short[] sArr = new short[iArr.length];
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            for (int length = iArr.length - 1; length >= 0; length--) {
                int i = iArr[length];
                sArr[length] = (short) (((i << 5) & 7936) | ((i >> 16) & 248) | ((i >> 13) & 7) | ((i << 3) & 57344));
            }
        } else {
            for (int length2 = iArr.length - 1; length2 >= 0; length2--) {
                int i2 = iArr[length2];
                sArr[length2] = (short) (((i2 >> 3) & 31) | ((i2 >> 8) & 63488) | ((i2 >> 5) & 2016));
            }
        }
        return sArr;
    }

    /* JADX INFO: renamed from: c */
    public static short[] m4014c(int[] iArr, ByteOrder byteOrder) {
        short[] sArr = new short[iArr.length];
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            for (int length = iArr.length - 1; length >= 0; length--) {
                int i = iArr[length];
                sArr[length] = (short) (((i >> 20) & 3840) | ((i >> 16) & 240) | ((i >> 12) & 15) | ((i << 8) & 61440));
            }
        } else {
            for (int length2 = iArr.length - 1; length2 >= 0; length2--) {
                int i2 = iArr[length2];
                sArr[length2] = (short) (((i2 >> 28) & 15) | ((i2 >> 8) & 61440) | ((i2 >> 4) & 3840) | (i2 & 240));
            }
        }
        return sArr;
    }
}
