package android.support.v4.view;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: android.support.v4.view.ce */
/* JADX INFO: loaded from: classes.dex */
class C0140ce extends DataSetObserver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ViewPager f367a;

    private C0140ce(ViewPager viewPager) {
        this.f367a = viewPager;
    }

    /* synthetic */ C0140ce(ViewPager viewPager, C0130bv c0130bv) {
        this(viewPager);
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        this.f367a.m287b();
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f367a.m287b();
    }
}
