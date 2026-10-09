package com.google.android.gms.internal;

import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.o */
/* JADX INFO: loaded from: classes.dex */
public class C0603o {
    /* JADX INFO: renamed from: a */
    public static void m2753a(StringBuilder sb, HashMap map) {
        boolean z;
        sb.append("{");
        boolean z2 = true;
        for (String str : map.keySet()) {
            if (z2) {
                z = false;
            } else {
                sb.append(",");
                z = z2;
            }
            String str2 = (String) map.get(str);
            sb.append("\"").append(str).append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"").append(str2).append("\"");
            }
            z2 = z;
        }
        sb.append("}");
    }
}
