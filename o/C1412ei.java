package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: o.ei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1412ei extends Thread {
    public static final AtomicIntegerFieldUpdater t = AtomicIntegerFieldUpdater.newUpdater(C1412ei.class, "workerCtl");
    private volatile int indexInArray;
    public final Sw0 l;
    public final IF m;
    public int n;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f760o;
    public long p;
    public int q;
    public boolean r;
    public final /* synthetic */ ExecutorC1510fi s;
    private volatile int workerCtl;

    public C1412ei(ExecutorC1510fi executorC1510fi, int i) {
        this.s = executorC1510fi;
        setDaemon(true);
        this.l = new Sw0();
        this.m = new IF();
        this.n = 4;
        this.nextParkedWorker = ExecutorC1510fi.v;
        AbstractC2045l50.l.getClass();
        this.q = AbstractC2045l50.m.b();
        f(i);
    }

    public final AbstractRunnableC3163wi0 a(boolean z) {
        AbstractRunnableC3163wi0 abstractRunnableC3163wi0E;
        AbstractRunnableC3163wi0 abstractRunnableC3163wi0E2;
        ExecutorC1510fi executorC1510fi;
        long j;
        int i = this.n;
        AbstractRunnableC3163wi0 abstractRunnableC3163wi0 = null;
        Sw0 sw0 = this.l;
        ExecutorC1510fi executorC1510fi2 = this.s;
        if (i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC1510fi.t;
            do {
                executorC1510fi = this.s;
                j = atomicLongFieldUpdater.get(executorC1510fi);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    sw0.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Sw0.b;
                        AbstractRunnableC3163wi0 abstractRunnableC3163wi1 = (AbstractRunnableC3163wi0) atomicReferenceFieldUpdater.get(sw0);
                        if (abstractRunnableC3163wi1 == null || abstractRunnableC3163wi1.m.l != 1) {
                            int i2 = Sw0.d.get(sw0);
                            int i3 = Sw0.c.get(sw0);
                            while (i2 != i3 && Sw0.e.get(sw0) != 0) {
                                i3--;
                                AbstractRunnableC3163wi0 abstractRunnableC3163wi0C = sw0.c(i3, true);
                                if (abstractRunnableC3163wi0C != null) {
                                    abstractRunnableC3163wi0 = abstractRunnableC3163wi0C;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(sw0, abstractRunnableC3163wi1, null)) {
                                abstractRunnableC3163wi0 = abstractRunnableC3163wi1;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(sw0) == abstractRunnableC3163wi1);
                    }
                    if (abstractRunnableC3163wi0 != null) {
                        return abstractRunnableC3163wi0;
                    }
                    AbstractRunnableC3163wi0 abstractRunnableC3163wi2 = (AbstractRunnableC3163wi0) executorC1510fi2.q.d();
                    return abstractRunnableC3163wi2 == null ? i(1) : abstractRunnableC3163wi2;
                }
            } while (!ExecutorC1510fi.t.compareAndSet(executorC1510fi, j, j - 4398046511104L));
            this.n = 1;
        }
        if (z) {
            boolean z2 = d(executorC1510fi2.l * 2) == 0;
            if (z2 && (abstractRunnableC3163wi0E2 = e()) != null) {
                return abstractRunnableC3163wi0E2;
            }
            sw0.getClass();
            AbstractRunnableC3163wi0 abstractRunnableC3163wi0B = (AbstractRunnableC3163wi0) Sw0.b.getAndSet(sw0, null);
            if (abstractRunnableC3163wi0B == null) {
                abstractRunnableC3163wi0B = sw0.b();
            }
            if (abstractRunnableC3163wi0B != null) {
                return abstractRunnableC3163wi0B;
            }
            if (!z2 && (abstractRunnableC3163wi0E = e()) != null) {
                return abstractRunnableC3163wi0E;
            }
        } else {
            AbstractRunnableC3163wi0 abstractRunnableC3163wi0E3 = e();
            if (abstractRunnableC3163wi0E3 != null) {
                return abstractRunnableC3163wi0E3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.q;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.q = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final AbstractRunnableC3163wi0 e() {
        int iD = d(2);
        ExecutorC1510fi executorC1510fi = this.s;
        if (iD == 0) {
            AbstractRunnableC3163wi0 abstractRunnableC3163wi0 = (AbstractRunnableC3163wi0) executorC1510fi.p.d();
            return abstractRunnableC3163wi0 != null ? abstractRunnableC3163wi0 : (AbstractRunnableC3163wi0) executorC1510fi.q.d();
        }
        AbstractRunnableC3163wi0 abstractRunnableC3163wi1 = (AbstractRunnableC3163wi0) executorC1510fi.q.d();
        return abstractRunnableC3163wi1 != null ? abstractRunnableC3163wi1 : (AbstractRunnableC3163wi0) executorC1510fi.p.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.s.f780o);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i) {
        int i2 = this.n;
        boolean z = i2 == 1;
        if (z) {
            ExecutorC1510fi.t.addAndGet(this.s, 4398046511104L);
        }
        if (i2 != i) {
            this.n = i;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00df A[SYNTHETIC] */
    public final AbstractRunnableC3163wi0 i(int i) {
        int i2;
        AbstractRunnableC3163wi0 abstractRunnableC3163wi0C;
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC1510fi.t;
        ExecutorC1510fi executorC1510fi = this.s;
        int i3 = (int) (atomicLongFieldUpdater.get(executorC1510fi) & 2097151);
        AbstractRunnableC3163wi0 abstractRunnableC3163wi0 = null;
        if (i3 < 2) {
            return null;
        }
        int iD = d(i3);
        int i4 = 0;
        long jMin = Long.MAX_VALUE;
        while (i4 < i3) {
            int i5 = iD + 1;
            if (i5 > i3) {
                i5 = 1;
            }
            C1412ei c1412ei = (C1412ei) executorC1510fi.r.b(i5);
            if (c1412ei == null || c1412ei == this) {
                i2 = i5;
            } else {
                Sw0 sw0 = c1412ei.l;
                if (i != 3) {
                    sw0.getClass();
                    int i6 = Sw0.d.get(sw0);
                    int i7 = Sw0.c.get(sw0);
                    boolean z = i == 1;
                    while (true) {
                        if (i6 != i7 && (!z || Sw0.e.get(sw0) != 0)) {
                            int i8 = i6 + 1;
                            abstractRunnableC3163wi0C = sw0.c(i6, z);
                            if (abstractRunnableC3163wi0C != null) {
                                break;
                            }
                            i6 = i8;
                        } else {
                            abstractRunnableC3163wi0C = abstractRunnableC3163wi0;
                            break;
                        }
                    }
                } else {
                    abstractRunnableC3163wi0C = sw0.b();
                }
                IF r13 = this.m;
                if (abstractRunnableC3163wi0C != null) {
                    r13.m = abstractRunnableC3163wi0C;
                    i2 = i5;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Sw0.b;
                        AbstractRunnableC3163wi0 abstractRunnableC3163wi1 = (AbstractRunnableC3163wi0) atomicReferenceFieldUpdater.get(sw0);
                        if (abstractRunnableC3163wi1 != null) {
                            if (((abstractRunnableC3163wi1.m.l == 1 ? 1 : 2) & i) != 0) {
                                Bi0.f.getClass();
                                i2 = i5;
                                long jNanoTime = System.nanoTime() - abstractRunnableC3163wi1.l;
                                long j2 = Bi0.b;
                                if (jNanoTime < j2) {
                                    j = j2 - jNanoTime;
                                    abstractRunnableC3163wi0 = null;
                                    break;
                                }
                                while (true) {
                                    abstractRunnableC3163wi0 = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(sw0, abstractRunnableC3163wi1, null)) {
                                        r13.m = abstractRunnableC3163wi1;
                                    } else if (atomicReferenceFieldUpdater.get(sw0) != abstractRunnableC3163wi1) {
                                        i5 = i2;
                                        abstractRunnableC3163wi0 = null;
                                    }
                                }
                            }
                        }
                        i2 = i5;
                        j = -2;
                        break;
                    }
                    if (j == -1) {
                        AbstractRunnableC3163wi0 abstractRunnableC3163wi2 = (AbstractRunnableC3163wi0) r13.m;
                        r13.m = abstractRunnableC3163wi0;
                        return abstractRunnableC3163wi2;
                    }
                    if (j > 0) {
                        jMin = Math.min(jMin, j);
                    }
                }
                j = -1;
                if (j == -1) {
                    AbstractRunnableC3163wi0 abstractRunnableC3163wi3 = (AbstractRunnableC3163wi0) r13.m;
                    r13.m = abstractRunnableC3163wi0;
                    return abstractRunnableC3163wi3;
                }
                if (j > 0) {
                    jMin = Math.min(jMin, j);
                }
            }
            i4++;
            iD = i2;
            abstractRunnableC3163wi0 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.p = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        int i;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                ExecutorC1510fi executorC1510fi = this.s;
                executorC1510fi.getClass();
                int i2 = 5;
                if (ExecutorC1510fi.u.get(executorC1510fi) != 0 || this.n == 5) {
                    break loop0;
                }
                AbstractRunnableC3163wi0 abstractRunnableC3163wi0A = a(this.r);
                int i3 = 3;
                if (abstractRunnableC3163wi0A == null) {
                    this.r = false;
                    if (this.p == 0) {
                        Object obj = this.nextParkedWorker;
                        J2 j2 = ExecutorC1510fi.v;
                        if (obj != j2) {
                            t.set(this, -1);
                            while (this.nextParkedWorker != ExecutorC1510fi.v) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = t;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                ExecutorC1510fi executorC1510fi2 = this.s;
                                executorC1510fi2.getClass();
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC1510fi.u;
                                if (atomicIntegerFieldUpdater2.get(executorC1510fi2) != 0 || this.n == i2) {
                                    break;
                                }
                                h(i3);
                                Thread.interrupted();
                                if (this.f760o == 0) {
                                    this.f760o = System.nanoTime() + this.s.n;
                                }
                                LockSupport.parkNanos(this.s.n);
                                if (System.nanoTime() - this.f760o >= 0) {
                                    this.f760o = 0L;
                                    ExecutorC1510fi executorC1510fi3 = this.s;
                                    synchronized (executorC1510fi3.r) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(executorC1510fi3) != 0)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC1510fi.t;
                                                if (((int) (atomicLongFieldUpdater2.get(executorC1510fi3) & 2097151)) > executorC1510fi3.l) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i4 = this.indexInArray;
                                                        f(0);
                                                        executorC1510fi3.l(this, i4, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(executorC1510fi3) & 2097151);
                                                        if (andDecrement != i4) {
                                                            Object objB = executorC1510fi3.r.b(andDecrement);
                                                            AbstractC1474fG.g(objB);
                                                            C1412ei c1412ei = (C1412ei) objB;
                                                            executorC1510fi3.r.c(i4, c1412ei);
                                                            c1412ei.f(i4);
                                                            executorC1510fi3.l(c1412ei, andDecrement, i4);
                                                        }
                                                        executorC1510fi3.r.c(andDecrement, null);
                                                        this.n = 5;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                                i2 = 5;
                                i3 = 3;
                            }
                        } else {
                            ExecutorC1510fi executorC1510fi4 = this.s;
                            executorC1510fi4.getClass();
                            if (this.nextParkedWorker == j2) {
                                do {
                                    atomicLongFieldUpdater = ExecutorC1510fi.s;
                                    j = atomicLongFieldUpdater.get(executorC1510fi4);
                                    i = this.indexInArray;
                                    this.nextParkedWorker = executorC1510fi4.r.b((int) (j & 2097151));
                                } while (!atomicLongFieldUpdater.compareAndSet(executorC1510fi4, j, ((j + 2097152) & (-2097152)) | ((long) i)));
                            }
                        }
                    } else {
                        if (z) {
                            h(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.p);
                            this.p = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    this.p = 0L;
                    int i5 = abstractRunnableC3163wi0A.m.l;
                    this.f760o = 0L;
                    if (this.n == 3) {
                        this.n = 2;
                    }
                    ExecutorC1510fi executorC1510fi5 = this.s;
                    if (i5 != 0 && h(2) && !executorC1510fi5.q() && !executorC1510fi5.p(ExecutorC1510fi.t.get(executorC1510fi5))) {
                        executorC1510fi5.q();
                    }
                    executorC1510fi5.getClass();
                    try {
                        abstractRunnableC3163wi0A.run();
                    } catch (Throwable th2) {
                        Thread threadCurrentThread = Thread.currentThread();
                        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                    }
                    if (i5 != 0) {
                        ExecutorC1510fi.t.addAndGet(executorC1510fi5, -2097152L);
                        if (this.n == 5) {
                            break;
                        }
                        this.n = 4;
                        break;
                    }
                    break;
                }
            }
        }
        h(5);
    }
}
