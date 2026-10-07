package o;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class YY {
    public static final Method a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC1474fG.g(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (AbstractC1474fG.b(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC1474fG.i(parameterTypes, "getParameterTypes(...)");
                if (AbstractC1474fG.b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !AbstractC1474fG.b(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
