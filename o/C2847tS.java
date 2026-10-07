package o;

import android.os.Parcelable;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.tS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2847tS implements InterfaceC0302As, InterfaceC2664rb0 {
    public int i;
    public long j;
    public int k;
    public C2562qX l;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1042o;
    public int p;
    public long[][] s;
    public int t;
    public long u;
    public int v;
    public int h = 0;
    public final C3246xb0 f = new C3246xb0();
    public final ArrayList g = new ArrayList();
    public final C2562qX d = new C2562qX(16);
    public final ArrayDeque e = new ArrayDeque();
    public final C2562qX a = new C2562qX(Ou0.b);
    public final C2562qX b = new C2562qX(4);
    public final C2562qX c = new C2562qX();
    public int m = -1;
    public InterfaceC0354Cs q = InterfaceC0354Cs.g;
    public C2750sS[] r = new C2750sS[0];

    @Override // o.InterfaceC0302As
    public final void d(long j, long j2) {
        this.e.clear();
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.f1042o = 0;
        this.p = 0;
        if (j == 0) {
            if (this.h != 3) {
                this.h = 0;
                this.k = 0;
                return;
            } else {
                C3246xb0 c3246xb0 = this.f;
                c3246xb0.a.clear();
                c3246xb0.b = 0;
                this.g.clear();
                return;
            }
        }
        for (C2750sS c2750sS : this.r) {
            C1421em0 c1421em0 = c2750sS.b;
            int iF = Lr0.f(c1421em0.f, j2, false);
            while (true) {
                if (iF < 0) {
                    iF = -1;
                    break;
                } else if ((c1421em0.g[iF] & 1) != 0) {
                    break;
                } else {
                    iF--;
                }
            }
            if (iF == -1) {
                iF = c1421em0.a(j2);
            }
            c2750sS.e = iF;
            Rm0 rm0 = c2750sS.d;
            if (rm0 != null) {
                rm0.b = false;
                rm0.c = 0;
            }
        }
    }

    @Override // o.InterfaceC0302As
    public final boolean e(InterfaceC0328Bs interfaceC0328Bs) {
        return AbstractC1459f50.N(interfaceC0328Bs, false, false);
    }

    @Override // o.InterfaceC0302As
    public final void f(InterfaceC0354Cs interfaceC0354Cs) {
        this.q = interfaceC0354Cs;
    }

    @Override // o.InterfaceC2664rb0
    public final boolean g() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
        char c;
        boolean z;
        C2821t6 c2821t6;
        while (true) {
            int i3 = 8;
            int i4 = 4;
            int i5 = this.h;
            ArrayDeque arrayDeque = this.e;
            C2562qX c2562qX = this.c;
            if (i5 == 0) {
                int i6 = this.k;
                C2562qX c2562qX2 = this.d;
                if (i6 == 0) {
                    if (!interfaceC0328Bs.a(c2562qX2.a, 0, 8, true)) {
                        return -1;
                    }
                    this.k = 8;
                    c2562qX2.F(0);
                    this.j = c2562qX2.v();
                    this.i = c2562qX2.g();
                }
                long j = this.j;
                if (j == 1) {
                    interfaceC0328Bs.readFully(c2562qX2.a, 8, 8);
                    this.k += 8;
                    this.j = c2562qX2.y();
                } else if (j == 0) {
                    long jD = interfaceC0328Bs.d();
                    if (jD == -1 && (c2821t6 = (C2821t6) arrayDeque.peek()) != null) {
                        jD = c2821t6.n;
                    }
                    if (jD != -1) {
                        this.j = (jD - interfaceC0328Bs.F()) + ((long) this.k);
                    }
                }
                long j2 = this.j;
                int i7 = this.k;
                if (j2 < i7) {
                    throw C2949uX.c("Atom size less than header length (unsupported).");
                }
                int i8 = this.i;
                if (i8 == 1836019574 || i8 == 1953653099 || i8 == 1835297121 || i8 == 1835626086 || i8 == 1937007212 || i8 == 1701082227 || i8 == 1835365473) {
                    long jF = interfaceC0328Bs.F();
                    long j3 = this.j;
                    long j4 = this.k;
                    long j5 = (jF + j3) - j4;
                    if (j3 != j4 && this.i == 1835365473) {
                        c2562qX.C(8);
                        interfaceC0328Bs.B(c2562qX.a, 0, 8);
                        byte[] bArr = B6.a;
                        int i9 = c2562qX.b;
                        c2562qX.G(4);
                        if (c2562qX.g() != 1751411826) {
                            i9 += 4;
                        }
                        c2562qX.F(i9);
                        interfaceC0328Bs.q(c2562qX.b);
                        interfaceC0328Bs.o();
                    }
                    arrayDeque.push(new C2821t6(this.i, j5));
                    if (this.j == this.k) {
                        k(j5);
                    } else {
                        this.h = 0;
                        this.k = 0;
                    }
                } else if (i8 == 1835296868 || i8 == 1836476516 || i8 == 1751411826 || i8 == 1937011556 || i8 == 1937011827 || i8 == 1937011571 || i8 == 1668576371 || i8 == 1701606260 || i8 == 1937011555 || i8 == 1937011578 || i8 == 1937013298 || i8 == 1937007471 || i8 == 1668232756 || i8 == 1953196132 || i8 == 1718909296 || i8 == 1969517665 || i8 == 1801812339 || i8 == 1768715124) {
                    AbstractC0397Ej.f(i7 == 8);
                    AbstractC0397Ej.f(this.j <= C1707hi0.a);
                    C2562qX c2562qX3 = new C2562qX((int) this.j);
                    System.arraycopy(c2562qX2.a, 0, c2562qX3.a, 0, 8);
                    this.l = c2562qX3;
                    this.h = 1;
                } else {
                    long jF2 = interfaceC0328Bs.F();
                    long j6 = this.k;
                    long j7 = jF2 - j6;
                    if (this.i == 1836086884) {
                        new C1095bR(0L, j7, -9223372036854775807L, j7 + j6, this.j - j6);
                    }
                    this.l = null;
                    this.h = 1;
                }
            } else {
                if (i5 != 1) {
                    if (i5 == 2) {
                        long jF3 = interfaceC0328Bs.F();
                        if (this.m == -1) {
                            int i10 = -1;
                            int i11 = -1;
                            boolean z2 = true;
                            boolean z3 = true;
                            int i12 = 0;
                            long j8 = Long.MAX_VALUE;
                            long j9 = Long.MAX_VALUE;
                            long j10 = Long.MAX_VALUE;
                            while (true) {
                                C2750sS[] c2750sSArr = this.r;
                                if (i12 >= c2750sSArr.length) {
                                    break;
                                }
                                C2750sS c2750sS = c2750sSArr[i12];
                                int i13 = c2750sS.e;
                                C1421em0 c1421em0 = c2750sS.b;
                                if (i13 != c1421em0.b) {
                                    long j11 = c1421em0.c[i13];
                                    long[][] jArr = this.s;
                                    int i14 = Lr0.a;
                                    long j12 = jArr[i12][i13];
                                    long j13 = j11 - jF3;
                                    boolean z4 = j13 < 0 || j13 >= 262144;
                                    if ((!z4 && z3) || (z4 == z3 && j13 < j10)) {
                                        z3 = z4;
                                        j10 = j13;
                                        i11 = i12;
                                        j9 = j12;
                                    }
                                    if (j12 < j8) {
                                        z2 = z4;
                                        i10 = i12;
                                        j8 = j12;
                                    }
                                }
                                i12++;
                            }
                            if (j8 == Long.MAX_VALUE || !z2 || j9 < j8 + 10485760) {
                                i10 = i11;
                            }
                            this.m = i10;
                            if (i10 == -1) {
                                return -1;
                            }
                        }
                        C2750sS c2750sS2 = this.r[this.m];
                        InterfaceC1324dm0 interfaceC1324dm0 = c2750sS2.c;
                        int i15 = c2750sS2.e;
                        C1421em0 c1421em1 = c2750sS2.b;
                        long j14 = c1421em1.c[i15];
                        int i16 = c1421em1.d[i15];
                        long j15 = (j14 - jF3) + ((long) this.n);
                        if (j15 < 0 || j15 >= 262144) {
                            c2800sv.a = j14;
                            return 1;
                        }
                        Wl0 wl0 = c2750sS2.a;
                        if (wl0.g == 1) {
                            j15 += 8;
                            i16 -= 8;
                        }
                        interfaceC0328Bs.q((int) j15);
                        int i17 = wl0.j;
                        Rm0 rm0 = c2750sS2.d;
                        if (i17 == 0) {
                            if ("audio/ac4".equals(wl0.f.w)) {
                                if (this.f1042o == 0) {
                                    AbstractC2506pt.q(i16, c2562qX);
                                    i = 7;
                                    interfaceC1324dm0.e(7, c2562qX);
                                    this.f1042o += 7;
                                } else {
                                    i = 7;
                                }
                                i16 += i;
                            } else if (rm0 != null) {
                                rm0.c(interfaceC0328Bs);
                            }
                            while (true) {
                                int i18 = this.f1042o;
                                if (i18 >= i16) {
                                    break;
                                }
                                int iB = interfaceC1324dm0.b(interfaceC0328Bs, i16 - i18, false);
                                this.n += iB;
                                this.f1042o += iB;
                                this.p -= iB;
                            }
                        } else {
                            C2562qX c2562qX4 = this.b;
                            byte[] bArr2 = c2562qX4.a;
                            boolean z5 = false;
                            bArr2[0] = 0;
                            bArr2[1] = 0;
                            bArr2[2] = 0;
                            int i19 = 4 - i17;
                            while (this.f1042o < i16) {
                                int i20 = this.p;
                                if (i20 == 0) {
                                    interfaceC0328Bs.readFully(bArr2, i19, i17);
                                    this.n += i17;
                                    c2562qX4.F(z5 ? 1 : 0);
                                    int iG = c2562qX4.g();
                                    if (iG < 0) {
                                        throw C2949uX.a("Invalid NAL length", null);
                                    }
                                    this.p = iG;
                                    C2562qX c2562qX5 = this.a;
                                    c2562qX5.F(z5 ? 1 : 0);
                                    interfaceC1324dm0.e(4, c2562qX5);
                                    this.f1042o += 4;
                                    i16 += i19;
                                } else {
                                    int iB2 = interfaceC1324dm0.b(interfaceC0328Bs, i20, z5);
                                    this.n += iB2;
                                    this.f1042o += iB2;
                                    this.p -= iB2;
                                    z5 = false;
                                }
                            }
                        }
                        int i21 = i16;
                        long j16 = c1421em1.f[i15];
                        int i22 = c1421em1.g[i15];
                        if (rm0 != null) {
                            rm0.b(interfaceC1324dm0, j16, i22, i21, 0, null);
                            if (i15 + 1 == c1421em1.b) {
                                rm0.a(interfaceC1324dm0, null);
                            }
                        } else {
                            interfaceC1324dm0.d(j16, i22, i21, 0, null);
                        }
                        c2750sS2.e++;
                        this.m = -1;
                        this.n = 0;
                        this.f1042o = 0;
                        this.p = 0;
                        return 0;
                    }
                    if (i5 != 3) {
                        throw new IllegalStateException();
                    }
                    ArrayList arrayList = this.g;
                    C3246xb0 c3246xb0 = this.f;
                    int i23 = c3246xb0.b;
                    if (i23 != 0) {
                        if (i23 != 1) {
                            ArrayList arrayList2 = c3246xb0.a;
                            short s = 2816;
                            short s2 = 2192;
                            if (i23 == 2) {
                                long jD2 = interfaceC0328Bs.d();
                                int i24 = c3246xb0.c - 20;
                                C2562qX c2562qX6 = new C2562qX(i24);
                                interfaceC0328Bs.readFully(c2562qX6.a, 0, i24);
                                int i25 = 0;
                                while (i25 < i24 / 12) {
                                    c2562qX6.G(2);
                                    short sK = c2562qX6.k();
                                    if (sK == s2 || sK == s || sK == 2817) {
                                        arrayList2.add(new C3149wb0(c2562qX6.i(), (jD2 - ((long) c3246xb0.c)) - ((long) c2562qX6.i())));
                                    } else if (sK == 2819 || sK == 2820) {
                                        arrayList2.add(new C3149wb0(c2562qX6.i(), (jD2 - ((long) c3246xb0.c)) - ((long) c2562qX6.i())));
                                    } else {
                                        c2562qX6.G(8);
                                    }
                                    i25++;
                                    i24 = i24;
                                    s = 2816;
                                    s2 = 2192;
                                }
                                if (arrayList2.isEmpty()) {
                                    c2800sv.a = 0L;
                                } else {
                                    c3246xb0.b = 3;
                                    c2800sv.a = ((C3149wb0) arrayList2.get(0)).a;
                                }
                            } else {
                                if (i23 != 3) {
                                    throw new IllegalStateException();
                                }
                                long jF4 = interfaceC0328Bs.F();
                                int iD = (int) ((interfaceC0328Bs.d() - interfaceC0328Bs.F()) - ((long) c3246xb0.c));
                                C2562qX c2562qX7 = new C2562qX(iD);
                                interfaceC0328Bs.readFully(c2562qX7.a, 0, iD);
                                int i26 = 0;
                                while (i26 < arrayList2.size()) {
                                    C3149wb0 c3149wb0 = (C3149wb0) arrayList2.get(i26);
                                    c2562qX7.F((int) (c3149wb0.a - jF4));
                                    c2562qX7.G(i4);
                                    int i27 = c2562qX7.i();
                                    Charset charset = AbstractC1402ed.c;
                                    switch (c2562qX7.s(i27, charset)) {
                                        case "SlowMotion_Data":
                                            c = 2192;
                                            break;
                                        case "Super_SlowMotion_Edit_Data":
                                            c = 2819;
                                            break;
                                        case "Super_SlowMotion_Data":
                                            c = 2816;
                                            break;
                                        case "Super_SlowMotion_Deflickering_On":
                                            c = 2820;
                                            break;
                                        case "Super_SlowMotion_BGM":
                                            c = 2817;
                                            break;
                                        default:
                                            throw C2949uX.a("Invalid SEF name", null);
                                    }
                                    int i28 = c3149wb0.b - (i27 + i3);
                                    if (c == 2192) {
                                        ArrayList arrayList3 = new ArrayList();
                                        List listJ = C3246xb0.e.J(c2562qX7.s(i28, charset));
                                        for (int i29 = 0; i29 < listJ.size(); i29++) {
                                            List listJ2 = C3246xb0.d.J((CharSequence) listJ.get(i29));
                                            if (listJ2.size() != 3) {
                                                throw C2949uX.a(null, null);
                                            }
                                            try {
                                                arrayList3.add(new Be0(1 << (Integer.parseInt((String) listJ2.get(2)) - 1), Long.parseLong((String) listJ2.get(0)), Long.parseLong((String) listJ2.get(1))));
                                            } catch (NumberFormatException e) {
                                                throw C2949uX.a(null, e);
                                            }
                                        }
                                        arrayList.add(new Ce0(arrayList3));
                                    } else if (c != 2816 && c != 2817 && c != 2819 && c != 2820) {
                                        throw new IllegalStateException();
                                    }
                                    i26++;
                                    i3 = 8;
                                    i4 = 4;
                                }
                                c2800sv.a = 0L;
                            }
                        } else {
                            C2562qX c2562qX8 = new C2562qX(8);
                            interfaceC0328Bs.readFully(c2562qX8.a, 0, 8);
                            c3246xb0.c = c2562qX8.i() + 8;
                            if (c2562qX8.g() != 1397048916) {
                                c2800sv.a = 0L;
                            } else {
                                c2800sv.a = interfaceC0328Bs.F() - ((long) (c3246xb0.c - 12));
                                c3246xb0.b = 2;
                            }
                        }
                        i2 = 1;
                    } else {
                        long jD3 = interfaceC0328Bs.d();
                        c2800sv.a = (jD3 == -1 || jD3 < 8) ? 0L : jD3 - 8;
                        i2 = 1;
                        c3246xb0.b = 1;
                    }
                    if (c2800sv.a == 0) {
                        this.h = 0;
                        this.k = 0;
                    }
                    return i2;
                }
                long j17 = this.j - ((long) this.k);
                long jF5 = interfaceC0328Bs.F() + j17;
                C2562qX c2562qX9 = this.l;
                if (c2562qX9 != null) {
                    interfaceC0328Bs.readFully(c2562qX9.a, this.k, (int) j17);
                    if (this.i == 1718909296) {
                        c2562qX9.F(8);
                        int iG2 = c2562qX9.g();
                        int i30 = iG2 != 1751476579 ? iG2 != 1903435808 ? 0 : 1 : 2;
                        if (i30 == 0) {
                            c2562qX9.G(4);
                            do {
                                if (c2562qX9.a() <= 0) {
                                    i30 = 0;
                                    break;
                                }
                                int iG3 = c2562qX9.g();
                                i30 = iG3 != 1751476579 ? iG3 != 1903435808 ? 0 : 1 : 2;
                            } while (i30 == 0);
                        }
                        this.v = i30;
                    } else if (!arrayDeque.isEmpty()) {
                        ((C2821t6) arrayDeque.peek()).f1040o.add(new C2918u6(this.i, c2562qX9));
                    }
                } else {
                    if (j17 < 262144) {
                        interfaceC0328Bs.q((int) j17);
                    } else {
                        c2800sv.a = interfaceC0328Bs.F() + j17;
                        z = true;
                    }
                    k(jF5);
                    if (!z && this.h != 2) {
                        return 1;
                    }
                }
                z = false;
                k(jF5);
                if (!z) {
                }
            }
        }
    }

    @Override // o.InterfaceC2664rb0
    public final C2568qb0 i(long j) {
        long j2;
        long j3;
        long jMin;
        int[] iArr;
        long j4;
        int iA;
        C2847tS c2847tS = this;
        long j5 = j;
        C2750sS[] c2750sSArr = c2847tS.r;
        int length = c2750sSArr.length;
        C2858tb0 c2858tb0 = C2858tb0.c;
        if (length == 0) {
            return new C2568qb0(c2858tb0, c2858tb0);
        }
        int i = c2847tS.t;
        boolean z = false;
        if (i != -1) {
            C1421em0 c1421em0 = c2750sSArr[i].b;
            int iF = Lr0.f(c1421em0.f, j5, false);
            while (true) {
                if (iF < 0) {
                    iF = -1;
                    break;
                }
                if ((c1421em0.g[iF] & 1) != 0) {
                    break;
                }
                iF--;
            }
            if (iF == -1) {
                iF = c1421em0.a(j5);
            }
            if (iF == -1) {
                return new C2568qb0(c2858tb0, c2858tb0);
            }
            long[] jArr = c1421em0.f;
            long j6 = jArr[iF];
            long[] jArr2 = c1421em0.c;
            j2 = jArr2[iF];
            if (j6 >= j5 || iF >= c1421em0.b - 1 || (iA = c1421em0.a(j5)) == -1 || iA == iF) {
                j4 = -9223372036854775807L;
                jMin = -1;
            } else {
                j4 = jArr[iA];
                jMin = jArr2[iA];
            }
            j3 = j4;
            j5 = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
            jMin = -1;
        }
        long jMin2 = j2;
        int i2 = 0;
        while (true) {
            C2750sS[] c2750sSArr2 = c2847tS.r;
            if (i2 >= c2750sSArr2.length) {
                break;
            }
            if (i2 != c2847tS.t) {
                C1421em0 c1421em1 = c2750sSArr2[i2].b;
                int iF2 = Lr0.f(c1421em1.f, j5, z);
                while (true) {
                    iArr = c1421em1.g;
                    if (iF2 < 0) {
                        iF2 = -1;
                        break;
                    }
                    if ((iArr[iF2] & 1) != 0) {
                        break;
                    }
                    iF2--;
                }
                if (iF2 == -1) {
                    iF2 = c1421em1.a(j5);
                }
                long[] jArr3 = c1421em1.c;
                if (iF2 != -1) {
                    jMin2 = Math.min(jArr3[iF2], jMin2);
                }
                if (j3 != -9223372036854775807L) {
                    int iF3 = Lr0.f(c1421em1.f, j3, false);
                    while (true) {
                        if (iF3 < 0) {
                            iF3 = -1;
                            break;
                        }
                        if ((iArr[iF3] & 1) != 0) {
                            break;
                        }
                        iF3--;
                    }
                    if (iF3 == -1) {
                        iF3 = c1421em1.a(j3);
                    }
                    if (iF3 != -1) {
                        jMin = Math.min(jArr3[iF3], jMin);
                    }
                }
                i2++;
                c2847tS = this;
                j5 = j5;
                z = false;
            } else {
                j5 = j5;
            }
            i2++;
            c2847tS = this;
            j5 = j5;
            z = false;
        }
        C2858tb0 c2858tb1 = new C2858tb0(j5, jMin2);
        return j3 == -9223372036854775807L ? new C2568qb0(c2858tb1, c2858tb1) : new C2568qb0(c2858tb1, new C2858tb0(j3, jMin));
    }

    @Override // o.InterfaceC2664rb0
    public final long j() {
        return this.u;
    }

    /* JADX WARN: Code duplicated, block: B:242:0x04b7  */
    /* JADX WARN: Type inference failed for: r6v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v34 */
    public final void k(long j) {
        int i;
        CQ cq;
        CQ cq2;
        CQ cq3;
        CQ cq4;
        long j2;
        CQ cq5;
        int i2;
        CQ cq6;
        int i3;
        int i4;
        int i5;
        int i6;
        C2746sO c2746sO;
        int i7;
        Parcelable parcelableD;
        C2847tS c2847tS = this;
        while (true) {
            int i8 = 4;
            boolean z = true;
            ArrayDeque arrayDeque = c2847tS.e;
            if (arrayDeque.isEmpty() || ((C2821t6) arrayDeque.peek()).n != j) {
                break;
            }
            C2821t6 c2821t6 = (C2821t6) arrayDeque.pop();
            if (c2821t6.m == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z2 = c2847tS.v == 1;
                C1642gz c1642gz = new C1642gz();
                C2918u6 c2918u6F = c2821t6.F(1969517665);
                int i9 = 1751411826;
                int i10 = 1768715124;
                int i11 = 1835365473;
                int i12 = 8;
                if (c2918u6F != null) {
                    byte[] bArr = B6.a;
                    C2562qX c2562qX = c2918u6F.n;
                    c2562qX.F(8);
                    cq = null;
                    CQ cq7 = null;
                    cq3 = null;
                    while (c2562qX.a() >= i12) {
                        int i13 = c2562qX.b;
                        int iG = c2562qX.g();
                        int iG2 = c2562qX.g();
                        if (iG2 == i11) {
                            c2562qX.F(i13);
                            int i14 = i13 + iG;
                            c2562qX.G(i12);
                            int i15 = c2562qX.b;
                            c2562qX.G(i8);
                            if (c2562qX.g() != i9) {
                                i15 += i8;
                            }
                            c2562qX.F(i15);
                            boolean z3 = z;
                            while (true) {
                                int i16 = c2562qX.b;
                                if (i16 >= i14) {
                                    cq7 = null;
                                    break;
                                }
                                int iG3 = c2562qX.g();
                                if (c2562qX.g() == i10) {
                                    c2562qX.F(i16);
                                    int i17 = i16 + iG3;
                                    c2562qX.G(i12);
                                    ArrayList arrayList2 = new ArrayList();
                                    ?? r6 = z3;
                                    while (true) {
                                        int i18 = c2562qX.b;
                                        if (i18 >= i17) {
                                            break;
                                        }
                                        int iG4 = c2562qX.g() + i18;
                                        int iG5 = c2562qX.g();
                                        int i19 = (iG5 >> 24) & 255;
                                        if (i19 == 169 || i19 == 253) {
                                            i7 = i17;
                                            int i20 = 16777215 & iG5;
                                            if (i20 == 6516084) {
                                                parcelableD = Jp0.z(iG5, c2562qX);
                                            } else if (i20 == 7233901 || i20 == 7631467) {
                                                parcelableD = Jp0.D(iG5, "TIT2", c2562qX);
                                            } else if (i20 == 6516589 || i20 == 7828084) {
                                                parcelableD = Jp0.D(iG5, "TCOM", c2562qX);
                                            } else if (i20 == 6578553) {
                                                parcelableD = Jp0.D(iG5, "TDRC", c2562qX);
                                            } else if (i20 == 4280916) {
                                                parcelableD = Jp0.D(iG5, "TPE1", c2562qX);
                                            } else if (i20 == 7630703) {
                                                parcelableD = Jp0.D(iG5, "TSSE", c2562qX);
                                            } else if (i20 == 6384738) {
                                                parcelableD = Jp0.D(iG5, "TALB", c2562qX);
                                            } else if (i20 == 7108978) {
                                                parcelableD = Jp0.D(iG5, "USLT", c2562qX);
                                            } else if (i20 == 6776174) {
                                                parcelableD = Jp0.D(iG5, "TCON", c2562qX);
                                            } else if (i20 == 6779504) {
                                                parcelableD = Jp0.D(iG5, "TIT1", c2562qX);
                                            } else {
                                                AbstractC3015v6.g(iG5);
                                                AP.c();
                                                c2562qX.F(iG4);
                                                parcelableD = null;
                                            }
                                            c2562qX.F(iG4);
                                        } else {
                                            if (iG5 == 1735291493) {
                                                try {
                                                    int iF = Jp0.F(c2562qX);
                                                    String str = (iF <= 0 || iF > 192) ? null : Jp0.b[iF - r6];
                                                    if (str != null) {
                                                        parcelableD = new Li0("TCON", null, AbstractC0985aF.q(str));
                                                    } else {
                                                        AP.z();
                                                        parcelableD = null;
                                                    }
                                                } catch (Throwable th) {
                                                    c2562qX.F(iG4);
                                                    throw th;
                                                }
                                            } else if (iG5 == 1684632427) {
                                                parcelableD = Jp0.C(iG5, "TPOS", c2562qX);
                                            } else if (iG5 == 1953655662) {
                                                parcelableD = Jp0.C(iG5, "TRCK", c2562qX);
                                            } else if (iG5 == 1953329263) {
                                                parcelableD = Jp0.E(iG5, "TBPM", c2562qX, r6, false);
                                            } else if (iG5 == 1668311404) {
                                                parcelableD = Jp0.E(iG5, "TCMP", c2562qX, r6, r6);
                                            } else if (iG5 == 1668249202) {
                                                parcelableD = Jp0.A(c2562qX);
                                            } else if (iG5 == 1631670868) {
                                                parcelableD = Jp0.D(iG5, "TPE2", c2562qX);
                                            } else if (iG5 == 1936682605) {
                                                parcelableD = Jp0.D(iG5, "TSOT", c2562qX);
                                            } else if (iG5 == 1936679276) {
                                                parcelableD = Jp0.D(iG5, "TSO2", c2562qX);
                                            } else if (iG5 == 1936679282) {
                                                parcelableD = Jp0.D(iG5, "TSOA", c2562qX);
                                            } else if (iG5 == 1936679265) {
                                                parcelableD = Jp0.D(iG5, "TSOP", c2562qX);
                                            } else if (iG5 == 1936679791) {
                                                parcelableD = Jp0.D(iG5, "TSOC", c2562qX);
                                            } else if (iG5 == 1920233063) {
                                                parcelableD = Jp0.E(iG5, "ITUNESADVISORY", c2562qX, false, false);
                                            } else if (iG5 == 1885823344) {
                                                parcelableD = Jp0.E(iG5, "ITUNESGAPLESS", c2562qX, false, r6);
                                            } else if (iG5 == 1936683886) {
                                                parcelableD = Jp0.D(iG5, "TVSHOWSORT", c2562qX);
                                            } else if (iG5 == 1953919848) {
                                                parcelableD = Jp0.D(iG5, "TVSHOW", c2562qX);
                                            } else if (iG5 == 757935405) {
                                                String strQ = null;
                                                String strQ2 = null;
                                                int i21 = -1;
                                                int i22 = -1;
                                                while (true) {
                                                    int i23 = c2562qX.b;
                                                    if (i23 >= iG4) {
                                                        break;
                                                    }
                                                    int iG6 = c2562qX.g();
                                                    int iG7 = c2562qX.g();
                                                    int i24 = i17;
                                                    c2562qX.G(4);
                                                    if (iG7 == 1835360622) {
                                                        strQ = c2562qX.q(iG6 - 12);
                                                    } else if (iG7 == 1851878757) {
                                                        strQ2 = c2562qX.q(iG6 - 12);
                                                    } else {
                                                        if (iG7 == 1684108385) {
                                                            i21 = i23;
                                                            i22 = iG6;
                                                        }
                                                        c2562qX.G(iG6 - 12);
                                                    }
                                                    i17 = i24;
                                                }
                                                i7 = i17;
                                                if (strQ == null || strQ2 == null || i21 == -1) {
                                                    parcelableD = null;
                                                } else {
                                                    c2562qX.F(i21);
                                                    c2562qX.G(16);
                                                    parcelableD = new C1279dG(strQ, strQ2, c2562qX.q(i22 - 16));
                                                }
                                                c2562qX.F(iG4);
                                            } else {
                                                i7 = i17;
                                                AbstractC3015v6.g(iG5);
                                                AP.c();
                                                c2562qX.F(iG4);
                                                parcelableD = null;
                                            }
                                            c2562qX.F(iG4);
                                            i7 = i17;
                                        }
                                        if (parcelableD != null) {
                                            arrayList2.add(parcelableD);
                                        }
                                        i17 = i7;
                                        r6 = 1;
                                    }
                                    cq7 = arrayList2.isEmpty() ? null : new CQ(arrayList2);
                                    break;
                                }
                                c2562qX.F(i16 + iG3);
                                i10 = 1768715124;
                                z3 = true;
                                i12 = 8;
                            }
                        } else if (iG2 == 1936553057) {
                            c2562qX.F(i13);
                            int i25 = i13 + iG;
                            c2562qX.G(12);
                            while (true) {
                                int i26 = c2562qX.b;
                                if (i26 < i25) {
                                    int iG8 = c2562qX.g();
                                    if (c2562qX.g() != 1935766900) {
                                        c2562qX.F(i26 + iG8);
                                    } else if (iG8 >= 14) {
                                        c2562qX.G(5);
                                        int iU = c2562qX.u();
                                        if (iU == 12 || iU == 13) {
                                            float f = iU == 12 ? 240.0f : 120.0f;
                                            c2562qX.G(1);
                                            cq = new CQ(new Ee0(c2562qX.u(), f));
                                            break;
                                        }
                                    }
                                }
                                cq = null;
                                break;
                            }
                        } else if (iG2 == -1451722374) {
                            short sR = c2562qX.r();
                            c2562qX.G(2);
                            String strS = c2562qX.s(sR, AbstractC1402ed.c);
                            int iMax = Math.max(strS.lastIndexOf(43), strS.lastIndexOf(45));
                            try {
                                cq3 = new CQ(new C2944uS(Float.parseFloat(strS.substring(0, iMax)), Float.parseFloat(strS.substring(iMax, strS.length() - 1))));
                            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                cq3 = null;
                            }
                        }
                        c2562qX.F(i13 + iG);
                        i10 = 1768715124;
                        i8 = 4;
                        i11 = 1835365473;
                        z = true;
                        i9 = 1751411826;
                        i12 = 8;
                    }
                    CQ cq8 = cq7;
                    if (cq8 != null) {
                        c1642gz.b(cq8);
                    }
                    cq2 = cq8;
                    i = 1835365473;
                } else {
                    i = 1835365473;
                    cq = null;
                    cq2 = null;
                    cq3 = null;
                }
                C2821t6 c2821t6E = c2821t6.E(i);
                if (c2821t6E != null) {
                    byte[] bArr2 = B6.a;
                    C2918u6 c2918u6F2 = c2821t6E.F(1751411826);
                    C2918u6 c2918u6F3 = c2821t6E.F(1801812339);
                    C2918u6 c2918u6F4 = c2821t6E.F(1768715124);
                    if (c2918u6F2 == null || c2918u6F3 == null || c2918u6F4 == null) {
                        cq4 = null;
                    } else {
                        C2562qX c2562qX2 = c2918u6F2.n;
                        c2562qX2.F(16);
                        if (c2562qX2.g() != 1835299937) {
                            cq4 = null;
                        } else {
                            C2562qX c2562qX3 = c2918u6F3.n;
                            c2562qX3.F(12);
                            int iG9 = c2562qX3.g();
                            String[] strArr = new String[iG9];
                            for (int i27 = 0; i27 < iG9; i27++) {
                                int iG10 = c2562qX3.g();
                                c2562qX3.G(4);
                                strArr[i27] = c2562qX3.s(iG10 - 8, AbstractC1402ed.c);
                            }
                            C2562qX c2562qX4 = c2918u6F4.n;
                            c2562qX4.F(8);
                            ArrayList arrayList3 = new ArrayList();
                            for (int i28 = 8; c2562qX4.a() > i28; i28 = 8) {
                                int i29 = c2562qX4.b;
                                int iG11 = c2562qX4.g();
                                int iG12 = c2562qX4.g() - 1;
                                if (iG12 < 0 || iG12 >= iG9) {
                                    iG9 = iG9;
                                    strArr = strArr;
                                    AP.z();
                                } else {
                                    String str2 = strArr[iG12];
                                    int i30 = i29 + iG11;
                                    while (true) {
                                        int i31 = c2562qX4.b;
                                        if (i31 >= i30) {
                                            c2746sO = null;
                                            break;
                                        }
                                        int iG13 = c2562qX4.g();
                                        int i32 = i30;
                                        if (c2562qX4.g() == 1684108385) {
                                            int iG14 = c2562qX4.g();
                                            int iG15 = c2562qX4.g();
                                            int i33 = iG13 - 16;
                                            byte[] bArr3 = new byte[i33];
                                            c2562qX4.e(bArr3, 0, i33);
                                            c2746sO = new C2746sO(str2, bArr3, iG15, iG14);
                                            break;
                                        }
                                        c2562qX4.F(i31 + iG13);
                                        i30 = i32;
                                    }
                                    if (c2746sO != null) {
                                        arrayList3.add(c2746sO);
                                    }
                                }
                                c2562qX4.F(i29 + iG11);
                                iG9 = iG9;
                                strArr = strArr;
                            }
                            if (arrayList3.isEmpty()) {
                                cq4 = null;
                            } else {
                                cq4 = new CQ(arrayList3);
                            }
                        }
                    }
                } else {
                    cq4 = null;
                }
                C2918u6 c2918u6F5 = c2821t6.F(1836476516);
                c2918u6F5.getClass();
                C3306y6 c3306y6C = B6.c(c2918u6F5.n);
                ArrayList arrayListF = B6.f(c2821t6, c1642gz, -9223372036854775807L, null, false, z2, new C0633Nm(22));
                int size = arrayListF.size();
                long j3 = -9223372036854775807L;
                long j4 = -9223372036854775807L;
                int i34 = 0;
                int size2 = -1;
                while (true) {
                    j2 = 0;
                    if (i34 >= size) {
                        break;
                    }
                    C1421em0 c1421em0 = (C1421em0) arrayListF.get(i34);
                    if (c1421em0.b == 0) {
                        cq5 = cq4;
                        i2 = 1;
                    } else {
                        Wl0 wl0 = c1421em0.a;
                        long j5 = wl0.e;
                        if (j5 == j3) {
                            j5 = c1421em0.h;
                        }
                        long jMax = Math.max(j4, j5);
                        InterfaceC0354Cs interfaceC0354Cs = c2847tS.q;
                        int i35 = wl0.b;
                        C2750sS c2750sS = new C2750sS(wl0, c1421em0, interfaceC0354Cs.s(i34, i35));
                        C0643Nw c0643Nw = wl0.f;
                        boolean zEquals = "audio/true-hd".equals(c0643Nw.w);
                        int i36 = c1421em0.e;
                        int i37 = zEquals ? i36 * 16 : i36 + 30;
                        C0617Mw c0617MwA = c0643Nw.a();
                        c0617MwA.l = i37;
                        if (i35 == 2 && j5 > 0 && (i6 = c1421em0.b) > 1) {
                            c0617MwA.r = i6 / (j5 / 1000000.0f);
                        }
                        if (i35 == 1 && (i4 = c1642gz.a) != -1 && (i5 = c1642gz.b) != -1) {
                            c0617MwA.A = i4;
                            c0617MwA.B = i5;
                        }
                        ArrayList arrayList4 = c2847tS.g;
                        CQ[] cqArr = {cq, arrayList4.isEmpty() ? null : new CQ(arrayList4), cq3, (CQ) c3306y6C.n};
                        CQ cq9 = new CQ(new BQ[0]);
                        if (i35 == 1 && cq2 != null) {
                            cq9 = cq2;
                        }
                        if (cq4 != null) {
                            int i38 = 0;
                            while (true) {
                                BQ[] bqArr = cq4.l;
                                if (i38 >= bqArr.length) {
                                    break;
                                }
                                BQ bq = bqArr[i38];
                                if (bq instanceof C2746sO) {
                                    C2746sO c2746sO2 = (C2746sO) bq;
                                    cq6 = cq4;
                                    if (!c2746sO2.l.equals("com.android.capture.fps")) {
                                        i3 = 1;
                                        cq9 = cq9.a(c2746sO2);
                                    } else if (i35 == 2) {
                                        i3 = 1;
                                        cq9 = cq9.a(c2746sO2);
                                    } else {
                                        i3 = 1;
                                    }
                                } else {
                                    cq6 = cq4;
                                    i3 = 1;
                                }
                                i38 += i3;
                                cq4 = cq6;
                            }
                        }
                        cq5 = cq4;
                        for (int i39 = 0; i39 < 4; i39++) {
                            CQ cq10 = cqArr[i39];
                            cq9.getClass();
                            if (cq10 != null) {
                                cq9 = cq9.a(cq10.l);
                            }
                        }
                        if (cq9.l.length > 0) {
                            c0617MwA.i = cq9;
                        }
                        c2750sS.c.a(new C0643Nw(c0617MwA));
                        if (i35 == 2 && size2 == -1) {
                            size2 = arrayList.size();
                        }
                        arrayList.add(c2750sS);
                        j4 = jMax;
                        i2 = 1;
                    }
                    i34 += i2;
                    arrayListF = arrayListF;
                    size = size;
                    cq4 = cq5;
                    j3 = -9223372036854775807L;
                }
                c2847tS.t = size2;
                c2847tS.u = j4;
                C2750sS[] c2750sSArr = (C2750sS[]) arrayList.toArray(new C2750sS[0]);
                c2847tS.r = c2750sSArr;
                long[][] jArr = new long[c2750sSArr.length][];
                int[] iArr = new int[c2750sSArr.length];
                long[] jArr2 = new long[c2750sSArr.length];
                boolean[] zArr = new boolean[c2750sSArr.length];
                for (int i40 = 0; i40 < c2750sSArr.length; i40++) {
                    jArr[i40] = new long[c2750sSArr[i40].b.b];
                    jArr2[i40] = c2750sSArr[i40].b.f[0];
                }
                int i41 = 0;
                while (i41 < c2750sSArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i42 = -1;
                    for (int i43 = 0; i43 < c2750sSArr.length; i43++) {
                        if (!zArr[i43]) {
                            long j7 = jArr2[i43];
                            if (j7 <= j6) {
                                i42 = i43;
                                j6 = j7;
                            }
                        }
                    }
                    int i44 = iArr[i42];
                    long[] jArr3 = jArr[i42];
                    jArr3[i44] = j2;
                    C1421em0 c1421em1 = c2750sSArr[i42].b;
                    j2 += (long) c1421em1.d[i44];
                    int i45 = i44 + 1;
                    iArr[i42] = i45;
                    if (i45 < jArr3.length) {
                        jArr2[i42] = c1421em1.f[i45];
                    } else {
                        zArr[i42] = true;
                        i41++;
                    }
                    c2847tS = this;
                }
                c2847tS.s = jArr;
                c2847tS.q.f();
                c2847tS.q.i(c2847tS);
                arrayDeque.clear();
                c2847tS.h = 2;
            } else if (!arrayDeque.isEmpty()) {
                ((C2821t6) arrayDeque.peek()).p.add(c2821t6);
            }
        }
        if (c2847tS.h != 2) {
            c2847tS.h = 0;
            c2847tS.k = 0;
        }
    }

    @Override // o.InterfaceC0302As
    public final void a() {
    }
}
