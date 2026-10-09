package android.support.v4.widget;

/* JADX INFO: renamed from: android.support.v4.widget.b */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0173b implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ContentLoadingProgressBar f462a;

    RunnableC0173b(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f462a = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f462a.f377c = false;
        if (this.f462a.f378d) {
            return;
        }
        this.f462a.f375a = System.currentTimeMillis();
        this.f462a.setVisibility(0);
    }
}
