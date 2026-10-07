package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class Vm0 implements InterfaceC1497fb0, VV {
    public final /* synthetic */ int l;
    public final Object m;
    public final Object n;

    public /* synthetic */ Vm0(Object obj, int i, Object obj2) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }

    public void a(AbstractC2144m60 abstractC2144m60, C2650rP c2650rP) {
        Nd0 nd0 = (Nd0) this.m;
        St0 st0A = (St0) nd0.get(abstractC2144m60);
        if (st0A == null) {
            st0A = St0.a();
            nd0.put(abstractC2144m60, st0A);
        }
        st0A.c = c2650rP;
        st0A.a |= 8;
    }

    @Override // o.InterfaceC1497fb0
    public void b(C2562qX c2562qX) {
        Wm0 wm0;
        if (c2562qX.u() == 0 && (c2562qX.u() & 128) != 0) {
            c2562qX.G(6);
            int iA = c2562qX.a() / 4;
            int i = 0;
            while (true) {
                wm0 = (Wm0) this.n;
                if (i >= iA) {
                    break;
                }
                C2084lc c2084lc = (C2084lc) this.m;
                c2562qX.e(c2084lc.b, 0, 4);
                c2084lc.p(0);
                int i2 = c2084lc.i(16);
                c2084lc.s(3);
                if (i2 == 0) {
                    c2084lc.s(13);
                } else {
                    int i3 = c2084lc.i(13);
                    if (wm0.f.get(i3) == null) {
                        wm0.f.put(i3, new C1595gb0(new C1909jm0(wm0, i3)));
                        wm0.l++;
                    }
                }
                i++;
            }
            if (wm0.a != 2) {
                wm0.f.remove(0);
            }
        }
    }

    public View d(int i, int i2, int i3, int i4) {
        V50 v50 = (V50) this.m;
        int iE = v50.e();
        int iD = v50.d();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewA = v50.a(i);
            int iC = v50.c(viewA);
            int iB = v50.b(viewA);
            Uf0 uf0 = (Uf0) this.n;
            uf0.b = iE;
            uf0.c = iD;
            uf0.d = iC;
            uf0.e = iB;
            if (i3 != 0) {
                uf0.a = i3;
                if (uf0.a()) {
                    return viewA;
                }
            }
            if (i4 != 0) {
                uf0.a = i4;
                if (uf0.a()) {
                    view = viewA;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean e(View view) {
        V50 v50 = (V50) this.m;
        int iE = v50.e();
        int iD = v50.d();
        int iC = v50.c(view);
        int iB = v50.b(view);
        Uf0 uf0 = (Uf0) this.n;
        uf0.b = iE;
        uf0.c = iD;
        uf0.d = iC;
        uf0.e = iB;
        uf0.a = 24579;
        return uf0.a();
    }

    public C2650rP f(AbstractC2144m60 abstractC2144m60, int i) {
        St0 st0;
        C2650rP c2650rP;
        Nd0 nd0 = (Nd0) this.m;
        int iD = nd0.d(abstractC2144m60);
        if (iD >= 0 && (st0 = (St0) nd0.j(iD)) != null) {
            int i2 = st0.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                st0.a = i3;
                if (i == 4) {
                    c2650rP = st0.b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c2650rP = st0.c;
                }
                if ((i3 & 12) == 0) {
                    nd0.h(iD);
                    st0.a = 0;
                    st0.b = null;
                    st0.c = null;
                    St0.d.e(st0);
                }
                return c2650rP;
            }
        }
        return null;
    }

    public void g(AbstractC2144m60 abstractC2144m60) {
        St0 st0 = (St0) ((Nd0) this.m).get(abstractC2144m60);
        if (st0 == null) {
            return;
        }
        st0.a &= -2;
    }

    public void h(AbstractC2144m60 abstractC2144m60) {
        C1480fM c1480fM = (C1480fM) this.n;
        for (int iK = c1480fM.k() - 1; iK >= 0; iK--) {
            if (abstractC2144m60 == c1480fM.m(iK)) {
                Object[] objArr = c1480fM.n;
                Object obj = objArr[iK];
                Object obj2 = AbstractC3045vW.c;
                if (obj == obj2) {
                    break;
                }
                objArr[iK] = obj2;
                c1480fM.l = true;
                break;
            }
        }
        St0 st0 = (St0) ((Nd0) this.m).remove(abstractC2144m60);
        if (st0 != null) {
            st0.a = 0;
            st0.b = null;
            st0.c = null;
            St0.d.e(st0);
        }
    }

    @Override // o.VV
    public Kw0 r(View view, Kw0 kw0) {
        YK yk = new YK();
        YK yk2 = (YK) this.n;
        yk.a = yk2.a;
        yk.b = yk2.b;
        yk.c = yk2.c;
        yk.d = yk2.d;
        return ((InterfaceC3284xu0) this.m).h(view, kw0, yk);
    }

    public String toString() {
        switch (this.l) {
            case 4:
                return "Bounds{lower=" + ((TF) this.m) + " upper=" + ((TF) this.n) + "}";
            default:
                return super.toString();
        }
    }

    public Vm0() {
        this.l = 2;
        this.m = new Nd0();
        this.n = new C1480fM();
    }

    public Vm0(V50 v50) {
        this.l = 1;
        this.m = v50;
        Uf0 uf0 = new Uf0();
        uf0.a = 0;
        this.n = uf0;
    }

    public Vm0(Wm0 wm0) {
        this.l = 0;
        this.n = wm0;
        this.m = new C2084lc(4, new byte[4]);
    }

    @Override // o.InterfaceC1497fb0
    public void c(Oj0 oj0, InterfaceC0354Cs interfaceC0354Cs, Ym0 ym0) {
    }
}
