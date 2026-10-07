package io.sentry;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d2 implements InterfaceC0084r0 {
    public final io.sentry.protocol.t l;
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f109o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final io.sentry.protocol.t u;
    public Map v;

    public d2(io.sentry.protocol.t tVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, io.sentry.protocol.t tVar2) {
        this.l = tVar;
        this.m = str;
        this.n = str2;
        this.f109o = str3;
        this.p = str4;
        this.q = str5;
        this.r = str6;
        this.s = str7;
        this.t = str8;
        this.u = tVar2;
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("trace_id");
        cVar.j(iLogger, this.l);
        cVar.f("public_key");
        cVar.m(this.m);
        String str = this.n;
        if (str != null) {
            cVar.f("release");
            cVar.m(str);
        }
        String str2 = this.f109o;
        if (str2 != null) {
            cVar.f("environment");
            cVar.m(str2);
        }
        String str3 = this.p;
        if (str3 != null) {
            cVar.f("user_id");
            cVar.m(str3);
        }
        String str4 = this.q;
        if (str4 != null) {
            cVar.f("user_segment");
            cVar.m(str4);
        }
        String str5 = this.r;
        if (str5 != null) {
            cVar.f("transaction");
            cVar.m(str5);
        }
        String str6 = this.s;
        if (str6 != null) {
            cVar.f("sample_rate");
            cVar.m(str6);
        }
        String str7 = this.t;
        if (str7 != null) {
            cVar.f("sampled");
            cVar.m(str7);
        }
        io.sentry.protocol.t tVar = this.u;
        if (tVar != null) {
            cVar.f("replay_id");
            cVar.j(iLogger, tVar);
        }
        Map map = this.v;
        if (map != null) {
            for (String str8 : map.keySet()) {
                AbstractC0035d.c(this.v, str8, cVar, str8, iLogger);
            }
        }
        cVar.c();
    }
}
