package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.C0445a;
import com.google.android.gms.common.InterfaceC0447c;
import com.google.android.gms.common.InterfaceC0448d;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.p014a.InterfaceC0469a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0606r extends AbstractC0564cr {

    /* JADX INFO: renamed from: f */
    private final String f2078f;

    /* JADX INFO: renamed from: g */
    private final String f2079g;

    /* JADX INFO: renamed from: h */
    private final Map f2080h;

    /* JADX INFO: renamed from: i */
    private PlayerEntity f2081i;

    /* JADX INFO: renamed from: j */
    private final C0501ai f2082j;

    /* JADX INFO: renamed from: k */
    private boolean f2083k;

    /* JADX INFO: renamed from: l */
    private final Binder f2084l;

    /* JADX INFO: renamed from: m */
    private final long f2085m;

    /* JADX INFO: renamed from: n */
    private final boolean f2086n;

    public C0606r(Context context, String str, String str2, InterfaceC0447c interfaceC0447c, InterfaceC0448d interfaceC0448d, String[] strArr, int i, View view, boolean z) {
        super(context, interfaceC0447c, interfaceC0448d, strArr);
        this.f2083k = false;
        this.f2078f = str;
        this.f2079g = (String) C0588do.m2704a(str2);
        this.f2084l = new Binder();
        this.f2080h = new HashMap();
        this.f2082j = C0501ai.m2262a(this, i);
        m2765a(view);
        this.f2085m = hashCode();
        this.f2086n = z;
    }

    /* JADX INFO: renamed from: o */
    private void m2760o() {
        this.f2081i = null;
    }

    /* JADX INFO: renamed from: p */
    private void m2761p() {
        Iterator it = this.f2080h.values().iterator();
        while (it.hasNext()) {
            try {
                ((C0506an) it.next()).m2281a();
            } catch (IOException e) {
                C0611w.m2776a("GamesClient", "IOException:", e);
            }
        }
        this.f2080h.clear();
    }

    /* JADX INFO: renamed from: a */
    public Intent m2762a(String str) {
        m2647m();
        Intent intent = new Intent("com.google.android.gms.games.VIEW_LEADERBOARD_SCORES");
        intent.putExtra("com.google.android.gms.games.LEADERBOARD_ID", str);
        intent.addFlags(67108864);
        return C0610v.m2774a(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC0496ad mo2357b(IBinder iBinder) {
        return AbstractBinderC0498af.m2253a(iBinder);
    }

    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: a */
    public void mo2635a() {
        m2760o();
        super.mo2635a();
    }

    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: a */
    protected void mo2355a(int i, IBinder iBinder, Bundle bundle) {
        if (i == 0 && bundle != null) {
            this.f2083k = bundle.getBoolean("show_welcome_popup");
        }
        super.mo2355a(i, iBinder, bundle);
    }

    /* JADX INFO: renamed from: a */
    public void m2764a(IBinder iBinder, Bundle bundle) {
        if (m2642h()) {
            try {
                ((InterfaceC0496ad) m2648n()).mo2144a(iBinder, bundle);
            } catch (RemoteException e) {
                C0611w.m2775a("GamesClient", "service died");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2765a(View view) {
        this.f2082j.mo2265a(view);
    }

    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: a */
    protected void mo2636a(C0445a c0445a) {
        super.mo2636a(c0445a);
        this.f2083k = false;
    }

    /* JADX INFO: renamed from: a */
    public void m2766a(InterfaceC0469a interfaceC0469a, String str, long j) {
        BinderC0607s binderC0607s;
        if (interfaceC0469a == null) {
            binderC0607s = null;
        } else {
            try {
                binderC0607s = new BinderC0607s(this, interfaceC0469a);
            } catch (RemoteException e) {
                C0611w.m2775a("GamesClient", "service died");
                return;
            }
        }
        ((InterfaceC0496ad) m2648n()).mo2157a(binderC0607s, str, j);
    }

    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: a */
    protected void mo2356a(InterfaceC0579df interfaceC0579df, BinderC0567cu binderC0567cu) {
        String string = m2644j().getResources().getConfiguration().locale.toString();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", this.f2086n);
        interfaceC0579df.mo2689a(binderC0567cu, 3265100, m2644j().getPackageName(), this.f2079g, m2645k(), this.f2078f, this.f2082j.m2266b(), string, bundle);
    }

    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: a */
    protected void mo2383a(String... strArr) {
        boolean z = false;
        boolean z2 = false;
        for (String str : strArr) {
            if (str.equals("https://www.googleapis.com/auth/games")) {
                z2 = true;
            } else if (str.equals("https://www.googleapis.com/auth/games.firstparty")) {
                z = true;
            }
        }
        if (z) {
            C0588do.m2707a(!z2, String.format("Cannot have both %s and %s!", "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty"));
        } else {
            C0588do.m2707a(z2, String.format("GamesClient requires %s to function.", "https://www.googleapis.com/auth/games"));
        }
    }

    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: b */
    public void mo2638b() {
        this.f2083k = false;
        if (m2642h()) {
            try {
                InterfaceC0496ad interfaceC0496ad = (InterfaceC0496ad) m2648n();
                interfaceC0496ad.mo2184c();
                interfaceC0496ad.mo2171b(this.f2085m);
                interfaceC0496ad.mo2143a(this.f2085m);
            } catch (RemoteException e) {
                C0611w.m2775a("GamesClient", "Failed to notify client disconnect.");
            }
        }
        m2761p();
        super.mo2638b();
    }

    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: c */
    protected String mo2358c() {
        return "com.google.android.gms.games.service.START";
    }

    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: d */
    protected String mo2359d() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: e */
    protected Bundle mo2640e() {
        try {
            Bundle bundleMo2169b = ((InterfaceC0496ad) m2648n()).mo2169b();
            if (bundleMo2169b == null) {
                return bundleMo2169b;
            }
            bundleMo2169b.setClassLoader(C0606r.class.getClassLoader());
            return bundleMo2169b;
        } catch (RemoteException e) {
            C0611w.m2775a("GamesClient", "service died");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.AbstractC0564cr
    /* JADX INFO: renamed from: f */
    protected void mo2641f() {
        super.mo2641f();
        if (this.f2083k) {
            this.f2082j.mo2263a();
            this.f2083k = false;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m2767g() {
        if (m2642h()) {
            try {
                ((InterfaceC0496ad) m2648n()).mo2184c();
            } catch (RemoteException e) {
                C0611w.m2775a("GamesClient", "service died");
            }
        }
    }
}
