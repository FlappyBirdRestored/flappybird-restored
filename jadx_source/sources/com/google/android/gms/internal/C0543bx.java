package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.p017a.p018a.InterfaceC0738a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.bx */
/* JADX INFO: loaded from: classes.dex */
public final class C0543bx extends AbstractC0497ae implements SafeParcelable, InterfaceC0738a {
    public static final C0527bh CREATOR = new C0527bh();

    /* JADX INFO: renamed from: a */
    private static final HashMap f1822a = new HashMap();

    /* JADX INFO: renamed from: A */
    private String f1823A;

    /* JADX INFO: renamed from: B */
    private String f1824B;

    /* JADX INFO: renamed from: C */
    private String f1825C;

    /* JADX INFO: renamed from: D */
    private String f1826D;

    /* JADX INFO: renamed from: E */
    private C0543bx f1827E;

    /* JADX INFO: renamed from: F */
    private String f1828F;

    /* JADX INFO: renamed from: G */
    private String f1829G;

    /* JADX INFO: renamed from: H */
    private String f1830H;

    /* JADX INFO: renamed from: I */
    private String f1831I;

    /* JADX INFO: renamed from: J */
    private C0543bx f1832J;

    /* JADX INFO: renamed from: K */
    private double f1833K;

    /* JADX INFO: renamed from: L */
    private C0543bx f1834L;

    /* JADX INFO: renamed from: M */
    private double f1835M;

    /* JADX INFO: renamed from: N */
    private String f1836N;

    /* JADX INFO: renamed from: O */
    private C0543bx f1837O;

    /* JADX INFO: renamed from: P */
    private List f1838P;

    /* JADX INFO: renamed from: Q */
    private String f1839Q;

    /* JADX INFO: renamed from: R */
    private String f1840R;

    /* JADX INFO: renamed from: S */
    private String f1841S;

    /* JADX INFO: renamed from: T */
    private String f1842T;

    /* JADX INFO: renamed from: U */
    private C0543bx f1843U;

    /* JADX INFO: renamed from: V */
    private String f1844V;

    /* JADX INFO: renamed from: W */
    private String f1845W;

    /* JADX INFO: renamed from: X */
    private String f1846X;

    /* JADX INFO: renamed from: Y */
    private C0543bx f1847Y;

    /* JADX INFO: renamed from: Z */
    private String f1848Z;

    /* JADX INFO: renamed from: aa */
    private String f1849aa;

    /* JADX INFO: renamed from: ab */
    private String f1850ab;

    /* JADX INFO: renamed from: ac */
    private String f1851ac;

    /* JADX INFO: renamed from: ad */
    private String f1852ad;

    /* JADX INFO: renamed from: ae */
    private String f1853ae;

    /* JADX INFO: renamed from: b */
    private final Set f1854b;

    /* JADX INFO: renamed from: c */
    private final int f1855c;

    /* JADX INFO: renamed from: d */
    private C0543bx f1856d;

    /* JADX INFO: renamed from: e */
    private List f1857e;

    /* JADX INFO: renamed from: f */
    private C0543bx f1858f;

    /* JADX INFO: renamed from: g */
    private String f1859g;

    /* JADX INFO: renamed from: h */
    private String f1860h;

    /* JADX INFO: renamed from: i */
    private String f1861i;

    /* JADX INFO: renamed from: j */
    private List f1862j;

    /* JADX INFO: renamed from: k */
    private int f1863k;

    /* JADX INFO: renamed from: l */
    private List f1864l;

    /* JADX INFO: renamed from: m */
    private C0543bx f1865m;

    /* JADX INFO: renamed from: n */
    private List f1866n;

    /* JADX INFO: renamed from: o */
    private String f1867o;

    /* JADX INFO: renamed from: p */
    private String f1868p;

    /* JADX INFO: renamed from: q */
    private C0543bx f1869q;

    /* JADX INFO: renamed from: r */
    private String f1870r;

    /* JADX INFO: renamed from: s */
    private String f1871s;

    /* JADX INFO: renamed from: t */
    private String f1872t;

    /* JADX INFO: renamed from: u */
    private List f1873u;

    /* JADX INFO: renamed from: v */
    private String f1874v;

    /* JADX INFO: renamed from: w */
    private String f1875w;

    /* JADX INFO: renamed from: x */
    private String f1876x;

    /* JADX INFO: renamed from: y */
    private String f1877y;

    /* JADX INFO: renamed from: z */
    private String f1878z;

    static {
        f1822a.put("about", AbstractC0497ae.a.m2232a("about", 2, C0543bx.class));
        f1822a.put("additionalName", AbstractC0497ae.a.m2238e("additionalName", 3));
        f1822a.put("address", AbstractC0497ae.a.m2232a("address", 4, C0543bx.class));
        f1822a.put("addressCountry", AbstractC0497ae.a.m2237d("addressCountry", 5));
        f1822a.put("addressLocality", AbstractC0497ae.a.m2237d("addressLocality", 6));
        f1822a.put("addressRegion", AbstractC0497ae.a.m2237d("addressRegion", 7));
        f1822a.put("associated_media", AbstractC0497ae.a.m2235b("associated_media", 8, C0543bx.class));
        f1822a.put("attendeeCount", AbstractC0497ae.a.m2230a("attendeeCount", 9));
        f1822a.put("attendees", AbstractC0497ae.a.m2235b("attendees", 10, C0543bx.class));
        f1822a.put("audio", AbstractC0497ae.a.m2232a("audio", 11, C0543bx.class));
        f1822a.put("author", AbstractC0497ae.a.m2235b("author", 12, C0543bx.class));
        f1822a.put("bestRating", AbstractC0497ae.a.m2237d("bestRating", 13));
        f1822a.put("birthDate", AbstractC0497ae.a.m2237d("birthDate", 14));
        f1822a.put("byArtist", AbstractC0497ae.a.m2232a("byArtist", 15, C0543bx.class));
        f1822a.put("caption", AbstractC0497ae.a.m2237d("caption", 16));
        f1822a.put("contentSize", AbstractC0497ae.a.m2237d("contentSize", 17));
        f1822a.put("contentUrl", AbstractC0497ae.a.m2237d("contentUrl", 18));
        f1822a.put("contributor", AbstractC0497ae.a.m2235b("contributor", 19, C0543bx.class));
        f1822a.put("dateCreated", AbstractC0497ae.a.m2237d("dateCreated", 20));
        f1822a.put("dateModified", AbstractC0497ae.a.m2237d("dateModified", 21));
        f1822a.put("datePublished", AbstractC0497ae.a.m2237d("datePublished", 22));
        f1822a.put("description", AbstractC0497ae.a.m2237d("description", 23));
        f1822a.put("duration", AbstractC0497ae.a.m2237d("duration", 24));
        f1822a.put("embedUrl", AbstractC0497ae.a.m2237d("embedUrl", 25));
        f1822a.put("endDate", AbstractC0497ae.a.m2237d("endDate", 26));
        f1822a.put("familyName", AbstractC0497ae.a.m2237d("familyName", 27));
        f1822a.put("gender", AbstractC0497ae.a.m2237d("gender", 28));
        f1822a.put("geo", AbstractC0497ae.a.m2232a("geo", 29, C0543bx.class));
        f1822a.put("givenName", AbstractC0497ae.a.m2237d("givenName", 30));
        f1822a.put("height", AbstractC0497ae.a.m2237d("height", 31));
        f1822a.put("id", AbstractC0497ae.a.m2237d("id", 32));
        f1822a.put("image", AbstractC0497ae.a.m2237d("image", 33));
        f1822a.put("inAlbum", AbstractC0497ae.a.m2232a("inAlbum", 34, C0543bx.class));
        f1822a.put("latitude", AbstractC0497ae.a.m2234b("latitude", 36));
        f1822a.put("location", AbstractC0497ae.a.m2232a("location", 37, C0543bx.class));
        f1822a.put("longitude", AbstractC0497ae.a.m2234b("longitude", 38));
        f1822a.put("name", AbstractC0497ae.a.m2237d("name", 39));
        f1822a.put("partOfTVSeries", AbstractC0497ae.a.m2232a("partOfTVSeries", 40, C0543bx.class));
        f1822a.put("performers", AbstractC0497ae.a.m2235b("performers", 41, C0543bx.class));
        f1822a.put("playerType", AbstractC0497ae.a.m2237d("playerType", 42));
        f1822a.put("postOfficeBoxNumber", AbstractC0497ae.a.m2237d("postOfficeBoxNumber", 43));
        f1822a.put("postalCode", AbstractC0497ae.a.m2237d("postalCode", 44));
        f1822a.put("ratingValue", AbstractC0497ae.a.m2237d("ratingValue", 45));
        f1822a.put("reviewRating", AbstractC0497ae.a.m2232a("reviewRating", 46, C0543bx.class));
        f1822a.put("startDate", AbstractC0497ae.a.m2237d("startDate", 47));
        f1822a.put("streetAddress", AbstractC0497ae.a.m2237d("streetAddress", 48));
        f1822a.put("text", AbstractC0497ae.a.m2237d("text", 49));
        f1822a.put("thumbnail", AbstractC0497ae.a.m2232a("thumbnail", 50, C0543bx.class));
        f1822a.put("thumbnailUrl", AbstractC0497ae.a.m2237d("thumbnailUrl", 51));
        f1822a.put("tickerSymbol", AbstractC0497ae.a.m2237d("tickerSymbol", 52));
        f1822a.put("type", AbstractC0497ae.a.m2237d("type", 53));
        f1822a.put("url", AbstractC0497ae.a.m2237d("url", 54));
        f1822a.put("width", AbstractC0497ae.a.m2237d("width", 55));
        f1822a.put("worstRating", AbstractC0497ae.a.m2237d("worstRating", 56));
    }

    public C0543bx() {
        this.f1855c = 1;
        this.f1854b = new HashSet();
    }

    C0543bx(Set set, int i, C0543bx c0543bx, List list, C0543bx c0543bx2, String str, String str2, String str3, List list2, int i2, List list3, C0543bx c0543bx3, List list4, String str4, String str5, C0543bx c0543bx4, String str6, String str7, String str8, List list5, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, C0543bx c0543bx5, String str18, String str19, String str20, String str21, C0543bx c0543bx6, double d, C0543bx c0543bx7, double d2, String str22, C0543bx c0543bx8, List list6, String str23, String str24, String str25, String str26, C0543bx c0543bx9, String str27, String str28, String str29, C0543bx c0543bx10, String str30, String str31, String str32, String str33, String str34, String str35) {
        this.f1854b = set;
        this.f1855c = i;
        this.f1856d = c0543bx;
        this.f1857e = list;
        this.f1858f = c0543bx2;
        this.f1859g = str;
        this.f1860h = str2;
        this.f1861i = str3;
        this.f1862j = list2;
        this.f1863k = i2;
        this.f1864l = list3;
        this.f1865m = c0543bx3;
        this.f1866n = list4;
        this.f1867o = str4;
        this.f1868p = str5;
        this.f1869q = c0543bx4;
        this.f1870r = str6;
        this.f1871s = str7;
        this.f1872t = str8;
        this.f1873u = list5;
        this.f1874v = str9;
        this.f1875w = str10;
        this.f1876x = str11;
        this.f1877y = str12;
        this.f1878z = str13;
        this.f1823A = str14;
        this.f1824B = str15;
        this.f1825C = str16;
        this.f1826D = str17;
        this.f1827E = c0543bx5;
        this.f1828F = str18;
        this.f1829G = str19;
        this.f1830H = str20;
        this.f1831I = str21;
        this.f1832J = c0543bx6;
        this.f1833K = d;
        this.f1834L = c0543bx7;
        this.f1835M = d2;
        this.f1836N = str22;
        this.f1837O = c0543bx8;
        this.f1838P = list6;
        this.f1839Q = str23;
        this.f1840R = str24;
        this.f1841S = str25;
        this.f1842T = str26;
        this.f1843U = c0543bx9;
        this.f1844V = str27;
        this.f1845W = str28;
        this.f1846X = str29;
        this.f1847Y = c0543bx10;
        this.f1848Z = str30;
        this.f1849aa = str31;
        this.f1850ab = str32;
        this.f1851ac = str33;
        this.f1852ad = str34;
        this.f1853ae = str35;
    }

    /* JADX INFO: renamed from: A */
    public String m2425A() {
        return this.f1876x;
    }

    /* JADX INFO: renamed from: B */
    public String m2426B() {
        return this.f1877y;
    }

    /* JADX INFO: renamed from: C */
    public String m2427C() {
        return this.f1878z;
    }

    /* JADX INFO: renamed from: D */
    public String m2428D() {
        return this.f1823A;
    }

    /* JADX INFO: renamed from: E */
    public String m2429E() {
        return this.f1824B;
    }

    /* JADX INFO: renamed from: F */
    public String m2430F() {
        return this.f1825C;
    }

    /* JADX INFO: renamed from: G */
    public String m2431G() {
        return this.f1826D;
    }

    /* JADX INFO: renamed from: H */
    C0543bx m2432H() {
        return this.f1827E;
    }

    /* JADX INFO: renamed from: I */
    public String m2433I() {
        return this.f1828F;
    }

    /* JADX INFO: renamed from: J */
    public String m2434J() {
        return this.f1829G;
    }

    /* JADX INFO: renamed from: K */
    public String m2435K() {
        return this.f1830H;
    }

    /* JADX INFO: renamed from: L */
    public String m2436L() {
        return this.f1831I;
    }

    /* JADX INFO: renamed from: M */
    C0543bx m2437M() {
        return this.f1832J;
    }

    /* JADX INFO: renamed from: N */
    public double m2438N() {
        return this.f1833K;
    }

    /* JADX INFO: renamed from: O */
    C0543bx m2439O() {
        return this.f1834L;
    }

    /* JADX INFO: renamed from: P */
    public double m2440P() {
        return this.f1835M;
    }

    /* JADX INFO: renamed from: Q */
    public String m2441Q() {
        return this.f1836N;
    }

    /* JADX INFO: renamed from: R */
    C0543bx m2442R() {
        return this.f1837O;
    }

    /* JADX INFO: renamed from: S */
    List m2443S() {
        return this.f1838P;
    }

    /* JADX INFO: renamed from: T */
    public String m2444T() {
        return this.f1839Q;
    }

    /* JADX INFO: renamed from: U */
    public String m2445U() {
        return this.f1840R;
    }

    /* JADX INFO: renamed from: V */
    public String m2446V() {
        return this.f1841S;
    }

    /* JADX INFO: renamed from: W */
    public String m2447W() {
        return this.f1842T;
    }

    /* JADX INFO: renamed from: X */
    C0543bx m2448X() {
        return this.f1843U;
    }

    /* JADX INFO: renamed from: Y */
    public String m2449Y() {
        return this.f1844V;
    }

    /* JADX INFO: renamed from: Z */
    public String m2450Z() {
        return this.f1845W;
    }

    @Override // com.google.android.gms.internal.AbstractC0497ae
    /* JADX INFO: renamed from: a */
    protected Object mo2221a(String str) {
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC0497ae
    /* JADX INFO: renamed from: a */
    protected boolean mo2222a(AbstractC0497ae.a aVar) {
        return this.f1854b.contains(Integer.valueOf(aVar.m2247g()));
    }

    /* JADX INFO: renamed from: aa */
    public String m2451aa() {
        return this.f1846X;
    }

    /* JADX INFO: renamed from: ab */
    C0543bx m2452ab() {
        return this.f1847Y;
    }

    /* JADX INFO: renamed from: ac */
    public String m2453ac() {
        return this.f1848Z;
    }

    /* JADX INFO: renamed from: ad */
    public String m2454ad() {
        return this.f1849aa;
    }

    /* JADX INFO: renamed from: ae */
    public String m2455ae() {
        return this.f1850ab;
    }

    /* JADX INFO: renamed from: af */
    public String m2456af() {
        return this.f1851ac;
    }

    /* JADX INFO: renamed from: ag */
    public String m2457ag() {
        return this.f1852ad;
    }

    /* JADX INFO: renamed from: ah */
    public String m2458ah() {
        return this.f1853ae;
    }

    @Override // com.google.android.gms.common.data.InterfaceC0449a
    /* JADX INFO: renamed from: ai, reason: merged with bridge method [inline-methods] */
    public C0543bx mo1843a() {
        return this;
    }

    @Override // com.google.android.gms.internal.AbstractC0497ae
    /* JADX INFO: renamed from: b */
    protected Object mo2223b(AbstractC0497ae.a aVar) {
        switch (aVar.m2247g()) {
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                return this.f1856d;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                return this.f1857e;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                return this.f1858f;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                return this.f1859g;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                return this.f1860h;
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                return this.f1861i;
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                return this.f1862j;
            case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                return Integer.valueOf(this.f1863k);
            case C0467e.MapAttrs_uiZoomControls /* 10 */:
                return this.f1864l;
            case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                return this.f1865m;
            case C0467e.MapAttrs_useViewLifecycle /* 12 */:
                return this.f1866n;
            case C0467e.MapAttrs_zOrderOnTop /* 13 */:
                return this.f1867o;
            case 14:
                return this.f1868p;
            case 15:
                return this.f1869q;
            case 16:
                return this.f1870r;
            case 17:
                return this.f1871s;
            case 18:
                return this.f1872t;
            case 19:
                return this.f1873u;
            case 20:
                return this.f1874v;
            case 21:
                return this.f1875w;
            case 22:
                return this.f1876x;
            case 23:
                return this.f1877y;
            case 24:
                return this.f1878z;
            case 25:
                return this.f1823A;
            case 26:
                return this.f1824B;
            case 27:
                return this.f1825C;
            case 28:
                return this.f1826D;
            case 29:
                return this.f1827E;
            case 30:
                return this.f1828F;
            case 31:
                return this.f1829G;
            case 32:
                return this.f1830H;
            case 33:
                return this.f1831I;
            case 34:
                return this.f1832J;
            case 35:
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + aVar.m2247g());
            case 36:
                return Double.valueOf(this.f1833K);
            case 37:
                return this.f1834L;
            case 38:
                return Double.valueOf(this.f1835M);
            case 39:
                return this.f1836N;
            case 40:
                return this.f1837O;
            case 41:
                return this.f1838P;
            case 42:
                return this.f1839Q;
            case 43:
                return this.f1840R;
            case 44:
                return this.f1841S;
            case 45:
                return this.f1842T;
            case 46:
                return this.f1843U;
            case 47:
                return this.f1844V;
            case 48:
                return this.f1845W;
            case 49:
                return this.f1846X;
            case 50:
                return this.f1847Y;
            case 51:
                return this.f1848Z;
            case 52:
                return this.f1849aa;
            case 53:
                return this.f1850ab;
            case 54:
                return this.f1851ac;
            case 55:
                return this.f1852ad;
            case 56:
                return this.f1853ae;
        }
    }

    @Override // com.google.android.gms.internal.AbstractC0497ae
    /* JADX INFO: renamed from: b */
    public HashMap mo2224b() {
        return f1822a;
    }

    @Override // com.google.android.gms.internal.AbstractC0497ae
    /* JADX INFO: renamed from: b */
    protected boolean mo2225b(String str) {
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        C0527bh c0527bh = CREATOR;
        return 0;
    }

    /* JADX INFO: renamed from: e */
    Set m2460e() {
        return this.f1854b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0543bx)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0543bx c0543bx = (C0543bx) obj;
        for (AbstractC0497ae.a aVar : f1822a.values()) {
            if (mo2222a(aVar)) {
                if (c0543bx.mo2222a(aVar) && mo2223b(aVar).equals(c0543bx.mo2223b(aVar))) {
                }
                return false;
            }
            if (c0543bx.mo2222a(aVar)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    int m2461f() {
        return this.f1855c;
    }

    /* JADX INFO: renamed from: g */
    C0543bx m2462g() {
        return this.f1856d;
    }

    /* JADX INFO: renamed from: h */
    public List m2463h() {
        return this.f1857e;
    }

    public int hashCode() {
        int iHashCode = 0;
        Iterator it = f1822a.values().iterator();
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
    C0543bx m2464i() {
        return this.f1858f;
    }

    /* JADX INFO: renamed from: j */
    public String m2465j() {
        return this.f1859g;
    }

    /* JADX INFO: renamed from: k */
    public String m2466k() {
        return this.f1860h;
    }

    /* JADX INFO: renamed from: l */
    public String m2467l() {
        return this.f1861i;
    }

    /* JADX INFO: renamed from: m */
    List m2468m() {
        return this.f1862j;
    }

    /* JADX INFO: renamed from: n */
    public int m2469n() {
        return this.f1863k;
    }

    /* JADX INFO: renamed from: o */
    List m2470o() {
        return this.f1864l;
    }

    /* JADX INFO: renamed from: p */
    C0543bx m2471p() {
        return this.f1865m;
    }

    /* JADX INFO: renamed from: q */
    List m2472q() {
        return this.f1866n;
    }

    /* JADX INFO: renamed from: r */
    public String m2473r() {
        return this.f1867o;
    }

    /* JADX INFO: renamed from: s */
    public String m2474s() {
        return this.f1868p;
    }

    /* JADX INFO: renamed from: t */
    C0543bx m2475t() {
        return this.f1869q;
    }

    /* JADX INFO: renamed from: u */
    public String m2476u() {
        return this.f1870r;
    }

    /* JADX INFO: renamed from: v */
    public String m2477v() {
        return this.f1871s;
    }

    /* JADX INFO: renamed from: w */
    public String m2478w() {
        return this.f1872t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C0527bh c0527bh = CREATOR;
        C0527bh.m2366a(this, parcel, i);
    }

    /* JADX INFO: renamed from: x */
    List m2479x() {
        return this.f1873u;
    }

    /* JADX INFO: renamed from: y */
    public String m2480y() {
        return this.f1874v;
    }

    /* JADX INFO: renamed from: z */
    public String m2481z() {
        return this.f1875w;
    }
}
