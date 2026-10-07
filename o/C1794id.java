package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: o.id, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1794id extends CH {
    public final C1692hb p;

    public C1794id(C1692hb c1692hb) {
        this.p = c1692hb;
    }

    @Override // o.InterfaceC0412Ey
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        q((Throwable) obj);
        return C2985uq0.a;
    }

    @Override // o.EH
    public final void q(Throwable th) {
        JH jhP = p();
        C1692hb c1692hb = this.p;
        Throwable thW = c1692hb.w(jhP);
        if (c1692hb.C()) {
            InterfaceC0473Hh interfaceC0473Hh = c1692hb.f813o;
            AbstractC1474fG.h(interfaceC0473Hh, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            C1520fn c1520fn = (C1520fn) interfaceC0473Hh;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1520fn.s;
                Object obj = atomicReferenceFieldUpdater.get(c1520fn);
                J2 j2 = Pu0.b;
                if (AbstractC1474fG.b(obj, j2)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c1520fn, j2, thW)) {
                        if (atomicReferenceFieldUpdater.get(c1520fn) != j2) {
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(c1520fn, obj, null)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(c1520fn) == obj);
                }
            }
        }
        c1692hb.r(thW);
        if (c1692hb.C()) {
            return;
        }
        c1692hb.t();
    }
}
