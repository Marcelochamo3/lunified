package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j implements InterfaceC0084r0 {
    public String l;
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Boolean f126o;
    public Map p;
    public Map q;
    public Boolean r;
    public Map s;

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        if (this.l != null) {
            cVar.f("type");
            cVar.m(this.l);
        }
        if (this.m != null) {
            cVar.f("description");
            cVar.m(this.m);
        }
        if (this.n != null) {
            cVar.f("help_link");
            cVar.m(this.n);
        }
        if (this.f126o != null) {
            cVar.f("handled");
            cVar.k(this.f126o);
        }
        if (this.p != null) {
            cVar.f("meta");
            cVar.j(iLogger, this.p);
        }
        if (this.q != null) {
            cVar.f("data");
            cVar.j(iLogger, this.q);
        }
        if (this.r != null) {
            cVar.f("synthetic");
            cVar.k(this.r);
        }
        Map map = this.s;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.s, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
