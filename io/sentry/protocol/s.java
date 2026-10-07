package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s implements InterfaceC0084r0 {
    public String l;
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Long f134o;
    public y p;
    public j q;
    public Map r;

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        if (this.l != null) {
            cVar.f("type");
            cVar.m(this.l);
        }
        if (this.m != null) {
            cVar.f("value");
            cVar.m(this.m);
        }
        if (this.n != null) {
            cVar.f("module");
            cVar.m(this.n);
        }
        if (this.f134o != null) {
            cVar.f("thread_id");
            cVar.l(this.f134o);
        }
        if (this.p != null) {
            cVar.f("stacktrace");
            cVar.j(iLogger, this.p);
        }
        if (this.q != null) {
            cVar.f("mechanism");
            cVar.j(iLogger, this.q);
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
