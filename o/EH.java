package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class EH extends C2937uL implements InterfaceC2300nn, InterfaceC3028vF, InterfaceC0412Ey {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public JH f235o;

    @Override // o.InterfaceC3028vF
    public final boolean a() {
        return true;
    }

    @Override // o.InterfaceC2300nn
    public final void d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        JH jhP = p();
        while (true) {
            Object objO = jhP.O();
            if (objO instanceof EH) {
                if (objO != this) {
                    return;
                }
                C0922Yp c0922Yp = AbstractC1376eG.h;
                do {
                    atomicReferenceFieldUpdater2 = JH.l;
                    if (atomicReferenceFieldUpdater2.compareAndSet(jhP, objO, c0922Yp)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(jhP) == objO);
            } else {
                if (!(objO instanceof InterfaceC3028vF) || ((InterfaceC3028vF) objO).h() == null) {
                    return;
                }
                while (true) {
                    Object objL = l();
                    if (objL instanceof W60) {
                        C2937uL c2937uL = ((W60) objL).a;
                        return;
                    }
                    if (objL == this) {
                        return;
                    }
                    AbstractC1474fG.h(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    C2937uL c2937uL2 = (C2937uL) objL;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C2937uL.n;
                    W60 w60 = (W60) atomicReferenceFieldUpdater3.get(c2937uL2);
                    if (w60 == null) {
                        w60 = new W60(c2937uL2);
                        atomicReferenceFieldUpdater3.lazySet(c2937uL2, w60);
                    }
                    do {
                        atomicReferenceFieldUpdater = C2937uL.l;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, objL, w60)) {
                            c2937uL2.j();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == objL);
                }
            }
        }
    }

    public AH getParent() {
        return p();
    }

    @Override // o.InterfaceC3028vF
    public final C1294dV h() {
        return null;
    }

    public final JH p() {
        JH jh = this.f235o;
        if (jh != null) {
            return jh;
        }
        AbstractC1474fG.U("job");
        throw null;
    }

    public abstract void q(Throwable th);

    @Override // o.C2937uL
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0397Ej.r(this) + "[job@" + AbstractC0397Ej.r(p()) + ']';
    }
}
