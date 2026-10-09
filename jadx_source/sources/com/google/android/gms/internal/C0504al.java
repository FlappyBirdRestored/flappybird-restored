package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: renamed from: com.google.android.gms.internal.al */
/* JADX INFO: loaded from: classes.dex */
public final class C0504al {

    /* JADX INFO: renamed from: a */
    public IBinder f1790a;

    /* JADX INFO: renamed from: b */
    public int f1791b;

    /* JADX INFO: renamed from: c */
    public int f1792c;

    /* JADX INFO: renamed from: d */
    public int f1793d;

    /* JADX INFO: renamed from: e */
    public int f1794e;

    /* JADX INFO: renamed from: f */
    public int f1795f;

    /* JADX INFO: renamed from: g */
    public int f1796g;

    private C0504al(int i, IBinder iBinder) {
        this.f1792c = -1;
        this.f1793d = 0;
        this.f1794e = 0;
        this.f1795f = 0;
        this.f1796g = 0;
        this.f1791b = i;
        this.f1790a = iBinder;
    }

    /* JADX INFO: renamed from: a */
    public Bundle m2279a() {
        Bundle bundle = new Bundle();
        bundle.putInt("popupLocationInfo.gravity", this.f1791b);
        bundle.putInt("popupLocationInfo.displayId", this.f1792c);
        bundle.putInt("popupLocationInfo.left", this.f1793d);
        bundle.putInt("popupLocationInfo.top", this.f1794e);
        bundle.putInt("popupLocationInfo.right", this.f1795f);
        bundle.putInt("popupLocationInfo.bottom", this.f1796g);
        return bundle;
    }
}
