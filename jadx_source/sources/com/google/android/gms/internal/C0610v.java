package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.internal.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0610v {
    /* JADX INFO: renamed from: a */
    public static final Intent m2774a(Intent intent) {
        intent.setData(Uri.fromParts("version", Integer.toString(3265100), null));
        return intent;
    }
}
