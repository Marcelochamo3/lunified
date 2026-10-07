package io.sentry;

import io.sentry.protocol.C0076c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class Q1 implements W {
    public final T1 b;
    public final K d;
    public final String e;
    public volatile O1 g;
    public volatile O1 h;
    public volatile Timer i;
    public final Object j;
    public final AtomicBoolean k;
    public final AtomicBoolean l;
    public final C0032c m;
    public final io.sentry.protocol.C n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Z f52o;
    public final C0076c p;
    public final h2 q;
    public final g2 r;
    public final io.sentry.protocol.t a = new io.sentry.protocol.t((UUID) null);
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public P1 f = P1.c;

    public Q1(f2 f2Var, K k, g2 g2Var, h2 h2Var) {
        this.i = null;
        Object obj = new Object();
        this.j = obj;
        this.k = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.l = atomicBoolean;
        this.p = new C0076c();
        io.sentry.config.a.C(k, "hub is required");
        this.b = new T1(f2Var, this, k, g2Var.b, g2Var);
        this.e = f2Var.v;
        this.f52o = f2Var.z;
        this.d = k;
        this.q = h2Var;
        this.n = f2Var.w;
        this.r = g2Var;
        C0032c c0032c = f2Var.y;
        if (c0032c != null) {
            this.m = c0032c;
        } else {
            this.m = new C0032c(k.t().getLogger());
        }
        if (h2Var != null) {
            h2Var.m(this);
        }
        if (g2Var.e == null && g2Var.f == null) {
            return;
        }
        boolean z = true;
        this.i = new Timer(true);
        Long l = g2Var.f;
        if (l != null) {
            synchronized (obj) {
                try {
                    if (this.i != null) {
                        u();
                        atomicBoolean.set(true);
                        this.h = new O1(this, 1);
                        try {
                            this.i.schedule(this.h, l.longValue());
                        } catch (Throwable th) {
                            this.d.t().getLogger().v(EnumC0094u1.WARNING, "Failed to schedule finish timer", th);
                            Y1 y1M = m();
                            if (y1M == null) {
                                y1M = Y1.DEADLINE_EXCEEDED;
                            }
                            if (this.r.e == null) {
                                z = false;
                            }
                            f(y1M, z, null);
                            this.l.set(false);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        i();
    }

    @Override // io.sentry.W
    public final T1 a() {
        ArrayList arrayList = new ArrayList(this.c);
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((T1) arrayList.get(size)).f) {
                return (T1) arrayList.get(size);
            }
        }
        return null;
    }

    @Override // io.sentry.V
    public final d2 b() {
        if (!this.d.t().isTraceSampling()) {
            return null;
        }
        synchronized (this) {
            try {
                if (this.m.b) {
                    AtomicReference atomicReference = new AtomicReference();
                    AtomicReference atomicReference2 = new AtomicReference();
                    this.d.m(new C0039e0(atomicReference, 1, atomicReference2));
                    this.m.w(this, (io.sentry.protocol.E) atomicReference.get(), (io.sentry.protocol.t) atomicReference2.get(), this.d.t(), this.b.c.f55o);
                    this.m.b = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.m.x();
    }

    @Override // io.sentry.V
    public final void c(String str) {
        T1 t1 = this.b;
        if (t1.f) {
            this.d.t().getLogger().h(EnumC0094u1.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            t1.c.q = str;
        }
    }

    @Override // io.sentry.V
    public final boolean d() {
        return this.b.f;
    }

    @Override // io.sentry.W
    public final io.sentry.protocol.t e() {
        return this.a;
    }

    @Override // io.sentry.W
    public final void f(Y1 y1, boolean z, C0104y c0104y) {
        if (this.b.f) {
            return;
        }
        AbstractC0049h1 abstractC0049h1Y = this.d.t().getDateProvider().y();
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            T1 t1 = (T1) listIterator.previous();
            t1.i = null;
            t1.o(y1, abstractC0049h1Y);
        }
        w(y1, abstractC0049h1Y, z, c0104y);
    }

    @Override // io.sentry.V
    public final boolean g(AbstractC0049h1 abstractC0049h1) {
        return this.b.g(abstractC0049h1);
    }

    @Override // io.sentry.V
    public final String getDescription() {
        return this.b.c.q;
    }

    @Override // io.sentry.W
    public final String getName() {
        return this.e;
    }

    @Override // io.sentry.V
    public final void h(Number number, String str) {
        this.b.h(number, str);
    }

    @Override // io.sentry.W
    public final void i() {
        Long l;
        synchronized (this.j) {
            try {
                if (this.i != null && (l = this.r.e) != null) {
                    v();
                    this.k.set(true);
                    this.g = new O1(this, 0);
                    try {
                        this.i.schedule(this.g, l.longValue());
                    } catch (Throwable th) {
                        this.d.t().getLogger().v(EnumC0094u1.WARNING, "Failed to schedule finish timer", th);
                        Y1 y1M = m();
                        if (y1M == null) {
                            y1M = Y1.OK;
                        }
                        o(y1M, null);
                        this.k.set(false);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.sentry.V
    public final void j(String str, Long l, EnumC0093u0 enumC0093u0) {
        this.b.j(str, l, enumC0093u0);
    }

    @Override // io.sentry.V
    public final U1 k() {
        return this.b.c;
    }

    @Override // io.sentry.V
    public final void l(Y1 y1) {
        o(y1, null);
    }

    @Override // io.sentry.V
    public final Y1 m() {
        return this.b.c.r;
    }

    @Override // io.sentry.V
    public final AbstractC0049h1 n() {
        return this.b.b;
    }

    @Override // io.sentry.V
    public final void o(Y1 y1, AbstractC0049h1 abstractC0049h1) {
        w(y1, abstractC0049h1, true, null);
    }

    @Override // io.sentry.V
    public final V p(String str, String str2, AbstractC0049h1 abstractC0049h1, Z z) {
        X1 x1 = new X1();
        T1 t1 = this.b;
        boolean z2 = t1.f;
        C0 c0 = C0.a;
        if (z2 || !this.f52o.equals(z)) {
            return c0;
        }
        int size = this.c.size();
        K k = this.d;
        if (size >= k.t().getMaxSpans()) {
            k.t().getLogger().h(EnumC0094u1.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
            return c0;
        }
        if (t1.f) {
            return c0;
        }
        W1 w1 = t1.c.m;
        Q1 q1 = t1.d;
        T1 t2 = q1.b;
        if (t2.f || !q1.f52o.equals(z)) {
            return c0;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = q1.c;
        int size2 = copyOnWriteArrayList.size();
        K k2 = q1.d;
        if (size2 >= k2.t().getMaxSpans()) {
            k2.t().getLogger().h(EnumC0094u1.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
            return c0;
        }
        io.sentry.config.a.C(w1, "parentSpanId is required");
        q1.v();
        T1 t3 = new T1(t2.c.l, w1, q1, str, q1.d, abstractC0049h1, x1, new N1(q1));
        t3.c.q = str2;
        t3.r(String.valueOf(Thread.currentThread().getId()), "thread.id");
        t3.r(k2.t().getMainThreadChecker().a() ? "main" : Thread.currentThread().getName(), "thread.name");
        copyOnWriteArrayList.add(t3);
        h2 h2Var = q1.q;
        if (h2Var != null) {
            h2Var.a(t3);
        }
        return t3;
    }

    @Override // io.sentry.V
    public final void q() {
        o(m(), null);
    }

    @Override // io.sentry.V
    public final void r(Object obj, String str) {
        T1 t1 = this.b;
        if (t1.f) {
            this.d.t().getLogger().h(EnumC0094u1.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            t1.r(obj, str);
        }
    }

    @Override // io.sentry.W
    public final io.sentry.protocol.C s() {
        return this.n;
    }

    @Override // io.sentry.V
    public final AbstractC0049h1 t() {
        return this.b.a;
    }

    public final void u() {
        synchronized (this.j) {
            try {
                if (this.h != null) {
                    this.h.cancel();
                    this.l.set(false);
                    this.h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v() {
        synchronized (this.j) {
            try {
                if (this.g != null) {
                    this.g.cancel();
                    this.k.set(false);
                    this.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    public final void w(Y1 y1, AbstractC0049h1 abstractC0049h1, boolean z, C0104y c0104y) {
        J0 j0L;
        AbstractC0049h1 abstractC0049h2 = this.b.b;
        if (abstractC0049h1 == null) {
            abstractC0049h1 = abstractC0049h2;
        }
        if (abstractC0049h1 == null) {
            abstractC0049h1 = this.d.t().getDateProvider().y();
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((T1) it.next()).h.getClass();
        }
        this.f = new P1(true, y1);
        if (this.b.f) {
            return;
        }
        if (!this.r.d || x()) {
            AtomicReference atomicReference = new AtomicReference();
            T1 t1 = this.b;
            t1.i = new C0040e1(this, t1.i, atomicReference);
            t1.o(this.f.b, abstractC0049h1);
            Boolean bool = Boolean.TRUE;
            e2 e2Var = this.b.c.f55o;
            if (bool.equals(e2Var == null ? null : (Boolean) e2Var.a)) {
                e2 e2Var2 = this.b.c.f55o;
                if (bool.equals(e2Var2 == null ? null : (Boolean) e2Var2.b)) {
                    j0L = this.d.t().getTransactionProfiler().l(this, (List) atomicReference.get(), this.d.t());
                } else {
                    j0L = null;
                }
            } else {
                j0L = null;
            }
            if (atomicReference.get() != null) {
                ((List) atomicReference.get()).clear();
            }
            this.d.m(new N1(this));
            io.sentry.protocol.A a = new io.sentry.protocol.A(this);
            if (this.i != null) {
                synchronized (this.j) {
                    try {
                        if (this.i != null) {
                            v();
                            u();
                            this.i.cancel();
                            this.i = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z && this.c.isEmpty() && this.r.e != null) {
                this.d.t().getLogger().h(EnumC0094u1.DEBUG, "Dropping idle transaction %s because it has no child spans", this.e);
            } else {
                a.E.putAll(this.b.k);
                this.d.r(a, b(), c0104y, j0L);
            }
        }
    }

    public final boolean x() {
        ArrayList<T1> arrayList = new ArrayList(this.c);
        if (arrayList.isEmpty()) {
            return true;
        }
        for (T1 t1 : arrayList) {
            if (!t1.f && t1.b == null) {
                return false;
            }
        }
        return true;
    }
}
