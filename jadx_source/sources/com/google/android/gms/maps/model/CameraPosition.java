package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C0585dl;
import com.google.android.gms.internal.C0588do;
import com.google.android.gms.maps.p015a.C0657bk;

/* JADX INFO: loaded from: classes.dex */
public final class CameraPosition implements SafeParcelable {
    public static final C0713c CREATOR = new C0713c();

    /* JADX INFO: renamed from: a */
    public final LatLng f2159a;

    /* JADX INFO: renamed from: b */
    public final float f2160b;

    /* JADX INFO: renamed from: c */
    public final float f2161c;

    /* JADX INFO: renamed from: d */
    public final float f2162d;

    /* JADX INFO: renamed from: e */
    private final int f2163e;

    CameraPosition(int i, LatLng latLng, float f, float f2, float f3) {
        C0588do.m2705a(latLng, "null camera target");
        C0588do.m2710b(0.0f <= f2 && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive");
        this.f2163e = i;
        this.f2159a = latLng;
        this.f2160b = f;
        this.f2161c = f2 + 0.0f;
        this.f2162d = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        this(1, latLng, f, f2, f3);
    }

    /* JADX INFO: renamed from: a */
    public static CameraPosition m2976a(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C0467e.MapAttrs);
        LatLng latLng = new LatLng(typedArrayObtainAttributes.hasValue(2) ? typedArrayObtainAttributes.getFloat(2, 0.0f) : 0.0f, typedArrayObtainAttributes.hasValue(3) ? typedArrayObtainAttributes.getFloat(3, 0.0f) : 0.0f);
        C0712b c0712bM2977b = m2977b();
        c0712bM2977b.m3164a(latLng);
        if (typedArrayObtainAttributes.hasValue(5)) {
            c0712bM2977b.m3163a(typedArrayObtainAttributes.getFloat(5, 0.0f));
        }
        if (typedArrayObtainAttributes.hasValue(1)) {
            c0712bM2977b.m3166c(typedArrayObtainAttributes.getFloat(1, 0.0f));
        }
        if (typedArrayObtainAttributes.hasValue(4)) {
            c0712bM2977b.m3165b(typedArrayObtainAttributes.getFloat(4, 0.0f));
        }
        return c0712bM2977b.m3162a();
    }

    /* JADX INFO: renamed from: b */
    public static C0712b m2977b() {
        return new C0712b();
    }

    /* JADX INFO: renamed from: a */
    int m2978a() {
        return this.f2163e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f2159a.equals(cameraPosition.f2159a) && Float.floatToIntBits(this.f2160b) == Float.floatToIntBits(cameraPosition.f2160b) && Float.floatToIntBits(this.f2161c) == Float.floatToIntBits(cameraPosition.f2161c) && Float.floatToIntBits(this.f2162d) == Float.floatToIntBits(cameraPosition.f2162d);
    }

    public int hashCode() {
        return C0585dl.m2700a(this.f2159a, Float.valueOf(this.f2160b), Float.valueOf(this.f2161c), Float.valueOf(this.f2162d));
    }

    public String toString() {
        return C0585dl.m2701a(this).m2703a("target", this.f2159a).m2703a("zoom", Float.valueOf(this.f2160b)).m2703a("tilt", Float.valueOf(this.f2161c)).m2703a("bearing", Float.valueOf(this.f2162d)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (C0657bk.m2880a()) {
            C0727q.m3200a(this, parcel, i);
        } else {
            C0713c.m3167a(this, parcel, i);
        }
    }
}
