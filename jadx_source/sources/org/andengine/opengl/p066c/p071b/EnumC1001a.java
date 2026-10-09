package org.andengine.opengl.p066c.p071b;

import android.graphics.Bitmap;
import org.andengine.opengl.p066c.EnumC1002c;

/* JADX INFO: renamed from: org.andengine.opengl.c.b.a */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1001a {
    RGBA_8888(Bitmap.Config.ARGB_8888, EnumC1002c.RGBA_8888),
    RGB_565(Bitmap.Config.RGB_565, EnumC1002c.RGB_565),
    RGBA_4444(Bitmap.Config.ARGB_4444, EnumC1002c.RGBA_4444),
    A_8(Bitmap.Config.ALPHA_8, EnumC1002c.A_8);


    /* JADX INFO: renamed from: e */
    private final Bitmap.Config f2899e;

    /* JADX INFO: renamed from: f */
    private final EnumC1002c f2900f;

    EnumC1001a(Bitmap.Config config, EnumC1002c enumC1002c) {
        this.f2899e = config;
        this.f2900f = enumC1002c;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC1001a[] valuesCustom() {
        EnumC1001a[] enumC1001aArrValuesCustom = values();
        int length = enumC1001aArrValuesCustom.length;
        EnumC1001a[] enumC1001aArr = new EnumC1001a[length];
        System.arraycopy(enumC1001aArrValuesCustom, 0, enumC1001aArr, 0, length);
        return enumC1001aArr;
    }

    /* JADX INFO: renamed from: a */
    public Bitmap.Config m3955a() {
        return this.f2899e;
    }

    /* JADX INFO: renamed from: b */
    public EnumC1002c m3956b() {
        return this.f2900f;
    }
}
