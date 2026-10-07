package o;

/* JADX INFO: renamed from: o.gw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1637gw0 implements InterfaceC2201mm {
    public int a;
    public C0731Rg b;
    public T80 c;
    public int d;
    public final C0685Pm e = new C0685Pm(this);
    public int f = 0;
    public boolean g = false;
    public final C2395om h = new C2395om(this);
    public final C2395om i = new C2395om(this);
    public int j = 1;

    public AbstractC1637gw0(C0731Rg c0731Rg) {
        this.b = c0731Rg;
    }

    public static void b(C2395om c2395om, C2395om c2395om2, int i) {
        c2395om.l.add(c2395om2);
        c2395om.f = i;
        c2395om2.k.add(c2395om);
    }

    public static C2395om h(C0394Eg c0394Eg) {
        C0394Eg c0394Eg2 = c0394Eg.f;
        if (c0394Eg2 == null) {
            return null;
        }
        int iW = AbstractC1701hf0.w(c0394Eg2.e);
        C0731Rg c0731Rg = c0394Eg2.d;
        if (iW == 1) {
            return c0731Rg.d.h;
        }
        if (iW == 2) {
            return c0731Rg.e.h;
        }
        if (iW == 3) {
            return c0731Rg.d.i;
        }
        if (iW == 4) {
            return c0731Rg.e.i;
        }
        if (iW != 5) {
            return null;
        }
        return c0731Rg.e.k;
    }

    public static C2395om i(C0394Eg c0394Eg, int i) {
        C0394Eg c0394Eg2 = c0394Eg.f;
        if (c0394Eg2 == null) {
            return null;
        }
        C0731Rg c0731Rg = c0394Eg2.d;
        AbstractC1637gw0 abstractC1637gw0 = i == 0 ? c0731Rg.d : c0731Rg.e;
        int iW = AbstractC1701hf0.w(c0394Eg2.e);
        if (iW == 1 || iW == 2) {
            return abstractC1637gw0.h;
        }
        if (iW == 3 || iW == 4) {
            return abstractC1637gw0.i;
        }
        return null;
    }

    public final void c(C2395om c2395om, C2395om c2395om2, int i, C0685Pm c0685Pm) {
        c2395om.l.add(c2395om2);
        c2395om.l.add(this.e);
        c2395om.h = i;
        c2395om.i = c0685Pm;
        c2395om2.k.add(c2395om);
        c0685Pm.k.add(c2395om);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            C0731Rg c0731Rg = this.b;
            int i3 = c0731Rg.v;
            iMax = Math.max(c0731Rg.u, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            C0731Rg c0731Rg2 = this.b;
            int i4 = c0731Rg2.y;
            iMax = Math.max(c0731Rg2.x, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    public long j() {
        C0685Pm c0685Pm = this.e;
        if (c0685Pm.j) {
            return c0685Pm.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    public final void l(C0394Eg c0394Eg, C0394Eg c0394Eg2, int i) {
        C0685Pm c0685Pm;
        float f;
        int i2;
        C2395om c2395omH = h(c0394Eg);
        C2395om c2395omH2 = h(c0394Eg2);
        if (c2395omH.j && c2395omH2.j) {
            int iE = c0394Eg.e() + c2395omH.g;
            int iE2 = c2395omH2.g - c0394Eg2.e();
            int i3 = iE2 - iE;
            C0685Pm c0685Pm2 = this.e;
            if (!c0685Pm2.j && this.d == 3) {
                int i4 = this.a;
                if (i4 == 0) {
                    c0685Pm2.d(g(i3, i));
                } else if (i4 == 1) {
                    c0685Pm2.d(Math.min(g(c0685Pm2.m, i), i3));
                } else if (i4 == 2) {
                    C0731Rg c0731Rg = this.b;
                    C0731Rg c0731Rg2 = c0731Rg.T;
                    if (c0731Rg2 != null) {
                        C0685Pm c0685Pm3 = (i == 0 ? c0731Rg2.d : c0731Rg2.e).e;
                        if (c0685Pm3.j) {
                            c0685Pm2.d(g((int) ((c0685Pm3.g * (i == 0 ? c0731Rg.w : c0731Rg.z)) + 0.5f), i));
                        }
                    }
                } else if (i4 == 3) {
                    C0731Rg c0731Rg3 = this.b;
                    AbstractC1637gw0 abstractC1637gw0 = c0731Rg3.d;
                    if (abstractC1637gw0.d == 3 && abstractC1637gw0.a == 3) {
                        As0 as0 = c0731Rg3.e;
                        if (as0.d != 3 || as0.a != 3) {
                            if (i == 0) {
                                abstractC1637gw0 = c0731Rg3.e;
                            }
                            c0685Pm = abstractC1637gw0.e;
                            if (c0685Pm.j) {
                                f = c0731Rg3.W;
                                if (i == 1) {
                                    i2 = (int) ((c0685Pm.g / f) + 0.5f);
                                } else {
                                    i2 = (int) ((f * c0685Pm.g) + 0.5f);
                                }
                                c0685Pm2.d(i2);
                            }
                        }
                    } else {
                        if (i == 0) {
                            abstractC1637gw0 = c0731Rg3.e;
                        }
                        c0685Pm = abstractC1637gw0.e;
                        if (c0685Pm.j) {
                            f = c0731Rg3.W;
                            if (i == 1) {
                                i2 = (int) ((c0685Pm.g / f) + 0.5f);
                            } else {
                                i2 = (int) ((f * c0685Pm.g) + 0.5f);
                            }
                            c0685Pm2.d(i2);
                        }
                    }
                }
            }
            if (c0685Pm2.j) {
                int i5 = c0685Pm2.g;
                C2395om c2395om = this.i;
                C2395om c2395om2 = this.h;
                if (i5 == i3) {
                    c2395om2.d(iE);
                    c2395om.d(iE2);
                    return;
                }
                C0731Rg c0731Rg4 = this.b;
                float f2 = i == 0 ? c0731Rg4.d0 : c0731Rg4.e0;
                if (c2395omH == c2395omH2) {
                    iE = c2395omH.g;
                    iE2 = c2395omH2.g;
                    f2 = 0.5f;
                }
                c2395om2.d((int) ((((iE2 - iE) - i5) * f2) + iE + 0.5f));
                c2395om.d(c2395om2.g + c0685Pm2.g);
            }
        }
    }
}
