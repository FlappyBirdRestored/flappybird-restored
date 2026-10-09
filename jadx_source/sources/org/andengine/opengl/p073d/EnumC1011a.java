package org.andengine.opengl.p073d;

/* JADX INFO: renamed from: org.andengine.opengl.d.a */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1011a {
    STATIC(35044),
    DYNAMIC(35048),
    STREAM(35040);


    /* JADX INFO: renamed from: d */
    private final int f2957d;

    EnumC1011a(int i) {
        this.f2957d = i;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC1011a[] valuesCustom() {
        EnumC1011a[] enumC1011aArrValuesCustom = values();
        int length = enumC1011aArrValuesCustom.length;
        EnumC1011a[] enumC1011aArr = new EnumC1011a[length];
        System.arraycopy(enumC1011aArrValuesCustom, 0, enumC1011aArr, 0, length);
        return enumC1011aArr;
    }

    /* JADX INFO: renamed from: a */
    public int m3984a() {
        return this.f2957d;
    }
}
