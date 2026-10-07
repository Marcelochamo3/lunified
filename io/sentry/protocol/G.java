package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class G implements InterfaceC0084r0 {
    public String l;
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f121o;
    public Double p;
    public Double q;
    public Double r;
    public Double s;
    public String t;
    public Double u;
    public List v;
    public Map w;

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        if (this.l != null) {
            cVar.f("rendering_system");
            cVar.m(this.l);
        }
        if (this.m != null) {
            cVar.f("type");
            cVar.m(this.m);
        }
        if (this.n != null) {
            cVar.f("identifier");
            cVar.m(this.n);
        }
        if (this.f121o != null) {
            cVar.f("tag");
            cVar.m(this.f121o);
        }
        if (this.p != null) {
            cVar.f("width");
            cVar.l(this.p);
        }
        if (this.q != null) {
            cVar.f("height");
            cVar.l(this.q);
        }
        if (this.r != null) {
            cVar.f("x");
            cVar.l(this.r);
        }
        if (this.s != null) {
            cVar.f("y");
            cVar.l(this.s);
        }
        if (this.t != null) {
            cVar.f("visibility");
            cVar.m(this.t);
        }
        if (this.u != null) {
            cVar.f("alpha");
            cVar.l(this.u);
        }
        List list = this.v;
        if (list != null && !list.isEmpty()) {
            cVar.f("children");
            cVar.j(iLogger, this.v);
        }
        Map map = this.w;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.w, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
