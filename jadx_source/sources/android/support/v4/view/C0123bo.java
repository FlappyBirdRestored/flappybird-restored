package android.support.v4.view;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: renamed from: android.support.v4.view.bo */
/* JADX INFO: loaded from: classes.dex */
public class C0123bo {

    /* JADX INFO: renamed from: a */
    static final InterfaceC0126br f357a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            f357a = new C0127bs();
            return;
        }
        if (i >= 14) {
            f357a = new C0125bq();
        } else if (i >= 11) {
            f357a = new C0124bp();
        } else {
            f357a = new C0128bt();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m558a(ViewGroup viewGroup, boolean z) {
        f357a.mo559a(viewGroup, z);
    }
}
