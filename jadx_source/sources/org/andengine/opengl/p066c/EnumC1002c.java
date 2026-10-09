package org.andengine.opengl.p066c;

/* JADX INFO: renamed from: org.andengine.opengl.c.c */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1002c {
    UNDEFINED(-1, -1, -1, -1),
    RGBA_4444(6408, 6408, 32819, 16),
    RGBA_5551(6407, 6408, 32820, 16),
    RGBA_8888(6408, 6408, 5121, 32),
    RGB_565(6407, 6407, 33635, 16),
    A_8(6406, 6406, 5121, 8),
    I_8(6409, 6409, 5121, 8),
    AI_88(6410, 6410, 5121, 16);


    /* JADX INFO: renamed from: i */
    private final int f2910i;

    /* JADX INFO: renamed from: j */
    private final int f2911j;

    /* JADX INFO: renamed from: k */
    private final int f2912k;

    /* JADX INFO: renamed from: l */
    private final int f2913l;

    EnumC1002c(int i, int i2, int i3, int i4) {
        this.f2910i = i;
        this.f2911j = i2;
        this.f2912k = i3;
        this.f2913l = i4;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC1002c[] valuesCustom() {
        EnumC1002c[] enumC1002cArrValuesCustom = values();
        int length = enumC1002cArrValuesCustom.length;
        EnumC1002c[] enumC1002cArr = new EnumC1002c[length];
        System.arraycopy(enumC1002cArrValuesCustom, 0, enumC1002cArr, 0, length);
        return enumC1002cArr;
    }

    /* JADX INFO: renamed from: a */
    public int m3957a() {
        return this.f2910i;
    }

    /* JADX INFO: renamed from: b */
    public int m3958b() {
        return this.f2911j;
    }

    /* JADX INFO: renamed from: c */
    public int m3959c() {
        return this.f2912k;
    }
}
