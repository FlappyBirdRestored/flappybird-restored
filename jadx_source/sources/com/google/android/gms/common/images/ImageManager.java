package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class ImageManager {

    /* JADX INFO: renamed from: a */
    private static final Object f1645a = new Object();

    /* JADX INFO: renamed from: b */
    private static HashSet f1646b = new HashSet();

    /* JADX INFO: renamed from: c */
    private final Context f1647c;

    /* JADX INFO: renamed from: d */
    private final Handler f1648d;

    /* JADX INFO: renamed from: e */
    private final ExecutorService f1649e;

    /* JADX INFO: renamed from: f */
    private final C0458b f1650f;

    /* JADX INFO: renamed from: g */
    private final Map f1651g;

    /* JADX INFO: renamed from: h */
    private final Map f1652h;

    final class ImageReceiver extends ResultReceiver {

        /* JADX INFO: renamed from: a */
        boolean f1653a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ImageManager f1654b;

        /* JADX INFO: renamed from: c */
        private final Uri f1655c;

        /* JADX INFO: renamed from: d */
        private final ArrayList f1656d;

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            this.f1654b.f1649e.execute(new RunnableC0459c(this.f1654b, this.f1655c, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }
}
