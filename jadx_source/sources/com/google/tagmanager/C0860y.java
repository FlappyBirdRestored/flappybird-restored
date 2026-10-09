package com.google.tagmanager;

import com.google.analytics.p009b.p010a.p011a.C0415c;
import com.google.analytics.p009b.p010a.p011a.C0417e;
import com.google.analytics.p009b.p010a.p011a.EnumC0420h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.tagmanager.y */
/* JADX INFO: loaded from: classes.dex */
class C0860y {

    /* JADX INFO: renamed from: a */
    private static final Object f2518a = null;

    /* JADX INFO: renamed from: b */
    private static Long f2519b = new Long(0);

    /* JADX INFO: renamed from: c */
    private static Double f2520c = new Double(0.0d);

    /* JADX INFO: renamed from: d */
    private static C0859x f2521d = C0859x.m3543a(0);

    /* JADX INFO: renamed from: e */
    private static String f2522e = new String("");

    /* JADX INFO: renamed from: f */
    private static Boolean f2523f = new Boolean(false);

    /* JADX INFO: renamed from: g */
    private static List f2524g = new ArrayList(0);

    /* JADX INFO: renamed from: h */
    private static Map f2525h = new HashMap();

    /* JADX INFO: renamed from: i */
    private static C0415c f2526i = m3551a(f2522e);

    /* JADX INFO: renamed from: a */
    public static C0415c m3550a() {
        return f2526i;
    }

    /* JADX INFO: renamed from: a */
    public static C0415c m3551a(Object obj) {
        boolean z = false;
        C0417e c0417eM1713F = C0415c.m1713F();
        if (obj instanceof C0415c) {
            return (C0415c) obj;
        }
        if (obj instanceof String) {
            c0417eM1713F.m1783a(EnumC0420h.STRING).m1785a((String) obj);
        } else if (obj instanceof List) {
            c0417eM1713F.m1783a(EnumC0420h.LIST);
            Iterator it = ((List) obj).iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                C0415c c0415cM3551a = m3551a(it.next());
                if (c0415cM3551a == f2526i) {
                    return f2526i;
                }
                z2 = z2 || c0415cM3551a.m1743E();
                c0417eM1713F.m1789b(c0415cM3551a);
            }
            z = z2;
        } else if (obj instanceof Map) {
            c0417eM1713F.m1783a(EnumC0420h.MAP);
            boolean z3 = false;
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                C0415c c0415cM3551a2 = m3551a(entry.getKey());
                C0415c c0415cM3551a3 = m3551a(entry.getValue());
                if (c0415cM3551a2 == f2526i || c0415cM3551a3 == f2526i) {
                    return f2526i;
                }
                boolean z4 = z3 || c0415cM3551a2.m1743E() || c0415cM3551a3.m1743E();
                c0417eM1713F.m1793c(c0415cM3551a2);
                c0417eM1713F.m1796d(c0415cM3551a3);
                z3 = z4;
            }
            z = z3;
        } else if (m3552b(obj)) {
            c0417eM1713F.m1783a(EnumC0420h.STRING).m1785a(obj.toString());
        } else if (m3553c(obj)) {
            c0417eM1713F.m1783a(EnumC0420h.INTEGER).m1781a(m3554d(obj));
        } else {
            if (!(obj instanceof Boolean)) {
                C0844i.m3526a("Converting to Value from unknown object type: " + (obj == null ? "null" : obj.getClass().toString()));
                return f2526i;
            }
            c0417eM1713F.m1783a(EnumC0420h.BOOLEAN).m1786a(((Boolean) obj).booleanValue());
        }
        if (z) {
            c0417eM1713F.m1790b(true);
        }
        return c0417eM1713F.mo1464h();
    }

    /* JADX INFO: renamed from: b */
    private static boolean m3552b(Object obj) {
        return (obj instanceof Double) || (obj instanceof Float) || ((obj instanceof C0859x) && ((C0859x) obj).m3545a());
    }

    /* JADX INFO: renamed from: c */
    private static boolean m3553c(Object obj) {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || ((obj instanceof C0859x) && ((C0859x) obj).m3546b());
    }

    /* JADX INFO: renamed from: d */
    private static long m3554d(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        C0844i.m3526a("getInt64 received non-Number");
        return 0L;
    }
}
