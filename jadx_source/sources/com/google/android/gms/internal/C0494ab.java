package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C0494ab implements SafeParcelable, InterfaceC0573d {
    public static final C0519b CREATOR = new C0519b();

    /* JADX INFO: renamed from: a */
    private final int f1751a;

    /* JADX INFO: renamed from: b */
    private final HashMap f1752b;

    /* JADX INFO: renamed from: c */
    private final HashMap f1753c;

    /* JADX INFO: renamed from: d */
    private final ArrayList f1754d;

    /* JADX INFO: renamed from: com.google.android.gms.internal.ab$a */
    public final class a implements SafeParcelable {
        public static final C0546c CREATOR = new C0546c();

        /* JADX INFO: renamed from: a */
        final int f1755a;

        /* JADX INFO: renamed from: b */
        final String f1756b;

        /* JADX INFO: renamed from: c */
        final int f1757c;

        a(int i, String str, int i2) {
            this.f1755a = i;
            this.f1756b = str;
            this.f1757c = i2;
        }

        a(String str, int i) {
            this.f1755a = 1;
            this.f1756b = str;
            this.f1757c = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            C0546c c0546c = CREATOR;
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C0546c c0546c = CREATOR;
            C0546c.m2493a(this, parcel, i);
        }
    }

    public C0494ab() {
        this.f1751a = 1;
        this.f1752b = new HashMap();
        this.f1753c = new HashMap();
        this.f1754d = null;
    }

    C0494ab(int i, ArrayList arrayList) {
        this.f1751a = i;
        this.f1752b = new HashMap();
        this.f1753c = new HashMap();
        this.f1754d = null;
        m2087a(arrayList);
    }

    /* JADX INFO: renamed from: a */
    private void m2087a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            m2089a(aVar.f1756b, aVar.f1757c);
        }
    }

    /* JADX INFO: renamed from: a */
    int m2088a() {
        return this.f1751a;
    }

    /* JADX INFO: renamed from: a */
    public C0494ab m2089a(String str, int i) {
        this.f1752b.put(str, Integer.valueOf(i));
        this.f1753c.put(Integer.valueOf(i), str);
        return this;
    }

    @Override // com.google.android.gms.internal.InterfaceC0573d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String mo2090a(Integer num) {
        String str = (String) this.f1753c.get(num);
        return (str == null && this.f1752b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    /* JADX INFO: renamed from: b */
    ArrayList m2092b() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f1752b.keySet()) {
            arrayList.add(new a(str, ((Integer) this.f1752b.get(str)).intValue()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.InterfaceC0573d
    /* JADX INFO: renamed from: c */
    public int mo2093c() {
        return 7;
    }

    @Override // com.google.android.gms.internal.InterfaceC0573d
    /* JADX INFO: renamed from: d */
    public int mo2094d() {
        return 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        C0519b c0519b = CREATOR;
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C0519b c0519b = CREATOR;
        C0519b.m2312a(this, parcel, i);
    }
}
