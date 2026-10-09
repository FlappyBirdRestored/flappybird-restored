package org.andengine.input.sensor;

/* JADX INFO: renamed from: org.andengine.input.sensor.b */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0967b {
    NORMAL(3),
    UI(2),
    GAME(1),
    FASTEST(0);


    /* JADX INFO: renamed from: e */
    private final int f2808e;

    EnumC0967b(int i) {
        this.f2808e = i;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0967b[] valuesCustom() {
        EnumC0967b[] enumC0967bArrValuesCustom = values();
        int length = enumC0967bArrValuesCustom.length;
        EnumC0967b[] enumC0967bArr = new EnumC0967b[length];
        System.arraycopy(enumC0967bArrValuesCustom, 0, enumC0967bArr, 0, length);
        return enumC0967bArr;
    }
}
