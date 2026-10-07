package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: io.sentry.protocol.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0079f implements InterfaceC0084r0 {
    public Boolean A;
    public Long B;
    public Long C;
    public Long D;
    public Long E;
    public Integer F;
    public Integer G;
    public Float H;
    public Integer I;
    public Date J;
    public TimeZone K;
    public String L;
    public String M;
    public String N;
    public String O;
    public Float P;
    public Integer Q;
    public Double R;
    public String S;
    public Map T;
    public String l;
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f123o;
    public String p;
    public String q;
    public String[] r;
    public Float s;
    public Boolean t;
    public Boolean u;
    public EnumC0078e v;
    public Boolean w;
    public Long x;
    public Long y;
    public Long z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0079f.class != obj.getClass()) {
            return false;
        }
        C0079f c0079f = (C0079f) obj;
        return io.sentry.config.a.e(this.l, c0079f.l) && io.sentry.config.a.e(this.m, c0079f.m) && io.sentry.config.a.e(this.n, c0079f.n) && io.sentry.config.a.e(this.f123o, c0079f.f123o) && io.sentry.config.a.e(this.p, c0079f.p) && io.sentry.config.a.e(this.q, c0079f.q) && Arrays.equals(this.r, c0079f.r) && io.sentry.config.a.e(this.s, c0079f.s) && io.sentry.config.a.e(this.t, c0079f.t) && io.sentry.config.a.e(this.u, c0079f.u) && this.v == c0079f.v && io.sentry.config.a.e(this.w, c0079f.w) && io.sentry.config.a.e(this.x, c0079f.x) && io.sentry.config.a.e(this.y, c0079f.y) && io.sentry.config.a.e(this.z, c0079f.z) && io.sentry.config.a.e(this.A, c0079f.A) && io.sentry.config.a.e(this.B, c0079f.B) && io.sentry.config.a.e(this.C, c0079f.C) && io.sentry.config.a.e(this.D, c0079f.D) && io.sentry.config.a.e(this.E, c0079f.E) && io.sentry.config.a.e(this.F, c0079f.F) && io.sentry.config.a.e(this.G, c0079f.G) && io.sentry.config.a.e(this.H, c0079f.H) && io.sentry.config.a.e(this.I, c0079f.I) && io.sentry.config.a.e(this.J, c0079f.J) && io.sentry.config.a.e(this.L, c0079f.L) && io.sentry.config.a.e(this.M, c0079f.M) && io.sentry.config.a.e(this.N, c0079f.N) && io.sentry.config.a.e(this.O, c0079f.O) && io.sentry.config.a.e(this.P, c0079f.P) && io.sentry.config.a.e(this.Q, c0079f.Q) && io.sentry.config.a.e(this.R, c0079f.R) && io.sentry.config.a.e(this.S, c0079f.S);
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.l, this.m, this.n, this.f123o, this.p, this.q, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S}) * 31) + Arrays.hashCode(this.r);
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        if (this.l != null) {
            cVar.f("name");
            cVar.m(this.l);
        }
        if (this.m != null) {
            cVar.f("manufacturer");
            cVar.m(this.m);
        }
        if (this.n != null) {
            cVar.f("brand");
            cVar.m(this.n);
        }
        if (this.f123o != null) {
            cVar.f("family");
            cVar.m(this.f123o);
        }
        if (this.p != null) {
            cVar.f("model");
            cVar.m(this.p);
        }
        if (this.q != null) {
            cVar.f("model_id");
            cVar.m(this.q);
        }
        if (this.r != null) {
            cVar.f("archs");
            cVar.j(iLogger, this.r);
        }
        if (this.s != null) {
            cVar.f("battery_level");
            cVar.l(this.s);
        }
        if (this.t != null) {
            cVar.f("charging");
            cVar.k(this.t);
        }
        if (this.u != null) {
            cVar.f("online");
            cVar.k(this.u);
        }
        if (this.v != null) {
            cVar.f("orientation");
            cVar.j(iLogger, this.v);
        }
        if (this.w != null) {
            cVar.f("simulator");
            cVar.k(this.w);
        }
        if (this.x != null) {
            cVar.f("memory_size");
            cVar.l(this.x);
        }
        if (this.y != null) {
            cVar.f("free_memory");
            cVar.l(this.y);
        }
        if (this.z != null) {
            cVar.f("usable_memory");
            cVar.l(this.z);
        }
        if (this.A != null) {
            cVar.f("low_memory");
            cVar.k(this.A);
        }
        if (this.B != null) {
            cVar.f("storage_size");
            cVar.l(this.B);
        }
        if (this.C != null) {
            cVar.f("free_storage");
            cVar.l(this.C);
        }
        if (this.D != null) {
            cVar.f("external_storage_size");
            cVar.l(this.D);
        }
        if (this.E != null) {
            cVar.f("external_free_storage");
            cVar.l(this.E);
        }
        if (this.F != null) {
            cVar.f("screen_width_pixels");
            cVar.l(this.F);
        }
        if (this.G != null) {
            cVar.f("screen_height_pixels");
            cVar.l(this.G);
        }
        if (this.H != null) {
            cVar.f("screen_density");
            cVar.l(this.H);
        }
        if (this.I != null) {
            cVar.f("screen_dpi");
            cVar.l(this.I);
        }
        if (this.J != null) {
            cVar.f("boot_time");
            cVar.j(iLogger, this.J);
        }
        if (this.K != null) {
            cVar.f("timezone");
            cVar.j(iLogger, this.K);
        }
        if (this.L != null) {
            cVar.f("id");
            cVar.m(this.L);
        }
        if (this.M != null) {
            cVar.f("language");
            cVar.m(this.M);
        }
        if (this.O != null) {
            cVar.f("connection_type");
            cVar.m(this.O);
        }
        if (this.P != null) {
            cVar.f("battery_temperature");
            cVar.l(this.P);
        }
        if (this.N != null) {
            cVar.f("locale");
            cVar.m(this.N);
        }
        if (this.Q != null) {
            cVar.f("processor_count");
            cVar.l(this.Q);
        }
        if (this.R != null) {
            cVar.f("processor_frequency");
            cVar.l(this.R);
        }
        if (this.S != null) {
            cVar.f("cpu_description");
            cVar.m(this.S);
        }
        Map map = this.T;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.T, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
