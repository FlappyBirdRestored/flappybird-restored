package android.support.v4.p001b;

import java.util.Map;

/* JADX INFO: renamed from: android.support.v4.b.l */
/* JADX INFO: loaded from: classes.dex */
public class C0045l {

    /* JADX INFO: renamed from: b */
    static Object[] f206b;

    /* JADX INFO: renamed from: c */
    static int f207c;

    /* JADX INFO: renamed from: d */
    static Object[] f208d;

    /* JADX INFO: renamed from: e */
    static int f209e;

    /* JADX INFO: renamed from: f */
    int[] f210f = C0036c.f186a;

    /* JADX INFO: renamed from: g */
    Object[] f211g = C0036c.f188c;

    /* JADX INFO: renamed from: h */
    int f212h = 0;

    /* JADX INFO: renamed from: a */
    private static void m213a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0034a.class) {
                if (f209e < 10) {
                    objArr[0] = f208d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f208d = objArr;
                    f209e++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0034a.class) {
                if (f207c < 10) {
                    objArr[0] = f206b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f206b = objArr;
                    f207c++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private void m214e(int i) {
        if (i == 8) {
            synchronized (C0034a.class) {
                if (f208d != null) {
                    Object[] objArr = f208d;
                    this.f211g = objArr;
                    f208d = (Object[]) objArr[0];
                    this.f210f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f209e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0034a.class) {
                if (f206b != null) {
                    Object[] objArr2 = f206b;
                    this.f211g = objArr2;
                    f206b = (Object[]) objArr2[0];
                    this.f210f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f207c--;
                    return;
                }
            }
        }
        this.f210f = new int[i];
        this.f211g = new Object[i << 1];
    }

    /* JADX INFO: renamed from: a */
    int m215a() {
        int i = this.f212h;
        if (i == 0) {
            return -1;
        }
        int iM197a = C0036c.m197a(this.f210f, i, 0);
        if (iM197a < 0 || this.f211g[iM197a << 1] == null) {
            return iM197a;
        }
        int i2 = iM197a + 1;
        while (i2 < i && this.f210f[i2] == 0) {
            if (this.f211g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM197a - 1; i3 >= 0 && this.f210f[i3] == 0; i3--) {
            if (this.f211g[i3 << 1] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    /* JADX INFO: renamed from: a */
    int m216a(Object obj) {
        int i = 1;
        int i2 = this.f212h * 2;
        Object[] objArr = this.f211g;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i >> 1;
                }
                i += 2;
            }
        } else {
            while (i < i2) {
                if (obj.equals(objArr[i])) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    int m217a(Object obj, int i) {
        int i2 = this.f212h;
        if (i2 == 0) {
            return -1;
        }
        int iM197a = C0036c.m197a(this.f210f, i2, i);
        if (iM197a < 0 || obj.equals(this.f211g[iM197a << 1])) {
            return iM197a;
        }
        int i3 = iM197a + 1;
        while (i3 < i2 && this.f210f[i3] == i) {
            if (obj.equals(this.f211g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM197a - 1; i4 >= 0 && this.f210f[i4] == i; i4--) {
            if (obj.equals(this.f211g[i4 << 1])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    /* JADX INFO: renamed from: a */
    public Object m218a(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object obj2 = this.f211g[i2];
        this.f211g[i2] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: a */
    public void m219a(int i) {
        if (this.f210f.length < i) {
            int[] iArr = this.f210f;
            Object[] objArr = this.f211g;
            m214e(i);
            if (this.f212h > 0) {
                System.arraycopy(iArr, 0, this.f210f, 0, this.f212h);
                System.arraycopy(objArr, 0, this.f211g, 0, this.f212h << 1);
            }
            m213a(iArr, objArr, this.f212h);
        }
    }

    /* JADX INFO: renamed from: b */
    public Object m220b(int i) {
        return this.f211g[i << 1];
    }

    /* JADX INFO: renamed from: c */
    public Object m221c(int i) {
        return this.f211g[(i << 1) + 1];
    }

    public void clear() {
        if (this.f212h != 0) {
            m213a(this.f210f, this.f211g, this.f212h);
            this.f210f = C0036c.f186a;
            this.f211g = C0036c.f188c;
            this.f212h = 0;
        }
    }

    public boolean containsKey(Object obj) {
        if (obj == null) {
            return m215a() >= 0;
        }
        return m217a(obj, obj.hashCode()) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m216a(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public Object m222d(int i) {
        Object obj = this.f211g[(i << 1) + 1];
        if (this.f212h <= 1) {
            m213a(this.f210f, this.f211g, this.f212h);
            this.f210f = C0036c.f186a;
            this.f211g = C0036c.f188c;
            this.f212h = 0;
        } else if (this.f210f.length <= 8 || this.f212h >= this.f210f.length / 3) {
            this.f212h--;
            if (i < this.f212h) {
                System.arraycopy(this.f210f, i + 1, this.f210f, i, this.f212h - i);
                System.arraycopy(this.f211g, (i + 1) << 1, this.f211g, i << 1, (this.f212h - i) << 1);
            }
            this.f211g[this.f212h << 1] = null;
            this.f211g[(this.f212h << 1) + 1] = null;
        } else {
            int i2 = this.f212h > 8 ? this.f212h + (this.f212h >> 1) : 8;
            int[] iArr = this.f210f;
            Object[] objArr = this.f211g;
            m214e(i2);
            this.f212h--;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f210f, 0, i);
                System.arraycopy(objArr, 0, this.f211g, 0, i << 1);
            }
            if (i < this.f212h) {
                System.arraycopy(iArr, i + 1, this.f210f, i, this.f212h - i);
                System.arraycopy(objArr, (i + 1) << 1, this.f211g, i << 1, (this.f212h - i) << 1);
            }
        }
        return obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        for (int i = 0; i < this.f212h; i++) {
            try {
                Object objM220b = m220b(i);
                Object objM221c = m221c(i);
                Object obj2 = map.get(objM220b);
                if (objM221c == null) {
                    if (obj2 != null || !map.containsKey(objM220b)) {
                        return false;
                    }
                } else if (!objM221c.equals(obj2)) {
                    return false;
                }
            } catch (ClassCastException e) {
                return false;
            } catch (NullPointerException e2) {
                return false;
            }
        }
        return true;
    }

    public Object get(Object obj) {
        int iM215a = obj == null ? m215a() : m217a(obj, obj.hashCode());
        if (iM215a >= 0) {
            return this.f211g[(iM215a << 1) + 1];
        }
        return null;
    }

    public int hashCode() {
        int[] iArr = this.f210f;
        Object[] objArr = this.f211g;
        int i = this.f212h;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.f212h <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int iHashCode;
        int iM217a;
        int i = 8;
        if (obj == null) {
            iM217a = m215a();
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
            iM217a = m217a(obj, iHashCode);
        }
        if (iM217a >= 0) {
            int i2 = (iM217a << 1) + 1;
            Object obj3 = this.f211g[i2];
            this.f211g[i2] = obj2;
            return obj3;
        }
        int i3 = iM217a ^ (-1);
        if (this.f212h >= this.f210f.length) {
            if (this.f212h >= 8) {
                i = this.f212h + (this.f212h >> 1);
            } else if (this.f212h < 4) {
                i = 4;
            }
            int[] iArr = this.f210f;
            Object[] objArr = this.f211g;
            m214e(i);
            if (this.f210f.length > 0) {
                System.arraycopy(iArr, 0, this.f210f, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f211g, 0, objArr.length);
            }
            m213a(iArr, objArr, this.f212h);
        }
        if (i3 < this.f212h) {
            System.arraycopy(this.f210f, i3, this.f210f, i3 + 1, this.f212h - i3);
            System.arraycopy(this.f211g, i3 << 1, this.f211g, (i3 + 1) << 1, (this.f212h - i3) << 1);
        }
        this.f210f[i3] = iHashCode;
        this.f211g[i3 << 1] = obj;
        this.f211g[(i3 << 1) + 1] = obj2;
        this.f212h++;
        return null;
    }

    public Object remove(Object obj) {
        int iM215a = obj == null ? m215a() : m217a(obj, obj.hashCode());
        if (iM215a >= 0) {
            return m222d(iM215a);
        }
        return null;
    }

    public int size() {
        return this.f212h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f212h * 28);
        sb.append('{');
        for (int i = 0; i < this.f212h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objM220b = m220b(i);
            if (objM220b != this) {
                sb.append(objM220b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM221c = m221c(i);
            if (objM221c != this) {
                sb.append(objM221c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
