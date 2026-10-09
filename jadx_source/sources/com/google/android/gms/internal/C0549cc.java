package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.p017a.p019b.InterfaceC0740a;
import com.google.android.gms.plus.p017a.p019b.InterfaceC0741b;
import com.google.android.gms.plus.p017a.p019b.InterfaceC0742c;
import com.google.android.gms.plus.p017a.p019b.InterfaceC0743d;
import com.google.android.gms.plus.p017a.p019b.InterfaceC0744e;
import com.google.android.gms.plus.p017a.p019b.InterfaceC0745f;
import com.google.android.gms.plus.p017a.p019b.InterfaceC0746g;
import com.google.android.gms.plus.p017a.p019b.InterfaceC0747h;
import com.google.android.gms.plus.p017a.p019b.InterfaceC0748i;
import com.google.android.gms.plus.p017a.p019b.InterfaceC0749j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.cc */
/* JADX INFO: loaded from: classes.dex */
public final class C0549cc extends AbstractC0497ae implements SafeParcelable, InterfaceC0740a {
    public static final C0531bl CREATOR = new C0531bl();

    /* JADX INFO: renamed from: a */
    private static final HashMap f1887a = new HashMap();

    /* JADX INFO: renamed from: A */
    private boolean f1888A;

    /* JADX INFO: renamed from: b */
    private final Set f1889b;

    /* JADX INFO: renamed from: c */
    private final int f1890c;

    /* JADX INFO: renamed from: d */
    private String f1891d;

    /* JADX INFO: renamed from: e */
    private a f1892e;

    /* JADX INFO: renamed from: f */
    private String f1893f;

    /* JADX INFO: renamed from: g */
    private String f1894g;

    /* JADX INFO: renamed from: h */
    private int f1895h;

    /* JADX INFO: renamed from: i */
    private b f1896i;

    /* JADX INFO: renamed from: j */
    private String f1897j;

    /* JADX INFO: renamed from: k */
    private String f1898k;

    /* JADX INFO: renamed from: l */
    private int f1899l;

    /* JADX INFO: renamed from: m */
    private String f1900m;

    /* JADX INFO: renamed from: n */
    private c f1901n;

    /* JADX INFO: renamed from: o */
    private boolean f1902o;

    /* JADX INFO: renamed from: p */
    private String f1903p;

    /* JADX INFO: renamed from: q */
    private d f1904q;

    /* JADX INFO: renamed from: r */
    private String f1905r;

    /* JADX INFO: renamed from: s */
    private int f1906s;

    /* JADX INFO: renamed from: t */
    private List f1907t;

    /* JADX INFO: renamed from: u */
    private List f1908u;

    /* JADX INFO: renamed from: v */
    private int f1909v;

    /* JADX INFO: renamed from: w */
    private int f1910w;

    /* JADX INFO: renamed from: x */
    private String f1911x;

    /* JADX INFO: renamed from: y */
    private String f1912y;

    /* JADX INFO: renamed from: z */
    private List f1913z;

    /* JADX INFO: renamed from: com.google.android.gms.internal.cc$a */
    public final class a extends AbstractC0497ae implements SafeParcelable, InterfaceC0741b {
        public static final C0532bm CREATOR = new C0532bm();

        /* JADX INFO: renamed from: a */
        private static final HashMap f1914a = new HashMap();

        /* JADX INFO: renamed from: b */
        private final Set f1915b;

        /* JADX INFO: renamed from: c */
        private final int f1916c;

        /* JADX INFO: renamed from: d */
        private int f1917d;

        /* JADX INFO: renamed from: e */
        private int f1918e;

        static {
            f1914a.put("max", AbstractC0497ae.a.m2230a("max", 2));
            f1914a.put("min", AbstractC0497ae.a.m2230a("min", 3));
        }

        public a() {
            this.f1916c = 1;
            this.f1915b = new HashSet();
        }

        a(Set set, int i, int i2, int i3) {
            this.f1915b = set;
            this.f1916c = i;
            this.f1917d = i2;
            this.f1918e = i3;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: a */
        protected Object mo2221a(String str) {
            return null;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: a */
        protected boolean mo2222a(AbstractC0497ae.a aVar) {
            return this.f1915b.contains(Integer.valueOf(aVar.m2247g()));
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        protected Object mo2223b(AbstractC0497ae.a aVar) {
            switch (aVar.m2247g()) {
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    return Integer.valueOf(this.f1917d);
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    return Integer.valueOf(this.f1918e);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.m2247g());
            }
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        public HashMap mo2224b() {
            return f1914a;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        protected boolean mo2225b(String str) {
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            C0532bm c0532bm = CREATOR;
            return 0;
        }

        /* JADX INFO: renamed from: e */
        Set m2530e() {
            return this.f1915b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            a aVar = (a) obj;
            for (AbstractC0497ae.a aVar2 : f1914a.values()) {
                if (mo2222a(aVar2)) {
                    if (aVar.mo2222a(aVar2) && mo2223b(aVar2).equals(aVar.mo2223b(aVar2))) {
                    }
                    return false;
                }
                if (aVar.mo2222a(aVar2)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: f */
        int m2531f() {
            return this.f1916c;
        }

        /* JADX INFO: renamed from: g */
        public int m2532g() {
            return this.f1917d;
        }

        /* JADX INFO: renamed from: h */
        public int m2533h() {
            return this.f1918e;
        }

        public int hashCode() {
            int iHashCode = 0;
            Iterator it = f1914a.values().iterator();
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

        @Override // com.google.android.gms.common.data.InterfaceC0449a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a mo1843a() {
            return this;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C0532bm c0532bm = CREATOR;
            C0532bm.m2390a(this, parcel, i);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.cc$b */
    public final class b extends AbstractC0497ae implements SafeParcelable, InterfaceC0742c {
        public static final C0533bn CREATOR = new C0533bn();

        /* JADX INFO: renamed from: a */
        private static final HashMap f1919a = new HashMap();

        /* JADX INFO: renamed from: b */
        private final Set f1920b;

        /* JADX INFO: renamed from: c */
        private final int f1921c;

        /* JADX INFO: renamed from: d */
        private a f1922d;

        /* JADX INFO: renamed from: e */
        private C1042b f1923e;

        /* JADX INFO: renamed from: f */
        private int f1924f;

        /* JADX INFO: renamed from: com.google.android.gms.internal.cc$b$a */
        public final class a extends AbstractC0497ae implements SafeParcelable, InterfaceC0743d {
            public static final C0534bo CREATOR = new C0534bo();

            /* JADX INFO: renamed from: a */
            private static final HashMap f1925a = new HashMap();

            /* JADX INFO: renamed from: b */
            private final Set f1926b;

            /* JADX INFO: renamed from: c */
            private final int f1927c;

            /* JADX INFO: renamed from: d */
            private int f1928d;

            /* JADX INFO: renamed from: e */
            private int f1929e;

            static {
                f1925a.put("leftImageOffset", AbstractC0497ae.a.m2230a("leftImageOffset", 2));
                f1925a.put("topImageOffset", AbstractC0497ae.a.m2230a("topImageOffset", 3));
            }

            public a() {
                this.f1927c = 1;
                this.f1926b = new HashSet();
            }

            a(Set set, int i, int i2, int i3) {
                this.f1926b = set;
                this.f1927c = i;
                this.f1928d = i2;
                this.f1929e = i3;
            }

            @Override // com.google.android.gms.internal.AbstractC0497ae
            /* JADX INFO: renamed from: a */
            protected Object mo2221a(String str) {
                return null;
            }

            @Override // com.google.android.gms.internal.AbstractC0497ae
            /* JADX INFO: renamed from: a */
            protected boolean mo2222a(AbstractC0497ae.a aVar) {
                return this.f1926b.contains(Integer.valueOf(aVar.m2247g()));
            }

            @Override // com.google.android.gms.internal.AbstractC0497ae
            /* JADX INFO: renamed from: b */
            protected Object mo2223b(AbstractC0497ae.a aVar) {
                switch (aVar.m2247g()) {
                    case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                        return Integer.valueOf(this.f1928d);
                    case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                        return Integer.valueOf(this.f1929e);
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + aVar.m2247g());
                }
            }

            @Override // com.google.android.gms.internal.AbstractC0497ae
            /* JADX INFO: renamed from: b */
            public HashMap mo2224b() {
                return f1925a;
            }

            @Override // com.google.android.gms.internal.AbstractC0497ae
            /* JADX INFO: renamed from: b */
            protected boolean mo2225b(String str) {
                return false;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                C0534bo c0534bo = CREATOR;
                return 0;
            }

            /* JADX INFO: renamed from: e */
            Set m2541e() {
                return this.f1926b;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof a)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                a aVar = (a) obj;
                for (AbstractC0497ae.a aVar2 : f1925a.values()) {
                    if (mo2222a(aVar2)) {
                        if (aVar.mo2222a(aVar2) && mo2223b(aVar2).equals(aVar.mo2223b(aVar2))) {
                        }
                        return false;
                    }
                    if (aVar.mo2222a(aVar2)) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX INFO: renamed from: f */
            int m2542f() {
                return this.f1927c;
            }

            /* JADX INFO: renamed from: g */
            public int m2543g() {
                return this.f1928d;
            }

            /* JADX INFO: renamed from: h */
            public int m2544h() {
                return this.f1929e;
            }

            public int hashCode() {
                int iHashCode = 0;
                Iterator it = f1925a.values().iterator();
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

            @Override // com.google.android.gms.common.data.InterfaceC0449a
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public a mo1843a() {
                return this;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                C0534bo c0534bo = CREATOR;
                C0534bo.m2396a(this, parcel, i);
            }
        }

        /* JADX INFO: renamed from: com.google.android.gms.internal.cc$b$b, reason: collision with other inner class name */
        public final class C1042b extends AbstractC0497ae implements SafeParcelable, InterfaceC0744e {
            public static final C0535bp CREATOR = new C0535bp();

            /* JADX INFO: renamed from: a */
            private static final HashMap f1930a = new HashMap();

            /* JADX INFO: renamed from: b */
            private final Set f1931b;

            /* JADX INFO: renamed from: c */
            private final int f1932c;

            /* JADX INFO: renamed from: d */
            private int f1933d;

            /* JADX INFO: renamed from: e */
            private String f1934e;

            /* JADX INFO: renamed from: f */
            private int f1935f;

            static {
                f1930a.put("height", AbstractC0497ae.a.m2230a("height", 2));
                f1930a.put("url", AbstractC0497ae.a.m2237d("url", 3));
                f1930a.put("width", AbstractC0497ae.a.m2230a("width", 4));
            }

            public C1042b() {
                this.f1932c = 1;
                this.f1931b = new HashSet();
            }

            C1042b(Set set, int i, int i2, String str, int i3) {
                this.f1931b = set;
                this.f1932c = i;
                this.f1933d = i2;
                this.f1934e = str;
                this.f1935f = i3;
            }

            @Override // com.google.android.gms.internal.AbstractC0497ae
            /* JADX INFO: renamed from: a */
            protected Object mo2221a(String str) {
                return null;
            }

            @Override // com.google.android.gms.internal.AbstractC0497ae
            /* JADX INFO: renamed from: a */
            protected boolean mo2222a(AbstractC0497ae.a aVar) {
                return this.f1931b.contains(Integer.valueOf(aVar.m2247g()));
            }

            @Override // com.google.android.gms.internal.AbstractC0497ae
            /* JADX INFO: renamed from: b */
            protected Object mo2223b(AbstractC0497ae.a aVar) {
                switch (aVar.m2247g()) {
                    case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                        return Integer.valueOf(this.f1933d);
                    case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                        return this.f1934e;
                    case C0467e.MapAttrs_cameraTilt /* 4 */:
                        return Integer.valueOf(this.f1935f);
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + aVar.m2247g());
                }
            }

            @Override // com.google.android.gms.internal.AbstractC0497ae
            /* JADX INFO: renamed from: b */
            public HashMap mo2224b() {
                return f1930a;
            }

            @Override // com.google.android.gms.internal.AbstractC0497ae
            /* JADX INFO: renamed from: b */
            protected boolean mo2225b(String str) {
                return false;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                C0535bp c0535bp = CREATOR;
                return 0;
            }

            /* JADX INFO: renamed from: e */
            Set m2546e() {
                return this.f1931b;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof C1042b)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                C1042b c1042b = (C1042b) obj;
                for (AbstractC0497ae.a aVar : f1930a.values()) {
                    if (mo2222a(aVar)) {
                        if (c1042b.mo2222a(aVar) && mo2223b(aVar).equals(c1042b.mo2223b(aVar))) {
                        }
                        return false;
                    }
                    if (c1042b.mo2222a(aVar)) {
                        return false;
                    }
                }
                return true;
            }

            /* JADX INFO: renamed from: f */
            int m2547f() {
                return this.f1932c;
            }

            /* JADX INFO: renamed from: g */
            public int m2548g() {
                return this.f1933d;
            }

            /* JADX INFO: renamed from: h */
            public String m2549h() {
                return this.f1934e;
            }

            public int hashCode() {
                int iHashCode = 0;
                Iterator it = f1930a.values().iterator();
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
            public int m2550i() {
                return this.f1935f;
            }

            @Override // com.google.android.gms.common.data.InterfaceC0449a
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public C1042b mo1843a() {
                return this;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                C0535bp c0535bp = CREATOR;
                C0535bp.m2399a(this, parcel, i);
            }
        }

        static {
            f1919a.put("coverInfo", AbstractC0497ae.a.m2232a("coverInfo", 2, a.class));
            f1919a.put("coverPhoto", AbstractC0497ae.a.m2232a("coverPhoto", 3, C1042b.class));
            f1919a.put("layout", AbstractC0497ae.a.m2231a("layout", 4, new C0494ab().m2089a("banner", 0), false));
        }

        public b() {
            this.f1921c = 1;
            this.f1920b = new HashSet();
        }

        b(Set set, int i, a aVar, C1042b c1042b, int i2) {
            this.f1920b = set;
            this.f1921c = i;
            this.f1922d = aVar;
            this.f1923e = c1042b;
            this.f1924f = i2;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: a */
        protected Object mo2221a(String str) {
            return null;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: a */
        protected boolean mo2222a(AbstractC0497ae.a aVar) {
            return this.f1920b.contains(Integer.valueOf(aVar.m2247g()));
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        protected Object mo2223b(AbstractC0497ae.a aVar) {
            switch (aVar.m2247g()) {
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    return this.f1922d;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    return this.f1923e;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    return Integer.valueOf(this.f1924f);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.m2247g());
            }
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        public HashMap mo2224b() {
            return f1919a;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        protected boolean mo2225b(String str) {
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            C0533bn c0533bn = CREATOR;
            return 0;
        }

        /* JADX INFO: renamed from: e */
        Set m2535e() {
            return this.f1920b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            b bVar = (b) obj;
            for (AbstractC0497ae.a aVar : f1919a.values()) {
                if (mo2222a(aVar)) {
                    if (bVar.mo2222a(aVar) && mo2223b(aVar).equals(bVar.mo2223b(aVar))) {
                    }
                    return false;
                }
                if (bVar.mo2222a(aVar)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: f */
        int m2536f() {
            return this.f1921c;
        }

        /* JADX INFO: renamed from: g */
        a m2537g() {
            return this.f1922d;
        }

        /* JADX INFO: renamed from: h */
        C1042b m2538h() {
            return this.f1923e;
        }

        public int hashCode() {
            int iHashCode = 0;
            Iterator it = f1919a.values().iterator();
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
        public int m2539i() {
            return this.f1924f;
        }

        @Override // com.google.android.gms.common.data.InterfaceC0449a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b mo1843a() {
            return this;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C0533bn c0533bn = CREATOR;
            C0533bn.m2393a(this, parcel, i);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.cc$c */
    public final class c extends AbstractC0497ae implements SafeParcelable, InterfaceC0745f {
        public static final C0536bq CREATOR = new C0536bq();

        /* JADX INFO: renamed from: a */
        private static final HashMap f1936a = new HashMap();

        /* JADX INFO: renamed from: b */
        private final Set f1937b;

        /* JADX INFO: renamed from: c */
        private final int f1938c;

        /* JADX INFO: renamed from: d */
        private String f1939d;

        static {
            f1936a.put("url", AbstractC0497ae.a.m2237d("url", 2));
        }

        public c() {
            this.f1938c = 1;
            this.f1937b = new HashSet();
        }

        c(Set set, int i, String str) {
            this.f1937b = set;
            this.f1938c = i;
            this.f1939d = str;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: a */
        protected Object mo2221a(String str) {
            return null;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: a */
        protected boolean mo2222a(AbstractC0497ae.a aVar) {
            return this.f1937b.contains(Integer.valueOf(aVar.m2247g()));
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        protected Object mo2223b(AbstractC0497ae.a aVar) {
            switch (aVar.m2247g()) {
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    return this.f1939d;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.m2247g());
            }
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        public HashMap mo2224b() {
            return f1936a;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        protected boolean mo2225b(String str) {
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            C0536bq c0536bq = CREATOR;
            return 0;
        }

        /* JADX INFO: renamed from: e */
        Set m2552e() {
            return this.f1937b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            c cVar = (c) obj;
            for (AbstractC0497ae.a aVar : f1936a.values()) {
                if (mo2222a(aVar)) {
                    if (cVar.mo2222a(aVar) && mo2223b(aVar).equals(cVar.mo2223b(aVar))) {
                    }
                    return false;
                }
                if (cVar.mo2222a(aVar)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: f */
        int m2553f() {
            return this.f1938c;
        }

        /* JADX INFO: renamed from: g */
        public String m2554g() {
            return this.f1939d;
        }

        @Override // com.google.android.gms.common.data.InterfaceC0449a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public c mo1843a() {
            return this;
        }

        public int hashCode() {
            int iHashCode = 0;
            Iterator it = f1936a.values().iterator();
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

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C0536bq c0536bq = CREATOR;
            C0536bq.m2402a(this, parcel, i);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.cc$d */
    public final class d extends AbstractC0497ae implements SafeParcelable, InterfaceC0746g {
        public static final C0537br CREATOR = new C0537br();

        /* JADX INFO: renamed from: a */
        private static final HashMap f1940a = new HashMap();

        /* JADX INFO: renamed from: b */
        private final Set f1941b;

        /* JADX INFO: renamed from: c */
        private final int f1942c;

        /* JADX INFO: renamed from: d */
        private String f1943d;

        /* JADX INFO: renamed from: e */
        private String f1944e;

        /* JADX INFO: renamed from: f */
        private String f1945f;

        /* JADX INFO: renamed from: g */
        private String f1946g;

        /* JADX INFO: renamed from: h */
        private String f1947h;

        /* JADX INFO: renamed from: i */
        private String f1948i;

        static {
            f1940a.put("familyName", AbstractC0497ae.a.m2237d("familyName", 2));
            f1940a.put("formatted", AbstractC0497ae.a.m2237d("formatted", 3));
            f1940a.put("givenName", AbstractC0497ae.a.m2237d("givenName", 4));
            f1940a.put("honorificPrefix", AbstractC0497ae.a.m2237d("honorificPrefix", 5));
            f1940a.put("honorificSuffix", AbstractC0497ae.a.m2237d("honorificSuffix", 6));
            f1940a.put("middleName", AbstractC0497ae.a.m2237d("middleName", 7));
        }

        public d() {
            this.f1942c = 1;
            this.f1941b = new HashSet();
        }

        d(Set set, int i, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f1941b = set;
            this.f1942c = i;
            this.f1943d = str;
            this.f1944e = str2;
            this.f1945f = str3;
            this.f1946g = str4;
            this.f1947h = str5;
            this.f1948i = str6;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: a */
        protected Object mo2221a(String str) {
            return null;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: a */
        protected boolean mo2222a(AbstractC0497ae.a aVar) {
            return this.f1941b.contains(Integer.valueOf(aVar.m2247g()));
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        protected Object mo2223b(AbstractC0497ae.a aVar) {
            switch (aVar.m2247g()) {
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    return this.f1943d;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    return this.f1944e;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    return this.f1945f;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    return this.f1946g;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    return this.f1947h;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    return this.f1948i;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.m2247g());
            }
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        public HashMap mo2224b() {
            return f1940a;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        protected boolean mo2225b(String str) {
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            C0537br c0537br = CREATOR;
            return 0;
        }

        /* JADX INFO: renamed from: e */
        Set m2556e() {
            return this.f1941b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            d dVar = (d) obj;
            for (AbstractC0497ae.a aVar : f1940a.values()) {
                if (mo2222a(aVar)) {
                    if (dVar.mo2222a(aVar) && mo2223b(aVar).equals(dVar.mo2223b(aVar))) {
                    }
                    return false;
                }
                if (dVar.mo2222a(aVar)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: f */
        int m2557f() {
            return this.f1942c;
        }

        /* JADX INFO: renamed from: g */
        public String m2558g() {
            return this.f1943d;
        }

        /* JADX INFO: renamed from: h */
        public String m2559h() {
            return this.f1944e;
        }

        public int hashCode() {
            int iHashCode = 0;
            Iterator it = f1940a.values().iterator();
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
        public String m2560i() {
            return this.f1945f;
        }

        /* JADX INFO: renamed from: j */
        public String m2561j() {
            return this.f1946g;
        }

        /* JADX INFO: renamed from: k */
        public String m2562k() {
            return this.f1947h;
        }

        /* JADX INFO: renamed from: l */
        public String m2563l() {
            return this.f1948i;
        }

        @Override // com.google.android.gms.common.data.InterfaceC0449a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public d mo1843a() {
            return this;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C0537br c0537br = CREATOR;
            C0537br.m2405a(this, parcel, i);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.cc$f */
    public final class f extends AbstractC0497ae implements SafeParcelable, InterfaceC0747h {
        public static final C0538bs CREATOR = new C0538bs();

        /* JADX INFO: renamed from: a */
        private static final HashMap f1949a = new HashMap();

        /* JADX INFO: renamed from: b */
        private final Set f1950b;

        /* JADX INFO: renamed from: c */
        private final int f1951c;

        /* JADX INFO: renamed from: d */
        private String f1952d;

        /* JADX INFO: renamed from: e */
        private String f1953e;

        /* JADX INFO: renamed from: f */
        private String f1954f;

        /* JADX INFO: renamed from: g */
        private String f1955g;

        /* JADX INFO: renamed from: h */
        private String f1956h;

        /* JADX INFO: renamed from: i */
        private boolean f1957i;

        /* JADX INFO: renamed from: j */
        private String f1958j;

        /* JADX INFO: renamed from: k */
        private String f1959k;

        /* JADX INFO: renamed from: l */
        private int f1960l;

        static {
            f1949a.put("department", AbstractC0497ae.a.m2237d("department", 2));
            f1949a.put("description", AbstractC0497ae.a.m2237d("description", 3));
            f1949a.put("endDate", AbstractC0497ae.a.m2237d("endDate", 4));
            f1949a.put("location", AbstractC0497ae.a.m2237d("location", 5));
            f1949a.put("name", AbstractC0497ae.a.m2237d("name", 6));
            f1949a.put("primary", AbstractC0497ae.a.m2236c("primary", 7));
            f1949a.put("startDate", AbstractC0497ae.a.m2237d("startDate", 8));
            f1949a.put("title", AbstractC0497ae.a.m2237d("title", 9));
            f1949a.put("type", AbstractC0497ae.a.m2231a("type", 10, new C0494ab().m2089a("work", 0).m2089a("school", 1), false));
        }

        public f() {
            this.f1951c = 1;
            this.f1950b = new HashSet();
        }

        f(Set set, int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i2) {
            this.f1950b = set;
            this.f1951c = i;
            this.f1952d = str;
            this.f1953e = str2;
            this.f1954f = str3;
            this.f1955g = str4;
            this.f1956h = str5;
            this.f1957i = z;
            this.f1958j = str6;
            this.f1959k = str7;
            this.f1960l = i2;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: a */
        protected Object mo2221a(String str) {
            return null;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: a */
        protected boolean mo2222a(AbstractC0497ae.a aVar) {
            return this.f1950b.contains(Integer.valueOf(aVar.m2247g()));
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        protected Object mo2223b(AbstractC0497ae.a aVar) {
            switch (aVar.m2247g()) {
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    return this.f1952d;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    return this.f1953e;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    return this.f1954f;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    return this.f1955g;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    return this.f1956h;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    return Boolean.valueOf(this.f1957i);
                case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                    return this.f1958j;
                case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                    return this.f1959k;
                case C0467e.MapAttrs_uiZoomControls /* 10 */:
                    return Integer.valueOf(this.f1960l);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.m2247g());
            }
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        public HashMap mo2224b() {
            return f1949a;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        protected boolean mo2225b(String str) {
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            C0538bs c0538bs = CREATOR;
            return 0;
        }

        /* JADX INFO: renamed from: e */
        Set m2565e() {
            return this.f1950b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            f fVar = (f) obj;
            for (AbstractC0497ae.a aVar : f1949a.values()) {
                if (mo2222a(aVar)) {
                    if (fVar.mo2222a(aVar) && mo2223b(aVar).equals(fVar.mo2223b(aVar))) {
                    }
                    return false;
                }
                if (fVar.mo2222a(aVar)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: f */
        int m2566f() {
            return this.f1951c;
        }

        /* JADX INFO: renamed from: g */
        public String m2567g() {
            return this.f1952d;
        }

        /* JADX INFO: renamed from: h */
        public String m2568h() {
            return this.f1953e;
        }

        public int hashCode() {
            int iHashCode = 0;
            Iterator it = f1949a.values().iterator();
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
        public String m2569i() {
            return this.f1954f;
        }

        /* JADX INFO: renamed from: j */
        public String m2570j() {
            return this.f1955g;
        }

        /* JADX INFO: renamed from: k */
        public String m2571k() {
            return this.f1956h;
        }

        /* JADX INFO: renamed from: l */
        public boolean m2572l() {
            return this.f1957i;
        }

        /* JADX INFO: renamed from: m */
        public String m2573m() {
            return this.f1958j;
        }

        /* JADX INFO: renamed from: n */
        public String m2574n() {
            return this.f1959k;
        }

        /* JADX INFO: renamed from: o */
        public int m2575o() {
            return this.f1960l;
        }

        @Override // com.google.android.gms.common.data.InterfaceC0449a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public f mo1843a() {
            return this;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C0538bs c0538bs = CREATOR;
            C0538bs.m2408a(this, parcel, i);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.cc$g */
    public final class g extends AbstractC0497ae implements SafeParcelable, InterfaceC0748i {
        public static final C0539bt CREATOR = new C0539bt();

        /* JADX INFO: renamed from: a */
        private static final HashMap f1961a = new HashMap();

        /* JADX INFO: renamed from: b */
        private final Set f1962b;

        /* JADX INFO: renamed from: c */
        private final int f1963c;

        /* JADX INFO: renamed from: d */
        private boolean f1964d;

        /* JADX INFO: renamed from: e */
        private String f1965e;

        static {
            f1961a.put("primary", AbstractC0497ae.a.m2236c("primary", 2));
            f1961a.put("value", AbstractC0497ae.a.m2237d("value", 3));
        }

        public g() {
            this.f1963c = 1;
            this.f1962b = new HashSet();
        }

        g(Set set, int i, boolean z, String str) {
            this.f1962b = set;
            this.f1963c = i;
            this.f1964d = z;
            this.f1965e = str;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: a */
        protected Object mo2221a(String str) {
            return null;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: a */
        protected boolean mo2222a(AbstractC0497ae.a aVar) {
            return this.f1962b.contains(Integer.valueOf(aVar.m2247g()));
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        protected Object mo2223b(AbstractC0497ae.a aVar) {
            switch (aVar.m2247g()) {
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    return Boolean.valueOf(this.f1964d);
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    return this.f1965e;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.m2247g());
            }
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        public HashMap mo2224b() {
            return f1961a;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        protected boolean mo2225b(String str) {
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            C0539bt c0539bt = CREATOR;
            return 0;
        }

        /* JADX INFO: renamed from: e */
        Set m2577e() {
            return this.f1962b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            g gVar = (g) obj;
            for (AbstractC0497ae.a aVar : f1961a.values()) {
                if (mo2222a(aVar)) {
                    if (gVar.mo2222a(aVar) && mo2223b(aVar).equals(gVar.mo2223b(aVar))) {
                    }
                    return false;
                }
                if (gVar.mo2222a(aVar)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: f */
        int m2578f() {
            return this.f1963c;
        }

        /* JADX INFO: renamed from: g */
        public boolean m2579g() {
            return this.f1964d;
        }

        /* JADX INFO: renamed from: h */
        public String m2580h() {
            return this.f1965e;
        }

        public int hashCode() {
            int iHashCode = 0;
            Iterator it = f1961a.values().iterator();
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

        @Override // com.google.android.gms.common.data.InterfaceC0449a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public g mo1843a() {
            return this;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C0539bt c0539bt = CREATOR;
            C0539bt.m2411a(this, parcel, i);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.cc$h */
    public final class h extends AbstractC0497ae implements SafeParcelable, InterfaceC0749j {
        public static final C0540bu CREATOR = new C0540bu();

        /* JADX INFO: renamed from: a */
        private static final HashMap f1966a = new HashMap();

        /* JADX INFO: renamed from: b */
        private final Set f1967b;

        /* JADX INFO: renamed from: c */
        private final int f1968c;

        /* JADX INFO: renamed from: d */
        private String f1969d;

        /* JADX INFO: renamed from: e */
        private final int f1970e;

        /* JADX INFO: renamed from: f */
        private int f1971f;

        /* JADX INFO: renamed from: g */
        private String f1972g;

        static {
            f1966a.put("label", AbstractC0497ae.a.m2237d("label", 5));
            f1966a.put("type", AbstractC0497ae.a.m2231a("type", 6, new C0494ab().m2089a("home", 0).m2089a("work", 1).m2089a("blog", 2).m2089a("profile", 3).m2089a("other", 4).m2089a("otherProfile", 5).m2089a("contributor", 6).m2089a("website", 7), false));
            f1966a.put("value", AbstractC0497ae.a.m2237d("value", 4));
        }

        public h() {
            this.f1970e = 4;
            this.f1968c = 2;
            this.f1967b = new HashSet();
        }

        h(Set set, int i, String str, int i2, String str2, int i3) {
            this.f1970e = 4;
            this.f1967b = set;
            this.f1968c = i;
            this.f1969d = str;
            this.f1971f = i2;
            this.f1972g = str2;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: a */
        protected Object mo2221a(String str) {
            return null;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: a */
        protected boolean mo2222a(AbstractC0497ae.a aVar) {
            return this.f1967b.contains(Integer.valueOf(aVar.m2247g()));
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        protected Object mo2223b(AbstractC0497ae.a aVar) {
            switch (aVar.m2247g()) {
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    return this.f1972g;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    return this.f1969d;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    return Integer.valueOf(this.f1971f);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + aVar.m2247g());
            }
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        public HashMap mo2224b() {
            return f1966a;
        }

        @Override // com.google.android.gms.internal.AbstractC0497ae
        /* JADX INFO: renamed from: b */
        protected boolean mo2225b(String str) {
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            C0540bu c0540bu = CREATOR;
            return 0;
        }

        /* JADX INFO: renamed from: e */
        Set m2582e() {
            return this.f1967b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof h)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            h hVar = (h) obj;
            for (AbstractC0497ae.a aVar : f1966a.values()) {
                if (mo2222a(aVar)) {
                    if (hVar.mo2222a(aVar) && mo2223b(aVar).equals(hVar.mo2223b(aVar))) {
                    }
                    return false;
                }
                if (hVar.mo2222a(aVar)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: f */
        int m2583f() {
            return this.f1968c;
        }

        /* JADX INFO: renamed from: g */
        public String m2584g() {
            return this.f1969d;
        }

        @Deprecated
        /* JADX INFO: renamed from: h */
        public int m2585h() {
            return 4;
        }

        public int hashCode() {
            int iHashCode = 0;
            Iterator it = f1966a.values().iterator();
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
        public int m2586i() {
            return this.f1971f;
        }

        /* JADX INFO: renamed from: j */
        public String m2587j() {
            return this.f1972g;
        }

        @Override // com.google.android.gms.common.data.InterfaceC0449a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public h mo1843a() {
            return this;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C0540bu c0540bu = CREATOR;
            C0540bu.m2414a(this, parcel, i);
        }
    }

    static {
        f1887a.put("aboutMe", AbstractC0497ae.a.m2237d("aboutMe", 2));
        f1887a.put("ageRange", AbstractC0497ae.a.m2232a("ageRange", 3, a.class));
        f1887a.put("birthday", AbstractC0497ae.a.m2237d("birthday", 4));
        f1887a.put("braggingRights", AbstractC0497ae.a.m2237d("braggingRights", 5));
        f1887a.put("circledByCount", AbstractC0497ae.a.m2230a("circledByCount", 6));
        f1887a.put("cover", AbstractC0497ae.a.m2232a("cover", 7, b.class));
        f1887a.put("currentLocation", AbstractC0497ae.a.m2237d("currentLocation", 8));
        f1887a.put("displayName", AbstractC0497ae.a.m2237d("displayName", 9));
        f1887a.put("gender", AbstractC0497ae.a.m2231a("gender", 12, new C0494ab().m2089a("male", 0).m2089a("female", 1).m2089a("other", 2), false));
        f1887a.put("id", AbstractC0497ae.a.m2237d("id", 14));
        f1887a.put("image", AbstractC0497ae.a.m2232a("image", 15, c.class));
        f1887a.put("isPlusUser", AbstractC0497ae.a.m2236c("isPlusUser", 16));
        f1887a.put("language", AbstractC0497ae.a.m2237d("language", 18));
        f1887a.put("name", AbstractC0497ae.a.m2232a("name", 19, d.class));
        f1887a.put("nickname", AbstractC0497ae.a.m2237d("nickname", 20));
        f1887a.put("objectType", AbstractC0497ae.a.m2231a("objectType", 21, new C0494ab().m2089a("person", 0).m2089a("page", 1), false));
        f1887a.put("organizations", AbstractC0497ae.a.m2235b("organizations", 22, f.class));
        f1887a.put("placesLived", AbstractC0497ae.a.m2235b("placesLived", 23, g.class));
        f1887a.put("plusOneCount", AbstractC0497ae.a.m2230a("plusOneCount", 24));
        f1887a.put("relationshipStatus", AbstractC0497ae.a.m2231a("relationshipStatus", 25, new C0494ab().m2089a("single", 0).m2089a("in_a_relationship", 1).m2089a("engaged", 2).m2089a("married", 3).m2089a("its_complicated", 4).m2089a("open_relationship", 5).m2089a("widowed", 6).m2089a("in_domestic_partnership", 7).m2089a("in_civil_union", 8), false));
        f1887a.put("tagline", AbstractC0497ae.a.m2237d("tagline", 26));
        f1887a.put("url", AbstractC0497ae.a.m2237d("url", 27));
        f1887a.put("urls", AbstractC0497ae.a.m2235b("urls", 28, h.class));
        f1887a.put("verified", AbstractC0497ae.a.m2236c("verified", 29));
    }

    public C0549cc() {
        this.f1890c = 2;
        this.f1889b = new HashSet();
    }

    C0549cc(Set set, int i, String str, a aVar, String str2, String str3, int i2, b bVar, String str4, String str5, int i3, String str6, c cVar, boolean z, String str7, d dVar, String str8, int i4, List list, List list2, int i5, int i6, String str9, String str10, List list3, boolean z2) {
        this.f1889b = set;
        this.f1890c = i;
        this.f1891d = str;
        this.f1892e = aVar;
        this.f1893f = str2;
        this.f1894g = str3;
        this.f1895h = i2;
        this.f1896i = bVar;
        this.f1897j = str4;
        this.f1898k = str5;
        this.f1899l = i3;
        this.f1900m = str6;
        this.f1901n = cVar;
        this.f1902o = z;
        this.f1903p = str7;
        this.f1904q = dVar;
        this.f1905r = str8;
        this.f1906s = i4;
        this.f1907t = list;
        this.f1908u = list2;
        this.f1909v = i5;
        this.f1910w = i6;
        this.f1911x = str9;
        this.f1912y = str10;
        this.f1913z = list3;
        this.f1888A = z2;
    }

    /* JADX INFO: renamed from: a */
    public static C0549cc m2502a(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        C0549cc c0549ccM2388a = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return c0549ccM2388a;
    }

    /* JADX INFO: renamed from: A */
    public String m2503A() {
        return this.f1911x;
    }

    /* JADX INFO: renamed from: B */
    public String m2504B() {
        return this.f1912y;
    }

    /* JADX INFO: renamed from: C */
    List m2505C() {
        return this.f1913z;
    }

    /* JADX INFO: renamed from: D */
    public boolean m2506D() {
        return this.f1888A;
    }

    @Override // com.google.android.gms.common.data.InterfaceC0449a
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C0549cc mo1843a() {
        return this;
    }

    @Override // com.google.android.gms.internal.AbstractC0497ae
    /* JADX INFO: renamed from: a */
    protected Object mo2221a(String str) {
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC0497ae
    /* JADX INFO: renamed from: a */
    protected boolean mo2222a(AbstractC0497ae.a aVar) {
        return this.f1889b.contains(Integer.valueOf(aVar.m2247g()));
    }

    @Override // com.google.android.gms.internal.AbstractC0497ae
    /* JADX INFO: renamed from: b */
    protected Object mo2223b(AbstractC0497ae.a aVar) {
        switch (aVar.m2247g()) {
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                return this.f1891d;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                return this.f1892e;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                return this.f1893f;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                return this.f1894g;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                return Integer.valueOf(this.f1895h);
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                return this.f1896i;
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                return this.f1897j;
            case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                return this.f1898k;
            case C0467e.MapAttrs_uiZoomControls /* 10 */:
            case C0467e.MapAttrs_uiZoomGestures /* 11 */:
            case C0467e.MapAttrs_zOrderOnTop /* 13 */:
            case 17:
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + aVar.m2247g());
            case C0467e.MapAttrs_useViewLifecycle /* 12 */:
                return Integer.valueOf(this.f1899l);
            case 14:
                return this.f1900m;
            case 15:
                return this.f1901n;
            case 16:
                return Boolean.valueOf(this.f1902o);
            case 18:
                return this.f1903p;
            case 19:
                return this.f1904q;
            case 20:
                return this.f1905r;
            case 21:
                return Integer.valueOf(this.f1906s);
            case 22:
                return this.f1907t;
            case 23:
                return this.f1908u;
            case 24:
                return Integer.valueOf(this.f1909v);
            case 25:
                return Integer.valueOf(this.f1910w);
            case 26:
                return this.f1911x;
            case 27:
                return this.f1912y;
            case 28:
                return this.f1913z;
            case 29:
                return Boolean.valueOf(this.f1888A);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC0497ae
    /* JADX INFO: renamed from: b */
    public HashMap mo2224b() {
        return f1887a;
    }

    @Override // com.google.android.gms.internal.AbstractC0497ae
    /* JADX INFO: renamed from: b */
    protected boolean mo2225b(String str) {
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        C0531bl c0531bl = CREATOR;
        return 0;
    }

    /* JADX INFO: renamed from: e */
    Set m2508e() {
        return this.f1889b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0549cc)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0549cc c0549cc = (C0549cc) obj;
        for (AbstractC0497ae.a aVar : f1887a.values()) {
            if (mo2222a(aVar)) {
                if (c0549cc.mo2222a(aVar) && mo2223b(aVar).equals(c0549cc.mo2223b(aVar))) {
                }
                return false;
            }
            if (c0549cc.mo2222a(aVar)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    int m2509f() {
        return this.f1890c;
    }

    /* JADX INFO: renamed from: g */
    public String m2510g() {
        return this.f1891d;
    }

    /* JADX INFO: renamed from: h */
    a m2511h() {
        return this.f1892e;
    }

    public int hashCode() {
        int iHashCode = 0;
        Iterator it = f1887a.values().iterator();
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
    public String m2512i() {
        return this.f1893f;
    }

    /* JADX INFO: renamed from: j */
    public String m2513j() {
        return this.f1894g;
    }

    /* JADX INFO: renamed from: k */
    public int m2514k() {
        return this.f1895h;
    }

    /* JADX INFO: renamed from: l */
    b m2515l() {
        return this.f1896i;
    }

    /* JADX INFO: renamed from: m */
    public String m2516m() {
        return this.f1897j;
    }

    /* JADX INFO: renamed from: n */
    public String m2517n() {
        return this.f1898k;
    }

    /* JADX INFO: renamed from: o */
    public int m2518o() {
        return this.f1899l;
    }

    /* JADX INFO: renamed from: p */
    public String m2519p() {
        return this.f1900m;
    }

    /* JADX INFO: renamed from: q */
    c m2520q() {
        return this.f1901n;
    }

    /* JADX INFO: renamed from: r */
    public boolean m2521r() {
        return this.f1902o;
    }

    /* JADX INFO: renamed from: s */
    public String m2522s() {
        return this.f1903p;
    }

    /* JADX INFO: renamed from: t */
    d m2523t() {
        return this.f1904q;
    }

    /* JADX INFO: renamed from: u */
    public String m2524u() {
        return this.f1905r;
    }

    /* JADX INFO: renamed from: v */
    public int m2525v() {
        return this.f1906s;
    }

    /* JADX INFO: renamed from: w */
    List m2526w() {
        return this.f1907t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C0531bl c0531bl = CREATOR;
        C0531bl.m2387a(this, parcel, i);
    }

    /* JADX INFO: renamed from: x */
    List m2527x() {
        return this.f1908u;
    }

    /* JADX INFO: renamed from: y */
    public int m2528y() {
        return this.f1909v;
    }

    /* JADX INFO: renamed from: z */
    public int m2529z() {
        return this.f1910w;
    }
}
