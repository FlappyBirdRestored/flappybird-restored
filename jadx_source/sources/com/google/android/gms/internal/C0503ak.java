package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.C0463a;
import com.google.android.gms.common.internal.safeparcel.C0464b;
import com.google.android.gms.common.internal.safeparcel.C0465c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ak */
/* JADX INFO: loaded from: classes.dex */
public class C0503ak extends AbstractC0497ae implements SafeParcelable {
    public static final C0597i CREATOR = new C0597i();

    /* JADX INFO: renamed from: a */
    private final int f1783a;

    /* JADX INFO: renamed from: b */
    private final Parcel f1784b;

    /* JADX INFO: renamed from: c */
    private final int f1785c = 2;

    /* JADX INFO: renamed from: d */
    private final C0500ah f1786d;

    /* JADX INFO: renamed from: e */
    private final String f1787e;

    /* JADX INFO: renamed from: f */
    private int f1788f;

    /* JADX INFO: renamed from: g */
    private int f1789g;

    C0503ak(int i, Parcel parcel, C0500ah c0500ah) {
        this.f1783a = i;
        this.f1784b = (Parcel) C0588do.m2704a(parcel);
        this.f1786d = c0500ah;
        if (this.f1786d == null) {
            this.f1787e = null;
        } else {
            this.f1787e = this.f1786d.m2259d();
        }
        this.f1788f = 2;
    }

    /* JADX INFO: renamed from: a */
    public static HashMap m2267a(Bundle bundle) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            map.put(str, bundle.getString(str));
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    private static HashMap m2268a(HashMap map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(Integer.valueOf(((AbstractC0497ae.a) entry.getValue()).m2247g()), entry);
        }
        return map2;
    }

    /* JADX INFO: renamed from: a */
    private void m2269a(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case C0467e.MapAttrs_mapType /* 0 */:
            case C0467e.MapAttrs_cameraBearing /* 1 */:
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
            case C0467e.MapAttrs_cameraTilt /* 4 */:
            case C0467e.MapAttrs_cameraZoom /* 5 */:
            case C0467e.MapAttrs_uiCompass /* 6 */:
                sb.append(obj);
                return;
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                sb.append("\"").append(C0602n.m2752a(obj.toString())).append("\"");
                return;
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                sb.append("\"").append(C0600l.m2749a((byte[]) obj)).append("\"");
                return;
            case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                sb.append("\"").append(C0600l.m2750b((byte[]) obj));
                sb.append("\"");
                return;
            case C0467e.MapAttrs_uiZoomControls /* 10 */:
                C0603o.m2753a(sb, (HashMap) obj);
                return;
            case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2270a(StringBuilder sb, AbstractC0497ae.a aVar, Parcel parcel, int i) {
        switch (aVar.m2244d()) {
            case C0467e.MapAttrs_mapType /* 0 */:
                m2271a(sb, aVar, m2220a(aVar, Integer.valueOf(C0463a.m1920f(parcel, i))));
                return;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                m2271a(sb, aVar, m2220a(aVar, C0463a.m1922h(parcel, i)));
                return;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                m2271a(sb, aVar, m2220a(aVar, Long.valueOf(C0463a.m1921g(parcel, i))));
                return;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                m2271a(sb, aVar, m2220a(aVar, Float.valueOf(C0463a.m1923i(parcel, i))));
                return;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                m2271a(sb, aVar, m2220a(aVar, Double.valueOf(C0463a.m1924j(parcel, i))));
                return;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                m2271a(sb, aVar, m2220a(aVar, C0463a.m1925k(parcel, i)));
                return;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                m2271a(sb, aVar, m2220a(aVar, Boolean.valueOf(C0463a.m1917c(parcel, i))));
                return;
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                m2271a(sb, aVar, m2220a(aVar, C0463a.m1926l(parcel, i)));
                return;
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
            case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                m2271a(sb, aVar, m2220a(aVar, C0463a.m1929o(parcel, i)));
                return;
            case C0467e.MapAttrs_uiZoomControls /* 10 */:
                m2271a(sb, aVar, m2220a(aVar, m2267a(C0463a.m1928n(parcel, i))));
                return;
            case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown field out type = " + aVar.m2244d());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2271a(StringBuilder sb, AbstractC0497ae.a aVar, Object obj) {
        if (aVar.m2243c()) {
            m2272a(sb, aVar, (ArrayList) obj);
        } else {
            m2269a(sb, aVar.m2242b(), obj);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2272a(StringBuilder sb, AbstractC0497ae.a aVar, ArrayList arrayList) {
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(",");
            }
            m2269a(sb, aVar.m2242b(), arrayList.get(i));
        }
        sb.append("]");
    }

    /* JADX INFO: renamed from: a */
    private void m2273a(StringBuilder sb, String str, AbstractC0497ae.a aVar, Parcel parcel, int i) {
        sb.append("\"").append(str).append("\":");
        if (aVar.m2250j()) {
            m2270a(sb, aVar, parcel, i);
        } else {
            m2275b(sb, aVar, parcel, i);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2274a(StringBuilder sb, HashMap map, Parcel parcel) {
        HashMap mapM2268a = m2268a(map);
        sb.append('{');
        int iM1913b = C0463a.m1913b(parcel);
        boolean z = false;
        while (parcel.dataPosition() < iM1913b) {
            int iM1908a = C0463a.m1908a(parcel);
            Map.Entry entry = (Map.Entry) mapM2268a.get(Integer.valueOf(C0463a.m1907a(iM1908a)));
            if (entry != null) {
                if (z) {
                    sb.append(",");
                }
                m2273a(sb, (String) entry.getKey(), (AbstractC0497ae.a) entry.getValue(), parcel, iM1908a);
                z = true;
            }
        }
        if (parcel.dataPosition() != iM1913b) {
            throw new C0464b("Overread allowed size end=" + iM1913b, parcel);
        }
        sb.append('}');
    }

    /* JADX INFO: renamed from: b */
    private void m2275b(StringBuilder sb, AbstractC0497ae.a aVar, Parcel parcel, int i) {
        if (aVar.m2245e()) {
            sb.append("[");
            switch (aVar.m2244d()) {
                case C0467e.MapAttrs_mapType /* 0 */:
                    C0599k.m2744a(sb, C0463a.m1931q(parcel, i));
                    break;
                case C0467e.MapAttrs_cameraBearing /* 1 */:
                    C0599k.m2746a(sb, C0463a.m1933s(parcel, i));
                    break;
                case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                    C0599k.m2745a(sb, C0463a.m1932r(parcel, i));
                    break;
                case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                    C0599k.m2743a(sb, C0463a.m1934t(parcel, i));
                    break;
                case C0467e.MapAttrs_cameraTilt /* 4 */:
                    C0599k.m2742a(sb, C0463a.m1935u(parcel, i));
                    break;
                case C0467e.MapAttrs_cameraZoom /* 5 */:
                    C0599k.m2746a(sb, C0463a.m1936v(parcel, i));
                    break;
                case C0467e.MapAttrs_uiCompass /* 6 */:
                    C0599k.m2748a(sb, C0463a.m1930p(parcel, i));
                    break;
                case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                    C0599k.m2747a(sb, C0463a.m1937w(parcel, i));
                    break;
                case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                case C0467e.MapAttrs_uiZoomControls /* 10 */:
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                    Parcel[] parcelArrM1940z = C0463a.m1940z(parcel, i);
                    int length = parcelArrM1940z.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 > 0) {
                            sb.append(",");
                        }
                        parcelArrM1940z[i2].setDataPosition(0);
                        m2274a(sb, aVar.m2252l(), parcelArrM1940z[i2]);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown field type out.");
            }
            sb.append("]");
            return;
        }
        switch (aVar.m2244d()) {
            case C0467e.MapAttrs_mapType /* 0 */:
                sb.append(C0463a.m1920f(parcel, i));
                return;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                sb.append(C0463a.m1922h(parcel, i));
                return;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                sb.append(C0463a.m1921g(parcel, i));
                return;
            case C0467e.MapAttrs_cameraTargetLng /* 3 */:
                sb.append(C0463a.m1923i(parcel, i));
                return;
            case C0467e.MapAttrs_cameraTilt /* 4 */:
                sb.append(C0463a.m1924j(parcel, i));
                return;
            case C0467e.MapAttrs_cameraZoom /* 5 */:
                sb.append(C0463a.m1925k(parcel, i));
                return;
            case C0467e.MapAttrs_uiCompass /* 6 */:
                sb.append(C0463a.m1917c(parcel, i));
                return;
            case C0467e.MapAttrs_uiRotateGestures /* 7 */:
                sb.append("\"").append(C0602n.m2752a(C0463a.m1926l(parcel, i))).append("\"");
                return;
            case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                sb.append("\"").append(C0600l.m2749a(C0463a.m1929o(parcel, i))).append("\"");
                return;
            case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                sb.append("\"").append(C0600l.m2750b(C0463a.m1929o(parcel, i)));
                sb.append("\"");
                return;
            case C0467e.MapAttrs_uiZoomControls /* 10 */:
                Bundle bundleM1928n = C0463a.m1928n(parcel, i);
                Set<String> setKeySet = bundleM1928n.keySet();
                setKeySet.size();
                sb.append("{");
                boolean z = true;
                for (String str : setKeySet) {
                    if (!z) {
                        sb.append(",");
                    }
                    sb.append("\"").append(str).append("\"");
                    sb.append(":");
                    sb.append("\"").append(C0602n.m2752a(bundleM1928n.getString(str))).append("\"");
                    z = false;
                }
                sb.append("}");
                return;
            case C0467e.MapAttrs_uiZoomGestures /* 11 */:
                Parcel parcelM1939y = C0463a.m1939y(parcel, i);
                parcelM1939y.setDataPosition(0);
                m2274a(sb, aVar.m2252l(), parcelM1939y);
                return;
            default:
                throw new IllegalStateException("Unknown field type out");
        }
    }

    /* JADX INFO: renamed from: a */
    public int m2276a() {
        return this.f1783a;
    }

    @Override // com.google.android.gms.internal.AbstractC0497ae
    /* JADX INFO: renamed from: a */
    protected Object mo2221a(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.internal.AbstractC0497ae
    /* JADX INFO: renamed from: b */
    public HashMap mo2224b() {
        if (this.f1786d == null) {
            return null;
        }
        return this.f1786d.m2255a(this.f1787e);
    }

    @Override // com.google.android.gms.internal.AbstractC0497ae
    /* JADX INFO: renamed from: b */
    protected boolean mo2225b(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        C0597i c0597i = CREATOR;
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public Parcel m2277e() {
        switch (this.f1788f) {
            case C0467e.MapAttrs_mapType /* 0 */:
                this.f1789g = C0465c.m1941a(this.f1784b);
                C0465c.m1942a(this.f1784b, this.f1789g);
                this.f1788f = 2;
                break;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                C0465c.m1942a(this.f1784b, this.f1789g);
                this.f1788f = 2;
                break;
        }
        return this.f1784b;
    }

    /* JADX INFO: renamed from: f */
    C0500ah m2278f() {
        switch (this.f1785c) {
            case C0467e.MapAttrs_mapType /* 0 */:
                return null;
            case C0467e.MapAttrs_cameraBearing /* 1 */:
                return this.f1786d;
            case C0467e.MapAttrs_cameraTargetLat /* 2 */:
                return this.f1786d;
            default:
                throw new IllegalStateException("Invalid creation type: " + this.f1785c);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC0497ae
    public String toString() {
        C0588do.m2705a(this.f1786d, "Cannot convert to JSON on client side.");
        Parcel parcelM2277e = m2277e();
        parcelM2277e.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        m2274a(sb, this.f1786d.m2255a(this.f1787e), parcelM2277e);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C0597i c0597i = CREATOR;
        C0597i.m2734a(this, parcel, i);
    }
}
