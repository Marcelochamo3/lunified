package o;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: o.gw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1636gw extends AbstractC2636rB {
    public int A0;
    public C3213x8 B0;
    public K30 C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public C0731Rg[] X0;
    public C0731Rg[] Y0;
    public int[] Z0;
    public C0731Rg[] a1;
    public int b1;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    @Override // o.AbstractC2636rB
    public final void S() {
        for (int i = 0; i < this.r0; i++) {
            C0731Rg c0731Rg = this.q0[i];
            if (c0731Rg != null) {
                c0731Rg.F = true;
            }
        }
    }

    public final int T(C0731Rg c0731Rg, int i) {
        if (c0731Rg == null) {
            return 0;
        }
        int[] iArr = c0731Rg.p0;
        if (iArr[1] == 3) {
            int i2 = c0731Rg.s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0731Rg.z * i);
                if (i3 != c0731Rg.k()) {
                    c0731Rg.g = true;
                    W(iArr[0], c0731Rg.q(), 1, i3, c0731Rg);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0731Rg.k();
            }
            if (i2 == 3) {
                return (int) ((c0731Rg.q() * c0731Rg.W) + 0.5f);
            }
        }
        return c0731Rg.k();
    }

    public final int U(C0731Rg c0731Rg, int i) {
        if (c0731Rg == null) {
            return 0;
        }
        int[] iArr = c0731Rg.p0;
        if (iArr[0] == 3) {
            int i2 = c0731Rg.r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0731Rg.w * i);
                if (i3 != c0731Rg.q()) {
                    c0731Rg.g = true;
                    W(1, i3, iArr[1], c0731Rg.k(), c0731Rg);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0731Rg.q();
            }
            if (i2 == 3) {
                return (int) ((c0731Rg.k() * c0731Rg.W) + 0.5f);
            }
        }
        return c0731Rg.q();
    }

    /* JADX WARN: Code duplicated, block: B:282:0x049a  */
    /* JADX WARN: Code duplicated, block: B:399:0x076d  */
    /* JADX WARN: Code duplicated, block: B:402:0x0773 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:403:0x0775  */
    /* JADX WARN: Code duplicated, block: B:404:0x077c  */
    /* JADX WARN: Code duplicated, block: B:407:0x0781  */
    /* JADX WARN: Code duplicated, block: B:409:0x0785  */
    /* JADX WARN: Code duplicated, block: B:410:0x0788 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:411:0x078a  */
    /* JADX WARN: Code duplicated, block: B:412:0x0791 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:413:0x0793  */
    /* JADX WARN: Code duplicated, block: B:414:0x0795  */
    /* JADX WARN: Code duplicated, block: B:417:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:418:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:74:0x0106  */
    public final void V(int i, int i2, int i3, int i4) {
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        int i9;
        C1440ew c1440ew;
        char c;
        char c2;
        int iMin;
        int i10;
        int i11;
        int iMin2;
        boolean z;
        int i12;
        int[] iArr2;
        int i13;
        int i14;
        int i15;
        int[] iArr3;
        C0731Rg c0731Rg;
        int i16;
        int i17;
        int iCeil;
        int iCeil2;
        Object obj;
        C0731Rg c0731Rg2;
        int i18;
        int i19;
        C0731Rg[] c0731RgArr;
        int i20;
        ArrayList arrayList;
        int i21;
        C0394Eg c0394Eg;
        C0394Eg c0394Eg2;
        int i22;
        int i23;
        int i24;
        if (this.r0 > 0) {
            C0731Rg c0731Rg3 = this.T;
            K30 k30 = c0731Rg3 != null ? ((C0757Sg) c0731Rg3).u0 : null;
            if (k30 == null) {
                this.z0 = 0;
                this.A0 = 0;
                this.y0 = false;
                return;
            }
            for (int i25 = 0; i25 < this.r0; i25++) {
                C0731Rg c0731Rg4 = this.q0[i25];
                if (c0731Rg4 != null && !(c0731Rg4 instanceof HA)) {
                    int iJ = c0731Rg4.j(0);
                    int iJ2 = c0731Rg4.j(1);
                    if (iJ != 3 || c0731Rg4.r == 1 || iJ2 != 3 || c0731Rg4.s == 1) {
                        if (iJ == 3) {
                            iJ = 2;
                        }
                        if (iJ2 == 3) {
                            iJ2 = 2;
                        }
                        C3213x8 c3213x8 = this.B0;
                        c3213x8.a = iJ;
                        c3213x8.b = iJ2;
                        c3213x8.c = c0731Rg4.q();
                        c3213x8.d = c0731Rg4.k();
                        k30.d(c0731Rg4, c3213x8);
                        c0731Rg4.O(c3213x8.e);
                        c0731Rg4.L(c3213x8.f);
                        c0731Rg4.I(c3213x8.g);
                    }
                }
            }
        }
        int i26 = this.w0;
        int i27 = this.x0;
        int i28 = this.s0;
        int i29 = this.t0;
        int[] iArr4 = new int[2];
        int i30 = (i2 - i26) - i27;
        int i31 = this.V0;
        if (i31 == 1) {
            i30 = (i4 - i28) - i29;
        }
        if (i31 == 0) {
            if (this.D0 == -1) {
                this.D0 = 0;
            }
            if (this.E0 == -1) {
                this.E0 = 0;
            }
        } else {
            if (this.D0 == -1) {
                this.D0 = 0;
            }
            if (this.E0 == -1) {
                this.E0 = 0;
            }
        }
        C0731Rg[] c0731RgArr2 = this.q0;
        int i32 = 0;
        int i33 = 0;
        while (true) {
            i5 = this.r0;
            if (i32 >= i5) {
                break;
            }
            if (this.q0[i32].g0 == 8) {
                i33++;
            }
            i32++;
        }
        if (i33 > 0) {
            c0731RgArr2 = new C0731Rg[i5 - i33];
            int i34 = 0;
            i5 = 0;
            while (i34 < this.r0) {
                C0731Rg c0731Rg5 = this.q0[i34];
                int i35 = i30;
                if (c0731Rg5.g0 != 8) {
                    c0731RgArr2[i5] = c0731Rg5;
                    i5++;
                }
                i34++;
                i30 = i35;
            }
        }
        int i36 = i30;
        C0731Rg[] c0731RgArr3 = c0731RgArr2;
        this.a1 = c0731RgArr3;
        this.b1 = i5;
        int i37 = this.T0;
        ArrayList arrayList2 = this.W0;
        if (i37 == 0) {
            iArr = iArr4;
            i6 = i29;
            i7 = i28;
            i8 = i27;
            i9 = i26;
            int i38 = this.V0;
            if (i5 != 0) {
                if (arrayList2.size() == 0) {
                    c1440ew = new C1440ew(this, i38, this.I, this.J, this.K, this.L, i36);
                    arrayList2.add(c1440ew);
                } else {
                    c1440ew = (C1440ew) arrayList2.get(0);
                    c1440ew.c = 0;
                    c1440ew.b = null;
                    c1440ew.l = 0;
                    c1440ew.m = 0;
                    c1440ew.n = 0;
                    c1440ew.f764o = 0;
                    c1440ew.p = 0;
                    c1440ew.f(i38, this.I, this.J, this.K, this.L, this.w0, this.s0, this.x0, this.t0, i36);
                }
                for (int i39 = 0; i39 < i5; i39++) {
                    c1440ew.a(c0731RgArr3[i39]);
                }
                c = 0;
                iArr[0] = c1440ew.d();
                c2 = 1;
                iArr[1] = c1440ew.c();
            }
            iMin = iArr[c] + i9 + i8;
            i10 = iArr[c2] + i7 + i6;
            if (i == 1073741824) {
                if (i == Integer.MIN_VALUE) {
                    iMin = Math.min(iMin, i2);
                } else {
                    i11 = i3;
                    if (i != 0) {
                        iMin = 0;
                    }
                }
                if (i11 == 1073741824) {
                    iMin2 = i4;
                } else if (i11 == Integer.MIN_VALUE) {
                    iMin2 = Math.min(i10, i4);
                } else if (i11 == 0) {
                    iMin2 = i10;
                } else {
                    iMin2 = 0;
                }
                this.z0 = iMin;
                this.A0 = iMin2;
                O(iMin);
                L(iMin2);
                if (this.r0 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.y0 = z;
            }
            iMin = i2;
            i11 = i3;
            if (i11 == 1073741824) {
                iMin2 = i4;
            } else if (i11 == Integer.MIN_VALUE) {
                iMin2 = Math.min(i10, i4);
            } else if (i11 == 0) {
                iMin2 = i10;
            } else {
                iMin2 = 0;
            }
            this.z0 = iMin;
            this.A0 = iMin2;
            O(iMin);
            L(iMin2);
            if (this.r0 > 0) {
                z = true;
            } else {
                z = false;
            }
            this.y0 = z;
        }
        C0394Eg c0394Eg3 = this.J;
        C0394Eg c0394Eg4 = this.I;
        C0394Eg c0394Eg5 = this.K;
        C0394Eg c0394Eg6 = this.L;
        int[] iArr5 = this.p0;
        if (i37 == 1) {
            iArr = iArr4;
            i6 = i29;
            i7 = i28;
            i8 = i27;
            i9 = i26;
            ArrayList arrayList3 = arrayList2;
            int i40 = this.V0;
            if (i5 != 0) {
                arrayList3.clear();
                C1440ew c1440ew2 = new C1440ew(this, i40, this.I, this.J, this.K, this.L, i36);
                arrayList3.add(c1440ew2);
                if (i40 == 0) {
                    i13 = 0;
                    int i41 = 0;
                    int i42 = 0;
                    while (i42 < i5) {
                        C0731Rg c0731Rg6 = c0731RgArr3[i42];
                        int iU = U(c0731Rg6, i36);
                        if (c0731Rg6.p0[0] == 3) {
                            i13++;
                        }
                        int i43 = i13;
                        boolean z2 = (i41 == i36 || (this.P0 + i41) + iU > i36) && c1440ew2.b != null;
                        if (!z2 && i42 > 0 && (i17 = this.U0) > 0 && i42 % i17 == 0) {
                            z2 = true;
                        }
                        if (z2) {
                            int i44 = i40;
                            iArr3 = iArr5;
                            c0731Rg = c0731Rg6;
                            i15 = i40;
                            i16 = i42;
                            c1440ew2 = new C1440ew(this, i44, this.I, this.J, this.K, this.L, i36);
                            c1440ew2.n = i16;
                            arrayList3.add(c1440ew2);
                        } else {
                            i15 = i40;
                            iArr3 = iArr5;
                            c0731Rg = c0731Rg6;
                            i16 = i42;
                            if (i16 > 0) {
                                i41 = this.P0 + iU + i41;
                            }
                            c1440ew2.a(c0731Rg);
                            i42 = i16 + 1;
                            i13 = i43;
                            iArr5 = iArr3;
                            i40 = i15;
                        }
                        i41 = iU;
                        c1440ew2.a(c0731Rg);
                        i42 = i16 + 1;
                        i13 = i43;
                        iArr5 = iArr3;
                        i40 = i15;
                    }
                    i12 = i40;
                    iArr2 = iArr5;
                } else {
                    i12 = i40;
                    iArr2 = iArr5;
                    i13 = 0;
                    int i45 = 0;
                    int i46 = 0;
                    while (i46 < i5) {
                        C0731Rg c0731Rg7 = c0731RgArr3[i46];
                        int iT = T(c0731Rg7, i36);
                        if (c0731Rg7.p0[1] == 3) {
                            i13++;
                        }
                        int i47 = i13;
                        boolean z3 = (i45 == i36 || (this.Q0 + i45) + iT > i36) && c1440ew2.b != null;
                        if (!z3 && i46 > 0 && (i14 = this.U0) > 0 && i46 % i14 == 0) {
                            z3 = true;
                        }
                        if (z3) {
                            c1440ew2 = new C1440ew(this, i12, this.I, this.J, this.K, this.L, i36);
                            c1440ew2.n = i46;
                            arrayList3.add(c1440ew2);
                        } else {
                            if (i46 > 0) {
                                i45 = this.Q0 + iT + i45;
                            }
                            c1440ew2.a(c0731Rg7);
                            i46++;
                            i13 = i47;
                        }
                        i45 = iT;
                        c1440ew2.a(c0731Rg7);
                        i46++;
                        i13 = i47;
                    }
                }
                int size = arrayList3.size();
                int i48 = this.w0;
                int i49 = this.s0;
                int i50 = this.x0;
                int i51 = this.t0;
                boolean z4 = iArr2[0] == 2 || iArr2[1] == 2;
                if (i13 > 0 && z4) {
                    for (int i52 = 0; i52 < size; i52++) {
                        C1440ew c1440ew3 = (C1440ew) arrayList3.get(i52);
                        if (i12 == 0) {
                            c1440ew3.e(i36 - c1440ew3.d());
                        } else {
                            c1440ew3.e(i36 - c1440ew3.c());
                        }
                    }
                }
                int i53 = i49;
                C0394Eg c0394Eg7 = c0394Eg4;
                C0394Eg c0394Eg8 = c0394Eg5;
                C0394Eg c0394Eg9 = c0394Eg6;
                int i54 = 0;
                int i55 = 0;
                int i56 = 0;
                int i57 = i48;
                C0394Eg c0394Eg10 = c0394Eg3;
                while (i54 < size) {
                    C1440ew c1440ew4 = (C1440ew) arrayList3.get(i54);
                    if (i12 == 0) {
                        if (i54 < size - 1) {
                            c0394Eg9 = ((C1440ew) arrayList3.get(i54 + 1)).b.J;
                            i51 = 0;
                        } else {
                            i51 = this.t0;
                            c0394Eg9 = c0394Eg6;
                        }
                        C0394Eg c0394Eg11 = c1440ew4.b.L;
                        c1440ew4.f(i12, c0394Eg7, c0394Eg10, c0394Eg8, c0394Eg9, i57, i53, i50, i51, i36);
                        int iMax = Math.max(i55, c1440ew4.d());
                        int iC = c1440ew4.c() + i56;
                        if (i54 > 0) {
                            iC += this.Q0;
                        }
                        size = size;
                        i55 = iMax;
                        i56 = iC;
                        c0394Eg10 = c0394Eg11;
                        arrayList3 = arrayList3;
                        i53 = 0;
                    } else {
                        ArrayList arrayList4 = arrayList3;
                        if (i54 < size - 1) {
                            arrayList3 = arrayList4;
                            c0394Eg8 = ((C1440ew) arrayList3.get(i54 + 1)).b.I;
                            i50 = 0;
                        } else {
                            arrayList3 = arrayList4;
                            i50 = this.x0;
                            c0394Eg8 = c0394Eg5;
                        }
                        C0394Eg c0394Eg12 = c1440ew4.b.K;
                        c1440ew4.f(i12, c0394Eg7, c0394Eg10, c0394Eg8, c0394Eg9, i57, i53, i50, i51, i36);
                        int iD = c1440ew4.d() + i55;
                        int iMax2 = Math.max(i56, c1440ew4.c());
                        if (i54 > 0) {
                            iD += this.P0;
                        }
                        i55 = iD;
                        c0394Eg7 = c0394Eg12;
                        i56 = iMax2;
                        i57 = 0;
                    }
                    i54++;
                    size = size;
                }
                iArr[0] = i55;
                iArr[1] = i56;
            }
        } else if (i37 == 2) {
            iArr = iArr4;
            i6 = i29;
            i7 = i28;
            i8 = i27;
            i9 = i26;
            C0731Rg[] c0731RgArr4 = c0731RgArr3;
            int i58 = this.V0;
            if (i58 == 0) {
                int i59 = this.U0;
                if (i59 <= 0) {
                    int i60 = 0;
                    iCeil2 = 0;
                    for (int i61 = 0; i61 < i5; i61++) {
                        if (i61 > 0) {
                            i60 += this.P0;
                        }
                        C0731Rg c0731Rg8 = c0731RgArr4[i61];
                        if (c0731Rg8 != null) {
                            int iU2 = U(c0731Rg8, i36) + i60;
                            if (iU2 > i36) {
                                break;
                            }
                            iCeil2++;
                            i60 = iU2;
                        }
                    }
                } else {
                    iCeil2 = i59;
                }
                iCeil = 0;
            } else {
                iCeil = this.U0;
                if (iCeil <= 0) {
                    int i62 = 0;
                    int i63 = 0;
                    for (int i64 = 0; i64 < i5; i64++) {
                        if (i64 > 0) {
                            i62 += this.Q0;
                        }
                        C0731Rg c0731Rg9 = c0731RgArr4[i64];
                        if (c0731Rg9 != null) {
                            int iT2 = T(c0731Rg9, i36) + i62;
                            if (iT2 > i36) {
                                break;
                            }
                            i63++;
                            i62 = iT2;
                        }
                    }
                    iCeil = i63;
                }
                iCeil2 = 0;
            }
            if (this.Z0 == null) {
                this.Z0 = new int[2];
            }
            boolean z5 = (iCeil == 0 && i58 == 1) || (iCeil2 == 0 && i58 == 0);
            while (!z5) {
                if (i58 == 0) {
                    iCeil = (int) Math.ceil(i5 / iCeil2);
                } else {
                    iCeil2 = (int) Math.ceil(i5 / iCeil);
                }
                C0731Rg[] c0731RgArr5 = this.Y0;
                if (c0731RgArr5 == null || c0731RgArr5.length < iCeil2) {
                    obj = null;
                    this.Y0 = new C0731Rg[iCeil2];
                } else {
                    obj = null;
                    Arrays.fill(c0731RgArr5, (Object) null);
                }
                C0731Rg[] c0731RgArr6 = this.X0;
                if (c0731RgArr6 == null || c0731RgArr6.length < iCeil) {
                    this.X0 = new C0731Rg[iCeil];
                } else {
                    Arrays.fill(c0731RgArr6, obj);
                }
                for (int i65 = 0; i65 < iCeil2; i65++) {
                    int i66 = 0;
                    while (i66 < iCeil) {
                        int i67 = (i66 * iCeil2) + i65;
                        if (i58 == 1) {
                            i67 = (i65 * iCeil) + i66;
                        }
                        C0731Rg[] c0731RgArr7 = c0731RgArr4;
                        if (i67 < c0731RgArr7.length && (c0731Rg2 = c0731RgArr7[i67]) != null) {
                            int iU3 = U(c0731Rg2, i36);
                            C0731Rg c0731Rg10 = this.Y0[i65];
                            if (c0731Rg10 == null || c0731Rg10.q() < iU3) {
                                this.Y0[i65] = c0731Rg2;
                            }
                            int iT3 = T(c0731Rg2, i36);
                            C0731Rg c0731Rg11 = this.X0[i66];
                            if (c0731Rg11 == null || c0731Rg11.k() < iT3) {
                                this.X0[i66] = c0731Rg2;
                            }
                        }
                        i66++;
                        c0731RgArr4 = c0731RgArr7;
                    }
                }
                C0731Rg[] c0731RgArr8 = c0731RgArr4;
                int iU4 = 0;
                for (int i68 = 0; i68 < iCeil2; i68++) {
                    C0731Rg c0731Rg12 = this.Y0[i68];
                    if (c0731Rg12 != null) {
                        if (i68 > 0) {
                            iU4 += this.P0;
                        }
                        iU4 = U(c0731Rg12, i36) + iU4;
                    }
                }
                int iT4 = 0;
                for (int i69 = 0; i69 < iCeil; i69++) {
                    C0731Rg c0731Rg13 = this.X0[i69];
                    if (c0731Rg13 != null) {
                        if (i69 > 0) {
                            iT4 += this.Q0;
                        }
                        iT4 = T(c0731Rg13, i36) + iT4;
                    }
                }
                iArr[0] = iU4;
                iArr[1] = iT4;
                if (i58 == 0) {
                    if (iU4 <= i36 || iCeil2 <= 1) {
                        z5 = true;
                    } else {
                        iCeil2--;
                    }
                } else if (iT4 <= i36 || iCeil <= 1) {
                    z5 = true;
                } else {
                    iCeil--;
                }
                c0731RgArr4 = c0731RgArr8;
            }
            int[] iArr6 = this.Z0;
            iArr6[0] = iCeil2;
            iArr6[1] = iCeil;
        } else if (i37 != 3) {
            iArr = iArr4;
            i6 = i29;
            i7 = i28;
            i8 = i27;
            i9 = i26;
        } else {
            int i70 = this.V0;
            if (i5 == 0) {
                iArr = iArr4;
                i6 = i29;
                i7 = i28;
                i8 = i27;
                i9 = i26;
            } else {
                arrayList2.clear();
                int i71 = i36;
                iArr = iArr4;
                i6 = i29;
                i7 = i28;
                i8 = i27;
                i9 = i26;
                C1440ew c1440ew5 = new C1440ew(this, i70, this.I, this.J, this.K, this.L, i71);
                arrayList2.add(c1440ew5);
                if (i70 == 0) {
                    int i72 = 0;
                    i19 = 0;
                    int i73 = 0;
                    int i74 = 0;
                    while (i74 < i5) {
                        int i75 = i72 + 1;
                        C0731Rg c0731Rg14 = c0731RgArr3[i74];
                        int i76 = i71;
                        int iU5 = U(c0731Rg14, i76);
                        if (c0731Rg14.p0[0] == 3) {
                            i19++;
                        }
                        int i77 = i19;
                        boolean z6 = (i73 == i76 || (this.P0 + i73) + iU5 > i76) && c1440ew5.b != null;
                        if (!z6 && i74 > 0 && (i24 = this.U0) > 0 && i75 > i24) {
                            z6 = true;
                        }
                        if (z6) {
                            i22 = i76;
                            i23 = i74;
                            C1440ew c1440ew6 = new C1440ew(this, i70, this.I, this.J, this.K, this.L, i22);
                            c1440ew6.n = i23;
                            arrayList2.add(c1440ew6);
                            c1440ew5 = c1440ew6;
                            i73 = iU5;
                            i72 = i75;
                        } else {
                            i22 = i76;
                            i23 = i74;
                            i73 = i23 > 0 ? this.P0 + iU5 + i73 : iU5;
                            i72 = 0;
                        }
                        c1440ew5.a(c0731Rg14);
                        i74 = i23 + 1;
                        i19 = i77;
                        i71 = i22;
                    }
                    i18 = i71;
                } else {
                    int i78 = i71;
                    int i79 = 0;
                    int i80 = 0;
                    int i81 = 0;
                    while (i81 < i5) {
                        C0731Rg c0731Rg15 = c0731RgArr3[i81];
                        int i82 = i78;
                        int iT5 = T(c0731Rg15, i82);
                        if (c0731Rg15.p0[1] == 3) {
                            i79++;
                        }
                        int i83 = i79;
                        boolean z7 = (i80 == i82 || (this.Q0 + i80) + iT5 > i82) && c1440ew5.b != null;
                        if (!z7 && i81 > 0 && (i20 = this.U0) > 0 && i20 < 0) {
                            z7 = true;
                        }
                        if (z7) {
                            c0731RgArr = c0731RgArr3;
                            C1440ew c1440ew7 = new C1440ew(this, i70, this.I, this.J, this.K, this.L, i82);
                            c1440ew7.n = i81;
                            arrayList2.add(c1440ew7);
                            c1440ew5 = c1440ew7;
                        } else {
                            c0731RgArr = c0731RgArr3;
                            if (i81 > 0) {
                                i80 = this.Q0 + iT5 + i80;
                            }
                            c1440ew5.a(c0731Rg15);
                            i81++;
                            i79 = i83;
                            c0731RgArr3 = c0731RgArr;
                            i78 = i82;
                        }
                        i80 = iT5;
                        c1440ew5.a(c0731Rg15);
                        i81++;
                        i79 = i83;
                        c0731RgArr3 = c0731RgArr;
                        i78 = i82;
                    }
                    i18 = i78;
                    i19 = i79;
                }
                int size2 = arrayList2.size();
                int i84 = this.w0;
                int i85 = this.s0;
                int i86 = this.x0;
                int i87 = this.t0;
                boolean z8 = iArr5[0] == 2 || iArr5[1] == 2;
                if (i19 > 0 && z8) {
                    for (int i88 = 0; i88 < size2; i88++) {
                        C1440ew c1440ew8 = (C1440ew) arrayList2.get(i88);
                        if (i70 == 0) {
                            c1440ew8.e(i18 - c1440ew8.d());
                        } else {
                            c1440ew8.e(i18 - c1440ew8.c());
                        }
                    }
                }
                int i89 = i85;
                C0394Eg c0394Eg13 = c0394Eg3;
                C0394Eg c0394Eg14 = c0394Eg5;
                C0394Eg c0394Eg15 = c0394Eg6;
                int i90 = 0;
                int i91 = 0;
                int i92 = 0;
                int i93 = i84;
                C0394Eg c0394Eg16 = c0394Eg4;
                while (i90 < size2) {
                    C1440ew c1440ew9 = (C1440ew) arrayList2.get(i90);
                    if (i70 == 0) {
                        if (i90 < size2 - 1) {
                            c0394Eg15 = ((C1440ew) arrayList2.get(i90 + 1)).b.J;
                            i87 = 0;
                        } else {
                            i87 = this.t0;
                            c0394Eg15 = c0394Eg6;
                        }
                        C0394Eg c0394Eg17 = c1440ew9.b.L;
                        c1440ew9.f(i70, c0394Eg16, c0394Eg13, c0394Eg14, c0394Eg15, i93, i89, i86, i87, i18);
                        int iMax3 = Math.max(i91, c1440ew9.d());
                        int iC2 = c1440ew9.c() + i92;
                        if (i90 > 0) {
                            iC2 += this.Q0;
                        }
                        size2 = size2;
                        i91 = iMax3;
                        i92 = iC2;
                        c0394Eg2 = c0394Eg14;
                        c0394Eg13 = c0394Eg17;
                        arrayList = arrayList2;
                        i89 = 0;
                    } else {
                        ArrayList arrayList5 = arrayList2;
                        if (i90 < size2 - 1) {
                            arrayList = arrayList5;
                            c0394Eg = ((C1440ew) arrayList.get(i90 + 1)).b.I;
                            i21 = 0;
                        } else {
                            arrayList = arrayList5;
                            i21 = this.x0;
                            c0394Eg = c0394Eg5;
                        }
                        C0394Eg c0394Eg18 = c1440ew9.b.K;
                        c1440ew9.f(i70, c0394Eg16, c0394Eg13, c0394Eg, c0394Eg15, i93, i89, i21, i87, i18);
                        int iD2 = c1440ew9.d() + i91;
                        int iMax4 = Math.max(i92, c1440ew9.c());
                        if (i90 > 0) {
                            iD2 += this.P0;
                        }
                        i91 = iD2;
                        i92 = iMax4;
                        i93 = 0;
                        c0394Eg16 = c0394Eg18;
                        c0394Eg2 = c0394Eg;
                        i86 = i21;
                    }
                    i90++;
                    arrayList2 = arrayList;
                    c0394Eg14 = c0394Eg2;
                    size2 = size2;
                }
                iArr[0] = i91;
                iArr[1] = i92;
            }
        }
        c = 0;
        c2 = 1;
        iMin = iArr[c] + i9 + i8;
        i10 = iArr[c2] + i7 + i6;
        if (i == 1073741824) {
            if (i == Integer.MIN_VALUE) {
                iMin = Math.min(iMin, i2);
            } else {
                i11 = i3;
                if (i != 0) {
                    iMin = 0;
                }
            }
            if (i11 == 1073741824) {
                iMin2 = i4;
            } else if (i11 == Integer.MIN_VALUE) {
                iMin2 = Math.min(i10, i4);
            } else if (i11 == 0) {
                iMin2 = i10;
            } else {
                iMin2 = 0;
            }
            this.z0 = iMin;
            this.A0 = iMin2;
            O(iMin);
            L(iMin2);
            if (this.r0 > 0) {
                z = true;
            } else {
                z = false;
            }
            this.y0 = z;
        }
        iMin = i2;
        i11 = i3;
        if (i11 == 1073741824) {
            iMin2 = i4;
        } else if (i11 == Integer.MIN_VALUE) {
            iMin2 = Math.min(i10, i4);
        } else if (i11 == 0) {
            iMin2 = i10;
        } else {
            iMin2 = 0;
        }
        this.z0 = iMin;
        this.A0 = iMin2;
        O(iMin);
        L(iMin2);
        if (this.r0 > 0) {
            z = true;
        } else {
            z = false;
        }
        this.y0 = z;
    }

    public final void W(int i, int i2, int i3, int i4, C0731Rg c0731Rg) {
        K30 k30;
        C0731Rg c0731Rg2;
        while (true) {
            k30 = this.C0;
            if (k30 != null || (c0731Rg2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((C0757Sg) c0731Rg2).u0;
            }
        }
        C3213x8 c3213x8 = this.B0;
        c3213x8.a = i;
        c3213x8.b = i3;
        c3213x8.c = i2;
        c3213x8.d = i4;
        k30.d(c0731Rg, c3213x8);
        c0731Rg.O(c3213x8.e);
        c0731Rg.L(c3213x8.f);
        c0731Rg.E = c3213x8.h;
        c0731Rg.I(c3213x8.g);
    }

    @Override // o.C0731Rg
    public final void b(C2742sK c2742sK, boolean z) {
        C0731Rg c0731Rg;
        float f;
        int i;
        super.b(c2742sK, z);
        C0731Rg c0731Rg2 = this.T;
        boolean z2 = c0731Rg2 != null && ((C0757Sg) c0731Rg2).v0;
        int i2 = this.T0;
        ArrayList arrayList = this.W0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((C1440ew) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((C1440ew) arrayList.get(i4)).b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                for (int i5 = 0; i5 < this.b1; i5++) {
                    this.a1[i5].D();
                }
                int[] iArr = this.Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.J0;
                C0731Rg c0731Rg3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.J0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    C0731Rg c0731Rg4 = this.Y0[i];
                    if (c0731Rg4 != null && c0731Rg4.g0 != 8) {
                        C0394Eg c0394Eg = c0731Rg4.I;
                        if (i8 == 0) {
                            c0731Rg4.f(c0394Eg, this.I, this.w0);
                            c0731Rg4.i0 = this.D0;
                            c0731Rg4.d0 = f;
                        }
                        if (i8 == i6 - 1) {
                            c0731Rg4.f(c0731Rg4.K, this.K, this.x0);
                        }
                        if (i8 > 0 && c0731Rg3 != null) {
                            int i9 = this.P0;
                            C0394Eg c0394Eg2 = c0731Rg3.K;
                            c0731Rg4.f(c0394Eg, c0394Eg2, i9);
                            c0731Rg3.f(c0394Eg2, c0394Eg, 0);
                        }
                        c0731Rg3 = c0731Rg4;
                    }
                    i8++;
                    f2 = f;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    C0731Rg c0731Rg5 = this.X0[i10];
                    if (c0731Rg5 != null && c0731Rg5.g0 != 8) {
                        C0394Eg c0394Eg3 = c0731Rg5.J;
                        if (i10 == 0) {
                            c0731Rg5.f(c0394Eg3, this.J, this.s0);
                            c0731Rg5.j0 = this.E0;
                            c0731Rg5.e0 = this.K0;
                        }
                        if (i10 == i7 - 1) {
                            c0731Rg5.f(c0731Rg5.L, this.L, this.t0);
                        }
                        if (i10 > 0 && c0731Rg3 != null) {
                            int i11 = this.Q0;
                            C0394Eg c0394Eg4 = c0731Rg3.L;
                            c0731Rg5.f(c0394Eg3, c0394Eg4, i11);
                            c0731Rg3.f(c0394Eg4, c0394Eg3, 0);
                        }
                        c0731Rg3 = c0731Rg5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        C0731Rg[] c0731RgArr = this.a1;
                        if (i14 < c0731RgArr.length && (c0731Rg = c0731RgArr[i14]) != null && c0731Rg.g0 != 8) {
                            C0731Rg c0731Rg6 = this.Y0[i12];
                            C0731Rg c0731Rg7 = this.X0[i13];
                            if (c0731Rg != c0731Rg6) {
                                c0731Rg.f(c0731Rg.I, c0731Rg6.I, 0);
                                c0731Rg.f(c0731Rg.K, c0731Rg6.K, 0);
                            }
                            if (c0731Rg != c0731Rg7) {
                                c0731Rg.f(c0731Rg.J, c0731Rg7.J, 0);
                                c0731Rg.f(c0731Rg.L, c0731Rg7.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C1440ew) arrayList.get(0)).b(0, z2, true);
        }
        this.y0 = false;
    }
}
