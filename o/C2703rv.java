package o;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: o.rv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2703rv implements InterfaceC0302As {
    public InterfaceC0354Cs e;
    public InterfaceC1324dm0 f;
    public CQ h;
    public C3091vv i;
    public int j;
    public int k;
    public C2607qv l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final C2562qX b = new C2562qX(0, new byte[32768]);
    public final boolean c = false;
    public final C2800sv d = new C2800sv();
    public int g = 0;

    @Override // o.InterfaceC0302As
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            C2607qv c2607qv = this.l;
            if (c2607qv != null) {
                c2607qv.d(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.C(0);
    }

    @Override // o.InterfaceC0302As
    public final boolean e(InterfaceC0328Bs interfaceC0328Bs) {
        C0554Kk c0554Kk = (C0554Kk) interfaceC0328Bs;
        CQ cqY = new C0334By(5).y(c0554Kk, ME.e);
        if (cqY != null) {
            int length = cqY.l.length;
        }
        C2562qX c2562qX = new C2562qX(4);
        c0554Kk.x(c2562qX.a, 0, 4, false);
        return c2562qX.v() == 1716281667;
    }

    @Override // o.InterfaceC0302As
    public final void f(InterfaceC0354Cs interfaceC0354Cs) {
        this.e = interfaceC0354Cs;
        this.f = interfaceC0354Cs.s(0, 1);
        interfaceC0354Cs.f();
    }

    @Override // o.InterfaceC0302As
    public final int h(InterfaceC0328Bs interfaceC0328Bs, C2800sv c2800sv) throws C2949uX, EOFException, InterruptedIOException {
        C3091vv c3091vv;
        CQ cq;
        InterfaceC2664rb0 c3114w7;
        InterfaceC0354Cs interfaceC0354Cs;
        long j;
        boolean z;
        long j2;
        boolean zG;
        boolean z2 = true;
        int i = this.g;
        CQ cq2 = null;
        if (i == 0) {
            boolean z3 = !this.c;
            C0554Kk c0554Kk = (C0554Kk) interfaceC0328Bs;
            c0554Kk.q = 0;
            long jA = c0554Kk.A();
            CQ cqY = new C0334By(5).y(c0554Kk, z3 ? null : ME.e);
            if (cqY != null && cqY.l.length != 0) {
                cq2 = cqY;
            }
            c0554Kk.q((int) (c0554Kk.A() - jA));
            this.h = cq2;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i == 1) {
            C0554Kk c0554Kk2 = (C0554Kk) interfaceC0328Bs;
            c0554Kk2.x(bArr, 0, bArr.length, false);
            c0554Kk2.q = 0;
            this.g = 2;
            return 0;
        }
        int i2 = 3;
        if (i == 2) {
            C2562qX c2562qX = new C2562qX(4);
            ((C0554Kk) interfaceC0328Bs).a(c2562qX.a, 0, 4, false);
            if (c2562qX.v() != 1716281667) {
                throw C2949uX.a("Failed to read FLAC stream marker.", null);
            }
            this.g = 3;
            return 0;
        }
        int i3 = 7;
        if (i == 3) {
            C3091vv c3091vv2 = this.i;
            boolean z4 = false;
            while (!z4) {
                C0554Kk c0554Kk3 = (C0554Kk) interfaceC0328Bs;
                c0554Kk3.q = 0;
                byte[] bArr2 = new byte[4];
                C2084lc c2084lc = new C2084lc(4, bArr2);
                c0554Kk3.x(bArr2, 0, 4, false);
                boolean zH = c2084lc.h();
                int i4 = c2084lc.i(i3);
                int i5 = c2084lc.i(24) + 4;
                if (i4 == 0) {
                    byte[] bArr3 = new byte[38];
                    c0554Kk3.a(bArr3, 0, 38, false);
                    c3091vv2 = new C3091vv(4, bArr3);
                } else {
                    if (c3091vv2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (i4 == i2) {
                        C2562qX c2562qX2 = new C2562qX(i5);
                        c0554Kk3.a(c2562qX2.a, 0, i5, false);
                        c3091vv = new C3091vv(c3091vv2.a, c3091vv2.b, c3091vv2.c, c3091vv2.d, c3091vv2.e, c3091vv2.g, c3091vv2.h, c3091vv2.j, AbstractC1459f50.I(c2562qX2), c3091vv2.l);
                    } else {
                        CQ cqA = c3091vv2.l;
                        if (i4 == 4) {
                            C2562qX c2562qX3 = new C2562qX(i5);
                            c0554Kk3.a(c2562qX3.a, 0, i5, false);
                            c2562qX3.G(4);
                            CQ cqI = AbstractC1370eA.I(Arrays.asList((String[]) AbstractC1370eA.L(c2562qX3, false, false).l));
                            if (cqA == null) {
                                cq = cqI;
                            } else {
                                if (cqI != null) {
                                    cqA = cqA.a(cqI.l);
                                }
                                cq = cqA;
                            }
                            c3091vv = new C3091vv(c3091vv2.a, c3091vv2.b, c3091vv2.c, c3091vv2.d, c3091vv2.e, c3091vv2.g, c3091vv2.h, c3091vv2.j, c3091vv2.k, cq);
                        } else if (i4 == 6) {
                            C2562qX c2562qX4 = new C2562qX(i5);
                            c0554Kk3.a(c2562qX4.a, 0, i5, false);
                            c2562qX4.G(4);
                            CQ cq3 = new CQ(AbstractC0985aF.q(OY.a(c2562qX4)));
                            if (cqA != null) {
                                cq3 = cqA.a(cq3.l);
                            }
                            c3091vv = new C3091vv(c3091vv2.a, c3091vv2.b, c3091vv2.c, c3091vv2.d, c3091vv2.e, c3091vv2.g, c3091vv2.h, c3091vv2.j, c3091vv2.k, cq3);
                        } else {
                            c0554Kk3.q(i5);
                        }
                    }
                    c3091vv2 = c3091vv;
                }
                int i6 = Lr0.a;
                this.i = c3091vv2;
                z4 = zH;
                i2 = 3;
                i3 = 7;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            InterfaceC1324dm0 interfaceC1324dm0 = this.f;
            int i7 = Lr0.a;
            interfaceC1324dm0.a(this.i.c(bArr, this.h));
            this.g = 4;
            return 0;
        }
        long j3 = 0;
        if (i == 4) {
            C0554Kk c0554Kk4 = (C0554Kk) interfaceC0328Bs;
            c0554Kk4.q = 0;
            C2562qX c2562qX5 = new C2562qX(2);
            c0554Kk4.x(c2562qX5.a, 0, 2, false);
            int iZ = c2562qX5.z();
            if ((iZ >> 2) != 16382) {
                c0554Kk4.q = 0;
                throw C2949uX.a("First frame does not start with sync code.", null);
            }
            c0554Kk4.q = 0;
            this.k = iZ;
            InterfaceC0354Cs interfaceC0354Cs2 = this.e;
            int i8 = Lr0.a;
            long j4 = c0554Kk4.f369o;
            this.i.getClass();
            C3091vv c3091vv3 = this.i;
            if (c3091vv3.k != null) {
                c3114w7 = new C3114w7(c3091vv3, j4, 1);
                interfaceC0354Cs = interfaceC0354Cs2;
            } else {
                long j5 = c0554Kk4.n;
                if (j5 == -1 || c3091vv3.j <= 0) {
                    interfaceC0354Cs2 = interfaceC0354Cs2;
                    c3114w7 = new C3114w7(c3091vv3.b());
                } else {
                    int i9 = this.k;
                    C2278nc c2278nc = new C2278nc(15, c3091vv3);
                    C2613qy c2613qy = new C2613qy(c3091vv3, i9);
                    long jB = c3091vv3.b();
                    int i10 = c3091vv3.c;
                    int i11 = c3091vv3.d;
                    if (i11 > 0) {
                        j = ((((long) i11) + ((long) i10)) / 2) + 1;
                    } else {
                        int i12 = c3091vv3.b;
                        int i13 = c3091vv3.a;
                        j = (((((i13 != i12 || i13 <= 0) ? 4096L : i13) * ((long) c3091vv3.g)) * ((long) c3091vv3.h)) / 8) + 64;
                    }
                    C2607qv c2607qv = new C2607qv(c2278nc, c2613qy, jB, c3091vv3.j, j4, j5, j, Math.max(6, i10));
                    this.l = c2607qv;
                    c3114w7 = c2607qv.a;
                }
                interfaceC0354Cs = interfaceC0354Cs2;
            }
            interfaceC0354Cs.i(c3114w7);
            this.g = 5;
            return 0;
        }
        if (i != 5) {
            throw new IllegalStateException();
        }
        this.f.getClass();
        this.i.getClass();
        C2607qv c2607qv2 = this.l;
        if (c2607qv2 != null && c2607qv2.c != null) {
            return c2607qv2.b((C0554Kk) interfaceC0328Bs, c2800sv);
        }
        if (this.n == -1) {
            C3091vv c3091vv4 = this.i;
            C0554Kk c0554Kk5 = (C0554Kk) interfaceC0328Bs;
            c0554Kk5.q = 0;
            c0554Kk5.b(1, false);
            byte[] bArr4 = new byte[1];
            c0554Kk5.x(bArr4, 0, 1, false);
            boolean z5 = (bArr4[0] & 1) == 1;
            c0554Kk5.b(2, false);
            i3 = z5 ? 7 : 6;
            C2562qX c2562qX6 = new C2562qX(i3);
            byte[] bArr5 = c2562qX6.a;
            int i14 = 0;
            while (i14 < i3) {
                int iE = c0554Kk5.e(bArr5, i14, i3 - i14);
                if (iE == -1) {
                    break;
                }
                i14 += iE;
            }
            c2562qX6.E(i14);
            c0554Kk5.q = 0;
            try {
                long jA2 = c2562qX6.A();
                if (!z5) {
                    jA2 *= (long) c3091vv4.b;
                }
                j3 = jA2;
            } catch (NumberFormatException unused) {
                z2 = false;
            }
            if (!z2) {
                throw C2949uX.a(null, null);
            }
            this.n = j3;
            return 0;
        }
        C2562qX c2562qX7 = this.b;
        int i15 = c2562qX7.c;
        if (i15 < 32768) {
            int iD = ((C0554Kk) interfaceC0328Bs).D(c2562qX7.a, i15, 32768 - i15);
            z = iD == -1;
            if (!z) {
                c2562qX7.E(i15 + iD);
            } else if (c2562qX7.a() == 0) {
                long j6 = this.n * 1000000;
                C3091vv c3091vv5 = this.i;
                int i16 = Lr0.a;
                this.f.d(j6 / ((long) c3091vv5.e), 1, this.m, 0, null);
                return -1;
            }
        } else {
            z = false;
        }
        int i17 = c2562qX7.b;
        int i18 = this.m;
        int i19 = this.j;
        if (i18 < i19) {
            c2562qX7.G(Math.min(i19 - i18, c2562qX7.a()));
        }
        this.i.getClass();
        int i20 = c2562qX7.b;
        while (true) {
            int i21 = c2562qX7.c - 16;
            C2800sv c2800sv2 = this.d;
            if (i20 > i21) {
                if (z) {
                    while (true) {
                        int i22 = c2562qX7.c;
                        if (i20 <= i22 - this.j) {
                            c2562qX7.F(i20);
                            try {
                                zG = AbstractC3045vW.g(c2562qX7, this.i, this.k, c2800sv2);
                            } catch (IndexOutOfBoundsException unused2) {
                                zG = false;
                            }
                            if (c2562qX7.b > c2562qX7.c) {
                                zG = false;
                            }
                            if (zG) {
                                c2562qX7.F(i20);
                                j2 = c2800sv2.a;
                                break;
                            }
                            i20++;
                        } else {
                            c2562qX7.F(i22);
                        }
                    }
                } else {
                    c2562qX7.F(i20);
                }
                j2 = -1;
                break;
            }
            c2562qX7.F(i20);
            if (AbstractC3045vW.g(c2562qX7, this.i, this.k, c2800sv2)) {
                c2562qX7.F(i20);
                j2 = c2800sv2.a;
                break;
            }
            i20++;
        }
        int i23 = c2562qX7.b - i17;
        c2562qX7.F(i17);
        this.f.e(i23, c2562qX7);
        int i24 = this.m + i23;
        this.m = i24;
        if (j2 != -1) {
            long j7 = this.n * 1000000;
            C3091vv c3091vv6 = this.i;
            int i25 = Lr0.a;
            this.f.d(j7 / ((long) c3091vv6.e), 1, i24, 0, null);
            this.m = 0;
            this.n = j2;
        }
        if (c2562qX7.a() >= 16) {
            return 0;
        }
        int iA = c2562qX7.a();
        byte[] bArr6 = c2562qX7.a;
        System.arraycopy(bArr6, c2562qX7.b, bArr6, 0, iA);
        c2562qX7.F(0);
        c2562qX7.E(iA);
        return 0;
    }

    @Override // o.InterfaceC0302As
    public final void a() {
    }
}
