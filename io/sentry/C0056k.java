package io.sentry;

import io.sentry.protocol.C0076c;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: io.sentry.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0056k implements InterfaceC0092u {
    public final /* synthetic */ int l;
    public final Object m;
    public final Object n;

    public C0056k() {
        this.l = 2;
        String property = System.getProperty("java.version");
        String property2 = System.getProperty("java.vendor");
        this.m = property;
        this.n = property2;
    }

    @Override // io.sentry.InterfaceC0092u
    public final K1 a(K1 k1, C0104y c0104y) {
        int i = this.l;
        return k1;
    }

    public void b(AbstractC0037d1 abstractC0037d1) {
        io.sentry.protocol.v vVar = (io.sentry.protocol.v) abstractC0037d1.m.d("runtime", io.sentry.protocol.v.class);
        C0076c c0076c = abstractC0037d1.m;
        if (vVar == null) {
            c0076c.put("runtime", new io.sentry.protocol.v());
        }
        io.sentry.protocol.v vVar2 = (io.sentry.protocol.v) c0076c.d("runtime", io.sentry.protocol.v.class);
        if (vVar2 != null && vVar2.l == null && vVar2.m == null) {
            vVar2.l = (String) this.n;
            vVar2.m = (String) this.m;
        }
    }

    @Override // io.sentry.InterfaceC0092u
    public final io.sentry.protocol.A f(io.sentry.protocol.A a, C0104y c0104y) {
        switch (this.l) {
            default:
                b(a);
            case 0:
            case 1:
                return a;
        }
    }

    @Override // io.sentry.InterfaceC0092u
    public final C0083q1 i(C0083q1 c0083q1, C0104y c0104y) {
        io.sentry.protocol.s sVarB;
        String str;
        Long l;
        Object obj = this.m;
        Object obj2 = this.n;
        switch (this.l) {
            case 0:
                if (!i2.class.isInstance(io.sentry.config.a.q(c0104y)) || (sVarB = c0083q1.b()) == null || (str = sVarB.l) == null || (l = sVarB.f134o) == null) {
                    return c0083q1;
                }
                Map map = (Map) obj;
                Long l2 = (Long) map.get(str);
                if (l2 == null || l2.equals(l)) {
                    map.put(str, l);
                    return c0083q1;
                }
                ((I1) obj2).getLogger().h(EnumC0094u1.INFO, "Event %s has been dropped due to multi-threaded deduplication", c0083q1.l);
                c0104y.c(io.sentry.hints.e.MULTITHREADED_DEDUPLICATION, "sentry:eventDropReason");
                return null;
            case 1:
                I1 i1 = (I1) obj2;
                if (!i1.isEnableDeduplication()) {
                    i1.getLogger().h(EnumC0094u1.DEBUG, "Event deduplication is disabled.", new Object[0]);
                    return c0083q1;
                }
                Throwable th = c0083q1.u;
                if (th instanceof io.sentry.exception.a) {
                    th = ((io.sentry.exception.a) th).m;
                }
                if (th == null) {
                    return c0083q1;
                }
                Map map2 = (Map) obj;
                if (!map2.containsKey(th)) {
                    ArrayList arrayList = new ArrayList();
                    for (Throwable cause = th; cause.getCause() != null; cause = cause.getCause()) {
                        arrayList.add(cause.getCause());
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (map2.containsKey(it.next())) {
                        }
                    }
                    map2.put(th, null);
                    return c0083q1;
                }
                i1.getLogger().h(EnumC0094u1.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", c0083q1.l);
                return null;
            default:
                b(c0083q1);
                return c0083q1;
        }
    }

    public C0056k(I1 i1, int i) {
        this.l = i;
        switch (i) {
            case 1:
                this.m = DesugarCollections.synchronizedMap(new WeakHashMap());
                io.sentry.config.a.C(i1, "options are required");
                this.n = i1;
                break;
            default:
                this.m = DesugarCollections.synchronizedMap(new HashMap());
                this.n = i1;
                break;
        }
    }
}
