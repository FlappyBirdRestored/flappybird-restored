package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

/* JADX INFO: renamed from: android.support.v4.view.ax */
/* JADX INFO: loaded from: classes.dex */
class C0105ax extends C0104aw {
    C0105ax() {
    }

    @Override // android.support.v4.view.C0102au
    /* JADX INFO: renamed from: a */
    long mo517a() {
        return C0114bf.m543a();
    }

    @Override // android.support.v4.view.C0102au, android.support.v4.view.InterfaceC0111bc
    /* JADX INFO: renamed from: a */
    public void mo519a(View view, int i, Paint paint) {
        C0114bf.m544a(view, i, paint);
    }

    @Override // android.support.v4.view.C0102au, android.support.v4.view.InterfaceC0111bc
    /* JADX INFO: renamed from: a */
    public void mo520a(View view, Paint paint) {
        mo519a(view, mo527d(view), paint);
        view.invalidate();
    }

    @Override // android.support.v4.view.C0102au, android.support.v4.view.InterfaceC0111bc
    /* JADX INFO: renamed from: d */
    public int mo527d(View view) {
        return C0114bf.m542a(view);
    }
}
