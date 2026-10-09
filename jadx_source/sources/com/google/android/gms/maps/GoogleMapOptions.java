package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.C0467e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.p015a.C0657bk;
import com.google.android.gms.maps.p015a.C0677v;

/* JADX INFO: loaded from: classes.dex */
public final class GoogleMapOptions implements SafeParcelable {
    public static final C0682b CREATOR = new C0682b();

    /* JADX INFO: renamed from: a */
    private final int f2116a;

    /* JADX INFO: renamed from: b */
    private Boolean f2117b;

    /* JADX INFO: renamed from: c */
    private Boolean f2118c;

    /* JADX INFO: renamed from: d */
    private int f2119d;

    /* JADX INFO: renamed from: e */
    private CameraPosition f2120e;

    /* JADX INFO: renamed from: f */
    private Boolean f2121f;

    /* JADX INFO: renamed from: g */
    private Boolean f2122g;

    /* JADX INFO: renamed from: h */
    private Boolean f2123h;

    /* JADX INFO: renamed from: i */
    private Boolean f2124i;

    /* JADX INFO: renamed from: j */
    private Boolean f2125j;

    /* JADX INFO: renamed from: k */
    private Boolean f2126k;

    public GoogleMapOptions() {
        this.f2119d = -1;
        this.f2116a = 1;
    }

    GoogleMapOptions(int i, byte b, byte b2, int i2, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        this.f2119d = -1;
        this.f2116a = i;
        this.f2117b = C0677v.m2966a(b);
        this.f2118c = C0677v.m2966a(b2);
        this.f2119d = i2;
        this.f2120e = cameraPosition;
        this.f2121f = C0677v.m2966a(b3);
        this.f2122g = C0677v.m2966a(b4);
        this.f2123h = C0677v.m2966a(b5);
        this.f2124i = C0677v.m2966a(b6);
        this.f2125j = C0677v.m2966a(b7);
        this.f2126k = C0677v.m2966a(b8);
    }

    /* JADX INFO: renamed from: a */
    public static GoogleMapOptions m2806a(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C0467e.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (typedArrayObtainAttributes.hasValue(0)) {
            googleMapOptions.m2808a(typedArrayObtainAttributes.getInt(0, -1));
        }
        if (typedArrayObtainAttributes.hasValue(13)) {
            googleMapOptions.m2810a(typedArrayObtainAttributes.getBoolean(13, false));
        }
        if (typedArrayObtainAttributes.hasValue(12)) {
            googleMapOptions.m2812b(typedArrayObtainAttributes.getBoolean(12, false));
        }
        if (typedArrayObtainAttributes.hasValue(6)) {
            googleMapOptions.m2816d(typedArrayObtainAttributes.getBoolean(6, true));
        }
        if (typedArrayObtainAttributes.hasValue(7)) {
            googleMapOptions.m2824h(typedArrayObtainAttributes.getBoolean(7, true));
        }
        if (typedArrayObtainAttributes.hasValue(8)) {
            googleMapOptions.m2818e(typedArrayObtainAttributes.getBoolean(8, true));
        }
        if (typedArrayObtainAttributes.hasValue(9)) {
            googleMapOptions.m2822g(typedArrayObtainAttributes.getBoolean(9, true));
        }
        if (typedArrayObtainAttributes.hasValue(11)) {
            googleMapOptions.m2820f(typedArrayObtainAttributes.getBoolean(11, true));
        }
        if (typedArrayObtainAttributes.hasValue(10)) {
            googleMapOptions.m2814c(typedArrayObtainAttributes.getBoolean(10, true));
        }
        googleMapOptions.m2809a(CameraPosition.m2976a(context, attributeSet));
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    /* JADX INFO: renamed from: a */
    int m2807a() {
        return this.f2116a;
    }

    /* JADX INFO: renamed from: a */
    public GoogleMapOptions m2808a(int i) {
        this.f2119d = i;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public GoogleMapOptions m2809a(CameraPosition cameraPosition) {
        this.f2120e = cameraPosition;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public GoogleMapOptions m2810a(boolean z) {
        this.f2117b = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: b */
    byte m2811b() {
        return C0677v.m2965a(this.f2117b);
    }

    /* JADX INFO: renamed from: b */
    public GoogleMapOptions m2812b(boolean z) {
        this.f2118c = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: c */
    byte m2813c() {
        return C0677v.m2965a(this.f2118c);
    }

    /* JADX INFO: renamed from: c */
    public GoogleMapOptions m2814c(boolean z) {
        this.f2121f = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: d */
    byte m2815d() {
        return C0677v.m2965a(this.f2121f);
    }

    /* JADX INFO: renamed from: d */
    public GoogleMapOptions m2816d(boolean z) {
        this.f2122g = Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    byte m2817e() {
        return C0677v.m2965a(this.f2122g);
    }

    /* JADX INFO: renamed from: e */
    public GoogleMapOptions m2818e(boolean z) {
        this.f2123h = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: f */
    byte m2819f() {
        return C0677v.m2965a(this.f2123h);
    }

    /* JADX INFO: renamed from: f */
    public GoogleMapOptions m2820f(boolean z) {
        this.f2124i = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: g */
    byte m2821g() {
        return C0677v.m2965a(this.f2124i);
    }

    /* JADX INFO: renamed from: g */
    public GoogleMapOptions m2822g(boolean z) {
        this.f2125j = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: h */
    byte m2823h() {
        return C0677v.m2965a(this.f2125j);
    }

    /* JADX INFO: renamed from: h */
    public GoogleMapOptions m2824h(boolean z) {
        this.f2126k = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: renamed from: i */
    byte m2825i() {
        return C0677v.m2965a(this.f2126k);
    }

    /* JADX INFO: renamed from: j */
    public int m2826j() {
        return this.f2119d;
    }

    /* JADX INFO: renamed from: k */
    public CameraPosition m2827k() {
        return this.f2120e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (C0657bk.m2880a()) {
            C0685e.m2975a(this, parcel, i);
        } else {
            C0682b.m2970a(this, parcel, i);
        }
    }
}
