package com.google.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: renamed from: com.google.tagmanager.m */
/* JADX INFO: loaded from: classes.dex */
class C0848m {

    /* JADX INFO: renamed from: a */
    private static C0848m f2493a;

    /* JADX INFO: renamed from: b */
    private volatile EnumC0849n f2494b;

    /* JADX INFO: renamed from: c */
    private volatile String f2495c;

    /* JADX INFO: renamed from: d */
    private volatile String f2496d;

    /* JADX INFO: renamed from: e */
    private volatile String f2497e;

    C0848m() {
        m3537e();
    }

    /* JADX INFO: renamed from: a */
    static C0848m m3530a() {
        C0848m c0848m;
        synchronized (C0848m.class) {
            if (f2493a == null) {
                f2493a = new C0848m();
            }
            c0848m = f2493a;
        }
        return c0848m;
    }

    /* JADX INFO: renamed from: a */
    private String m3531a(String str) {
        return str.split("&")[0].split("=")[1];
    }

    /* JADX INFO: renamed from: b */
    private String m3532b(Uri uri) {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    /* JADX INFO: renamed from: a */
    synchronized boolean m3533a(Uri uri) {
        boolean z = true;
        synchronized (this) {
            try {
                String strDecode = URLDecoder.decode(uri.toString(), "UTF-8");
                if (strDecode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
                    C0844i.m3529d("Container preview url: " + strDecode);
                    if (strDecode.matches(".*?&gtm_debug=x$")) {
                        this.f2494b = EnumC0849n.CONTAINER_DEBUG;
                    } else {
                        this.f2494b = EnumC0849n.CONTAINER;
                    }
                    this.f2497e = m3532b(uri);
                    if (this.f2494b == EnumC0849n.CONTAINER || this.f2494b == EnumC0849n.CONTAINER_DEBUG) {
                        this.f2496d = "/r?" + this.f2497e;
                    }
                    this.f2495c = m3531a(this.f2497e);
                } else if (!strDecode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
                    C0844i.m3527b("Invalid preview uri: " + strDecode);
                    z = false;
                } else if (m3531a(uri.getQuery()).equals(this.f2495c)) {
                    C0844i.m3529d("Exit preview mode for container: " + this.f2495c);
                    this.f2494b = EnumC0849n.NONE;
                    this.f2496d = null;
                } else {
                    z = false;
                }
            } catch (UnsupportedEncodingException e) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    EnumC0849n m3534b() {
        return this.f2494b;
    }

    /* JADX INFO: renamed from: c */
    String m3535c() {
        return this.f2496d;
    }

    /* JADX INFO: renamed from: d */
    String m3536d() {
        return this.f2495c;
    }

    /* JADX INFO: renamed from: e */
    void m3537e() {
        this.f2494b = EnumC0849n.NONE;
        this.f2496d = null;
        this.f2495c = null;
        this.f2497e = null;
    }
}
