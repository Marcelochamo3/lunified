package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class IH extends C6 {
    public final C2937uL b;
    public C2937uL c;
    public final /* synthetic */ JH d;
    public final /* synthetic */ Object e;

    public IH(C2937uL c2937uL, JH jh, InterfaceC3028vF interfaceC3028vF) {
        this.d = jh;
        this.e = interfaceC3028vF;
        this.b = c2937uL;
    }

    @Override // o.C6
    public final void b(Object obj, Object obj2) {
        C2937uL c2937uL = (C2937uL) obj;
        boolean z = obj2 == null;
        C2937uL c2937uL2 = this.b;
        C2937uL c2937uL3 = z ? c2937uL2 : this.c;
        if (c2937uL3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2937uL.l;
            while (!atomicReferenceFieldUpdater.compareAndSet(c2937uL, this, c2937uL3)) {
                if (atomicReferenceFieldUpdater.get(c2937uL) != this) {
                    return;
                }
            }
            if (z) {
                C2937uL c2937uL4 = this.c;
                AbstractC1474fG.g(c2937uL4);
                c2937uL2.k(c2937uL4);
            }
        }
    }

    @Override // o.C6
    public final J2 c(Object obj) {
        if (this.d.O() == this.e) {
            return null;
        }
        return AbstractC1474fG.e;
    }
}
