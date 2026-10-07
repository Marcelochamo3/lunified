package o;

/* JADX INFO: loaded from: classes.dex */
public final class BN implements InterfaceC2941uP, InterfaceC2844tP {
    public final CP l;
    public final long m;
    public final C1562g8 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AbstractC1464f8 f184o;
    public InterfaceC2941uP p;
    public InterfaceC2844tP q;
    public long r = -9223372036854775807L;

    public BN(CP cp, C1562g8 c1562g8, long j) {
        this.l = cp;
        this.n = c1562g8;
        this.m = j;
    }

    @Override // o.Ub0
    public final long A() {
        InterfaceC2941uP interfaceC2941uP = this.p;
        int i = Lr0.a;
        return interfaceC2941uP.A();
    }

    @Override // o.InterfaceC2941uP
    public final void B() {
        InterfaceC2941uP interfaceC2941uP = this.p;
        if (interfaceC2941uP != null) {
            interfaceC2941uP.B();
            return;
        }
        AbstractC1464f8 abstractC1464f8 = this.f184o;
        if (abstractC1464f8 != null) {
            abstractC1464f8.j();
        }
    }

    @Override // o.InterfaceC2941uP
    public final void E(long j, boolean z) {
        InterfaceC2941uP interfaceC2941uP = this.p;
        int i = Lr0.a;
        interfaceC2941uP.E(j, z);
    }

    @Override // o.InterfaceC2941uP
    public final long F(InterfaceC1920js[] interfaceC1920jsArr, boolean[] zArr, D90[] d90Arr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.r;
        if (j3 == -9223372036854775807L || j != this.m) {
            j2 = j;
        } else {
            this.r = -9223372036854775807L;
            j2 = j3;
        }
        InterfaceC2941uP interfaceC2941uP = this.p;
        int i = Lr0.a;
        return interfaceC2941uP.F(interfaceC1920jsArr, zArr, d90Arr, zArr2, j2);
    }

    @Override // o.InterfaceC2941uP
    public final long I(long j) {
        InterfaceC2941uP interfaceC2941uP = this.p;
        int i = Lr0.a;
        return interfaceC2941uP.I(j);
    }

    @Override // o.Ub0
    public final boolean K(long j) {
        InterfaceC2941uP interfaceC2941uP = this.p;
        return interfaceC2941uP != null && interfaceC2941uP.K(j);
    }

    @Override // o.InterfaceC2941uP
    public final long L(long j, C2761sb0 c2761sb0) {
        InterfaceC2941uP interfaceC2941uP = this.p;
        int i = Lr0.a;
        return interfaceC2941uP.L(j, c2761sb0);
    }

    @Override // o.Ub0
    public final void O(long j) {
        InterfaceC2941uP interfaceC2941uP = this.p;
        int i = Lr0.a;
        interfaceC2941uP.O(j);
    }

    public final void a(CP cp) {
        long j = this.r;
        if (j == -9223372036854775807L) {
            j = this.m;
        }
        AbstractC1464f8 abstractC1464f8 = this.f184o;
        abstractC1464f8.getClass();
        InterfaceC2941uP interfaceC2941uPB = abstractC1464f8.b(cp, this.n, j);
        this.p = interfaceC2941uPB;
        if (this.q != null) {
            interfaceC2941uPB.c(this, j);
        }
    }

    @Override // o.Ub0
    public final boolean b() {
        InterfaceC2941uP interfaceC2941uP = this.p;
        return interfaceC2941uP != null && interfaceC2941uP.b();
    }

    @Override // o.InterfaceC2941uP
    public final void c(InterfaceC2844tP interfaceC2844tP, long j) {
        this.q = interfaceC2844tP;
        InterfaceC2941uP interfaceC2941uP = this.p;
        if (interfaceC2941uP != null) {
            long j2 = this.r;
            if (j2 == -9223372036854775807L) {
                j2 = this.m;
            }
            interfaceC2941uP.c(this, j2);
        }
    }

    @Override // o.InterfaceC2844tP
    public final void d(InterfaceC2941uP interfaceC2941uP) {
        InterfaceC2844tP interfaceC2844tP = this.q;
        int i = Lr0.a;
        interfaceC2844tP.d(this);
    }

    @Override // o.Tb0
    public final void e(Ub0 ub0) {
        InterfaceC2844tP interfaceC2844tP = this.q;
        int i = Lr0.a;
        interfaceC2844tP.e(this);
    }

    public final void f() {
        if (this.p != null) {
            AbstractC1464f8 abstractC1464f8 = this.f184o;
            abstractC1464f8.getClass();
            abstractC1464f8.n(this.p);
        }
    }

    @Override // o.Ub0
    public final long o() {
        InterfaceC2941uP interfaceC2941uP = this.p;
        int i = Lr0.a;
        return interfaceC2941uP.o();
    }

    @Override // o.InterfaceC2941uP
    public final long p() {
        InterfaceC2941uP interfaceC2941uP = this.p;
        int i = Lr0.a;
        return interfaceC2941uP.p();
    }

    @Override // o.InterfaceC2941uP
    public final C1031am0 t() {
        InterfaceC2941uP interfaceC2941uP = this.p;
        int i = Lr0.a;
        return interfaceC2941uP.t();
    }
}
