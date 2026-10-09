package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0011d();

    /* JADX INFO: renamed from: a */
    final int[] f2a;

    /* JADX INFO: renamed from: b */
    final int f3b;

    /* JADX INFO: renamed from: c */
    final int f4c;

    /* JADX INFO: renamed from: d */
    final String f5d;

    /* JADX INFO: renamed from: e */
    final int f6e;

    /* JADX INFO: renamed from: f */
    final int f7f;

    /* JADX INFO: renamed from: g */
    final CharSequence f8g;

    /* JADX INFO: renamed from: h */
    final int f9h;

    /* JADX INFO: renamed from: i */
    final CharSequence f10i;

    public BackStackState(Parcel parcel) {
        this.f2a = parcel.createIntArray();
        this.f3b = parcel.readInt();
        this.f4c = parcel.readInt();
        this.f5d = parcel.readString();
        this.f6e = parcel.readInt();
        this.f7f = parcel.readInt();
        this.f8g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f9h = parcel.readInt();
        this.f10i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    public BackStackState(C0022o c0022o, RunnableC0009b runnableC0009b) {
        int size = 0;
        for (C0010c c0010c = runnableC0009b.f105b; c0010c != null; c0010c = c0010c.f123a) {
            if (c0010c.f131i != null) {
                size += c0010c.f131i.size();
            }
        }
        this.f2a = new int[size + (runnableC0009b.f107d * 7)];
        if (!runnableC0009b.f114k) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        for (C0010c c0010c2 = runnableC0009b.f105b; c0010c2 != null; c0010c2 = c0010c2.f123a) {
            int i2 = i + 1;
            this.f2a[i] = c0010c2.f125c;
            int i3 = i2 + 1;
            this.f2a[i2] = c0010c2.f126d != null ? c0010c2.f126d.f32f : -1;
            int i4 = i3 + 1;
            this.f2a[i3] = c0010c2.f127e;
            int i5 = i4 + 1;
            this.f2a[i4] = c0010c2.f128f;
            int i6 = i5 + 1;
            this.f2a[i5] = c0010c2.f129g;
            int i7 = i6 + 1;
            this.f2a[i6] = c0010c2.f130h;
            if (c0010c2.f131i != null) {
                int size2 = c0010c2.f131i.size();
                int i8 = i7 + 1;
                this.f2a[i7] = size2;
                int i9 = 0;
                while (i9 < size2) {
                    this.f2a[i8] = ((Fragment) c0010c2.f131i.get(i9)).f32f;
                    i9++;
                    i8++;
                }
                i = i8;
            } else {
                i = i7 + 1;
                this.f2a[i7] = 0;
            }
        }
        this.f3b = runnableC0009b.f112i;
        this.f4c = runnableC0009b.f113j;
        this.f5d = runnableC0009b.f116m;
        this.f6e = runnableC0009b.f118o;
        this.f7f = runnableC0009b.f119p;
        this.f8g = runnableC0009b.f120q;
        this.f9h = runnableC0009b.f121r;
        this.f10i = runnableC0009b.f122s;
    }

    /* JADX INFO: renamed from: a */
    public RunnableC0009b m4a(C0022o c0022o) {
        RunnableC0009b runnableC0009b = new RunnableC0009b(c0022o);
        int i = 0;
        int i2 = 0;
        while (i2 < this.f2a.length) {
            C0010c c0010c = new C0010c();
            int i3 = i2 + 1;
            c0010c.f125c = this.f2a[i2];
            if (C0022o.f144a) {
                Log.v("FragmentManager", "Instantiate " + runnableC0009b + " op #" + i + " base fragment #" + this.f2a[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.f2a[i3];
            if (i5 >= 0) {
                c0010c.f126d = (Fragment) c0022o.f150f.get(i5);
            } else {
                c0010c.f126d = null;
            }
            int i6 = i4 + 1;
            c0010c.f127e = this.f2a[i4];
            int i7 = i6 + 1;
            c0010c.f128f = this.f2a[i6];
            int i8 = i7 + 1;
            c0010c.f129g = this.f2a[i7];
            int i9 = i8 + 1;
            c0010c.f130h = this.f2a[i8];
            int i10 = i9 + 1;
            int i11 = this.f2a[i9];
            if (i11 > 0) {
                c0010c.f131i = new ArrayList(i11);
                int i12 = 0;
                while (i12 < i11) {
                    if (C0022o.f144a) {
                        Log.v("FragmentManager", "Instantiate " + runnableC0009b + " set remove fragment #" + this.f2a[i10]);
                    }
                    c0010c.f131i.add((Fragment) c0022o.f150f.get(this.f2a[i10]));
                    i12++;
                    i10++;
                }
            }
            runnableC0009b.m90a(c0010c);
            i++;
            i2 = i10;
        }
        runnableC0009b.f112i = this.f3b;
        runnableC0009b.f113j = this.f4c;
        runnableC0009b.f116m = this.f5d;
        runnableC0009b.f118o = this.f6e;
        runnableC0009b.f114k = true;
        runnableC0009b.f119p = this.f7f;
        runnableC0009b.f120q = this.f8g;
        runnableC0009b.f121r = this.f9h;
        runnableC0009b.f122s = this.f10i;
        runnableC0009b.m89a(1);
        return runnableC0009b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2a);
        parcel.writeInt(this.f3b);
        parcel.writeInt(this.f4c);
        parcel.writeString(this.f5d);
        parcel.writeInt(this.f6e);
        parcel.writeInt(this.f7f);
        TextUtils.writeToParcel(this.f8g, parcel, 0);
        parcel.writeInt(this.f9h);
        TextUtils.writeToParcel(this.f10i, parcel, 0);
    }
}
