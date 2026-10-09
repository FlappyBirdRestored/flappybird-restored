package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ae */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0497ae {

    /* JADX INFO: renamed from: com.google.android.gms.internal.ae$a */
    public class a implements SafeParcelable {
        public static final C0593e CREATOR = new C0593e();

        /* JADX INFO: renamed from: a */
        protected final int f1759a;

        /* JADX INFO: renamed from: b */
        protected final boolean f1760b;

        /* JADX INFO: renamed from: c */
        protected final int f1761c;

        /* JADX INFO: renamed from: d */
        protected final boolean f1762d;

        /* JADX INFO: renamed from: e */
        protected final String f1763e;

        /* JADX INFO: renamed from: f */
        protected final int f1764f;

        /* JADX INFO: renamed from: g */
        protected final Class f1765g;

        /* JADX INFO: renamed from: h */
        protected final String f1766h;

        /* JADX INFO: renamed from: i */
        private final int f1767i;

        /* JADX INFO: renamed from: j */
        private C0500ah f1768j;

        /* JADX INFO: renamed from: k */
        private InterfaceC0573d f1769k;

        a(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, C0614z c0614z) {
            this.f1767i = i;
            this.f1759a = i2;
            this.f1760b = z;
            this.f1761c = i3;
            this.f1762d = z2;
            this.f1763e = str;
            this.f1764f = i4;
            if (str2 == null) {
                this.f1765g = null;
                this.f1766h = null;
            } else {
                this.f1765g = C0503ak.class;
                this.f1766h = str2;
            }
            if (c0614z == null) {
                this.f1769k = null;
            } else {
                this.f1769k = c0614z.m2790c();
            }
        }

        protected a(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls, InterfaceC0573d interfaceC0573d) {
            this.f1767i = 1;
            this.f1759a = i;
            this.f1760b = z;
            this.f1761c = i2;
            this.f1762d = z2;
            this.f1763e = str;
            this.f1764f = i3;
            this.f1765g = cls;
            if (cls == null) {
                this.f1766h = null;
            } else {
                this.f1766h = cls.getCanonicalName();
            }
            this.f1769k = interfaceC0573d;
        }

        /* JADX INFO: renamed from: a */
        public static a m2230a(String str, int i) {
            return new a(0, false, 0, false, str, i, null, null);
        }

        /* JADX INFO: renamed from: a */
        public static a m2231a(String str, int i, InterfaceC0573d interfaceC0573d, boolean z) {
            return new a(interfaceC0573d.mo2093c(), z, interfaceC0573d.mo2094d(), false, str, i, null, interfaceC0573d);
        }

        /* JADX INFO: renamed from: a */
        public static a m2232a(String str, int i, Class cls) {
            return new a(11, false, 11, false, str, i, cls, null);
        }

        /* JADX INFO: renamed from: b */
        public static a m2234b(String str, int i) {
            return new a(4, false, 4, false, str, i, null, null);
        }

        /* JADX INFO: renamed from: b */
        public static a m2235b(String str, int i, Class cls) {
            return new a(11, true, 11, true, str, i, cls, null);
        }

        /* JADX INFO: renamed from: c */
        public static a m2236c(String str, int i) {
            return new a(6, false, 6, false, str, i, null, null);
        }

        /* JADX INFO: renamed from: d */
        public static a m2237d(String str, int i) {
            return new a(7, false, 7, false, str, i, null, null);
        }

        /* JADX INFO: renamed from: e */
        public static a m2238e(String str, int i) {
            return new a(7, true, 7, true, str, i, null, null);
        }

        /* JADX INFO: renamed from: a */
        public int m2239a() {
            return this.f1767i;
        }

        /* JADX INFO: renamed from: a */
        public Object m2240a(Object obj) {
            return this.f1769k.mo2090a(obj);
        }

        /* JADX INFO: renamed from: a */
        public void m2241a(C0500ah c0500ah) {
            this.f1768j = c0500ah;
        }

        /* JADX INFO: renamed from: b */
        public int m2242b() {
            return this.f1759a;
        }

        /* JADX INFO: renamed from: c */
        public boolean m2243c() {
            return this.f1760b;
        }

        /* JADX INFO: renamed from: d */
        public int m2244d() {
            return this.f1761c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            C0593e c0593e = CREATOR;
            return 0;
        }

        /* JADX INFO: renamed from: e */
        public boolean m2245e() {
            return this.f1762d;
        }

        /* JADX INFO: renamed from: f */
        public String m2246f() {
            return this.f1763e;
        }

        /* JADX INFO: renamed from: g */
        public int m2247g() {
            return this.f1764f;
        }

        /* JADX INFO: renamed from: h */
        public Class m2248h() {
            return this.f1765g;
        }

        /* JADX INFO: renamed from: i */
        String m2249i() {
            if (this.f1766h == null) {
                return null;
            }
            return this.f1766h;
        }

        /* JADX INFO: renamed from: j */
        public boolean m2250j() {
            return this.f1769k != null;
        }

        /* JADX INFO: renamed from: k */
        C0614z m2251k() {
            if (this.f1769k == null) {
                return null;
            }
            return C0614z.m2787a(this.f1769k);
        }

        /* JADX INFO: renamed from: l */
        public HashMap m2252l() {
            C0588do.m2704a(this.f1766h);
            C0588do.m2704a(this.f1768j);
            return this.f1768j.m2255a(this.f1766h);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Field\n");
            sb.append("            versionCode=").append(this.f1767i).append('\n');
            sb.append("                 typeIn=").append(this.f1759a).append('\n');
            sb.append("            typeInArray=").append(this.f1760b).append('\n');
            sb.append("                typeOut=").append(this.f1761c).append('\n');
            sb.append("           typeOutArray=").append(this.f1762d).append('\n');
            sb.append("        outputFieldName=").append(this.f1763e).append('\n');
            sb.append("      safeParcelFieldId=").append(this.f1764f).append('\n');
            sb.append("       concreteTypeName=").append(m2249i()).append('\n');
            if (m2248h() != null) {
                sb.append("     concreteType.class=").append(m2248h().getCanonicalName()).append('\n');
            }
            sb.append("          converterName=").append(this.f1769k == null ? "null" : this.f1769k.getClass().getCanonicalName()).append('\n');
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C0593e c0593e = CREATOR;
            C0593e.m2722a(this, parcel, i);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2218a(StringBuilder sb, a aVar, Object obj) {
        if (aVar.m2242b() == 11) {
            sb.append(((AbstractC0497ae) aVar.m2248h().cast(obj)).toString());
        } else {
            if (aVar.m2242b() != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(C0602n.m2752a((String) obj));
            sb.append("\"");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2219a(StringBuilder sb, a aVar, ArrayList arrayList) {
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(",");
            }
            Object obj = arrayList.get(i);
            if (obj != null) {
                m2218a(sb, aVar, obj);
            }
        }
        sb.append("]");
    }

    /* JADX INFO: renamed from: a */
    protected Object m2220a(a aVar, Object obj) {
        return aVar.f1769k != null ? aVar.m2240a(obj) : obj;
    }

    /* JADX INFO: renamed from: a */
    protected abstract Object mo2221a(String str);

    /* JADX INFO: renamed from: a */
    protected boolean mo2222a(a aVar) {
        if (aVar.m2244d() == 11) {
            return aVar.m2245e() ? m2229d(aVar.m2246f()) : m2227c(aVar.m2246f());
        }
        return mo2225b(aVar.m2246f());
    }

    /* JADX INFO: renamed from: b */
    protected Object mo2223b(a aVar) {
        String strM2246f = aVar.m2246f();
        if (aVar.m2248h() == null) {
            return mo2221a(aVar.m2246f());
        }
        C0588do.m2707a(mo2221a(aVar.m2246f()) == null, "Concrete field shouldn't be value object: " + aVar.m2246f());
        HashMap mapM2228d = aVar.m2245e() ? m2228d() : m2226c();
        if (mapM2228d != null) {
            return mapM2228d.get(strM2246f);
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(strM2246f.charAt(0)) + strM2246f.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract HashMap mo2224b();

    /* JADX INFO: renamed from: b */
    protected abstract boolean mo2225b(String str);

    /* JADX INFO: renamed from: c */
    public HashMap m2226c() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    protected boolean m2227c(String str) {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* JADX INFO: renamed from: d */
    public HashMap m2228d() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    protected boolean m2229d(String str) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    public String toString() {
        HashMap mapMo2224b = mo2224b();
        StringBuilder sb = new StringBuilder(100);
        for (String str : mapMo2224b.keySet()) {
            a aVar = (a) mapMo2224b.get(str);
            if (mo2222a(aVar)) {
                Object objM2220a = m2220a(aVar, mo2223b(aVar));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"").append(str).append("\":");
                if (objM2220a != null) {
                    switch (aVar.m2244d()) {
                        case C0467e.MapAttrs_uiScrollGestures /* 8 */:
                            sb.append("\"").append(C0600l.m2749a((byte[]) objM2220a)).append("\"");
                            break;
                        case C0467e.MapAttrs_uiTiltGestures /* 9 */:
                            sb.append("\"").append(C0600l.m2750b((byte[]) objM2220a)).append("\"");
                            break;
                        case C0467e.MapAttrs_uiZoomControls /* 10 */:
                            C0603o.m2753a(sb, (HashMap) objM2220a);
                            break;
                        default:
                            if (aVar.m2243c()) {
                                m2219a(sb, aVar, (ArrayList) objM2220a);
                            } else {
                                m2218a(sb, aVar, objM2220a);
                            }
                            break;
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
