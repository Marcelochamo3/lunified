package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: o.nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2298nm {
    public C0757Sg a;
    public boolean b;
    public boolean c;
    public C0757Sg d;
    public ArrayList e;
    public K30 f;
    public C3213x8 g;
    public ArrayList h;

    public final void a(C2395om c2395om, int i, ArrayList arrayList, T80 t80) {
        AbstractC1637gw0 abstractC1637gw0 = c2395om.d;
        if (abstractC1637gw0.c == null) {
            C0757Sg c0757Sg = this.a;
            if (abstractC1637gw0 == c0757Sg.d || abstractC1637gw0 == c0757Sg.e) {
                return;
            }
            if (t80 == null) {
                t80 = new T80();
                t80.a = null;
                t80.b = new ArrayList();
                t80.a = abstractC1637gw0;
                arrayList.add(t80);
            }
            abstractC1637gw0.c = t80;
            t80.b.add(abstractC1637gw0);
            C2395om c2395om2 = abstractC1637gw0.h;
            for (InterfaceC2201mm interfaceC2201mm : c2395om2.k) {
                if (interfaceC2201mm instanceof C2395om) {
                    a((C2395om) interfaceC2201mm, i, arrayList, t80);
                }
            }
            C2395om c2395om3 = abstractC1637gw0.i;
            for (InterfaceC2201mm interfaceC2201mm2 : c2395om3.k) {
                if (interfaceC2201mm2 instanceof C2395om) {
                    a((C2395om) interfaceC2201mm2, i, arrayList, t80);
                }
            }
            if (i == 1 && (abstractC1637gw0 instanceof As0)) {
                for (InterfaceC2201mm interfaceC2201mm3 : ((As0) abstractC1637gw0).k.k) {
                    if (interfaceC2201mm3 instanceof C2395om) {
                        a((C2395om) interfaceC2201mm3, i, arrayList, t80);
                    }
                }
            }
            Iterator it = c2395om2.l.iterator();
            while (it.hasNext()) {
                a((C2395om) it.next(), i, arrayList, t80);
            }
            Iterator it2 = c2395om3.l.iterator();
            while (it2.hasNext()) {
                a((C2395om) it2.next(), i, arrayList, t80);
            }
            if (i == 1 && (abstractC1637gw0 instanceof As0)) {
                Iterator it3 = ((As0) abstractC1637gw0).k.l.iterator();
                while (it3.hasNext()) {
                    a((C2395om) it3.next(), i, arrayList, t80);
                }
            }
        }
    }

    public final void b(C0757Sg c0757Sg) {
        int iQ;
        int i;
        int iK;
        for (C0731Rg c0731Rg : c0757Sg.q0) {
            int[] iArr = c0731Rg.p0;
            int i2 = iArr[0];
            int i3 = iArr[1];
            if (c0731Rg.g0 == 8) {
                c0731Rg.a = true;
            } else {
                float f = c0731Rg.w;
                if (f < 1.0f && i2 == 3) {
                    c0731Rg.r = 2;
                }
                float f2 = c0731Rg.z;
                if (f2 < 1.0f && i3 == 3) {
                    c0731Rg.s = 2;
                }
                if (c0731Rg.W > 0.0f) {
                    if (i2 == 3 && (i3 == 2 || i3 == 1)) {
                        c0731Rg.r = 3;
                    } else if (i3 == 3 && (i2 == 2 || i2 == 1)) {
                        c0731Rg.s = 3;
                    } else if (i2 == 3 && i3 == 3) {
                        if (c0731Rg.r == 0) {
                            c0731Rg.r = 3;
                        }
                        if (c0731Rg.s == 0) {
                            c0731Rg.s = 3;
                        }
                    }
                }
                C0394Eg c0394Eg = c0731Rg.K;
                C0394Eg c0394Eg2 = c0731Rg.I;
                if (i2 == 3 && c0731Rg.r == 1 && (c0394Eg2.f == null || c0394Eg.f == null)) {
                    i2 = 2;
                }
                C0394Eg c0394Eg3 = c0731Rg.L;
                C0394Eg c0394Eg4 = c0731Rg.J;
                int i4 = (i3 == 3 && c0731Rg.s == 1 && (c0394Eg4.f == null || c0394Eg3.f == null)) ? 2 : i3;
                TC tc = c0731Rg.d;
                tc.d = i2;
                int i5 = c0731Rg.r;
                tc.a = i5;
                As0 as0 = c0731Rg.e;
                as0.d = i4;
                int i6 = c0731Rg.s;
                as0.a = i6;
                if ((i2 == 4 || i2 == 1 || i2 == 2) && (i4 == 4 || i4 == 1 || i4 == 2)) {
                    int iQ2 = c0731Rg.q();
                    if (i2 == 4) {
                        iQ = (c0757Sg.q() - c0394Eg2.g) - c0394Eg.g;
                        i2 = 1;
                    } else {
                        iQ = iQ2;
                    }
                    int iK2 = c0731Rg.k();
                    if (i4 == 4) {
                        iK = (c0757Sg.k() - c0394Eg4.g) - c0394Eg3.g;
                        i = 1;
                    } else {
                        i = i4;
                        iK = iK2;
                    }
                    f(i2, iQ, i, iK, c0731Rg);
                    c0731Rg.d.e.d(c0731Rg.q());
                    c0731Rg.e.e.d(c0731Rg.k());
                    c0731Rg.a = true;
                } else {
                    int[] iArr2 = c0757Sg.p0;
                    C0394Eg[] c0394EgArr = c0731Rg.Q;
                    if (i2 == 3 && (i4 == 2 || i4 == 1)) {
                        if (i5 == 3) {
                            if (i4 == 2) {
                                f(2, 0, 2, 0, c0731Rg);
                            }
                            int iK3 = c0731Rg.k();
                            f(1, (int) ((iK3 * c0731Rg.W) + 0.5f), 1, iK3, c0731Rg);
                            c0731Rg.d.e.d(c0731Rg.q());
                            c0731Rg.e.e.d(c0731Rg.k());
                            c0731Rg.a = true;
                        } else if (i5 == 1) {
                            f(2, 0, i4, 0, c0731Rg);
                            c0731Rg.d.e.m = c0731Rg.q();
                        } else if (i5 == 2) {
                            int i7 = iArr2[0];
                            if (i7 == 1 || i7 == 4) {
                                f(1, (int) ((f * c0757Sg.q()) + 0.5f), i4, c0731Rg.k(), c0731Rg);
                                c0731Rg.d.e.d(c0731Rg.q());
                                c0731Rg.e.e.d(c0731Rg.k());
                                c0731Rg.a = true;
                            }
                        } else if (c0394EgArr[0].f == null || c0394EgArr[1].f == null) {
                            f(2, 0, i4, 0, c0731Rg);
                            c0731Rg.d.e.d(c0731Rg.q());
                            c0731Rg.e.e.d(c0731Rg.k());
                            c0731Rg.a = true;
                        }
                    }
                    if (i4 == 3 && (i2 == 2 || i2 == 1)) {
                        if (i6 == 3) {
                            if (i2 == 2) {
                                f(2, 0, 2, 0, c0731Rg);
                            }
                            int iQ3 = c0731Rg.q();
                            float f3 = c0731Rg.W;
                            if (c0731Rg.X == -1) {
                                f3 = 1.0f / f3;
                            }
                            f(1, iQ3, 1, (int) ((iQ3 * f3) + 0.5f), c0731Rg);
                            c0731Rg.d.e.d(c0731Rg.q());
                            c0731Rg.e.e.d(c0731Rg.k());
                            c0731Rg.a = true;
                        } else if (i6 == 1) {
                            f(i2, 0, 2, 0, c0731Rg);
                            c0731Rg.e.e.m = c0731Rg.k();
                        } else if (i6 == 2) {
                            int i8 = iArr2[1];
                            if (i8 == 1 || i8 == 4) {
                                f(i2, c0731Rg.q(), 1, (int) ((f2 * c0757Sg.k()) + 0.5f), c0731Rg);
                                c0731Rg.d.e.d(c0731Rg.q());
                                c0731Rg.e.e.d(c0731Rg.k());
                                c0731Rg.a = true;
                            }
                        } else if (c0394EgArr[2].f == null || c0394EgArr[3].f == null) {
                            f(2, 0, i4, 0, c0731Rg);
                            c0731Rg.d.e.d(c0731Rg.q());
                            c0731Rg.e.e.d(c0731Rg.k());
                            c0731Rg.a = true;
                        }
                    }
                    if (i2 == 3 && i4 == 3) {
                        if (i5 == 1 || i6 == 1) {
                            f(2, 0, 2, 0, c0731Rg);
                            c0731Rg.d.e.m = c0731Rg.q();
                            c0731Rg.e.e.m = c0731Rg.k();
                        } else if (i6 == 2 && i5 == 2 && iArr2[0] == 1 && iArr2[1] == 1) {
                            f(1, (int) ((f * c0757Sg.q()) + 0.5f), 1, (int) ((f2 * c0757Sg.k()) + 0.5f), c0731Rg);
                            c0731Rg.d.e.d(c0731Rg.q());
                            c0731Rg.e.e.d(c0731Rg.k());
                            c0731Rg.a = true;
                        }
                    }
                }
            }
        }
    }

    public final void c() {
        ArrayList<AbstractC1637gw0> arrayList = this.e;
        arrayList.clear();
        C0757Sg c0757Sg = this.d;
        c0757Sg.d.f();
        c0757Sg.e.f();
        arrayList.add(c0757Sg.d);
        arrayList.add(c0757Sg.e);
        HashSet hashSet = null;
        for (C0731Rg c0731Rg : c0757Sg.q0) {
            if (c0731Rg instanceof HA) {
                IA ia = new IA(c0731Rg);
                c0731Rg.d.f();
                c0731Rg.e.f();
                ia.f = ((HA) c0731Rg).u0;
                arrayList.add(ia);
            } else {
                if (c0731Rg.x()) {
                    if (c0731Rg.b == null) {
                        c0731Rg.b = new C3344yc(c0731Rg, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0731Rg.b);
                } else {
                    arrayList.add(c0731Rg.d);
                }
                if (c0731Rg.y()) {
                    if (c0731Rg.c == null) {
                        c0731Rg.c = new C3344yc(c0731Rg, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0731Rg.c);
                } else {
                    arrayList.add(c0731Rg.e);
                }
                if (c0731Rg instanceof AbstractC2636rB) {
                    arrayList.add(new C2540qB(c0731Rg));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC1637gw0) it.next()).f();
        }
        for (AbstractC1637gw0 abstractC1637gw0 : arrayList) {
            if (abstractC1637gw0.b != c0757Sg) {
                abstractC1637gw0.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        C0757Sg c0757Sg2 = this.a;
        e(c0757Sg2.d, 0, arrayList2);
        e(c0757Sg2.e, 1, arrayList2);
        this.b = false;
    }

    public final int d(C0757Sg c0757Sg, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long j;
        float f;
        long j2;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i4 = 0;
        long jMax = 0;
        while (i4 < size) {
            AbstractC1637gw0 abstractC1637gw0 = ((T80) arrayList2.get(i4)).a;
            if (!(abstractC1637gw0 instanceof C3344yc) ? !(i != 0 ? (abstractC1637gw0 instanceof As0) : (abstractC1637gw0 instanceof TC)) : ((C3344yc) abstractC1637gw0).f != i) {
                C2395om c2395om = (i == 0 ? c0757Sg.d : c0757Sg.e).h;
                C2395om c2395om2 = (i == 0 ? c0757Sg.d : c0757Sg.e).i;
                boolean zContains = abstractC1637gw0.h.l.contains(c2395om);
                C2395om c2395om3 = abstractC1637gw0.i;
                boolean zContains2 = c2395om3.l.contains(c2395om2);
                long j3 = abstractC1637gw0.j();
                C2395om c2395om4 = abstractC1637gw0.h;
                if (zContains && zContains2) {
                    long jB = T80.b(c2395om4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long jA = T80.a(c2395om3, 0L);
                    long j4 = jB - j3;
                    int i5 = c2395om3.f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += (long) i5;
                    }
                    long j5 = (-jA) - j3;
                    long j6 = c2395om4.f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    C0731Rg c0731Rg = abstractC1637gw0.b;
                    if (i == 0) {
                        f = c0731Rg.d0;
                    } else if (i == 1) {
                        f = c0731Rg.e0;
                    } else {
                        c0731Rg.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j2 = (long) ((j4 / (1.0f - f)) + (j7 / f));
                    } else {
                        j2 = 0;
                    }
                    float f2 = j2;
                    j = (((long) c2395om4.f) + ((((long) ((f2 * f) + 0.5f)) + j3) + ((long) (((1.0f - f) * f2) + 0.5f)))) - ((long) c2395om3.f);
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    if (zContains) {
                        j = Math.max(T80.b(c2395om4, c2395om4.f), ((long) c2395om4.f) + j3);
                    } else if (zContains2) {
                        j = Math.max(-T80.a(c2395om3, c2395om3.f), ((long) (-c2395om3.f)) + j3);
                    } else {
                        j = (abstractC1637gw0.j() + ((long) c2395om4.f)) - ((long) c2395om3.f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                j = 0;
            }
            jMax = Math.max(jMax, j);
            i4 = i3 + 1;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) jMax;
    }

    public final void e(AbstractC1637gw0 abstractC1637gw0, int i, ArrayList arrayList) {
        C2395om c2395om;
        Iterator it = abstractC1637gw0.h.k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c2395om = abstractC1637gw0.i;
            if (!zHasNext) {
                break;
            }
            InterfaceC2201mm interfaceC2201mm = (InterfaceC2201mm) it.next();
            if (interfaceC2201mm instanceof C2395om) {
                a((C2395om) interfaceC2201mm, i, arrayList, null);
            } else if (interfaceC2201mm instanceof AbstractC1637gw0) {
                a(((AbstractC1637gw0) interfaceC2201mm).h, i, arrayList, null);
            }
        }
        for (InterfaceC2201mm interfaceC2201mm2 : c2395om.k) {
            if (interfaceC2201mm2 instanceof C2395om) {
                a((C2395om) interfaceC2201mm2, i, arrayList, null);
            } else if (interfaceC2201mm2 instanceof AbstractC1637gw0) {
                a(((AbstractC1637gw0) interfaceC2201mm2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC2201mm interfaceC2201mm3 : ((As0) abstractC1637gw0).k.k) {
                if (interfaceC2201mm3 instanceof C2395om) {
                    a((C2395om) interfaceC2201mm3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, C0731Rg c0731Rg) {
        C3213x8 c3213x8 = this.g;
        c3213x8.a = i;
        c3213x8.b = i3;
        c3213x8.c = i2;
        c3213x8.d = i4;
        this.f.d(c0731Rg, c3213x8);
        c0731Rg.O(c3213x8.e);
        c0731Rg.L(c3213x8.f);
        c0731Rg.E = c3213x8.h;
        c0731Rg.I(c3213x8.g);
    }

    public final void g() {
        C3019v8 c3019v8;
        for (C0731Rg c0731Rg : this.a.q0) {
            if (!c0731Rg.a) {
                int[] iArr = c0731Rg.p0;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c0731Rg.r;
                int i4 = c0731Rg.s;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                C0685Pm c0685Pm = c0731Rg.d.e;
                boolean z3 = c0685Pm.j;
                C0685Pm c0685Pm2 = c0731Rg.e.e;
                boolean z4 = c0685Pm2.j;
                if (z3 && z4) {
                    f(1, c0685Pm.g, 1, c0685Pm2.g, c0731Rg);
                    c0731Rg.a = true;
                } else if (z3 && z) {
                    f(1, c0685Pm.g, 2, c0685Pm2.g, c0731Rg);
                    if (i2 == 3) {
                        c0731Rg.e.e.m = c0731Rg.k();
                    } else {
                        c0731Rg.e.e.d(c0731Rg.k());
                        c0731Rg.a = true;
                    }
                } else if (z4 && z2) {
                    f(2, c0685Pm.g, 1, c0685Pm2.g, c0731Rg);
                    if (i == 3) {
                        c0731Rg.d.e.m = c0731Rg.q();
                    } else {
                        c0731Rg.d.e.d(c0731Rg.q());
                        c0731Rg.a = true;
                    }
                }
                if (c0731Rg.a && (c3019v8 = c0731Rg.e.l) != null) {
                    c3019v8.d(c0731Rg.a0);
                }
            }
        }
    }
}
