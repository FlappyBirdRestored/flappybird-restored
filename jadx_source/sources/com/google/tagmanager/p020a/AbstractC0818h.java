package com.google.tagmanager.p020a;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.tagmanager.a.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0818h implements Iterable {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0818h f2420a;

    /* JADX INFO: renamed from: b */
    static final /* synthetic */ boolean f2421b;

    static {
        f2421b = !AbstractC0818h.class.desiredAssertionStatus();
        f2420a = new C0777aj(new byte[0]);
    }

    AbstractC0818h() {
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0818h m3397a(Iterable iterable) {
        Collection collection;
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add((AbstractC0818h) it.next());
            }
            collection = arrayList;
        }
        return collection.isEmpty() ? f2420a : m3398a(collection.iterator(), collection.size());
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC0818h m3398a(Iterator it, int i) {
        if (!f2421b && i < 1) {
            throw new AssertionError();
        }
        if (i == 1) {
            return (AbstractC0818h) it.next();
        }
        int i2 = i >>> 1;
        return m3398a(it, i2).m3401a(m3398a(it, i - i2));
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0818h m3399a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C0777aj(bArr2);
    }

    /* JADX INFO: renamed from: i */
    public static C0820j m3400i() {
        return new C0820j(128);
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo3307a();

    /* JADX INFO: renamed from: a */
    protected abstract int mo3308a(int i, int i2, int i3);

    /* JADX INFO: renamed from: a */
    public AbstractC0818h m3401a(AbstractC0818h abstractC0818h) {
        int iMo3307a = mo3307a();
        int iMo3307a2 = abstractC0818h.mo3307a();
        if (((long) iMo3307a) + ((long) iMo3307a2) >= 2147483647L) {
            throw new IllegalArgumentException("ByteString would be too long: " + iMo3307a + "+" + iMo3307a2);
        }
        return C0785ar.m3325a(this, abstractC0818h);
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo3309a(String str);

    /* JADX INFO: renamed from: a */
    void m3402a(OutputStream outputStream, int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Source offset < 0: " + i);
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Length < 0: " + i2);
        }
        if (i + i2 > mo3307a()) {
            throw new IndexOutOfBoundsException("Source end offset exceeded: " + (i + i2));
        }
        if (i2 > 0) {
            mo3314b(outputStream, i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo3310a(byte[] bArr, int i, int i2, int i3);

    /* JADX INFO: renamed from: b */
    protected abstract int mo3313b(int i, int i2, int i3);

    /* JADX INFO: renamed from: b */
    abstract void mo3314b(OutputStream outputStream, int i, int i2);

    /* JADX INFO: renamed from: b */
    public void m3403b(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Source offset < 0: " + i);
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Target offset < 0: " + i2);
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException("Length < 0: " + i3);
        }
        if (i + i3 > mo3307a()) {
            throw new IndexOutOfBoundsException("Source end offset < 0: " + (i + i3));
        }
        if (i2 + i3 > bArr.length) {
            throw new IndexOutOfBoundsException("Target end offset < 0: " + (i2 + i3));
        }
        if (i3 > 0) {
            mo3310a(bArr, i, i2, i3);
        }
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC0819i iterator();

    /* JADX INFO: renamed from: d */
    public boolean m3404d() {
        return mo3307a() == 0;
    }

    /* JADX INFO: renamed from: e */
    public byte[] m3405e() {
        int iMo3307a = mo3307a();
        if (iMo3307a == 0) {
            return C0770ac.f2319a;
        }
        byte[] bArr = new byte[iMo3307a];
        mo3310a(bArr, 0, 0, iMo3307a);
        return bArr;
    }

    /* JADX INFO: renamed from: f */
    public String m3406f() {
        try {
            return mo3309a("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo3316g();

    /* JADX INFO: renamed from: h */
    public abstract C0821k mo3317h();

    public abstract int hashCode();

    /* JADX INFO: renamed from: j */
    protected abstract int mo3318j();

    /* JADX INFO: renamed from: k */
    protected abstract boolean mo3319k();

    /* JADX INFO: renamed from: l */
    protected abstract int mo3320l();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo3307a()));
    }
}
