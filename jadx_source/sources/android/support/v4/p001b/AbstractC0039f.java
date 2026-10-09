package android.support.v4.p001b;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: android.support.v4.b.f */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0039f {

    /* JADX INFO: renamed from: b */
    C0041h f191b;

    /* JADX INFO: renamed from: c */
    C0042i f192c;

    /* JADX INFO: renamed from: d */
    C0044k f193d;

    AbstractC0039f() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m202a(Map map, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m203a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException e) {
            return false;
        } catch (NullPointerException e2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m204b(Map map, Collection collection) {
        int size = map.size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m205c(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* JADX INFO: renamed from: a */
    protected abstract int mo187a();

    /* JADX INFO: renamed from: a */
    protected abstract int mo188a(Object obj);

    /* JADX INFO: renamed from: a */
    protected abstract Object mo189a(int i, int i2);

    /* JADX INFO: renamed from: a */
    protected abstract Object mo190a(int i, Object obj);

    /* JADX INFO: renamed from: a */
    protected abstract void mo191a(int i);

    /* JADX INFO: renamed from: a */
    protected abstract void mo192a(Object obj, Object obj2);

    /* JADX INFO: renamed from: a */
    public Object[] m206a(Object[] objArr, int i) {
        int iMo187a = mo187a();
        Object[] objArr2 = objArr.length < iMo187a ? (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iMo187a) : objArr;
        for (int i2 = 0; i2 < iMo187a; i2++) {
            objArr2[i2] = mo189a(i2, i);
        }
        if (objArr2.length > iMo187a) {
            objArr2[iMo187a] = null;
        }
        return objArr2;
    }

    /* JADX INFO: renamed from: b */
    protected abstract int mo193b(Object obj);

    /* JADX INFO: renamed from: b */
    protected abstract Map mo194b();

    /* JADX INFO: renamed from: b */
    public Object[] m207b(int i) {
        int iMo187a = mo187a();
        Object[] objArr = new Object[iMo187a];
        for (int i2 = 0; i2 < iMo187a; i2++) {
            objArr[i2] = mo189a(i2, i);
        }
        return objArr;
    }

    /* JADX INFO: renamed from: c */
    protected abstract void mo195c();

    /* JADX INFO: renamed from: d */
    public Set m208d() {
        if (this.f191b == null) {
            this.f191b = new C0041h(this);
        }
        return this.f191b;
    }

    /* JADX INFO: renamed from: e */
    public Set m209e() {
        if (this.f192c == null) {
            this.f192c = new C0042i(this);
        }
        return this.f192c;
    }

    /* JADX INFO: renamed from: f */
    public Collection m210f() {
        if (this.f193d == null) {
            this.f193d = new C0044k(this);
        }
        return this.f193d;
    }
}
