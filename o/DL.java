package o;

import j$.util.Objects;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;

/* JADX INFO: loaded from: classes.dex */
public abstract class DL {
    public static volatile int a;
    public static final C1797ie0 b = new C1797ie0(8);
    public static final C3325yL c = new C3325yL();
    public static final boolean d;
    public static final String[] e;
    public static final String f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        d = property == null ? false : property.equalsIgnoreCase("true");
        e = new String[]{"1.6", "1.7"};
        f = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    public static final void a() {
        LinkedHashSet linkedHashSetB;
        try {
            try {
                if (f()) {
                    linkedHashSetB = null;
                } else {
                    linkedHashSetB = b();
                    i(linkedHashSetB);
                }
                StaticLoggerBinder.getSingleton();
                a = 3;
                h(linkedHashSetB);
            } catch (Exception e2) {
                a = 2;
                Nr0.x(e2);
                throw new IllegalStateException("Unexpected initialization failure", e2);
            } catch (NoClassDefFoundError e3) {
                String message = e3.getMessage();
                if (message == null || (!message.contains("org/slf4j/impl/StaticLoggerBinder") && !message.contains("org.slf4j.impl.StaticLoggerBinder"))) {
                    a = 2;
                    Nr0.x(e3);
                    throw e3;
                }
                a = 4;
                Nr0.w();
                Nr0.w();
                Nr0.w();
            } catch (NoSuchMethodError e4) {
                String message2 = e4.getMessage();
                if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    a = 2;
                    Nr0.w();
                    Nr0.w();
                    Nr0.w();
                }
                throw e4;
            }
            g();
        } catch (Throwable th) {
            g();
            throw th;
        }
    }

    public static LinkedHashSet b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = DL.class.getClassLoader();
            String str = f;
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(str) : classLoader.getResources(str);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e2) {
            Nr0.x(e2);
        }
        return linkedHashSet;
    }

    public static ILoggerFactory c() {
        if (a == 0) {
            synchronized (DL.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        a();
                        if (a == 3) {
                            j();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = a;
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static CL d(Class cls) {
        int i;
        CL clE = e(cls.getName());
        if (d) {
            Ir0 ir0 = Nr0.a;
            Class cls2 = null;
            if (ir0 == null) {
                if (Nr0.b) {
                    ir0 = null;
                } else {
                    try {
                        ir0 = new Ir0();
                    } catch (SecurityException unused) {
                        ir0 = null;
                    }
                    Nr0.a = ir0;
                    Nr0.b = true;
                }
            }
            if (ir0 != null) {
                Class[] classContext = ir0.getClassContext();
                String name = Nr0.class.getName();
                int i2 = 0;
                while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
                    i2++;
                }
                if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                cls2 = classContext[i];
            }
            if (cls2 != null && (!cls2.isAssignableFrom(cls))) {
                Nr0.w();
                Nr0.w();
            }
        }
        return clE;
    }

    public static CL e(String str) {
        return c().b(str);
    }

    public static boolean f() {
        String property;
        try {
            property = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains("android");
    }

    public static void g() {
        C1797ie0 c1797ie0 = b;
        synchronized (c1797ie0) {
            try {
                c1797ie0.m = true;
                for (C2773sh0 c2773sh0 : new ArrayList(((HashMap) c1797ie0.n).values())) {
                    c2773sh0.m = e(c2773sh0.l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) b.f832o;
        linkedBlockingQueue.size();
        ArrayList<C2870th0> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (C2870th0 c2870th0 : arrayList) {
                if (c2870th0 != null) {
                    C2773sh0 c2773sh1 = c2870th0.a;
                    String str = c2773sh1.l;
                    if (c2773sh1.m == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(c2773sh1.m instanceof C1487fT)) {
                        if (!c2773sh1.b()) {
                            Nr0.w();
                        } else if (c2773sh1.b()) {
                            try {
                                c2773sh1.f1030o.invoke(c2773sh1.m, c2870th0);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (c2870th0.a.b()) {
                        Nr0.w();
                        Nr0.w();
                        Nr0.w();
                    } else if (!(c2870th0.a.m instanceof C1487fT)) {
                        Nr0.w();
                        Nr0.w();
                        Nr0.w();
                        Nr0.w();
                        Nr0.w();
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        C1797ie0 c1797ie1 = b;
        ((HashMap) c1797ie1.n).clear();
        ((LinkedBlockingQueue) c1797ie1.f832o).clear();
    }

    public static void h(LinkedHashSet linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.size() <= 1) {
            return;
        }
        StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr();
        Nr0.w();
    }

    public static void i(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            Nr0.w();
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                Objects.toString((URL) it.next());
                Nr0.w();
            }
            Nr0.w();
        }
    }

    public static final void j() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : e) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            Arrays.asList(e).toString();
            Nr0.w();
            Nr0.w();
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            Nr0.x(th);
        }
    }
}
