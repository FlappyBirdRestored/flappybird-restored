package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.internal.da */
/* JADX INFO: loaded from: classes.dex */
public class C0574da {

    /* JADX INFO: renamed from: a */
    private static final Uri f2056a = Uri.parse("http://plus.google.com/");

    /* JADX INFO: renamed from: b */
    private static final Uri f2057b = f2056a.buildUpon().appendPath("circles").appendPath("find").build();

    /* JADX INFO: renamed from: a */
    public static Intent m2675a(String str) {
        Uri uriFromParts = Uri.fromParts("package", str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(uriFromParts);
        return intent;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m2676b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(m2678d(str));
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    /* JADX INFO: renamed from: c */
    public static Intent m2677c(String str) {
        Uri uri = Uri.parse("bazaar://search?q=pname:" + str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.setFlags(524288);
        return intent;
    }

    /* JADX INFO: renamed from: d */
    private static Uri m2678d(String str) {
        return Uri.parse("market://details").buildUpon().appendQueryParameter("id", str).build();
    }
}
