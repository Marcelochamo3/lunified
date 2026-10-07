package o;

/* JADX INFO: renamed from: o.ew, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1440ew {
    public int a;
    public C0394Eg d;
    public C0394Eg e;
    public C0394Eg f;
    public C0394Eg g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ C1636gw r;
    public C0731Rg b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f764o = 0;
    public int p = 0;

    public C1440ew(C1636gw c1636gw, int i, C0394Eg c0394Eg, C0394Eg c0394Eg2, C0394Eg c0394Eg3, C0394Eg c0394Eg4, int i2) {
        this.r = c1636gw;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.q = 0;
        this.a = i;
        this.d = c0394Eg;
        this.e = c0394Eg2;
        this.f = c0394Eg3;
        this.g = c0394Eg4;
        this.h = c1636gw.w0;
        this.i = c1636gw.s0;
        this.j = c1636gw.x0;
        this.k = c1636gw.t0;
        this.q = i2;
    }

    public final void a(C0731Rg c0731Rg) {
        int i = this.a;
        C1636gw c1636gw = this.r;
        if (i == 0) {
            int iU = c1636gw.U(c0731Rg, this.q);
            if (c0731Rg.p0[0] == 3) {
                this.p++;
                iU = 0;
            }
            this.l = iU + (c0731Rg.g0 != 8 ? c1636gw.P0 : 0) + this.l;
            int iT = c1636gw.T(c0731Rg, this.q);
            if (this.b == null || this.c < iT) {
                this.b = c0731Rg;
                this.c = iT;
                this.m = iT;
            }
        } else {
            int iU2 = c1636gw.U(c0731Rg, this.q);
            int iT2 = c1636gw.T(c0731Rg, this.q);
            if (c0731Rg.p0[1] == 3) {
                this.p++;
                iT2 = 0;
            }
            this.m = iT2 + (c0731Rg.g0 != 8 ? c1636gw.Q0 : 0) + this.m;
            if (this.b == null || this.c < iU2) {
                this.b = c0731Rg;
                this.c = iU2;
                this.l = iU2;
            }
        }
        this.f764o++;
    }

    public final void b(int i, boolean z, boolean z2) {
        C1636gw c1636gw;
        int i2;
        int i3;
        C0731Rg c0731Rg;
        int i4;
        float f;
        int i5;
        int i6;
        int i7 = this.f764o;
        int i8 = 0;
        while (true) {
            c1636gw = this.r;
            if (i8 >= i7 || (i6 = this.n + i8) >= c1636gw.b1) {
                break;
            }
            C0731Rg c0731Rg2 = c1636gw.a1[i6];
            if (c0731Rg2 != null) {
                c0731Rg2.D();
            }
            i8++;
        }
        if (i7 == 0 || this.b == null) {
            return;
        }
        boolean z3 = z2 && i == 0;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < i7; i11++) {
            int i12 = this.n + (z ? (i7 - 1) - i11 : i11);
            if (i12 >= c1636gw.b1) {
                break;
            }
            C0731Rg c0731Rg3 = c1636gw.a1[i12];
            if (c0731Rg3 != null && c0731Rg3.g0 == 0) {
                if (i9 == -1) {
                    i9 = i11;
                }
                i10 = i11;
            }
        }
        if (this.a != 0) {
            C0731Rg c0731Rg4 = this.b;
            c0731Rg4.i0 = c1636gw.D0;
            int i13 = this.h;
            if (i > 0) {
                i13 += c1636gw.P0;
            }
            C0394Eg c0394Eg = c0731Rg4.I;
            C0394Eg c0394Eg2 = c0731Rg4.K;
            if (z) {
                c0394Eg2.a(this.f, i13);
                if (z2) {
                    c0394Eg.a(this.d, this.j);
                }
                if (i > 0) {
                    this.f.d.I.a(c0394Eg2, 0);
                }
            } else {
                c0394Eg.a(this.d, i13);
                if (z2) {
                    c0394Eg2.a(this.f, this.j);
                }
                if (i > 0) {
                    this.d.d.K.a(c0394Eg, 0);
                }
            }
            C0731Rg c0731Rg5 = null;
            for (int i14 = 0; i14 < i7; i14++) {
                int i15 = this.n + i14;
                if (i15 >= c1636gw.b1) {
                    return;
                }
                C0731Rg c0731Rg6 = c1636gw.a1[i15];
                if (c0731Rg6 != null) {
                    C0394Eg c0394Eg3 = c0731Rg6.J;
                    if (i14 == 0) {
                        c0731Rg6.f(c0394Eg3, this.e, this.i);
                        int i16 = c1636gw.E0;
                        float f2 = c1636gw.K0;
                        if (this.n == 0) {
                            i3 = c1636gw.G0;
                            i2 = -1;
                            if (i3 != -1) {
                                f2 = c1636gw.M0;
                            }
                            c0731Rg6.j0 = i3;
                            c0731Rg6.e0 = f2;
                        } else {
                            i2 = -1;
                        }
                        if (!z2 || (i3 = c1636gw.I0) == i2) {
                            i3 = i16;
                        } else {
                            f2 = c1636gw.O0;
                        }
                        c0731Rg6.j0 = i3;
                        c0731Rg6.e0 = f2;
                    }
                    if (i14 == i7 - 1) {
                        c0731Rg6.f(c0731Rg6.L, this.g, this.k);
                    }
                    if (c0731Rg5 != null) {
                        int i17 = c1636gw.Q0;
                        C0394Eg c0394Eg4 = c0731Rg5.L;
                        c0394Eg3.a(c0394Eg4, i17);
                        if (i14 == i9) {
                            int i18 = this.i;
                            if (c0394Eg3.h()) {
                                c0394Eg3.h = i18;
                            }
                        }
                        c0394Eg4.a(c0394Eg3, 0);
                        if (i14 == i10 + 1) {
                            int i19 = this.k;
                            if (c0394Eg4.h()) {
                                c0394Eg4.h = i19;
                            }
                        }
                    }
                    if (c0731Rg6 != c0731Rg4) {
                        C0394Eg c0394Eg5 = c0731Rg6.K;
                        C0394Eg c0394Eg6 = c0731Rg6.I;
                        if (z) {
                            int i20 = c1636gw.R0;
                            if (i20 == 0) {
                                c0394Eg5.a(c0394Eg2, 0);
                            } else if (i20 == 1) {
                                c0394Eg6.a(c0394Eg, 0);
                            } else if (i20 == 2) {
                                c0394Eg6.a(c0394Eg, 0);
                                c0394Eg5.a(c0394Eg2, 0);
                            }
                        } else {
                            int i21 = c1636gw.R0;
                            if (i21 == 0) {
                                c0394Eg6.a(c0394Eg, 0);
                            } else if (i21 == 1) {
                                c0394Eg5.a(c0394Eg2, 0);
                            } else if (i21 == 2) {
                                if (z3) {
                                    c0394Eg6.a(this.d, this.h);
                                    c0394Eg5.a(this.f, this.j);
                                } else {
                                    c0394Eg6.a(c0394Eg, 0);
                                    c0394Eg5.a(c0394Eg2, 0);
                                }
                            }
                        }
                    }
                    c0731Rg5 = c0731Rg6;
                }
            }
            return;
        }
        C0731Rg c0731Rg7 = this.b;
        c0731Rg7.j0 = c1636gw.E0;
        int i22 = this.i;
        if (i > 0) {
            i22 += c1636gw.Q0;
        }
        C0394Eg c0394Eg7 = this.e;
        C0394Eg c0394Eg8 = c0731Rg7.J;
        c0394Eg8.a(c0394Eg7, i22);
        C0394Eg c0394Eg9 = c0731Rg7.L;
        if (z2) {
            c0394Eg9.a(this.g, this.k);
        }
        if (i > 0) {
            this.e.d.L.a(c0394Eg8, 0);
        }
        if (c1636gw.S0 != 3 || c0731Rg7.E) {
            c0731Rg = c0731Rg7;
            break;
        }
        int i23 = 0;
        while (true) {
            if (i23 < i7) {
                int i24 = this.n + (z ? (i7 - 1) - i23 : i23);
                if (i24 < c1636gw.b1) {
                    c0731Rg = c1636gw.a1[i24];
                    if (c0731Rg.E) {
                        break;
                    } else {
                        i23++;
                    }
                }
            }
            c0731Rg = c0731Rg7;
            break;
        }
        C0731Rg c0731Rg8 = null;
        int i25 = 0;
        while (i25 < i7) {
            int i26 = z ? (i7 - 1) - i25 : i25;
            int i27 = this.n + i26;
            if (i27 >= c1636gw.b1) {
                return;
            }
            C0731Rg c0731Rg9 = c1636gw.a1[i27];
            if (c0731Rg9 == null) {
                i7 = i7;
            } else {
                C0394Eg c0394Eg10 = c0731Rg9.I;
                if (i25 == 0) {
                    c0731Rg9.f(c0394Eg10, this.d, this.h);
                }
                if (i26 == 0) {
                    int i28 = c1636gw.D0;
                    float f3 = z ? 1.0f - c1636gw.J0 : c1636gw.J0;
                    if (this.n == 0 && (i5 = c1636gw.F0) != -1) {
                        f = z ? 1.0f - c1636gw.L0 : c1636gw.L0;
                        i4 = i5;
                    } else if (!z2 || (i4 = c1636gw.H0) == -1) {
                        i4 = i28;
                        f = f3;
                    } else {
                        f = z ? 1.0f - c1636gw.N0 : c1636gw.N0;
                    }
                    c0731Rg9.i0 = i4;
                    c0731Rg9.d0 = f;
                }
                if (i25 == i7 - 1) {
                    c0731Rg9.f(c0731Rg9.K, this.f, this.j);
                }
                if (c0731Rg8 != null) {
                    int i29 = c1636gw.P0;
                    C0394Eg c0394Eg11 = c0731Rg8.K;
                    c0394Eg10.a(c0394Eg11, i29);
                    if (i25 == i9) {
                        int i30 = this.h;
                        if (c0394Eg10.h()) {
                            c0394Eg10.h = i30;
                        }
                    }
                    c0394Eg11.a(c0394Eg10, 0);
                    if (i25 == i10 + 1) {
                        int i31 = this.j;
                        if (c0394Eg11.h()) {
                            c0394Eg11.h = i31;
                        }
                    }
                }
                if (c0731Rg9 != c0731Rg7) {
                    int i32 = c1636gw.S0;
                    if (i32 == 3 && c0731Rg.E && c0731Rg9 != c0731Rg && c0731Rg9.E) {
                        c0731Rg9.M.a(c0731Rg.M, 0);
                    } else {
                        C0394Eg c0394Eg12 = c0731Rg9.J;
                        if (i32 != 0) {
                            C0394Eg c0394Eg13 = c0731Rg9.L;
                            if (i32 == 1) {
                                c0394Eg13.a(c0394Eg9, 0);
                            } else if (z3) {
                                c0394Eg12.a(this.e, this.i);
                                c0394Eg13.a(this.g, this.k);
                            } else {
                                c0394Eg12.a(c0394Eg8, 0);
                                c0394Eg13.a(c0394Eg9, 0);
                            }
                        } else {
                            c0394Eg12.a(c0394Eg8, 0);
                        }
                    }
                }
                c0731Rg8 = c0731Rg9;
            }
            i25++;
            i7 = i7;
        }
    }

    public final int c() {
        return this.a == 1 ? this.m - this.r.Q0 : this.m;
    }

    public final int d() {
        return this.a == 0 ? this.l - this.r.P0 : this.l;
    }

    public final void e(int i) {
        C1636gw c1636gw;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f764o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            c1636gw = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= c1636gw.b1) {
                break;
            }
            C0731Rg c0731Rg = c1636gw.a1[i2];
            if (this.a == 0) {
                if (c0731Rg != null) {
                    int[] iArr = c0731Rg.p0;
                    if (iArr[0] == 3 && c0731Rg.r == 0) {
                        c1636gw.W(1, i5, iArr[1], c0731Rg.k(), c0731Rg);
                    }
                }
            } else if (c0731Rg != null) {
                int[] iArr2 = c0731Rg.p0;
                if (iArr2[1] == 3 && c0731Rg.s == 0) {
                    c1636gw.W(iArr2[0], c0731Rg.q(), 1, i5, c0731Rg);
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i7 = this.f764o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.n + i8;
            if (i9 >= c1636gw.b1) {
                return;
            }
            C0731Rg c0731Rg2 = c1636gw.a1[i9];
            if (this.a == 0) {
                int iQ = c0731Rg2.q();
                int i10 = c1636gw.P0;
                if (c0731Rg2.g0 == 8) {
                    i10 = 0;
                }
                this.l = iQ + i10 + this.l;
                int iT = c1636gw.T(c0731Rg2, this.q);
                if (this.b == null || this.c < iT) {
                    this.b = c0731Rg2;
                    this.c = iT;
                    this.m = iT;
                }
            } else {
                int iU = c1636gw.U(c0731Rg2, this.q);
                int iT2 = c1636gw.T(c0731Rg2, this.q);
                int i11 = c1636gw.Q0;
                if (c0731Rg2.g0 == 8) {
                    i11 = 0;
                }
                this.m = iT2 + i11 + this.m;
                if (this.b == null || this.c < iU) {
                    this.b = c0731Rg2;
                    this.c = iU;
                    this.l = iU;
                }
            }
        }
    }

    public final void f(int i, C0394Eg c0394Eg, C0394Eg c0394Eg2, C0394Eg c0394Eg3, C0394Eg c0394Eg4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = c0394Eg;
        this.e = c0394Eg2;
        this.f = c0394Eg3;
        this.g = c0394Eg4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
