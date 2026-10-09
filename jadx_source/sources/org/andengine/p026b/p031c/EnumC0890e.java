package org.andengine.p026b.p031c;

/* JADX INFO: renamed from: org.andengine.b.c.e */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0890e {
    LANDSCAPE_FIXED,
    LANDSCAPE_SENSOR,
    PORTRAIT_FIXED,
    PORTRAIT_SENSOR;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0890e[] valuesCustom() {
        EnumC0890e[] enumC0890eArrValuesCustom = values();
        int length = enumC0890eArrValuesCustom.length;
        EnumC0890e[] enumC0890eArr = new EnumC0890e[length];
        System.arraycopy(enumC0890eArrValuesCustom, 0, enumC0890eArr, 0, length);
        return enumC0890eArr;
    }
}
