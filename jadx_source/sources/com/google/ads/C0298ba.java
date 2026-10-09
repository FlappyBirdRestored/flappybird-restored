package com.google.ads;

import com.google.ads.p003a.C0226ac;
import com.google.ads.util.C0362e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.ads.ba */
/* JADX INFO: loaded from: classes.dex */
public class C0298ba {

    /* JADX INFO: renamed from: a */
    private static final Map f968a = Collections.unmodifiableMap(new C0299bb());

    /* JADX INFO: renamed from: b */
    private final String f969b;

    /* JADX INFO: renamed from: c */
    private final String f970c;

    /* JADX INFO: renamed from: d */
    private final List f971d;

    /* JADX INFO: renamed from: e */
    private final Integer f972e;

    /* JADX INFO: renamed from: f */
    private final Integer f973f;

    /* JADX INFO: renamed from: g */
    private final List f974g;

    /* JADX INFO: renamed from: h */
    private final List f975h;

    /* JADX INFO: renamed from: i */
    private final List f976i;

    private C0298ba(String str, String str2, List list, Integer num, Integer num2, List list2, List list3, List list4) {
        C0362e.m1384a(str);
        this.f969b = str;
        this.f970c = str2;
        this.f971d = list;
        this.f972e = num;
        this.f973f = num2;
        this.f974g = list2;
        this.f975h = list3;
        this.f976i = list4;
    }

    /* JADX INFO: renamed from: a */
    public static C0298ba m1252a(String str) throws JSONException {
        List listM1254a;
        List listM1254a2;
        List listM1254a3;
        Integer num;
        Integer numValueOf;
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("qdata");
        String string2 = jSONObject.has("ad_type") ? jSONObject.getString("ad_type") : null;
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m1253a(jSONArray.getJSONObject(i)));
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            numValueOf = jSONObjectOptJSONObject.has("refresh") ? Integer.valueOf(jSONObjectOptJSONObject.getInt("refresh")) : null;
            Integer numValueOf2 = jSONObjectOptJSONObject.has("ad_network_timeout_millis") ? Integer.valueOf(jSONObjectOptJSONObject.getInt("ad_network_timeout_millis")) : null;
            listM1254a2 = m1254a(jSONObjectOptJSONObject, "imp_urls");
            listM1254a3 = m1254a(jSONObjectOptJSONObject, "click_urls");
            listM1254a = m1254a(jSONObjectOptJSONObject, "nofill_urls");
            num = numValueOf2;
        } else {
            listM1254a = null;
            listM1254a2 = null;
            listM1254a3 = null;
            num = null;
            numValueOf = null;
        }
        return new C0298ba(string, string2, arrayList, numValueOf, num, listM1254a2, listM1254a3, listM1254a);
    }

    /* JADX INFO: renamed from: a */
    private static C0341k m1253a(JSONObject jSONObject) throws JSONException {
        HashMap map;
        String string = jSONObject.getString("id");
        String strOptString = jSONObject.optString("allocation_id", null);
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        List listM1254a = m1254a(jSONObject, "imp_urls");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        HashMap map2 = new HashMap(0);
        if (jSONObjectOptJSONObject != null) {
            map = new HashMap(jSONObjectOptJSONObject.length());
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObjectOptJSONObject.getString(next));
            }
        } else {
            map = map2;
        }
        return new C0341k(strOptString, string, arrayList, listM1254a, map);
    }

    /* JADX INFO: renamed from: a */
    private static List m1254a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(jSONArrayOptJSONArray.getString(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1255a() {
        return this.f973f != null;
    }

    /* JADX INFO: renamed from: b */
    public int m1256b() {
        return this.f973f.intValue();
    }

    /* JADX INFO: renamed from: c */
    public String m1257c() {
        return this.f969b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m1258d() {
        return this.f972e != null;
    }

    /* JADX INFO: renamed from: e */
    public int m1259e() {
        return this.f972e.intValue();
    }

    /* JADX INFO: renamed from: f */
    public List m1260f() {
        return this.f971d;
    }

    /* JADX INFO: renamed from: g */
    public List m1261g() {
        return this.f974g;
    }

    /* JADX INFO: renamed from: h */
    public List m1262h() {
        return this.f975h;
    }

    /* JADX INFO: renamed from: i */
    public List m1263i() {
        return this.f976i;
    }

    /* JADX INFO: renamed from: j */
    public C0226ac m1264j() {
        if (this.f970c == null) {
            return null;
        }
        if ("interstitial".equals(this.f970c)) {
            return C0226ac.f779a;
        }
        C0337g c0337g = (C0337g) f968a.get(this.f970c);
        if (c0337g != null) {
            return C0226ac.m1000a(c0337g);
        }
        return null;
    }
}
