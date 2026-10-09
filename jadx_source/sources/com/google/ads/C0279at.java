package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.ads.p003a.C0241h;
import java.util.Date;

/* JADX INFO: renamed from: com.google.ads.at */
/* JADX INFO: loaded from: classes.dex */
public final class C0279at {

    /* JADX INFO: renamed from: a */
    private static final C0241h f947a = (C0241h) C0241h.f821a.mo1047b();

    /* JADX INFO: renamed from: a */
    public static void m1213a(Activity activity) {
        new Thread(new RunnableC0281av(activity)).start();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1214a(Context context, long j) {
        if (!m1215a(context, j, PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()))) {
            return false;
        }
        new Thread(new RunnableC0280au(context)).start();
        return true;
    }

    /* JADX INFO: renamed from: a */
    static boolean m1215a(Context context, long j, SharedPreferences sharedPreferences) {
        return (sharedPreferences.contains("drt") && sharedPreferences.contains("drt_ts") && sharedPreferences.getLong("drt_ts", 0L) >= new Date().getTime() - j) ? false : true;
    }
}
