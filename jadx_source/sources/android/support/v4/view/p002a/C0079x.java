package android.support.v4.view.p002a;

import android.os.Build;

/* JADX INFO: renamed from: android.support.v4.view.a.x */
/* JADX INFO: loaded from: classes.dex */
public class C0079x {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC0053aa f346a;

    /* JADX INFO: renamed from: b */
    private final Object f347b;

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f346a = new C0054ab();
            return;
        }
        if (Build.VERSION.SDK_INT >= 15) {
            f346a = new C0081z();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f346a = new C0080y();
        } else {
            f346a = new C0055ac();
        }
    }

    public C0079x(Object obj) {
        this.f347b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static C0079x m456a() {
        return new C0079x(f346a.mo347a());
    }

    /* JADX INFO: renamed from: a */
    public void m457a(int i) {
        f346a.mo350b(this.f347b, i);
    }

    /* JADX INFO: renamed from: a */
    public void m458a(boolean z) {
        f346a.mo349a(this.f347b, z);
    }

    /* JADX INFO: renamed from: b */
    public void m459b(int i) {
        f346a.mo348a(this.f347b, i);
    }

    /* JADX INFO: renamed from: c */
    public void m460c(int i) {
        f346a.mo351c(this.f347b, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0079x c0079x = (C0079x) obj;
            if (this.f347b == null) {
                return c0079x.f347b == null;
            }
            return this.f347b.equals(c0079x.f347b);
        }
        return false;
    }

    public int hashCode() {
        if (this.f347b == null) {
            return 0;
        }
        return this.f347b.hashCode();
    }
}
