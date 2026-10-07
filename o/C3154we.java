package o;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: o.we, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3154we {
    public static final C3154we c = new C3154we();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, C3057ve c3057ve, SJ sj, Class cls) {
        SJ sj2 = (SJ) map.get(c3057ve);
        if (sj2 == null || sj == sj2) {
            if (sj2 == null) {
                map.put(c3057ve, sj);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c3057ve.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + sj2 + ", new value " + sj);
    }

    public final C2960ue a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            C2960ue c2960ueA = (C2960ue) map2.get(superclass);
            if (c2960ueA == null) {
                c2960ueA = a(superclass, null);
            }
            map.putAll(c2960ueA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C2960ue c2960ueA2 = (C2960ue) map2.get(cls2);
            if (c2960ueA2 == null) {
                c2960ueA2 = a(cls2, null);
            }
            for (Map.Entry entry : c2960ueA2.b.entrySet()) {
                b(map, (C3057ve) entry.getKey(), (SJ) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC2173mW interfaceC2173mW = (InterfaceC2173mW) method.getAnnotation(InterfaceC2173mW.class);
            if (interfaceC2173mW != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC1283dK.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                SJ sjValue = interfaceC2173mW.value();
                if (parameterTypes.length > 1) {
                    if (!SJ.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (sjValue != SJ.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C3057ve(method, i), sjValue, cls);
                z = true;
            }
        }
        C2960ue c2960ue = new C2960ue(map);
        map2.put(cls, c2960ue);
        this.b.put(cls, Boolean.valueOf(z));
        return c2960ue;
    }
}
