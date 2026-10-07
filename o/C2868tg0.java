package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: o.tg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2868tg0 extends AbstractC2228n0 {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(C2868tg0.class, Object.class, "_state");
    private volatile Object _state;

    @Override // o.AbstractC2228n0
    public final boolean a(AbstractC2131m0 abstractC2131m0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, Sr0.j);
        return true;
    }

    @Override // o.AbstractC2228n0
    public final InterfaceC0473Hh[] b(AbstractC2131m0 abstractC2131m0) {
        a.set(this, null);
        return U9.b;
    }
}
