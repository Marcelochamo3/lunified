package o;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o.xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3249xd implements D90, Ub0, InterfaceC1284dL, InterfaceC1577gL {
    public AbstractC2764sd A;
    public C0643Nw B;
    public InterfaceC3152wd C;
    public long D;
    public long E;
    public int F;
    public AbstractC1269d8 G;
    public boolean H;
    public final int l;
    public final int[] m;
    public final C0643Nw[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean[] f1120o;
    public final C2972uk p;
    public final Tb0 q;
    public final C2613qy r;
    public final C0622Nb s;
    public final Na0 t = new Na0("ChunkSampleStream");
    public final C2149m9 u = new C2149m9();
    public final ArrayList v;
    public final List w;
    public final C90 x;
    public final C90[] y;
    public final C2720s4 z;

    public C3249xd(int i, int[] iArr, C0643Nw[] c0643NwArr, C2972uk c2972uk, Tb0 tb0, C1562g8 c1562g8, long j, InterfaceC0428Fo interfaceC0428Fo, C0350Co c0350Co, C0622Nb c0622Nb, C2613qy c2613qy) {
        this.l = i;
        this.m = iArr;
        this.n = c0643NwArr;
        this.p = c2972uk;
        this.q = tb0;
        this.r = c2613qy;
        this.s = c0622Nb;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.w = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.y = new C90[length];
        this.f1120o = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        C90[] c90Arr = new C90[i2];
        interfaceC0428Fo.getClass();
        c0350Co.getClass();
        C90 c90 = new C90(c1562g8, interfaceC0428Fo, c0350Co);
        this.x = c90;
        int i3 = 0;
        iArr2[0] = i;
        c90Arr[0] = c90;
        while (i3 < length) {
            C90 c91 = new C90(c1562g8, null, null);
            this.y[i3] = c91;
            int i4 = i3 + 1;
            c90Arr[i4] = c91;
            iArr2[i4] = this.m[i3];
            i3 = i4;
        }
        this.z = new C2720s4(iArr2, 8, c90Arr);
        this.D = j;
        this.E = j;
    }

    @Override // o.Ub0
    public final long A() {
        if (this.H) {
            return Long.MIN_VALUE;
        }
        if (n()) {
            return this.D;
        }
        long jMax = this.E;
        AbstractC1269d8 abstractC1269d8J = j();
        if (!abstractC1269d8J.c()) {
            ArrayList arrayList = this.v;
            abstractC1269d8J = arrayList.size() > 1 ? (AbstractC1269d8) AbstractC1701hf0.c(2, arrayList) : null;
        }
        if (abstractC1269d8J != null) {
            jMax = Math.max(jMax, abstractC1269d8J.s);
        }
        return Math.max(jMax, this.x.n());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0256  */
    /* JADX WARN: Code duplicated, block: B:103:0x025c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0269  */
    /* JADX WARN: Code duplicated, block: B:109:0x026e  */
    /* JADX WARN: Code duplicated, block: B:113:0x027a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0285  */
    /* JADX WARN: Code duplicated, block: B:117:0x0288  */
    /* JADX WARN: Code duplicated, block: B:119:0x0298  */
    /* JADX WARN: Code duplicated, block: B:121:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:122:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:131:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:136:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0207  */
    /* JADX WARN: Code duplicated, block: B:85:0x020b  */
    /* JADX WARN: Code duplicated, block: B:86:0x020e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0211  */
    /* JADX WARN: Code duplicated, block: B:89:0x0216  */
    /* JADX WARN: Code duplicated, block: B:94:0x022f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0238  */
    /* JADX WARN: Code duplicated, block: B:98:0x023a  */
    @Override // o.Ub0
    public final boolean K(long j) {
        long j2;
        List listEmptyList;
        C2778sk[] c2778skArr;
        Na0 na0;
        long j3;
        long j4;
        long jMax;
        long j5;
        boolean z;
        long j6;
        C2972uk c2972uk;
        C2778sk c2778skB;
        InterfaceC1219cj interfaceC1219cj;
        C2922u8 c2922u8;
        W9 w9;
        AbstractC1853j70 abstractC1853j70;
        C0733Ri c0733Ri;
        boolean z2;
        long j7;
        boolean z3;
        long j8;
        long j9;
        long jB;
        long jK;
        long j10;
        C2149m9 c2149m9;
        long j11;
        Object c0861Wg;
        C2433p50 c2433p50A;
        long jC;
        boolean z4;
        C2433p50 c2433p50;
        C2433p50 c2433p50E;
        C2433p50 c2433p50A2;
        Na0 na1;
        C2149m9 c2149m10;
        C2972uk c2972uk2;
        boolean z5;
        if (!this.H) {
            Na0 na2 = this.t;
            if (!na2.M() && !na2.F()) {
                boolean zN = n();
                if (zN) {
                    listEmptyList = Collections.emptyList();
                    j2 = this.D;
                } else {
                    j2 = j().s;
                    listEmptyList = this.w;
                }
                List list = listEmptyList;
                long j12 = j2;
                C2972uk c2972uk3 = this.p;
                B8 b8 = c2972uk3.l;
                C2149m9 c2149m11 = this.u;
                if (b8 != null) {
                    c2149m9 = c2149m11;
                    na0 = na2;
                    z = zN;
                } else {
                    long j13 = j12 - j;
                    long jK2 = Lr0.K(c2972uk3.j.b(c2972uk3.k).b) + Lr0.K(c2972uk3.j.a) + j12;
                    C3145wZ c3145wZ = c2972uk3.g;
                    if (c3145wZ != null) {
                        C3242xZ c3242xZ = c3145wZ.e;
                        C0733Ri c0733Ri2 = c3242xZ.q;
                        if (!c0733Ri2.d) {
                            c2972uk2 = c2972uk3;
                            z5 = false;
                        } else if (c3242xZ.s) {
                            c2972uk2 = c2972uk3;
                            z5 = true;
                        } else {
                            c2972uk2 = c2972uk3;
                            Map.Entry entryCeilingEntry = c3242xZ.p.ceilingEntry(Long.valueOf(c0733Ri2.h));
                            C0915Yi c0915Yi = c3242xZ.m;
                            if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= jK2) {
                                z5 = false;
                            } else {
                                long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
                                C1122bj c1122bj = c0915Yi.m;
                                long j14 = c1122bj.O;
                                if (j14 == -9223372036854775807L || j14 < jLongValue) {
                                    c1122bj.O = jLongValue;
                                }
                                z5 = true;
                            }
                            if (z5 && c3242xZ.r) {
                                c3242xZ.s = true;
                                c3242xZ.r = false;
                                C1122bj c1122bj2 = c0915Yi.m;
                                c1122bj2.E.removeCallbacks(c1122bj2.x);
                                c1122bj2.v();
                            }
                        }
                        if (z5) {
                            c2149m9 = c2149m11;
                            na0 = na2;
                            z = zN;
                        } else {
                            c2972uk3 = c2972uk2;
                        }
                    }
                    long jK3 = Lr0.K(Lr0.w(c2972uk3.f));
                    C0733Ri c0733Ri3 = c2972uk3.j;
                    C2149m9 c2149m12 = c2149m11;
                    long j15 = c0733Ri3.a;
                    long jK4 = j15 == -9223372036854775807L ? -9223372036854775807L : jK3 - Lr0.K(j15 + c0733Ri3.b(c2972uk3.k).b);
                    AbstractC2843tO abstractC2843tO = list.isEmpty() ? null : (AbstractC2843tO) list.get(list.size() - 1);
                    int length = c2972uk3.i.length();
                    InterfaceC2940uO[] interfaceC2940uOArr = new InterfaceC2940uO[length];
                    int i = 0;
                    while (true) {
                        c2778skArr = c2972uk3.h;
                        if (i >= length) {
                            break;
                        }
                        C2778sk c2778sk = c2778skArr[i];
                        InterfaceC1219cj interfaceC1219cj2 = c2778sk.d;
                        C2743sL c2743sL = InterfaceC2940uO.j;
                        if (interfaceC1219cj2 == null) {
                            interfaceC2940uOArr[i] = c2743sL;
                            c2149m10 = c2149m12;
                            na1 = na2;
                        } else {
                            na1 = na2;
                            long j16 = c2778sk.e;
                            long j17 = interfaceC1219cj2.j(j16, jK3);
                            c2149m10 = c2149m12;
                            long j18 = c2778sk.f;
                            long j19 = j17 + j18;
                            long jB2 = c2778sk.b(jK3);
                            long jA = abstractC2843tO != null ? abstractC2843tO.a() : Lr0.k(c2778sk.d.c(j12, j16) + j18, j19, jB2);
                            if (jA < j19) {
                                interfaceC2940uOArr[i] = c2743sL;
                            } else {
                                interfaceC2940uOArr[i] = new C2875tk(c2972uk3.b(i), jA, jB2);
                            }
                        }
                        i++;
                        na2 = na1;
                        c2149m12 = c2149m10;
                    }
                    C2149m9 c2149m13 = c2149m12;
                    na0 = na2;
                    if (c2972uk3.j.d) {
                        C2778sk c2778sk2 = c2778skArr[0];
                        if (c2778sk2.d.y(c2778sk2.e) == 0) {
                            j3 = jK3;
                        } else {
                            j3 = jK3;
                            long jC2 = c2778skArr[0].c(c2778skArr[0].b(j3));
                            C0733Ri c0733Ri4 = c2972uk3.j;
                            long j20 = c0733Ri4.a;
                            j4 = -9223372036854775807L;
                            jMax = Math.max(0L, Math.min(j20 == -9223372036854775807L ? -9223372036854775807L : j3 - Lr0.K(j20 + c0733Ri4.b(c2972uk3.k).b), jC2) - j);
                        }
                        j5 = j3;
                        z = zN;
                        j6 = j12;
                        c2972uk = c2972uk3;
                        c2972uk3.i.s(j, j13, jMax, list, interfaceC2940uOArr);
                        c2778skB = c2972uk.b(c2972uk.i.n());
                        interfaceC1219cj = c2778skB.d;
                        c2922u8 = c2778skB.c;
                        w9 = c2778skB.a;
                        abstractC1853j70 = c2778skB.b;
                        if (w9 == null) {
                            c0733Ri = c2972uk.j;
                            if (c0733Ri.d || c2972uk.k != c0733Ri.m.size() - 1) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            j7 = c2778skB.e;
                            if (z2 || j7 != -9223372036854775807L) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (interfaceC1219cj.y(j7) == 0) {
                                c2149m13.l = z3;
                            } else {
                                long j21 = interfaceC1219cj.j(j7, j5);
                                j8 = c2778skB.f;
                                j9 = j21 + j8;
                                jB = c2778skB.b(j5);
                                if (z2) {
                                    jC = c2778skB.c(jB);
                                    if ((jC - c2778skB.d(jB)) + jC >= j7) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    z3 &= z4;
                                }
                                if (abstractC2843tO != null) {
                                    jK = abstractC2843tO.a();
                                } else {
                                    jK = Lr0.k(interfaceC1219cj.c(j6, j7) + j8, j9, jB);
                                    j6 = j6;
                                }
                                j10 = jK;
                                if (j10 < j9) {
                                    c2972uk.l = new B8();
                                } else if (j10 <= jB || (c2972uk.m && j10 >= jB)) {
                                    c2149m9 = c2149m13;
                                    c2149m9.l = z3;
                                } else if (!z3 || c2778skB.d(j10) < j7) {
                                    int iMin = (int) Math.min(1, (jB - j10) + 1);
                                    if (j7 != -9223372036854775807L) {
                                        for (int i2 = 1; iMin > i2 && c2778skB.d((((long) iMin) + j10) - 1) >= j7; i2 = 1) {
                                            iMin--;
                                        }
                                    }
                                    long j22 = list.isEmpty() ? j6 : -9223372036854775807L;
                                    C0643Nw c0643NwK = c2972uk.i.k();
                                    int iM = c2972uk.i.m();
                                    Object objQ = c2972uk.i.q();
                                    long jD = c2778skB.d(j10);
                                    C2433p50 c2433p50N = interfaceC1219cj.n(j10 - j8);
                                    InterfaceC2583qj interfaceC2583qj = c2972uk.e;
                                    if (w9 == null) {
                                        c0861Wg = new Yd0(interfaceC2583qj, AbstractC0397Ej.a(abstractC1853j70, c2922u8.a, c2433p50N, interfaceC1219cj.r() || (jK4 > (-9223372036854775807L) ? 1 : (jK4 == (-9223372036854775807L) ? 0 : -1)) == 0 || (c2778skB.c(j10) > jK4 ? 1 : (c2778skB.c(j10) == jK4 ? 0 : -1)) <= 0 ? 0 : 8), c0643NwK, iM, objQ, jD, c2778skB.c(j10), j10, c2972uk.d, c0643NwK);
                                        c2149m9 = c2149m13;
                                    } else {
                                        int i3 = 1;
                                        C2433p50 c2433p51 = c2433p50N;
                                        int i4 = 1;
                                        while (true) {
                                            j11 = j7;
                                            if (i4 >= iMin || (c2433p50A = c2433p51.a(interfaceC1219cj.n((((long) i4) + j10) - j8), c2922u8.a)) == null) {
                                                break;
                                            }
                                            i3++;
                                            i4++;
                                            c2433p51 = c2433p50A;
                                            j7 = j11;
                                        }
                                        long j23 = (((long) i3) + j10) - 1;
                                        long jC3 = c2778skB.c(j23);
                                        c0861Wg = new C0861Wg(interfaceC2583qj, AbstractC0397Ej.a(abstractC1853j70, c2922u8.a, c2433p51, interfaceC1219cj.r() || (jK4 > (-9223372036854775807L) ? 1 : (jK4 == (-9223372036854775807L) ? 0 : -1)) == 0 || (c2778skB.c(j23) > jK4 ? 1 : (c2778skB.c(j23) == jK4 ? 0 : -1)) <= 0 ? 0 : 8), c0643NwK, iM, objQ, jD, jC3, j22, (j7 == -9223372036854775807L || j11 > jC3) ? -9223372036854775807L : j11, j10, i3, -abstractC1853j70.n, c2778skB.a);
                                        c2149m9 = c2149m13;
                                    }
                                    c2149m9.m = c0861Wg;
                                } else {
                                    c2149m13.l = true;
                                }
                            }
                            c2149m9 = c2149m13;
                        } else {
                            if (w9.t == null) {
                                c2433p50 = abstractC1853j70.p;
                            } else {
                                c2433p50 = null;
                            }
                            if (interfaceC1219cj == null) {
                                c2433p50E = abstractC1853j70.e();
                            } else {
                                c2433p50E = null;
                            }
                            if (c2433p50 == null || c2433p50E != null) {
                                C0643Nw c0643NwK2 = c2972uk.i.k();
                                int iM2 = c2972uk.i.m();
                                Object objQ2 = c2972uk.i.q();
                                if (c2433p50 != null) {
                                    c2433p50A2 = c2433p50.a(c2433p50E, c2922u8.a);
                                    if (c2433p50A2 != null) {
                                        c2433p50 = c2433p50A2;
                                    }
                                } else {
                                    c2433p50 = c2433p50E;
                                }
                                c2149m13.m = new GF(c2972uk.e, AbstractC0397Ej.a(abstractC1853j70, c2922u8.a, c2433p50, 0), c0643NwK2, iM2, objQ2, c2778skB.a);
                            } else {
                                c0733Ri = c2972uk.j;
                                if (c0733Ri.d) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                j7 = c2778skB.e;
                                if (z2) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                if (interfaceC1219cj.y(j7) == 0) {
                                    c2149m13.l = z3;
                                } else {
                                    long j24 = interfaceC1219cj.j(j7, j5);
                                    j8 = c2778skB.f;
                                    j9 = j24 + j8;
                                    jB = c2778skB.b(j5);
                                    if (z2) {
                                        jC = c2778skB.c(jB);
                                        if ((jC - c2778skB.d(jB)) + jC >= j7) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        z3 &= z4;
                                    }
                                    if (abstractC2843tO != null) {
                                        jK = abstractC2843tO.a();
                                    } else {
                                        jK = Lr0.k(interfaceC1219cj.c(j6, j7) + j8, j9, jB);
                                        j6 = j6;
                                    }
                                    j10 = jK;
                                    if (j10 < j9) {
                                        c2972uk.l = new B8();
                                    } else if (j10 <= jB) {
                                        c2149m9 = c2149m13;
                                        c2149m9.l = z3;
                                    } else {
                                        c2149m9 = c2149m13;
                                        c2149m9.l = z3;
                                    }
                                }
                            }
                            c2149m9 = c2149m13;
                        }
                    } else {
                        j3 = jK3;
                    }
                    j4 = -9223372036854775807L;
                    jMax = -9223372036854775807L;
                    j5 = j3;
                    z = zN;
                    j6 = j12;
                    c2972uk = c2972uk3;
                    c2972uk3.i.s(j, j13, jMax, list, interfaceC2940uOArr);
                    c2778skB = c2972uk.b(c2972uk.i.n());
                    interfaceC1219cj = c2778skB.d;
                    c2922u8 = c2778skB.c;
                    w9 = c2778skB.a;
                    abstractC1853j70 = c2778skB.b;
                    if (w9 == null) {
                        c0733Ri = c2972uk.j;
                        if (c0733Ri.d) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        j7 = c2778skB.e;
                        if (z2) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (interfaceC1219cj.y(j7) == 0) {
                            c2149m13.l = z3;
                        } else {
                            long j25 = interfaceC1219cj.j(j7, j5);
                            j8 = c2778skB.f;
                            j9 = j25 + j8;
                            jB = c2778skB.b(j5);
                            if (z2) {
                                jC = c2778skB.c(jB);
                                if ((jC - c2778skB.d(jB)) + jC >= j7) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                z3 &= z4;
                            }
                            if (abstractC2843tO != null) {
                                jK = abstractC2843tO.a();
                            } else {
                                jK = Lr0.k(interfaceC1219cj.c(j6, j7) + j8, j9, jB);
                                j6 = j6;
                            }
                            j10 = jK;
                            if (j10 < j9) {
                                c2972uk.l = new B8();
                            } else if (j10 <= jB) {
                                c2149m9 = c2149m13;
                                c2149m9.l = z3;
                            } else {
                                c2149m9 = c2149m13;
                                c2149m9.l = z3;
                            }
                        }
                        c2149m9 = c2149m13;
                    } else {
                        if (w9.t == null) {
                            c2433p50 = abstractC1853j70.p;
                        } else {
                            c2433p50 = null;
                        }
                        if (interfaceC1219cj == null) {
                            c2433p50E = abstractC1853j70.e();
                        } else {
                            c2433p50E = null;
                        }
                        if (c2433p50 == null) {
                        }
                        C0643Nw c0643NwK3 = c2972uk.i.k();
                        int iM3 = c2972uk.i.m();
                        Object objQ3 = c2972uk.i.q();
                        if (c2433p50 != null) {
                            c2433p50A2 = c2433p50.a(c2433p50E, c2922u8.a);
                            if (c2433p50A2 != null) {
                                c2433p50 = c2433p50A2;
                            }
                        } else {
                            c2433p50 = c2433p50E;
                        }
                        c2149m13.m = new GF(c2972uk.e, AbstractC0397Ej.a(abstractC1853j70, c2922u8.a, c2433p50, 0), c0643NwK3, iM3, objQ3, c2778skB.a);
                        c2149m9 = c2149m13;
                    }
                }
                boolean z6 = c2149m9.l;
                AbstractC2764sd abstractC2764sd = (AbstractC2764sd) c2149m9.m;
                c2149m9.m = null;
                c2149m9.l = false;
                if (z6) {
                    this.D = -9223372036854775807L;
                    this.H = true;
                    return true;
                }
                if (abstractC2764sd == null) {
                    return false;
                }
                this.A = abstractC2764sd;
                boolean z7 = abstractC2764sd instanceof AbstractC1269d8;
                C2720s4 c2720s4 = this.z;
                if (z7) {
                    AbstractC1269d8 abstractC1269d8 = (AbstractC1269d8) abstractC2764sd;
                    if (z) {
                        long j26 = this.D;
                        if (abstractC1269d8.r != j26) {
                            this.x.t = j26;
                            for (C90 c90 : this.y) {
                                c90.t = this.D;
                            }
                        }
                        this.D = -9223372036854775807L;
                    }
                    abstractC1269d8.x = c2720s4;
                    C90[] c90Arr = (C90[]) c2720s4.n;
                    int[] iArr = new int[c90Arr.length];
                    for (int i5 = 0; i5 < c90Arr.length; i5++) {
                        C90 c91 = c90Arr[i5];
                        iArr[i5] = c91.q + c91.p;
                    }
                    abstractC1269d8.y = iArr;
                    this.v.add(abstractC1269d8);
                } else if (abstractC2764sd instanceof GF) {
                    ((GF) abstractC2764sd).v = c2720s4;
                }
                na0.S(abstractC2764sd, this, this.s.v(abstractC2764sd.n));
                this.r.G(new C0991aL(abstractC2764sd.m), abstractC2764sd.n, this.l, abstractC2764sd.f1028o, abstractC2764sd.p, abstractC2764sd.q, abstractC2764sd.r, abstractC2764sd.s);
                return true;
            }
        }
        return false;
    }

    @Override // o.Ub0
    public final void O(long j) {
        Na0 na0 = this.t;
        if (na0.F() || n()) {
            return;
        }
        boolean zM = na0.M();
        ArrayList arrayList = this.v;
        List list = this.w;
        C2972uk c2972uk = this.p;
        if (zM) {
            AbstractC2764sd abstractC2764sd = this.A;
            abstractC2764sd.getClass();
            boolean z = abstractC2764sd instanceof AbstractC1269d8;
            if (z && m(arrayList.size() - 1)) {
                return;
            }
            if (c2972uk.l == null ? c2972uk.i.l(j, abstractC2764sd, list) : false) {
                na0.r();
                if (z) {
                    this.G = (AbstractC1269d8) abstractC2764sd;
                    return;
                }
                return;
            }
            return;
        }
        int size = (c2972uk.l != null || c2972uk.i.length() < 2) ? list.size() : c2972uk.i.g(j, list);
        if (size < arrayList.size()) {
            AbstractC0397Ej.f(!na0.M());
            int size2 = arrayList.size();
            while (true) {
                if (size >= size2) {
                    size = -1;
                    break;
                } else if (!m(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size == -1) {
                return;
            }
            long j2 = j().s;
            AbstractC1269d8 abstractC1269d8I = i(size);
            if (arrayList.isEmpty()) {
                this.D = this.E;
            }
            this.H = false;
            C2613qy c2613qy = this.r;
            c2613qy.getClass();
            c2613qy.L(new C2069lP(1, this.l, null, 3, null, Lr0.X(abstractC1269d8I.r), Lr0.X(j2)));
        }
    }

    @Override // o.D90
    public final void a() throws IOException {
        Na0 na0 = this.t;
        na0.a();
        this.x.x();
        if (na0.M()) {
            return;
        }
        C2972uk c2972uk = this.p;
        B8 b8 = c2972uk.l;
        if (b8 != null) {
            throw b8;
        }
        c2972uk.a.a();
    }

    @Override // o.Ub0
    public final boolean b() {
        return this.t.M();
    }

    @Override // o.InterfaceC1577gL
    public final void d() {
        C90 c90 = this.x;
        c90.B(true);
        InterfaceC3465zo interfaceC3465zo = c90.h;
        if (interfaceC3465zo != null) {
            interfaceC3465zo.d(c90.e);
            c90.h = null;
            c90.g = null;
        }
        for (C90 c91 : this.y) {
            c91.B(true);
            InterfaceC3465zo interfaceC3465zo2 = c91.h;
            if (interfaceC3465zo2 != null) {
                interfaceC3465zo2.d(c91.e);
                c91.h = null;
                c91.g = null;
            }
        }
        for (C2778sk c2778sk : this.p.h) {
            W9 w9 = c2778sk.a;
            if (w9 != null) {
                w9.l.a();
            }
        }
        InterfaceC3152wd interfaceC3152wd = this.C;
        if (interfaceC3152wd != null) {
            C0863Wi c0863Wi = (C0863Wi) interfaceC3152wd;
            synchronized (c0863Wi) {
                C3145wZ c3145wZ = (C3145wZ) c0863Wi.y.remove(this);
                if (c3145wZ != null) {
                    C90 c92 = c3145wZ.a;
                    c92.B(true);
                    InterfaceC3465zo interfaceC3465zo3 = c92.h;
                    if (interfaceC3465zo3 != null) {
                        interfaceC3465zo3.d(c92.e);
                        c92.h = null;
                        c92.g = null;
                    }
                }
            }
        }
    }

    @Override // o.D90
    public final boolean e() {
        return !n() && this.x.v(this.H);
    }

    @Override // o.D90
    public final int f(long j) {
        if (n()) {
            return 0;
        }
        C90 c90 = this.x;
        int iS = c90.s(j, this.H);
        AbstractC1269d8 abstractC1269d8 = this.G;
        if (abstractC1269d8 != null) {
            iS = Math.min(iS, abstractC1269d8.d(0) - c90.q());
        }
        c90.F(iS);
        q();
        return iS;
    }

    @Override // o.D90
    public final int g(C2994uv c2994uv, C0656Oj c0656Oj, int i) {
        if (n()) {
            return -3;
        }
        AbstractC1269d8 abstractC1269d8 = this.G;
        C90 c90 = this.x;
        if (abstractC1269d8 != null && abstractC1269d8.d(0) <= c90.q()) {
            return -3;
        }
        q();
        return c90.A(c2994uv, c0656Oj, i, this.H);
    }

    @Override // o.InterfaceC1284dL
    public final void h(InterfaceC1479fL interfaceC1479fL, long j, long j2, boolean z) {
        AbstractC2764sd abstractC2764sd = (AbstractC2764sd) interfaceC1479fL;
        this.A = null;
        this.G = null;
        long j3 = abstractC2764sd.l;
        Uri uri = abstractC2764sd.t.n;
        C0991aL c0991aL = new C0991aL();
        this.s.getClass();
        this.r.x(c0991aL, abstractC2764sd.n, this.l, abstractC2764sd.f1028o, abstractC2764sd.p, abstractC2764sd.q, abstractC2764sd.r, abstractC2764sd.s);
        if (z) {
            return;
        }
        if (n()) {
            this.x.B(false);
            for (C90 c90 : this.y) {
                c90.B(false);
            }
        } else if (abstractC2764sd instanceof AbstractC1269d8) {
            ArrayList arrayList = this.v;
            i(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.D = this.E;
            }
        }
        this.q.e(this);
    }

    public final AbstractC1269d8 i(int i) {
        ArrayList arrayList = this.v;
        AbstractC1269d8 abstractC1269d8 = (AbstractC1269d8) arrayList.get(i);
        Lr0.P(arrayList, i, arrayList.size());
        this.F = Math.max(this.F, arrayList.size());
        int i2 = 0;
        this.x.k(abstractC1269d8.d(0));
        while (true) {
            C90[] c90Arr = this.y;
            if (i2 >= c90Arr.length) {
                return abstractC1269d8;
            }
            C90 c90 = c90Arr[i2];
            i2++;
            c90.k(abstractC1269d8.d(i2));
        }
    }

    public final AbstractC1269d8 j() {
        return (AbstractC1269d8) AbstractC1701hf0.c(1, this.v);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0228  */
    /* JADX WARN: Code duplicated, block: B:102:0x022c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0236  */
    /* JADX WARN: Code duplicated, block: B:105:0x0238  */
    /* JADX WARN: Code duplicated, block: B:108:0x0242  */
    /* JADX WARN: Code duplicated, block: B:109:0x0247  */
    /* JADX WARN: Code duplicated, block: B:111:0x024c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0254  */
    /* JADX WARN: Code duplicated, block: B:115:0x025b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0266  */
    /* JADX WARN: Code duplicated, block: B:118:0x026d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0295  */
    /* JADX WARN: Code duplicated, block: B:125:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x0103  */
    /* JADX WARN: Code duplicated, block: B:55:0x011d  */
    /* JADX WARN: Code duplicated, block: B:60:0x013a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0142  */
    /* JADX WARN: Code duplicated, block: B:67:0x0153 A[LOOP:1: B:65:0x014d->B:67:0x0153, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x017b A[LOOP:2: B:69:0x0175->B:71:0x017b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x019e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01af  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:89:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x020a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0226 A[DONT_INVERT] */
    @Override // o.InterfaceC1284dL
    public final ZK k(InterfaceC1479fL interfaceC1479fL, IOException iOException, int i) {
        boolean z;
        C0643Nw c0643Nw;
        ArrayList arrayList;
        int i2;
        C1583gR c1583gR;
        C2922u8 c2922u8G;
        C2922u8 c2922u8;
        InterfaceC1920js interfaceC1920js;
        AbstractC0985aF abstractC0985aF;
        long jElapsedRealtime;
        int length;
        AbstractC2764sd abstractC2764sd;
        C0991aL c0991aL;
        int i3;
        int i4;
        HashSet hashSet;
        int i5;
        YK yk;
        HashSet hashSet2;
        ArrayList arrayListD;
        int i6;
        ZK zkN;
        int i7;
        long j;
        long jElapsedRealtime2;
        String str;
        HashMap map;
        long jMax;
        int i8;
        Integer numValueOf;
        HashMap map2;
        boolean zO;
        ZK zk;
        boolean z2;
        long jW;
        boolean z3;
        AbstractC2764sd abstractC2764sd2 = (AbstractC2764sd) interfaceC1479fL;
        long j2 = abstractC2764sd2.t.m;
        boolean z4 = abstractC2764sd2 instanceof AbstractC1269d8;
        ArrayList arrayList2 = this.v;
        int size = arrayList2.size() - 1;
        boolean z5 = (j2 != 0 && z4 && m(size)) ? false : true;
        Uri uri = abstractC2764sd2.t.n;
        C0991aL c0991aL2 = new C0991aL();
        long j3 = abstractC2764sd2.r;
        Lr0.X(j3);
        Lr0.X(abstractC2764sd2.s);
        C2295nk0 c2295nk0 = new C2295nk0(i, 5, iOException);
        C2972uk c2972uk = this.p;
        C0622Nb c0622Nb = this.s;
        if (z5) {
            C3145wZ c3145wZ = c2972uk.g;
            if (c3145wZ != null) {
                long j4 = c3145wZ.d;
                boolean z6 = j4 != -9223372036854775807L && j4 < j3;
                C3242xZ c3242xZ = c3145wZ.e;
                if (c3242xZ.q.d) {
                    if (!c3242xZ.s) {
                        if (!z6) {
                            z = c2972uk.j.d;
                            c0643Nw = abstractC2764sd2.f1028o;
                            C2778sk[] c2778skArr = c2972uk.h;
                            if (z && (abstractC2764sd2 instanceof AbstractC2843tO) && (iOException instanceof C1472fE) && ((C1472fE) iOException).f770o == 404) {
                                C2778sk c2778sk = c2778skArr[c2972uk.i.a(c0643Nw)];
                                i2 = size;
                                long jY = c2778sk.d.y(c2778sk.e);
                                if (jY == -1 || jY == 0) {
                                    arrayList = arrayList2;
                                } else {
                                    arrayList = arrayList2;
                                    if (((AbstractC2843tO) abstractC2764sd2).a() > ((c2778sk.d.u() + c2778sk.f) + jY) - 1) {
                                        c2972uk.m = true;
                                    }
                                    abstractC2764sd = abstractC2764sd2;
                                    c0991aL = c0991aL2;
                                    zO = true;
                                }
                            } else {
                                arrayList = arrayList2;
                                i2 = size;
                            }
                            C2778sk c2778sk2 = c2778skArr[c2972uk.i.a(c0643Nw)];
                            AbstractC0985aF abstractC0985aF2 = c2778sk2.b.m;
                            c1583gR = c2972uk.b;
                            c2922u8G = c1583gR.G(abstractC0985aF2);
                            c2922u8 = c2778sk2.c;
                            if (c2922u8G != null || c2922u8.equals(c2922u8G)) {
                                interfaceC1920js = c2972uk.i;
                                abstractC0985aF = c2778sk2.b.m;
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                length = interfaceC1920js.length();
                                abstractC2764sd = abstractC2764sd2;
                                c0991aL = c0991aL2;
                                i3 = 0;
                                for (i4 = 0; i4 < length; i4++) {
                                    if (interfaceC1920js.c(i4, jElapsedRealtime)) {
                                        i3++;
                                    }
                                }
                                hashSet = new HashSet();
                                for (i5 = 0; i5 < abstractC0985aF.size(); i5++) {
                                    hashSet.add(Integer.valueOf(((C2922u8) abstractC0985aF.get(i5)).c));
                                }
                                int size2 = hashSet.size();
                                hashSet2 = new HashSet();
                                arrayListD = c1583gR.d(abstractC0985aF);
                                for (i6 = 0; i6 < arrayListD.size(); i6++) {
                                    hashSet2.add(Integer.valueOf(((C2922u8) arrayListD.get(i6)).c));
                                }
                                yk = new YK(size2, size2 - hashSet2.size(), length, i3);
                                if (yk.a(2) || yk.a(1)) {
                                    c0622Nb.getClass();
                                    zkN = C0622Nb.n(yk, c2295nk0);
                                    if (zkN != null) {
                                        i7 = zkN.a;
                                        if (yk.a(i7)) {
                                            j = zkN.b;
                                            if (i7 == 2) {
                                                InterfaceC1920js interfaceC1920js2 = c2972uk.i;
                                                zO = interfaceC1920js2.o(interfaceC1920js2.a(c0643Nw), j);
                                            } else if (i7 == 1) {
                                                jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                                str = c2922u8.b;
                                                map = (HashMap) c1583gR.m;
                                                if (map.containsKey(str)) {
                                                    Long l = (Long) map.get(str);
                                                    int i9 = Lr0.a;
                                                    jMax = Math.max(jElapsedRealtime2, l.longValue());
                                                } else {
                                                    jMax = jElapsedRealtime2;
                                                }
                                                map.put(str, Long.valueOf(jMax));
                                                i8 = c2922u8.c;
                                                if (i8 != Integer.MIN_VALUE) {
                                                    numValueOf = Integer.valueOf(i8);
                                                    map2 = (HashMap) c1583gR.n;
                                                    if (map2.containsKey(numValueOf)) {
                                                        Long l2 = (Long) map2.get(numValueOf);
                                                        int i10 = Lr0.a;
                                                        jElapsedRealtime2 = Math.max(jElapsedRealtime2, l2.longValue());
                                                    }
                                                    map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                abstractC2764sd = abstractC2764sd2;
                                c0991aL = c0991aL2;
                            }
                            zO = true;
                        } else if (c3242xZ.r) {
                            c3242xZ.s = true;
                            c3242xZ.r = false;
                            C1122bj c1122bj = c3242xZ.m.m;
                            c1122bj.E.removeCallbacks(c1122bj.x);
                            c1122bj.v();
                        }
                    }
                    abstractC2764sd = abstractC2764sd2;
                    c0991aL = c0991aL2;
                    arrayList = arrayList2;
                    i2 = size;
                    zO = true;
                } else {
                    z = c2972uk.j.d;
                    c0643Nw = abstractC2764sd2.f1028o;
                    C2778sk[] c2778skArr2 = c2972uk.h;
                    if (z) {
                        arrayList = arrayList2;
                        i2 = size;
                        C2778sk c2778sk3 = c2778skArr2[c2972uk.i.a(c0643Nw)];
                        AbstractC0985aF abstractC0985aF3 = c2778sk3.b.m;
                        c1583gR = c2972uk.b;
                        c2922u8G = c1583gR.G(abstractC0985aF3);
                        c2922u8 = c2778sk3.c;
                        if (c2922u8G != null) {
                        }
                        interfaceC1920js = c2972uk.i;
                        abstractC0985aF = c2778sk3.b.m;
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        length = interfaceC1920js.length();
                        abstractC2764sd = abstractC2764sd2;
                        c0991aL = c0991aL2;
                        i3 = 0;
                        while (i4 < length) {
                            if (interfaceC1920js.c(i4, jElapsedRealtime)) {
                                i3++;
                            }
                        }
                        hashSet = new HashSet();
                        while (i5 < abstractC0985aF.size()) {
                            hashSet.add(Integer.valueOf(((C2922u8) abstractC0985aF.get(i5)).c));
                        }
                        int size3 = hashSet.size();
                        hashSet2 = new HashSet();
                        arrayListD = c1583gR.d(abstractC0985aF);
                        while (i6 < arrayListD.size()) {
                            hashSet2.add(Integer.valueOf(((C2922u8) arrayListD.get(i6)).c));
                        }
                        yk = new YK(size3, size3 - hashSet2.size(), length, i3);
                        if (yk.a(2)) {
                            c0622Nb.getClass();
                            zkN = C0622Nb.n(yk, c2295nk0);
                            if (zkN != null) {
                                i7 = zkN.a;
                                if (yk.a(i7)) {
                                    j = zkN.b;
                                    if (i7 == 2) {
                                        InterfaceC1920js interfaceC1920js3 = c2972uk.i;
                                        zO = interfaceC1920js3.o(interfaceC1920js3.a(c0643Nw), j);
                                    } else if (i7 == 1) {
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                        str = c2922u8.b;
                                        map = (HashMap) c1583gR.m;
                                        if (map.containsKey(str)) {
                                            Long l3 = (Long) map.get(str);
                                            int i11 = Lr0.a;
                                            jMax = Math.max(jElapsedRealtime2, l3.longValue());
                                        } else {
                                            jMax = jElapsedRealtime2;
                                        }
                                        map.put(str, Long.valueOf(jMax));
                                        i8 = c2922u8.c;
                                        if (i8 != Integer.MIN_VALUE) {
                                            numValueOf = Integer.valueOf(i8);
                                            map2 = (HashMap) c1583gR.n;
                                            if (map2.containsKey(numValueOf)) {
                                                Long l4 = (Long) map2.get(numValueOf);
                                                int i12 = Lr0.a;
                                                jElapsedRealtime2 = Math.max(jElapsedRealtime2, l4.longValue());
                                            }
                                            map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                        }
                                        zO = true;
                                    }
                                }
                            }
                        } else {
                            c0622Nb.getClass();
                            zkN = C0622Nb.n(yk, c2295nk0);
                            if (zkN != null) {
                                i7 = zkN.a;
                                if (yk.a(i7)) {
                                    j = zkN.b;
                                    if (i7 == 2) {
                                        InterfaceC1920js interfaceC1920js4 = c2972uk.i;
                                        zO = interfaceC1920js4.o(interfaceC1920js4.a(c0643Nw), j);
                                    } else if (i7 == 1) {
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                        str = c2922u8.b;
                                        map = (HashMap) c1583gR.m;
                                        if (map.containsKey(str)) {
                                            Long l5 = (Long) map.get(str);
                                            int i13 = Lr0.a;
                                            jMax = Math.max(jElapsedRealtime2, l5.longValue());
                                        } else {
                                            jMax = jElapsedRealtime2;
                                        }
                                        map.put(str, Long.valueOf(jMax));
                                        i8 = c2922u8.c;
                                        if (i8 != Integer.MIN_VALUE) {
                                            numValueOf = Integer.valueOf(i8);
                                            map2 = (HashMap) c1583gR.n;
                                            if (map2.containsKey(numValueOf)) {
                                                Long l6 = (Long) map2.get(numValueOf);
                                                int i14 = Lr0.a;
                                                jElapsedRealtime2 = Math.max(jElapsedRealtime2, l6.longValue());
                                            }
                                            map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                        }
                                        zO = true;
                                    }
                                }
                            }
                        }
                    } else {
                        arrayList = arrayList2;
                        i2 = size;
                        C2778sk c2778sk4 = c2778skArr2[c2972uk.i.a(c0643Nw)];
                        AbstractC0985aF abstractC0985aF4 = c2778sk4.b.m;
                        c1583gR = c2972uk.b;
                        c2922u8G = c1583gR.G(abstractC0985aF4);
                        c2922u8 = c2778sk4.c;
                        if (c2922u8G != null) {
                        }
                        interfaceC1920js = c2972uk.i;
                        abstractC0985aF = c2778sk4.b.m;
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        length = interfaceC1920js.length();
                        abstractC2764sd = abstractC2764sd2;
                        c0991aL = c0991aL2;
                        i3 = 0;
                        while (i4 < length) {
                            if (interfaceC1920js.c(i4, jElapsedRealtime)) {
                                i3++;
                            }
                        }
                        hashSet = new HashSet();
                        while (i5 < abstractC0985aF.size()) {
                            hashSet.add(Integer.valueOf(((C2922u8) abstractC0985aF.get(i5)).c));
                        }
                        int size4 = hashSet.size();
                        hashSet2 = new HashSet();
                        arrayListD = c1583gR.d(abstractC0985aF);
                        while (i6 < arrayListD.size()) {
                            hashSet2.add(Integer.valueOf(((C2922u8) arrayListD.get(i6)).c));
                        }
                        yk = new YK(size4, size4 - hashSet2.size(), length, i3);
                        if (yk.a(2)) {
                            c0622Nb.getClass();
                            zkN = C0622Nb.n(yk, c2295nk0);
                            if (zkN != null) {
                                i7 = zkN.a;
                                if (yk.a(i7)) {
                                    j = zkN.b;
                                    if (i7 == 2) {
                                        InterfaceC1920js interfaceC1920js5 = c2972uk.i;
                                        zO = interfaceC1920js5.o(interfaceC1920js5.a(c0643Nw), j);
                                    } else if (i7 == 1) {
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                        str = c2922u8.b;
                                        map = (HashMap) c1583gR.m;
                                        if (map.containsKey(str)) {
                                            Long l7 = (Long) map.get(str);
                                            int i15 = Lr0.a;
                                            jMax = Math.max(jElapsedRealtime2, l7.longValue());
                                        } else {
                                            jMax = jElapsedRealtime2;
                                        }
                                        map.put(str, Long.valueOf(jMax));
                                        i8 = c2922u8.c;
                                        if (i8 != Integer.MIN_VALUE) {
                                            numValueOf = Integer.valueOf(i8);
                                            map2 = (HashMap) c1583gR.n;
                                            if (map2.containsKey(numValueOf)) {
                                                Long l8 = (Long) map2.get(numValueOf);
                                                int i16 = Lr0.a;
                                                jElapsedRealtime2 = Math.max(jElapsedRealtime2, l8.longValue());
                                            }
                                            map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                        }
                                        zO = true;
                                    }
                                }
                            }
                        } else {
                            c0622Nb.getClass();
                            zkN = C0622Nb.n(yk, c2295nk0);
                            if (zkN != null) {
                                i7 = zkN.a;
                                if (yk.a(i7)) {
                                    j = zkN.b;
                                    if (i7 == 2) {
                                        InterfaceC1920js interfaceC1920js6 = c2972uk.i;
                                        zO = interfaceC1920js6.o(interfaceC1920js6.a(c0643Nw), j);
                                    } else if (i7 == 1) {
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                        str = c2922u8.b;
                                        map = (HashMap) c1583gR.m;
                                        if (map.containsKey(str)) {
                                            Long l9 = (Long) map.get(str);
                                            int i17 = Lr0.a;
                                            jMax = Math.max(jElapsedRealtime2, l9.longValue());
                                        } else {
                                            jMax = jElapsedRealtime2;
                                        }
                                        map.put(str, Long.valueOf(jMax));
                                        i8 = c2922u8.c;
                                        if (i8 != Integer.MIN_VALUE) {
                                            numValueOf = Integer.valueOf(i8);
                                            map2 = (HashMap) c1583gR.n;
                                            if (map2.containsKey(numValueOf)) {
                                                Long l10 = (Long) map2.get(numValueOf);
                                                int i18 = Lr0.a;
                                                jElapsedRealtime2 = Math.max(jElapsedRealtime2, l10.longValue());
                                            }
                                            map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                        }
                                        zO = true;
                                    }
                                }
                            }
                        }
                    }
                    abstractC2764sd = abstractC2764sd2;
                    c0991aL = c0991aL2;
                    zO = true;
                }
            } else {
                z = c2972uk.j.d;
                c0643Nw = abstractC2764sd2.f1028o;
                C2778sk[] c2778skArr3 = c2972uk.h;
                if (z) {
                    arrayList = arrayList2;
                    i2 = size;
                    C2778sk c2778sk5 = c2778skArr3[c2972uk.i.a(c0643Nw)];
                    AbstractC0985aF abstractC0985aF5 = c2778sk5.b.m;
                    c1583gR = c2972uk.b;
                    c2922u8G = c1583gR.G(abstractC0985aF5);
                    c2922u8 = c2778sk5.c;
                    if (c2922u8G != null) {
                    }
                    interfaceC1920js = c2972uk.i;
                    abstractC0985aF = c2778sk5.b.m;
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    length = interfaceC1920js.length();
                    abstractC2764sd = abstractC2764sd2;
                    c0991aL = c0991aL2;
                    i3 = 0;
                    while (i4 < length) {
                        if (interfaceC1920js.c(i4, jElapsedRealtime)) {
                            i3++;
                        }
                    }
                    hashSet = new HashSet();
                    while (i5 < abstractC0985aF.size()) {
                        hashSet.add(Integer.valueOf(((C2922u8) abstractC0985aF.get(i5)).c));
                    }
                    int size5 = hashSet.size();
                    hashSet2 = new HashSet();
                    arrayListD = c1583gR.d(abstractC0985aF);
                    while (i6 < arrayListD.size()) {
                        hashSet2.add(Integer.valueOf(((C2922u8) arrayListD.get(i6)).c));
                    }
                    yk = new YK(size5, size5 - hashSet2.size(), length, i3);
                    if (yk.a(2)) {
                        c0622Nb.getClass();
                        zkN = C0622Nb.n(yk, c2295nk0);
                        if (zkN != null) {
                            i7 = zkN.a;
                            if (yk.a(i7)) {
                                j = zkN.b;
                                if (i7 == 2) {
                                    InterfaceC1920js interfaceC1920js7 = c2972uk.i;
                                    zO = interfaceC1920js7.o(interfaceC1920js7.a(c0643Nw), j);
                                } else if (i7 == 1) {
                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                    str = c2922u8.b;
                                    map = (HashMap) c1583gR.m;
                                    if (map.containsKey(str)) {
                                        Long l11 = (Long) map.get(str);
                                        int i19 = Lr0.a;
                                        jMax = Math.max(jElapsedRealtime2, l11.longValue());
                                    } else {
                                        jMax = jElapsedRealtime2;
                                    }
                                    map.put(str, Long.valueOf(jMax));
                                    i8 = c2922u8.c;
                                    if (i8 != Integer.MIN_VALUE) {
                                        numValueOf = Integer.valueOf(i8);
                                        map2 = (HashMap) c1583gR.n;
                                        if (map2.containsKey(numValueOf)) {
                                            Long l12 = (Long) map2.get(numValueOf);
                                            int i110 = Lr0.a;
                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l12.longValue());
                                        }
                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                    }
                                    zO = true;
                                }
                            }
                        }
                    } else {
                        c0622Nb.getClass();
                        zkN = C0622Nb.n(yk, c2295nk0);
                        if (zkN != null) {
                            i7 = zkN.a;
                            if (yk.a(i7)) {
                                j = zkN.b;
                                if (i7 == 2) {
                                    InterfaceC1920js interfaceC1920js8 = c2972uk.i;
                                    zO = interfaceC1920js8.o(interfaceC1920js8.a(c0643Nw), j);
                                } else if (i7 == 1) {
                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                    str = c2922u8.b;
                                    map = (HashMap) c1583gR.m;
                                    if (map.containsKey(str)) {
                                        Long l13 = (Long) map.get(str);
                                        int i111 = Lr0.a;
                                        jMax = Math.max(jElapsedRealtime2, l13.longValue());
                                    } else {
                                        jMax = jElapsedRealtime2;
                                    }
                                    map.put(str, Long.valueOf(jMax));
                                    i8 = c2922u8.c;
                                    if (i8 != Integer.MIN_VALUE) {
                                        numValueOf = Integer.valueOf(i8);
                                        map2 = (HashMap) c1583gR.n;
                                        if (map2.containsKey(numValueOf)) {
                                            Long l14 = (Long) map2.get(numValueOf);
                                            int i112 = Lr0.a;
                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l14.longValue());
                                        }
                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                    }
                                    zO = true;
                                }
                            }
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    C2778sk c2778sk6 = c2778skArr3[c2972uk.i.a(c0643Nw)];
                    AbstractC0985aF abstractC0985aF6 = c2778sk6.b.m;
                    c1583gR = c2972uk.b;
                    c2922u8G = c1583gR.G(abstractC0985aF6);
                    c2922u8 = c2778sk6.c;
                    if (c2922u8G != null) {
                    }
                    interfaceC1920js = c2972uk.i;
                    abstractC0985aF = c2778sk6.b.m;
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    length = interfaceC1920js.length();
                    abstractC2764sd = abstractC2764sd2;
                    c0991aL = c0991aL2;
                    i3 = 0;
                    while (i4 < length) {
                        if (interfaceC1920js.c(i4, jElapsedRealtime)) {
                            i3++;
                        }
                    }
                    hashSet = new HashSet();
                    while (i5 < abstractC0985aF.size()) {
                        hashSet.add(Integer.valueOf(((C2922u8) abstractC0985aF.get(i5)).c));
                    }
                    int size6 = hashSet.size();
                    hashSet2 = new HashSet();
                    arrayListD = c1583gR.d(abstractC0985aF);
                    while (i6 < arrayListD.size()) {
                        hashSet2.add(Integer.valueOf(((C2922u8) arrayListD.get(i6)).c));
                    }
                    yk = new YK(size6, size6 - hashSet2.size(), length, i3);
                    if (yk.a(2)) {
                        c0622Nb.getClass();
                        zkN = C0622Nb.n(yk, c2295nk0);
                        if (zkN != null) {
                            i7 = zkN.a;
                            if (yk.a(i7)) {
                                j = zkN.b;
                                if (i7 == 2) {
                                    InterfaceC1920js interfaceC1920js9 = c2972uk.i;
                                    zO = interfaceC1920js9.o(interfaceC1920js9.a(c0643Nw), j);
                                } else if (i7 == 1) {
                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                    str = c2922u8.b;
                                    map = (HashMap) c1583gR.m;
                                    if (map.containsKey(str)) {
                                        Long l15 = (Long) map.get(str);
                                        int i113 = Lr0.a;
                                        jMax = Math.max(jElapsedRealtime2, l15.longValue());
                                    } else {
                                        jMax = jElapsedRealtime2;
                                    }
                                    map.put(str, Long.valueOf(jMax));
                                    i8 = c2922u8.c;
                                    if (i8 != Integer.MIN_VALUE) {
                                        numValueOf = Integer.valueOf(i8);
                                        map2 = (HashMap) c1583gR.n;
                                        if (map2.containsKey(numValueOf)) {
                                            Long l16 = (Long) map2.get(numValueOf);
                                            int i114 = Lr0.a;
                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l16.longValue());
                                        }
                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                    }
                                    zO = true;
                                }
                            }
                        }
                    } else {
                        c0622Nb.getClass();
                        zkN = C0622Nb.n(yk, c2295nk0);
                        if (zkN != null) {
                            i7 = zkN.a;
                            if (yk.a(i7)) {
                                j = zkN.b;
                                if (i7 == 2) {
                                    InterfaceC1920js interfaceC1920js10 = c2972uk.i;
                                    zO = interfaceC1920js10.o(interfaceC1920js10.a(c0643Nw), j);
                                } else if (i7 == 1) {
                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                    str = c2922u8.b;
                                    map = (HashMap) c1583gR.m;
                                    if (map.containsKey(str)) {
                                        Long l17 = (Long) map.get(str);
                                        int i115 = Lr0.a;
                                        jMax = Math.max(jElapsedRealtime2, l17.longValue());
                                    } else {
                                        jMax = jElapsedRealtime2;
                                    }
                                    map.put(str, Long.valueOf(jMax));
                                    i8 = c2922u8.c;
                                    if (i8 != Integer.MIN_VALUE) {
                                        numValueOf = Integer.valueOf(i8);
                                        map2 = (HashMap) c1583gR.n;
                                        if (map2.containsKey(numValueOf)) {
                                            Long l18 = (Long) map2.get(numValueOf);
                                            int i116 = Lr0.a;
                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l18.longValue());
                                        }
                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                    }
                                    zO = true;
                                }
                            }
                        }
                    }
                }
                abstractC2764sd = abstractC2764sd2;
                c0991aL = c0991aL2;
                zO = true;
            }
            if (!zO) {
                if (z5) {
                    this = this;
                    if (z4) {
                        abstractC2764sd = abstractC2764sd;
                        if (this.i(i2) == abstractC2764sd) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        AbstractC0397Ej.f(z3);
                        if (arrayList.isEmpty()) {
                            this.D = this.E;
                        }
                    } else {
                        abstractC2764sd = abstractC2764sd;
                    }
                    zk = Na0.t;
                } else {
                    AP.z();
                }
                if (zk == null) {
                    c0622Nb.getClass();
                    jW = C0622Nb.w(c2295nk0);
                    if (jW != -9223372036854775807L) {
                        zk = new ZK(0, jW, false);
                    } else {
                        zk = Na0.u;
                    }
                }
                ZK zk2 = zk;
                z2 = !zk2.a();
                this.r.C(c0991aL, abstractC2764sd.n, this.l, abstractC2764sd.f1028o, abstractC2764sd.p, abstractC2764sd.q, abstractC2764sd.r, abstractC2764sd.s, iOException, z2);
                if (z2) {
                    this.A = null;
                    c0622Nb.getClass();
                    this.q.e(this);
                }
                return zk2;
            }
            zk = null;
            if (zk == null) {
                c0622Nb.getClass();
                jW = C0622Nb.w(c2295nk0);
                if (jW != -9223372036854775807L) {
                    zk = new ZK(0, jW, false);
                } else {
                    zk = Na0.u;
                }
            }
            ZK zk3 = zk;
            z2 = !zk3.a();
            this.r.C(c0991aL, abstractC2764sd.n, this.l, abstractC2764sd.f1028o, abstractC2764sd.p, abstractC2764sd.q, abstractC2764sd.r, abstractC2764sd.s, iOException, z2);
            if (z2) {
                this.A = null;
                c0622Nb.getClass();
                this.q.e(this);
            }
            return zk3;
        }
        c2972uk.getClass();
        abstractC2764sd = abstractC2764sd2;
        c0991aL = c0991aL2;
        arrayList = arrayList2;
        i2 = size;
        zO = false;
        if (!zO) {
            if (z5) {
                this = this;
                if (z4) {
                    abstractC2764sd = abstractC2764sd;
                    if (this.i(i2) == abstractC2764sd) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    AbstractC0397Ej.f(z3);
                    if (arrayList.isEmpty()) {
                        this.D = this.E;
                    }
                } else {
                    abstractC2764sd = abstractC2764sd;
                }
                zk = Na0.t;
            } else {
                AP.z();
            }
            if (zk == null) {
                c0622Nb.getClass();
                jW = C0622Nb.w(c2295nk0);
                if (jW != -9223372036854775807L) {
                    zk = new ZK(0, jW, false);
                } else {
                    zk = Na0.u;
                }
            }
            ZK zk4 = zk;
            z2 = !zk4.a();
            this.r.C(c0991aL, abstractC2764sd.n, this.l, abstractC2764sd.f1028o, abstractC2764sd.p, abstractC2764sd.q, abstractC2764sd.r, abstractC2764sd.s, iOException, z2);
            if (z2) {
                this.A = null;
                c0622Nb.getClass();
                this.q.e(this);
            }
            return zk4;
        }
        zk = null;
        if (zk == null) {
            c0622Nb.getClass();
            jW = C0622Nb.w(c2295nk0);
            if (jW != -9223372036854775807L) {
                zk = new ZK(0, jW, false);
            } else {
                zk = Na0.u;
            }
        }
        ZK zk5 = zk;
        z2 = !zk5.a();
        this.r.C(c0991aL, abstractC2764sd.n, this.l, abstractC2764sd.f1028o, abstractC2764sd.p, abstractC2764sd.q, abstractC2764sd.r, abstractC2764sd.s, iOException, z2);
        if (z2) {
            this.A = null;
            c0622Nb.getClass();
            this.q.e(this);
        }
        return zk5;
    }

    @Override // o.InterfaceC1284dL
    public final void l(InterfaceC1479fL interfaceC1479fL, long j, long j2) {
        AbstractC2764sd abstractC2764sd = (AbstractC2764sd) interfaceC1479fL;
        this.A = null;
        C2972uk c2972uk = this.p;
        c2972uk.getClass();
        if (abstractC2764sd instanceof GF) {
            int iA = c2972uk.i.a(((GF) abstractC2764sd).f1028o);
            C2778sk[] c2778skArr = c2972uk.h;
            C2778sk c2778sk = c2778skArr[iA];
            if (c2778sk.d == null) {
                W9 w9 = c2778sk.a;
                InterfaceC2664rb0 interfaceC2664rb0 = w9.s;
                C2861td c2861td = interfaceC2664rb0 instanceof C2861td ? (C2861td) interfaceC2664rb0 : null;
                if (c2861td != null) {
                    AbstractC1853j70 abstractC1853j70 = c2778sk.b;
                    c2778skArr[iA] = new C2778sk(c2778sk.e, abstractC1853j70, c2778sk.c, w9, c2778sk.f, new C3306y6(c2861td, abstractC1853j70.n, 2));
                }
            }
        }
        C3145wZ c3145wZ = c2972uk.g;
        if (c3145wZ != null) {
            long j3 = c3145wZ.d;
            if (j3 == -9223372036854775807L || abstractC2764sd.s > j3) {
                c3145wZ.d = abstractC2764sd.s;
            }
            c3145wZ.e.r = true;
        }
        long j4 = abstractC2764sd.l;
        Uri uri = abstractC2764sd.t.n;
        C0991aL c0991aL = new C0991aL();
        this.s.getClass();
        this.r.A(c0991aL, abstractC2764sd.n, this.l, abstractC2764sd.f1028o, abstractC2764sd.p, abstractC2764sd.q, abstractC2764sd.r, abstractC2764sd.s);
        this.q.e(this);
    }

    public final boolean m(int i) {
        int iQ;
        AbstractC1269d8 abstractC1269d8 = (AbstractC1269d8) this.v.get(i);
        if (this.x.q() > abstractC1269d8.d(0)) {
            return true;
        }
        int i2 = 0;
        do {
            C90[] c90Arr = this.y;
            if (i2 >= c90Arr.length) {
                return false;
            }
            iQ = c90Arr[i2].q();
            i2++;
        } while (iQ <= abstractC1269d8.d(i2));
        return true;
    }

    public final boolean n() {
        return this.D != -9223372036854775807L;
    }

    @Override // o.Ub0
    public final long o() {
        if (n()) {
            return this.D;
        }
        if (this.H) {
            return Long.MIN_VALUE;
        }
        return j().s;
    }

    public final void q() {
        int iR = r(this.x.q(), this.F - 1);
        while (true) {
            int i = this.F;
            if (i > iR) {
                return;
            }
            this.F = i + 1;
            AbstractC1269d8 abstractC1269d8 = (AbstractC1269d8) this.v.get(i);
            C0643Nw c0643Nw = abstractC1269d8.f1028o;
            if (!c0643Nw.equals(this.B)) {
                this.r.m(this.l, c0643Nw, abstractC1269d8.p, abstractC1269d8.q, abstractC1269d8.r);
            }
            this.B = c0643Nw;
        }
    }

    public final int r(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.v;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((AbstractC1269d8) arrayList.get(i2)).d(0) <= i);
        return i2 - 1;
    }

    public final void s(InterfaceC3152wd interfaceC3152wd) {
        this.C = interfaceC3152wd;
        C90 c90 = this.x;
        c90.i();
        InterfaceC3465zo interfaceC3465zo = c90.h;
        if (interfaceC3465zo != null) {
            interfaceC3465zo.d(c90.e);
            c90.h = null;
            c90.g = null;
        }
        for (C90 c91 : this.y) {
            c91.i();
            InterfaceC3465zo interfaceC3465zo2 = c91.h;
            if (interfaceC3465zo2 != null) {
                interfaceC3465zo2.d(c91.e);
                c91.h = null;
                c91.g = null;
            }
        }
        this.t.Q(this);
    }
}
