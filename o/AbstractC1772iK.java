package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: o.iK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1772iK {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static void a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            AbstractC1474fG.i(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            AbstractC1674hK.v(objNewInstance);
            throw null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0118  */
    /* JADX WARN: Code duplicated, block: B:67:0x0124  */
    /* JADX WARN: Code duplicated, block: B:70:0x0128  */
    /* JADX WARN: Code duplicated, block: B:73:0x0134 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0136  */
    /* JADX WARN: Code duplicated, block: B:78:0x014b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static int b(Class cls) {
        Constructor declaredConstructor;
        boolean zBooleanValue;
        Class<?>[] interfaces;
        int i;
        boolean z;
        int i2 = 1;
        HashMap map = a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                AbstractC1474fG.i(name, "fullPackage");
                if (name.length() != 0) {
                    AbstractC1474fG.i(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    AbstractC1474fG.i(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                AbstractC1474fG.i(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String strConcat = AbstractC1899jh0.R(canonicalName, ".", "_", false).concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap map2 = b;
            if (declaredConstructor != null) {
                map2.put(cls, AbstractC2506pt.A(declaredConstructor));
            } else {
                C3154we c3154we = C3154we.c;
                HashMap map3 = c3154we.b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((InterfaceC2173mW) declaredMethods[i3].getAnnotation(InterfaceC2173mW.class)) != null) {
                                c3154we.a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i3++;
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC1185cK.class.isAssignableFrom(superclass)) {
                        AbstractC1474fG.i(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            AbstractC1474fG.g(obj);
                            arrayList = new ArrayList((Collection) obj);
                            interfaces = cls.getInterfaces();
                            AbstractC1474fG.i(interfaces, "klass.interfaces");
                            for (Class<?> cls2 : interfaces) {
                                if (cls2 == null && InterfaceC1185cK.class.isAssignableFrom(cls2)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    AbstractC1474fG.i(cls2, "intrface");
                                    if (b(cls2) == 1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        AbstractC1474fG.g(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        AbstractC1474fG.i(interfaces, "klass.interfaces");
                        while (i < r8) {
                            if (cls2 == null) {
                                z = false;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                AbstractC1474fG.i(cls2, "intrface");
                                if (b(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj3 = map2.get(cls2);
                                    AbstractC1474fG.g(obj3);
                                    arrayList.addAll((Collection) obj3);
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i2 = 2;
        }
        map.put(cls, Integer.valueOf(i2));
        return i2;
    }
}
