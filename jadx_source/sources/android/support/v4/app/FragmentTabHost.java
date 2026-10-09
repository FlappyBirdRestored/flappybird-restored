package android.support.v4.app;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: a */
    private final ArrayList f81a;

    /* JADX INFO: renamed from: b */
    private Context f82b;

    /* JADX INFO: renamed from: c */
    private AbstractC0020m f83c;

    /* JADX INFO: renamed from: d */
    private int f84d;

    /* JADX INFO: renamed from: e */
    private TabHost.OnTabChangeListener f85e;

    /* JADX INFO: renamed from: f */
    private C0029v f86f;

    /* JADX INFO: renamed from: g */
    private boolean f87g;

    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C0028u();

        /* JADX INFO: renamed from: a */
        String f88a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f88a = parcel.readString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f88a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f88a);
        }
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f81a = new ArrayList();
        m73a(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    private AbstractC0030w m72a(String str, AbstractC0030w abstractC0030w) {
        C0029v c0029v = null;
        int i = 0;
        while (i < this.f81a.size()) {
            C0029v c0029v2 = (C0029v) this.f81a.get(i);
            if (!c0029v2.f173a.equals(str)) {
                c0029v2 = c0029v;
            }
            i++;
            c0029v = c0029v2;
        }
        if (c0029v == null) {
            throw new IllegalStateException("No tab known for tag " + str);
        }
        if (this.f86f != c0029v) {
            if (abstractC0030w == null) {
                abstractC0030w = this.f83c.mo102a();
            }
            if (this.f86f != null && this.f86f.f176d != null) {
                abstractC0030w.mo88a(this.f86f.f176d);
            }
            if (c0029v != null) {
                if (c0029v.f176d == null) {
                    c0029v.f176d = Fragment.m6a(this.f82b, c0029v.f174b.getName(), c0029v.f175c);
                    abstractC0030w.mo87a(this.f84d, c0029v.f176d, c0029v.f173a);
                } else {
                    abstractC0030w.mo93b(c0029v.f176d);
                }
            }
            this.f86f = c0029v;
        }
        return abstractC0030w;
    }

    /* JADX INFO: renamed from: a */
    private void m73a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.f84d = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        AbstractC0030w abstractC0030wMo102a = null;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f81a.size()) {
                break;
            }
            C0029v c0029v = (C0029v) this.f81a.get(i2);
            c0029v.f176d = this.f83c.mo101a(c0029v.f173a);
            if (c0029v.f176d != null && !c0029v.f176d.m35d()) {
                if (c0029v.f173a.equals(currentTabTag)) {
                    this.f86f = c0029v;
                } else {
                    if (abstractC0030wMo102a == null) {
                        abstractC0030wMo102a = this.f83c.mo102a();
                    }
                    abstractC0030wMo102a.mo88a(c0029v.f176d);
                }
            }
            i = i2 + 1;
        }
        this.f87g = true;
        AbstractC0030w abstractC0030wM72a = m72a(currentTabTag, abstractC0030wMo102a);
        if (abstractC0030wM72a != null) {
            abstractC0030wM72a.mo85a();
            this.f83c.mo103b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f87g = false;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f88a);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f88a = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        AbstractC0030w abstractC0030wM72a;
        if (this.f87g && (abstractC0030wM72a = m72a(str, (AbstractC0030w) null)) != null) {
            abstractC0030wM72a.mo85a();
        }
        if (this.f85e != null) {
            this.f85e.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f85e = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
