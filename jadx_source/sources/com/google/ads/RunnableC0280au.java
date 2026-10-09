package com.google.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* JADX INFO: renamed from: com.google.ads.au */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0280au implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f948a;

    RunnableC0280au(Context context) {
        this.f948a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(this.f948a.getApplicationContext()).edit();
        editorEdit.putString("drt", "");
        editorEdit.putLong("drt_ts", 0L);
        editorEdit.commit();
    }
}
