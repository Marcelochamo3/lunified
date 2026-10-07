package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0097v1 implements InterfaceC0084r0 {
    public int l;
    public String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f151o;
    public Long p;
    public Map q;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0097v1.class != obj.getClass()) {
            return false;
        }
        return io.sentry.config.a.e(this.m, ((C0097v1) obj).m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.m});
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("type");
        cVar.i(this.l);
        if (this.m != null) {
            cVar.f("address");
            cVar.m(this.m);
        }
        if (this.n != null) {
            cVar.f("package_name");
            cVar.m(this.n);
        }
        if (this.f151o != null) {
            cVar.f("class_name");
            cVar.m(this.f151o);
        }
        if (this.p != null) {
            cVar.f("thread_id");
            cVar.l(this.p);
        }
        Map map = this.q;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC0035d.c(this.q, str, cVar, str, iLogger);
            }
        }
        cVar.c();
    }
}
