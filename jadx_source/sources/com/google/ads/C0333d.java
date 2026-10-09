package com.google.ads;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.google.ads.doubleclick.C0334a;
import com.google.ads.p004b.InterfaceC0297j;
import com.google.ads.p004b.p005a.C0288a;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0364g;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.ads.d */
/* JADX INFO: loaded from: classes.dex */
public class C0333d {

    /* JADX INFO: renamed from: a */
    public static final String f1093a;

    /* JADX INFO: renamed from: b */
    private static final SimpleDateFormat f1094b = new SimpleDateFormat("yyyyMMdd");

    /* JADX INFO: renamed from: c */
    private static Method f1095c;

    /* JADX INFO: renamed from: d */
    private static Method f1096d;

    /* JADX INFO: renamed from: e */
    private EnumC0336f f1097e = null;

    /* JADX INFO: renamed from: f */
    private Date f1098f = null;

    /* JADX INFO: renamed from: g */
    private Set f1099g = null;

    /* JADX INFO: renamed from: h */
    private Map f1100h = null;

    /* JADX INFO: renamed from: i */
    private final Map f1101i = new HashMap();

    /* JADX INFO: renamed from: j */
    private Location f1102j = null;

    /* JADX INFO: renamed from: k */
    private boolean f1103k = false;

    /* JADX INFO: renamed from: l */
    private boolean f1104l = false;

    /* JADX INFO: renamed from: m */
    private Set f1105m = null;

    static {
        f1095c = null;
        f1096d = null;
        try {
            for (Method method : Class.forName("com.google.analytics.tracking.android.AdMobInfo").getMethods()) {
                if (method.getName().equals("getInstance") && method.getParameterTypes().length == 0) {
                    f1095c = method;
                } else if (method.getName().equals("getJoinIds") && method.getParameterTypes().length == 0) {
                    f1096d = method;
                }
            }
            if (f1095c == null || f1096d == null) {
                f1095c = null;
                f1096d = null;
                C0364g.m1401e("No Google Analytics: Library Incompatible.");
            }
        } catch (ClassNotFoundException e) {
            C0364g.m1391a("No Google Analytics: Library Not Found.");
        } catch (Throwable th) {
            C0364g.m1391a("No Google Analytics: Error Loading Library");
        }
        f1093a = AdUtil.m1363b("emulator");
    }

    /* JADX INFO: renamed from: a */
    public C0333d m1316a(InterfaceC0297j interfaceC0297j) {
        if (interfaceC0297j != null) {
            this.f1101i.put(interfaceC0297j.getClass(), interfaceC0297j);
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0333d m1317a(Set set) {
        this.f1099g = set;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public Object m1318a(Class cls) {
        return this.f1101i.get(cls);
    }

    /* JADX INFO: renamed from: a */
    public Map mo1312a(Context context) {
        HashMap map = new HashMap();
        if (this.f1099g != null) {
            map.put("kw", this.f1099g);
        }
        if (this.f1097e != null) {
            map.put("cust_gender", Integer.valueOf(this.f1097e.ordinal()));
        }
        if (this.f1098f != null) {
            map.put("cust_age", f1094b.format(this.f1098f));
        }
        if (this.f1102j != null) {
            map.put("uule", AdUtil.m1351a(this.f1102j));
        }
        if (this.f1103k) {
            map.put("testing", 1);
        }
        if (m1320b(context)) {
            map.put("adtest", "on");
        } else if (!this.f1104l) {
            C0364g.m1397c("To get test ads on this device, call adRequest.addTestDevice(" + (AdUtil.m1367c() ? "AdRequest.TEST_EMULATOR" : "\"" + AdUtil.m1348a(context) + "\"") + ");");
            this.f1104l = true;
        }
        C0288a c0288a = (C0288a) m1318a(C0288a.class);
        C0334a c0334a = (C0334a) m1318a(C0334a.class);
        if (c0334a != null && c0334a.m1242d() != null && !c0334a.m1242d().isEmpty()) {
            map.put("extras", c0334a.m1242d());
        } else if (c0288a != null && c0288a.m1242d() != null && !c0288a.m1242d().isEmpty()) {
            map.put("extras", c0288a.m1242d());
        }
        if (c0334a != null) {
            String strM1321a = c0334a.m1321a();
            if (!TextUtils.isEmpty(strM1321a)) {
                map.put("ppid", strM1321a);
            }
        }
        if (this.f1100h != null) {
            map.put("mediation_extras", this.f1100h);
        }
        try {
            if (f1095c != null) {
                Map map2 = (Map) f1096d.invoke(f1095c.invoke(null, new Object[0]), new Object[0]);
                if (map2 != null && map2.size() > 0) {
                    map.put("analytics_join_id", map2);
                }
            }
        } catch (Throwable th) {
            C0364g.m1398c("Internal Analytics Error:", th);
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public C0333d m1319b(Set set) {
        this.f1105m = set;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public boolean m1320b(Context context) {
        String strM1348a;
        return (this.f1105m == null || (strM1348a = AdUtil.m1348a(context)) == null || !this.f1105m.contains(strM1348a)) ? false : true;
    }
}
