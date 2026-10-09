package com.google.tagmanager;

import android.util.Log;

/* JADX INFO: renamed from: com.google.tagmanager.g */
/* JADX INFO: loaded from: classes.dex */
class C0842g implements InterfaceC0845j {

    /* JADX INFO: renamed from: a */
    private EnumC0846k f2480a = EnumC0846k.WARNING;

    C0842g() {
    }

    @Override // com.google.tagmanager.InterfaceC0845j
    /* JADX INFO: renamed from: a */
    public void mo3518a(String str) {
        if (this.f2480a.ordinal() <= EnumC0846k.ERROR.ordinal()) {
            Log.e("GoogleTagManager", str);
        }
    }

    @Override // com.google.tagmanager.InterfaceC0845j
    /* JADX INFO: renamed from: b */
    public void mo3519b(String str) {
        if (this.f2480a.ordinal() <= EnumC0846k.WARNING.ordinal()) {
            Log.w("GoogleTagManager", str);
        }
    }

    @Override // com.google.tagmanager.InterfaceC0845j
    /* JADX INFO: renamed from: c */
    public void mo3520c(String str) {
        if (this.f2480a.ordinal() <= EnumC0846k.INFO.ordinal()) {
            Log.i("GoogleTagManager", str);
        }
    }

    @Override // com.google.tagmanager.InterfaceC0845j
    /* JADX INFO: renamed from: d */
    public void mo3521d(String str) {
        if (this.f2480a.ordinal() <= EnumC0846k.VERBOSE.ordinal()) {
            Log.v("GoogleTagManager", str);
        }
    }
}
