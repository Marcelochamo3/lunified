package o;

import java.util.Iterator;

/* JADX INFO: renamed from: o.qB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2540qB extends AbstractC1637gw0 {
    @Override // o.InterfaceC2201mm
    public final void a(InterfaceC2201mm interfaceC2201mm) {
        O7 o7 = (O7) this.b;
        int i = o7.s0;
        C2395om c2395om = this.h;
        Iterator it = c2395om.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C2395om) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c2395om.d(i3 + o7.u0);
        } else {
            c2395om.d(i2 + o7.u0);
        }
    }

    @Override // o.AbstractC1637gw0
    public final void d() {
        C0731Rg c0731Rg = this.b;
        if (c0731Rg instanceof O7) {
            C2395om c2395om = this.h;
            c2395om.b = true;
            O7 o7 = (O7) c0731Rg;
            int i = o7.s0;
            boolean z = o7.t0;
            int i2 = 0;
            if (i == 0) {
                c2395om.e = 4;
                while (i2 < o7.r0) {
                    C0731Rg c0731Rg2 = o7.q0[i2];
                    if (z || c0731Rg2.g0 != 8) {
                        C2395om c2395om2 = c0731Rg2.d.h;
                        c2395om2.k.add(c2395om);
                        c2395om.l.add(c2395om2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                c2395om.e = 5;
                while (i2 < o7.r0) {
                    C0731Rg c0731Rg3 = o7.q0[i2];
                    if (z || c0731Rg3.g0 != 8) {
                        C2395om c2395om3 = c0731Rg3.d.i;
                        c2395om3.k.add(c2395om);
                        c2395om.l.add(c2395om3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                c2395om.e = 6;
                while (i2 < o7.r0) {
                    C0731Rg c0731Rg4 = o7.q0[i2];
                    if (z || c0731Rg4.g0 != 8) {
                        C2395om c2395om4 = c0731Rg4.e.h;
                        c2395om4.k.add(c2395om);
                        c2395om.l.add(c2395om4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c2395om.e = 7;
            while (i2 < o7.r0) {
                C0731Rg c0731Rg5 = o7.q0[i2];
                if (z || c0731Rg5.g0 != 8) {
                    C2395om c2395om5 = c0731Rg5.e.i;
                    c2395om5.k.add(c2395om);
                    c2395om.l.add(c2395om5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // o.AbstractC1637gw0
    public final void e() {
        C0731Rg c0731Rg = this.b;
        if (c0731Rg instanceof O7) {
            int i = ((O7) c0731Rg).s0;
            C2395om c2395om = this.h;
            if (i == 0 || i == 1) {
                c0731Rg.Y = c2395om.g;
            } else {
                c0731Rg.Z = c2395om.g;
            }
        }
    }

    @Override // o.AbstractC1637gw0
    public final void f() {
        this.c = null;
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
