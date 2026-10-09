package org.andengine.p026b.p031c;

/* JADX INFO: renamed from: org.andengine.b.c.h */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0893h {
    BRIGHT(26),
    SCREEN_BRIGHT(10),
    SCREEN_DIM(6),
    SCREEN_ON(-1);


    /* JADX INFO: renamed from: e */
    private final int f2629e;

    EnumC0893h(int i) {
        this.f2629e = i;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0893h[] valuesCustom() {
        EnumC0893h[] enumC0893hArrValuesCustom = values();
        int length = enumC0893hArrValuesCustom.length;
        EnumC0893h[] enumC0893hArr = new EnumC0893h[length];
        System.arraycopy(enumC0893hArrValuesCustom, 0, enumC0893hArr, 0, length);
        return enumC0893hArr;
    }

    /* JADX INFO: renamed from: a */
    public int m3678a() {
        return this.f2629e;
    }
}
