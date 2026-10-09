package com.google.android.gms.common.data;

import com.google.android.gms.internal.C0588do;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.common.data.e */
/* JADX INFO: loaded from: classes.dex */
public class C0453e {

    /* JADX INFO: renamed from: a */
    private final String[] f1626a;

    /* JADX INFO: renamed from: b */
    private final ArrayList f1627b;

    /* JADX INFO: renamed from: c */
    private final String f1628c;

    /* JADX INFO: renamed from: d */
    private final HashMap f1629d;

    /* JADX INFO: renamed from: e */
    private boolean f1630e;

    /* JADX INFO: renamed from: f */
    private String f1631f;

    private C0453e(String[] strArr, String str) {
        this.f1626a = (String[]) C0588do.m2704a(strArr);
        this.f1627b = new ArrayList();
        this.f1628c = str;
        this.f1629d = new HashMap();
        this.f1630e = false;
        this.f1631f = null;
    }

    /* synthetic */ C0453e(String[] strArr, String str, C0451c c0451c) {
        this(strArr, str);
    }
}
