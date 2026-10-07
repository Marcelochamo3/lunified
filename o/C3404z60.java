package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: o.z60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3404z60 extends AbstractC2506pt {
    public final Method m = Class.class.getMethod("isRecord", null);
    public final Method n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Method f1146o;
    public final Method p;

    public C3404z60() throws NoSuchMethodException {
        Method method = Class.class.getMethod("getRecordComponents", null);
        this.n = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.f1146o = componentType.getMethod("getName", null);
        this.p = componentType.getMethod("getType", null);
    }

    @Override // o.AbstractC2506pt
    public final Method r(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // o.AbstractC2506pt
    public final Constructor s(Class cls) {
        try {
            Object[] objArr = (Object[]) this.n.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.p.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // o.AbstractC2506pt
    public final String[] u(Class cls) {
        try {
            Object[] objArr = (Object[]) this.n.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f1146o.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // o.AbstractC2506pt
    public final boolean y(Class cls) {
        try {
            return ((Boolean) this.m.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }
}
