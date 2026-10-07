package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class F9 implements InterfaceC1927jv0 {
    public Object l = K9.p;
    public C1692hb m;
    public final /* synthetic */ I9 n;

    public F9(I9 i9) {
        this.n = i9;
    }

    public final Object a(InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C0805Uc c0805Uc;
        Boolean bool;
        C0805Uc c0805Uc2;
        int i = 6;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I9.s;
        I9 i9 = this.n;
        C0805Uc c0805Uc3 = (C0805Uc) atomicReferenceFieldUpdater.get(i9);
        while (true) {
            i9.getClass();
            boolean z = true;
            if (i9.u(I9.n.get(i9), true)) {
                this.l = K9.l;
                Throwable thP = i9.p();
                if (thP == null) {
                    return Boolean.FALSE;
                }
                int i2 = Zf0.a;
                throw thP;
            }
            long andIncrement = I9.f321o.getAndIncrement(i9);
            long j = K9.b;
            long j2 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (c0805Uc3.n != j2) {
                C0805Uc c0805UcM = i9.m(j2, c0805Uc3);
                if (c0805UcM == null) {
                    continue;
                } else {
                    c0805Uc = c0805UcM;
                }
            } else {
                c0805Uc = c0805Uc3;
            }
            Object objE = i9.E(c0805Uc, i3, andIncrement, null);
            J2 j3 = K9.m;
            if (objE == j3) {
                throw new IllegalStateException("unreachable".toString());
            }
            J2 j4 = K9.f357o;
            if (objE != j4) {
                if (objE != K9.n) {
                    c0805Uc.a();
                    this.l = objE;
                    return Boolean.TRUE;
                }
                I9 i10 = this.n;
                C1692hb c1692hbT = Jp0.t(Ou0.p(interfaceC0473Hh));
                try {
                    this.m = c1692hbT;
                    AbstractC3440zb0 abstractC3440zb0 = c0805Uc;
                    Object objE2 = i10.E(c0805Uc, i3, andIncrement, this);
                    if (objE2 != j3) {
                        io.sentry.android.replay.p pVar = null;
                        InterfaceC1022ai interfaceC1022ai = c1692hbT.p;
                        InterfaceC0412Ey interfaceC0412Ey = i10.m;
                        if (objE2 == j4) {
                            if (andIncrement < i10.s()) {
                                abstractC3440zb0.a();
                            }
                            C0805Uc c0805Uc4 = (C0805Uc) I9.s.get(i10);
                            while (true) {
                                if (i10.u(I9.n.get(i10), z)) {
                                    C1692hb c1692hb = this.m;
                                    AbstractC1474fG.g(c1692hb);
                                    this.m = null;
                                    this.l = K9.l;
                                    Throwable thP2 = i9.p();
                                    if (thP2 != null) {
                                        c1692hb.j(Jp0.k(thP2));
                                        break;
                                    }
                                    c1692hb.j(Boolean.FALSE);
                                    break;
                                }
                                long andIncrement2 = I9.f321o.getAndIncrement(i10);
                                long j5 = K9.b;
                                long j6 = andIncrement2 / j5;
                                int i4 = (int) (andIncrement2 % j5);
                                if (c0805Uc4.n != j6) {
                                    C0805Uc c0805UcM2 = i10.m(j6, c0805Uc4);
                                    if (c0805UcM2 != null) {
                                        c0805Uc2 = c0805UcM2;
                                    }
                                } else {
                                    c0805Uc2 = c0805Uc4;
                                }
                                InterfaceC0412Ey interfaceC0412Ey2 = interfaceC0412Ey;
                                Object objE3 = i10.E(c0805Uc2, i4, andIncrement2, this);
                                if (objE3 == K9.m) {
                                    b(c0805Uc2, i4);
                                    break;
                                }
                                if (objE3 == K9.f357o) {
                                    if (andIncrement2 < i10.s()) {
                                        c0805Uc2.a();
                                    }
                                    c0805Uc4 = c0805Uc2;
                                    interfaceC0412Ey = interfaceC0412Ey2;
                                    z = true;
                                } else {
                                    if (objE3 == K9.n) {
                                        throw new IllegalStateException("unexpected".toString());
                                    }
                                    c0805Uc2.a();
                                    this.l = objE3;
                                    this.m = null;
                                    bool = Boolean.TRUE;
                                    if (interfaceC0412Ey2 != null) {
                                        pVar = new io.sentry.android.replay.p(interfaceC0412Ey2, objE3, interfaceC1022ai, i);
                                    }
                                }
                            }
                        } else {
                            abstractC3440zb0.a();
                            this.l = objE2;
                            this.m = null;
                            bool = Boolean.TRUE;
                            if (interfaceC0412Ey != null) {
                                pVar = new io.sentry.android.replay.p(interfaceC0412Ey, objE2, interfaceC1022ai, i);
                            }
                        }
                        c1692hbT.h(bool, pVar);
                        break;
                    }
                    b(abstractC3440zb0, i3);
                    return c1692hbT.x();
                } catch (Throwable th) {
                    c1692hbT.F();
                    throw th;
                }
            }
            if (andIncrement < i9.s()) {
                c0805Uc.a();
            }
            c0805Uc3 = c0805Uc;
        }
    }

    @Override // o.InterfaceC1927jv0
    public final void b(AbstractC3440zb0 abstractC3440zb0, int i) {
        C1692hb c1692hb = this.m;
        if (c1692hb != null) {
            c1692hb.b(abstractC3440zb0, i);
        }
    }

    public final Object c() throws Throwable {
        Object obj = this.l;
        J2 j2 = K9.p;
        if (obj == j2) {
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
        this.l = j2;
        if (obj != K9.l) {
            return obj;
        }
        Throwable thP = this.n.p();
        if (thP == null) {
            thP = new C0574Le("Channel was closed");
        }
        int i = Zf0.a;
        throw thP;
    }
}
