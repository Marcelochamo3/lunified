package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h implements InterfaceC0084r0 {
    public String l;
    public Integer m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f125o;
    public Integer p;
    public String q;
    public Boolean r;
    public String s;
    public String t;
    public Map u;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return io.sentry.config.a.e(this.l, hVar.l) && io.sentry.config.a.e(this.m, hVar.m) && io.sentry.config.a.e(this.n, hVar.n) && io.sentry.config.a.e(this.f125o, hVar.f125o) && io.sentry.config.a.e(this.p, hVar.p) && io.sentry.config.a.e(this.q, hVar.q) && io.sentry.config.a.e(this.r, hVar.r) && io.sentry.config.a.e(this.s, hVar.s) && io.sentry.config.a.e(this.t, hVar.t);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.l, this.m, this.n, this.f125o, this.p, this.q, this.r, this.s, this.t});
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        if (this.l != null) {
            cVar.f("name");
            cVar.m(this.l);
        }
        if (this.m != null) {
            cVar.f("id");
            cVar.l(this.m);
        }
        if (this.n != null) {
            cVar.f("vendor_id");
            cVar.m(this.n);
        }
        if (this.f125o != null) {
            cVar.f("vendor_name");
            cVar.m(this.f125o);
        }
        if (this.p != null) {
            cVar.f("memory_size");
            cVar.l(this.p);
        }
        if (this.q != null) {
            cVar.f("api_type");
            cVar.m(this.q);
        }
        if (this.r != null) {
            cVar.f("multi_threaded_rendering");
            cVar.k(this.r);
        }
        if (this.s != null) {
            cVar.f("version");
            cVar.m(this.s);
        }
        if (this.t != null) {
            cVar.f("npot_support");
            cVar.m(this.t);
        }
        Map map = this.u;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.u, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
