package o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: o.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3296y1 extends WeakReference {
    public final InterfaceC2450pI a;
    public final boolean b;
    public M70 c;

    public C3296y1(InterfaceC2450pI interfaceC2450pI, C3372yq c3372yq, ReferenceQueue referenceQueue, boolean z) {
        M70 m70;
        super(c3372yq, referenceQueue);
        AbstractC3045vW.k(interfaceC2450pI, "Argument must not be null");
        this.a = interfaceC2450pI;
        if (c3372yq.l && z) {
            m70 = c3372yq.n;
            AbstractC3045vW.k(m70, "Argument must not be null");
        } else {
            m70 = null;
        }
        this.c = m70;
        this.b = c3372yq.l;
    }
}
