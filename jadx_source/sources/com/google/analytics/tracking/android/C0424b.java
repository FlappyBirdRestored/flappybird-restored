package com.google.analytics.tracking.android;

/* JADX INFO: renamed from: com.google.analytics.tracking.android.b */
/* JADX INFO: loaded from: classes.dex */
public class C0424b {

    /* JADX INFO: renamed from: a */
    private static C0423a f1584a;

    /* JADX INFO: renamed from: a */
    private static InterfaceC0425c m1810a() {
        if (f1584a == null) {
            f1584a = C0423a.m1808a();
        }
        if (f1584a != null) {
            return f1584a.m1809b();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m1811a(String str) {
        InterfaceC0425c interfaceC0425cM1810a = m1810a();
        if (interfaceC0425cM1810a != null) {
            interfaceC0425cM1810a.m1812a(str);
        }
    }
}
