package o;

import java.io.EOFException;

/* JADX INFO: renamed from: o.rS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2653rS implements InterfaceC0302As {
    public static final C0633Nm u = new C0633Nm(21);
    public final int a;
    public final long b;
    public final C2562qX c;
    public final C3235xS d;
    public final C1642gz e;
    public final C0334By f;
    public final C0921Yo g;
    public InterfaceC0354Cs h;
    public InterfaceC1324dm0 i;
    public InterfaceC1324dm0 j;
    public int k;
    public CQ l;
    public long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1003o;
    public int p;
    public InterfaceC3052vb0 q;
    public boolean r;
    public boolean s;
    public long t;

    public C2653rS() {
        this(-9223372036854775807L);
    }

    public static long c(CQ cq) {
        if (cq == null) {
            return -9223372036854775807L;
        }
        int iF = cq.f();
        for (int i = 0; i < iF; i++) {
            BQ bqE = cq.e(i);
            if (bqE instanceof Li0) {
                Li0 li0 = (Li0) bqE;
                if (li0.l.equals("TLEN")) {
                    return Lr0.K(Long.parseLong((String) li0.n.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    public final C0342Cg b(C0554Kk c0554Kk, boolean z) {
        C2562qX c2562qX = this.c;
        c0554Kk.x(c2562qX.a, 0, 4, false);
        c2562qX.F(0);
        int iG = c2562qX.g();
        C3235xS c3235xS = this.d;
        c3235xS.a(iG);
        return new C0342Cg(c0554Kk.n, c0554Kk.f369o, c3235xS.e, c3235xS.b, z);
    }

    @Override // o.InterfaceC0302As
    public final void d(long j, long j2) {
        this.k = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.p = 0;
        this.t = j2;
        InterfaceC3052vb0 interfaceC3052vb0 = this.q;
        if (!(interfaceC3052vb0 instanceof C3319yF) || ((C3319yF) interfaceC3052vb0).a(j2)) {
            return;
        }
        this.s = true;
        this.j = this.g;
    }

    @Override // o.InterfaceC0302As
    public final boolean e(InterfaceC0328Bs interfaceC0328Bs) {
        return i((C0554Kk) interfaceC0328Bs, true);
    }

    @Override // o.InterfaceC0302As
    public final void f(InterfaceC0354Cs interfaceC0354Cs) {
        this.h = interfaceC0354Cs;
        InterfaceC1324dm0 interfaceC1324dm0S = interfaceC0354Cs.s(0, 1);
        this.i = interfaceC1324dm0S;
        this.j = interfaceC1324dm0S;
        this.h.f();
    }

    public final boolean g(C0554Kk c0554Kk) {
        InterfaceC3052vb0 interfaceC3052vb0 = this.q;
        if (interfaceC3052vb0 != null) {
            long jC = interfaceC3052vb0.c();
            if (jC != -1 && c0554Kk.A() > jC - 4) {
                return true;
            }
        }
        try {
            return !c0554Kk.x(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0363  */
    /* JADX WARN: Code duplicated, block: B:186:0x0412  */
    /* JADX WARN: Code duplicated, block: B:189:0x041a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.InterfaceC0302As
    public final int h(InterfaceC0328Bs interfaceC0328Bs, C2800sv c2800sv) throws C2949uX {
        int i;
        int i2;
        C2562qX c2562qX;
        InterfaceC0328Bs interfaceC0328Bs2;
        int iB;
        int i3;
        int i4;
        int iG;
        C0554Kk c0554Kk;
        InterfaceC3052vb0 interfaceC3052vb0B;
        C2653rS c2653rS;
        int iX;
        Zw0 zw0;
        InterfaceC3052vb0 interfaceC3052vb0;
        C1642gz c1642gz;
        KQ kq;
        InterfaceC3052vb0 c3319yF;
        long jC;
        InterfaceC3052vb0 interfaceC3052vb0B2;
        C2562qX c2562qX2;
        C0554Kk c0554Kk2;
        int iU;
        C2653rS c2653rS2 = this;
        AbstractC0397Ej.g(c2653rS2.i);
        int i5 = Lr0.a;
        int i6 = c2653rS2.k;
        C3235xS c3235xS = c2653rS2.d;
        if (i6 == 0) {
            try {
                c2653rS2.i((C0554Kk) interfaceC0328Bs, false);
            } catch (EOFException unused) {
                i = -1;
                i2 = -1;
            }
        }
        InterfaceC3052vb0 interfaceC3052vb1 = c2653rS2.q;
        C2562qX c2562qX3 = c2653rS2.c;
        if (interfaceC3052vb1 == null) {
            C2562qX c2562qX4 = new C2562qX(c3235xS.b);
            C0554Kk c0554Kk3 = (C0554Kk) interfaceC0328Bs;
            c0554Kk3.x(c2562qX4.a, 0, c3235xS.b, false);
            int i7 = 21;
            if ((c3235xS.a & 1) != 0) {
                if (c3235xS.d != 1) {
                    i7 = 36;
                }
            } else if (c3235xS.d == 1) {
                i7 = 13;
            }
            if (c2562qX4.c >= i7 + 4) {
                c2562qX4.F(i7);
                iG = c2562qX4.g();
                if (iG != 1483304551 && iG != 1231971951) {
                    if (c2562qX4.c >= 40) {
                        c2562qX4.F(36);
                        if (c2562qX4.g() == 1447187017) {
                            iG = 1447187017;
                        } else {
                            iG = 0;
                        }
                    } else {
                        iG = 0;
                    }
                }
            } else if (c2562qX4.c >= 40) {
                c2562qX4.F(36);
                if (c2562qX4.g() == 1447187017) {
                    iG = 1447187017;
                } else {
                    iG = 0;
                }
            } else {
                iG = 0;
            }
            long j = c0554Kk3.n;
            C1642gz c1642gz2 = c2653rS2.e;
            long jC2 = -1;
            if (iG == 1483304551 || iG == 1231971951) {
                c0554Kk = c0554Kk3;
                long j2 = c0554Kk.f369o;
                int i8 = c3235xS.f;
                int i9 = c3235xS.c;
                int iG2 = c2562qX4.g();
                if ((iG2 & 1) != 1 || (iX = c2562qX4.x()) == 0) {
                    interfaceC3052vb0B = null;
                } else {
                    long jR = Lr0.R(iX, ((long) i8) * 1000000, i9);
                    if ((iG2 & 6) != 6) {
                        zw0 = new Zw0(j2, c3235xS.b, jR, -1L, null);
                    } else {
                        long jV = c2562qX4.v();
                        long[] jArr = new long[100];
                        for (int i10 = 0; i10 < 100; i10++) {
                            jArr[i10] = c2562qX4.u();
                        }
                        if (j != -1 && j != j2 + jV) {
                            AP.z();
                        }
                        zw0 = new Zw0(j2, c3235xS.b, jR, jV, jArr);
                    }
                    interfaceC3052vb0B = zw0;
                }
                if (interfaceC3052vb0B == null || !(c1642gz2.a == -1 || c1642gz2.b == -1)) {
                    c2562qX = c2562qX3;
                } else {
                    c0554Kk.q = 0;
                    c0554Kk.b(i7 + Yu0.b.x0, false);
                    c2562qX = c2562qX3;
                    c0554Kk.x(c2562qX.a, 0, 3, false);
                    c2562qX.F(0);
                    int iW = c2562qX.w();
                    int i11 = iW >> 12;
                    int i12 = iW & 4095;
                    if (i11 > 0 || i12 > 0) {
                        c1642gz2.a = i11;
                        c1642gz2.b = i12;
                    }
                }
                c0554Kk.q(c3235xS.b);
                if (interfaceC3052vb0B == null || interfaceC3052vb0B.g() || iG != 1231971951) {
                    c2653rS = this;
                } else {
                    c2653rS = this;
                    interfaceC3052vb0B = c2653rS.b(c0554Kk, false);
                }
            } else {
                if (iG == 1447187017) {
                    long j3 = c0554Kk3.f369o;
                    c2562qX4.G(10);
                    int iG3 = c2562qX4.g();
                    if (iG3 <= 0) {
                        c2562qX2 = c2562qX3;
                        c0554Kk2 = c0554Kk3;
                    } else {
                        int i13 = c3235xS.c;
                        long jR2 = Lr0.R(iG3, ((long) (i13 >= 32000 ? 1152 : 576)) * 1000000, i13);
                        int iZ = c2562qX4.z();
                        int iZ2 = c2562qX4.z();
                        int iZ3 = c2562qX4.z();
                        c2562qX4.G(2);
                        long j4 = j3 + ((long) c3235xS.b);
                        long[] jArr2 = new long[iZ];
                        long[] jArr3 = new long[iZ];
                        c2562qX2 = c2562qX3;
                        c0554Kk2 = c0554Kk3;
                        long j5 = j3;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= iZ) {
                                long j6 = j;
                                if (j6 != -1 && j6 != j5) {
                                    AP.z();
                                }
                                interfaceC3052vb0B = new C1824is0(jArr2, jArr3, jR2, j5);
                                break;
                            }
                            long j7 = j;
                            int i15 = iZ2;
                            int i16 = iZ3;
                            jArr2[i14] = (((long) i14) * jR2) / ((long) iZ);
                            jArr3[i14] = Math.max(j5, j4);
                            if (i16 == 1) {
                                iU = c2562qX4.u();
                            } else if (i16 == 2) {
                                iU = c2562qX4.z();
                            } else if (i16 == 3) {
                                iU = c2562qX4.w();
                            } else if (i16 == 4) {
                                iU = c2562qX4.x();
                            }
                            j5 += ((long) iU) * ((long) i15);
                            i14++;
                            iZ2 = i15;
                            j = j7;
                            iZ = iZ;
                            iZ3 = i16;
                        }
                        c0554Kk = c0554Kk2;
                        c0554Kk.q(c3235xS.b);
                    }
                    interfaceC3052vb0B = null;
                    c0554Kk = c0554Kk2;
                    c0554Kk.q(c3235xS.b);
                } else {
                    c2562qX2 = c2562qX3;
                    c0554Kk = c0554Kk3;
                    c0554Kk.q = 0;
                    interfaceC3052vb0B = null;
                }
                c2653rS = this;
                c2562qX = c2562qX2;
            }
            CQ cq = c2653rS.l;
            long j8 = c0554Kk.f369o;
            if (cq == null) {
                interfaceC3052vb0 = interfaceC3052vb0B;
                c1642gz = c1642gz2;
                kq = null;
                break;
            }
            BQ[] bqArr = cq.l;
            int length = bqArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    interfaceC3052vb0 = interfaceC3052vb0B;
                    c1642gz = c1642gz2;
                    kq = null;
                    break;
                }
                BQ bq = bqArr[i17];
                if (bq instanceof JQ) {
                    JQ jq = (JQ) bq;
                    long jC3 = c(cq);
                    int length2 = jq.p.length;
                    int i18 = length2 + 1;
                    long[] jArr4 = new long[i18];
                    long[] jArr5 = new long[i18];
                    jArr4[0] = j8;
                    jArr5[0] = 0;
                    int i19 = 1;
                    long j9 = 0;
                    while (i19 <= length2) {
                        int i20 = i19 - 1;
                        j8 += (long) (jq.n + jq.p[i20]);
                        j9 += (long) (jq.f341o + jq.q[i20]);
                        jArr4[i19] = j8;
                        jArr5[i19] = j9;
                        i19++;
                        length2 = length2;
                        c1642gz2 = c1642gz2;
                        interfaceC3052vb0B = interfaceC3052vb0B;
                    }
                    interfaceC3052vb0 = interfaceC3052vb0B;
                    c1642gz = c1642gz2;
                    kq = new KQ(jC3, jArr4, jArr5);
                    break;
                }
                i17++;
                interfaceC3052vb0B = interfaceC3052vb0B;
            }
            c2653rS2 = this;
            boolean z = c2653rS2.r;
            int i21 = c2653rS2.a;
            if (z) {
                interfaceC3052vb0B2 = new C2955ub0(-9223372036854775807L);
            } else {
                if ((4 & i21) != 0) {
                    if (kq != null) {
                        jC = kq.c;
                    } else if (interfaceC3052vb0 != null) {
                        jC = interfaceC3052vb0.j();
                        jC2 = interfaceC3052vb0.c();
                    } else {
                        jC = c(c2653rS2.l);
                    }
                    c3319yF = new C3319yF(jC, c0554Kk.f369o, jC2);
                } else if (kq == null) {
                    c3319yF = interfaceC3052vb0 != null ? interfaceC3052vb0 : null;
                }
                if (c3319yF == null || (!c3319yF.g() && (i21 & 1) != 0)) {
                    interfaceC3052vb0B2 = c3319yF;
                    interfaceC3052vb0B2 = c3319yF;
                    interfaceC3052vb0B2 = c2653rS2.b(c0554Kk, (2 & i21) != 0);
                }
            }
            interfaceC3052vb0B2 = c3319yF;
            interfaceC3052vb0B2 = c3319yF;
            interfaceC3052vb0B2 = c3319yF;
            c2653rS2.q = interfaceC3052vb0B2;
            c2653rS2.h.i(interfaceC3052vb0B2);
            InterfaceC1324dm0 interfaceC1324dm0 = c2653rS2.j;
            C0617Mw c0617Mw = new C0617Mw();
            c0617Mw.k = (String) c3235xS.g;
            c0617Mw.l = C1672hI.a.f;
            c0617Mw.x = c3235xS.d;
            c0617Mw.y = c3235xS.c;
            C1642gz c1642gz3 = c1642gz;
            c0617Mw.A = c1642gz3.a;
            c0617Mw.B = c1642gz3.b;
            c0617Mw.i = (i21 & 8) != 0 ? null : c2653rS2.l;
            interfaceC1324dm0.a(new C0643Nw(c0617Mw));
            c2653rS2.f1003o = c0554Kk.f369o;
            interfaceC0328Bs2 = interfaceC0328Bs;
        } else {
            c2562qX = c2562qX3;
            long j10 = c2653rS2.f1003o;
            interfaceC0328Bs2 = interfaceC0328Bs;
            if (j10 != 0) {
                C0554Kk c0554Kk4 = (C0554Kk) interfaceC0328Bs2;
                long j11 = c0554Kk4.f369o;
                if (j11 < j10) {
                    c0554Kk4.q((int) (j10 - j11));
                }
            }
        }
        if (c2653rS2.p == 0) {
            C0554Kk c0554Kk5 = (C0554Kk) interfaceC0328Bs2;
            c0554Kk5.q = 0;
            if (c2653rS2.g(c0554Kk5)) {
                i4 = -1;
            } else {
                C2562qX c2562qX5 = c2562qX;
                c2562qX5.F(0);
                int iG4 = c2562qX5.g();
                if (((-128000) & iG4) != (((long) c2653rS2.k) & (-128000)) || Sr0.l(iG4) == -1) {
                    c0554Kk5.q(1);
                    c2653rS2.k = 0;
                } else {
                    c3235xS.a(iG4);
                    if (c2653rS2.m == -9223372036854775807L) {
                        c2653rS2.m = c2653rS2.q.b(c0554Kk5.f369o);
                        long j12 = c2653rS2.b;
                        if (j12 != -9223372036854775807L) {
                            c2653rS2.m = (j12 - c2653rS2.q.b(0L)) + c2653rS2.m;
                        }
                    }
                    int i22 = c3235xS.b;
                    c2653rS2.p = i22;
                    InterfaceC3052vb0 interfaceC3052vb2 = c2653rS2.q;
                    if (interfaceC3052vb2 instanceof C3319yF) {
                        C3319yF c3319yF2 = (C3319yF) interfaceC3052vb2;
                        long j13 = (((c2653rS2.n + ((long) c3235xS.f)) * 1000000) / ((long) c3235xS.c)) + c2653rS2.m;
                        long j14 = c0554Kk5.f369o + ((long) i22);
                        if (!c3319yF2.a(j13)) {
                            c3319yF2.b.b(j13);
                            c3319yF2.c.b(j14);
                        }
                        if (c2653rS2.s && c3319yF2.a(c2653rS2.t)) {
                            c2653rS2.s = false;
                            c2653rS2.j = c2653rS2.i;
                        }
                    }
                    iB = c2653rS2.j.b(interfaceC0328Bs2, c2653rS2.p, true);
                    if (iB == -1) {
                        i4 = -1;
                    } else {
                        i3 = c2653rS2.p - iB;
                        c2653rS2.p = i3;
                        if (i3 <= 0) {
                            c2653rS2.j.d(((c2653rS2.n * 1000000) / ((long) c3235xS.c)) + c2653rS2.m, 1, c3235xS.b, 0, null);
                            c2653rS2.n += (long) c3235xS.f;
                            c2653rS2.p = 0;
                        }
                    }
                }
                i4 = 0;
            }
            i2 = i4;
            i = -1;
        } else {
            iB = c2653rS2.j.b(interfaceC0328Bs2, c2653rS2.p, true);
            if (iB == -1) {
                i4 = -1;
            } else {
                i3 = c2653rS2.p - iB;
                c2653rS2.p = i3;
                if (i3 <= 0) {
                    c2653rS2.j.d(((c2653rS2.n * 1000000) / ((long) c3235xS.c)) + c2653rS2.m, 1, c3235xS.b, 0, null);
                    c2653rS2.n += (long) c3235xS.f;
                    c2653rS2.p = 0;
                }
                i4 = 0;
            }
            i2 = i4;
            i = -1;
        }
        if (i2 == i) {
            InterfaceC3052vb0 interfaceC3052vb3 = c2653rS2.q;
            if (interfaceC3052vb3 instanceof C3319yF) {
                long j15 = ((c2653rS2.n * 1000000) / ((long) c3235xS.c)) + c2653rS2.m;
                if (interfaceC3052vb3.j() != j15) {
                    InterfaceC3052vb0 interfaceC3052vb4 = c2653rS2.q;
                    ((C3319yF) interfaceC3052vb4).d = j15;
                    c2653rS2.h.i(interfaceC3052vb4);
                }
            }
        }
        return i2;
    }

    public final boolean i(C0554Kk c0554Kk, boolean z) throws C2949uX, EOFException {
        int i;
        int iA;
        int iL;
        int i2 = z ? 32768 : 131072;
        c0554Kk.q = 0;
        if (c0554Kk.f369o == 0) {
            CQ cqY = this.f.y(c0554Kk, (this.a & 8) == 0 ? null : u);
            this.l = cqY;
            if (cqY != null) {
                this.e.b(cqY);
            }
            iA = (int) c0554Kk.A();
            if (!z) {
                c0554Kk.q(iA);
            }
            i = 0;
        } else {
            i = 0;
            iA = 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (g(c0554Kk)) {
                if (i3 > 0) {
                    break;
                }
                throw new EOFException();
            }
            C2562qX c2562qX = this.c;
            c2562qX.F(0);
            int iG = c2562qX.g();
            if ((i == 0 || ((-128000) & iG) == (((long) i) & (-128000))) && (iL = Sr0.l(iG)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    this.d.a(iG);
                    i = iG;
                }
                c0554Kk.b(iL - 4, false);
            } else {
                int i5 = i4 + 1;
                if (i4 == i2) {
                    if (z) {
                        return false;
                    }
                    throw C2949uX.a("Searched too many bytes.", null);
                }
                if (z) {
                    c0554Kk.q = 0;
                    c0554Kk.b(iA + i5, false);
                } else {
                    c0554Kk.q(1);
                }
                i4 = i5;
                i = 0;
                i3 = 0;
            }
        }
        if (z) {
            c0554Kk.q(iA + i4);
        } else {
            c0554Kk.q = 0;
        }
        this.k = i;
        return true;
    }

    public C2653rS(long j) {
        this.a = 0;
        this.b = j;
        this.c = new C2562qX(10);
        this.d = new C3235xS();
        this.e = new C1642gz();
        this.m = -9223372036854775807L;
        this.f = new C0334By(5);
        C0921Yo c0921Yo = new C0921Yo();
        this.g = c0921Yo;
        this.j = c0921Yo;
    }

    @Override // o.InterfaceC0302As
    public final void a() {
    }
}
