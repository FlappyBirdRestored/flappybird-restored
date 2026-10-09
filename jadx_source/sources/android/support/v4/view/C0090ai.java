package android.support.v4.view;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: android.support.v4.view.ai */
/* JADX INFO: loaded from: classes.dex */
class C0090ai extends DataSetObserver implements InterfaceC0137cb, InterfaceC0138cc {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ PagerTitleStrip f351a;

    /* JADX INFO: renamed from: b */
    private int f352b;

    private C0090ai(PagerTitleStrip pagerTitleStrip) {
        this.f351a = pagerTitleStrip;
    }

    @Override // android.support.v4.view.InterfaceC0138cc
    /* JADX INFO: renamed from: a */
    public void mo490a(int i) {
        if (this.f352b == 0) {
            this.f351a.m250a(this.f351a.f252a.getCurrentItem(), this.f351a.f252a.getAdapter());
            this.f351a.mo247a(this.f351a.f252a.getCurrentItem(), this.f351a.f258g >= 0.0f ? this.f351a.f258g : 0.0f, true);
        }
    }

    @Override // android.support.v4.view.InterfaceC0138cc
    /* JADX INFO: renamed from: a */
    public void mo491a(int i, float f, int i2) {
        if (f > 0.5f) {
            i++;
        }
        this.f351a.mo247a(i, f, false);
    }

    @Override // android.support.v4.view.InterfaceC0137cb
    /* JADX INFO: renamed from: a */
    public void mo492a(AbstractC0086ae abstractC0086ae, AbstractC0086ae abstractC0086ae2) {
        this.f351a.m251a(abstractC0086ae, abstractC0086ae2);
    }

    @Override // android.support.v4.view.InterfaceC0138cc
    /* JADX INFO: renamed from: b */
    public void mo493b(int i) {
        this.f352b = i;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.f351a.m250a(this.f351a.f252a.getCurrentItem(), this.f351a.f252a.getAdapter());
        this.f351a.mo247a(this.f351a.f252a.getCurrentItem(), this.f351a.f258g >= 0.0f ? this.f351a.f258g : 0.0f, true);
    }
}
