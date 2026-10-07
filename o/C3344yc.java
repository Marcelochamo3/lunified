package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: o.yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3344yc extends AbstractC1637gw0 {
    public final ArrayList k;
    public int l;

    public C3344yc(C0731Rg c0731Rg, int i) {
        C0731Rg c0731Rg2;
        super(c0731Rg);
        this.k = new ArrayList();
        this.f = i;
        C0731Rg c0731Rg3 = this.b;
        C0731Rg c0731RgM = c0731Rg3.m(i);
        while (true) {
            C0731Rg c0731Rg4 = c0731RgM;
            c0731Rg2 = c0731Rg3;
            c0731Rg3 = c0731Rg4;
            if (c0731Rg3 == null) {
                break;
            } else {
                c0731RgM = c0731Rg3.m(this.f);
            }
        }
        this.b = c0731Rg2;
        int i2 = this.f;
        AbstractC1637gw0 abstractC1637gw0 = i2 == 0 ? c0731Rg2.d : i2 == 1 ? c0731Rg2.e : null;
        ArrayList<AbstractC1637gw0> arrayList = this.k;
        arrayList.add(abstractC1637gw0);
        C0731Rg c0731RgL = c0731Rg2.l(this.f);
        while (c0731RgL != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? c0731RgL.d : i3 == 1 ? c0731RgL.e : null);
            c0731RgL = c0731RgL.l(this.f);
        }
        for (AbstractC1637gw0 abstractC1637gw1 : arrayList) {
            int i4 = this.f;
            if (i4 == 0) {
                abstractC1637gw1.b.b = this;
            } else if (i4 == 1) {
                abstractC1637gw1.b.c = this;
            }
        }
        if (this.f == 0 && ((C0757Sg) this.b.T).v0 && arrayList.size() > 1) {
            this.b = ((AbstractC1637gw0) AbstractC1701hf0.c(1, arrayList)).b;
        }
        this.l = this.f == 0 ? this.b.i0 : this.b.j0;
    }

    /* JADX WARN: Code duplicated, block: B:295:0x00e5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00da  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0153  */
    @Override // o.InterfaceC2201mm
    public final void a(InterfaceC2201mm interfaceC2201mm) {
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        boolean z;
        ArrayList arrayList2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f2;
        C2395om c2395om = this.h;
        if (c2395om.j) {
            C2395om c2395om2 = this.i;
            if (c2395om2.j) {
                C0731Rg c0731Rg = this.b.T;
                boolean z2 = c0731Rg instanceof C0757Sg ? ((C0757Sg) c0731Rg).v0 : false;
                int i15 = c2395om2.g - c2395om.g;
                ArrayList arrayList3 = this.k;
                int size = arrayList3.size();
                int i16 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i16 >= size) {
                        i16 = -1;
                        break;
                    } else if (((AbstractC1637gw0) arrayList3.get(i16)).b.g0 != 8) {
                        break;
                    } else {
                        i16++;
                    }
                }
                int i17 = size - 1;
                for (int i18 = i17; i18 >= 0; i18--) {
                    if (((AbstractC1637gw0) arrayList3.get(i18)).b.g0 != 8) {
                        i = i18;
                        break;
                    }
                }
                int i19 = 0;
                while (true) {
                    if (i19 >= 2) {
                        arrayList = arrayList3;
                        i3 = i16;
                        i4 = 0;
                        i5 = 0;
                        i6 = 0;
                        f = 0.0f;
                        break;
                    }
                    int i20 = 0;
                    i6 = 0;
                    int i21 = 0;
                    int i22 = 0;
                    f = 0.0f;
                    while (i20 < size) {
                        AbstractC1637gw0 abstractC1637gw0 = (AbstractC1637gw0) arrayList3.get(i20);
                        C0731Rg c0731Rg2 = abstractC1637gw0.b;
                        ArrayList arrayList4 = arrayList3;
                        if (c0731Rg2.g0 == i2) {
                            i13 = i16;
                        } else {
                            i22++;
                            if (i20 > 0 && i20 >= i16) {
                                i6 += abstractC1637gw0.h.f;
                            }
                            C0685Pm c0685Pm = abstractC1637gw0.e;
                            int i23 = c0685Pm.g;
                            i13 = i16;
                            boolean z3 = abstractC1637gw0.d != 3;
                            if (z3) {
                                int i24 = this.f;
                                if (i24 == 0 && !c0731Rg2.d.e.j) {
                                    return;
                                }
                                if (i24 == 1 && !c0731Rg2.e.e.j) {
                                    return;
                                }
                            } else {
                                if (abstractC1637gw0.a == 1 && i19 == 0) {
                                    i14 = c0685Pm.m;
                                    i21++;
                                } else {
                                    if (c0685Pm.j) {
                                        i14 = i23;
                                    }
                                    if (z3) {
                                        i6 += i14;
                                    } else {
                                        i21++;
                                        f2 = c0731Rg2.k0[this.f];
                                        if (f2 >= 0.0f) {
                                            f += f2;
                                        }
                                    }
                                    if (i20 >= i17 && i20 < i) {
                                        i6 += -abstractC1637gw0.i.f;
                                    }
                                }
                                z3 = true;
                                if (z3) {
                                    i21++;
                                    f2 = c0731Rg2.k0[this.f];
                                    if (f2 >= 0.0f) {
                                        f += f2;
                                    }
                                } else {
                                    i6 += i14;
                                }
                                if (i20 >= i17) {
                                }
                            }
                            i14 = i23;
                            if (z3) {
                                i21++;
                                f2 = c0731Rg2.k0[this.f];
                                if (f2 >= 0.0f) {
                                    f += f2;
                                }
                            } else {
                                i6 += i14;
                            }
                            if (i20 >= i17) {
                            }
                        }
                        i20++;
                        arrayList3 = arrayList4;
                        i16 = i13;
                        i2 = 8;
                    }
                    arrayList = arrayList3;
                    i3 = i16;
                    if (i6 < i15 || i21 == 0) {
                        i4 = i21;
                        i5 = i22;
                        break;
                    } else {
                        i19++;
                        arrayList3 = arrayList;
                        i16 = i3;
                        i2 = 8;
                    }
                }
                int i25 = c2395om.g;
                if (z2) {
                    i25 = c2395om2.g;
                }
                if (i6 > i15) {
                    i25 = z2 ? i25 + ((int) (((i6 - i15) / 2.0f) + 0.5f)) : i25 - ((int) (((i6 - i15) / 2.0f) + 0.5f));
                }
                if (i4 > 0) {
                    float f3 = i15 - i6;
                    int i26 = (int) ((f3 / i4) + 0.5f);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < size) {
                        ArrayList arrayList5 = arrayList;
                        AbstractC1637gw0 abstractC1637gw1 = (AbstractC1637gw0) arrayList5.get(i27);
                        int i29 = i26;
                        C0731Rg c0731Rg3 = abstractC1637gw1.b;
                        int i30 = i6;
                        int i31 = i25;
                        if (c0731Rg3.g0 != 8 && abstractC1637gw1.d == 3) {
                            C0685Pm c0685Pm2 = abstractC1637gw1.e;
                            if (c0685Pm2.j) {
                                z2 = z2;
                            } else {
                                int i32 = f > 0.0f ? (int) (((c0731Rg3.k0[this.f] * f3) / f) + 0.5f) : i29;
                                if (this.f == 0) {
                                    i11 = c0731Rg3.v;
                                    i12 = c0731Rg3.u;
                                } else {
                                    i11 = c0731Rg3.y;
                                    i12 = c0731Rg3.x;
                                }
                                int iMax = Math.max(i12, abstractC1637gw1.a == 1 ? Math.min(i32, c0685Pm2.m) : i32);
                                if (i11 > 0) {
                                    iMax = Math.min(i11, iMax);
                                }
                                if (iMax != i32) {
                                    i28++;
                                    i32 = iMax;
                                }
                                c0685Pm2.d(i32);
                            }
                        } else {
                            z2 = z2;
                        }
                        i27++;
                        i26 = i29;
                        i6 = i30;
                        i25 = i31;
                        z2 = z2;
                        f3 = f3;
                        arrayList = arrayList5;
                    }
                    i7 = i25;
                    z = z2;
                    arrayList2 = arrayList;
                    int i33 = i6;
                    if (i28 > 0) {
                        i4 -= i28;
                        int i34 = 0;
                        i6 = 0;
                        while (i34 < size) {
                            AbstractC1637gw0 abstractC1637gw2 = (AbstractC1637gw0) arrayList2.get(i34);
                            if (abstractC1637gw2.b.g0 == 8) {
                                i10 = i3;
                            } else {
                                i10 = i3;
                                if (i34 > 0 && i34 >= i10) {
                                    i6 += abstractC1637gw2.h.f;
                                }
                                i6 += abstractC1637gw2.e.g;
                                if (i34 < i17 && i34 < i) {
                                    i6 += -abstractC1637gw2.i.f;
                                }
                            }
                            i34++;
                            i3 = i10;
                        }
                        i8 = i3;
                    } else {
                        i8 = i3;
                        i6 = i33;
                    }
                    i9 = 2;
                    if (this.l == 2 && i28 == 0) {
                        this.l = 0;
                    }
                } else {
                    i7 = i25;
                    z = z2;
                    arrayList2 = arrayList;
                    i8 = i3;
                    i9 = 2;
                }
                if (i6 > i15) {
                    this.l = i9;
                }
                if (i5 > 0 && i4 == 0 && i8 == i) {
                    this.l = i9;
                }
                int i35 = this.l;
                if (i35 == 1) {
                    int i36 = i5 > 1 ? (i15 - i6) / (i5 - 1) : i5 == 1 ? (i15 - i6) / 2 : 0;
                    if (i4 > 0) {
                        i36 = 0;
                    }
                    int i37 = i7;
                    for (int i38 = 0; i38 < size; i38++) {
                        AbstractC1637gw0 abstractC1637gw3 = (AbstractC1637gw0) arrayList2.get(z ? size - (i38 + 1) : i38);
                        int i39 = abstractC1637gw3.b.g0;
                        C2395om c2395om3 = abstractC1637gw3.i;
                        C2395om c2395om4 = abstractC1637gw3.h;
                        if (i39 == 8) {
                            c2395om4.d(i37);
                            c2395om3.d(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i8) {
                                i37 = z ? i37 - c2395om4.f : i37 + c2395om4.f;
                            }
                            if (z) {
                                c2395om3.d(i37);
                            } else {
                                c2395om4.d(i37);
                            }
                            C0685Pm c0685Pm3 = abstractC1637gw3.e;
                            int i40 = c0685Pm3.g;
                            if (abstractC1637gw3.d == 3 && abstractC1637gw3.a == 1) {
                                i40 = c0685Pm3.m;
                            }
                            i37 = z ? i37 - i40 : i37 + i40;
                            if (z) {
                                c2395om4.d(i37);
                            } else {
                                c2395om3.d(i37);
                            }
                            abstractC1637gw3.g = true;
                            if (i38 < i17 && i38 < i) {
                                i37 = z ? i37 - (-c2395om3.f) : i37 + (-c2395om3.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i41 = (i15 - i6) / (i5 + 1);
                    if (i4 > 0) {
                        i41 = 0;
                    }
                    int i42 = i7;
                    for (int i43 = 0; i43 < size; i43++) {
                        AbstractC1637gw0 abstractC1637gw4 = (AbstractC1637gw0) arrayList2.get(z ? size - (i43 + 1) : i43);
                        int i44 = abstractC1637gw4.b.g0;
                        C2395om c2395om5 = abstractC1637gw4.i;
                        C2395om c2395om6 = abstractC1637gw4.h;
                        if (i44 == 8) {
                            c2395om6.d(i42);
                            c2395om5.d(i42);
                        } else {
                            int i45 = z ? i42 - i41 : i42 + i41;
                            if (i43 > 0 && i43 >= i8) {
                                i45 = z ? i45 - c2395om6.f : i45 + c2395om6.f;
                            }
                            if (z) {
                                c2395om5.d(i45);
                            } else {
                                c2395om6.d(i45);
                            }
                            C0685Pm c0685Pm4 = abstractC1637gw4.e;
                            int iMin = c0685Pm4.g;
                            if (abstractC1637gw4.d == 3 && abstractC1637gw4.a == 1) {
                                iMin = Math.min(iMin, c0685Pm4.m);
                            }
                            i42 = z ? i45 - iMin : i45 + iMin;
                            if (z) {
                                c2395om6.d(i42);
                            } else {
                                c2395om5.d(i42);
                            }
                            if (i43 < i17 && i43 < i) {
                                i42 = z ? i42 - (-c2395om5.f) : i42 + (-c2395om5.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    float f4 = this.f == 0 ? this.b.d0 : this.b.e0;
                    if (z) {
                        f4 = 1.0f - f4;
                    }
                    int i46 = (int) (((i15 - i6) * f4) + 0.5f);
                    if (i46 < 0 || i4 > 0) {
                        i46 = 0;
                    }
                    int i47 = z ? i7 - i46 : i7 + i46;
                    for (int i48 = 0; i48 < size; i48++) {
                        AbstractC1637gw0 abstractC1637gw5 = (AbstractC1637gw0) arrayList2.get(z ? size - (i48 + 1) : i48);
                        int i49 = abstractC1637gw5.b.g0;
                        C2395om c2395om7 = abstractC1637gw5.i;
                        C2395om c2395om8 = abstractC1637gw5.h;
                        if (i49 == 8) {
                            c2395om8.d(i47);
                            c2395om7.d(i47);
                        } else {
                            if (i48 > 0 && i48 >= i8) {
                                i47 = z ? i47 - c2395om8.f : i47 + c2395om8.f;
                            }
                            if (z) {
                                c2395om7.d(i47);
                            } else {
                                c2395om8.d(i47);
                            }
                            C0685Pm c0685Pm5 = abstractC1637gw5.e;
                            int i50 = c0685Pm5.g;
                            if (abstractC1637gw5.d == 3 && abstractC1637gw5.a == 1) {
                                i50 = c0685Pm5.m;
                            }
                            i47 = z ? i47 - i50 : i47 + i50;
                            if (z) {
                                c2395om8.d(i47);
                            } else {
                                c2395om7.d(i47);
                            }
                            if (i48 < i17 && i48 < i) {
                                i47 = z ? i47 - (-c2395om7.f) : i47 + (-c2395om7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // o.AbstractC1637gw0
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC1637gw0) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C0731Rg c0731Rg = ((AbstractC1637gw0) arrayList.get(0)).b;
        C0731Rg c0731Rg2 = ((AbstractC1637gw0) arrayList.get(size - 1)).b;
        int i = this.f;
        C2395om c2395om = this.i;
        C2395om c2395om2 = this.h;
        if (i == 0) {
            C0394Eg c0394Eg = c0731Rg.I;
            C0394Eg c0394Eg2 = c0731Rg2.K;
            C2395om c2395omI = AbstractC1637gw0.i(c0394Eg, 0);
            int iE = c0394Eg.e();
            C0731Rg c0731RgM = m();
            if (c0731RgM != null) {
                iE = c0731RgM.I.e();
            }
            if (c2395omI != null) {
                AbstractC1637gw0.b(c2395om2, c2395omI, iE);
            }
            C2395om c2395omI2 = AbstractC1637gw0.i(c0394Eg2, 0);
            int iE2 = c0394Eg2.e();
            C0731Rg c0731RgN = n();
            if (c0731RgN != null) {
                iE2 = c0731RgN.K.e();
            }
            if (c2395omI2 != null) {
                AbstractC1637gw0.b(c2395om, c2395omI2, -iE2);
            }
        } else {
            C0394Eg c0394Eg3 = c0731Rg.J;
            C0394Eg c0394Eg4 = c0731Rg2.L;
            C2395om c2395omI3 = AbstractC1637gw0.i(c0394Eg3, 1);
            int iE3 = c0394Eg3.e();
            C0731Rg c0731RgM2 = m();
            if (c0731RgM2 != null) {
                iE3 = c0731RgM2.J.e();
            }
            if (c2395omI3 != null) {
                AbstractC1637gw0.b(c2395om2, c2395omI3, iE3);
            }
            C2395om c2395omI4 = AbstractC1637gw0.i(c0394Eg4, 1);
            int iE4 = c0394Eg4.e();
            C0731Rg c0731RgN2 = n();
            if (c0731RgN2 != null) {
                iE4 = c0731RgN2.L.e();
            }
            if (c2395omI4 != null) {
                AbstractC1637gw0.b(c2395om, c2395omI4, -iE4);
            }
        }
        c2395om2.a = this;
        c2395om.a = this;
    }

    @Override // o.AbstractC1637gw0
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC1637gw0) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // o.AbstractC1637gw0
    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((AbstractC1637gw0) it.next()).f();
        }
    }

    @Override // o.AbstractC1637gw0
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            AbstractC1637gw0 abstractC1637gw0 = (AbstractC1637gw0) arrayList.get(i);
            j = ((long) abstractC1637gw0.i.f) + abstractC1637gw0.j() + j + ((long) abstractC1637gw0.h.f);
        }
        return j;
    }

    @Override // o.AbstractC1637gw0
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC1637gw0) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C0731Rg m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            C0731Rg c0731Rg = ((AbstractC1637gw0) arrayList.get(i)).b;
            if (c0731Rg.g0 != 8) {
                return c0731Rg;
            }
            i++;
        }
    }

    public final C0731Rg n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0731Rg c0731Rg = ((AbstractC1637gw0) arrayList.get(size)).b;
            if (c0731Rg.g0 != 8) {
                return c0731Rg;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC1637gw0 abstractC1637gw0 : this.k) {
            sb.append("<");
            sb.append(abstractC1637gw0);
            sb.append("> ");
        }
        return sb.toString();
    }
}
