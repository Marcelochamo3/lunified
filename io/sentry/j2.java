package io.sentry;

import java.util.Map;
import o.AbstractC1701hf0;

/* JADX INFO: loaded from: classes.dex */
public final class j2 implements InterfaceC0084r0 {
    public final io.sentry.protocol.t l;
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f116o;
    public Map p;

    public j2(io.sentry.protocol.t tVar, String str, String str2, String str3) {
        this.l = tVar;
        this.m = str;
        this.n = str2;
        this.f116o = str3;
    }

    @Override // io.sentry.InterfaceC0084r0
    public final void serialize(F0 f0, ILogger iLogger) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) f0;
        cVar.b();
        cVar.f("event_id");
        this.l.serialize(cVar, iLogger);
        String str = this.m;
        if (str != null) {
            cVar.f("name");
            cVar.m(str);
        }
        String str2 = this.n;
        if (str2 != null) {
            cVar.f("email");
            cVar.m(str2);
        }
        String str3 = this.f116o;
        if (str3 != null) {
            cVar.f("comments");
            cVar.m(str3);
        }
        Map map = this.p;
        if (map != null) {
            for (String str4 : map.keySet()) {
                AbstractC0035d.c(this.p, str4, cVar, str4, iLogger);
            }
        }
        cVar.c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserFeedback{eventId=");
        sb.append(this.l);
        sb.append(", name='");
        sb.append(this.m);
        sb.append("', email='");
        sb.append(this.n);
        sb.append("', comments='");
        return AbstractC1701hf0.h(sb, this.f116o, "'}");
    }
}
