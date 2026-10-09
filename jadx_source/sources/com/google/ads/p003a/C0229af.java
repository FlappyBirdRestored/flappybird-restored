package com.google.ads.p003a;

import com.google.ads.util.C0364g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.ads.a.af */
/* JADX INFO: loaded from: classes.dex */
public class C0229af {

    /* JADX INFO: renamed from: a */
    private final String f794a;

    public C0229af(String str) {
        this.f794a = str;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m1015a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("debugHeader", this.f794a);
        } catch (JSONException e) {
            C0364g.m1396b("Could not build ReportAdJson from inputs.", e);
        }
        return jSONObject;
    }
}
