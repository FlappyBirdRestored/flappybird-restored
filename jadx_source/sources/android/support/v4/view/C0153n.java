package android.support.v4.view;

import android.os.Build;

/* JADX INFO: renamed from: android.support.v4.view.n */
/* JADX INFO: loaded from: classes.dex */
public class C0153n {

    /* JADX INFO: renamed from: a */
    static final InterfaceC0154o f372a;

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            f372a = new C0156q();
        } else {
            f372a = new C0155p();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m597a(int i, int i2) {
        return f372a.mo598a(i, i2);
    }
}
