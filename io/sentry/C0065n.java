package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.sentry.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0065n implements h2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f117o;
    public final ArrayList p;
    public final boolean q;
    public final I1 r;
    public final Object l = new Object();
    public volatile Timer m = null;
    public final ConcurrentHashMap n = new ConcurrentHashMap();
    public final AtomicBoolean s = new AtomicBoolean(false);
    public long t = 0;

    public C0065n(I1 i1) {
        boolean z = false;
        io.sentry.config.a.C(i1, "The options object is required.");
        this.r = i1;
        this.f117o = new ArrayList();
        this.p = new ArrayList();
        for (N n : i1.getPerformanceCollectors()) {
            if (n instanceof P) {
                this.f117o.add((P) n);
            }
            if (n instanceof O) {
                this.p.add((O) n);
            }
        }
        if (this.f117o.isEmpty() && this.p.isEmpty()) {
            z = true;
        }
        this.q = z;
    }

    @Override // io.sentry.h2
    public final void a(T1 t1) {
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.f0) ((O) it.next())).g(t1);
        }
    }

    @Override // io.sentry.h2
    public final void close() {
        this.r.getLogger().h(EnumC0094u1.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.n.clear();
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.f0) ((O) it.next())).e();
        }
        if (this.s.getAndSet(false)) {
            synchronized (this.l) {
                try {
                    if (this.m != null) {
                        this.m.cancel();
                        this.m = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // io.sentry.h2
    public final void e(V v) throws Throwable {
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.f0) ((O) it.next())).f(v);
        }
    }

    @Override // io.sentry.h2
    public final List g(W w) throws Throwable {
        this.r.getLogger().h(EnumC0094u1.DEBUG, "stop collecting performance info for transactions %s (%s)", w.getName(), w.k().l.toString());
        ConcurrentHashMap concurrentHashMap = this.n;
        List list = (List) concurrentHashMap.remove(w.e().toString());
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.f0) ((O) it.next())).f(w);
        }
        if (concurrentHashMap.isEmpty()) {
            close();
        }
        return list;
    }

    @Override // io.sentry.h2
    public final void m(W w) {
        if (this.q) {
            this.r.getLogger().h(EnumC0094u1.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.f0) ((O) it.next())).g(w);
        }
        if (!this.n.containsKey(w.e().toString())) {
            this.n.put(w.e().toString(), new ArrayList());
            try {
                this.r.getExecutorService().u(new RunnableC0059l(this, 0, w), 30000L);
            } catch (RejectedExecutionException e) {
                this.r.getLogger().v(EnumC0094u1.ERROR, "Failed to call the executor. Performance collector will not be automatically finished. Did you call Sentry.close()?", e);
            }
        }
        if (this.s.getAndSet(true)) {
            return;
        }
        synchronized (this.l) {
            try {
                if (this.m == null) {
                    this.m = new Timer(true);
                }
                this.m.schedule(new C0062m(0, this), 0L);
                this.m.scheduleAtFixedRate(new C0062m(1, this), 100L, 100L);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
