package com.google.ads.p003a;

import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: com.google.ads.a.z */
/* JADX INFO: loaded from: classes.dex */
class C0259z implements InterfaceC0224aa {
    C0259z() {
    }

    @Override // com.google.ads.p003a.InterfaceC0224aa
    /* JADX INFO: renamed from: a */
    public HttpURLConnection mo966a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }
}
