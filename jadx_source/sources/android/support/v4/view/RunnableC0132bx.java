package android.support.v4.view;

/* JADX INFO: renamed from: android.support.v4.view.bx */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0132bx implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ViewPager f358a;

    RunnableC0132bx(ViewPager viewPager) {
        this.f358a = viewPager;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f358a.setScrollState(0);
        this.f358a.m288c();
    }
}
