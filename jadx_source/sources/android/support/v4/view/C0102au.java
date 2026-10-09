package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: android.support.v4.view.au */
/* JADX INFO: loaded from: classes.dex */
class C0102au implements InterfaceC0111bc {
    C0102au() {
    }

    @Override // android.support.v4.view.InterfaceC0111bc
    /* JADX INFO: renamed from: a */
    public int mo516a(View view) {
        return 2;
    }

    /* JADX INFO: renamed from: a */
    long mo517a() {
        return 10L;
    }

    @Override // android.support.v4.view.InterfaceC0111bc
    /* JADX INFO: renamed from: a */
    public void mo518a(View view, int i, int i2, int i3, int i4) {
        view.postInvalidateDelayed(mo517a(), i, i2, i3, i4);
    }

    @Override // android.support.v4.view.InterfaceC0111bc
    /* JADX INFO: renamed from: a */
    public void mo519a(View view, int i, Paint paint) {
    }

    @Override // android.support.v4.view.InterfaceC0111bc
    /* JADX INFO: renamed from: a */
    public void mo520a(View view, Paint paint) {
    }

    @Override // android.support.v4.view.InterfaceC0111bc
    /* JADX INFO: renamed from: a */
    public void mo521a(View view, C0051a c0051a) {
    }

    @Override // android.support.v4.view.InterfaceC0111bc
    /* JADX INFO: renamed from: a */
    public void mo522a(View view, Runnable runnable) {
        view.postDelayed(runnable, mo517a());
    }

    @Override // android.support.v4.view.InterfaceC0111bc
    /* JADX INFO: renamed from: a */
    public boolean mo523a(View view, int i) {
        return false;
    }

    @Override // android.support.v4.view.InterfaceC0111bc
    /* JADX INFO: renamed from: b */
    public void mo524b(View view) {
        view.postInvalidateDelayed(mo517a());
    }

    @Override // android.support.v4.view.InterfaceC0111bc
    /* JADX INFO: renamed from: b */
    public void mo525b(View view, int i) {
    }

    @Override // android.support.v4.view.InterfaceC0111bc
    /* JADX INFO: renamed from: c */
    public int mo526c(View view) {
        return 0;
    }

    @Override // android.support.v4.view.InterfaceC0111bc
    /* JADX INFO: renamed from: d */
    public int mo527d(View view) {
        return 0;
    }

    @Override // android.support.v4.view.InterfaceC0111bc
    /* JADX INFO: renamed from: e */
    public int mo528e(View view) {
        return 0;
    }

    @Override // android.support.v4.view.InterfaceC0111bc
    /* JADX INFO: renamed from: f */
    public ViewParent mo529f(View view) {
        return view.getParent();
    }

    @Override // android.support.v4.view.InterfaceC0111bc
    /* JADX INFO: renamed from: g */
    public boolean mo530g(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }
}
