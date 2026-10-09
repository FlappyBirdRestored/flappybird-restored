package com.google.tagmanager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* JADX INFO: renamed from: com.google.tagmanager.p */
/* JADX INFO: loaded from: classes.dex */
class C0851p {
    @SuppressLint({"CommitPrefEdits"})
    /* JADX INFO: renamed from: a */
    static void m3538a(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putString(str2, str3);
        m3539a(editorEdit);
    }

    /* JADX INFO: renamed from: a */
    static void m3539a(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            new Thread(new RunnableC0852q(editor)).start();
        }
    }
}
