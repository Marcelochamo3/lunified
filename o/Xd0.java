package o;

/* JADX INFO: loaded from: classes.dex */
public final class Xd0 extends AbstractC2442pA {
    public final C2102ll j = new C2102ll(0);

    public Xd0() {
        n(1);
    }

    @Override // o.AbstractC2442pA
    public final boolean b(int i, boolean z) {
        int iMin;
        int iQ;
        if (this.b.n() == 0) {
            return false;
        }
        if (!z && c(i)) {
            return false;
        }
        int i2 = this.g;
        if (i2 >= 0) {
            iMin = i2 + 1;
        } else {
            int i3 = this.i;
            iMin = i3 != -1 ? Math.min(i3, this.b.n() - 1) : 0;
        }
        boolean z2 = false;
        while (iMin < this.b.n()) {
            C0334By c0334By = this.b;
            Object[] objArr = this.a;
            int iK = c0334By.k(iMin, true, objArr, false);
            if (this.f < 0 || this.g < 0) {
                iQ = this.c ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                this.f = iMin;
                this.g = iMin;
            } else {
                if (this.c) {
                    int i4 = iMin - 1;
                    iQ = (this.b.o(i4) - this.b.q(i4)) - this.d;
                } else {
                    int i5 = iMin - 1;
                    iQ = this.d + this.b.q(i5) + this.b.o(i5);
                }
                this.g = iMin;
            }
            this.b.i(objArr[0], iMin, iK, 0, iQ);
            if (z || c(i)) {
                return true;
            }
            iMin++;
            z2 = true;
        }
        return z2;
    }

    @Override // o.AbstractC2442pA
    public final void e(int i, int i2, C0702Qd c0702Qd) {
        int iO;
        int iO2;
        if (!this.c ? i2 < 0 : i2 > 0) {
            if (this.g == this.b.n() - 1) {
                return;
            }
            int i3 = this.g;
            if (i3 >= 0) {
                iO = i3 + 1;
            } else {
                int i4 = this.i;
                iO = i4 != -1 ? Math.min(i4, this.b.n() - 1) : 0;
            }
            int iQ = this.b.q(this.g) + this.d;
            int iO3 = this.b.o(this.g);
            if (this.c) {
                iQ = -iQ;
            }
            iO2 = iQ + iO3;
        } else {
            if (this.f == 0) {
                return;
            }
            iO = o();
            iO2 = this.b.o(this.f) + (this.c ? this.d : -this.d);
        }
        c0702Qd.a(iO, Math.abs(iO2 - i));
    }

    @Override // o.AbstractC2442pA
    public final int f(boolean z, int i, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        return this.c ? this.b.o(i) : this.b.o(i) + this.b.q(i);
    }

    @Override // o.AbstractC2442pA
    public final int h(boolean z, int i, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        return this.c ? this.b.o(i) - this.b.q(i) : this.b.o(i);
    }

    @Override // o.AbstractC2442pA
    public final FV[] j(int i, int i2) {
        FV fv = this.h[0];
        fv.l = 0;
        fv.d(i);
        this.h[0].d(i2);
        return this.h;
    }

    @Override // o.AbstractC2442pA
    public final C2102ll k(int i) {
        return this.j;
    }

    @Override // o.AbstractC2442pA
    public final boolean m(int i, boolean z) {
        int iO;
        if (this.b.n() == 0) {
            return false;
        }
        if (!z && d(i)) {
            return false;
        }
        int i2 = ((C3217xA) this.b.m).w;
        boolean z2 = false;
        for (int iO2 = o(); iO2 >= i2; iO2--) {
            C0334By c0334By = this.b;
            Object[] objArr = this.a;
            int iK = c0334By.k(iO2, false, objArr, false);
            if (this.f < 0 || this.g < 0) {
                iO = this.c ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                this.f = iO2;
                this.g = iO2;
            } else {
                iO = this.c ? this.b.o(iO2 + 1) + this.d + iK : (this.b.o(iO2 + 1) - this.d) - iK;
                this.f = iO2;
            }
            this.b.i(objArr[0], iO2, iK, 0, iO);
            z2 = true;
            if (z || d(i)) {
                break;
            }
        }
        return z2;
    }

    public final int o() {
        int i = this.f;
        if (i >= 0) {
            return i - 1;
        }
        int i2 = this.i;
        return i2 != -1 ? Math.min(i2, this.b.n() - 1) : this.b.n() - 1;
    }
}
