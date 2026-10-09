package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0026s();

    /* JADX INFO: renamed from: a */
    final String f70a;

    /* JADX INFO: renamed from: b */
    final int f71b;

    /* JADX INFO: renamed from: c */
    final boolean f72c;

    /* JADX INFO: renamed from: d */
    final int f73d;

    /* JADX INFO: renamed from: e */
    final int f74e;

    /* JADX INFO: renamed from: f */
    final String f75f;

    /* JADX INFO: renamed from: g */
    final boolean f76g;

    /* JADX INFO: renamed from: h */
    final boolean f77h;

    /* JADX INFO: renamed from: i */
    final Bundle f78i;

    /* JADX INFO: renamed from: j */
    Bundle f79j;

    /* JADX INFO: renamed from: k */
    Fragment f80k;

    public FragmentState(Parcel parcel) {
        this.f70a = parcel.readString();
        this.f71b = parcel.readInt();
        this.f72c = parcel.readInt() != 0;
        this.f73d = parcel.readInt();
        this.f74e = parcel.readInt();
        this.f75f = parcel.readString();
        this.f76g = parcel.readInt() != 0;
        this.f77h = parcel.readInt() != 0;
        this.f78i = parcel.readBundle();
        this.f79j = parcel.readBundle();
    }

    public FragmentState(Fragment fragment) {
        this.f70a = fragment.getClass().getName();
        this.f71b = fragment.f32f;
        this.f72c = fragment.f41o;
        this.f73d = fragment.f49w;
        this.f74e = fragment.f50x;
        this.f75f = fragment.f51y;
        this.f76g = fragment.f13B;
        this.f77h = fragment.f12A;
        this.f78i = fragment.f34h;
    }

    /* JADX INFO: renamed from: a */
    public Fragment m71a(FragmentActivity fragmentActivity, Fragment fragment) {
        if (this.f80k != null) {
            return this.f80k;
        }
        if (this.f78i != null) {
            this.f78i.setClassLoader(fragmentActivity.getClassLoader());
        }
        this.f80k = Fragment.m6a(fragmentActivity, this.f70a, this.f78i);
        if (this.f79j != null) {
            this.f79j.setClassLoader(fragmentActivity.getClassLoader());
            this.f80k.f30d = this.f79j;
        }
        this.f80k.m11a(this.f71b, fragment);
        this.f80k.f41o = this.f72c;
        this.f80k.f43q = true;
        this.f80k.f49w = this.f73d;
        this.f80k.f50x = this.f74e;
        this.f80k.f51y = this.f75f;
        this.f80k.f13B = this.f76g;
        this.f80k.f12A = this.f77h;
        this.f80k.f45s = fragmentActivity.f55b;
        if (C0022o.f144a) {
            Log.v("FragmentManager", "Instantiated fragment " + this.f80k);
        }
        return this.f80k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f70a);
        parcel.writeInt(this.f71b);
        parcel.writeInt(this.f72c ? 1 : 0);
        parcel.writeInt(this.f73d);
        parcel.writeInt(this.f74e);
        parcel.writeString(this.f75f);
        parcel.writeInt(this.f76g ? 1 : 0);
        parcel.writeInt(this.f77h ? 1 : 0);
        parcel.writeBundle(this.f78i);
        parcel.writeBundle(this.f79j);
    }
}
