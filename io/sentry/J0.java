package io.sentry;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class J0 implements InterfaceC0084r0 {
    public final List A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public Date K;
    public final Map L;
    public Map N;
    public final File l;
    public final Callable m;
    public int n;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public boolean u;
    public String v;
    public String x;
    public String y;
    public String z;
    public List w = new ArrayList();
    public String M = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f50o = Locale.getDefault().toString();

    public J0(File file, Date date, ArrayList arrayList, String str, String str2, String str3, String str4, int i, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, Map map) {
        this.l = file;
        this.K = date;
        this.v = str5;
        this.m = callable;
        this.n = i;
        this.p = str6 != null ? str6 : "";
        this.q = str7 != null ? str7 : "";
        this.t = str8 != null ? str8 : "";
        this.u = bool != null ? bool.booleanValue() : false;
        this.x = str9 != null ? str9 : "0";
        this.r = "";
        this.s = "android";
        this.y = "android";
        this.z = str10 != null ? str10 : "";
        this.A = arrayList;
        this.B = str;
        this.C = str4;
        this.D = "";
        this.E = str11 != null ? str11 : "";
        this.F = str2;
        this.G = str3;
        this.H = UUID.randomUUID().toString();
        this.I = str12 != null ? str12 : "production";
        this.J = str13;
        if (!str13.equals("normal") && !this.J.equals("timeout") && !this.J.equals("backgrounded")) {
            this.J = "normal";
        }
        this.L = map;
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("android_api_level");
        cVar.j(iLogger, Integer.valueOf(this.n));
        cVar.f("device_locale");
        cVar.j(iLogger, this.f50o);
        cVar.f("device_manufacturer");
        cVar.m(this.p);
        cVar.f("device_model");
        cVar.m(this.q);
        cVar.f("device_os_build_number");
        cVar.m(this.r);
        cVar.f("device_os_name");
        cVar.m(this.s);
        cVar.f("device_os_version");
        cVar.m(this.t);
        cVar.f("device_is_emulator");
        cVar.n(this.u);
        cVar.f("architecture");
        cVar.j(iLogger, this.v);
        cVar.f("device_cpu_frequencies");
        cVar.j(iLogger, this.w);
        cVar.f("device_physical_memory_bytes");
        cVar.m(this.x);
        cVar.f("platform");
        cVar.m(this.y);
        cVar.f("build_id");
        cVar.m(this.z);
        cVar.f("transaction_name");
        cVar.m(this.B);
        cVar.f("duration_ns");
        cVar.m(this.C);
        cVar.f("version_name");
        cVar.m(this.E);
        cVar.f("version_code");
        cVar.m(this.D);
        List list = this.A;
        if (!list.isEmpty()) {
            cVar.f("transactions");
            cVar.j(iLogger, list);
        }
        cVar.f("transaction_id");
        cVar.m(this.F);
        cVar.f("trace_id");
        cVar.m(this.G);
        cVar.f("profile_id");
        cVar.m(this.H);
        cVar.f("environment");
        cVar.m(this.I);
        cVar.f("truncation_reason");
        cVar.m(this.J);
        if (this.M != null) {
            cVar.f("sampled_profile");
            cVar.m(this.M);
        }
        cVar.f("measurements");
        cVar.j(iLogger, this.L);
        cVar.f("timestamp");
        cVar.j(iLogger, this.K);
        Map map = this.N;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.N, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
