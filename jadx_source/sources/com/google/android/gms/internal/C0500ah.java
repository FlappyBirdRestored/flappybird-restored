package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ah */
/* JADX INFO: loaded from: classes.dex */
public class C0500ah implements SafeParcelable {
    public static final C0595g CREATOR = new C0595g();

    /* JADX INFO: renamed from: a */
    private final int f1771a;

    /* JADX INFO: renamed from: b */
    private final HashMap f1772b;

    /* JADX INFO: renamed from: c */
    private final ArrayList f1773c = null;

    /* JADX INFO: renamed from: d */
    private final String f1774d;

    /* JADX INFO: renamed from: com.google.android.gms.internal.ah$a */
    public class a implements SafeParcelable {
        public static final C0596h CREATOR = new C0596h();

        /* JADX INFO: renamed from: a */
        final int f1775a;

        /* JADX INFO: renamed from: b */
        final String f1776b;

        /* JADX INFO: renamed from: c */
        final ArrayList f1777c;

        a(int i, String str, ArrayList arrayList) {
            this.f1775a = i;
            this.f1776b = str;
            this.f1777c = arrayList;
        }

        a(String str, HashMap map) {
            this.f1775a = 1;
            this.f1776b = str;
            this.f1777c = m2260a(map);
        }

        /* JADX INFO: renamed from: a */
        private static ArrayList m2260a(HashMap map) {
            if (map == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : map.keySet()) {
                arrayList.add(new b(str, (AbstractC0497ae.a) map.get(str)));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: a */
        HashMap m2261a() {
            HashMap map = new HashMap();
            int size = this.f1777c.size();
            for (int i = 0; i < size; i++) {
                b bVar = (b) this.f1777c.get(i);
                map.put(bVar.f1779b, bVar.f1780c);
            }
            return map;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            C0596h c0596h = CREATOR;
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C0596h c0596h = CREATOR;
            C0596h.m2731a(this, parcel, i);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.ah$b */
    public class b implements SafeParcelable {
        public static final C0594f CREATOR = new C0594f();

        /* JADX INFO: renamed from: a */
        final int f1778a;

        /* JADX INFO: renamed from: b */
        final String f1779b;

        /* JADX INFO: renamed from: c */
        final AbstractC0497ae.a f1780c;

        b(int i, String str, AbstractC0497ae.a aVar) {
            this.f1778a = i;
            this.f1779b = str;
            this.f1780c = aVar;
        }

        b(String str, AbstractC0497ae.a aVar) {
            this.f1778a = 1;
            this.f1779b = str;
            this.f1780c = aVar;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            C0594f c0594f = CREATOR;
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C0594f c0594f = CREATOR;
            C0594f.m2725a(this, parcel, i);
        }
    }

    C0500ah(int i, ArrayList arrayList, String str) {
        this.f1771a = i;
        this.f1772b = m2254a(arrayList);
        this.f1774d = (String) C0588do.m2704a(str);
        m2256a();
    }

    /* JADX INFO: renamed from: a */
    private static HashMap m2254a(ArrayList arrayList) {
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) arrayList.get(i);
            map.put(aVar.f1776b, aVar.m2261a());
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public HashMap m2255a(String str) {
        return (HashMap) this.f1772b.get(str);
    }

    /* JADX INFO: renamed from: a */
    public void m2256a() {
        Iterator it = this.f1772b.keySet().iterator();
        while (it.hasNext()) {
            HashMap map = (HashMap) this.f1772b.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((AbstractC0497ae.a) map.get((String) it2.next())).m2241a(this);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    int m2257b() {
        return this.f1771a;
    }

    /* JADX INFO: renamed from: c */
    ArrayList m2258c() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f1772b.keySet()) {
            arrayList.add(new a(str, (HashMap) this.f1772b.get(str)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public String m2259d() {
        return this.f1774d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        C0595g c0595g = CREATOR;
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f1772b.keySet()) {
            sb.append(str).append(":\n");
            HashMap map = (HashMap) this.f1772b.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ").append(str2).append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C0595g c0595g = CREATOR;
        C0595g.m2728a(this, parcel, i);
    }
}
