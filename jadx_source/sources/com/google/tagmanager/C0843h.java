package com.google.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.tagmanager.h */
/* JADX INFO: loaded from: classes.dex */
class C0843h {

    /* JADX INFO: renamed from: a */
    static Map f2481a = new HashMap();

    /* JADX INFO: renamed from: b */
    private static String f2482b;

    C0843h() {
    }

    /* JADX INFO: renamed from: a */
    static String m3522a(String str, String str2) {
        if (str2 != null) {
            return Uri.parse("http://hostname/?" + str).getQueryParameter(str2);
        }
        if (str.length() > 0) {
            return str;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    static void m3523a(Context context, String str) {
        C0851p.m3538a(context, "gtm_install_referrer", "referrer", str);
        m3525b(context, str);
    }

    /* JADX INFO: renamed from: a */
    static void m3524a(String str) {
        synchronized (C0843h.class) {
            f2482b = str;
        }
    }

    /* JADX INFO: renamed from: b */
    static void m3525b(Context context, String str) {
        String strM3522a = m3522a(str, "conv");
        if (strM3522a == null || strM3522a.length() <= 0) {
            return;
        }
        f2481a.put(strM3522a, str);
        C0851p.m3538a(context, "gtm_click_referrers", strM3522a, str);
    }
}
