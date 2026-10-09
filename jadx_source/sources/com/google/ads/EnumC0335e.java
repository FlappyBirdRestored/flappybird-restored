package com.google.ads;

/* JADX INFO: renamed from: com.google.ads.e */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0335e {
    INVALID_REQUEST("Invalid Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");


    /* JADX INFO: renamed from: e */
    private final String f1112e;

    EnumC0335e(String str) {
        this.f1112e = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1112e;
    }
}
