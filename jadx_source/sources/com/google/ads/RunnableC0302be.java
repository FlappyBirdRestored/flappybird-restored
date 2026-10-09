package com.google.ads;

/* JADX INFO: renamed from: com.google.ads.be */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0302be implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0298ba f986a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C0333d f987b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C0301bd f988c;

    RunnableC0302be(C0301bd c0301bd, C0298ba c0298ba, C0333d c0333d) {
        this.f988c = c0301bd;
        this.f986a = c0298ba;
        this.f987b = c0333d;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f988c.m1275b(this.f986a, this.f987b);
        synchronized (this.f988c.f983e) {
            this.f988c.f982d = null;
        }
    }
}
