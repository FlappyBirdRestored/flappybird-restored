package android.support.v4.view;

import android.os.Build;
import android.view.KeyEvent;

/* JADX INFO: renamed from: android.support.v4.view.s */
/* JADX INFO: loaded from: classes.dex */
public class C0158s {

    /* JADX INFO: renamed from: a */
    static final InterfaceC0162w f373a;

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f373a = new C0161v();
        } else {
            f373a = new C0159t();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m600a(KeyEvent keyEvent) {
        return f373a.mo607b(keyEvent.getMetaState());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m601a(KeyEvent keyEvent, int i) {
        return f373a.mo606a(keyEvent.getMetaState(), i);
    }

    /* JADX INFO: renamed from: b */
    public static void m602b(KeyEvent keyEvent) {
        f373a.mo605a(keyEvent);
    }
}
