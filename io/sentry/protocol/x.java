package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.C0097v1;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x implements InterfaceC0084r0 {
    public Map A;
    public String B;
    public C0097v1 C;
    public String l;
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f137o;
    public Integer p;
    public String q;
    public String r;
    public Boolean s;
    public String t;
    public Boolean u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        if (this.l != null) {
            cVar.f("filename");
            cVar.m(this.l);
        }
        if (this.m != null) {
            cVar.f("function");
            cVar.m(this.m);
        }
        if (this.n != null) {
            cVar.f("module");
            cVar.m(this.n);
        }
        if (this.f137o != null) {
            cVar.f("lineno");
            cVar.l(this.f137o);
        }
        if (this.p != null) {
            cVar.f("colno");
            cVar.l(this.p);
        }
        if (this.q != null) {
            cVar.f("abs_path");
            cVar.m(this.q);
        }
        if (this.r != null) {
            cVar.f("context_line");
            cVar.m(this.r);
        }
        if (this.s != null) {
            cVar.f("in_app");
            cVar.k(this.s);
        }
        if (this.t != null) {
            cVar.f("package");
            cVar.m(this.t);
        }
        if (this.u != null) {
            cVar.f("native");
            cVar.k(this.u);
        }
        if (this.v != null) {
            cVar.f("platform");
            cVar.m(this.v);
        }
        if (this.w != null) {
            cVar.f("image_addr");
            cVar.m(this.w);
        }
        if (this.x != null) {
            cVar.f("symbol_addr");
            cVar.m(this.x);
        }
        if (this.y != null) {
            cVar.f("instruction_addr");
            cVar.m(this.y);
        }
        if (this.B != null) {
            cVar.f("raw_function");
            cVar.m(this.B);
        }
        if (this.z != null) {
            cVar.f("symbol");
            cVar.m(this.z);
        }
        if (this.C != null) {
            cVar.f("lock");
            cVar.j(iLogger, this.C);
        }
        Map map = this.A;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.A, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
