package org.andengine.p021a.p024c;

import android.media.SoundPool;
import android.util.SparseArray;
import org.andengine.p021a.AbstractC0863b;
import org.andengine.p021a.InterfaceC0866c;
import org.andengine.p021a.p024c.p025a.C0868a;

/* JADX INFO: renamed from: org.andengine.a.c.c */
/* JADX INFO: loaded from: classes.dex */
public class C0871c extends AbstractC0863b implements SoundPool.OnLoadCompleteListener {

    /* JADX INFO: renamed from: c */
    private final SoundPool f2540c;

    /* JADX INFO: renamed from: d */
    private final SparseArray f2541d;

    public C0871c() {
        this(5);
    }

    public C0871c(int i) {
        this.f2541d = new SparseArray();
        this.f2540c = new SoundPool(i, 3, 0);
        this.f2540c.setOnLoadCompleteListener(this);
    }

    @Override // org.andengine.p021a.AbstractC0863b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo3563a(C0867a c0867a) {
        super.mo3563a((InterfaceC0866c) c0867a);
        this.f2541d.put(c0867a.m3570h(), c0867a);
    }

    @Override // org.andengine.p021a.AbstractC0863b
    /* JADX INFO: renamed from: b */
    public void mo3564b() {
        super.mo3564b();
        this.f2540c.release();
    }

    @Override // org.andengine.p021a.AbstractC0863b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean mo3565b(C0867a c0867a) {
        boolean zMo3565b = super.mo3565b((InterfaceC0866c) c0867a);
        if (zMo3565b) {
            this.f2541d.remove(c0867a.m3570h());
        }
        return zMo3565b;
    }

    /* JADX INFO: renamed from: c */
    SoundPool m3577c() {
        return this.f2540c;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public synchronized void onLoadComplete(SoundPool soundPool, int i, int i2) {
        if (i2 == 0) {
            C0867a c0867a = (C0867a) this.f2541d.get(i);
            if (c0867a == null) {
                throw new C0868a("Unexpected soundID: '" + i + "'.");
            }
            c0867a.m3569a(true);
        }
    }
}
