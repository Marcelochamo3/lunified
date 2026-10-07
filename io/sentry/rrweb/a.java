package io.sentry.rrweb;

import io.sentry.AbstractC0035d;
import io.sentry.EnumC0094u1;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b implements InterfaceC0084r0 {
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f140o;
    public String p;
    public String q;
    public String r;
    public EnumC0094u1 s;
    public Map t;
    public Map u;
    public Map v;
    public Map w;

    public a() {
        super(c.Custom);
        this.n = "breadcrumb";
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
        if (this.p != null) {
            cVar.f("type");
            cVar.m(this.p);
        }
        cVar.f("timestamp");
        cVar.j(iLogger, BigDecimal.valueOf(this.f140o));
        if (this.q != null) {
            cVar.f("category");
            cVar.m(this.q);
        }
        if (this.r != null) {
            cVar.f("message");
            cVar.m(this.r);
        }
        if (this.s != null) {
            cVar.f("level");
            cVar.j(iLogger, this.s);
        }
        if (this.t != null) {
            cVar.f("data");
            cVar.j(iLogger, this.t);
        }
        Map map = this.v;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.v, str, cVar, str, iLogger);
            }
        }
        cVar.c();
        Map map2 = this.w;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                AbstractC0035d.c(this.w, str2, cVar, str2, iLogger);
            }
        }
        cVar.c();
        Map map3 = this.u;
        if (map3 != null) {
            for (String str3 : map3.keySet()) {
                AbstractC0035d.c(this.u, str3, cVar, str3, iLogger);
            }
        }
        cVar.c();
    }
}
