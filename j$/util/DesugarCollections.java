package j$.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public class DesugarCollections {
    public static final Class a;
    private static final Field b;
    private static final Field c;
    private static final Constructor d;
    private static final Constructor e;

    static {
        Field declaredField;
        Field declaredField2;
        Constructor<?> declaredConstructor;
        Class<?> cls = Collections.synchronizedCollection(new ArrayList()).getClass();
        a = cls;
        Collections.synchronizedList(new LinkedList()).getClass();
        Constructor<?> declaredConstructor2 = null;
        try {
            declaredField = cls.getDeclaredField("mutex");
        } catch (NoSuchFieldException unused) {
            declaredField = null;
        }
        b = declaredField;
        if (declaredField != null) {
            declaredField.setAccessible(true);
        }
        try {
            declaredField2 = cls.getDeclaredField("c");
        } catch (NoSuchFieldException unused2) {
            declaredField2 = null;
        }
        c = declaredField2;
        if (declaredField2 != null) {
            declaredField2.setAccessible(true);
        }
        try {
            declaredConstructor = Collections.synchronizedSet(new HashSet()).getClass().getDeclaredConstructor(Set.class, Object.class);
        } catch (NoSuchMethodException unused3) {
            declaredConstructor = null;
        }
        e = declaredConstructor;
        if (declaredConstructor != null) {
            declaredConstructor.setAccessible(true);
        }
        try {
            declaredConstructor2 = cls.getDeclaredConstructor(Collection.class, Object.class);
        } catch (NoSuchMethodException unused4) {
        }
        d = declaredConstructor2;
        if (declaredConstructor2 != null) {
            declaredConstructor2.setAccessible(true);
        }
    }

    static boolean c(Collection collection, Predicate predicate) {
        boolean zRemoveIf;
        Field field = b;
        if (field == null) {
            try {
                return Collection$EL.removeIf((Collection) c.get(collection), predicate);
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e2);
            }
        }
        try {
            synchronized (field.get(collection)) {
                zRemoveIf = Collection$EL.removeIf((Collection) c.get(collection), predicate);
            }
            return zRemoveIf;
        } catch (IllegalAccessException e3) {
            throw new Error("Runtime illegal access in synchronized collection removeIf.", e3);
        }
    }

    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> map) {
        return new C0141g(map);
    }
}
