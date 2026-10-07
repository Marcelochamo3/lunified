package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: o.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1742i0 extends AbstractC1376eG {
    public final AtomicReferenceFieldUpdater n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f822o;
    public final AtomicReferenceFieldUpdater p;
    public final AtomicReferenceFieldUpdater q;
    public final AtomicReferenceFieldUpdater r;

    public C1742i0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.n = atomicReferenceFieldUpdater;
        this.f822o = atomicReferenceFieldUpdater2;
        this.p = atomicReferenceFieldUpdater3;
        this.q = atomicReferenceFieldUpdater4;
        this.r = atomicReferenceFieldUpdater5;
    }

    @Override // o.AbstractC1376eG
    public final void A(C1936k0 c1936k0, Thread thread) {
        this.n.lazySet(c1936k0, thread);
    }

    @Override // o.AbstractC1376eG
    public final boolean f(AbstractFutureC2034l0 abstractFutureC2034l0, C1644h0 c1644h0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1644h0 c1644h1 = C1644h0.b;
        do {
            atomicReferenceFieldUpdater = this.q;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2034l0, c1644h0, c1644h1)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2034l0) == c1644h0);
        return false;
    }

    @Override // o.AbstractC1376eG
    public final boolean g(AbstractFutureC2034l0 abstractFutureC2034l0, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.r;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2034l0, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2034l0) == obj);
        return false;
    }

    @Override // o.AbstractC1376eG
    public final boolean h(AbstractFutureC2034l0 abstractFutureC2034l0, C1936k0 c1936k0, C1936k0 c1936k1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.p;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC2034l0, c1936k0, c1936k1)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC2034l0) == c1936k0);
        return false;
    }

    @Override // o.AbstractC1376eG
    public final void z(C1936k0 c1936k0, C1936k0 c1936k1) {
        this.f822o.lazySet(c1936k0, c1936k1);
    }
}
