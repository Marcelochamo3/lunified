package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: o.uL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2937uL {
    public static final AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(C2937uL.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(C2937uL.class, Object.class, "_prev");
    public static final AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(C2937uL.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public final C2937uL j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m;
            C2937uL c2937uL = (C2937uL) atomicReferenceFieldUpdater2.get(this);
            C2937uL c2937uL2 = c2937uL;
            while (true) {
                C2937uL c2937uL3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = l;
                    obj = atomicReferenceFieldUpdater.get(c2937uL2);
                    if (obj == this) {
                        if (c2937uL == c2937uL2) {
                            return c2937uL2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, c2937uL, c2937uL2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != c2937uL) {
                                break;
                            }
                        }
                        return c2937uL2;
                    }
                    if (o()) {
                        return null;
                    }
                    if (obj == null) {
                        return c2937uL2;
                    }
                    if (obj instanceof AbstractC2851tW) {
                        ((AbstractC2851tW) obj).a(c2937uL2);
                        break;
                    }
                    if (!(obj instanceof W60)) {
                        AbstractC1474fG.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        c2937uL3 = c2937uL2;
                        c2937uL2 = (C2937uL) obj;
                    } else {
                        if (c2937uL3 != null) {
                            break;
                        }
                        c2937uL2 = (C2937uL) atomicReferenceFieldUpdater2.get(c2937uL2);
                    }
                }
                C2937uL c2937uL4 = ((W60) obj).a;
                while (!atomicReferenceFieldUpdater.compareAndSet(c2937uL3, c2937uL2, c2937uL4)) {
                    if (atomicReferenceFieldUpdater.get(c2937uL3) != c2937uL2) {
                        break;
                    }
                }
                c2937uL2 = c2937uL3;
            }
        }
    }

    public final void k(C2937uL c2937uL) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
            C2937uL c2937uL2 = (C2937uL) atomicReferenceFieldUpdater.get(c2937uL);
            if (l() != c2937uL) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c2937uL, c2937uL2, this)) {
                    if (o()) {
                        c2937uL.j();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c2937uL) == c2937uL2);
        }
    }

    public final Object l() {
        while (true) {
            Object obj = l.get(this);
            if (!(obj instanceof AbstractC2851tW)) {
                return obj;
            }
            ((AbstractC2851tW) obj).a(this);
        }
    }

    public final C2937uL m() {
        C2937uL c2937uL;
        Object objL = l();
        W60 w60 = objL instanceof W60 ? (W60) objL : null;
        if (w60 != null && (c2937uL = w60.a) != null) {
            return c2937uL;
        }
        AbstractC1474fG.h(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (C2937uL) objL;
    }

    public boolean o() {
        return l() instanceof W60;
    }

    public String toString() {
        return new C2840tL(this, AbstractC0397Ej.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC0397Ej.r(this);
    }
}
