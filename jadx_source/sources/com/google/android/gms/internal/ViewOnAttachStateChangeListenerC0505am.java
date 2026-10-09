package com.google.android.gms.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.am */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnAttachStateChangeListenerC0505am extends C0501ai implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: c */
    private WeakReference f1797c;

    /* JADX INFO: renamed from: d */
    private boolean f1798d;

    protected ViewOnAttachStateChangeListenerC0505am(C0606r c0606r, int i) {
        super(c0606r, i);
        this.f1798d = false;
    }

    /* JADX INFO: renamed from: b */
    private void m2280b(View view) {
        Display display;
        int displayId = -1;
        if (C0604p.m2759e() && (display = view.getDisplay()) != null) {
            displayId = display.getDisplayId();
        }
        IBinder windowToken = view.getWindowToken();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        this.f1782b.f1792c = displayId;
        this.f1782b.f1790a = windowToken;
        this.f1782b.f1793d = iArr[0];
        this.f1782b.f1794e = iArr[1];
        this.f1782b.f1795f = iArr[0] + width;
        this.f1782b.f1796g = iArr[1] + height;
        if (this.f1798d) {
            mo2263a();
            this.f1798d = false;
        }
    }

    @Override // com.google.android.gms.internal.C0501ai
    /* JADX INFO: renamed from: a */
    public void mo2263a() {
        if (this.f1782b.f1790a != null) {
            super.mo2263a();
        } else {
            this.f1798d = this.f1797c != null;
        }
    }

    @Override // com.google.android.gms.internal.C0501ai
    /* JADX INFO: renamed from: a */
    protected void mo2264a(int i) {
        this.f1782b = new C0504al(i, null);
    }

    @Override // com.google.android.gms.internal.C0501ai
    /* JADX INFO: renamed from: a */
    public void mo2265a(View view) {
        this.f1781a.m2767g();
        if (this.f1797c != null) {
            View decorView = (View) this.f1797c.get();
            Context contextJ = this.f1781a.m2644j();
            if (decorView == null && (contextJ instanceof Activity)) {
                decorView = ((Activity) contextJ).getWindow().getDecorView();
            }
            if (decorView != null) {
                decorView.removeOnAttachStateChangeListener(this);
                ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
                if (C0604p.m2758d()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
        this.f1797c = null;
        Context contextJ2 = this.f1781a.m2644j();
        if (view == null && (contextJ2 instanceof Activity)) {
            View viewFindViewById = ((Activity) contextJ2).findViewById(R.id.content);
            if (viewFindViewById == null) {
                viewFindViewById = ((Activity) contextJ2).getWindow().getDecorView();
            }
            C0611w.m2775a("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view which may not work properly in future versions of the API. Use setViewForPopups() to set your content view.");
            view = viewFindViewById;
        }
        if (view == null) {
            C0611w.m2777b("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
            return;
        }
        m2280b(view);
        this.f1797c = new WeakReference(view);
        view.addOnAttachStateChangeListener(this);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        View view;
        if (this.f1797c == null || (view = (View) this.f1797c.get()) == null) {
            return;
        }
        m2280b(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        m2280b(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1781a.m2767g();
        view.removeOnAttachStateChangeListener(this);
    }
}
