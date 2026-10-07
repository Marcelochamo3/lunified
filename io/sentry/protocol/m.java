package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m implements InterfaceC0084r0 {
    public String l;
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f129o;
    public String p;
    public Boolean q;
    public Map r;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return io.sentry.config.a.e(this.l, mVar.l) && io.sentry.config.a.e(this.m, mVar.m) && io.sentry.config.a.e(this.n, mVar.n) && io.sentry.config.a.e(this.f129o, mVar.f129o) && io.sentry.config.a.e(this.p, mVar.p) && io.sentry.config.a.e(this.q, mVar.q);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.l, this.m, this.n, this.f129o, this.p, this.q});
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
            cVar.f("version");
            cVar.m(this.m);
        }
        if (this.n != null) {
            cVar.f("raw_description");
            cVar.m(this.n);
        }
        if (this.f129o != null) {
            cVar.f("build");
            cVar.m(this.f129o);
        }
        if (this.p != null) {
            cVar.f("kernel_version");
            cVar.m(this.p);
        }
        if (this.q != null) {
            cVar.f("rooted");
            cVar.k(this.q);
        }
        Map map = this.r;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.r, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
