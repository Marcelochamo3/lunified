package io.sentry;

import io.sentry.protocol.C0074a;
import io.sentry.protocol.C0076c;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class T0 implements Q {
    public EnumC0094u1 a;
    public W b;
    public String c;
    public io.sentry.protocol.E d;
    public String e;
    public io.sentry.protocol.n f;
    public final ArrayList g;
    public final b2 h;
    public final ConcurrentHashMap i;
    public final ConcurrentHashMap j;
    public final CopyOnWriteArrayList k;
    public final I1 l;
    public volatile S1 m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f54o;
    public final Object p;
    public final C0076c q;
    public final CopyOnWriteArrayList r;
    public L0 s;
    public io.sentry.protocol.t t;

    public T0(I1 i1) {
        this.g = new ArrayList();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new CopyOnWriteArrayList();
        this.n = new Object();
        this.f54o = new Object();
        this.p = new Object();
        this.q = new C0076c();
        this.r = new CopyOnWriteArrayList();
        this.t = io.sentry.protocol.t.m;
        this.l = i1;
        this.h = new b2(new C0047h(i1.getMaxBreadcrumbs()));
        this.s = new L0();
    }

    @Override // io.sentry.Q
    public final void A(String str) {
        this.e = str;
        C0076c c0076c = this.q;
        C0074a c0074a = (C0074a) c0076c.d("app", C0074a.class);
        if (c0074a == null) {
            c0074a = new C0074a();
            c0076c.b(c0074a);
        }
        if (str == null) {
            c0074a.t = null;
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            c0074a.t = arrayList;
        }
        Iterator<S> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().e(c0076c);
        }
    }

    @Override // io.sentry.Q
    public final String B() {
        W w = this.b;
        return w != null ? w.getName() : this.c;
    }

    @Override // io.sentry.Q
    public final Map C() {
        return io.sentry.config.a.z(this.i);
    }

    @Override // io.sentry.Q
    public final void D(L0 l0) {
        this.s = l0;
    }

    @Override // io.sentry.Q
    public final Q a() {
        return new T0(this);
    }

    @Override // io.sentry.Q
    public final W b() {
        return this.b;
    }

    @Override // io.sentry.Q
    public final void c(C0041f c0041f, C0104y c0104y) {
        I1 i1 = this.l;
        i1.getBeforeBreadcrumb();
        b2 b2Var = this.h;
        b2Var.add(c0041f);
        for (S s : i1.getScopeObservers()) {
            s.f(c0041f);
            s.g(b2Var);
        }
    }

    @Override // io.sentry.Q
    public final void clear() {
        this.a = null;
        this.d = null;
        this.f = null;
        this.e = null;
        this.g.clear();
        b2 b2Var = this.h;
        b2Var.clear();
        Iterator<S> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().g(b2Var);
        }
        this.i.clear();
        this.j.clear();
        this.k.clear();
        g();
        this.r.clear();
    }

    public final Object clone() {
        return new T0(this);
    }

    @Override // io.sentry.Q
    public final void d(String str, String str2) {
        ConcurrentHashMap concurrentHashMap = this.i;
        concurrentHashMap.put(str, str2);
        for (S s : this.l.getScopeObservers()) {
            s.d(str, str2);
            s.c(concurrentHashMap);
        }
    }

    @Override // io.sentry.Q
    public final io.sentry.protocol.n e() {
        return this.f;
    }

    @Override // io.sentry.Q
    public final List f() {
        return new CopyOnWriteArrayList(this.r);
    }

    @Override // io.sentry.Q
    public final void g() {
        synchronized (this.f54o) {
            this.b = null;
        }
        this.c = null;
        for (S s : this.l.getScopeObservers()) {
            s.b(null);
            s.a(null);
        }
    }

    @Override // io.sentry.Q
    public final S1 h() {
        S1 s1;
        synchronized (this.n) {
            try {
                s1 = null;
                if (this.m != null) {
                    S1 s2 = this.m;
                    s2.getClass();
                    s2.b(io.sentry.config.a.j());
                    S1 s1Clone = this.m.clone();
                    this.m = null;
                    s1 = s1Clone;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return s1;
    }

    @Override // io.sentry.Q
    public final io.sentry.internal.debugmeta.c i() {
        io.sentry.internal.debugmeta.c cVar;
        synchronized (this.n) {
            try {
                if (this.m != null) {
                    S1 s1 = this.m;
                    s1.getClass();
                    s1.b(io.sentry.config.a.j());
                }
                S1 s2 = this.m;
                cVar = null;
                if (this.l.getRelease() != null) {
                    String distinctId = this.l.getDistinctId();
                    io.sentry.protocol.E e = this.d;
                    this.m = new S1(R1.Ok, io.sentry.config.a.j(), io.sentry.config.a.j(), 0, distinctId, UUID.randomUUID(), Boolean.TRUE, null, null, e != null ? e.p : null, null, this.l.getEnvironment(), this.l.getRelease(), null);
                    cVar = new io.sentry.internal.debugmeta.c(this.m.clone(), 2, s2 != null ? s2.clone() : null);
                } else {
                    this.l.getLogger().h(EnumC0094u1.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // io.sentry.Q
    public final C0076c j() {
        return this.q;
    }

    @Override // io.sentry.Q
    public final L0 k(Q0 q0) {
        L0 l0;
        synchronized (this.p) {
            q0.a(this.s);
            l0 = new L0(this.s);
        }
        return l0;
    }

    @Override // io.sentry.Q
    public final String l() {
        return this.e;
    }

    @Override // io.sentry.Q
    public final V m() {
        T1 t1A;
        W w = this.b;
        return (w == null || (t1A = w.a()) == null) ? w : t1A;
    }

    @Override // io.sentry.Q
    public final void n(S0 s0) {
        synchronized (this.f54o) {
            s0.b(this.b);
        }
    }

    @Override // io.sentry.Q
    public final void o(W w) {
        synchronized (this.f54o) {
            try {
                this.b = w;
                for (S s : this.l.getScopeObservers()) {
                    if (w != null) {
                        s.b(w.getName());
                        s.a(w.k());
                    } else {
                        s.b(null);
                        s.a(null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.sentry.Q
    public final List p() {
        return this.g;
    }

    @Override // io.sentry.Q
    public final S1 q() {
        return this.m;
    }

    @Override // io.sentry.Q
    public final Queue r() {
        return this.h;
    }

    @Override // io.sentry.Q
    public final io.sentry.protocol.E s() {
        return this.d;
    }

    @Override // io.sentry.Q
    public final EnumC0094u1 t() {
        return this.a;
    }

    @Override // io.sentry.Q
    public final io.sentry.protocol.t u() {
        return this.t;
    }

    @Override // io.sentry.Q
    public final L0 v() {
        return this.s;
    }

    @Override // io.sentry.Q
    public final S1 w(R0 r0) {
        S1 s1Clone;
        synchronized (this.n) {
            try {
                r0.a(this.m);
                s1Clone = this.m != null ? this.m.clone() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return s1Clone;
    }

    @Override // io.sentry.Q
    public final Map x() {
        return this.j;
    }

    @Override // io.sentry.Q
    public final void y(io.sentry.protocol.t tVar) {
        this.t = tVar;
    }

    @Override // io.sentry.Q
    public final List z() {
        return this.k;
    }

    public T0(T0 t0) {
        io.sentry.protocol.E e;
        this.g = new ArrayList();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new CopyOnWriteArrayList();
        this.n = new Object();
        this.f54o = new Object();
        this.p = new Object();
        this.q = new C0076c();
        this.r = new CopyOnWriteArrayList();
        this.t = io.sentry.protocol.t.m;
        this.b = t0.b;
        this.c = t0.c;
        this.m = t0.m;
        this.l = t0.l;
        this.a = t0.a;
        io.sentry.protocol.E e2 = t0.d;
        io.sentry.protocol.n nVar = null;
        if (e2 != null) {
            e = new io.sentry.protocol.E();
            e.l = e2.l;
            e.n = e2.n;
            e.m = e2.m;
            e.p = e2.p;
            e.f120o = e2.f120o;
            e.q = e2.q;
            e.r = e2.r;
            e.s = io.sentry.config.a.z(e2.s);
            e.t = io.sentry.config.a.z(e2.t);
        } else {
            e = null;
        }
        this.d = e;
        this.e = t0.e;
        this.t = t0.t;
        io.sentry.protocol.n nVar2 = t0.f;
        if (nVar2 != null) {
            nVar = new io.sentry.protocol.n();
            nVar.l = nVar2.l;
            nVar.p = nVar2.p;
            nVar.m = nVar2.m;
            nVar.n = nVar2.n;
            nVar.q = io.sentry.config.a.z(nVar2.q);
            nVar.r = io.sentry.config.a.z(nVar2.r);
            nVar.t = io.sentry.config.a.z(nVar2.t);
            nVar.w = io.sentry.config.a.z(nVar2.w);
            nVar.f130o = nVar2.f130o;
            nVar.u = nVar2.u;
            nVar.s = nVar2.s;
            nVar.v = nVar2.v;
        }
        this.f = nVar;
        this.g = new ArrayList(t0.g);
        this.k = new CopyOnWriteArrayList(t0.k);
        C0041f[] c0041fArr = (C0041f[]) t0.h.toArray(new C0041f[0]);
        b2 b2Var = new b2(new C0047h(t0.l.getMaxBreadcrumbs()));
        for (C0041f c0041f : c0041fArr) {
            b2Var.add(new C0041f(c0041f));
        }
        this.h = b2Var;
        ConcurrentHashMap concurrentHashMap = t0.i;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null) {
                concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.i = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = t0.j;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap4.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        this.j = concurrentHashMap4;
        this.q = new C0076c(t0.q);
        this.r = new CopyOnWriteArrayList(t0.r);
        this.s = new L0(t0.s);
    }
}
