package org.andengine.p040d.p052e;

/* JADX INFO: renamed from: org.andengine.d.e.b */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0942b {
    NONE,
    ERROR,
    WARNING,
    INFO,
    DEBUG,
    VERBOSE;


    /* JADX INFO: renamed from: g */
    public static EnumC0942b f2778g = VERBOSE;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0942b[] valuesCustom() {
        EnumC0942b[] enumC0942bArrValuesCustom = values();
        int length = enumC0942bArrValuesCustom.length;
        EnumC0942b[] enumC0942bArr = new EnumC0942b[length];
        System.arraycopy(enumC0942bArrValuesCustom, 0, enumC0942bArr, 0, length);
        return enumC0942bArr;
    }

    /* JADX INFO: renamed from: a */
    public boolean m3832a(EnumC0942b enumC0942b) {
        return compareTo(enumC0942b) >= 0;
    }
}
