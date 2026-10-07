package o;

/* JADX INFO: loaded from: classes.dex */
public final class IA extends AbstractC1637gw0 {
    @Override // o.InterfaceC2201mm
    public final void a(InterfaceC2201mm interfaceC2201mm) {
        C2395om c2395om = this.h;
        if (c2395om.c && !c2395om.j) {
            c2395om.d((int) ((((C2395om) c2395om.l.get(0)).g * ((HA) this.b).q0) + 0.5f));
        }
    }

    @Override // o.AbstractC1637gw0
    public final void d() {
        C0731Rg c0731Rg = this.b;
        HA ha = (HA) c0731Rg;
        int i = ha.r0;
        int i2 = ha.s0;
        int i3 = ha.u0;
        C2395om c2395om = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c2395om.l.add(c0731Rg.T.d.h);
                this.b.T.d.h.k.add(c2395om);
                c2395om.f = i;
            } else if (i2 != -1) {
                c2395om.l.add(c0731Rg.T.d.i);
                this.b.T.d.i.k.add(c2395om);
                c2395om.f = -i2;
            } else {
                c2395om.b = true;
                c2395om.l.add(c0731Rg.T.d.i);
                this.b.T.d.i.k.add(c2395om);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            c2395om.l.add(c0731Rg.T.e.h);
            this.b.T.e.h.k.add(c2395om);
            c2395om.f = i;
        } else if (i2 != -1) {
            c2395om.l.add(c0731Rg.T.e.i);
            this.b.T.e.i.k.add(c2395om);
            c2395om.f = -i2;
        } else {
            c2395om.b = true;
            c2395om.l.add(c0731Rg.T.e.i);
            this.b.T.e.i.k.add(c2395om);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // o.AbstractC1637gw0
    public final void e() {
        C0731Rg c0731Rg = this.b;
        int i = ((HA) c0731Rg).u0;
        C2395om c2395om = this.h;
        if (i == 1) {
            c0731Rg.Y = c2395om.g;
        } else {
            c0731Rg.Z = c2395om.g;
        }
    }

    @Override // o.AbstractC1637gw0
    public final void f() {
        this.h.c();
    }

    @Override // o.AbstractC1637gw0
    public final boolean k() {
        return false;
    }

    public final void m(C2395om c2395om) {
        C2395om c2395om2 = this.h;
        c2395om2.k.add(c2395om);
        c2395om.l.add(c2395om2);
    }
}
