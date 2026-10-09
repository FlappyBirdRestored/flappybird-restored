package android.support.v4.view;

import android.support.v4.view.p002a.C0052a;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: android.support.v4.view.c */
/* JADX INFO: loaded from: classes.dex */
class C0135c implements InterfaceC0149j {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0051a f364a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0108b f365b;

    C0135c(C0108b c0108b, C0051a c0051a) {
        this.f365b = c0108b;
        this.f364a = c0051a;
    }

    @Override // android.support.v4.view.InterfaceC0149j
    /* JADX INFO: renamed from: a */
    public void mo562a(View view, int i) {
        this.f364a.m294a(view, i);
    }

    @Override // android.support.v4.view.InterfaceC0149j
    /* JADX INFO: renamed from: a */
    public void mo563a(View view, Object obj) {
        this.f364a.mo295a(view, new C0052a(obj));
    }

    @Override // android.support.v4.view.InterfaceC0149j
    /* JADX INFO: renamed from: a */
    public boolean mo564a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f364a.m299b(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.InterfaceC0149j
    /* JADX INFO: renamed from: a */
    public boolean mo565a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f364a.mo298a(viewGroup, view, accessibilityEvent);
    }

    @Override // android.support.v4.view.InterfaceC0149j
    /* JADX INFO: renamed from: b */
    public void mo566b(View view, AccessibilityEvent accessibilityEvent) {
        this.f364a.mo301d(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.InterfaceC0149j
    /* JADX INFO: renamed from: c */
    public void mo567c(View view, AccessibilityEvent accessibilityEvent) {
        this.f364a.m300c(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.InterfaceC0149j
    /* JADX INFO: renamed from: d */
    public void mo568d(View view, AccessibilityEvent accessibilityEvent) {
        this.f364a.m296a(view, accessibilityEvent);
    }
}
