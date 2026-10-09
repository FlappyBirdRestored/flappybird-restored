package android.support.v4.view;

import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: android.support.v4.view.at */
/* JADX INFO: loaded from: classes.dex */
public class C0101at {

    /* JADX INFO: renamed from: a */
    static final InterfaceC0111bc f355a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            f355a = new C0110bb();
            return;
        }
        if (i >= 17) {
            f355a = new C0109ba();
            return;
        }
        if (i >= 16) {
            f355a = new C0107az();
            return;
        }
        if (i >= 14) {
            f355a = new C0106ay();
            return;
        }
        if (i >= 11) {
            f355a = new C0105ax();
        } else if (i >= 9) {
            f355a = new C0104aw();
        } else {
            f355a = new C0102au();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m502a(View view) {
        return f355a.mo516a(view);
    }

    /* JADX INFO: renamed from: a */
    public static void m503a(View view, int i, int i2, int i3, int i4) {
        f355a.mo518a(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public static void m504a(View view, int i, Paint paint) {
        f355a.mo519a(view, i, paint);
    }

    /* JADX INFO: renamed from: a */
    public static void m505a(View view, Paint paint) {
        f355a.mo520a(view, paint);
    }

    /* JADX INFO: renamed from: a */
    public static void m506a(View view, C0051a c0051a) {
        f355a.mo521a(view, c0051a);
    }

    /* JADX INFO: renamed from: a */
    public static void m507a(View view, Runnable runnable) {
        f355a.mo522a(view, runnable);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m508a(View view, int i) {
        return f355a.mo523a(view, i);
    }

    /* JADX INFO: renamed from: b */
    public static void m509b(View view) {
        f355a.mo524b(view);
    }

    /* JADX INFO: renamed from: b */
    public static void m510b(View view, int i) {
        f355a.mo525b(view, i);
    }

    /* JADX INFO: renamed from: c */
    public static int m511c(View view) {
        return f355a.mo526c(view);
    }

    /* JADX INFO: renamed from: d */
    public static int m512d(View view) {
        return f355a.mo527d(view);
    }

    /* JADX INFO: renamed from: e */
    public static int m513e(View view) {
        return f355a.mo528e(view);
    }

    /* JADX INFO: renamed from: f */
    public static ViewParent m514f(View view) {
        return f355a.mo529f(view);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m515g(View view) {
        return f355a.mo530g(view);
    }
}
