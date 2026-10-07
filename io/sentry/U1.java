package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class U1 implements InterfaceC0084r0 {
    public final io.sentry.protocol.t l;
    public final W1 m;
    public final W1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient e2 f55o;
    public final String p;
    public String q;
    public Y1 r;
    public ConcurrentHashMap s;
    public String t;
    public Map u;

    public U1(io.sentry.protocol.t tVar, W1 w1, String str, W1 w2, e2 e2Var) {
        this(tVar, w1, w2, str, null, e2Var, null, "manual");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U1)) {
            return false;
        }
        U1 u1 = (U1) obj;
        return this.l.equals(u1.l) && this.m.equals(u1.m) && io.sentry.config.a.e(this.n, u1.n) && this.p.equals(u1.p) && io.sentry.config.a.e(this.q, u1.q) && this.r == u1.r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.l, this.m, this.n, this.p, this.q, this.r});
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("trace_id");
        this.l.serialize(cVar, iLogger);
        cVar.f("span_id");
        this.m.serialize(cVar, iLogger);
        W1 w1 = this.n;
        if (w1 != null) {
            cVar.f("parent_span_id");
            w1.serialize(cVar, iLogger);
        }
        cVar.f("op");
        cVar.m(this.p);
        if (this.q != null) {
            cVar.f("description");
            cVar.m(this.q);
        }
        if (this.r != null) {
            cVar.f("status");
            cVar.j(iLogger, this.r);
        }
        if (this.t != null) {
            cVar.f("origin");
            cVar.j(iLogger, this.t);
        }
        if (!this.s.isEmpty()) {
            cVar.f("tags");
            cVar.j(iLogger, this.s);
        }
        Map map = this.u;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.u, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }

    public U1(io.sentry.protocol.t tVar, W1 w1, W1 w2, String str, String str2, e2 e2Var, Y1 y1, String str3) {
        this.s = new ConcurrentHashMap();
        this.t = "manual";
        io.sentry.config.a.C(tVar, "traceId is required");
        this.l = tVar;
        io.sentry.config.a.C(w1, "spanId is required");
        this.m = w1;
        io.sentry.config.a.C(str, "operation is required");
        this.p = str;
        this.n = w2;
        this.f55o = e2Var;
        this.q = str2;
        this.r = y1;
        this.t = str3;
    }

    public U1(U1 u1) {
        this.s = new ConcurrentHashMap();
        this.t = "manual";
        this.l = u1.l;
        this.m = u1.m;
        this.n = u1.n;
        this.f55o = u1.f55o;
        this.p = u1.p;
        this.q = u1.q;
        this.r = u1.r;
        ConcurrentHashMap concurrentHashMapZ = io.sentry.config.a.z(u1.s);
        if (concurrentHashMapZ != null) {
            this.s = concurrentHashMapZ;
        }
    }
}
