package o;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: o.Uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0805Uc extends AbstractC3440zb0 {
    public final I9 p;
    public final AtomicReferenceArray q;

    public C0805Uc(long j, C0805Uc c0805Uc, I9 i9, int i) {
        super(j, c0805Uc, i);
        this.p = i9;
        this.q = new AtomicReferenceArray(K9.b * 2);
    }

    @Override // o.AbstractC3440zb0
    public final int f() {
        return K9.b;
    }

    @Override // o.AbstractC3440zb0
    public final void g(int i, InterfaceC1022ai interfaceC1022ai) {
        I9 i9;
        C0730Rf c0730RfB;
        C0730Rf c0730RfB2;
        int i2 = K9.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        Object obj = this.q.get(i * 2);
        while (true) {
            Object objK = k(i);
            boolean z2 = objK instanceof InterfaceC1927jv0;
            i9 = this.p;
            if (z2 || (objK instanceof C2025kv0)) {
                if (j(objK, i, z ? K9.j : K9.k)) {
                    m(i, null);
                    l(i, !z);
                    if (z) {
                        AbstractC1474fG.g(i9);
                        InterfaceC0412Ey interfaceC0412Ey = i9.m;
                        if (interfaceC0412Ey == null || (c0730RfB = Sr0.b(interfaceC0412Ey, obj, null)) == null) {
                            return;
                        }
                        Pu0.m(interfaceC1022ai, c0730RfB);
                        return;
                    }
                    return;
                }
            } else {
                if (objK == K9.j || objK == K9.k) {
                    break;
                }
                if (objK != K9.g && objK != K9.f) {
                    if (objK == K9.i || objK == K9.d || objK == K9.l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objK).toString());
                }
            }
        }
        m(i, null);
        if (z) {
            AbstractC1474fG.g(i9);
            InterfaceC0412Ey interfaceC0412Ey2 = i9.m;
            if (interfaceC0412Ey2 == null || (c0730RfB2 = Sr0.b(interfaceC0412Ey2, obj, null)) == null) {
                return;
            }
            Pu0.m(interfaceC1022ai, c0730RfB2);
        }
    }

    public final boolean j(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.q;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i) {
        return this.q.get((i * 2) + 1);
    }

    public final void l(int i, boolean z) {
        if (z) {
            I9 i9 = this.p;
            AbstractC1474fG.g(i9);
            i9.G((this.n * ((long) K9.b)) + ((long) i));
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.q.lazySet(i * 2, obj);
    }

    public final void n(int i, J2 j2) {
        this.q.set((i * 2) + 1, j2);
    }
}
