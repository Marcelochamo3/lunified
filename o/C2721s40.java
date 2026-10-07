package o;

import android.util.SparseArray;

/* JADX INFO: renamed from: o.s40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2721s40 implements InterfaceC0302As {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public C2607qv i;
    public InterfaceC0354Cs j;
    public boolean k;
    public final Oj0 a = new Oj0(0);
    public final C2562qX c = new C2562qX(C1672hI.a.f);
    public final SparseArray b = new SparseArray();
    public final C2528q40 d = new C2528q40();

    @Override // o.InterfaceC0302As
    public final void d(long j, long j2) {
        Oj0 oj0 = this.a;
        boolean z = oj0.d() == -9223372036854775807L;
        if (!z) {
            long jC = oj0.c();
            z = (jC == -9223372036854775807L || jC == 0 || jC == j2) ? false : true;
        }
        if (z) {
            oj0.f(j2);
        }
        C2607qv c2607qv = this.i;
        if (c2607qv != null) {
            c2607qv.d(j2);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            C2624r40 c2624r40 = (C2624r40) sparseArray.valueAt(i);
            c2624r40.f = false;
            c2624r40.a.a();
            i++;
        }
    }

    @Override // o.InterfaceC0302As
    public final boolean e(InterfaceC0328Bs interfaceC0328Bs) {
        byte[] bArr = new byte[14];
        C0554Kk c0554Kk = (C0554Kk) interfaceC0328Bs;
        c0554Kk.x(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c0554Kk.b(bArr[13] & 7, false);
        c0554Kk.x(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // o.InterfaceC0302As
    public final void f(InterfaceC0354Cs interfaceC0354Cs) {
        this.j = interfaceC0354Cs;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0236  */
    @Override // o.InterfaceC0302As
    public final int h(InterfaceC0328Bs interfaceC0328Bs, C2800sv c2800sv) {
        long j;
        InterfaceC3273xp la;
        long jC;
        long jC2;
        AbstractC0397Ej.g(this.j);
        C0554Kk c0554Kk = (C0554Kk) interfaceC0328Bs;
        int i = 1;
        long j2 = c0554Kk.n;
        C2528q40 c2528q40 = this.d;
        if (j2 != -1 && !c2528q40.c) {
            boolean z = c2528q40.e;
            C2562qX c2562qX = c2528q40.b;
            if (!z) {
                int iMin = (int) Math.min(20000L, j2);
                long j3 = j2 - ((long) iMin);
                if (c0554Kk.f369o != j3) {
                    c2800sv.a = j3;
                } else {
                    c2562qX.C(iMin);
                    c0554Kk.q = 0;
                    c0554Kk.x(c2562qX.a, 0, iMin, false);
                    int i2 = c2562qX.b;
                    int i3 = c2562qX.c - 4;
                    while (true) {
                        if (i3 < i2) {
                            jC2 = -9223372036854775807L;
                            break;
                        }
                        if (C2528q40.b(i3, c2562qX.a) == 442) {
                            c2562qX.F(i3 + 4);
                            jC2 = C2528q40.c(c2562qX);
                            if (jC2 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i3--;
                    }
                    c2528q40.g = jC2;
                    c2528q40.e = true;
                    i = 0;
                }
            } else {
                if (c2528q40.g == -9223372036854775807L) {
                    c2528q40.a(c0554Kk);
                    return 0;
                }
                if (c2528q40.d) {
                    long j4 = c2528q40.f;
                    if (j4 == -9223372036854775807L) {
                        c2528q40.a(c0554Kk);
                        return 0;
                    }
                    Oj0 oj0 = c2528q40.a;
                    long jB = oj0.b(c2528q40.g) - oj0.b(j4);
                    c2528q40.h = jB;
                    if (jB < 0) {
                        AP.z();
                        c2528q40.h = -9223372036854775807L;
                    }
                    c2528q40.a(c0554Kk);
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, j2);
                long j5 = 0;
                if (c0554Kk.f369o != j5) {
                    c2800sv.a = j5;
                } else {
                    c2562qX.C(iMin2);
                    c0554Kk.q = 0;
                    c0554Kk.x(c2562qX.a, 0, iMin2, false);
                    int i4 = c2562qX.b;
                    int i5 = c2562qX.c;
                    while (true) {
                        if (i4 >= i5 - 3) {
                            jC = -9223372036854775807L;
                            break;
                        }
                        if (C2528q40.b(i4, c2562qX.a) == 442) {
                            c2562qX.F(i4 + 4);
                            jC = C2528q40.c(c2562qX);
                            if (jC != -9223372036854775807L) {
                                break;
                            }
                        }
                        i4++;
                    }
                    c2528q40.f = jC;
                    c2528q40.d = true;
                    i = 0;
                }
            }
            return i;
        }
        if (this.k) {
            j = j2;
        } else {
            this.k = true;
            long j6 = c2528q40.h;
            if (j6 != -9223372036854775807L) {
                j = j2;
                C2607qv c2607qv = new C2607qv(new C2691rp(24), new C2994uv(c2528q40.a), j6, j6 + 1, 0L, j, 188L, 1000);
                this.i = c2607qv;
                this.j.i(c2607qv.a);
            } else {
                j = j2;
                this.j.i(new C3114w7(j6));
            }
        }
        C2607qv c2607qv2 = this.i;
        if (c2607qv2 != null && c2607qv2.c != null) {
            return c2607qv2.b(c0554Kk, c2800sv);
        }
        c0554Kk.q = 0;
        long jA = j2 != -1 ? j - c0554Kk.A() : -1L;
        if (jA != -1 && jA < 4) {
            return -1;
        }
        C2562qX c2562qX2 = this.c;
        if (!c0554Kk.x(c2562qX2.a, 0, 4, true)) {
            return -1;
        }
        c2562qX2.F(0);
        int iG = c2562qX2.g();
        if (iG == 441) {
            return -1;
        }
        if (iG == 442) {
            c0554Kk.x(c2562qX2.a, 0, 10, false);
            c2562qX2.F(9);
            c0554Kk.q((c2562qX2.u() & 7) + 14);
            return 0;
        }
        if (iG == 443) {
            c0554Kk.x(c2562qX2.a, 0, 2, false);
            c2562qX2.F(0);
            c0554Kk.q(c2562qX2.z() + 6);
            return 0;
        }
        if (((iG & (-256)) >> 8) != 1) {
            c0554Kk.q(1);
            return 0;
        }
        int i6 = iG & 255;
        SparseArray sparseArray = this.b;
        C2624r40 c2624r40 = (C2624r40) sparseArray.get(i6);
        if (!this.e) {
            if (c2624r40 == null) {
                InterfaceC3273xp interfaceC3273xp = null;
                if (i6 == 189) {
                    la = new C2519q0(null, 0);
                    this.f = true;
                    this.h = c0554Kk.f369o;
                } else if ((iG & 224) == 192) {
                    la = new C3138wS(null);
                    this.f = true;
                    this.h = c0554Kk.f369o;
                } else if ((iG & 240) == 224) {
                    la = new LA(null);
                    this.g = true;
                    this.h = c0554Kk.f369o;
                } else if (interfaceC3273xp != null) {
                    interfaceC3273xp.d(this.j, new Ym0(i6, 256));
                    c2624r40 = new C2624r40(interfaceC3273xp, this.a);
                    sparseArray.put(i6, c2624r40);
                }
                interfaceC3273xp = la;
                if (interfaceC3273xp != null) {
                    interfaceC3273xp.d(this.j, new Ym0(i6, 256));
                    c2624r40 = new C2624r40(interfaceC3273xp, this.a);
                    sparseArray.put(i6, c2624r40);
                }
            }
            if (c0554Kk.f369o > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = true;
                this.j.f();
            }
        }
        c0554Kk.x(c2562qX2.a, 0, 2, false);
        c2562qX2.F(0);
        int iZ = c2562qX2.z() + 6;
        if (c2624r40 == null) {
            c0554Kk.q(iZ);
            return 0;
        }
        c2562qX2.C(iZ);
        c0554Kk.a(c2562qX2.a, 0, iZ, false);
        c2562qX2.F(6);
        C2084lc c2084lc = c2624r40.c;
        c2562qX2.e(c2084lc.b, 0, 3);
        c2084lc.p(0);
        c2084lc.s(8);
        c2624r40.d = c2084lc.h();
        c2624r40.e = c2084lc.h();
        c2084lc.s(6);
        c2562qX2.e(c2084lc.b, 0, c2084lc.i(8));
        c2084lc.p(0);
        c2624r40.g = 0L;
        if (c2624r40.d) {
            c2084lc.s(4);
            long jI = ((long) c2084lc.i(3)) << 30;
            c2084lc.s(1);
            long jI2 = jI | ((long) (c2084lc.i(15) << 15));
            c2084lc.s(1);
            long jI3 = jI2 | ((long) c2084lc.i(15));
            c2084lc.s(1);
            boolean z2 = c2624r40.f;
            Oj0 oj1 = c2624r40.b;
            if (!z2 && c2624r40.e) {
                c2084lc.s(4);
                long jI4 = ((long) c2084lc.i(3)) << 30;
                c2084lc.s(1);
                long jI5 = ((long) (c2084lc.i(15) << 15)) | jI4;
                c2084lc.s(1);
                long jI6 = jI5 | ((long) c2084lc.i(15));
                c2084lc.s(1);
                oj1.b(jI6);
                c2624r40.f = true;
            }
            c2624r40.g = oj1.b(jI3);
        }
        long j7 = c2624r40.g;
        InterfaceC3273xp interfaceC3273xp2 = c2624r40.a;
        interfaceC3273xp2.c(4, j7);
        interfaceC3273xp2.b(c2562qX2);
        interfaceC3273xp2.e();
        c2562qX2.E(c2562qX2.a.length);
        return 0;
    }

    @Override // o.InterfaceC0302As
    public final void a() {
    }
}
