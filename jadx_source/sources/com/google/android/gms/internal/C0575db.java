package com.google.android.gms.internal;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.db */
/* JADX INFO: loaded from: classes.dex */
public final class C0575db {

    /* JADX INFO: renamed from: a */
    private final String f2058a;

    public C0575db(String str) {
        this.f2058a = (String) C0588do.m2704a(str);
    }

    /* JADX INFO: renamed from: a */
    public void m2679a(String str, String str2) {
        if (m2681a(5)) {
            Log.w(str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2680a(String str, String str2, Throwable th) {
        if (m2681a(6)) {
            Log.e(str, str2, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m2681a(int i) {
        return Log.isLoggable(this.f2058a, i);
    }

    /* JADX INFO: renamed from: b */
    public void m2682b(String str, String str2) {
        if (m2681a(6)) {
            Log.e(str, str2);
        }
    }
}
