package com.google.ads.util;

import android.webkit.ConsoleMessage;

/* JADX INFO: renamed from: com.google.ads.util.q */
/* JADX INFO: loaded from: classes.dex */
/* synthetic */ class C0374q {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f1388a = new int[ConsoleMessage.MessageLevel.values().length];

    static {
        try {
            f1388a[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f1388a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f1388a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f1388a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f1388a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
