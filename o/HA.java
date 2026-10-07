package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class HA extends C0731Rg {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public C0394Eg t0 = this.J;
    public int u0 = 0;
    public boolean v0;

    public HA() {
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    @Override // o.C0731Rg
    public final boolean A() {
        return this.v0;
    }

    @Override // o.C0731Rg
    public final boolean B() {
        return this.v0;
    }

    @Override // o.C0731Rg
    public final void Q(C2742sK c2742sK, boolean z) {
        if (this.T == null) {
            return;
        }
        C0394Eg c0394Eg = this.t0;
        c2742sK.getClass();
        int iN = C2742sK.n(c0394Eg);
        if (this.u0 == 1) {
            this.Y = iN;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = iN;
        O(this.T.q());
        L(0);
    }

    public final void R(int i) {
        this.t0.l(i);
        this.v0 = true;
    }

    public final void S(int i) {
        if (this.u0 == i) {
            return;
        }
        this.u0 = i;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.u0 == 1) {
            this.t0 = this.I;
        } else {
            this.t0 = this.J;
        }
        arrayList.add(this.t0);
        C0394Eg[] c0394EgArr = this.Q;
        int length = c0394EgArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0394EgArr[i2] = this.t0;
        }
    }

    @Override // o.C0731Rg
    public final void b(C2742sK c2742sK, boolean z) {
        C0757Sg c0757Sg = (C0757Sg) this.T;
        if (c0757Sg == null) {
            return;
        }
        Object objI = c0757Sg.i(2);
        Object objI2 = c0757Sg.i(4);
        C0731Rg c0731Rg = this.T;
        boolean z2 = c0731Rg != null && c0731Rg.p0[0] == 2;
        if (this.u0 == 0) {
            objI = c0757Sg.i(3);
            objI2 = c0757Sg.i(5);
            C0731Rg c0731Rg2 = this.T;
            z2 = c0731Rg2 != null && c0731Rg2.p0[1] == 2;
        }
        if (this.v0) {
            C0394Eg c0394Eg = this.t0;
            if (c0394Eg.c) {
                C1798if0 c1798if0K = c2742sK.k(c0394Eg);
                c2742sK.d(c1798if0K, this.t0.d());
                if (this.r0 != -1) {
                    if (z2) {
                        c2742sK.f(c2742sK.k(objI2), c1798if0K, 0, 5);
                    }
                } else if (this.s0 != -1 && z2) {
                    C1798if0 c1798if0K2 = c2742sK.k(objI2);
                    c2742sK.f(c1798if0K, c2742sK.k(objI), 0, 5);
                    c2742sK.f(c1798if0K2, c1798if0K, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.r0 != -1) {
            C1798if0 c1798if0K3 = c2742sK.k(this.t0);
            c2742sK.e(c1798if0K3, c2742sK.k(objI), this.r0, 8);
            if (z2) {
                c2742sK.f(c2742sK.k(objI2), c1798if0K3, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1) {
            C1798if0 c1798if0K4 = c2742sK.k(this.t0);
            C1798if0 c1798if0K5 = c2742sK.k(objI2);
            c2742sK.e(c1798if0K4, c1798if0K5, -this.s0, 8);
            if (z2) {
                c2742sK.f(c1798if0K4, c2742sK.k(objI), 0, 5);
                c2742sK.f(c1798if0K5, c1798if0K4, 0, 5);
                return;
            }
            return;
        }
        if (this.q0 != -1.0f) {
            C1798if0 c1798if0K6 = c2742sK.k(this.t0);
            C1798if0 c1798if0K7 = c2742sK.k(objI2);
            float f = this.q0;
            T5 t5L = c2742sK.l();
            t5L.d.j(c1798if0K6, -1.0f);
            t5L.d.j(c1798if0K7, f);
            c2742sK.c(t5L);
        }
    }

    @Override // o.C0731Rg
    public final boolean c() {
        return true;
    }

    @Override // o.C0731Rg
    public final C0394Eg i(int i) {
        int iW = AbstractC1701hf0.w(i);
        if (iW != 1) {
            if (iW != 2) {
                if (iW != 3) {
                    if (iW != 4) {
                        return null;
                    }
                }
            }
            if (this.u0 == 0) {
                return this.t0;
            }
            return null;
        }
        if (this.u0 == 1) {
            return this.t0;
        }
        return null;
    }
}
