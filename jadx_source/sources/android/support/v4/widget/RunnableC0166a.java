package android.support.v4.widget;

/* JADX INFO: renamed from: android.support.v4.widget.a */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0166a implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ContentLoadingProgressBar f435a;

    RunnableC0166a(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f435a = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f435a.f376b = false;
        this.f435a.f375a = -1L;
        this.f435a.setVisibility(8);
    }
}
