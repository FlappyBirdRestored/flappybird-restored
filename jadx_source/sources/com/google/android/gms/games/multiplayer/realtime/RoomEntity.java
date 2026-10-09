package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.AbstractC0514av;
import com.google.android.gms.internal.C0585dl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class RoomEntity extends AbstractC0514av implements Room {
    public static final Parcelable.Creator CREATOR = new C0490d();

    /* JADX INFO: renamed from: a */
    private final int f1740a;

    /* JADX INFO: renamed from: b */
    private final String f1741b;

    /* JADX INFO: renamed from: c */
    private final String f1742c;

    /* JADX INFO: renamed from: d */
    private final long f1743d;

    /* JADX INFO: renamed from: e */
    private final int f1744e;

    /* JADX INFO: renamed from: f */
    private final String f1745f;

    /* JADX INFO: renamed from: g */
    private final int f1746g;

    /* JADX INFO: renamed from: h */
    private final Bundle f1747h;

    /* JADX INFO: renamed from: i */
    private final ArrayList f1748i;

    /* JADX INFO: renamed from: j */
    private final int f1749j;

    RoomEntity(int i, String str, String str2, long j, int i2, String str3, int i3, Bundle bundle, ArrayList arrayList, int i4) {
        this.f1740a = i;
        this.f1741b = str;
        this.f1742c = str2;
        this.f1743d = j;
        this.f1744e = i2;
        this.f1745f = str3;
        this.f1746g = i3;
        this.f1747h = bundle;
        this.f1748i = arrayList;
        this.f1749j = i4;
    }

    public RoomEntity(Room room) {
        this.f1740a = 2;
        this.f1741b = room.mo2060b();
        this.f1742c = room.mo2061c();
        this.f1743d = room.mo2062d();
        this.f1744e = room.mo2063e();
        this.f1745f = room.mo2064f();
        this.f1746g = room.mo2065g();
        this.f1747h = room.mo2066h();
        ArrayList arrayListI = room.mo2033i();
        int size = arrayListI.size();
        this.f1748i = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.f1748i.add((ParticipantEntity) ((Participant) arrayListI.get(i)).mo1843a());
        }
        this.f1749j = room.mo2067j();
    }

    /* JADX INFO: renamed from: a */
    static int m2068a(Room room) {
        return C0585dl.m2700a(room.mo2060b(), room.mo2061c(), Long.valueOf(room.mo2062d()), Integer.valueOf(room.mo2063e()), room.mo2064f(), Integer.valueOf(room.mo2065g()), room.mo2066h(), room.mo2033i(), Integer.valueOf(room.mo2067j()));
    }

    /* JADX INFO: renamed from: a */
    static boolean m2069a(Room room, Object obj) {
        if (!(obj instanceof Room)) {
            return false;
        }
        if (room == obj) {
            return true;
        }
        Room room2 = (Room) obj;
        return C0585dl.m2702a(room2.mo2060b(), room.mo2060b()) && C0585dl.m2702a(room2.mo2061c(), room.mo2061c()) && C0585dl.m2702a(Long.valueOf(room2.mo2062d()), Long.valueOf(room.mo2062d())) && C0585dl.m2702a(Integer.valueOf(room2.mo2063e()), Integer.valueOf(room.mo2063e())) && C0585dl.m2702a(room2.mo2064f(), room.mo2064f()) && C0585dl.m2702a(Integer.valueOf(room2.mo2065g()), Integer.valueOf(room.mo2065g())) && C0585dl.m2702a(room2.mo2066h(), room.mo2066h()) && C0585dl.m2702a(room2.mo2033i(), room.mo2033i()) && C0585dl.m2702a(Integer.valueOf(room2.mo2067j()), Integer.valueOf(room.mo2067j()));
    }

    /* JADX INFO: renamed from: b */
    static String m2072b(Room room) {
        return C0585dl.m2701a(room).m2703a("RoomId", room.mo2060b()).m2703a("CreatorId", room.mo2061c()).m2703a("CreationTimestamp", Long.valueOf(room.mo2062d())).m2703a("RoomStatus", Integer.valueOf(room.mo2063e())).m2703a("Description", room.mo2064f()).m2703a("Variant", Integer.valueOf(room.mo2065g())).m2703a("AutoMatchCriteria", room.mo2066h()).m2703a("Participants", room.mo2033i()).m2703a("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.mo2067j())).toString();
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* JADX INFO: renamed from: b */
    public String mo2060b() {
        return this.f1741b;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* JADX INFO: renamed from: c */
    public String mo2061c() {
        return this.f1742c;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* JADX INFO: renamed from: d */
    public long mo2062d() {
        return this.f1743d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* JADX INFO: renamed from: e */
    public int mo2063e() {
        return this.f1744e;
    }

    public boolean equals(Object obj) {
        return m2069a(this, obj);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* JADX INFO: renamed from: f */
    public String mo2064f() {
        return this.f1745f;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* JADX INFO: renamed from: g */
    public int mo2065g() {
        return this.f1746g;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* JADX INFO: renamed from: h */
    public Bundle mo2066h() {
        return this.f1747h;
    }

    public int hashCode() {
        return m2068a(this);
    }

    @Override // com.google.android.gms.games.multiplayer.InterfaceC0484e
    /* JADX INFO: renamed from: i */
    public ArrayList mo2033i() {
        return new ArrayList(this.f1748i);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.Room
    /* JADX INFO: renamed from: j */
    public int mo2067j() {
        return this.f1749j;
    }

    /* JADX INFO: renamed from: k */
    public int m2074k() {
        return this.f1740a;
    }

    @Override // com.google.android.gms.common.data.InterfaceC0449a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Room mo1843a() {
        return this;
    }

    public String toString() {
        return m2072b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (!m2741v()) {
            C0491e.m2081a(this, parcel, i);
            return;
        }
        parcel.writeString(this.f1741b);
        parcel.writeString(this.f1742c);
        parcel.writeLong(this.f1743d);
        parcel.writeInt(this.f1744e);
        parcel.writeString(this.f1745f);
        parcel.writeInt(this.f1746g);
        parcel.writeBundle(this.f1747h);
        int size = this.f1748i.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((ParticipantEntity) this.f1748i.get(i2)).writeToParcel(parcel, i);
        }
    }
}
