package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o.uq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2984uq implements InterfaceC0432Fs {
    public static final C0622Nb K = new C0622Nb(16);
    public boolean A;
    public M70 B;
    public int C;
    public boolean D;
    public C1762iA E;
    public boolean F;
    public C3372yq G;
    public RunnableC0501Ij H;
    public volatile boolean I;
    public boolean J;
    public final C2887tq l;
    public final C2965ug0 m;
    public final InterfaceC3275xq n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC1941k20 f1062o;
    public final C0622Nb p;
    public final InterfaceC3081vq q;
    public final ExecutorServiceC1956kA r;
    public final ExecutorServiceC1956kA s;
    public final ExecutorServiceC1956kA t;
    public final ExecutorServiceC1956kA u;
    public final AtomicInteger v;
    public InterfaceC2450pI w;
    public boolean x;
    public boolean y;
    public boolean z;

    public C2984uq(ExecutorServiceC1956kA executorServiceC1956kA, ExecutorServiceC1956kA executorServiceC1956kA2, ExecutorServiceC1956kA executorServiceC1956kA3, ExecutorServiceC1956kA executorServiceC1956kA4, InterfaceC3081vq interfaceC3081vq, InterfaceC3275xq interfaceC3275xq, Na0 na0) {
        C0622Nb c0622Nb = K;
        this.l = new C2887tq(new ArrayList(2));
        this.m = new C2965ug0();
        this.v = new AtomicInteger();
        this.r = executorServiceC1956kA;
        this.s = executorServiceC1956kA2;
        this.t = executorServiceC1956kA3;
        this.u = executorServiceC1956kA4;
        this.q = interfaceC3081vq;
        this.n = interfaceC3275xq;
        this.f1062o = na0;
        this.p = c0622Nb;
    }

    public final synchronized void a(P70 p70, Executor executor) {
        try {
            this.m.a();
            C2887tq c2887tq = this.l;
            c2887tq.getClass();
            c2887tq.l.add(new C2790sq(p70, executor));
            if (this.D) {
                e(1);
                executor.execute(new RunnableC2693rq(this, p70, 1));
            } else if (this.F) {
                e(1);
                executor.execute(new RunnableC2693rq(this, p70, 0));
            } else {
                AbstractC3045vW.h("Cannot add callbacks to a cancelled EngineJob", !this.I);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        if (f()) {
            return;
        }
        this.I = true;
        RunnableC0501Ij runnableC0501Ij = this.H;
        runnableC0501Ij.L = true;
        InterfaceC1805ij interfaceC1805ij = runnableC0501Ij.J;
        if (interfaceC1805ij != null) {
            interfaceC1805ij.cancel();
        }
        InterfaceC3081vq interfaceC3081vq = this.q;
        InterfaceC2450pI interfaceC2450pI = this.w;
        C2597qq c2597qq = (C2597qq) interfaceC3081vq;
        synchronized (c2597qq) {
            C2994uv c2994uv = c2597qq.a;
            c2994uv.getClass();
            HashMap map = (HashMap) (this.A ? c2994uv.n : c2994uv.m);
            if (equals(map.get(interfaceC2450pI))) {
                map.remove(interfaceC2450pI);
            }
        }
    }

    @Override // o.InterfaceC0432Fs
    public final C2965ug0 c() {
        return this.m;
    }

    public final void d() {
        C3372yq c3372yq;
        synchronized (this) {
            try {
                this.m.a();
                AbstractC3045vW.h("Not yet complete!", f());
                int iDecrementAndGet = this.v.decrementAndGet();
                AbstractC3045vW.h("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    c3372yq = this.G;
                    i();
                } else {
                    c3372yq = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c3372yq != null) {
            c3372yq.c();
        }
    }

    public final synchronized void e(int i) {
        C3372yq c3372yq;
        AbstractC3045vW.h("Not yet complete!", f());
        if (this.v.getAndAdd(i) == 0 && (c3372yq = this.G) != null) {
            c3372yq.a();
        }
    }

    public final boolean f() {
        return this.F || this.D || this.I;
    }

    public final void g() {
        synchronized (this) {
            try {
                this.m.a();
                if (this.I) {
                    i();
                    return;
                }
                if (this.l.l.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.F) {
                    throw new IllegalStateException("Already failed once");
                }
                this.F = true;
                InterfaceC2450pI interfaceC2450pI = this.w;
                C2887tq c2887tq = this.l;
                c2887tq.getClass();
                ArrayList<C2790sq> arrayList = new ArrayList(c2887tq.l);
                e(arrayList.size() + 1);
                ((C2597qq) this.q).d(this, interfaceC2450pI, null);
                for (C2790sq c2790sq : arrayList) {
                    c2790sq.b.execute(new RunnableC2693rq(this, c2790sq.a, 0));
                }
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this) {
            try {
                this.m.a();
                if (this.I) {
                    this.B.e();
                    i();
                    return;
                }
                if (this.l.l.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.D) {
                    throw new IllegalStateException("Already have resource");
                }
                C0622Nb c0622Nb = this.p;
                M70 m70 = this.B;
                boolean z = this.x;
                InterfaceC2450pI interfaceC2450pI = this.w;
                InterfaceC3275xq interfaceC3275xq = this.n;
                c0622Nb.getClass();
                this.G = new C3372yq(m70, z, true, interfaceC2450pI, interfaceC3275xq);
                this.D = true;
                C2887tq c2887tq = this.l;
                c2887tq.getClass();
                ArrayList<C2790sq> arrayList = new ArrayList(c2887tq.l);
                e(arrayList.size() + 1);
                ((C2597qq) this.q).d(this, this.w, this.G);
                for (C2790sq c2790sq : arrayList) {
                    c2790sq.b.execute(new RunnableC2693rq(this, c2790sq.a, 1));
                }
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void i() {
        if (this.w == null) {
            throw new IllegalArgumentException();
        }
        this.l.l.clear();
        this.w = null;
        this.G = null;
        this.B = null;
        this.F = false;
        this.I = false;
        this.D = false;
        this.J = false;
        this.H.m();
        this.H = null;
        this.E = null;
        this.C = 0;
        this.f1062o.e(this);
    }

    public final synchronized void j(P70 p70) {
        try {
            this.m.a();
            C2887tq c2887tq = this.l;
            c2887tq.l.remove(new C2790sq(p70, AbstractC0397Ej.h));
            if (this.l.l.isEmpty()) {
                b();
                if (this.D || this.F) {
                    if (this.v.get() == 0) {
                        i();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(RunnableC0501Ij runnableC0501Ij) {
        ExecutorServiceC1956kA executorServiceC1956kA;
        this.H = runnableC0501Ij;
        int i = runnableC0501Ij.i(1);
        if (i == 2 || i == 3) {
            executorServiceC1956kA = this.r;
        } else if (this.y) {
            executorServiceC1956kA = this.t;
        } else {
            executorServiceC1956kA = this.z ? this.u : this.s;
        }
        executorServiceC1956kA.execute(runnableC0501Ij);
    }
}
