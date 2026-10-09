package com.google.ads;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: renamed from: com.google.ads.ak */
/* JADX INFO: loaded from: classes.dex */
public class C0270ak {

    /* JADX INFO: renamed from: d */
    private InterfaceC0266ag f936d;

    /* JADX INFO: renamed from: a */
    private String f933a = "googleads.g.doubleclick.net";

    /* JADX INFO: renamed from: b */
    private String f934b = "/pagead/ads";

    /* JADX INFO: renamed from: c */
    private String[] f935c = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* JADX INFO: renamed from: e */
    private C0265af f937e = new C0265af();

    public C0270ak(InterfaceC0266ag interfaceC0266ag) {
        this.f936d = interfaceC0266ag;
    }

    /* JADX INFO: renamed from: a */
    private Uri m1184a(Uri uri, Context context, String str, boolean z) throws C0271al {
        try {
            if (uri.getQueryParameter("ms") != null) {
                throw new C0271al("Query parameter already exists: ms");
            }
            return m1185a(uri, "ms", z ? this.f936d.mo1162a(context, str) : this.f936d.mo1161a(context));
        } catch (UnsupportedOperationException e) {
            throw new C0271al("Provided Uri is not in a valid state");
        }
    }

    /* JADX INFO: renamed from: a */
    private Uri m1185a(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl");
        }
        return iIndexOf != -1 ? Uri.parse(string.substring(0, iIndexOf + 1) + str + "=" + str2 + "&" + string.substring(iIndexOf + 1)) : uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    /* JADX INFO: renamed from: a */
    public Uri m1186a(Uri uri, Context context) throws C0271al {
        try {
            return m1184a(uri, context, uri.getQueryParameter("ai"), true);
        } catch (UnsupportedOperationException e) {
            throw new C0271al("Provided Uri is not in a valid state");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1187a(String str) {
        this.f935c = str.split(",");
    }

    /* JADX INFO: renamed from: a */
    public boolean m1188a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String str : this.f935c) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
