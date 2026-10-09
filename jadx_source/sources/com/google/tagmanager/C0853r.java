package com.google.tagmanager;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.C0467e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.google.tagmanager.r */
/* JADX INFO: loaded from: classes.dex */
public class C0853r {

    /* JADX INFO: renamed from: f */
    private static C0853r f2504f;

    /* JADX INFO: renamed from: a */
    private final InterfaceC0857v f2505a;

    /* JADX INFO: renamed from: b */
    private final Context f2506b;

    /* JADX INFO: renamed from: c */
    private final C0840e f2507c;

    /* JADX INFO: renamed from: d */
    private volatile EnumC0858w f2508d;

    /* JADX INFO: renamed from: e */
    private final ConcurrentMap f2509e;

    C0853r(Context context, InterfaceC0857v interfaceC0857v, C0840e c0840e) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.f2506b = context.getApplicationContext();
        this.f2505a = interfaceC0857v;
        this.f2508d = EnumC0858w.STANDARD;
        this.f2509e = new ConcurrentHashMap();
        this.f2507c = c0840e;
        this.f2507c.m3517a(new C0854s(this));
        this.f2507c.m3517a(new C0766a(this.f2506b));
    }

    /* JADX INFO: renamed from: a */
    public static C0853r m3540a(Context context) {
        C0853r c0853r;
        synchronized (C0853r.class) {
            if (f2504f == null) {
                f2504f = new C0853r(context, new C0855t(), new C0840e());
            }
            c0853r = f2504f;
        }
        return c0853r;
    }

    /* JADX INFO: renamed from: a */
    public EnumC0858w m3541a() {
        return this.f2508d;
    }

    /* JADX INFO: renamed from: a */
    synchronized boolean m3542a(Uri uri) {
        boolean z;
        C0848m c0848mM3530a = C0848m.m3530a();
        if (c0848mM3530a.m3533a(uri)) {
            String strM3536d = c0848mM3530a.m3536d();
            switch (C0856u.f2511a[c0848mM3530a.m3534b().ordinal()]) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    C0838c c0838c = (C0838c) this.f2509e.get(strM3536d);
                    if (c0838c != null) {
                        c0838c.m3513a((String) null);
                        c0838c.m3511a();
                    }
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    for (Map.Entry entry : this.f2509e.entrySet()) {
                        C0838c c0838c2 = (C0838c) entry.getValue();
                        if (((String) entry.getKey()).equals(strM3536d)) {
                            c0838c2.m3513a(c0848mM3530a.m3535c());
                            c0838c2.m3511a();
                        } else if (c0838c2.m3514b() != null) {
                            c0838c2.m3513a((String) null);
                            c0838c2.m3511a();
                        }
                    }
                    break;
            }
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
