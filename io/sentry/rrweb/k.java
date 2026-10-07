package io.sentry.rrweb;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k extends b implements InterfaceC0084r0 {
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f145o;
    public String p;
    public double q;
    public double r;
    public Map s;
    public Map t;
    public Map u;
    public Map v;

    public k() {
        super(c.Custom);
        this.n = "performanceSpan";
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
        cVar.f("tag");
        cVar.m(this.n);
        cVar.f("payload");
        cVar.b();
        if (this.f145o != null) {
            cVar.f("op");
            cVar.m(this.f145o);
        }
        if (this.p != null) {
            cVar.f("description");
            cVar.m(this.p);
        }
        cVar.f("startTimestamp");
        cVar.j(iLogger, BigDecimal.valueOf(this.q));
        cVar.f("endTimestamp");
        cVar.j(iLogger, BigDecimal.valueOf(this.r));
        if (this.s != null) {
            cVar.f("data");
            cVar.j(iLogger, this.s);
        }
        Map map = this.u;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.u, str, cVar, str, iLogger);
            }
        }
        cVar.c();
        Map map2 = this.v;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                AbstractC0035d.c(this.v, str2, cVar, str2, iLogger);
            }
        }
        cVar.c();
        Map map3 = this.t;
        if (map3 != null) {
            for (String str3 : map3.keySet()) {
                AbstractC0035d.c(this.t, str3, cVar, str3, iLogger);
            }
        }
        cVar.c();
    }
}
