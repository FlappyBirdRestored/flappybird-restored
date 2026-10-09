package com.google.ads.p003a;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.ads.a.x */
/* JADX INFO: loaded from: classes.dex */
public class C0257x {

    /* JADX INFO: renamed from: a */
    private final String f907a;

    /* JADX INFO: renamed from: b */
    private HashMap f908b;

    public C0257x(Bundle bundle) {
        this.f907a = bundle.getString("action");
        this.f908b = m1136a(bundle.getSerializable("params"));
    }

    public C0257x(String str) {
        this.f907a = str;
    }

    public C0257x(String str, HashMap map) {
        this(str);
        this.f908b = map;
    }

    /* JADX INFO: renamed from: a */
    private HashMap m1136a(Serializable serializable) {
        if (serializable instanceof HashMap) {
            return (HashMap) serializable;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public Bundle m1137a() {
        Bundle bundle = new Bundle();
        bundle.putString("action", this.f907a);
        bundle.putSerializable("params", this.f908b);
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public String m1138b() {
        return this.f907a;
    }

    /* JADX INFO: renamed from: c */
    public HashMap m1139c() {
        return this.f908b;
    }
}
