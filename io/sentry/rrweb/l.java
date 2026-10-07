package io.sentry.rrweb;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l extends b implements InterfaceC0084r0 {
    public Map A;
    public Map B;
    public Map C;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f146o;
    public long p;
    public long q;
    public String r;
    public String s;
    public int t;
    public int u;
    public int v;
    public String w;
    public int x;
    public int y;
    public int z;

    public l() {
        super(c.Custom);
        this.r = "h264";
        this.s = "mp4";
        this.w = "constant";
        this.n = "video";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f146o == lVar.f146o && this.p == lVar.p && this.q == lVar.q && this.t == lVar.t && this.u == lVar.u && this.v == lVar.v && this.x == lVar.x && this.y == lVar.y && this.z == lVar.z && io.sentry.config.a.e(this.n, lVar.n) && io.sentry.config.a.e(this.r, lVar.r) && io.sentry.config.a.e(this.s, lVar.s) && io.sentry.config.a.e(this.w, lVar.w);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.n, Integer.valueOf(this.f146o), Long.valueOf(this.p), Long.valueOf(this.q), this.r, this.s, Integer.valueOf(this.t), Integer.valueOf(this.u), Integer.valueOf(this.v), this.w, Integer.valueOf(this.x), Integer.valueOf(this.y), Integer.valueOf(this.z)});
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
        cVar.f("segmentId");
        cVar.i(this.f146o);
        cVar.f("size");
        cVar.i(this.p);
        cVar.f("duration");
        cVar.i(this.q);
        cVar.f("encoding");
        cVar.m(this.r);
        cVar.f("container");
        cVar.m(this.s);
        cVar.f("height");
        cVar.i(this.t);
        cVar.f("width");
        cVar.i(this.u);
        cVar.f("frameCount");
        cVar.i(this.v);
        cVar.f("frameRate");
        cVar.i(this.x);
        cVar.f("frameRateType");
        cVar.m(this.w);
        cVar.f("left");
        cVar.i(this.y);
        cVar.f("top");
        cVar.i(this.z);
        Map map = this.B;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.B, str, cVar, str, iLogger);
            }
        }
        cVar.c();
        Map map2 = this.C;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                AbstractC0035d.c(this.C, str2, cVar, str2, iLogger);
            }
        }
        cVar.c();
        Map map3 = this.A;
        if (map3 != null) {
            for (String str3 : map3.keySet()) {
                AbstractC0035d.c(this.A, str3, cVar, str3, iLogger);
            }
        }
        cVar.c();
    }
}
