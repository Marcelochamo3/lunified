package o;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class Ob0 extends AbstractC3440zb0 {
    public final AtomicReferenceArray p;

    public Ob0(long j, Ob0 ob0, int i) {
        super(j, ob0, i);
        this.p = new AtomicReferenceArray(Nb0.f);
    }

    @Override // o.AbstractC3440zb0
    public final int f() {
        return Nb0.f;
    }

    @Override // o.AbstractC3440zb0
    public final void g(int i, InterfaceC1022ai interfaceC1022ai) {
        this.p.set(i, Nb0.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.n + ", hashCode=" + hashCode() + ']';
    }
}
