package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: renamed from: o.zi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3454zi0 {
    public static final C3325yL h = new C3325yL();
    public static final C3454zi0 i;
    public static final Logger j;
    public final L80 a;
    public boolean c;
    public long d;
    public int b = 10000;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final RunnableC3102w1 g = new RunnableC3102w1(24, this);

    static {
        String str = Mr0.g + " TaskRunner";
        AbstractC1474fG.j(str, "name");
        Fr0 fr0 = new Fr0(str, true);
        L80 l80 = new L80();
        l80.l = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), fr0);
        i = new C3454zi0(l80);
        Logger logger = Logger.getLogger(C3454zi0.class.getName());
        AbstractC1474fG.i(logger, "getLogger(TaskRunner::class.java.name)");
        j = logger;
    }

    public C3454zi0(L80 l80) {
        this.a = l80;
    }

    public static final void a(C3454zi0 c3454zi0, AbstractC3066vi0 abstractC3066vi0) {
        c3454zi0.getClass();
        byte[] bArr = Mr0.a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(abstractC3066vi0.a);
        try {
            long jA = abstractC3066vi0.a();
            synchronized (c3454zi0) {
                c3454zi0.b(abstractC3066vi0, jA);
            }
        } finally {
            synchronized (c3454zi0) {
                c3454zi0.b(abstractC3066vi0, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void b(AbstractC3066vi0 abstractC3066vi0, long j2) {
        byte[] bArr = Mr0.a;
        C3357yi0 c3357yi0 = abstractC3066vi0.c;
        AbstractC1474fG.g(c3357yi0);
        if (c3357yi0.d != abstractC3066vi0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z = c3357yi0.f;
        c3357yi0.f = false;
        c3357yi0.d = null;
        this.e.remove(c3357yi0);
        if (j2 != -1 && !z && !c3357yi0.c) {
            c3357yi0.e(abstractC3066vi0, j2, true);
        }
        if (!c3357yi0.e.isEmpty()) {
            this.f.add(c3357yi0);
        }
    }

    public final AbstractC3066vi0 c() {
        boolean z;
        byte[] bArr = Mr0.a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return null;
            }
            L80 l80 = this.a;
            l80.getClass();
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC3066vi0 abstractC3066vi0 = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                AbstractC3066vi0 abstractC3066vi1 = (AbstractC3066vi0) ((C3357yi0) it.next()).e.get(0);
                long jMax = Math.max(0L, abstractC3066vi1.d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC3066vi0 != null) {
                        z = true;
                        break;
                    }
                    abstractC3066vi0 = abstractC3066vi1;
                }
            }
            if (abstractC3066vi0 != null) {
                byte[] bArr2 = Mr0.a;
                abstractC3066vi0.d = -1L;
                C3357yi0 c3357yi0 = abstractC3066vi0.c;
                AbstractC1474fG.g(c3357yi0);
                c3357yi0.e.remove(abstractC3066vi0);
                arrayList.remove(c3357yi0);
                c3357yi0.d = abstractC3066vi0;
                this.e.add(c3357yi0);
                if (z || (!this.c && (!arrayList.isEmpty()))) {
                    RunnableC3102w1 runnableC3102w1 = this.g;
                    AbstractC1474fG.j(runnableC3102w1, "runnable");
                    ((ThreadPoolExecutor) l80.l).execute(runnableC3102w1);
                }
                return abstractC3066vi0;
            }
            if (this.c) {
                if (jMin < this.d - jNanoTime) {
                    notify();
                }
                return null;
            }
            this.c = true;
            this.d = jNanoTime + jMin;
            try {
                try {
                    long j2 = jMin / 1000000;
                    Long.signum(j2);
                    long j3 = jMin - (1000000 * j2);
                    if (j2 > 0 || jMin > 0) {
                        wait(j2, (int) j3);
                    }
                } catch (InterruptedException unused) {
                    d();
                }
                this.c = false;
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((C3357yi0) arrayList.get(size)).b();
            }
        }
        ArrayList arrayList2 = this.f;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            C3357yi0 c3357yi0 = (C3357yi0) arrayList2.get(size2);
            c3357yi0.b();
            if (c3357yi0.e.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
    }

    public final void e(C3357yi0 c3357yi0) {
        AbstractC1474fG.j(c3357yi0, "taskQueue");
        byte[] bArr = Mr0.a;
        if (c3357yi0.d == null) {
            boolean z = !c3357yi0.e.isEmpty();
            ArrayList arrayList = this.f;
            if (z) {
                AbstractC1474fG.j(arrayList, "<this>");
                if (!arrayList.contains(c3357yi0)) {
                    arrayList.add(c3357yi0);
                }
            } else {
                arrayList.remove(c3357yi0);
            }
        }
        boolean z2 = this.c;
        L80 l80 = this.a;
        if (z2) {
            l80.getClass();
            notify();
        } else {
            l80.getClass();
            RunnableC3102w1 runnableC3102w1 = this.g;
            AbstractC1474fG.j(runnableC3102w1, "runnable");
            ((ThreadPoolExecutor) l80.l).execute(runnableC3102w1);
        }
    }

    public final C3357yi0 f() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new C3357yi0(this, AbstractC1674hK.n(i2, "Q"));
    }
}
