package android.support.v4.p000a;

import android.os.Build;
import android.os.Parcelable;

/* JADX INFO: renamed from: android.support.v4.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0000a {
    /* JADX INFO: renamed from: a */
    public static Parcelable.Creator m0a(InterfaceC0002c interfaceC0002c) {
        if (Build.VERSION.SDK_INT >= 13) {
            C0004e.m3a(interfaceC0002c);
        }
        return new C0001b(interfaceC0002c);
    }
}
