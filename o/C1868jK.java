package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: o.jK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1868jK extends AbstractC1217ci implements InterfaceC1714hm {
    public static final AtomicIntegerFieldUpdater s = AtomicIntegerFieldUpdater.newUpdater(C1868jK.class, "runningWorkers");
    public final AbstractC1217ci n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f842o;
    public final /* synthetic */ InterfaceC1714hm p;
    public final C3034vL q;
    public final Object r;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public C1868jK(C3470zq0 c3470zq0, int i) {
        this.n = c3470zq0;
        this.f842o = i;
        InterfaceC1714hm interfaceC1714hm = c3470zq0 instanceof InterfaceC1714hm ? (InterfaceC1714hm) c3470zq0 : null;
        this.p = interfaceC1714hm == null ? AbstractC0528Jk.a : interfaceC1714hm;
        this.q = new C3034vL();
        this.r = new Object();
    }

    @Override // o.InterfaceC1714hm
    public final InterfaceC2300nn R(long j, Runnable runnable, InterfaceC1022ai interfaceC1022ai) {
        return this.p.R(j, runnable, interfaceC1022ai);
    }

    @Override // o.AbstractC1217ci
    public final void W(InterfaceC1022ai interfaceC1022ai, Runnable runnable) {
        Runnable runnableZ;
        this.q.a(runnable);
        if (s.get(this) >= this.f842o || !a0() || (runnableZ = Z()) == null) {
            return;
        }
        this.n.W(this, new RunnableC1938k1(this, 9, runnableZ));
    }

    @Override // o.AbstractC1217ci
    public final void X(InterfaceC1022ai interfaceC1022ai, Runnable runnable) {
        Runnable runnableZ;
        this.q.a(runnable);
        if (s.get(this) >= this.f842o || !a0() || (runnableZ = Z()) == null) {
            return;
        }
        this.n.X(this, new RunnableC1938k1(this, 9, runnableZ));
    }

    public final Runnable Z() {
        while (true) {
            Runnable runnable = (Runnable) this.q.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.r) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = s;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.q.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean a0() {
        synchronized (this.r) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = s;
            if (atomicIntegerFieldUpdater.get(this) >= this.f842o) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // o.InterfaceC1714hm
    public final void t(long j, C1692hb c1692hb) {
        this.p.t(j, c1692hb);
    }
}
