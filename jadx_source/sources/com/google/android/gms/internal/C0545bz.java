package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.p017a.p018a.InterfaceC0739b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.bz */
/* JADX INFO: loaded from: classes.dex */
public final class C0545bz extends AbstractC0497ae implements SafeParcelable, InterfaceC0739b {
    public static final C0530bk CREATOR = new C0530bk();

    /* JADX INFO: renamed from: a */
    private static final HashMap f1879a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Set f1880b;

    /* JADX INFO: renamed from: c */
    private final int f1881c;

    /* JADX INFO: renamed from: d */
    private String f1882d;

    /* JADX INFO: renamed from: e */
    private C0543bx f1883e;

    /* JADX INFO: renamed from: f */
    private String f1884f;

    /* JADX INFO: renamed from: g */
    private C0543bx f1885g;

    /* JADX INFO: renamed from: h */
    private String f1886h;

    static {
        f1879a.put("id", AbstractC0497ae.a.m2237d("id", 2));
        f1879a.put("result", AbstractC0497ae.a.m2232a("result", 4, C0543bx.class));
        f1879a.put("startDate", AbstractC0497ae.a.m2237d("startDate", 5));
        f1879a.put("target", AbstractC0497ae.a.m2232a("target", 6, C0543bx.class));
        f1879a.put("type", AbstractC0497ae.a.m2237d("type", 7));
    }

    public C0545bz() {
        this.f1881c = 1;
        this.f1880b = new HashSet();
    }

    C0545bz(Set set, int i, String str, C0543bx c0543bx, String str2, C0543bx c0543bx2, String str3) {
        this.f1880b = set;
        this.f1881c = i;
        this.f1882d = str;
        this.f1883e = c0543bx;
        this.f1884f = str2;
        this.f1885g = c0543bx2;
        this.f1886h = str3;
    }

    @Override // com.google.android.gms.internal.AbstractC0497ae
    /* JADX INFO: renamed from: a */
    protected Object mo2221a(String str) {
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC0497ae
    /* JADX INFO: renamed from: a */
    protected boolean mo2222a(AbstractC0497ae.a aVar) {
        return this.f1880b.contains(Integer.valueOf(aVar.m2247g()));
    }

    @Override // com.google.android.gms.internal.AbstractC0497ae
    /* JADX INFO: renamed from: b */
    protected Object mo2223b(AbstractC0497ae.a aVar) {
        switch (aVar.m2247g()) {
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                return this.f1882d;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + aVar.m2247g());
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                return this.f1883e;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                return this.f1884f;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                return this.f1885g;
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                return this.f1886h;
        }
    }

    @Override // com.google.android.gms.internal.AbstractC0497ae
    /* JADX INFO: renamed from: b */
    public HashMap mo2224b() {
        return f1879a;
    }

    @Override // com.google.android.gms.internal.AbstractC0497ae
    /* JADX INFO: renamed from: b */
    protected boolean mo2225b(String str) {
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        C0530bk c0530bk = CREATOR;
        return 0;
    }

    /* JADX INFO: renamed from: e */
    Set m2485e() {
        return this.f1880b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0545bz)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0545bz c0545bz = (C0545bz) obj;
        for (AbstractC0497ae.a aVar : f1879a.values()) {
            if (mo2222a(aVar)) {
                if (c0545bz.mo2222a(aVar) && mo2223b(aVar).equals(c0545bz.mo2223b(aVar))) {
                }
                return false;
            }
            if (c0545bz.mo2222a(aVar)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    int m2486f() {
        return this.f1881c;
    }

    /* JADX INFO: renamed from: g */
    public String m2487g() {
        return this.f1882d;
    }

    /* JADX INFO: renamed from: h */
    C0543bx m2488h() {
        return this.f1883e;
    }

    public int hashCode() {
        int iHashCode = 0;
        Iterator it = f1879a.values().iterator();
        while (true) {
            int i = iHashCode;
            if (!it.hasNext()) {
                return i;
            }
            AbstractC0497ae.a aVar = (AbstractC0497ae.a) it.next();
            if (mo2222a(aVar)) {
                iHashCode = mo2223b(aVar).hashCode() + i + aVar.m2247g();
            } else {
                iHashCode = i;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public String m2489i() {
        return this.f1884f;
    }

    /* JADX INFO: renamed from: j */
    C0543bx m2490j() {
        return this.f1885g;
    }

    /* JADX INFO: renamed from: k */
    public String m2491k() {
        return this.f1886h;
    }

    @Override // com.google.android.gms.common.data.InterfaceC0449a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0545bz mo1843a() {
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C0530bk c0530bk = CREATOR;
        C0530bk.m2384a(this, parcel, i);
    }
}
