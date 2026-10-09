package android.support.v4.view;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.p002a.C0052a;
import android.support.v4.view.p002a.C0066k;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: android.support.v4.view.a */
/* JADX INFO: loaded from: classes.dex */
public class C0051a {

    /* JADX INFO: renamed from: b */
    private static final InterfaceC0143d f333b;

    /* JADX INFO: renamed from: c */
    private static final Object f334c;

    /* JADX INFO: renamed from: a */
    final Object f335a = f333b.mo532a(this);

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f333b = new C0144e();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f333b = new C0108b();
        } else {
            f333b = new C0146g();
        }
        f334c = f333b.mo531a();
    }

    /* JADX INFO: renamed from: a */
    public C0066k m292a(View view) {
        return f333b.mo574a(f334c, view);
    }

    /* JADX INFO: renamed from: a */
    Object m293a() {
        return this.f335a;
    }

    /* JADX INFO: renamed from: a */
    public void m294a(View view, int i) {
        f333b.mo533a(f334c, view, i);
    }

    /* JADX INFO: renamed from: a */
    public void mo295a(View view, C0052a c0052a) {
        f333b.mo534a(f334c, view, c0052a);
    }

    /* JADX INFO: renamed from: a */
    public void m296a(View view, AccessibilityEvent accessibilityEvent) {
        f333b.mo539d(f334c, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo297a(View view, int i, Bundle bundle) {
        return f333b.mo575a(f334c, view, i, bundle);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo298a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f333b.mo536a(f334c, viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public boolean m299b(View view, AccessibilityEvent accessibilityEvent) {
        return f333b.mo535a(f334c, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: c */
    public void m300c(View view, AccessibilityEvent accessibilityEvent) {
        f333b.mo538c(f334c, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: d */
    public void mo301d(View view, AccessibilityEvent accessibilityEvent) {
        f333b.mo537b(f334c, view, accessibilityEvent);
    }
}
