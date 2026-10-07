package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n implements InterfaceC0084r0 {
    public String l;
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f130o;
    public String p;
    public Map q;
    public Map r;
    public Long s;
    public Map t;
    public String u;
    public String v;
    public Map w;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return io.sentry.config.a.e(this.l, nVar.l) && io.sentry.config.a.e(this.m, nVar.m) && io.sentry.config.a.e(this.n, nVar.n) && io.sentry.config.a.e(this.p, nVar.p) && io.sentry.config.a.e(this.q, nVar.q) && io.sentry.config.a.e(this.r, nVar.r) && io.sentry.config.a.e(this.s, nVar.s) && io.sentry.config.a.e(this.u, nVar.u) && io.sentry.config.a.e(this.v, nVar.v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.u, this.v});
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        if (this.l != null) {
            cVar.f("url");
            cVar.m(this.l);
        }
        if (this.m != null) {
            cVar.f("method");
            cVar.m(this.m);
        }
        if (this.n != null) {
            cVar.f("query_string");
            cVar.m(this.n);
        }
        if (this.f130o != null) {
            cVar.f("data");
            cVar.j(iLogger, this.f130o);
        }
        if (this.p != null) {
            cVar.f("cookies");
            cVar.m(this.p);
        }
        if (this.q != null) {
            cVar.f("headers");
            cVar.j(iLogger, this.q);
        }
        if (this.r != null) {
            cVar.f("env");
            cVar.j(iLogger, this.r);
        }
        if (this.t != null) {
            cVar.f("other");
            cVar.j(iLogger, this.t);
        }
        if (this.u != null) {
            cVar.f("fragment");
            cVar.j(iLogger, this.u);
        }
        if (this.s != null) {
            cVar.f("body_size");
            cVar.j(iLogger, this.s);
        }
        if (this.v != null) {
            cVar.f("api_target");
            cVar.j(iLogger, this.v);
        }
        Map map = this.w;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.w, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
