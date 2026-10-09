package com.google.android.gms.p013b;

import android.os.IBinder;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: com.google.android.gms.b.h */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0440h extends AbstractBinderC0438f {

    /* JADX INFO: renamed from: a */
    private final Object f1601a;

    private BinderC0440h(Object obj) {
        this.f1601a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC0437e m1829a(Object obj) {
        return new BinderC0440h(obj);
    }

    /* JADX INFO: renamed from: a */
    public static Object m1830a(InterfaceC0437e interfaceC0437e) {
        if (interfaceC0437e instanceof BinderC0440h) {
            return ((BinderC0440h) interfaceC0437e).f1601a;
        }
        IBinder iBinderAsBinder = interfaceC0437e.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        if (declaredFields.length != 1) {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        Field field = declaredFields[0];
        if (field.isAccessible()) {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
        } catch (NullPointerException e3) {
            throw new IllegalArgumentException("Binder object is null.", e3);
        }
    }
}
