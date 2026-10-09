package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.p002a.C0052a;
import android.support.v4.view.p002a.C0066k;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: android.support.v4.view.f */
/* JADX INFO: loaded from: classes.dex */
class C0145f implements InterfaceC0152m {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0051a f368a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0144e f369b;

    C0145f(C0144e c0144e, C0051a c0051a) {
        this.f369b = c0144e;
        this.f368a = c0051a;
    }

    @Override // android.support.v4.view.InterfaceC0152m
    /* JADX INFO: renamed from: a */
    public Object mo576a(View view) {
        C0066k c0066kM292a = this.f368a.m292a(view);
        if (c0066kM292a != null) {
            return c0066kM292a.m442a();
        }
        return null;
    }

    @Override // android.support.v4.view.InterfaceC0152m
    /* JADX INFO: renamed from: a */
    public void mo577a(View view, int i) {
        this.f368a.m294a(view, i);
    }

    @Override // android.support.v4.view.InterfaceC0152m
    /* JADX INFO: renamed from: a */
    public void mo578a(View view, Object obj) {
        this.f368a.mo295a(view, new C0052a(obj));
    }

    @Override // android.support.v4.view.InterfaceC0152m
    /* JADX INFO: renamed from: a */
    public boolean mo579a(View view, int i, Bundle bundle) {
        return this.f368a.mo297a(view, i, bundle);
    }

    @Override // android.support.v4.view.InterfaceC0152m
    /* JADX INFO: renamed from: a */
    public boolean mo580a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f368a.m299b(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.InterfaceC0152m
    /* JADX INFO: renamed from: a */
    public boolean mo581a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f368a.mo298a(viewGroup, view, accessibilityEvent);
    }

    @Override // android.support.v4.view.InterfaceC0152m
    /* JADX INFO: renamed from: b */
    public void mo582b(View view, AccessibilityEvent accessibilityEvent) {
        this.f368a.mo301d(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.InterfaceC0152m
    /* JADX INFO: renamed from: c */
    public void mo583c(View view, AccessibilityEvent accessibilityEvent) {
        this.f368a.m300c(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.InterfaceC0152m
    /* JADX INFO: renamed from: d */
    public void mo584d(View view, AccessibilityEvent accessibilityEvent) {
        this.f368a.m296a(view, accessibilityEvent);
    }
}
