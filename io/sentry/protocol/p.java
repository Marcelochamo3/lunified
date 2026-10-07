package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p implements InterfaceC0084r0 {
    public String l;
    public Map m;
    public Integer n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Long f131o;
    public Object p;
    public Map q;

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        if (this.l != null) {
            cVar.f("cookies");
            cVar.m(this.l);
        }
        if (this.m != null) {
            cVar.f("headers");
            cVar.j(iLogger, this.m);
        }
        if (this.n != null) {
            cVar.f("status_code");
            cVar.j(iLogger, this.n);
        }
        if (this.f131o != null) {
            cVar.f("body_size");
            cVar.j(iLogger, this.f131o);
        }
        if (this.p != null) {
            cVar.f("data");
            cVar.j(iLogger, this.p);
        }
        Map map = this.q;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.q, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
