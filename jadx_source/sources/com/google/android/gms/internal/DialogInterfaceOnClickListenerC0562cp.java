package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.cp */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC0562cp implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    private final Activity f2008a;

    /* JADX INFO: renamed from: b */
    private final Intent f2009b;

    /* JADX INFO: renamed from: c */
    private final int f2010c;

    public DialogInterfaceOnClickListenerC0562cp(Activity activity, Intent intent, int i) {
        this.f2008a = activity;
        this.f2009b = intent;
        this.f2010c = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            if (this.f2009b != null) {
                this.f2008a.startActivityForResult(this.f2009b, this.f2010c);
            }
            dialogInterface.dismiss();
        } catch (ActivityNotFoundException e) {
            Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        }
    }
}
