package com.google.android.gms.maps;

import android.view.ViewGroup;
import com.google.android.gms.internal.C0588do;
import com.google.android.gms.maps.p015a.InterfaceC0668m;
import com.google.android.gms.p013b.InterfaceC0433a;

/* JADX INFO: renamed from: com.google.android.gms.maps.c */
/* JADX INFO: loaded from: classes.dex */
class C0683c implements InterfaceC0433a {

    /* JADX INFO: renamed from: a */
    private final ViewGroup f2153a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0668m f2154b;

    public C0683c(ViewGroup viewGroup, InterfaceC0668m interfaceC0668m) {
        this.f2154b = (InterfaceC0668m) C0588do.m2704a(interfaceC0668m);
        this.f2153a = (ViewGroup) C0588do.m2704a(viewGroup);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0668m m2973a() {
        return this.f2154b;
    }
}
