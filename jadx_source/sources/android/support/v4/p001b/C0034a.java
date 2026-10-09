package android.support.v4.p001b;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: android.support.v4.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C0034a extends C0045l implements Map {

    /* JADX INFO: renamed from: a */
    AbstractC0039f f184a;

    /* JADX INFO: renamed from: b */
    private AbstractC0039f m186b() {
        if (this.f184a == null) {
            this.f184a = new C0035b(this);
        }
        return this.f184a;
    }

    @Override // java.util.Map
    public Set entrySet() {
        return m186b().m208d();
    }

    @Override // java.util.Map
    public Set keySet() {
        return m186b().m209e();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        m219a(this.f212h + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection values() {
        return m186b().m210f();
    }
}
