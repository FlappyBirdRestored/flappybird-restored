package com.google.ads.p003a;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import com.google.ads.AdActivity;
import com.google.ads.util.AdUtil;
import com.google.ads.util.C0364g;

/* JADX INFO: renamed from: com.google.ads.a.f */
/* JADX INFO: loaded from: classes.dex */
class C0239f implements DownloadListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0238e f819a;

    C0239f(C0238e c0238e) {
        this.f819a = c0238e;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            AdActivity adActivityM1032i = this.f819a.m1032i();
            if (adActivityM1032i == null || !AdUtil.m1358a(intent, adActivityM1032i)) {
                return;
            }
            adActivityM1032i.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            C0364g.m1391a("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        } catch (Throwable th) {
            C0364g.m1396b("Unknown error trying to start activity to view URL: " + str, th);
        }
    }
}
