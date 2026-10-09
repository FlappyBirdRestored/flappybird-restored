package org.andengine.input.sensor.location;

/* JADX INFO: renamed from: org.andengine.input.sensor.location.b */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0971b {
    AVAILABLE,
    OUT_OF_SERVICE,
    TEMPORARILY_UNAVAILABLE;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0971b[] valuesCustom() {
        EnumC0971b[] enumC0971bArrValuesCustom = values();
        int length = enumC0971bArrValuesCustom.length;
        EnumC0971b[] enumC0971bArr = new EnumC0971b[length];
        System.arraycopy(enumC0971bArrValuesCustom, 0, enumC0971bArr, 0, length);
        return enumC0971bArr;
    }
}
