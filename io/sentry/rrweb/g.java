package io.sentry.rrweb;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e implements InterfaceC0084r0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f f141o;
    public int p;
    public float q;
    public float r;
    public int s;
    public int t;
    public Map u;
    public Map v;

    public g() {
        super(d.MouseInteraction);
        this.s = 2;
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
        cVar.f("source");
        cVar.j(iLogger, this.n);
        cVar.f("type");
        cVar.j(iLogger, this.f141o);
        cVar.f("id");
        cVar.i(this.p);
        cVar.f("x");
        cVar.h(this.q);
        cVar.f("y");
        cVar.h(this.r);
        cVar.f("pointerType");
        cVar.i(this.s);
        cVar.f("pointerId");
        cVar.i(this.t);
        Map map = this.v;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.v, str, cVar, str, iLogger);
            }
        }
        cVar.c();
        Map map2 = this.u;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                AbstractC0035d.c(this.u, str2, cVar, str2, iLogger);
            }
        }
        cVar.c();
    }
}
