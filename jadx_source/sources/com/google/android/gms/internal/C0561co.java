package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.co */
/* JADX INFO: loaded from: classes.dex */
public class C0561co implements SafeParcelable {
    public static final C0542bw CREATOR = new C0542bw();

    /* JADX INFO: renamed from: a */
    private final int f1997a;

    /* JADX INFO: renamed from: b */
    private final String f1998b;

    /* JADX INFO: renamed from: c */
    private final List f1999c;

    /* JADX INFO: renamed from: d */
    private final List f2000d;

    /* JADX INFO: renamed from: e */
    private final Uri f2001e;

    /* JADX INFO: renamed from: f */
    private final String f2002f;

    /* JADX INFO: renamed from: g */
    private final String f2003g;

    /* JADX INFO: renamed from: h */
    private final String f2004h;

    /* JADX INFO: renamed from: i */
    private final Bundle f2005i;

    /* JADX INFO: renamed from: j */
    private final Bundle f2006j;

    /* JADX INFO: renamed from: k */
    private final int f2007k;

    public C0561co(int i, String str, List list, List list2, Uri uri, String str2, String str3, String str4, Bundle bundle, Bundle bundle2, int i2) {
        this.f1997a = i;
        this.f1998b = str;
        this.f1999c = list;
        this.f2000d = list2;
        this.f2001e = uri;
        this.f2002f = str2;
        this.f2003g = str3;
        this.f2004h = str4;
        this.f2005i = bundle;
        this.f2006j = bundle2;
        this.f2007k = i2;
    }

    /* JADX INFO: renamed from: a */
    public List m2610a() {
        return this.f1999c;
    }

    /* JADX INFO: renamed from: b */
    public List m2611b() {
        return this.f2000d;
    }

    /* JADX INFO: renamed from: c */
    public Uri m2612c() {
        return this.f2001e;
    }

    /* JADX INFO: renamed from: d */
    public String m2613d() {
        return this.f2002f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public String m2614e() {
        return this.f2003g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0561co)) {
            return false;
        }
        C0561co c0561co = (C0561co) obj;
        return this.f1997a == c0561co.f1997a && C0585dl.m2702a(this.f1999c, c0561co.f1999c) && C0585dl.m2702a(this.f2000d, c0561co.f2000d) && C0585dl.m2702a(this.f2001e, c0561co.f2001e) && C0585dl.m2702a(this.f2002f, c0561co.f2002f) && C0585dl.m2702a(this.f2003g, c0561co.f2003g) && C0585dl.m2702a(this.f2004h, c0561co.f2004h);
    }

    /* JADX INFO: renamed from: f */
    public String m2615f() {
        return this.f2004h;
    }

    /* JADX INFO: renamed from: g */
    public String m2616g() {
        return this.f1998b;
    }

    /* JADX INFO: renamed from: h */
    public Bundle m2617h() {
        return this.f2005i;
    }

    public int hashCode() {
        return C0585dl.m2700a(Integer.valueOf(this.f1997a), this.f1999c, this.f2000d, this.f2001e, this.f2002f, this.f2003g, this.f2004h);
    }

    /* JADX INFO: renamed from: i */
    public Bundle m2618i() {
        return this.f2006j;
    }

    /* JADX INFO: renamed from: j */
    public int m2619j() {
        return this.f2007k;
    }

    /* JADX INFO: renamed from: k */
    public int m2620k() {
        return this.f1997a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C0542bw.m2422a(this, parcel, i);
    }
}
