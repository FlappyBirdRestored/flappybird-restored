package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0025r();

    /* JADX INFO: renamed from: a */
    FragmentState[] f67a;

    /* JADX INFO: renamed from: b */
    int[] f68b;

    /* JADX INFO: renamed from: c */
    BackStackState[] f69c;

    public FragmentManagerState() {
    }

    public FragmentManagerState(Parcel parcel) {
        this.f67a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f68b = parcel.createIntArray();
        this.f69c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f67a, i);
        parcel.writeIntArray(this.f68b);
        parcel.writeTypedArray(this.f69c, i);
    }
}
