package com.google.tagmanager.p020a;

import com.google.android.gms.C0467e;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: renamed from: com.google.tagmanager.a.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0830t extends AbstractC0767a implements Serializable {
    protected AbstractC0830t() {
    }

    protected AbstractC0830t(AbstractC0832v abstractC0832v) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static boolean m3492b(C0827q c0827q, InterfaceC0780am interfaceC0780am, C0821k c0821k, C0823m c0823m, C0825o c0825o, int i) throws IOException {
        boolean z;
        boolean z2;
        Object objMo1468b;
        InterfaceC0780am interfaceC0780am2;
        int iM3384a = C0805bk.m3384a(i);
        C0768aa c0768aaM3471a = c0825o.m3471a(interfaceC0780am, C0805bk.m3386b(i));
        if (c0768aaM3471a == null) {
            z = false;
            z2 = true;
        } else if (iM3384a == C0827q.m3472a(c0768aaM3471a.f2317b.mo3488a(), false)) {
            z = false;
            z2 = false;
        } else if (c0768aaM3471a.f2317b.f2466d && c0768aaM3471a.f2317b.f2465c.mo3389c() && iM3384a == C0827q.m3472a(c0768aaM3471a.f2317b.mo3488a(), true)) {
            z = true;
            z2 = false;
        } else {
            z = false;
            z2 = true;
        }
        if (z2) {
            return c0821k.m3423a(i, c0823m);
        }
        if (z) {
            int iM3426c = c0821k.m3426c(c0821k.m3445s());
            if (c0768aaM3471a.f2317b.mo3488a() == EnumC0807bm.f2393n) {
                while (c0821k.m3449w() > 0) {
                    InterfaceC0771ad interfaceC0771adMo1468b = c0768aaM3471a.f2317b.m3506e().mo1468b(c0821k.m3440n());
                    if (interfaceC0771adMo1468b == null) {
                        return true;
                    }
                    c0827q.m3482b(c0768aaM3471a.f2317b, c0768aaM3471a.m3275a(interfaceC0771adMo1468b));
                }
            } else {
                while (c0821k.m3449w() > 0) {
                    c0827q.m3482b(c0768aaM3471a.f2317b, C0827q.m3474a(c0821k, c0768aaM3471a.f2317b.mo3488a(), false));
                }
            }
            c0821k.m3428d(iM3426c);
        } else {
            switch (C0831u.f2458a[c0768aaM3471a.f2317b.mo3489b().ordinal()]) {
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    InterfaceC0781an interfaceC0781anMo1441n = (c0768aaM3471a.f2317b.mo3490c() || (interfaceC0780am2 = (InterfaceC0780am) c0827q.m3479a(c0768aaM3471a.f2317b)) == null) ? null : interfaceC0780am2.mo1441n();
                    if (interfaceC0781anMo1441n == null) {
                        interfaceC0781anMo1441n = c0768aaM3471a.m3276b().mo1442o();
                    }
                    if (c0768aaM3471a.f2317b.mo3488a() == EnumC0807bm.f2389j) {
                        c0821k.m3420a(c0768aaM3471a.m3274a(), interfaceC0781anMo1441n, c0825o);
                    } else {
                        c0821k.m3421a(interfaceC0781anMo1441n, c0825o);
                    }
                    objMo1468b = interfaceC0781anMo1441n.mo1464h();
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    int iM3440n = c0821k.m3440n();
                    objMo1468b = c0768aaM3471a.f2317b.m3506e().mo1468b(iM3440n);
                    if (objMo1468b == null) {
                        c0823m.m3467d(i);
                        c0823m.m3462b(iM3440n);
                        return true;
                    }
                    break;
                default:
                    objMo1468b = C0827q.m3474a(c0821k, c0768aaM3471a.f2317b.mo3488a(), false);
                    break;
            }
            if (c0768aaM3471a.f2317b.mo3490c()) {
                c0827q.m3482b(c0768aaM3471a.f2317b, c0768aaM3471a.m3275a(objMo1468b));
            } else {
                c0827q.m3481a(c0768aaM3471a.f2317b, c0768aaM3471a.m3275a(objMo1468b));
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: R */
    protected void mo3493R() {
    }

    /* JADX INFO: renamed from: a */
    protected boolean mo3494a(C0821k c0821k, C0823m c0823m, C0825o c0825o, int i) {
        return c0821k.m3423a(i, c0823m);
    }

    @Override // com.google.tagmanager.p020a.InterfaceC0780am
    /* JADX INFO: renamed from: c */
    public InterfaceC0784aq mo1431c() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }
}
