package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class T1 implements V {
    public final AbstractC0049h1 a;
    public AbstractC0049h1 b;
    public final U1 c;
    public final Q1 d;
    public final K e;
    public final X1 h;
    public V1 i;
    public boolean f = false;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public final ConcurrentHashMap k = new ConcurrentHashMap();
    public final C0088s1 l = new C0088s1(new C0042f0(2));

    public T1(io.sentry.protocol.t tVar, W1 w1, Q1 q1, String str, K k, AbstractC0049h1 abstractC0049h1, X1 x1, N1 n1) {
        this.c = new U1(tVar, new W1(), str, w1, q1.b.c.f55o);
        this.d = q1;
        io.sentry.config.a.C(k, "hub is required");
        this.e = k;
        this.h = x1;
        this.i = n1;
        if (abstractC0049h1 != null) {
            this.a = abstractC0049h1;
        } else {
            this.a = k.t().getDateProvider().y();
        }
    }

    @Override // io.sentry.V
    public final void c(String str) {
        this.c.q = str;
    }

    @Override // io.sentry.V
    public final boolean d() {
        return this.f;
    }

    @Override // io.sentry.V
    public final boolean g(AbstractC0049h1 abstractC0049h1) {
        if (this.b == null) {
            return false;
        }
        this.b = abstractC0049h1;
        return true;
    }

    @Override // io.sentry.V
    public final String getDescription() {
        return this.c.q;
    }

    @Override // io.sentry.V
    public final void h(Number number, String str) {
        if (this.f) {
            this.e.t().getLogger().h(EnumC0094u1.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.k.put(str, new io.sentry.protocol.i(number, null));
        Q1 q1 = this.d;
        T1 t1 = q1.b;
        if (t1 == this || t1.k.containsKey(str)) {
            return;
        }
        q1.h(number, str);
    }

    @Override // io.sentry.V
    public final void j(String str, Long l, EnumC0093u0 enumC0093u0) {
        if (this.f) {
            this.e.t().getLogger().h(EnumC0094u1.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.k.put(str, new io.sentry.protocol.i(l, enumC0093u0.apiName()));
        Q1 q1 = this.d;
        T1 t1 = q1.b;
        if (t1 == this || t1.k.containsKey(str)) {
            return;
        }
        q1.j(str, l, enumC0093u0);
    }

    @Override // io.sentry.V
    public final U1 k() {
        return this.c;
    }

    @Override // io.sentry.V
    public final void l(Y1 y1) {
        o(y1, this.e.t().getDateProvider().y());
    }

    @Override // io.sentry.V
    public final Y1 m() {
        return this.c.r;
    }

    @Override // io.sentry.V
    public final AbstractC0049h1 n() {
        return this.b;
    }

    @Override // io.sentry.V
    public final void o(Y1 y1, AbstractC0049h1 abstractC0049h1) {
        List<T1> list;
        AbstractC0049h1 abstractC0049h2;
        AbstractC0049h1 abstractC0049h3;
        if (this.f || !this.g.compareAndSet(false, true)) {
            return;
        }
        U1 u1 = this.c;
        u1.r = y1;
        if (abstractC0049h1 == null) {
            abstractC0049h1 = this.e.t().getDateProvider().y();
        }
        this.b = abstractC0049h1;
        X1 x1 = this.h;
        x1.getClass();
        if (x1.a) {
            Q1 q1 = this.d;
            W1 w1 = q1.b.c.m;
            W1 w2 = u1.m;
            boolean zEquals = w1.equals(w2);
            CopyOnWriteArrayList<T1> copyOnWriteArrayList = q1.c;
            if (!zEquals) {
                list = copyOnWriteArrayList;
                ArrayList arrayList = new ArrayList();
                for (T1 t1 : copyOnWriteArrayList) {
                    W1 w3 = t1.c.n;
                    if (w3 != null && w3.equals(w2)) {
                        arrayList.add(t1);
                    }
                }
                list = arrayList;
            }
            list = copyOnWriteArrayList;
            AbstractC0049h1 abstractC0049h4 = null;
            AbstractC0049h1 abstractC0049h5 = null;
            for (T1 t2 : list) {
                if (abstractC0049h4 == null || t2.a.b(abstractC0049h4) < 0) {
                    abstractC0049h4 = t2.a;
                }
                if (abstractC0049h5 == null || ((abstractC0049h3 = t2.b) != null && abstractC0049h3.b(abstractC0049h5) > 0)) {
                    abstractC0049h5 = t2.b;
                }
            }
            if (x1.a && abstractC0049h5 != null && ((abstractC0049h2 = this.b) == null || abstractC0049h2.b(abstractC0049h5) > 0)) {
                g(abstractC0049h5);
            }
        }
        V1 v1 = this.i;
        if (v1 != null) {
            v1.d(this);
        }
        this.f = true;
    }

    @Override // io.sentry.V
    public final void q() {
        l(this.c.r);
    }

    @Override // io.sentry.V
    public final void r(Object obj, String str) {
        this.j.put(str, obj);
    }

    @Override // io.sentry.V
    public final AbstractC0049h1 t() {
        return this.a;
    }

    public T1(f2 f2Var, Q1 q1, K k, AbstractC0049h1 abstractC0049h1, X1 x1) {
        this.c = f2Var;
        io.sentry.config.a.C(q1, "sentryTracer is required");
        this.d = q1;
        io.sentry.config.a.C(k, "hub is required");
        this.e = k;
        this.i = null;
        if (abstractC0049h1 != null) {
            this.a = abstractC0049h1;
        } else {
            this.a = k.t().getDateProvider().y();
        }
        this.h = x1;
    }
}
