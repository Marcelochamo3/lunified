package io.sentry.rrweb;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j extends b implements InterfaceC0084r0 {
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f144o;
    public int p;
    public Map q;

    public j() {
        super(c.Meta);
        this.n = "";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f144o == jVar.f144o && this.p == jVar.p && io.sentry.config.a.e(this.n, jVar.n);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.n, Integer.valueOf(this.f144o), Integer.valueOf(this.p)});
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("type");
        cVar.j(iLogger, this.l);
        cVar.f("timestamp");
        cVar.i(this.m);
        cVar.f("data");
        cVar.b();
        cVar.f("href");
        cVar.m(this.n);
        cVar.f("height");
        cVar.i(this.f144o);
        cVar.f("width");
        cVar.i(this.p);
        Map map = this.q;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.q, str, cVar, str, iLogger);
            }
        }
        cVar.c();
        cVar.c();
    }
}
