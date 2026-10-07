package o;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: o.qx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2611qx {
    public static final Nd0 b = new Nd0();
    public final /* synthetic */ C3289xx a;

    public C2611qx(C3289xx c3289xx) {
        this.a = c3289xx;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        Nd0 nd0 = b;
        Nd0 nd1 = (Nd0) nd0.get(classLoader);
        if (nd1 == null) {
            nd1 = new Nd0();
            nd0.put(classLoader, nd1);
        }
        Class cls = (Class) nd1.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        nd1.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new C0730Rf(AbstractC1701hf0.u("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C0730Rf(AbstractC1701hf0.u("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final AbstractComponentCallbacksC1247cx a(String str) {
        try {
            return (AbstractComponentCallbacksC1247cx) c(this.a.v.p.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new C0730Rf(AbstractC1701hf0.u("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C0730Rf(AbstractC1701hf0.u("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C0730Rf(AbstractC1701hf0.u("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C0730Rf(AbstractC1701hf0.u("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
