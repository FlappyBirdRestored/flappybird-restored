package com.google.ads;

/* JADX INFO: renamed from: com.google.ads.bi */
/* JADX INFO: loaded from: classes.dex */
public final class C0306bi {
    /* JADX INFO: renamed from: a */
    public static Object m1285a(String str, Class cls) {
        return cls.cast(Class.forName(str).newInstance());
    }

    /* JADX INFO: renamed from: a */
    public static String m1286a(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        String strReplaceAll = str.replaceAll("@gw_adlocid@", str2).replaceAll("@gw_qdata@", str6).replaceAll("@gw_sdkver@", "afma-sdk-a-v6.4.1").replaceAll("@gw_sessid@", str7).replaceAll("@gw_seqnum@", str8).replaceAll("@gw_devid@", str3);
        if (str5 != null) {
            strReplaceAll = strReplaceAll.replaceAll("@gw_adnetid@", str5);
        }
        if (str4 != null) {
            strReplaceAll = strReplaceAll.replaceAll("@gw_allocid@", str4);
        }
        if (str9 != null) {
            strReplaceAll = strReplaceAll.replaceAll("@gw_adt@", str9);
        }
        if (str10 != null) {
            strReplaceAll = strReplaceAll.replaceAll("@gw_aec@", str10);
        }
        if (bool != null) {
            return strReplaceAll.replaceAll("@gw_adnetrefresh@", bool.booleanValue() ? "1" : "0");
        }
        return strReplaceAll;
    }
}
