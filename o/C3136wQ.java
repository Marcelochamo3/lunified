package o;

/* JADX INFO: renamed from: o.wQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3136wQ implements InterfaceC2941uP, InterfaceC2844tP {
    public final InterfaceC2941uP l;
    public final long m;
    public InterfaceC2844tP n;

    public C3136wQ(InterfaceC2941uP interfaceC2941uP, long j) {
        this.l = interfaceC2941uP;
        this.m = j;
    }

    @Override // o.Ub0
    public final long A() {
        long jA = this.l.A();
        if (jA == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.m + jA;
    }

    @Override // o.InterfaceC2941uP
    public final void B() {
        this.l.B();
    }

    @Override // o.InterfaceC2941uP
    public final void E(long j, boolean z) {
        this.l.E(j - this.m, z);
    }

    @Override // o.InterfaceC2941uP
    public final long F(InterfaceC1920js[] interfaceC1920jsArr, boolean[] zArr, D90[] d90Arr, boolean[] zArr2, long j) {
        D90[] d90Arr2 = new D90[d90Arr.length];
        int i = 0;
        while (true) {
            D90 d90 = null;
            if (i >= d90Arr.length) {
                break;
            }
            C3233xQ c3233xQ = (C3233xQ) d90Arr[i];
            if (c3233xQ != null) {
                d90 = c3233xQ.l;
            }
            d90Arr2[i] = d90;
            i++;
        }
        long j2 = this.m;
        long jF = this.l.F(interfaceC1920jsArr, zArr, d90Arr2, zArr2, j - j2);
        for (int i2 = 0; i2 < d90Arr.length; i2++) {
            D90 d91 = d90Arr2[i2];
            if (d91 == null) {
                d90Arr[i2] = null;
            } else {
                D90 d92 = d90Arr[i2];
                if (d92 == null || ((C3233xQ) d92).l != d91) {
                    d90Arr[i2] = new C3233xQ(d91, j2);
                }
            }
        }
        return jF + j2;
    }

    @Override // o.InterfaceC2941uP
    public final long I(long j) {
        long j2 = this.m;
        return this.l.I(j - j2) + j2;
    }

    @Override // o.Ub0
    public final boolean K(long j) {
        return this.l.K(j - this.m);
    }

    @Override // o.InterfaceC2941uP
    public final long L(long j, C2761sb0 c2761sb0) {
        long j2 = this.m;
        return this.l.L(j - j2, c2761sb0) + j2;
    }

    @Override // o.Ub0
    public final void O(long j) {
        this.l.O(j - this.m);
    }

    @Override // o.Ub0
    public final boolean b() {
        return this.l.b();
    }

    @Override // o.InterfaceC2941uP
    public final void c(InterfaceC2844tP interfaceC2844tP, long j) {
        this.n = interfaceC2844tP;
        this.l.c(this, j - this.m);
    }

    @Override // o.InterfaceC2844tP
    public final void d(InterfaceC2941uP interfaceC2941uP) {
        InterfaceC2844tP interfaceC2844tP = this.n;
        interfaceC2844tP.getClass();
        interfaceC2844tP.d(this);
    }

    @Override // o.Tb0
    public final void e(Ub0 ub0) {
        InterfaceC2844tP interfaceC2844tP = this.n;
        interfaceC2844tP.getClass();
        interfaceC2844tP.e(this);
    }

    @Override // o.Ub0
    public final long o() {
        long jO = this.l.o();
        if (jO == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.m + jO;
    }

    @Override // o.InterfaceC2941uP
    public final long p() {
        long jP = this.l.p();
        if (jP == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.m + jP;
    }

    @Override // o.InterfaceC2941uP
    public final C1031am0 t() {
        return this.l.t();
    }
}
