package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.internal.C0560cn;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.google.android.gms.common.images.c */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0459c implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ImageManager f1657a;

    /* JADX INFO: renamed from: b */
    private final Uri f1658b;

    /* JADX INFO: renamed from: c */
    private final ParcelFileDescriptor f1659c;

    public RunnableC0459c(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.f1657a = imageManager;
        this.f1658b = uri;
        this.f1659c = parcelFileDescriptor;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0560cn.m2609b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        boolean z = false;
        Bitmap bitmapDecodeFileDescriptor = null;
        if (this.f1659c != null) {
            try {
                bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(this.f1659c.getFileDescriptor());
            } catch (OutOfMemoryError e) {
                Log.e("ImageManager", "OOM while loading bitmap for uri: " + this.f1658b, e);
                z = true;
            }
            try {
                this.f1659c.close();
            } catch (IOException e2) {
                Log.e("ImageManager", "closed failed", e2);
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f1657a.f1648d.post(new RunnableC0460d(this.f1657a, this.f1658b, bitmapDecodeFileDescriptor, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e3) {
            Log.w("ImageManager", "Latch interrupted while posting " + this.f1658b);
        }
    }
}
