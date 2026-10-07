package o;

/* JADX INFO: renamed from: o.tw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2899tw implements InterfaceC0302As {
    public final C2562qX a = new C2562qX(4);
    public final C2562qX b = new C2562qX(9);
    public final C2562qX c = new C2562qX(11);
    public final C2562qX d = new C2562qX();
    public final T90 e;
    public InterfaceC0354Cs f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1950k7 f1049o;
    public C1143bt0 p;

    public C2899tw() {
        T90 t90 = new T90(new C0921Yo());
        t90.b = -9223372036854775807L;
        t90.c = new long[0];
        t90.d = new long[0];
        this.e = t90;
        this.g = 1;
    }

    public final C2562qX b(C0554Kk c0554Kk) {
        int i = this.l;
        C2562qX c2562qX = this.d;
        byte[] bArr = c2562qX.a;
        if (i > bArr.length) {
            c2562qX.D(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            c2562qX.F(0);
        }
        c2562qX.E(this.l);
        c0554Kk.a(c2562qX.a, 0, this.l, false);
        return c2562qX;
    }

    @Override // o.InterfaceC0302As
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // o.InterfaceC0302As
    public final boolean e(InterfaceC0328Bs interfaceC0328Bs) {
        C2562qX c2562qX = this.a;
        C0554Kk c0554Kk = (C0554Kk) interfaceC0328Bs;
        c0554Kk.x(c2562qX.a, 0, 3, false);
        c2562qX.F(0);
        if (c2562qX.w() != 4607062) {
            return false;
        }
        c0554Kk.x(c2562qX.a, 0, 2, false);
        c2562qX.F(0);
        if ((c2562qX.z() & C3080vp0.y0) != 0) {
            return false;
        }
        c0554Kk.x(c2562qX.a, 0, 4, false);
        c2562qX.F(0);
        int iG = c2562qX.g();
        c0554Kk.q = 0;
        c0554Kk.b(iG, false);
        c0554Kk.x(c2562qX.a, 0, 4, false);
        c2562qX.F(0);
        return c2562qX.g() == 0;
    }

    @Override // o.InterfaceC0302As
    public final void f(InterfaceC0354Cs interfaceC0354Cs) {
        this.f = interfaceC0354Cs;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0006 A[SYNTHETIC] */
    @Override // o.InterfaceC0302As
    public final int h(InterfaceC0328Bs interfaceC0328Bs, C2800sv c2800sv) throws C2949uX {
        long j;
        boolean zS;
        boolean z;
        long j2;
        AbstractC0397Ej.g(this.f);
        while (true) {
            int i = this.g;
            if (i == 1) {
                C2562qX c2562qX = this.b;
                if (!((C0554Kk) interfaceC0328Bs).a(c2562qX.a, 0, 9, true)) {
                    return -1;
                }
                c2562qX.F(0);
                c2562qX.G(4);
                int iU = c2562qX.u();
                boolean z2 = (iU & 4) != 0;
                boolean z3 = (iU & 1) != 0;
                if (z2 && this.f1049o == null) {
                    this.f1049o = new C1950k7(this.f.s(8, 1));
                }
                if (z3 && this.p == null) {
                    this.p = new C1143bt0(this.f.s(9, 2));
                }
                this.f.f();
                this.j = c2562qX.g() - 5;
                this.g = 2;
            } else if (i == 2) {
                ((C0554Kk) interfaceC0328Bs).q(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i == 3) {
                C2562qX c2562qX2 = this.c;
                if (!((C0554Kk) interfaceC0328Bs).a(c2562qX2.a, 0, 11, true)) {
                    return -1;
                }
                c2562qX2.F(0);
                this.k = c2562qX2.u();
                this.l = c2562qX2.w();
                this.m = c2562qX2.w();
                this.m = (((long) (c2562qX2.u() << 24)) | this.m) * 1000;
                c2562qX2.G(3);
                this.g = 4;
            } else {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                boolean z4 = this.h;
                T90 t90 = this.e;
                if (z4) {
                    j = this.i + this.m;
                } else {
                    j = t90.b == -9223372036854775807L ? 0L : this.m;
                }
                int i2 = this.k;
                if (i2 != 8 || this.f1049o == null) {
                    if (i2 != 9 || this.p == null) {
                        if (i2 != 18 || this.n) {
                            ((C0554Kk) interfaceC0328Bs).q(this.l);
                            zS = false;
                            z = false;
                        } else {
                            C2562qX c2562qXB = b((C0554Kk) interfaceC0328Bs);
                            t90.getClass();
                            t90.r(j, c2562qXB);
                            long j3 = t90.b;
                            if (j3 != -9223372036854775807L) {
                                this.f.i(new C3222xF(j3, t90.d, t90.c));
                                this.n = true;
                            }
                        }
                        if (!this.h && zS) {
                            this.h = true;
                            if (t90.b == -9223372036854775807L) {
                                j2 = -this.m;
                            } else {
                                j2 = 0;
                            }
                            this.i = j2;
                        }
                        this.j = 4;
                        this.g = 2;
                        if (z) {
                            return 0;
                        }
                    } else {
                        if (!this.n) {
                            this.f.i(new C3114w7(-9223372036854775807L));
                            this.n = true;
                        }
                        C1143bt0 c1143bt0 = this.p;
                        C2562qX c2562qXB2 = b((C0554Kk) interfaceC0328Bs);
                        if (c1143bt0.r(c2562qXB2) && c1143bt0.s(j, c2562qXB2)) {
                            zS = true;
                        }
                    }
                    zS = false;
                } else {
                    if (!this.n) {
                        this.f.i(new C3114w7(-9223372036854775807L));
                        this.n = true;
                    }
                    C1950k7 c1950k7 = this.f1049o;
                    C2562qX c2562qXB3 = b((C0554Kk) interfaceC0328Bs);
                    c1950k7.r(c2562qXB3);
                    zS = c1950k7.s(j, c2562qXB3);
                }
                z = true;
                if (!this.h) {
                    this.h = true;
                    if (t90.b == -9223372036854775807L) {
                        j2 = -this.m;
                    } else {
                        j2 = 0;
                    }
                    this.i = j2;
                }
                this.j = 4;
                this.g = 2;
                if (z) {
                    return 0;
                }
            }
        }
    }

    @Override // o.InterfaceC0302As
    public final void a() {
    }
}
