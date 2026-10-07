package o;

/* JADX INFO: loaded from: classes.dex */
public final class FY implements Zm0 {
    public final InterfaceC3273xp a;
    public final C2084lc b = new C2084lc(10, new byte[10]);
    public int c = 0;
    public int d;
    public Oj0 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public FY(InterfaceC3273xp interfaceC3273xp) {
        this.a = interfaceC3273xp;
    }

    @Override // o.Zm0
    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    @Override // o.Zm0
    public final void b(int i, C2562qX c2562qX) {
        int i2;
        AbstractC0397Ej.g(this.e);
        int i3 = i & 1;
        InterfaceC3273xp interfaceC3273xp = this.a;
        int i4 = -1;
        int i5 = 3;
        int i6 = 2;
        if (i3 != 0) {
            int i7 = this.c;
            if (i7 != 0 && i7 != 1) {
                if (i7 == 2) {
                    AP.z();
                } else {
                    if (i7 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        AP.z();
                    }
                    interfaceC3273xp.e();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i8 = i;
        while (c2562qX.a() > 0) {
            int i9 = this.c;
            if (i9 != 0) {
                C2084lc c2084lc = this.b;
                if (i9 != 1) {
                    if (i9 == i6) {
                        if (d(c2562qX, c2084lc.b, Math.min(10, this.i)) && d(c2562qX, null, this.i)) {
                            c2084lc.p(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                c2084lc.s(4);
                                long jI = ((long) c2084lc.i(i5)) << 30;
                                c2084lc.s(1);
                                long jI2 = ((long) (c2084lc.i(15) << 15)) | jI;
                                c2084lc.s(1);
                                long jI3 = jI2 | ((long) c2084lc.i(15));
                                c2084lc.s(1);
                                if (!this.h && this.g) {
                                    c2084lc.s(4);
                                    long jI4 = ((long) c2084lc.i(i5)) << 30;
                                    c2084lc.s(1);
                                    long jI5 = ((long) (c2084lc.i(15) << 15)) | jI4;
                                    c2084lc.s(1);
                                    long jI6 = jI5 | ((long) c2084lc.i(15));
                                    c2084lc.s(1);
                                    this.e.b(jI6);
                                    this.h = true;
                                }
                                this.l = this.e.b(jI3);
                            }
                            i8 |= this.k ? 4 : 0;
                            interfaceC3273xp.c(i8, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i9 != i5) {
                            throw new IllegalStateException();
                        }
                        int iA = c2562qX.a();
                        int i10 = this.j;
                        int i11 = i10 == i4 ? 0 : iA - i10;
                        if (i11 > 0) {
                            iA -= i11;
                            c2562qX.E(c2562qX.b + iA);
                        }
                        interfaceC3273xp.b(c2562qX);
                        int i12 = this.j;
                        if (i12 != i4) {
                            int i13 = i12 - iA;
                            this.j = i13;
                            if (i13 == 0) {
                                interfaceC3273xp.e();
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (d(c2562qX, c2084lc.b, 9)) {
                    c2084lc.p(0);
                    if (c2084lc.i(24) != 1) {
                        AP.z();
                        this.j = -1;
                        i2 = 0;
                    } else {
                        c2084lc.s(8);
                        int i14 = c2084lc.i(16);
                        c2084lc.s(5);
                        this.k = c2084lc.h();
                        c2084lc.s(2);
                        this.f = c2084lc.h();
                        this.g = c2084lc.h();
                        c2084lc.s(6);
                        int i15 = c2084lc.i(8);
                        this.i = i15;
                        if (i14 == 0) {
                            this.j = -1;
                        } else {
                            int i16 = (i14 - 3) - i15;
                            this.j = i16;
                            if (i16 < 0) {
                                AP.z();
                                this.j = -1;
                            }
                        }
                        i2 = 2;
                    }
                    this.c = i2;
                    this.d = 0;
                }
            } else {
                c2562qX.G(c2562qX.a());
            }
            i4 = -1;
            i5 = 3;
            i6 = 2;
        }
    }

    @Override // o.Zm0
    public final void c(Oj0 oj0, InterfaceC0354Cs interfaceC0354Cs, Ym0 ym0) {
        this.e = oj0;
        this.a.d(interfaceC0354Cs, ym0);
    }

    public final boolean d(C2562qX c2562qX, byte[] bArr, int i) {
        int iMin = Math.min(c2562qX.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c2562qX.G(iMin);
        } else {
            c2562qX.e(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }
}
