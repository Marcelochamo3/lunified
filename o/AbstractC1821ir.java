package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: o.ir, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1821ir extends AbstractC1918jr implements InterfaceC1714hm {
    public static final AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(AbstractC1821ir.class, Object.class, "_queue");
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(AbstractC1821ir.class, Object.class, "_delayed");
    public static final AtomicIntegerFieldUpdater t = AtomicIntegerFieldUpdater.newUpdater(AbstractC1821ir.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    public InterfaceC2300nn R(long j, Runnable runnable, InterfaceC1022ai interfaceC1022ai) {
        return AbstractC0528Jk.a.R(j, runnable, interfaceC1022ai);
    }

    @Override // o.AbstractC1217ci
    public final void W(InterfaceC1022ai interfaceC1022ai, Runnable runnable) {
        h0(runnable);
    }

    @Override // o.AbstractC1918jr
    public final long e0() {
        C1724hr c1724hr;
        AbstractRunnableC1626gr abstractRunnableC1626grB;
        AbstractRunnableC1626gr abstractRunnableC1626grD;
        if (f0()) {
            return 0L;
        }
        C1724hr c1724hr2 = (C1724hr) s.get(this);
        Runnable runnable = null;
        if (c1724hr2 != null && C1513fj0.b.get(c1724hr2) != 0) {
            long jNanoTime = System.nanoTime();
            do {
                synchronized (c1724hr2) {
                    try {
                        AbstractRunnableC1626gr[] abstractRunnableC1626grArr = c1724hr2.a;
                        AbstractRunnableC1626gr abstractRunnableC1626gr = abstractRunnableC1626grArr != null ? abstractRunnableC1626grArr[0] : null;
                        if (abstractRunnableC1626gr == null) {
                            abstractRunnableC1626grD = null;
                        } else {
                            abstractRunnableC1626grD = ((jNanoTime - abstractRunnableC1626gr.l) > 0L ? 1 : ((jNanoTime - abstractRunnableC1626gr.l) == 0L ? 0 : -1)) >= 0 ? i0(abstractRunnableC1626gr) : false ? c1724hr2.d(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (abstractRunnableC1626grD != null);
        }
        loop1: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                break;
            }
            if (obj instanceof C3228xL) {
                C3228xL c3228xL = (C3228xL) obj;
                Object objD = c3228xL.d();
                if (objD != C3228xL.g) {
                    runnable = (Runnable) objD;
                    break;
                }
                C3228xL c3228xLC = c3228xL.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3228xLC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else {
                if (obj == U9.d) {
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        runnable = (Runnable) obj;
                        break loop1;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        M5 m5 = this.p;
        if (((m5 == null || m5.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = r.get(this);
        if (obj2 == null) {
            c1724hr = (C1724hr) s.get(this);
            if (c1724hr != null && (abstractRunnableC1626grB = c1724hr.b()) != null) {
                return U9.f(abstractRunnableC1626grB.l - System.nanoTime(), 0L);
            }
        } else if (obj2 instanceof C3228xL) {
            long j = C3228xL.f.get((C3228xL) obj2);
            if (!(((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30)))) {
                return 0L;
            }
            c1724hr = (C1724hr) s.get(this);
            if (c1724hr != null) {
                return U9.f(abstractRunnableC1626grB.l - System.nanoTime(), 0L);
            }
        } else if (obj2 != U9.d) {
            return 0L;
        }
        return Long.MAX_VALUE;
    }

    public void h0(Runnable runnable) {
        if (!i0(runnable)) {
            RunnableC0502Ik.u.h0(runnable);
            return;
        }
        Thread threadB0 = b0();
        if (Thread.currentThread() != threadB0) {
            LockSupport.unpark(threadB0);
        }
    }

    public final boolean i0(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (t.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof C3228xL)) {
                if (obj == U9.d) {
                    return false;
                }
                C3228xL c3228xL = new C3228xL(8, true);
                c3228xL.a((Runnable) obj);
                c3228xL.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3228xL)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            C3228xL c3228xL2 = (C3228xL) obj;
            int iA = c3228xL2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                C3228xL c3228xLC = c3228xL2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3228xLC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final boolean j0() {
        M5 m5 = this.p;
        if (!(m5 != null ? m5.isEmpty() : true)) {
            return false;
        }
        C1724hr c1724hr = (C1724hr) s.get(this);
        if (c1724hr != null && C1513fj0.b.get(c1724hr) != 0) {
            return false;
        }
        Object obj = r.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof C3228xL) {
            long j = C3228xL.f.get((C3228xL) obj);
            if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == U9.d) {
            return true;
        }
        return false;
    }

    public final void k0(long j, AbstractRunnableC1626gr abstractRunnableC1626gr) {
        int iB;
        Thread threadB0;
        boolean z = t.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
        if (z) {
            iB = 1;
        } else {
            C1724hr c1724hr = (C1724hr) atomicReferenceFieldUpdater.get(this);
            if (c1724hr == null) {
                C1724hr c1724hr2 = new C1724hr();
                c1724hr2.c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c1724hr2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                AbstractC1474fG.g(obj);
                c1724hr = (C1724hr) obj;
            }
            iB = abstractRunnableC1626gr.b(j, c1724hr, this);
        }
        if (iB != 0) {
            if (iB == 1) {
                g0(j, abstractRunnableC1626gr);
                return;
            } else {
                if (iB != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        C1724hr c1724hr3 = (C1724hr) atomicReferenceFieldUpdater.get(this);
        if ((c1724hr3 != null ? c1724hr3.b() : null) != abstractRunnableC1626gr || Thread.currentThread() == (threadB0 = b0())) {
            return;
        }
        LockSupport.unpark(threadB0);
    }

    @Override // o.AbstractC1918jr
    public void shutdown() {
        AbstractRunnableC1626gr abstractRunnableC1626grD;
        ThreadLocal threadLocal = AbstractC1415ej0.a;
        AbstractC1415ej0.a.set(null);
        t.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
            Object obj = atomicReferenceFieldUpdater.get(this);
            J2 j2 = U9.d;
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, j2)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof C3228xL) {
                ((C3228xL) obj).b();
                break;
            } else {
                if (obj == j2) {
                    break;
                }
                C3228xL c3228xL = new C3228xL(8, true);
                c3228xL.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c3228xL)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (e0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C1724hr c1724hr = (C1724hr) s.get(this);
            if (c1724hr == null) {
                return;
            }
            synchronized (c1724hr) {
                abstractRunnableC1626grD = C1513fj0.b.get(c1724hr) > 0 ? c1724hr.d(0) : null;
            }
            if (abstractRunnableC1626grD == null) {
                return;
            } else {
                g0(jNanoTime, abstractRunnableC1626grD);
            }
        }
    }

    @Override // o.InterfaceC1714hm
    public final void t(long j, C1692hb c1692hb) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C1430er c1430er = new C1430er(this, j2 + jNanoTime, c1692hb);
            k0(jNanoTime, c1430er);
            c1692hb.A(new C1203cb(1, c1430er));
        }
    }
}
