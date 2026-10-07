package o;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class FM {
    public static final EM a;

    static {
        String property;
        Object next;
        int i = Vh0.a;
        EM emB = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        List listQ = Vb0.Q(Vb0.G(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
        Iterator it = listQ.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iC = ((MainDispatcherFactory) next).c();
                do {
                    Object next2 = it.next();
                    int iC2 = ((MainDispatcherFactory) next2).c();
                    if (iC < iC2) {
                        next = next2;
                        iC = iC2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
        if (mainDispatcherFactory != null) {
            try {
                emB = mainDispatcherFactory.b(listQ);
            } catch (Throwable unused2) {
                mainDispatcherFactory.a();
            }
            if (emB != null) {
                a = emB;
                return;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
