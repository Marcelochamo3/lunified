package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z implements InterfaceC0084r0 {
    public Long l;
    public Integer m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f139o;
    public Boolean p;
    public Boolean q;
    public Boolean r;
    public Boolean s;
    public y t;
    public Map u;
    public Map v;

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        if (this.l != null) {
            cVar.f("id");
            cVar.l(this.l);
        }
        if (this.m != null) {
            cVar.f("priority");
            cVar.l(this.m);
        }
        if (this.n != null) {
            cVar.f("name");
            cVar.m(this.n);
        }
        if (this.f139o != null) {
            cVar.f("state");
            cVar.m(this.f139o);
        }
        if (this.p != null) {
            cVar.f("crashed");
            cVar.k(this.p);
        }
        if (this.q != null) {
            cVar.f("current");
            cVar.k(this.q);
        }
        if (this.r != null) {
            cVar.f("daemon");
            cVar.k(this.r);
        }
        if (this.s != null) {
            cVar.f("main");
            cVar.k(this.s);
        }
        if (this.t != null) {
            cVar.f("stacktrace");
            cVar.j(iLogger, this.t);
        }
        if (this.u != null) {
            cVar.f("held_locks");
            cVar.j(iLogger, this.u);
        }
        Map map = this.v;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.v, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
