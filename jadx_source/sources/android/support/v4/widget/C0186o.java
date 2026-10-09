package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* JADX INFO: renamed from: android.support.v4.widget.o */
/* JADX INFO: loaded from: classes.dex */
class C0186o implements InterfaceC0185n {
    C0186o() {
    }

    @Override // android.support.v4.widget.InterfaceC0185n
    /* JADX INFO: renamed from: a */
    public Object mo776a(Context context, Interpolator interpolator) {
        return interpolator != null ? new Scroller(context, interpolator) : new Scroller(context);
    }

    @Override // android.support.v4.widget.InterfaceC0185n
    /* JADX INFO: renamed from: a */
    public void mo777a(Object obj, int i, int i2, int i3, int i4, int i5) {
        ((Scroller) obj).startScroll(i, i2, i3, i4, i5);
    }

    @Override // android.support.v4.widget.InterfaceC0185n
    /* JADX INFO: renamed from: a */
    public boolean mo778a(Object obj) {
        return ((Scroller) obj).isFinished();
    }

    @Override // android.support.v4.widget.InterfaceC0185n
    /* JADX INFO: renamed from: b */
    public int mo779b(Object obj) {
        return ((Scroller) obj).getCurrX();
    }

    @Override // android.support.v4.widget.InterfaceC0185n
    /* JADX INFO: renamed from: c */
    public int mo780c(Object obj) {
        return ((Scroller) obj).getCurrY();
    }

    @Override // android.support.v4.widget.InterfaceC0185n
    /* JADX INFO: renamed from: d */
    public boolean mo781d(Object obj) {
        return ((Scroller) obj).computeScrollOffset();
    }

    @Override // android.support.v4.widget.InterfaceC0185n
    /* JADX INFO: renamed from: e */
    public void mo782e(Object obj) {
        ((Scroller) obj).abortAnimation();
    }

    @Override // android.support.v4.widget.InterfaceC0185n
    /* JADX INFO: renamed from: f */
    public int mo783f(Object obj) {
        return ((Scroller) obj).getFinalX();
    }

    @Override // android.support.v4.widget.InterfaceC0185n
    /* JADX INFO: renamed from: g */
    public int mo784g(Object obj) {
        return ((Scroller) obj).getFinalY();
    }
}
