package io.sentry.protocol;

import io.sentry.AbstractC0035d;
import io.sentry.F0;
import io.sentry.ILogger;
import io.sentry.InterfaceC0084r0;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.protocol.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0080g implements InterfaceC0084r0 {
    public String l;
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Map f124o;

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        if (this.l != null) {
            cVar.f("city");
            cVar.m(this.l);
        }
        if (this.m != null) {
            cVar.f("country_code");
            cVar.m(this.m);
        }
        if (this.n != null) {
            cVar.f("region");
            cVar.m(this.n);
        }
        Map map = this.f124o;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.f124o, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
