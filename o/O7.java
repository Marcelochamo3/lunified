package o;

/* JADX INFO: loaded from: classes.dex */
public final class O7 extends AbstractC2636rB {
    public int s0;
    public boolean t0;
    public int u0;
    public boolean v0;

    @Override // o.C0731Rg
    public final boolean A() {
        return this.v0;
    }

    @Override // o.C0731Rg
    public final boolean B() {
        return this.v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.r0;
            if (i4 >= i) {
                break;
            }
            C0731Rg c0731Rg = this.q0[i4];
            if ((this.t0 || c0731Rg.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !c0731Rg.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !c0731Rg.B()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.r0; i5++) {
            C0731Rg c0731Rg2 = this.q0[i5];
            if (this.t0 || c0731Rg2.c()) {
                if (!z2) {
                    int i6 = this.s0;
                    if (i6 == 0) {
                        iMax = c0731Rg2.i(2).d();
                    } else if (i6 == 1) {
                        iMax = c0731Rg2.i(4).d();
                    } else if (i6 == 2) {
                        iMax = c0731Rg2.i(3).d();
                    } else if (i6 == 3) {
                        iMax = c0731Rg2.i(5).d();
                    }
                    z2 = true;
                }
                int i7 = this.s0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c0731Rg2.i(2).d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c0731Rg2.i(4).d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c0731Rg2.i(3).d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c0731Rg2.i(5).d());
                }
            }
        }
        int i8 = iMax + this.u0;
        int i9 = this.s0;
        if (i9 == 0 || i9 == 1) {
            J(i8, i8);
        } else {
            K(i8, i8);
        }
        this.v0 = true;
        return true;
    }

    public final int U() {
        int i = this.s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // o.C0731Rg
    public final void b(C2742sK c2742sK, boolean z) {
        boolean z2;
        int i;
        int i2;
        C0394Eg[] c0394EgArr = this.Q;
        C0394Eg c0394Eg = this.I;
        c0394EgArr[0] = c0394Eg;
        C0394Eg c0394Eg2 = this.J;
        int i3 = 2;
        c0394EgArr[2] = c0394Eg2;
        C0394Eg c0394Eg3 = this.K;
        c0394EgArr[1] = c0394Eg3;
        C0394Eg c0394Eg4 = this.L;
        c0394EgArr[3] = c0394Eg4;
        for (C0394Eg c0394Eg5 : c0394EgArr) {
            c0394Eg5.i = c2742sK.k(c0394Eg5);
        }
        int i4 = this.s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0394Eg c0394Eg6 = c0394EgArr[i4];
        if (!this.v0) {
            T();
        }
        if (this.v0) {
            this.v0 = false;
            int i5 = this.s0;
            if (i5 == 0 || i5 == 1) {
                c2742sK.d(c0394Eg.i, this.Y);
                c2742sK.d(c0394Eg3.i, this.Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c2742sK.d(c0394Eg2.i, this.Z);
                    c2742sK.d(c0394Eg4.i, this.Z);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.r0) {
                z2 = false;
                break;
            }
            C0731Rg c0731Rg = this.q0[i6];
            if ((this.t0 || c0731Rg.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && c0731Rg.p0[0] == 3 && c0731Rg.I.f != null && c0731Rg.K.f != null) || ((i2 == 2 || i2 == 3) && c0731Rg.p0[1] == 3 && c0731Rg.J.f != null && c0731Rg.L.f != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = c0394Eg.g() || c0394Eg3.g();
        boolean z4 = c0394Eg2.g() || c0394Eg4.g();
        int i7 = (z2 || !(((i = this.s0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.r0) {
            C0731Rg c0731Rg2 = this.q0[i8];
            if (this.t0 || c0731Rg2.c()) {
                C1798if0 c1798if0K = c2742sK.k(c0731Rg2.Q[this.s0]);
                int i9 = this.s0;
                C0394Eg c0394Eg7 = c0731Rg2.Q[i9];
                c0394Eg7.i = c1798if0K;
                C0394Eg c0394Eg8 = c0394Eg7.f;
                int i10 = (c0394Eg8 == null || c0394Eg8.d != this) ? 0 : c0394Eg7.g;
                if (i9 == 0 || i9 == i3) {
                    C1798if0 c1798if0 = c0394Eg6.i;
                    int i11 = this.u0 - i10;
                    T5 t5L = c2742sK.l();
                    C1798if0 c1798if0M = c2742sK.m();
                    c1798if0M.f833o = 0;
                    t5L.c(c1798if0, c1798if0K, c1798if0M, i11);
                    c2742sK.c(t5L);
                } else {
                    C1798if0 c1798if1 = c0394Eg6.i;
                    int i12 = this.u0 + i10;
                    T5 t5L2 = c2742sK.l();
                    C1798if0 c1798if0M2 = c2742sK.m();
                    c1798if0M2.f833o = 0;
                    t5L2.b(c1798if1, c1798if0K, c1798if0M2, i12);
                    c2742sK.c(t5L2);
                }
                c2742sK.e(c0394Eg6.i, c1798if0K, this.u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.s0;
        if (i13 == 0) {
            c2742sK.e(c0394Eg3.i, c0394Eg.i, 0, 8);
            c2742sK.e(c0394Eg.i, this.T.K.i, 0, 4);
            c2742sK.e(c0394Eg.i, this.T.I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c2742sK.e(c0394Eg.i, c0394Eg3.i, 0, 8);
            c2742sK.e(c0394Eg.i, this.T.I.i, 0, 4);
            c2742sK.e(c0394Eg.i, this.T.K.i, 0, 0);
        } else if (i13 == 2) {
            c2742sK.e(c0394Eg4.i, c0394Eg2.i, 0, 8);
            c2742sK.e(c0394Eg2.i, this.T.L.i, 0, 4);
            c2742sK.e(c0394Eg2.i, this.T.J.i, 0, 0);
        } else if (i13 == 3) {
            c2742sK.e(c0394Eg2.i, c0394Eg4.i, 0, 8);
            c2742sK.e(c0394Eg2.i, this.T.J.i, 0, 4);
            c2742sK.e(c0394Eg2.i, this.T.L.i, 0, 0);
        }
    }

    @Override // o.C0731Rg
    public final boolean c() {
        return true;
    }

    @Override // o.C0731Rg
    public final String toString() {
        String strH = AbstractC1701hf0.h(new StringBuilder("[Barrier] "), this.h0, " {");
        for (int i = 0; i < this.r0; i++) {
            C0731Rg c0731Rg = this.q0[i];
            if (i > 0) {
                strH = AbstractC1701hf0.d(strH, ", ");
            }
            StringBuilder sbK = AbstractC1701hf0.k(strH);
            sbK.append(c0731Rg.h0);
            strH = sbK.toString();
        }
        return AbstractC1701hf0.d(strH, "}");
    }
}
