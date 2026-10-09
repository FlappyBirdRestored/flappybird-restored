package com.google.ads.p004b;

import com.google.ads.util.C0364g;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.ads.b.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0294g {
    /* JADX INFO: renamed from: a */
    protected void m1248a() {
    }

    /* JADX INFO: renamed from: a */
    public void m1249a(Map map) throws C0295h {
        String str;
        HashMap map2 = new HashMap();
        for (Field field : getClass().getFields()) {
            InterfaceC0296i interfaceC0296i = (InterfaceC0296i) field.getAnnotation(InterfaceC0296i.class);
            if (interfaceC0296i != null) {
                map2.put(interfaceC0296i.m1250a(), field);
            }
        }
        if (map2.isEmpty()) {
            C0364g.m1401e("No server options fields detected.  To suppress this message either add a field with the @Parameter annotation, or override the load() method");
        }
        for (Map.Entry entry : map.entrySet()) {
            Field field2 = (Field) map2.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException e) {
                    C0364g.m1395b("Server Option '" + ((String) entry.getKey()) + "' could not be set: Illegal Access");
                } catch (IllegalArgumentException e2) {
                    C0364g.m1395b("Server Option '" + ((String) entry.getKey()) + "' could not be set: Bad Type");
                }
            } else {
                C0364g.m1401e("Unexpected Server Option: " + ((String) entry.getKey()) + " = '" + ((String) entry.getValue()) + "'");
            }
        }
        String str2 = null;
        for (Field field3 : map2.values()) {
            if (((InterfaceC0296i) field3.getAnnotation(InterfaceC0296i.class)).m1251b()) {
                C0364g.m1395b("Required Server Option missing: " + ((InterfaceC0296i) field3.getAnnotation(InterfaceC0296i.class)).m1250a());
                str = (str2 == null ? "" : str2 + ", ") + ((InterfaceC0296i) field3.getAnnotation(InterfaceC0296i.class)).m1250a();
            } else {
                str = str2;
            }
            str2 = str;
        }
        if (str2 != null) {
            throw new C0295h("Required Server Option(s) missing: " + str2);
        }
        m1248a();
    }
}
