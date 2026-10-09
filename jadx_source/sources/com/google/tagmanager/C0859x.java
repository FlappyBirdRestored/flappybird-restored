package com.google.tagmanager;

/* JADX INFO: renamed from: com.google.tagmanager.x */
/* JADX INFO: loaded from: classes.dex */
class C0859x extends Number implements Comparable {

    /* JADX INFO: renamed from: a */
    private double f2515a;

    /* JADX INFO: renamed from: b */
    private long f2516b;

    /* JADX INFO: renamed from: c */
    private boolean f2517c = true;

    private C0859x(long j) {
        this.f2516b = j;
    }

    /* JADX INFO: renamed from: a */
    public static C0859x m3543a(long j) {
        return new C0859x(j);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0859x c0859x) {
        return (m3546b() && c0859x.m3546b()) ? new Long(this.f2516b).compareTo(Long.valueOf(c0859x.f2516b)) : Double.compare(doubleValue(), c0859x.doubleValue());
    }

    /* JADX INFO: renamed from: a */
    public boolean m3545a() {
        return !m3546b();
    }

    /* JADX INFO: renamed from: b */
    public boolean m3546b() {
        return this.f2517c;
    }

    @Override // java.lang.Number
    public byte byteValue() {
        return (byte) longValue();
    }

    /* JADX INFO: renamed from: c */
    public long m3547c() {
        return m3546b() ? this.f2516b : (long) this.f2515a;
    }

    /* JADX INFO: renamed from: d */
    public int m3548d() {
        return (int) longValue();
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return m3546b() ? this.f2516b : this.f2515a;
    }

    /* JADX INFO: renamed from: e */
    public short m3549e() {
        return (short) longValue();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0859x) && compareTo((C0859x) obj) == 0;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) doubleValue();
    }

    public int hashCode() {
        return new Long(longValue()).hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        return m3548d();
    }

    @Override // java.lang.Number
    public long longValue() {
        return m3547c();
    }

    @Override // java.lang.Number
    public short shortValue() {
        return m3549e();
    }

    public String toString() {
        return m3546b() ? Long.toString(this.f2516b) : Double.toString(this.f2515a);
    }
}
