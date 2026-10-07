package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class E implements InterfaceC0084r0 {
    public String l;
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f120o;
    public String p;
    public String q;
    public C0080g r;
    public Map s;
    public Map t;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        E e = (E) obj;
        return io.sentry.config.a.e(this.l, e.l) && io.sentry.config.a.e(this.m, e.m) && io.sentry.config.a.e(this.n, e.n) && io.sentry.config.a.e(this.f120o, e.f120o) && io.sentry.config.a.e(this.p, e.p);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.l, this.m, this.n, this.f120o, this.p});
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        if (this.l != null) {
            cVar.f("email");
            cVar.m(this.l);
        }
        if (this.m != null) {
            cVar.f("id");
            cVar.m(this.m);
        }
        if (this.n != null) {
            cVar.f("username");
            cVar.m(this.n);
        }
        if (this.f120o != null) {
            cVar.f("segment");
            cVar.m(this.f120o);
        }
        if (this.p != null) {
            cVar.f("ip_address");
            cVar.m(this.p);
        }
        if (this.q != null) {
            cVar.f("name");
            cVar.m(this.q);
        }
        if (this.r != null) {
            cVar.f("geo");
            this.r.serialize(cVar, iLogger);
        }
        if (this.s != null) {
            cVar.f("data");
            cVar.j(iLogger, this.s);
        }
        Map map = this.t;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.t, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
