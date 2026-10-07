package io.sentry;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0073p1 implements InterfaceC0084r0 {
    public final String l;
    public final String m;
    public final EnumC0091t1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f119o;
    public final Callable p;
    public final String q;
    public Map r;

    public C0073p1(EnumC0091t1 enumC0091t1, int i, String str, String str2, String str3) {
        this.n = enumC0091t1;
        this.l = str;
        this.f119o = i;
        this.m = str2;
        this.p = null;
        this.q = str3;
    }

    public final int a() {
        Callable callable = this.p;
        if (callable == null) {
            return this.f119o;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        String str = this.l;
        if (str != null) {
            cVar.f("content_type");
            cVar.m(str);
        }
        String str2 = this.m;
        if (str2 != null) {
            cVar.f("filename");
            cVar.m(str2);
        }
        cVar.f("type");
        cVar.j(iLogger, this.n);
        String str3 = this.q;
        if (str3 != null) {
            cVar.f("attachment_type");
            cVar.m(str3);
        }
        cVar.f("length");
        cVar.i(a());
        Map map = this.r;
        if (map != null) {
            for (String str4 : map.keySet()) {
                AbstractC0035d.c(this.r, str4, cVar, str4, iLogger);
            }
        }
        cVar.c();
    }

    public C0073p1(EnumC0091t1 enumC0091t1, Callable callable, String str, String str2, String str3) {
        io.sentry.config.a.C(enumC0091t1, "type is required");
        this.n = enumC0091t1;
        this.l = str;
        this.f119o = -1;
        this.m = str2;
        this.p = callable;
        this.q = str3;
    }
}
