package org.andengine.p040d.p041a.p042a;

import java.util.Arrays;
import org.andengine.p040d.p041a.p044c.InterfaceC0926a;

/* JADX INFO: renamed from: org.andengine.d.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0917a implements InterfaceC0926a {

    /* JADX INFO: renamed from: a */
    protected Object[] f2704a;

    /* JADX INFO: renamed from: b */
    protected int f2705b;

    /* JADX INFO: renamed from: c */
    protected int f2706c;

    public C0917a() {
        this(1);
    }

    public C0917a(int i) {
        this.f2704a = new Object[i];
    }

    /* JADX INFO: renamed from: c */
    private void m3752c() {
        int length = this.f2704a.length;
        if (this.f2706c == length) {
            if (this.f2706c - this.f2705b != length) {
                m3755b();
                return;
            }
            Object[] objArr = new Object[((length * 3) >> 1) + 1];
            System.arraycopy(this.f2704a, 0, objArr, 0, length);
            this.f2704a = objArr;
        }
    }

    @Override // org.andengine.p040d.p041a.p044c.InterfaceC0926a
    /* JADX INFO: renamed from: a */
    public Object mo3753a() {
        if (this.f2705b == this.f2706c) {
            return null;
        }
        Object obj = this.f2704a[this.f2705b];
        this.f2704a[this.f2705b] = null;
        this.f2705b++;
        if (this.f2705b == this.f2706c) {
            this.f2705b = 0;
            this.f2706c = 0;
        }
        return obj;
    }

    @Override // org.andengine.p040d.p041a.p044c.InterfaceC0926a
    /* JADX INFO: renamed from: a */
    public void mo3754a(Object obj) {
        m3752c();
        this.f2704a[this.f2706c] = obj;
        this.f2706c++;
    }

    /* JADX INFO: renamed from: b */
    public void m3755b() {
        int i = this.f2706c - this.f2705b;
        if (i == 0) {
            this.f2705b = 0;
            this.f2706c = 0;
            return;
        }
        System.arraycopy(this.f2704a, this.f2705b, this.f2704a, 0, i);
        int iMax = Math.max(i, this.f2705b);
        int iMax2 = Math.max(iMax, this.f2706c);
        if (iMax < iMax2) {
            Arrays.fill(this.f2704a, iMax, iMax2, (Object) null);
        }
        this.f2705b = 0;
        this.f2706c = i;
    }
}
