package o;

/* JADX INFO: loaded from: classes.dex */
public final class As0 extends AbstractC1637gw0 {
    public C2395om k;
    public C3019v8 l;

    @Override // o.InterfaceC2201mm
    public final void a(InterfaceC2201mm interfaceC2201mm) {
        float f;
        float f2;
        float f3;
        int i;
        if (AbstractC1701hf0.w(this.j) == 3) {
            C0731Rg c0731Rg = this.b;
            l(c0731Rg.J, c0731Rg.L, 1);
            return;
        }
        C0685Pm c0685Pm = this.e;
        if (c0685Pm.c && !c0685Pm.j && this.d == 3) {
            C0731Rg c0731Rg2 = this.b;
            int i2 = c0731Rg2.s;
            if (i2 == 2) {
                C0731Rg c0731Rg3 = c0731Rg2.T;
                if (c0731Rg3 != null) {
                    C0685Pm c0685Pm2 = c0731Rg3.e.e;
                    if (c0685Pm2.j) {
                        c0685Pm.d((int) ((c0685Pm2.g * c0731Rg2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0685Pm c0685Pm3 = c0731Rg2.d.e;
                if (c0685Pm3.j) {
                    int i3 = c0731Rg2.X;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = c0685Pm3.g * c0731Rg2.W;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = c0685Pm3.g;
                            f2 = c0731Rg2.W;
                        }
                        c0685Pm.d(i);
                    } else {
                        f = c0685Pm3.g;
                        f2 = c0731Rg2.W;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c0685Pm.d(i);
                }
            }
        }
        C2395om c2395om = this.h;
        if (c2395om.c) {
            C2395om c2395om2 = this.i;
            if (c2395om2.c) {
                if (c2395om.j && c2395om2.j && c0685Pm.j) {
                    return;
                }
                if (!c0685Pm.j && this.d == 3) {
                    C0731Rg c0731Rg4 = this.b;
                    if (c0731Rg4.r == 0 && !c0731Rg4.y()) {
                        C2395om c2395om3 = (C2395om) c2395om.l.get(0);
                        C2395om c2395om4 = (C2395om) c2395om2.l.get(0);
                        int i4 = c2395om3.g + c2395om.f;
                        int i5 = c2395om4.g + c2395om2.f;
                        c2395om.d(i4);
                        c2395om2.d(i5);
                        c0685Pm.d(i5 - i4);
                        return;
                    }
                }
                if (!c0685Pm.j && this.d == 3 && this.a == 1 && c2395om.l.size() > 0 && c2395om2.l.size() > 0) {
                    C2395om c2395om5 = (C2395om) c2395om.l.get(0);
                    int i6 = (((C2395om) c2395om2.l.get(0)).g + c2395om2.f) - (c2395om5.g + c2395om.f);
                    int i7 = c0685Pm.m;
                    if (i6 < i7) {
                        c0685Pm.d(i6);
                    } else {
                        c0685Pm.d(i7);
                    }
                }
                if (c0685Pm.j && c2395om.l.size() > 0 && c2395om2.l.size() > 0) {
                    C2395om c2395om6 = (C2395om) c2395om.l.get(0);
                    C2395om c2395om7 = (C2395om) c2395om2.l.get(0);
                    int i8 = c2395om6.g;
                    int i9 = c2395om.f + i8;
                    int i10 = c2395om7.g;
                    int i11 = c2395om2.f + i10;
                    float f4 = this.b.e0;
                    if (c2395om6 == c2395om7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c2395om.d((int) ((((i10 - i8) - c0685Pm.g) * f4) + i8 + 0.5f));
                    c2395om2.d(c2395om.g + c0685Pm.g);
                }
            }
        }
    }

    @Override // o.AbstractC1637gw0
    public final void d() {
        C0731Rg c0731Rg;
        C0731Rg c0731Rg2;
        C0731Rg c0731Rg3;
        C0731Rg c0731Rg4;
        C0731Rg c0731Rg5 = this.b;
        boolean z = c0731Rg5.a;
        C0685Pm c0685Pm = this.e;
        if (z) {
            c0685Pm.d(c0731Rg5.k());
        }
        boolean z2 = c0685Pm.j;
        C2395om c2395om = this.i;
        C2395om c2395om2 = this.h;
        if (!z2) {
            C0731Rg c0731Rg6 = this.b;
            this.d = c0731Rg6.p0[1];
            if (c0731Rg6.E) {
                this.l = new C3019v8(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (c0731Rg4 = this.b.T) != null && c0731Rg4.p0[1] == 1) {
                    int iK = (c0731Rg4.k() - this.b.J.e()) - this.b.L.e();
                    AbstractC1637gw0.b(c2395om2, c0731Rg4.e.h, this.b.J.e());
                    AbstractC1637gw0.b(c2395om, c0731Rg4.e.i, -this.b.L.e());
                    c0685Pm.d(iK);
                    return;
                }
                if (i == 1) {
                    c0685Pm.d(this.b.k());
                }
            }
        } else if (this.d == 4 && (c0731Rg2 = (c0731Rg = this.b).T) != null && c0731Rg2.p0[1] == 1) {
            AbstractC1637gw0.b(c2395om2, c0731Rg2.e.h, c0731Rg.J.e());
            AbstractC1637gw0.b(c2395om, c0731Rg2.e.i, -this.b.L.e());
            return;
        }
        boolean z3 = c0685Pm.j;
        C2395om c2395om3 = this.k;
        if (z3) {
            C0731Rg c0731Rg7 = this.b;
            if (c0731Rg7.a) {
                C0394Eg[] c0394EgArr = c0731Rg7.Q;
                C0394Eg c0394Eg = c0394EgArr[2];
                C0394Eg c0394Eg2 = c0394Eg.f;
                if (c0394Eg2 != null && c0394EgArr[3].f != null) {
                    if (c0731Rg7.y()) {
                        c2395om2.f = this.b.Q[2].e();
                        c2395om.f = -this.b.Q[3].e();
                    } else {
                        C2395om c2395omH = AbstractC1637gw0.h(this.b.Q[2]);
                        if (c2395omH != null) {
                            AbstractC1637gw0.b(c2395om2, c2395omH, this.b.Q[2].e());
                        }
                        C2395om c2395omH2 = AbstractC1637gw0.h(this.b.Q[3]);
                        if (c2395omH2 != null) {
                            AbstractC1637gw0.b(c2395om, c2395omH2, -this.b.Q[3].e());
                        }
                        c2395om2.b = true;
                        c2395om.b = true;
                    }
                    C0731Rg c0731Rg8 = this.b;
                    if (c0731Rg8.E) {
                        AbstractC1637gw0.b(c2395om3, c2395om2, c0731Rg8.a0);
                        return;
                    }
                    return;
                }
                if (c0394Eg2 != null) {
                    C2395om c2395omH3 = AbstractC1637gw0.h(c0394Eg);
                    if (c2395omH3 != null) {
                        AbstractC1637gw0.b(c2395om2, c2395omH3, this.b.Q[2].e());
                        AbstractC1637gw0.b(c2395om, c2395om2, c0685Pm.g);
                        C0731Rg c0731Rg9 = this.b;
                        if (c0731Rg9.E) {
                            AbstractC1637gw0.b(c2395om3, c2395om2, c0731Rg9.a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0394Eg c0394Eg3 = c0394EgArr[3];
                if (c0394Eg3.f != null) {
                    C2395om c2395omH4 = AbstractC1637gw0.h(c0394Eg3);
                    if (c2395omH4 != null) {
                        AbstractC1637gw0.b(c2395om, c2395omH4, -this.b.Q[3].e());
                        AbstractC1637gw0.b(c2395om2, c2395om, -c0685Pm.g);
                    }
                    C0731Rg c0731Rg10 = this.b;
                    if (c0731Rg10.E) {
                        AbstractC1637gw0.b(c2395om3, c2395om2, c0731Rg10.a0);
                        return;
                    }
                    return;
                }
                C0394Eg c0394Eg4 = c0394EgArr[4];
                if (c0394Eg4.f != null) {
                    C2395om c2395omH5 = AbstractC1637gw0.h(c0394Eg4);
                    if (c2395omH5 != null) {
                        AbstractC1637gw0.b(c2395om3, c2395omH5, 0);
                        AbstractC1637gw0.b(c2395om2, c2395om3, -this.b.a0);
                        AbstractC1637gw0.b(c2395om, c2395om2, c0685Pm.g);
                        return;
                    }
                    return;
                }
                if ((c0731Rg7 instanceof AbstractC2636rB) || c0731Rg7.T == null || c0731Rg7.i(7).f != null) {
                    return;
                }
                C0731Rg c0731Rg11 = this.b;
                AbstractC1637gw0.b(c2395om2, c0731Rg11.T.e.h, c0731Rg11.s());
                AbstractC1637gw0.b(c2395om, c2395om2, c0685Pm.g);
                C0731Rg c0731Rg12 = this.b;
                if (c0731Rg12.E) {
                    AbstractC1637gw0.b(c2395om3, c2395om2, c0731Rg12.a0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            c0685Pm.b(this);
        } else {
            C0731Rg c0731Rg13 = this.b;
            int i2 = c0731Rg13.s;
            if (i2 == 2) {
                C0731Rg c0731Rg14 = c0731Rg13.T;
                if (c0731Rg14 != null) {
                    C0685Pm c0685Pm2 = c0731Rg14.e.e;
                    c0685Pm.l.add(c0685Pm2);
                    c0685Pm2.k.add(c0685Pm);
                    c0685Pm.b = true;
                    c0685Pm.k.add(c2395om2);
                    c0685Pm.k.add(c2395om);
                }
            } else if (i2 == 3 && !c0731Rg13.y()) {
                C0731Rg c0731Rg15 = this.b;
                if (c0731Rg15.r != 3) {
                    C0685Pm c0685Pm3 = c0731Rg15.d.e;
                    c0685Pm.l.add(c0685Pm3);
                    c0685Pm3.k.add(c0685Pm);
                    c0685Pm.b = true;
                    c0685Pm.k.add(c2395om2);
                    c0685Pm.k.add(c2395om);
                }
            }
        }
        C0731Rg c0731Rg16 = this.b;
        C0394Eg[] c0394EgArr2 = c0731Rg16.Q;
        C0394Eg c0394Eg5 = c0394EgArr2[2];
        C0394Eg c0394Eg6 = c0394Eg5.f;
        if (c0394Eg6 != null && c0394EgArr2[3].f != null) {
            if (c0731Rg16.y()) {
                c2395om2.f = this.b.Q[2].e();
                c2395om.f = -this.b.Q[3].e();
            } else {
                C2395om c2395omH6 = AbstractC1637gw0.h(this.b.Q[2]);
                C2395om c2395omH7 = AbstractC1637gw0.h(this.b.Q[3]);
                if (c2395omH6 != null) {
                    c2395omH6.b(this);
                }
                if (c2395omH7 != null) {
                    c2395omH7.b(this);
                }
                this.j = 4;
            }
            if (this.b.E) {
                c(c2395om3, c2395om2, 1, this.l);
            }
        } else if (c0394Eg6 != null) {
            C2395om c2395omH8 = AbstractC1637gw0.h(c0394Eg5);
            if (c2395omH8 != null) {
                AbstractC1637gw0.b(c2395om2, c2395omH8, this.b.Q[2].e());
                c(c2395om, c2395om2, 1, c0685Pm);
                if (this.b.E) {
                    c(c2395om3, c2395om2, 1, this.l);
                }
                if (this.d == 3) {
                    C0731Rg c0731Rg17 = this.b;
                    if (c0731Rg17.W > 0.0f) {
                        TC tc = c0731Rg17.d;
                        if (tc.d == 3) {
                            tc.e.k.add(c0685Pm);
                            c0685Pm.l.add(this.b.d.e);
                            c0685Pm.a = this;
                        }
                    }
                }
            }
        } else {
            C0394Eg c0394Eg7 = c0394EgArr2[3];
            if (c0394Eg7.f != null) {
                C2395om c2395omH9 = AbstractC1637gw0.h(c0394Eg7);
                if (c2395omH9 != null) {
                    AbstractC1637gw0.b(c2395om, c2395omH9, -this.b.Q[3].e());
                    c(c2395om2, c2395om, -1, c0685Pm);
                    if (this.b.E) {
                        c(c2395om3, c2395om2, 1, this.l);
                    }
                }
            } else {
                C0394Eg c0394Eg8 = c0394EgArr2[4];
                if (c0394Eg8.f != null) {
                    C2395om c2395omH10 = AbstractC1637gw0.h(c0394Eg8);
                    if (c2395omH10 != null) {
                        AbstractC1637gw0.b(c2395om3, c2395omH10, 0);
                        c(c2395om2, c2395om3, -1, this.l);
                        c(c2395om, c2395om2, 1, c0685Pm);
                    }
                } else if (!(c0731Rg16 instanceof AbstractC2636rB) && (c0731Rg3 = c0731Rg16.T) != null) {
                    AbstractC1637gw0.b(c2395om2, c0731Rg3.e.h, c0731Rg16.s());
                    c(c2395om, c2395om2, 1, c0685Pm);
                    if (this.b.E) {
                        c(c2395om3, c2395om2, 1, this.l);
                    }
                    if (this.d == 3) {
                        C0731Rg c0731Rg18 = this.b;
                        if (c0731Rg18.W > 0.0f) {
                            TC tc2 = c0731Rg18.d;
                            if (tc2.d == 3) {
                                tc2.e.k.add(c0685Pm);
                                c0685Pm.l.add(this.b.d.e);
                                c0685Pm.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0685Pm.l.size() == 0) {
            c0685Pm.c = true;
        }
    }

    @Override // o.AbstractC1637gw0
    public final void e() {
        C2395om c2395om = this.h;
        if (c2395om.j) {
            this.b.Z = c2395om.g;
        }
    }

    @Override // o.AbstractC1637gw0
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // o.AbstractC1637gw0
    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        C2395om c2395om = this.h;
        c2395om.c();
        c2395om.j = false;
        C2395om c2395om2 = this.i;
        c2395om2.c();
        c2395om2.j = false;
        C2395om c2395om3 = this.k;
        c2395om3.c();
        c2395om3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.h0;
    }
}
