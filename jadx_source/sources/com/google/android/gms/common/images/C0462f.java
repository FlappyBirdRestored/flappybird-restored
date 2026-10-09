package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.internal.C0585dl;

/* JADX INFO: renamed from: com.google.android.gms.common.images.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0462f {

    /* JADX INFO: renamed from: a */
    public final Uri f1675a;

    public C0462f(Uri uri) {
        this.f1675a = uri;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0462f) {
            return this == obj || ((C0462f) obj).hashCode() == hashCode();
        }
        return false;
    }

    public int hashCode() {
        return C0585dl.m2700a(this.f1675a);
    }
}
