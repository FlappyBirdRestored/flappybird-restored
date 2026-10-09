package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.ads.util.C0364g;
import java.lang.ref.WeakReference;
import java.util.Date;

/* JADX INFO: renamed from: com.google.ads.av */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0281av implements Runnable {

    /* JADX INFO: renamed from: a */
    private final WeakReference f949a;

    /* JADX INFO: renamed from: b */
    private final SharedPreferences.Editor f950b;

    public RunnableC0281av(Activity activity) {
        this(activity, null);
    }

    RunnableC0281av(Activity activity, SharedPreferences.Editor editor) {
        this.f949a = new WeakReference(activity);
        this.f950b = editor;
    }

    /* JADX INFO: renamed from: a */
    private SharedPreferences.Editor m1216a(Context context) {
        return this.f950b == null ? PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).edit() : this.f950b;
    }

    @Override // java.lang.Runnable
    public void run() {
        String string;
        try {
            Activity activity = (Activity) this.f949a.get();
            if (activity == null) {
                C0364g.m1391a("Activity was null while making a doritos cookie request.");
                return;
            }
            Cursor cursorQuery = activity.getContentResolver().query(C0278as.f945a, C0278as.f946b, null, null, null);
            if (cursorQuery == null || !cursorQuery.moveToFirst() || cursorQuery.getColumnNames().length <= 0) {
                C0364g.m1391a("Google+ app not installed, not storing doritos cookie");
                string = null;
            } else {
                string = cursorQuery.getString(cursorQuery.getColumnIndex(cursorQuery.getColumnName(0)));
            }
            SharedPreferences.Editor editorM1216a = m1216a(activity);
            if (TextUtils.isEmpty(string)) {
                editorM1216a.putString("drt", "");
                editorM1216a.putLong("drt_ts", 0L);
            } else {
                editorM1216a.putString("drt", string);
                editorM1216a.putLong("drt_ts", new Date().getTime());
            }
            editorM1216a.commit();
        } catch (Throwable th) {
            C0364g.m1400d("An unknown error occurred while sending a doritos request.", th);
        }
    }
}
