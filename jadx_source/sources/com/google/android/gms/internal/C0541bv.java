package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.bv */
/* JADX INFO: loaded from: classes.dex */
public class C0541bv implements SafeParcelable {
    public static final C0526bg CREATOR = new C0526bg();

    /* JADX INFO: renamed from: a */
    private final int f1817a;

    /* JADX INFO: renamed from: b */
    private final String f1818b;

    /* JADX INFO: renamed from: c */
    private final ArrayList f1819c;

    /* JADX INFO: renamed from: d */
    private final ArrayList f1820d;

    /* JADX INFO: renamed from: e */
    private final boolean f1821e;

    public C0541bv(int i, String str, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.f1817a = i;
        this.f1818b = str;
        this.f1819c = arrayList;
        this.f1820d = arrayList2;
        this.f1821e = z;
    }

    /* JADX INFO: renamed from: a */
    public int m2417a() {
        return this.f1817a;
    }

    /* JADX INFO: renamed from: b */
    public String m2418b() {
        return this.f1818b;
    }

    /* JADX INFO: renamed from: c */
    public ArrayList m2419c() {
        return this.f1819c;
    }

    /* JADX INFO: renamed from: d */
    public ArrayList m2420d() {
        return this.f1820d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean m2421e() {
        return this.f1821e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C0526bg.m2363a(this, parcel, i);
    }
}
