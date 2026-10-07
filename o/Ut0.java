package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ut0 {
    public final Vt0 a = new Vt0();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        Vt0 vt0 = this.a;
        if (vt0 != null) {
            if (vt0.d) {
                Vt0.a(autoCloseable);
                return;
            }
            synchronized (vt0.a) {
                autoCloseable2 = (AutoCloseable) vt0.b.put(str, autoCloseable);
            }
            Vt0.a(autoCloseable2);
        }
    }

    public final void b() {
        Vt0 vt0 = this.a;
        if (vt0 != null && !vt0.d) {
            vt0.d = true;
            synchronized (vt0.a) {
                try {
                    Iterator it = vt0.b.values().iterator();
                    while (it.hasNext()) {
                        Vt0.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = vt0.c.iterator();
                    while (it2.hasNext()) {
                        Vt0.a((AutoCloseable) it2.next());
                    }
                    vt0.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        Vt0 vt0 = this.a;
        if (vt0 == null) {
            return null;
        }
        synchronized (vt0.a) {
            autoCloseable = (AutoCloseable) vt0.b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
