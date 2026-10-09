package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: android.support.v4.view.ae */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0086ae {

    /* JADX INFO: renamed from: a */
    private DataSetObservable f348a = new DataSetObservable();

    /* JADX INFO: renamed from: a */
    public abstract int m471a();

    /* JADX INFO: renamed from: a */
    public int m472a(Object obj) {
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public CharSequence m473a(int i) {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public Object m474a(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* JADX INFO: renamed from: a */
    public Object m475a(ViewGroup viewGroup, int i) {
        return m474a((View) viewGroup, i);
    }

    /* JADX INFO: renamed from: a */
    public void m476a(DataSetObserver dataSetObserver) {
        this.f348a.registerObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: a */
    public void m477a(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* JADX INFO: renamed from: a */
    public void m478a(View view) {
    }

    /* JADX INFO: renamed from: a */
    public void m479a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* JADX INFO: renamed from: a */
    public void m480a(ViewGroup viewGroup) {
        m478a((View) viewGroup);
    }

    /* JADX INFO: renamed from: a */
    public void m481a(ViewGroup viewGroup, int i, Object obj) {
        m479a((View) viewGroup, i, obj);
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean m482a(View view, Object obj);

    /* JADX INFO: renamed from: b */
    public float m483b(int i) {
        return 1.0f;
    }

    /* JADX INFO: renamed from: b */
    public Parcelable m484b() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m485b(DataSetObserver dataSetObserver) {
        this.f348a.unregisterObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: b */
    public void m486b(View view) {
    }

    /* JADX INFO: renamed from: b */
    public void m487b(View view, int i, Object obj) {
    }

    /* JADX INFO: renamed from: b */
    public void m488b(ViewGroup viewGroup) {
        m486b((View) viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m489b(ViewGroup viewGroup, int i, Object obj) {
        m487b((View) viewGroup, i, obj);
    }
}
