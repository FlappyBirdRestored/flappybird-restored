package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.cq */
/* JADX INFO: loaded from: classes.dex */
public class C0563cq implements SafeParcelable {
    public static final C0544by CREATOR = new C0544by();

    /* JADX INFO: renamed from: a */
    private final int f2011a;

    /* JADX INFO: renamed from: b */
    private final ArrayList f2012b;

    /* JADX INFO: renamed from: c */
    private final ArrayList f2013c;

    /* JADX INFO: renamed from: d */
    private final Bundle f2014d;

    /* JADX INFO: renamed from: e */
    private final boolean f2015e;

    /* JADX INFO: renamed from: f */
    private final int f2016f;

    public C0563cq(int i, ArrayList arrayList, ArrayList arrayList2, Bundle bundle, boolean z, int i2) {
        this.f2011a = i;
        this.f2012b = arrayList;
        this.f2013c = arrayList2;
        this.f2014d = bundle;
        this.f2015e = z;
        this.f2016f = i2;
    }

    /* JADX INFO: renamed from: a */
    public ArrayList m2621a() {
        return this.f2012b;
    }

    /* JADX INFO: renamed from: b */
    public ArrayList m2622b() {
        return this.f2013c;
    }

    /* JADX INFO: renamed from: c */
    public Bundle m2623c() {
        return this.f2014d;
    }

    /* JADX INFO: renamed from: d */
    public boolean m2624d() {
        return this.f2015e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public int m2625e() {
        return this.f2016f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0563cq)) {
            return false;
        }
        C0563cq c0563cq = (C0563cq) obj;
        return this.f2011a == c0563cq.f2011a && C0585dl.m2702a(this.f2012b, c0563cq.f2012b) && C0585dl.m2702a(this.f2013c, c0563cq.f2013c) && C0585dl.m2702a(this.f2014d, c0563cq.f2014d) && C0585dl.m2702a(Integer.valueOf(this.f2016f), Integer.valueOf(c0563cq.f2016f));
    }

    /* JADX INFO: renamed from: f */
    public int m2626f() {
        return this.f2011a;
    }

    public int hashCode() {
        return C0585dl.m2700a(Integer.valueOf(this.f2011a), this.f2012b, this.f2013c, this.f2014d, Integer.valueOf(this.f2016f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C0544by.m2482a(this, parcel, i);
    }
}
