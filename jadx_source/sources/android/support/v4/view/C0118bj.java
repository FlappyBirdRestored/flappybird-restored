package android.support.v4.view;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: android.support.v4.view.bj */
/* JADX INFO: loaded from: classes.dex */
public class C0118bj {

    /* JADX INFO: renamed from: a */
    static final InterfaceC0121bm f356a;

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f356a = new C0120bl();
        } else {
            f356a = new C0119bk();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m555a(ViewConfiguration viewConfiguration) {
        return f356a.mo556a(viewConfiguration);
    }
}
