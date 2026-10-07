package o;

/* JADX INFO: renamed from: o.Ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0392Ee implements InterfaceC2941uP, InterfaceC2844tP {
    public final InterfaceC2941uP l;
    public InterfaceC2844tP m;
    public C0366De[] n = new C0366De[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f241o;
    public long p;
    public long q;
    public C0444Ge r;

    public C0392Ee(InterfaceC2941uP interfaceC2941uP, boolean z, long j, long j2) {
        this.l = interfaceC2941uP;
        this.f241o = z ? j : -9223372036854775807L;
        this.p = j;
        this.q = j2;
    }

    @Override // o.Ub0
    public final long A() {
        long jA = this.l.A();
        if (jA != Long.MIN_VALUE) {
            long j = this.q;
            if (j == Long.MIN_VALUE || jA < j) {
                return jA;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // o.InterfaceC2941uP
    public final void B() throws C0444Ge {
        C0444Ge c0444Ge = this.r;
        if (c0444Ge != null) {
            throw c0444Ge;
        }
        this.l.B();
    }

    @Override // o.InterfaceC2941uP
    public final void E(long j, boolean z) {
        this.l.E(j, z);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d A[EDGE_INSN: B:23:0x005d->B:24:0x0062 BREAK  A[LOOP:1: B:16:0x0044->B:22:0x005a]] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d  */
    @Override // o.InterfaceC2941uP
    public final long F(InterfaceC1920js[] interfaceC1920jsArr, boolean[] zArr, D90[] d90Arr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        this.n = new C0366De[d90Arr.length];
        D90[] d90Arr2 = new D90[d90Arr.length];
        int i = 0;
        while (true) {
            D90 d90 = null;
            if (i >= d90Arr.length) {
                break;
            }
            C0366De[] c0366DeArr = this.n;
            C0366De c0366De = (C0366De) d90Arr[i];
            c0366DeArr[i] = c0366De;
            if (c0366De != null) {
                d90 = c0366De.l;
            }
            d90Arr2[i] = d90;
            i++;
        }
        long jF = this.l.F(interfaceC1920jsArr, zArr, d90Arr2, zArr2, j);
        if (!a()) {
            j2 = -9223372036854775807L;
            break;
        }
        long j3 = this.p;
        if (j != j3 || j3 == 0) {
            j2 = -9223372036854775807L;
            break;
        }
        int length = interfaceC1920jsArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                j2 = -9223372036854775807L;
                break;
            }
            InterfaceC1920js interfaceC1920js = interfaceC1920jsArr[i2];
            if (interfaceC1920js != null) {
                C0643Nw c0643NwK = interfaceC1920js.k();
                if (!IQ.a(c0643NwK.w, c0643NwK.t)) {
                    j2 = jF;
                    break;
                }
            }
            i2++;
        }
        this.f241o = j2;
        if (jF != j) {
            if (jF >= this.p) {
                long j4 = this.q;
                z = j4 == Long.MIN_VALUE || jF <= j4;
            }
        }
        AbstractC0397Ej.f(z);
        for (int i3 = 0; i3 < d90Arr.length; i3++) {
            D90 d91 = d90Arr2[i3];
            if (d91 == null) {
                this.n[i3] = null;
            } else {
                C0366De[] c0366DeArr2 = this.n;
                C0366De c0366De2 = c0366DeArr2[i3];
                if (c0366De2 == null || c0366De2.l != d91) {
                    c0366DeArr2[i3] = new C0366De(this, d91);
                }
            }
            d90Arr[i3] = this.n[i3];
        }
        return jF;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // o.InterfaceC2941uP
    public final long I(long j) {
        this.f241o = -9223372036854775807L;
        boolean z = false;
        for (C0366De c0366De : this.n) {
            if (c0366De != null) {
                c0366De.m = false;
            }
        }
        long jI = this.l.I(j);
        if (jI == j) {
            z = true;
        } else if (jI >= this.p) {
            long j2 = this.q;
            if (j2 == Long.MIN_VALUE || jI <= j2) {
                z = true;
            }
        }
        AbstractC0397Ej.f(z);
        return jI;
    }

    @Override // o.Ub0
    public final boolean K(long j) {
        return this.l.K(j);
    }

    @Override // o.InterfaceC2941uP
    public final long L(long j, C2761sb0 c2761sb0) {
        long j2 = this.p;
        if (j == j2) {
            return j2;
        }
        long jK = Lr0.k(c2761sb0.a, 0L, j - j2);
        long j3 = this.q;
        long jK2 = Lr0.k(c2761sb0.b, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (jK != c2761sb0.a || jK2 != c2761sb0.b) {
            c2761sb0 = new C2761sb0(jK, jK2);
        }
        return this.l.L(j, c2761sb0);
    }

    @Override // o.Ub0
    public final void O(long j) {
        this.l.O(j);
    }

    public final boolean a() {
        return this.f241o != -9223372036854775807L;
    }

    @Override // o.Ub0
    public final boolean b() {
        return this.l.b();
    }

    @Override // o.InterfaceC2941uP
    public final void c(InterfaceC2844tP interfaceC2844tP, long j) {
        this.m = interfaceC2844tP;
        this.l.c(this, j);
    }

    @Override // o.InterfaceC2844tP
    public final void d(InterfaceC2941uP interfaceC2941uP) {
        if (this.r != null) {
            return;
        }
        InterfaceC2844tP interfaceC2844tP = this.m;
        interfaceC2844tP.getClass();
        interfaceC2844tP.d(this);
    }

    @Override // o.Tb0
    public final void e(Ub0 ub0) {
        InterfaceC2844tP interfaceC2844tP = this.m;
        interfaceC2844tP.getClass();
        interfaceC2844tP.e(this);
    }

    @Override // o.Ub0
    public final long o() {
        long jO = this.l.o();
        if (jO != Long.MIN_VALUE) {
            long j = this.q;
            if (j == Long.MIN_VALUE || jO < j) {
                return jO;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // o.InterfaceC2941uP
    public final long p() {
        if (a()) {
            long j = this.f241o;
            this.f241o = -9223372036854775807L;
            long jP = p();
            return jP != -9223372036854775807L ? jP : j;
        }
        long jP2 = this.l.p();
        if (jP2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC0397Ej.f(jP2 >= this.p);
        long j2 = this.q;
        AbstractC0397Ej.f(j2 == Long.MIN_VALUE || jP2 <= j2);
        return jP2;
    }

    @Override // o.InterfaceC2941uP
    public final C1031am0 t() {
        return this.l.t();
    }
}
