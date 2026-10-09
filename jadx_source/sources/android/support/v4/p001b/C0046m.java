package android.support.v4.p001b;

/* JADX INFO: renamed from: android.support.v4.b.m */
/* JADX INFO: loaded from: classes.dex */
public class C0046m implements Cloneable {

    /* JADX INFO: renamed from: a */
    private static final Object f213a = new Object();

    /* JADX INFO: renamed from: b */
    private boolean f214b;

    /* JADX INFO: renamed from: c */
    private int[] f215c;

    /* JADX INFO: renamed from: d */
    private Object[] f216d;

    /* JADX INFO: renamed from: e */
    private int f217e;

    public C0046m() {
        this(10);
    }

    public C0046m(int i) {
        this.f214b = false;
        if (i == 0) {
            this.f215c = C0036c.f186a;
            this.f216d = C0036c.f188c;
        } else {
            int iM196a = C0036c.m196a(i);
            this.f215c = new int[iM196a];
            this.f216d = new Object[iM196a];
        }
        this.f217e = 0;
    }

    /* JADX INFO: renamed from: d */
    private void m223d() {
        int i = this.f217e;
        int[] iArr = this.f215c;
        Object[] objArr = this.f216d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f213a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f214b = false;
        this.f217e = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m224a(int i) {
        if (this.f214b) {
            m223d();
        }
        return this.f215c[i];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0046m clone() {
        try {
            C0046m c0046m = (C0046m) super.clone();
            try {
                c0046m.f215c = (int[]) this.f215c.clone();
                c0046m.f216d = (Object[]) this.f216d.clone();
                return c0046m;
            } catch (CloneNotSupportedException e) {
                return c0046m;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m226b() {
        if (this.f214b) {
            m223d();
        }
        return this.f217e;
    }

    /* JADX INFO: renamed from: b */
    public Object m227b(int i) {
        if (this.f214b) {
            m223d();
        }
        return this.f216d[i];
    }

    /* JADX INFO: renamed from: c */
    public void m228c() {
        int i = this.f217e;
        Object[] objArr = this.f216d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f217e = 0;
        this.f214b = false;
    }

    public String toString() {
        if (m226b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f217e * 28);
        sb.append('{');
        for (int i = 0; i < this.f217e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m224a(i));
            sb.append('=');
            Object objM227b = m227b(i);
            if (objM227b != this) {
                sb.append(objM227b);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
