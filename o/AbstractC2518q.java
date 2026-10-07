package o;

/* JADX INFO: renamed from: o.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2518q extends JH implements InterfaceC0473Hh, InterfaceC1608gi {
    public final InterfaceC1022ai n;

    public AbstractC2518q(InterfaceC1022ai interfaceC1022ai, boolean z) {
        super(z);
        S((AH) interfaceC1022ai.q(C2691rp.v));
        this.n = interfaceC1022ai.Q(this);
    }

    @Override // o.JH
    public final String C() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // o.JH
    public final void R(C0730Rf c0730Rf) {
        Pu0.m(this.n, c0730Rf);
    }

    @Override // o.JH
    public String Z() {
        return super.Z();
    }

    @Override // o.JH, o.AH
    public boolean a() {
        return super.a();
    }

    @Override // o.JH
    public final void c0(Object obj) {
        if (!(obj instanceof C0678Pf)) {
            j0(obj);
            return;
        }
        C0678Pf c0678Pf = (C0678Pf) obj;
        Throwable th = c0678Pf.a;
        c0678Pf.getClass();
        i0(th, C0678Pf.b.get(c0678Pf) != 0);
    }

    @Override // o.InterfaceC0473Hh
    public final InterfaceC1022ai g() {
        return this.n;
    }

    @Override // o.InterfaceC0473Hh
    public final void j(Object obj) {
        Throwable thA = C2536q80.a(obj);
        if (thA != null) {
            obj = new C0678Pf(thA, false);
        }
        Object objY = Y(obj);
        if (objY == AbstractC1376eG.c) {
            return;
        }
        x(objY);
    }

    public final void k0(int i, AbstractC2518q abstractC2518q, InterfaceC0775Sy interfaceC0775Sy) {
        int iW = AbstractC1701hf0.w(i);
        if (iW == 0) {
            Nr0.F(interfaceC0775Sy, abstractC2518q, this);
            return;
        }
        if (iW != 1) {
            if (iW == 2) {
                AbstractC1474fG.j(interfaceC0775Sy, "<this>");
                Ou0.p(Ou0.e(abstractC2518q, this, interfaceC0775Sy)).j(C2985uq0.a);
                return;
            }
            if (iW != 3) {
                throw new C0730Rf();
            }
            try {
                InterfaceC1022ai interfaceC1022ai = this.n;
                Object objI = Ou0.I(interfaceC1022ai, null);
                try {
                    Jp0.d(2, interfaceC0775Sy);
                    Object objI2 = interfaceC0775Sy.i(abstractC2518q, this);
                    Ou0.y(interfaceC1022ai, objI);
                    if (objI2 != EnumC1706hi.l) {
                        j(objI2);
                    }
                } catch (Throwable th) {
                    Ou0.y(interfaceC1022ai, objI);
                    throw th;
                }
            } catch (Throwable th2) {
                j(Jp0.k(th2));
            }
        }
    }

    @Override // o.InterfaceC1608gi
    public final InterfaceC1022ai t() {
        return this.n;
    }

    public void j0(Object obj) {
    }

    public void i0(Throwable th, boolean z) {
    }
}
