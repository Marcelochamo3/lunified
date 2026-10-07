package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class TC extends AbstractC1637gw0 {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x026b  */
    /* JADX WARN: Code duplicated, block: B:120:0x027a  */
    @Override // o.InterfaceC2201mm
    public final void a(InterfaceC2201mm interfaceC2201mm) {
        int iG;
        int i;
        int iG2;
        float f;
        float f2;
        float f3;
        int i2;
        if (AbstractC1701hf0.w(this.j) == 3) {
            C0731Rg c0731Rg = this.b;
            l(c0731Rg.I, c0731Rg.K, 0);
            return;
        }
        C0685Pm c0685Pm = this.e;
        boolean z = c0685Pm.j;
        C2395om c2395om = this.h;
        C2395om c2395om2 = this.i;
        if (!z && this.d == 3) {
            C0731Rg c0731Rg2 = this.b;
            int i3 = c0731Rg2.r;
            if (i3 == 2) {
                C0731Rg c0731Rg3 = c0731Rg2.T;
                if (c0731Rg3 != null) {
                    C0685Pm c0685Pm2 = c0731Rg3.d.e;
                    if (c0685Pm2.j) {
                        c0685Pm.d((int) ((c0685Pm2.g * c0731Rg2.w) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = c0731Rg2.s;
                if (i4 == 0 || i4 == 3) {
                    As0 as0 = c0731Rg2.e;
                    C2395om c2395om3 = as0.h;
                    C2395om c2395om4 = as0.i;
                    boolean z2 = c0731Rg2.I.f != null;
                    boolean z3 = c0731Rg2.J.f != null;
                    boolean z4 = c0731Rg2.K.f != null;
                    boolean z5 = c0731Rg2.L.f != null;
                    int i5 = c0731Rg2.X;
                    if (z2 && z3 && z4 && z5) {
                        float f4 = c0731Rg2.W;
                        boolean z6 = c2395om3.j;
                        int[] iArr = k;
                        if (z6 && c2395om4.j) {
                            if (c2395om.c && c2395om2.c) {
                                m(iArr, ((C2395om) c2395om.l.get(0)).g + c2395om.f, ((C2395om) c2395om2.l.get(0)).g - c2395om2.f, c2395om3.g + c2395om3.f, c2395om4.g - c2395om4.f, f4, i5);
                                c0685Pm.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z7 = c2395om.j;
                        ArrayList arrayList = c2395om3.l;
                        if (z7 && c2395om2.j) {
                            if (!c2395om3.c || !c2395om4.c) {
                                return;
                            }
                            m(iArr, c2395om.g + c2395om.f, c2395om2.g - c2395om2.f, ((C2395om) arrayList.get(0)).g + c2395om3.f, ((C2395om) c2395om4.l.get(0)).g - c2395om4.f, f4, i5);
                            c0685Pm.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!c2395om.c || !c2395om2.c || !c2395om3.c || !c2395om4.c) {
                            return;
                        }
                        m(iArr, ((C2395om) c2395om.l.get(0)).g + c2395om.f, ((C2395om) c2395om2.l.get(0)).g - c2395om2.f, ((C2395om) arrayList.get(0)).g + c2395om3.f, ((C2395om) c2395om4.l.get(0)).g - c2395om4.f, f4, i5);
                        c0685Pm.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!c2395om.c || !c2395om2.c) {
                            return;
                        }
                        float f5 = c0731Rg2.W;
                        int i6 = ((C2395om) c2395om.l.get(0)).g + c2395om.f;
                        int i7 = ((C2395om) c2395om2.l.get(0)).g - c2395om2.f;
                        if (i5 == -1 || i5 == 0) {
                            int iG3 = g(i7 - i6, 0);
                            int i8 = (int) ((iG3 * f5) + 0.5f);
                            int iG4 = g(i8, 1);
                            if (i8 != iG4) {
                                iG3 = (int) ((iG4 / f5) + 0.5f);
                            }
                            c0685Pm.d(iG3);
                            this.b.e.e.d(iG4);
                        } else if (i5 == 1) {
                            int iG5 = g(i7 - i6, 0);
                            int i9 = (int) ((iG5 / f5) + 0.5f);
                            int iG6 = g(i9, 1);
                            if (i9 != iG6) {
                                iG5 = (int) ((iG6 * f5) + 0.5f);
                            }
                            c0685Pm.d(iG5);
                            this.b.e.e.d(iG6);
                        }
                    } else if (z3 && z5) {
                        if (!c2395om3.c || !c2395om4.c) {
                            return;
                        }
                        float f6 = c0731Rg2.W;
                        int i10 = ((C2395om) c2395om3.l.get(0)).g + c2395om3.f;
                        int i11 = ((C2395om) c2395om4.l.get(0)).g - c2395om4.f;
                        if (i5 == -1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f6) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f6) + 0.5f);
                            }
                            c0685Pm.d(iG2);
                            this.b.e.e.d(iG);
                        } else if (i5 == 0) {
                            int iG7 = g(i11 - i10, 1);
                            int i12 = (int) ((iG7 * f6) + 0.5f);
                            int iG8 = g(i12, 0);
                            if (i12 != iG8) {
                                iG7 = (int) ((iG8 / f6) + 0.5f);
                            }
                            c0685Pm.d(iG8);
                            this.b.e.e.d(iG7);
                        } else if (i5 == 1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f6) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f6) + 0.5f);
                            }
                            c0685Pm.d(iG2);
                            this.b.e.e.d(iG);
                        }
                    }
                } else {
                    int i13 = c0731Rg2.X;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f3 = c0731Rg2.e.e.g / c0731Rg2.W;
                            i2 = (int) (f3 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f = c0731Rg2.e.e.g;
                            f2 = c0731Rg2.W;
                        }
                        c0685Pm.d(i2);
                    } else {
                        f = c0731Rg2.e.e.g;
                        f2 = c0731Rg2.W;
                    }
                    f3 = f * f2;
                    i2 = (int) (f3 + 0.5f);
                    c0685Pm.d(i2);
                }
            }
        }
        if (c2395om.c && c2395om2.c) {
            if (c2395om.j && c2395om2.j && c0685Pm.j) {
                return;
            }
            if (!c0685Pm.j && this.d == 3) {
                C0731Rg c0731Rg4 = this.b;
                if (c0731Rg4.r == 0 && !c0731Rg4.x()) {
                    C2395om c2395om5 = (C2395om) c2395om.l.get(0);
                    C2395om c2395om6 = (C2395om) c2395om2.l.get(0);
                    int i14 = c2395om5.g + c2395om.f;
                    int i15 = c2395om6.g + c2395om2.f;
                    c2395om.d(i14);
                    c2395om2.d(i15);
                    c0685Pm.d(i15 - i14);
                    return;
                }
            }
            if (!c0685Pm.j && this.d == 3 && this.a == 1 && c2395om.l.size() > 0 && c2395om2.l.size() > 0) {
                int iMin = Math.min((((C2395om) c2395om2.l.get(0)).g + c2395om2.f) - (((C2395om) c2395om.l.get(0)).g + c2395om.f), c0685Pm.m);
                C0731Rg c0731Rg5 = this.b;
                int i16 = c0731Rg5.v;
                int iMax = Math.max(c0731Rg5.u, iMin);
                if (i16 > 0) {
                    iMax = Math.min(i16, iMax);
                }
                c0685Pm.d(iMax);
            }
            if (c0685Pm.j) {
                C2395om c2395om7 = (C2395om) c2395om.l.get(0);
                C2395om c2395om8 = (C2395om) c2395om2.l.get(0);
                int i17 = c2395om7.g;
                int i18 = c2395om.f + i17;
                int i19 = c2395om8.g;
                int i20 = c2395om2.f + i19;
                float f7 = this.b.d0;
                if (c2395om7 == c2395om8) {
                    f7 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                c2395om.d((int) ((((i19 - i17) - c0685Pm.g) * f7) + i17 + 0.5f));
                c2395om2.d(c2395om.g + c0685Pm.g);
            }
        }
    }

    @Override // o.AbstractC1637gw0
    public final void d() {
        C0731Rg c0731Rg;
        C0731Rg c0731Rg2;
        int i;
        C0731Rg c0731Rg3;
        C0731Rg c0731Rg4;
        int i2;
        C0731Rg c0731Rg5 = this.b;
        boolean z = c0731Rg5.a;
        C0685Pm c0685Pm = this.e;
        if (z) {
            c0685Pm.d(c0731Rg5.q());
        }
        boolean z2 = c0685Pm.j;
        C2395om c2395om = this.i;
        C2395om c2395om2 = this.h;
        if (!z2) {
            C0731Rg c0731Rg6 = this.b;
            int i3 = c0731Rg6.p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c0731Rg4 = c0731Rg6.T) != null && ((i2 = c0731Rg4.p0[0]) == 1 || i2 == 4)) {
                    int iQ = (c0731Rg4.q() - this.b.I.e()) - this.b.K.e();
                    AbstractC1637gw0.b(c2395om2, c0731Rg4.d.h, this.b.I.e());
                    AbstractC1637gw0.b(c2395om, c0731Rg4.d.i, -this.b.K.e());
                    c0685Pm.d(iQ);
                    return;
                }
                if (i3 == 1) {
                    c0685Pm.d(c0731Rg6.q());
                }
            }
        } else if (this.d == 4 && (c0731Rg2 = (c0731Rg = this.b).T) != null && ((i = c0731Rg2.p0[0]) == 1 || i == 4)) {
            AbstractC1637gw0.b(c2395om2, c0731Rg2.d.h, c0731Rg.I.e());
            AbstractC1637gw0.b(c2395om, c0731Rg2.d.i, -this.b.K.e());
            return;
        }
        if (c0685Pm.j) {
            C0731Rg c0731Rg7 = this.b;
            if (c0731Rg7.a) {
                C0394Eg[] c0394EgArr = c0731Rg7.Q;
                C0394Eg c0394Eg = c0394EgArr[0];
                C0394Eg c0394Eg2 = c0394Eg.f;
                if (c0394Eg2 != null && c0394EgArr[1].f != null) {
                    if (c0731Rg7.x()) {
                        c2395om2.f = this.b.Q[0].e();
                        c2395om.f = -this.b.Q[1].e();
                        return;
                    }
                    C2395om c2395omH = AbstractC1637gw0.h(this.b.Q[0]);
                    if (c2395omH != null) {
                        AbstractC1637gw0.b(c2395om2, c2395omH, this.b.Q[0].e());
                    }
                    C2395om c2395omH2 = AbstractC1637gw0.h(this.b.Q[1]);
                    if (c2395omH2 != null) {
                        AbstractC1637gw0.b(c2395om, c2395omH2, -this.b.Q[1].e());
                    }
                    c2395om2.b = true;
                    c2395om.b = true;
                    return;
                }
                if (c0394Eg2 != null) {
                    C2395om c2395omH3 = AbstractC1637gw0.h(c0394Eg);
                    if (c2395omH3 != null) {
                        AbstractC1637gw0.b(c2395om2, c2395omH3, this.b.Q[0].e());
                        AbstractC1637gw0.b(c2395om, c2395om2, c0685Pm.g);
                        return;
                    }
                    return;
                }
                C0394Eg c0394Eg3 = c0394EgArr[1];
                if (c0394Eg3.f != null) {
                    C2395om c2395omH4 = AbstractC1637gw0.h(c0394Eg3);
                    if (c2395omH4 != null) {
                        AbstractC1637gw0.b(c2395om, c2395omH4, -this.b.Q[1].e());
                        AbstractC1637gw0.b(c2395om2, c2395om, -c0685Pm.g);
                        return;
                    }
                    return;
                }
                if ((c0731Rg7 instanceof AbstractC2636rB) || c0731Rg7.T == null || c0731Rg7.i(7).f != null) {
                    return;
                }
                C0731Rg c0731Rg8 = this.b;
                AbstractC1637gw0.b(c2395om2, c0731Rg8.T.d.h, c0731Rg8.r());
                AbstractC1637gw0.b(c2395om, c2395om2, c0685Pm.g);
                return;
            }
        }
        if (this.d == 3) {
            C0731Rg c0731Rg9 = this.b;
            int i4 = c0731Rg9.r;
            if (i4 == 2) {
                C0731Rg c0731Rg10 = c0731Rg9.T;
                if (c0731Rg10 != null) {
                    C0685Pm c0685Pm2 = c0731Rg10.e.e;
                    c0685Pm.l.add(c0685Pm2);
                    c0685Pm2.k.add(c0685Pm);
                    c0685Pm.b = true;
                    c0685Pm.k.add(c2395om2);
                    c0685Pm.k.add(c2395om);
                }
            } else if (i4 == 3) {
                if (c0731Rg9.s == 3) {
                    c2395om2.a = this;
                    c2395om.a = this;
                    As0 as0 = c0731Rg9.e;
                    as0.h.a = this;
                    as0.i.a = this;
                    c0685Pm.a = this;
                    if (c0731Rg9.y()) {
                        c0685Pm.l.add(this.b.e.e);
                        this.b.e.e.k.add(c0685Pm);
                        As0 as1 = this.b.e;
                        as1.e.a = this;
                        c0685Pm.l.add(as1.h);
                        c0685Pm.l.add(this.b.e.i);
                        this.b.e.h.k.add(c0685Pm);
                        this.b.e.i.k.add(c0685Pm);
                    } else if (this.b.x()) {
                        this.b.e.e.l.add(c0685Pm);
                        c0685Pm.k.add(this.b.e.e);
                    } else {
                        this.b.e.e.l.add(c0685Pm);
                    }
                } else {
                    C0685Pm c0685Pm3 = c0731Rg9.e.e;
                    c0685Pm.l.add(c0685Pm3);
                    c0685Pm3.k.add(c0685Pm);
                    this.b.e.h.k.add(c0685Pm);
                    this.b.e.i.k.add(c0685Pm);
                    c0685Pm.b = true;
                    c0685Pm.k.add(c2395om2);
                    c0685Pm.k.add(c2395om);
                    c2395om2.l.add(c0685Pm);
                    c2395om.l.add(c0685Pm);
                }
            }
        }
        C0731Rg c0731Rg11 = this.b;
        C0394Eg[] c0394EgArr2 = c0731Rg11.Q;
        C0394Eg c0394Eg4 = c0394EgArr2[0];
        C0394Eg c0394Eg5 = c0394Eg4.f;
        if (c0394Eg5 != null && c0394EgArr2[1].f != null) {
            if (c0731Rg11.x()) {
                c2395om2.f = this.b.Q[0].e();
                c2395om.f = -this.b.Q[1].e();
                return;
            }
            C2395om c2395omH5 = AbstractC1637gw0.h(this.b.Q[0]);
            C2395om c2395omH6 = AbstractC1637gw0.h(this.b.Q[1]);
            if (c2395omH5 != null) {
                c2395omH5.b(this);
            }
            if (c2395omH6 != null) {
                c2395omH6.b(this);
            }
            this.j = 4;
            return;
        }
        if (c0394Eg5 != null) {
            C2395om c2395omH7 = AbstractC1637gw0.h(c0394Eg4);
            if (c2395omH7 != null) {
                AbstractC1637gw0.b(c2395om2, c2395omH7, this.b.Q[0].e());
                c(c2395om, c2395om2, 1, c0685Pm);
                return;
            }
            return;
        }
        C0394Eg c0394Eg6 = c0394EgArr2[1];
        if (c0394Eg6.f != null) {
            C2395om c2395omH8 = AbstractC1637gw0.h(c0394Eg6);
            if (c2395omH8 != null) {
                AbstractC1637gw0.b(c2395om, c2395omH8, -this.b.Q[1].e());
                c(c2395om2, c2395om, -1, c0685Pm);
                return;
            }
            return;
        }
        if ((c0731Rg11 instanceof AbstractC2636rB) || (c0731Rg3 = c0731Rg11.T) == null) {
            return;
        }
        AbstractC1637gw0.b(c2395om2, c0731Rg3.d.h, c0731Rg11.r());
        c(c2395om, c2395om2, 1, c0685Pm);
    }

    @Override // o.AbstractC1637gw0
    public final void e() {
        C2395om c2395om = this.h;
        if (c2395om.j) {
            this.b.Y = c2395om.g;
        }
    }

    @Override // o.AbstractC1637gw0
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // o.AbstractC1637gw0
    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        C2395om c2395om = this.h;
        c2395om.c();
        c2395om.j = false;
        C2395om c2395om2 = this.i;
        c2395om2.c();
        c2395om2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.h0;
    }
}
