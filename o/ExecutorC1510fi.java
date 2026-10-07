package o;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: o.fi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1510fi implements Executor, Closeable {
    public static final AtomicLongFieldUpdater s = AtomicLongFieldUpdater.newUpdater(ExecutorC1510fi.class, "parkedWorkersStack");
    public static final AtomicLongFieldUpdater t = AtomicLongFieldUpdater.newUpdater(ExecutorC1510fi.class, "controlState");
    public static final AtomicIntegerFieldUpdater u = AtomicIntegerFieldUpdater.newUpdater(ExecutorC1510fi.class, "_isTerminated");
    public static final J2 v = new J2(10, "NOT_IN_STACK", false);
    private volatile int _isTerminated;
    private volatile long controlState;
    public final int l;
    public final int m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f780o;
    public final C2248nA p;
    private volatile long parkedWorkersStack;
    public final C2248nA q;
    public final C70 r;

    public ExecutorC1510fi(int i, int i2, long j, String str) {
        this.l = i;
        this.m = i2;
        this.n = j;
        this.f780o = str;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC1674hK.p("Core pool size ", i, " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC1674hK.m(i2, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(AbstractC1674hK.p("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.p = new C2248nA();
        this.q = new C2248nA();
        this.r = new C70((i + 1) * 2);
        this.controlState = ((long) i) << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void i(ExecutorC1510fi executorC1510fi, Runnable runnable, boolean z, int i) {
        C2102ll c2102ll = Bi0.g;
        if ((i & 4) != 0) {
            z = false;
        }
        executorC1510fi.f(runnable, c2102ll, z);
    }

    public final int a() {
        synchronized (this.r) {
            try {
                if (u.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = t;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.l) {
                    return 0;
                }
                if (i >= this.m) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.r.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                C1412ei c1412ei = new C1412ei(this, i3);
                this.r.c(i3, c1412ei);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i4 = i2 + 1;
                c1412ei.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        AbstractRunnableC3163wi0 abstractRunnableC3163wi0A;
        if (u.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C1412ei c1412ei = threadCurrentThread instanceof C1412ei ? (C1412ei) threadCurrentThread : null;
            if (c1412ei == null || !AbstractC1474fG.b(c1412ei.s, this)) {
                c1412ei = null;
            }
            synchronized (this.r) {
                i = (int) (t.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objB = this.r.b(i2);
                    AbstractC1474fG.g(objB);
                    C1412ei c1412ei2 = (C1412ei) objB;
                    if (c1412ei2 != c1412ei) {
                        while (c1412ei2.isAlive()) {
                            LockSupport.unpark(c1412ei2);
                            c1412ei2.join(10000L);
                        }
                        Sw0 sw0 = c1412ei2.l;
                        C2248nA c2248nA = this.q;
                        sw0.getClass();
                        AbstractRunnableC3163wi0 abstractRunnableC3163wi0 = (AbstractRunnableC3163wi0) Sw0.b.getAndSet(sw0, null);
                        if (abstractRunnableC3163wi0 != null) {
                            c2248nA.a(abstractRunnableC3163wi0);
                        }
                        while (true) {
                            AbstractRunnableC3163wi0 abstractRunnableC3163wi0B = sw0.b();
                            if (abstractRunnableC3163wi0B == null) {
                                break;
                            } else {
                                c2248nA.a(abstractRunnableC3163wi0B);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.q.b();
            this.p.b();
            while (true) {
                if (c1412ei != null) {
                    abstractRunnableC3163wi0A = c1412ei.a(true);
                    if (abstractRunnableC3163wi0A == null) {
                        abstractRunnableC3163wi0A = (AbstractRunnableC3163wi0) this.p.d();
                        if (abstractRunnableC3163wi0A == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    abstractRunnableC3163wi0A = (AbstractRunnableC3163wi0) this.p.d();
                    if (abstractRunnableC3163wi0A == null && (abstractRunnableC3163wi0A = (AbstractRunnableC3163wi0) this.q.d()) == null) {
                        break;
                    }
                }
                try {
                    abstractRunnableC3163wi0A.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c1412ei != null) {
                c1412ei.h(5);
            }
            s.set(this, 0L);
            t.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i(this, runnable, false, 6);
    }

    public final void f(Runnable runnable, C2102ll c2102ll, boolean z) {
        AbstractRunnableC3163wi0 c3260xi0;
        int i;
        Bi0.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC3163wi0) {
            c3260xi0 = (AbstractRunnableC3163wi0) runnable;
            c3260xi0.l = jNanoTime;
            c3260xi0.m = c2102ll;
        } else {
            c3260xi0 = new C3260xi0(runnable, jNanoTime, c2102ll);
        }
        boolean z2 = false;
        boolean z3 = c3260xi0.m.l == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = t;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C1412ei c1412ei = threadCurrentThread instanceof C1412ei ? (C1412ei) threadCurrentThread : null;
        if (c1412ei == null || !AbstractC1474fG.b(c1412ei.s, this)) {
            c1412ei = null;
        }
        if (c1412ei != null && (i = c1412ei.n) != 5 && (c3260xi0.m.l != 0 || i != 2)) {
            c1412ei.r = true;
            Sw0 sw0 = c1412ei.l;
            if (z) {
                c3260xi0 = sw0.a(c3260xi0);
            } else {
                sw0.getClass();
                AbstractRunnableC3163wi0 abstractRunnableC3163wi0 = (AbstractRunnableC3163wi0) Sw0.b.getAndSet(sw0, c3260xi0);
                c3260xi0 = abstractRunnableC3163wi0 == null ? null : sw0.a(abstractRunnableC3163wi0);
            }
        }
        if (c3260xi0 != null) {
            if (!(c3260xi0.m.l == 1 ? this.q.a(c3260xi0) : this.p.a(c3260xi0))) {
                throw new RejectedExecutionException(AbstractC1701hf0.h(new StringBuilder(), this.f780o, " was terminated"));
            }
        }
        if (z && c1412ei != null) {
            z2 = true;
        }
        if (z3) {
            if (z2 || q() || p(jAddAndGet)) {
                return;
            }
            q();
            return;
        }
        if (z2 || q() || p(atomicLongFieldUpdater.get(this))) {
            return;
        }
        q();
    }

    public final void l(C1412ei c1412ei, int i, int i2) {
        while (true) {
            long j = s.get(this);
            int iB = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (iB == i) {
                if (i2 == 0) {
                    Object objC = c1412ei.c();
                    while (true) {
                        if (objC == v) {
                            iB = -1;
                            break;
                        }
                        if (objC == null) {
                            iB = 0;
                            break;
                        }
                        C1412ei c1412ei2 = (C1412ei) objC;
                        iB = c1412ei2.b();
                        if (iB != 0) {
                            break;
                        } else {
                            objC = c1412ei2.c();
                        }
                    }
                } else {
                    iB = i2;
                }
            }
            if (iB >= 0) {
                if (s.compareAndSet(this, j, j2 | ((long) iB))) {
                    return;
                }
            }
        }
    }

    public final boolean p(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.l;
        if (i < i2) {
            int iA = a();
            if (iA == 1 && i2 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        J2 j2;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = s;
            long j = atomicLongFieldUpdater.get(this);
            C1412ei c1412ei = (C1412ei) this.r.b((int) (2097151 & j));
            if (c1412ei == null) {
                c1412ei = null;
            } else {
                long j3 = (2097152 + j) & (-2097152);
                Object objC = c1412ei.c();
                while (true) {
                    j2 = v;
                    if (objC == j2) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    C1412ei c1412ei2 = (C1412ei) objC;
                    iB = c1412ei2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = c1412ei2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j, j3 | ((long) iB))) {
                    c1412ei.g(j2);
                }
            }
            if (c1412ei == null) {
                return false;
            }
            if (C1412ei.t.compareAndSet(c1412ei, -1, 0)) {
                LockSupport.unpark(c1412ei);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C70 c70 = this.r;
        int iA = c70.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            C1412ei c1412ei = (C1412ei) c70.b(i6);
            if (c1412ei != null) {
                Sw0 sw0 = c1412ei.l;
                sw0.getClass();
                int i7 = Sw0.b.get(sw0) != null ? (Sw0.c.get(sw0) - Sw0.d.get(sw0)) + 1 : Sw0.c.get(sw0) - Sw0.d.get(sw0);
                int iW = AbstractC1701hf0.w(c1412ei.n);
                if (iW == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iW == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iW == 2) {
                    i3++;
                } else if (iW == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iW == 4) {
                    i5++;
                }
            }
        }
        long j = t.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f780o);
        sb4.append('@');
        sb4.append(AbstractC0397Ej.r(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.l;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.m);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.p.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.q.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
