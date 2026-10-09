package com.google.ads.p004b;

import android.content.Context;
import com.google.ads.C0333d;

/* JADX INFO: renamed from: com.google.ads.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C0287a {

    /* JADX INFO: renamed from: a */
    private C0333d f963a;

    /* JADX INFO: renamed from: b */
    private boolean f964b;

    /* JADX INFO: renamed from: c */
    private boolean f965c;

    public C0287a(C0333d c0333d, Context context, boolean z) {
        this.f963a = c0333d;
        this.f965c = z;
        if (context == null) {
            this.f964b = true;
        } else {
            this.f964b = c0333d.m1320b(context);
        }
    }
}
