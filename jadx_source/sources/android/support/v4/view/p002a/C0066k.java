package android.support.v4.view.p002a;

import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: android.support.v4.view.a.k */
/* JADX INFO: loaded from: classes.dex */
public class C0066k {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC0067l f338a;

    /* JADX INFO: renamed from: b */
    private final Object f339b;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f338a = new C0070o();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f338a = new C0068m();
        } else {
            f338a = new C0072q();
        }
    }

    public C0066k() {
        this.f339b = f338a.mo446a(this);
    }

    public C0066k(Object obj) {
        this.f339b = obj;
    }

    /* JADX INFO: renamed from: a */
    public C0052a m441a(int i) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public Object m442a() {
        return this.f339b;
    }

    /* JADX INFO: renamed from: a */
    public List m443a(String str, int i) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m444a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public C0052a m445b(int i) {
        return null;
    }
}
