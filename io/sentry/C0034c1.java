package io.sentry;

import java.util.Map;

/* JADX INFO: renamed from: io.sentry.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0034c1 implements InterfaceC0084r0 {
    public boolean l;
    public Double m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Double f105o;
    public String p;
    public boolean q;
    public int r;
    public Map s;

    public C0034c1(I1 i1, e2 e2Var) {
        this.n = ((Boolean) e2Var.a).booleanValue();
        this.f105o = (Double) e2Var.c;
        this.l = ((Boolean) e2Var.b).booleanValue();
        this.m = (Double) e2Var.d;
        this.p = i1.getProfilingTracesDirPath();
        this.q = i1.isProfilingEnabled();
        this.r = i1.getProfilingTracesHz();
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("profile_sampled");
        cVar.j(iLogger, Boolean.valueOf(this.l));
        cVar.f("profile_sample_rate");
        cVar.j(iLogger, this.m);
        cVar.f("trace_sampled");
        cVar.j(iLogger, Boolean.valueOf(this.n));
        cVar.f("trace_sample_rate");
        cVar.j(iLogger, this.f105o);
        cVar.f("profiling_traces_dir_path");
        cVar.j(iLogger, this.p);
        cVar.f("is_profiling_enabled");
        cVar.j(iLogger, Boolean.valueOf(this.q));
        cVar.f("profiling_traces_hz");
        cVar.j(iLogger, Integer.valueOf(this.r));
        Map map = this.s;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.s, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
