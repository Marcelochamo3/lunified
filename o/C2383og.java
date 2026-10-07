package o;

/* JADX INFO: renamed from: o.og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2383og extends I9 {
    public final int w;

    public C2383og(int i, int i2, InterfaceC0412Ey interfaceC0412Ey) {
        super(i, interfaceC0412Ey);
        this.w = i2;
        if (i2 != 1) {
            if (i < 1) {
                throw new IllegalArgumentException(AbstractC1674hK.p("Buffered channel capacity must be at least 1, but ", i, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + AbstractC2822t60.a(I9.class).b() + " instead").toString());
        }
    }

    public final Object H(Object obj, boolean z) {
        C0805Uc c0805Uc;
        InterfaceC0412Ey interfaceC0412Ey;
        C0730Rf c0730RfB;
        C2985uq0 c2985uq0 = C2985uq0.a;
        if (this.w == 3) {
            Object objO = super.o(obj);
            if ((!(objO instanceof C0753Sc)) || (objO instanceof C0727Rc)) {
                return objO;
            }
            if (!z || (interfaceC0412Ey = this.m) == null || (c0730RfB = Sr0.b(interfaceC0412Ey, obj, null)) == null) {
                return c2985uq0;
            }
            throw c0730RfB;
        }
        InterfaceC1518fm interfaceC1518fm = K9.d;
        C0805Uc c0805Uc2 = (C0805Uc) I9.r.get(this);
        while (true) {
            long andIncrement = I9.n.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zU = u(andIncrement, false);
            int i = K9.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (c0805Uc2.n != j3) {
                C0805Uc c0805UcA = I9.a(this, j3, c0805Uc2);
                if (c0805UcA != null) {
                    c0805Uc = c0805UcA;
                } else if (zU) {
                    return new C0727Rc(q());
                }
            } else {
                c0805Uc = c0805Uc2;
            }
            int iG = I9.g(this, c0805Uc, i2, obj, j, interfaceC1518fm, zU);
            if (iG == 0) {
                c0805Uc.a();
                return c2985uq0;
            }
            if (iG == 1) {
                return c2985uq0;
            }
            if (iG == 2) {
                if (zU) {
                    c0805Uc.h();
                    return new C0727Rc(q());
                }
                InterfaceC1927jv0 interfaceC1927jv0 = interfaceC1518fm instanceof InterfaceC1927jv0 ? (InterfaceC1927jv0) interfaceC1518fm : null;
                if (interfaceC1927jv0 != null) {
                    interfaceC1927jv0.b(c0805Uc, i2 + i);
                }
                k((c0805Uc.n * j2) + ((long) i2));
                return c2985uq0;
            }
            if (iG == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iG == 4) {
                if (j < I9.f321o.get(this)) {
                    c0805Uc.a();
                }
                return new C0727Rc(q());
            }
            if (iG == 5) {
                c0805Uc.a();
            }
            c0805Uc2 = c0805Uc;
        }
    }

    @Override // o.I9, o.Pb0
    public final Object e(Object obj, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C0730Rf c0730RfB;
        if (!(H(obj, true) instanceof C0727Rc)) {
            return C2985uq0.a;
        }
        InterfaceC0412Ey interfaceC0412Ey = this.m;
        if (interfaceC0412Ey == null || (c0730RfB = Sr0.b(interfaceC0412Ey, obj, null)) == null) {
            throw q();
        }
        AbstractC3409z9.a(c0730RfB, q());
        throw c0730RfB;
    }

    @Override // o.I9, o.Pb0
    public final Object o(Object obj) {
        return H(obj, false);
    }

    @Override // o.I9
    public final boolean v() {
        return this.w == 2;
    }
}
