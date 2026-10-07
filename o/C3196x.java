package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: o.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3196x extends AbstractC1370eA {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1109o;
    public final AtomicReferenceFieldUpdater p;
    public final AtomicReferenceFieldUpdater q;
    public final AtomicReferenceFieldUpdater r;
    public final AtomicReferenceFieldUpdater s;

    public C3196x(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f1109o = atomicReferenceFieldUpdater;
        this.p = atomicReferenceFieldUpdater2;
        this.q = atomicReferenceFieldUpdater3;
        this.r = atomicReferenceFieldUpdater4;
        this.s = atomicReferenceFieldUpdater5;
    }

    @Override // o.AbstractC1370eA
    public final void J(D d, D d2) {
        this.p.lazySet(d, d2);
    }

    @Override // o.AbstractC1370eA
    public final void K(D d, Thread thread) {
        this.f1109o.lazySet(d, thread);
    }

    @Override // o.AbstractC1370eA
    public final boolean d(E e, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.s;
            if (atomicReferenceFieldUpdater.compareAndSet(e, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(e) == obj);
        return false;
    }

    @Override // o.AbstractC1370eA
    public final boolean e(E e, D d, D d2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.q;
            if (atomicReferenceFieldUpdater.compareAndSet(e, d, d2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(e) == d);
        return false;
    }

    @Override // o.AbstractC1370eA
    public final C3099w o(E e) {
        return (C3099w) this.r.getAndSet(e, C3099w.b);
    }

    @Override // o.AbstractC1370eA
    public final D p(E e) {
        return (D) this.q.getAndSet(e, D.c);
    }
}
