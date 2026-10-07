package o;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class M90 {
    public static final List a = AbstractC0937Ze.K(Application.class, E90.class);
    public static final List b = AbstractC2506pt.A(E90.class);

    public static final Constructor a(Class cls, List list) {
        AbstractC1474fG.j(cls, "modelClass");
        AbstractC1474fG.j(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        AbstractC1474fG.i(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC1474fG.i(parameterTypes, "constructor.parameterTypes");
            List listY = X5.Y(parameterTypes);
            if (AbstractC1474fG.b(list, listY)) {
                return constructor;
            }
            if (list.size() == listY.size() && listY.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final Ut0 b(Class cls, Constructor constructor, Object... objArr) {
        AbstractC1474fG.j(cls, "modelClass");
        try {
            return (Ut0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
