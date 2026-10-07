package o;

/* JADX INFO: renamed from: o.bg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1117bg0 extends AbstractC2442pA {
    public C0702Qd j;
    public int k;
    public Object l;
    public int m;

    @Override // o.AbstractC2442pA
    public final boolean b(int i, boolean z) {
        Object[] objArr = this.a;
        if (this.b.n() == 0) {
            return false;
        }
        if (!z && c(i)) {
            return false;
        }
        try {
            if (o(i, z)) {
                return true;
            }
            return q(i, z);
        } finally {
            objArr[0] = null;
            this.l = null;
        }
    }

    @Override // o.AbstractC2442pA
    public final int f(boolean z, int i, int[] iArr) {
        int i2;
        int iO = this.b.o(i);
        C1019ag0 c1019ag0K = k(i);
        int i3 = c1019ag0K.l;
        if (this.c) {
            i2 = i3;
            int i4 = i2;
            int i5 = 1;
            int i6 = iO;
            for (int i7 = i + 1; i5 < this.e && i7 <= this.g; i7++) {
                C1019ag0 c1019ag0K2 = k(i7);
                i6 += c1019ag0K2.m;
                int i8 = c1019ag0K2.l;
                if (i8 != i4) {
                    i5++;
                    if (!z ? i6 >= iO : i6 <= iO) {
                        i4 = i8;
                    } else {
                        iO = i6;
                        i = i7;
                        i2 = i8;
                        i4 = i2;
                    }
                }
            }
        } else {
            int i9 = 1;
            int i10 = i3;
            C1019ag0 c1019ag0K3 = c1019ag0K;
            int i11 = iO;
            iO = this.b.q(i) + iO;
            i2 = i10;
            for (int i12 = i - 1; i9 < this.e && i12 >= this.f; i12--) {
                i11 -= c1019ag0K3.m;
                c1019ag0K3 = k(i12);
                int i13 = c1019ag0K3.l;
                if (i13 != i10) {
                    i9++;
                    int iQ = this.b.q(i12) + i11;
                    if (!z ? iQ >= iO : iQ <= iO) {
                        i10 = i13;
                    } else {
                        iO = iQ;
                        i = i12;
                        i2 = i13;
                        i10 = i2;
                    }
                }
            }
        }
        if (iArr != null) {
            iArr[0] = i2;
            iArr[1] = i;
        }
        return iO;
    }

    @Override // o.AbstractC2442pA
    public final int h(boolean z, int i, int[] iArr) {
        int iQ;
        int iO = this.b.o(i);
        C1019ag0 c1019ag0K = k(i);
        int i2 = c1019ag0K.l;
        if (this.c) {
            int i3 = 1;
            iQ = iO - this.b.q(i);
            int i4 = i2;
            for (int i5 = i - 1; i3 < this.e && i5 >= this.f; i5--) {
                iO -= c1019ag0K.m;
                c1019ag0K = k(i5);
                int i6 = c1019ag0K.l;
                if (i6 != i4) {
                    i3++;
                    int iQ2 = iO - this.b.q(i5);
                    if (!z ? iQ2 >= iQ : iQ2 <= iQ) {
                        i4 = i6;
                    } else {
                        iQ = iQ2;
                        i = i5;
                        i2 = i6;
                        i4 = i2;
                    }
                }
            }
        } else {
            int i7 = i2;
            int i8 = i7;
            int i9 = 1;
            int i10 = iO;
            for (int i11 = i + 1; i9 < this.e && i11 <= this.g; i11++) {
                C1019ag0 c1019ag0K2 = k(i11);
                i10 += c1019ag0K2.m;
                int i12 = c1019ag0K2.l;
                if (i12 != i8) {
                    i9++;
                    if (!z ? i10 >= iO : i10 <= iO) {
                        i8 = i12;
                    } else {
                        iO = i10;
                        i = i11;
                        i7 = i12;
                        i8 = i7;
                    }
                }
            }
            iQ = iO;
            i2 = i7;
        }
        if (iArr != null) {
            iArr[0] = i2;
            iArr[1] = i;
        }
        return iQ;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    @Override // o.AbstractC2442pA
    public final FV[] j(int i, int i2) {
        for (int i3 = 0; i3 < this.e; i3++) {
            this.h[i3].l = 0;
        }
        if (i >= 0) {
            while (i <= i2) {
                FV fv = this.h[k(i).l];
                int i4 = fv.l;
                int i5 = fv.m;
                if ((i4 & i5) <= 0) {
                    fv.d(i);
                    fv.d(i);
                } else {
                    if (i4 == 0) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    int i6 = i5 & (i4 - 1);
                    if (((int[]) fv.n)[i6] != i - 1) {
                        fv.d(i);
                        fv.d(i);
                    } else {
                        if (i4 == 0) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        fv.l = i6;
                        fv.d(i);
                    }
                }
                i++;
            }
        }
        return this.h;
    }

    @Override // o.AbstractC2442pA
    public final void l(int i) {
        super.l(i);
        int iS = (s() - i) + 1;
        C0702Qd c0702Qd = this.j;
        c0702Qd.e(iS);
        if (c0702Qd.g() == 0) {
            this.k = -1;
        }
    }

    @Override // o.AbstractC2442pA
    public final boolean m(int i, boolean z) {
        Object[] objArr = this.a;
        if (this.b.n() == 0) {
            return false;
        }
        if (!z && d(i)) {
            return false;
        }
        try {
            if (w(i, z)) {
                return true;
            }
            return y(i, z);
        } finally {
            objArr[0] = null;
            this.l = null;
        }
    }

    public final boolean o(int i, boolean z) {
        int i2;
        int iO;
        int i3;
        C0702Qd c0702Qd = this.j;
        if (c0702Qd.g() == 0) {
            return false;
        }
        int iN = this.b.n();
        int i4 = this.g;
        if (i4 >= 0) {
            i2 = i4 + 1;
            iO = this.b.o(i4);
        } else {
            int i5 = this.i;
            i2 = i5 != -1 ? i5 : 0;
            if (i2 > s() + 1 || i2 < this.k) {
                c0702Qd.f(c0702Qd.g());
                return false;
            }
            if (i2 > s()) {
                return false;
            }
            iO = Integer.MAX_VALUE;
        }
        int iS = s();
        int i6 = i2;
        while (i6 < iN && i6 <= iS) {
            C1019ag0 c1019ag0K = k(i6);
            if (iO != Integer.MAX_VALUE) {
                iO += c1019ag0K.m;
            }
            int i7 = c1019ag0K.l;
            C0334By c0334By = this.b;
            Object[] objArr = this.a;
            int iK = c0334By.k(i6, true, objArr, false);
            if (iK != c1019ag0K.n) {
                c1019ag0K.n = iK;
                c0702Qd.e(iS - i6);
                i3 = i6;
            } else {
                i3 = iS;
            }
            this.g = i6;
            if (this.f < 0) {
                this.f = i6;
            }
            this.b.i(objArr[0], i6, iK, i7, iO);
            if (!z && c(i)) {
                return true;
            }
            if (iO == Integer.MAX_VALUE) {
                iO = this.b.o(i6);
            }
            if (i7 == this.e - 1 && z) {
                return true;
            }
            i6++;
            iS = i3;
        }
        return false;
    }

    public final int p(int i, int i2, int i3) {
        int iO;
        int i4 = this.g;
        if (i4 >= 0 && (i4 != s() || this.g != i - 1)) {
            throw new IllegalStateException();
        }
        int i5 = this.g;
        C0702Qd c0702Qd = this.j;
        if (i5 >= 0) {
            iO = i3 - this.b.o(i5);
        } else if (c0702Qd.g() <= 0 || i != s() + 1) {
            iO = 0;
        } else {
            int iS = s();
            while (true) {
                if (iS < this.k) {
                    iS = s();
                    break;
                }
                if (k(iS).l == i2) {
                    break;
                }
                iS--;
            }
            iO = this.c ? (-k(iS).n) - this.d : k(iS).n + this.d;
            for (int i6 = iS + 1; i6 <= s(); i6++) {
                iO -= k(i6).m;
            }
        }
        C1019ag0 c1019ag0 = new C1019ag0(i2, iO);
        Object[] objArr = (Object[]) c0702Qd.d;
        int i7 = c0702Qd.b;
        objArr[i7] = c1019ag0;
        int i8 = c0702Qd.c & (i7 + 1);
        c0702Qd.b = i8;
        if (i8 == c0702Qd.a) {
            c0702Qd.d();
        }
        Object obj = this.l;
        if (obj != null) {
            c1019ag0.n = this.m;
            this.l = null;
        } else {
            C0334By c0334By = this.b;
            Object[] objArr2 = this.a;
            c1019ag0.n = c0334By.k(i, true, objArr2, false);
            obj = objArr2[0];
        }
        Object obj2 = obj;
        if (c0702Qd.g() == 1) {
            this.g = i;
            this.f = i;
            this.k = i;
        } else {
            int i9 = this.g;
            if (i9 < 0) {
                this.g = i;
                this.f = i;
            } else {
                this.g = i9 + 1;
            }
        }
        this.b.i(obj2, i, c1019ag0.n, i2, i3);
        return c1019ag0.n;
    }

    public final boolean q(int i, boolean z) {
        int i2;
        int i3;
        boolean z2;
        int iV;
        int i4;
        int i5;
        int iN = this.b.n();
        int i6 = this.g;
        if (i6 < 0) {
            int i7 = this.i;
            i2 = i7 != -1 ? i7 : 0;
            i3 = (this.j.g() > 0 ? k(s()).l + 1 : i2) % this.e;
            z2 = false;
            iV = 0;
        } else {
            if (i6 < s()) {
                return false;
            }
            int i8 = this.g;
            i2 = i8 + 1;
            i3 = k(i8).l;
            int iR = r(true);
            if (iR < 0) {
                iV = Integer.MIN_VALUE;
                for (int i9 = 0; i9 < this.e; i9++) {
                    iV = this.c ? v(i9) : u(i9);
                    if (iV != Integer.MIN_VALUE) {
                        break;
                    }
                }
            } else {
                iV = this.c ? h(false, iR, null) : f(true, iR, null);
            }
            if (!this.c ? u(i3) >= iV : v(i3) <= iV) {
                i3++;
                if (i3 == this.e) {
                    iV = this.c ? i(false, null) : g(true, null);
                    i3 = 0;
                }
            }
            z2 = true;
        }
        boolean z3 = false;
        while (true) {
            if (i3 < this.e) {
                if (i2 == iN || (!z && c(i))) {
                    break;
                }
                int iV2 = this.c ? v(i3) : u(i3);
                if (iV2 != Integer.MAX_VALUE && iV2 != Integer.MIN_VALUE) {
                    if (this.c) {
                        i5 = this.d;
                        i4 = -i5;
                    } else {
                        i4 = this.d;
                    }
                    iV2 += i4;
                } else if (i3 == 0) {
                    iV2 = this.c ? v(this.e - 1) : u(this.e - 1);
                    if (iV2 != Integer.MAX_VALUE && iV2 != Integer.MIN_VALUE) {
                        if (this.c) {
                            i5 = this.d;
                            i4 = -i5;
                        } else {
                            i4 = this.d;
                        }
                        iV2 += i4;
                    }
                } else {
                    iV2 = this.c ? u(i3 - 1) : v(i3 - 1);
                }
                int i10 = i2 + 1;
                int iP = p(i2, i3, iV2);
                if (z2) {
                    while (true) {
                        if (!this.c) {
                            if (iV2 + iP >= iV) {
                                break;
                            }
                            if (i10 != iN) {
                            }
                            return true;
                        }
                        if (iV2 - iP <= iV) {
                            break;
                        }
                        if (i10 != iN || (!z && c(i))) {
                            return true;
                        }
                        iV2 += this.c ? (-iP) - this.d : iP + this.d;
                        int i11 = i10 + 1;
                        int iP2 = p(i10, i3, iV2);
                        i10 = i11;
                        iP = iP2;
                    }
                    i2 = i10;
                } else {
                    iV = this.c ? v(i3) : u(i3);
                    i2 = i10;
                    z2 = true;
                }
                i3++;
                z3 = true;
            } else {
                if (z) {
                    return z3;
                }
                iV = this.c ? i(false, null) : g(true, null);
                i3 = 0;
            }
        }
        return z3;
    }

    public final int r(boolean z) {
        boolean z2 = false;
        if (z) {
            for (int i = this.g; i >= this.f; i--) {
                int i2 = k(i).l;
                if (i2 == 0) {
                    z2 = true;
                } else if (z2 && i2 == this.e - 1) {
                    return i;
                }
            }
            return -1;
        }
        for (int i3 = this.f; i3 <= this.g; i3++) {
            int i4 = k(i3).l;
            if (i4 == this.e - 1) {
                z2 = true;
            } else if (z2 && i4 == 0) {
                return i3;
            }
        }
        return -1;
    }

    public final int s() {
        return (this.j.g() + this.k) - 1;
    }

    @Override // o.AbstractC2442pA
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final C1019ag0 k(int i) {
        int i2 = i - this.k;
        if (i2 < 0) {
            return null;
        }
        C0702Qd c0702Qd = this.j;
        if (i2 >= c0702Qd.g()) {
            return null;
        }
        if (i2 < 0) {
            c0702Qd.getClass();
        } else if (i2 < c0702Qd.g()) {
            Object obj = ((Object[]) c0702Qd.d)[c0702Qd.c & (c0702Qd.a + i2)];
            AbstractC1474fG.g(obj);
            return (C1019ag0) obj;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final int u(int i) {
        int i2;
        C1019ag0 c1019ag0K;
        int i3 = this.f;
        if (i3 < 0) {
            return Integer.MIN_VALUE;
        }
        if (this.c) {
            int iO = this.b.o(i3);
            if (k(this.f).l == i) {
                return iO;
            }
            int i4 = this.f;
            do {
                i4++;
                if (i4 <= s()) {
                    c1019ag0K = k(i4);
                    iO += c1019ag0K.m;
                }
            } while (c1019ag0K.l != i);
            return iO;
        }
        int iO2 = this.b.o(this.g);
        C1019ag0 c1019ag0K2 = k(this.g);
        if (c1019ag0K2.l == i) {
            i2 = c1019ag0K2.n;
        } else {
            int i5 = this.g;
            do {
                i5--;
                if (i5 >= this.k) {
                    iO2 -= c1019ag0K2.m;
                    c1019ag0K2 = k(i5);
                }
            } while (c1019ag0K2.l != i);
            i2 = c1019ag0K2.n;
        }
        return iO2 + i2;
        return Integer.MIN_VALUE;
    }

    public final int v(int i) {
        C1019ag0 c1019ag0K;
        int i2;
        int i3 = this.f;
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        if (!this.c) {
            int iO = this.b.o(i3);
            if (k(this.f).l == i) {
                return iO;
            }
            int i4 = this.f;
            do {
                i4++;
                if (i4 <= s()) {
                    c1019ag0K = k(i4);
                    iO += c1019ag0K.m;
                }
            } while (c1019ag0K.l != i);
            return iO;
        }
        int iO2 = this.b.o(this.g);
        C1019ag0 c1019ag0K2 = k(this.g);
        if (c1019ag0K2.l == i) {
            i2 = c1019ag0K2.n;
        } else {
            int i5 = this.g;
            do {
                i5--;
                if (i5 >= this.k) {
                    iO2 -= c1019ag0K2.m;
                    c1019ag0K2 = k(i5);
                }
            } while (c1019ag0K2.l != i);
            i2 = c1019ag0K2.n;
        }
        return iO2 - i2;
        return Integer.MAX_VALUE;
    }

    public final boolean w(int i, boolean z) {
        int i2;
        int iO;
        int i3;
        C0702Qd c0702Qd = this.j;
        if (c0702Qd.g() == 0) {
            return false;
        }
        int i4 = this.f;
        if (i4 < 0) {
            int i5 = this.i;
            i2 = i5 != -1 ? i5 : 0;
            if (i2 <= s()) {
                int i6 = this.k;
                if (i2 >= i6 - 1) {
                    if (i2 < i6) {
                        return false;
                    }
                    iO = Integer.MAX_VALUE;
                    i3 = 0;
                }
            }
            c0702Qd.f(c0702Qd.g());
            return false;
        }
        iO = this.b.o(i4);
        i3 = k(this.f).m;
        i2 = this.f - 1;
        int iMax = Math.max(((C3217xA) this.b.m).w, this.k);
        while (i2 >= iMax) {
            C1019ag0 c1019ag0K = k(i2);
            int i7 = c1019ag0K.l;
            C0334By c0334By = this.b;
            Object[] objArr = this.a;
            int iK = c0334By.k(i2, false, objArr, false);
            if (iK != c1019ag0K.n) {
                c0702Qd.f((i2 + 1) - this.k);
                this.k = this.f;
                this.l = objArr[0];
                this.m = iK;
                return false;
            }
            this.f = i2;
            if (this.g < 0) {
                this.g = i2;
            }
            this.b.i(objArr[0], i2, iK, i7, iO - i3);
            if (!z && d(i)) {
                return true;
            }
            iO = this.b.o(i2);
            i3 = c1019ag0K.m;
            if (i7 == 0 && z) {
                return true;
            }
            i2--;
        }
        return false;
    }

    public final int x(int i, int i2, int i3) {
        int i4 = this.f;
        if (i4 >= 0 && (i4 != this.k || i4 != i + 1)) {
            throw new IllegalStateException();
        }
        int i5 = this.k;
        C1019ag0 c1019ag0K = i5 >= 0 ? k(i5) : null;
        int iO = this.b.o(this.k);
        C1019ag0 c1019ag0 = new C1019ag0(i2, 0);
        C0702Qd c0702Qd = this.j;
        int i6 = (c0702Qd.a - 1) & c0702Qd.c;
        c0702Qd.a = i6;
        ((Object[]) c0702Qd.d)[i6] = c1019ag0;
        if (i6 == c0702Qd.b) {
            c0702Qd.d();
        }
        Object obj = this.l;
        if (obj != null) {
            c1019ag0.n = this.m;
            this.l = null;
        } else {
            C0334By c0334By = this.b;
            Object[] objArr = this.a;
            c1019ag0.n = c0334By.k(i, false, objArr, false);
            obj = objArr[0];
        }
        Object obj2 = obj;
        this.f = i;
        this.k = i;
        if (this.g < 0) {
            this.g = i;
        }
        int i7 = !this.c ? i3 - c1019ag0.n : i3 + c1019ag0.n;
        if (c1019ag0K != null) {
            c1019ag0K.m = iO - i7;
        }
        this.b.i(obj2, i, c1019ag0.n, i2, i7);
        return c1019ag0.n;
    }

    public final boolean y(int i, boolean z) {
        int i2;
        int i3;
        boolean z2;
        int iU;
        int i4;
        int i5;
        int i6 = this.f;
        if (i6 < 0) {
            int i7 = this.i;
            i2 = i7 != -1 ? i7 : 0;
            i3 = (this.j.g() > 0 ? (k(this.k).l + this.e) - 1 : i2) % this.e;
            z2 = false;
            iU = 0;
        } else {
            if (i6 > this.k) {
                return false;
            }
            i2 = i6 - 1;
            i3 = k(i6).l;
            int iR = r(false);
            if (iR < 0) {
                i3--;
                iU = Integer.MAX_VALUE;
                for (int i8 = this.e - 1; i8 >= 0; i8--) {
                    iU = this.c ? u(i8) : v(i8);
                    if (iU != Integer.MAX_VALUE) {
                        break;
                    }
                }
            } else {
                iU = this.c ? f(true, iR, null) : h(false, iR, null);
            }
            if (!this.c ? v(i3) <= iU : u(i3) >= iU) {
                i3--;
                if (i3 < 0) {
                    i3 = this.e - 1;
                    iU = this.c ? g(true, null) : i(false, null);
                }
            }
            z2 = true;
        }
        boolean z3 = false;
        while (true) {
            if (i3 >= 0) {
                if (i2 < 0 || (!z && d(i))) {
                    break;
                }
                int iU2 = this.c ? u(i3) : v(i3);
                if (iU2 != Integer.MAX_VALUE && iU2 != Integer.MIN_VALUE) {
                    if (this.c) {
                        i5 = this.d;
                    } else {
                        i4 = this.d;
                        i5 = -i4;
                    }
                    iU2 += i5;
                } else if (i3 == this.e - 1) {
                    iU2 = this.c ? u(0) : v(0);
                    if (iU2 != Integer.MAX_VALUE && iU2 != Integer.MIN_VALUE) {
                        if (this.c) {
                            i5 = this.d;
                        } else {
                            i4 = this.d;
                            i5 = -i4;
                        }
                        iU2 += i5;
                    }
                } else {
                    iU2 = this.c ? v(i3 + 1) : u(i3 + 1);
                }
                int i9 = i2 - 1;
                int iX = x(i2, i3, iU2);
                if (z2) {
                    while (true) {
                        if (!this.c) {
                            if (iU2 - iX <= iU) {
                                break;
                            }
                            if (i9 >= 0) {
                            }
                            return true;
                        }
                        if (iU2 + iX >= iU) {
                            break;
                        }
                        if (i9 >= 0 || (!z && d(i))) {
                            return true;
                        }
                        iU2 += this.c ? iX + this.d : (-iX) - this.d;
                        int i10 = i9 - 1;
                        int iX2 = x(i9, i3, iU2);
                        i9 = i10;
                        iX = iX2;
                    }
                    i2 = i9;
                } else {
                    iU = this.c ? u(i3) : v(i3);
                    i2 = i9;
                    z2 = true;
                }
                i3--;
                z3 = true;
            } else {
                if (z) {
                    return z3;
                }
                iU = this.c ? g(true, null) : i(false, null);
                i3 = this.e - 1;
            }
        }
        return z3;
    }
}
