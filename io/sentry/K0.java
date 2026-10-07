package io.sentry;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class K0 implements InterfaceC0084r0 {
    public String l;
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Long f51o;
    public Long p;
    public Long q;
    public Long r;
    public Map s;

    public K0(W w, Long l, Long l2) {
        this.l = w.e().toString();
        this.m = w.k().l.toString();
        this.n = w.getName();
        this.f51o = l;
        this.q = l2;
    }

    public final void a(Long l, Long l2, Long l3, Long l4) {
        if (this.p == null) {
            this.p = Long.valueOf(l.longValue() - l2.longValue());
            this.f51o = Long.valueOf(this.f51o.longValue() - l2.longValue());
            this.r = Long.valueOf(l3.longValue() - l4.longValue());
            this.q = Long.valueOf(this.q.longValue() - l4.longValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K0.class != obj.getClass()) {
            return false;
        }
        K0 k0 = (K0) obj;
        return this.l.equals(k0.l) && this.m.equals(k0.m) && this.n.equals(k0.n) && this.f51o.equals(k0.f51o) && this.q.equals(k0.q) && io.sentry.config.a.e(this.r, k0.r) && io.sentry.config.a.e(this.p, k0.p) && io.sentry.config.a.e(this.s, k0.s);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.l, this.m, this.n, this.f51o, this.p, this.q, this.r, this.s});
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("id");
        cVar.j(iLogger, this.l);
        cVar.f("trace_id");
        cVar.j(iLogger, this.m);
        cVar.f("name");
        cVar.j(iLogger, this.n);
        cVar.f("relative_start_ns");
        cVar.j(iLogger, this.f51o);
        cVar.f("relative_end_ns");
        cVar.j(iLogger, this.p);
        cVar.f("relative_cpu_start_ms");
        cVar.j(iLogger, this.q);
        cVar.f("relative_cpu_end_ms");
        cVar.j(iLogger, this.r);
        Map map = this.s;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.s, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
