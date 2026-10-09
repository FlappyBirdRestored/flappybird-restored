package com.google.android.gms.maps.model;

/* JADX INFO: renamed from: com.google.android.gms.maps.model.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0712b {

    /* JADX INFO: renamed from: a */
    private LatLng f2243a;

    /* JADX INFO: renamed from: b */
    private float f2244b;

    /* JADX INFO: renamed from: c */
    private float f2245c;

    /* JADX INFO: renamed from: d */
    private float f2246d;

    /* JADX INFO: renamed from: a */
    public CameraPosition m3162a() {
        return new CameraPosition(this.f2243a, this.f2244b, this.f2245c, this.f2246d);
    }

    /* JADX INFO: renamed from: a */
    public C0712b m3163a(float f) {
        this.f2244b = f;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0712b m3164a(LatLng latLng) {
        this.f2243a = latLng;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C0712b m3165b(float f) {
        this.f2245c = f;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C0712b m3166c(float f) {
        this.f2246d = f;
        return this;
    }
}
