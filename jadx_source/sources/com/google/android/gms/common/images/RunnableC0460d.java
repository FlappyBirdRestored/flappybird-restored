package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.internal.C0560cn;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.google.android.gms.common.images.d */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0460d implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ImageManager f1660a;

    /* JADX INFO: renamed from: b */
    private final Uri f1661b;

    /* JADX INFO: renamed from: c */
    private final Bitmap f1662c;

    /* JADX INFO: renamed from: d */
    private final CountDownLatch f1663d;

    /* JADX INFO: renamed from: e */
    private boolean f1664e;

    public RunnableC0460d(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.f1660a = imageManager;
        this.f1661b = uri;
        this.f1662c = bitmap;
        this.f1664e = z;
        this.f1663d = countDownLatch;
    }

    /* JADX INFO: renamed from: a */
    private void m1899a(ImageManager.ImageReceiver imageReceiver, boolean z) {
        imageReceiver.f1653a = true;
        ArrayList arrayList = imageReceiver.f1656d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0461e c0461e = (C0461e) arrayList.get(i);
            if (z) {
                c0461e.m1905a(this.f1660a.f1647c, this.f1662c, false);
            } else {
                c0461e.m1906a(this.f1660a.f1647c, false);
            }
            if (c0461e.f1666b != 1) {
                this.f1660a.f1651g.remove(c0461e);
            }
        }
        imageReceiver.f1653a = false;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0560cn.m2607a("OnBitmapLoadedRunnable must be executed in the main thread");
        boolean z = this.f1662c != null;
        if (this.f1660a.f1650f != null) {
            if (this.f1664e) {
                this.f1660a.f1650f.m2716a();
                System.gc();
                this.f1664e = false;
                this.f1660a.f1648d.post(this);
                return;
            }
            if (z) {
                this.f1660a.f1650f.m2718b(new C0462f(this.f1661b), this.f1662c);
            }
        }
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.f1660a.f1652h.remove(this.f1661b);
        if (imageReceiver != null) {
            m1899a(imageReceiver, z);
        }
        this.f1663d.countDown();
        synchronized (ImageManager.f1645a) {
            ImageManager.f1646b.remove(this.f1661b);
        }
    }
}
