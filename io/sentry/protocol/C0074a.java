package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.protocol.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0074a implements InterfaceC0084r0 {
    public String l;
    public Date m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f122o;
    public String p;
    public String q;
    public String r;
    public Map s;
    public List t;
    public String u;
    public Boolean v;
    public Map w;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0074a.class != obj.getClass()) {
            return false;
        }
        C0074a c0074a = (C0074a) obj;
        return io.sentry.config.a.e(this.l, c0074a.l) && io.sentry.config.a.e(this.m, c0074a.m) && io.sentry.config.a.e(this.n, c0074a.n) && io.sentry.config.a.e(this.f122o, c0074a.f122o) && io.sentry.config.a.e(this.p, c0074a.p) && io.sentry.config.a.e(this.q, c0074a.q) && io.sentry.config.a.e(this.r, c0074a.r) && io.sentry.config.a.e(this.s, c0074a.s) && io.sentry.config.a.e(this.v, c0074a.v) && io.sentry.config.a.e(this.t, c0074a.t) && io.sentry.config.a.e(this.u, c0074a.u);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.l, this.m, this.n, this.f122o, this.p, this.q, this.r, this.s, this.v, this.t, this.u});
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        if (this.l != null) {
            cVar.f("app_identifier");
            cVar.m(this.l);
        }
        if (this.m != null) {
            cVar.f("app_start_time");
            cVar.j(iLogger, this.m);
        }
        if (this.n != null) {
            cVar.f("device_app_hash");
            cVar.m(this.n);
        }
        if (this.f122o != null) {
            cVar.f("build_type");
            cVar.m(this.f122o);
        }
        if (this.p != null) {
            cVar.f("app_name");
            cVar.m(this.p);
        }
        if (this.q != null) {
            cVar.f("app_version");
            cVar.m(this.q);
        }
        if (this.r != null) {
            cVar.f("app_build");
            cVar.m(this.r);
        }
        Map map = this.s;
        if (map != null && !map.isEmpty()) {
            cVar.f("permissions");
            cVar.j(iLogger, this.s);
        }
        if (this.v != null) {
            cVar.f("in_foreground");
            cVar.k(this.v);
        }
        if (this.t != null) {
            cVar.f("view_names");
            cVar.j(iLogger, this.t);
        }
        if (this.u != null) {
            cVar.f("start_type");
            cVar.m(this.u);
        }
        Map map2 = this.w;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                AbstractC0035d.c(this.w, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
