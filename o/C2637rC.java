package o;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o.rC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2637rC implements InterfaceC1284dL, InterfaceC1577gL, Ub0, InterfaceC0354Cs, B90 {
    public static final Set j0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final RunnableC2347oC A;
    public final RunnableC2347oC B;
    public final Handler C;
    public final ArrayList D;
    public final Map E;
    public AbstractC2764sd F;
    public C2541qC[] G;
    public int[] H;
    public final HashSet I;
    public final SparseIntArray J;
    public C2444pC K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public C0643Nw Q;
    public C0643Nw R;
    public boolean S;
    public C1031am0 T;
    public Set U;
    public int[] V;
    public int W;
    public boolean X;
    public boolean[] Y;
    public boolean[] Z;
    public long a0;
    public long b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public long g0;
    public C3271xo h0;
    public VB i0;
    public final String l;
    public final int m;
    public final C0334By n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final QB f998o;
    public final C1562g8 p;
    public final C0643Nw q;
    public final InterfaceC0428Fo r;
    public final C0350Co s;
    public final C0622Nb t;
    public final Na0 u = new Na0("Loader:HlsSampleStreamWrapper");
    public final C2613qy v;
    public final int w;
    public final C1797ie0 x;
    public final ArrayList y;
    public final List z;

    /* JADX WARN: Type inference failed for: r1v12, types: [o.oC] */
    /* JADX WARN: Type inference failed for: r1v13, types: [o.oC] */
    public C2637rC(String str, int i, C0334By c0334By, QB qb, Map map, C1562g8 c1562g8, long j, C0643Nw c0643Nw, InterfaceC0428Fo interfaceC0428Fo, C0350Co c0350Co, C0622Nb c0622Nb, C2613qy c2613qy, int i2) {
        this.l = str;
        this.m = i;
        this.n = c0334By;
        this.f998o = qb;
        this.E = map;
        this.p = c1562g8;
        this.q = c0643Nw;
        this.r = interfaceC0428Fo;
        this.s = c0350Co;
        this.t = c0622Nb;
        this.v = c2613qy;
        this.w = i2;
        C1797ie0 c1797ie0 = new C1797ie0(4);
        c1797ie0.n = null;
        c1797ie0.m = false;
        c1797ie0.f832o = null;
        this.x = c1797ie0;
        this.H = new int[0];
        Set set = j0;
        this.I = new HashSet(set.size());
        this.J = new SparseIntArray(set.size());
        this.G = new C2541qC[0];
        this.Z = new boolean[0];
        this.Y = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.y = arrayList;
        this.z = Collections.unmodifiableList(arrayList);
        this.D = new ArrayList();
        final int i3 = 0;
        this.A = new Runnable(this) { // from class: o.oC
            public final /* synthetic */ C2637rC m;

            {
                this.m = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.m.v();
                        break;
                    default:
                        C2637rC c2637rC = this.m;
                        c2637rC.N = true;
                        c2637rC.v();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.B = new Runnable(this) { // from class: o.oC
            public final /* synthetic */ C2637rC m;

            {
                this.m = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.m.v();
                        break;
                    default:
                        C2637rC c2637rC = this.m;
                        c2637rC.N = true;
                        c2637rC.v();
                        break;
                }
            }
        };
        this.C = Lr0.n(null);
        this.a0 = j;
        this.b0 = j;
    }

    public static C0921Yo g(int i, int i2) {
        AP.z();
        return new C0921Yo();
    }

    public static C0643Nw m(C0643Nw c0643Nw, C0643Nw c0643Nw2, boolean z) {
        String strE;
        String strR;
        if (c0643Nw == null) {
            return c0643Nw2;
        }
        String str = c0643Nw2.w;
        int i = IQ.i(str);
        String str2 = c0643Nw.t;
        if (Lr0.q(i, str2) == 1) {
            strR = Lr0.r(i, str2);
            strE = IQ.e(strR);
        } else {
            String strC = IQ.c(str2, str);
            strE = str;
            strR = strC;
        }
        C0617Mw c0617MwA = c0643Nw2.a();
        c0617MwA.a = c0643Nw.l;
        c0617MwA.b = c0643Nw.m;
        c0617MwA.c = c0643Nw.n;
        c0617MwA.d = c0643Nw.f421o;
        c0617MwA.e = c0643Nw.p;
        c0617MwA.f = z ? c0643Nw.q : -1;
        c0617MwA.g = z ? c0643Nw.r : -1;
        c0617MwA.h = strR;
        if (i == 2) {
            c0617MwA.p = c0643Nw.B;
            c0617MwA.q = c0643Nw.C;
            c0617MwA.r = c0643Nw.D;
        }
        if (strE != null) {
            c0617MwA.k = strE;
        }
        int i2 = c0643Nw.J;
        if (i2 != -1 && i == 1) {
            c0617MwA.x = i2;
        }
        CQ cqA = c0643Nw.u;
        if (cqA != null) {
            CQ cq = c0643Nw2.u;
            if (cq != null) {
                cqA = cq.a(cqA.l);
            }
            c0617MwA.i = cqA;
        }
        return new C0643Nw(c0617MwA);
    }

    public static int r(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // o.Ub0
    public final long A() {
        if (this.e0) {
            return Long.MIN_VALUE;
        }
        if (u()) {
            return this.b0;
        }
        long jMax = this.a0;
        VB vbQ = q();
        if (!vbQ.T) {
            ArrayList arrayList = this.y;
            vbQ = arrayList.size() > 1 ? (VB) AbstractC1701hf0.c(2, arrayList) : null;
        }
        if (vbQ != null) {
            jMax = Math.max(jMax, vbQ.s);
        }
        if (this.N) {
            for (C2541qC c2541qC : this.G) {
                jMax = Math.max(jMax, c2541qC.n());
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x026b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0277  */
    /* JADX WARN: Code duplicated, block: B:114:0x027b  */
    /* JADX WARN: Code duplicated, block: B:116:0x027e  */
    /* JADX WARN: Code duplicated, block: B:120:0x028c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0290  */
    /* JADX WARN: Code duplicated, block: B:124:0x0297  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:138:0x02be  */
    /* JADX WARN: Code duplicated, block: B:145:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:154:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:156:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:157:0x0301  */
    /* JADX WARN: Code duplicated, block: B:160:0x031a  */
    /* JADX WARN: Code duplicated, block: B:161:0x031f  */
    /* JADX WARN: Code duplicated, block: B:164:0x034d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0350  */
    /* JADX WARN: Code duplicated, block: B:167:0x0354  */
    /* JADX WARN: Code duplicated, block: B:168:0x035e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0363  */
    /* JADX WARN: Code duplicated, block: B:172:0x036e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0374 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x0376  */
    /* JADX WARN: Code duplicated, block: B:177:0x0378  */
    /* JADX WARN: Code duplicated, block: B:179:0x037b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0385  */
    /* JADX WARN: Code duplicated, block: B:183:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:184:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:186:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:189:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:191:0x03db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:199:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:202:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:205:0x0403  */
    /* JADX WARN: Code duplicated, block: B:207:0x0406 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:213:0x0413  */
    /* JADX WARN: Code duplicated, block: B:215:0x041f  */
    /* JADX WARN: Code duplicated, block: B:218:0x0445  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1 A[PHI: r1
  0x00c1: PHI (r1v18 long) = (r1v17 long), (r1v17 long), (r1v58 long) binds: [B:39:0x009e, B:41:0x00a2, B:43:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x0217  */
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
    @Override // o.Ub0
    public final boolean K(long j) {
        long jMax;
        List listEmptyList;
        long jMax2;
        int iIntValue;
        PB pb;
        AbstractC0982aC abstractC0982aC;
        ZB zb;
        String str;
        Uri uriF;
        MB mbD;
        String str2;
        Uri uriF2;
        MB mbD2;
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C0334By c0334By;
        byte[] bArr;
        byte[] bArr2;
        R60 r60;
        int i;
        boolean z7;
        byte[] bArrF;
        InterfaceC2583qj interfaceC2583qj;
        InterfaceC2583qj c1550g2;
        ZB zb2;
        C2970uj c2970uj;
        InterfaceC2583qj interfaceC2583qj2;
        boolean z8;
        int i2;
        ME me;
        Na0 na0;
        C2562qX c2562qX;
        SparseArray sparseArray;
        Oj0 oj0;
        C1797ie0 c1797ie0;
        C2970uj c2970uj2;
        boolean z9;
        boolean z10;
        Na0 na1;
        boolean z11;
        byte[] bArrF2;
        InterfaceC2583qj c1550g3;
        String str3;
        int i3;
        Object[] objArrCopyOf;
        if (!this.e0) {
            Na0 na2 = this.u;
            if (!na2.M() && !na2.F()) {
                if (u()) {
                    listEmptyList = Collections.emptyList();
                    jMax = this.b0;
                    for (C2541qC c2541qC : this.G) {
                        c2541qC.t = this.b0;
                    }
                } else {
                    VB vbQ = q();
                    jMax = vbQ.T ? vbQ.s : Math.max(this.a0, vbQ.r);
                    listEmptyList = this.z;
                }
                List list = listEmptyList;
                long j3 = jMax;
                C1797ie0 c1797ie1 = this.x;
                c1797ie1.n = null;
                c1797ie1.m = false;
                c1797ie1.f832o = null;
                boolean z12 = this.O || !list.isEmpty();
                QB qb = this.f998o;
                qb.getClass();
                VB vb = list.isEmpty() ? null : (VB) UK.t(list);
                long jMax3 = j3 - j;
                int iA = vb == null ? -1 : qb.h.a(vb.f1028o);
                long j4 = qb.s;
                long j5 = j4 != -9223372036854775807L ? j4 - j : -9223372036854775807L;
                if (vb == null || qb.q) {
                    jMax2 = j5;
                } else {
                    long j6 = vb.s - vb.r;
                    jMax3 = Math.max(0L, jMax3 - j6);
                    if (j5 != -9223372036854775807L) {
                        jMax2 = Math.max(0L, j5 - j6);
                    } else {
                        jMax2 = j5;
                    }
                }
                int i4 = iA;
                VB vb2 = vb;
                qb.r.s(j, jMax3, jMax2, list, qb.a(vb, j3));
                int i5 = qb.r.i();
                boolean z13 = i4 != i5;
                Uri[] uriArr = qb.e;
                Uri uri = uriArr[i5];
                C0683Pk c0683Pk = qb.g;
                if (c0683Pk.c(uri)) {
                    C1177cC c1177cCA = c0683Pk.a(uri, true);
                    c1177cCA.getClass();
                    qb.q = c1177cCA.c;
                    boolean z14 = c1177cCA.f710o;
                    long j7 = c1177cCA.h;
                    qb.s = z14 ? -9223372036854775807L : (c1177cCA.u + j7) - c0683Pk.y;
                    long j8 = j7 - c0683Pk.y;
                    Pair pairC = qb.c(vb2, z13, c1177cCA, j8, j3);
                    long jLongValue = ((Long) pairC.first).longValue();
                    int iIntValue2 = ((Integer) pairC.second).intValue();
                    C1177cC c1177cC = c1177cCA;
                    if (jLongValue >= c1177cC.k || vb2 == null || !z13) {
                        i4 = i5;
                        iIntValue = iIntValue2;
                    } else {
                        uri = uriArr[i4];
                        C1177cC c1177cCA2 = c0683Pk.a(uri, true);
                        c1177cCA2.getClass();
                        j8 = c1177cCA2.h - c0683Pk.y;
                        Pair pairC2 = qb.c(vb2, false, c1177cCA2, j8, j3);
                        jLongValue = ((Long) pairC2.first).longValue();
                        iIntValue = ((Integer) pairC2.second).intValue();
                        c1177cC = c1177cCA2;
                    }
                    long j9 = c1177cC.k;
                    if (jLongValue < j9) {
                        qb.f470o = new B8();
                    } else {
                        long j10 = j8;
                        int i6 = (int) (jLongValue - j9);
                        AbstractC0985aF abstractC0985aF = c1177cC.r;
                        int size = abstractC0985aF.size();
                        AbstractC0985aF abstractC0985aF2 = c1177cC.s;
                        if (i6 == size) {
                            if (iIntValue == -1) {
                                iIntValue = 0;
                            }
                            if (iIntValue < abstractC0985aF2.size()) {
                                pb = new PB((AbstractC0982aC) abstractC0985aF2.get(iIntValue), jLongValue, iIntValue);
                            } else {
                                pb = null;
                            }
                        } else {
                            ZB zb3 = (ZB) abstractC0985aF.get(i6);
                            if (iIntValue == -1) {
                                pb = new PB(zb3, jLongValue, -1);
                            } else if (iIntValue < zb3.x.size()) {
                                pb = new PB((AbstractC0982aC) zb3.x.get(iIntValue), jLongValue, iIntValue);
                            } else {
                                int i7 = i6 + 1;
                                if (i7 < abstractC0985aF.size()) {
                                    pb = new PB((AbstractC0982aC) abstractC0985aF.get(i7), jLongValue + 1, -1);
                                } else if (abstractC0985aF2.isEmpty()) {
                                    pb = null;
                                } else {
                                    pb = new PB((AbstractC0982aC) abstractC0985aF2.get(0), jLongValue + 1, 0);
                                }
                            }
                        }
                        if (pb != null) {
                            qb.t = false;
                            qb.p = null;
                            abstractC0982aC = pb.a;
                            zb = abstractC0982aC.m;
                            str = c1177cC.a;
                            if (zb != null || (str3 = zb.r) == null) {
                                uriF = null;
                            } else {
                                uriF = AbstractC3045vW.F(str, str3);
                            }
                            mbD = qb.d(uriF, i4, true);
                            c1797ie1.n = mbD;
                            if (mbD == null) {
                                str2 = abstractC0982aC.r;
                                if (str2 == null) {
                                    uriF2 = null;
                                } else {
                                    uriF2 = AbstractC3045vW.F(str, str2);
                                }
                                mbD2 = qb.d(uriF2, i4, false);
                                c1797ie1.n = mbD2;
                                if (mbD2 != null) {
                                    j2 = abstractC0982aC.p;
                                    if (vb2 == null) {
                                        AtomicInteger atomicInteger = VB.X;
                                    } else {
                                        if (uri.equals(vb2.x) || !vb2.T) {
                                            long j11 = j10 + j2;
                                            z = abstractC0982aC instanceof XB;
                                            z2 = c1177cC.c;
                                            if (z) {
                                                if (!((XB) abstractC0982aC).w || (pb.c == 0 && z2)) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                z2 = z5;
                                            }
                                            if (z2 || j11 < vb2.s) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            z4 = z3;
                                        }
                                        z6 = pb.d;
                                        if (z4 || !z6) {
                                            C0643Nw c0643Nw = qb.f[i4];
                                            int iM = qb.r.m();
                                            Object objQ = qb.r.q();
                                            boolean z15 = qb.m;
                                            c0334By = qb.j;
                                            if (uriF2 == null) {
                                                c0334By.getClass();
                                                bArr = null;
                                            } else {
                                                bArr = (byte[]) ((C0308Ay) c0334By.m).get(uriF2);
                                            }
                                            if (uriF == null) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = (byte[]) ((C0308Ay) c0334By.m).get(uriF);
                                            }
                                            AtomicInteger atomicInteger2 = VB.X;
                                            r60 = R60.r;
                                            Collections.emptyMap();
                                            Uri uriF3 = AbstractC3045vW.F(str, abstractC0982aC.l);
                                            if (z6) {
                                                i = 8;
                                            } else {
                                                i = 0;
                                            }
                                            AbstractC0397Ej.h(uriF3, "The uri must be set.");
                                            PB pb2 = pb;
                                            C2970uj c2970uj3 = new C2970uj(uriF3, 0L, 1, null, r60, abstractC0982aC.t, abstractC0982aC.u, null, i, null);
                                            if (bArr != null) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            if (z7) {
                                                String str4 = abstractC0982aC.s;
                                                str4.getClass();
                                                bArrF = VB.f(str4);
                                            } else {
                                                bArrF = null;
                                            }
                                            interfaceC2583qj = qb.b;
                                            if (bArr != null) {
                                                bArrF.getClass();
                                                c1550g2 = new C1550g2(interfaceC2583qj, bArr, bArrF);
                                            } else {
                                                c1550g2 = interfaceC2583qj;
                                            }
                                            zb2 = abstractC0982aC.m;
                                            if (zb2 != null) {
                                                if (bArr2 != null) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11) {
                                                    String str5 = zb2.s;
                                                    str5.getClass();
                                                    bArrF2 = VB.f(str5);
                                                } else {
                                                    bArrF2 = null;
                                                }
                                                Uri uriF4 = AbstractC3045vW.F(str, zb2.l);
                                                Collections.emptyMap();
                                                AbstractC0397Ej.h(uriF4, "The uri must be set.");
                                                boolean z16 = z11;
                                                c2970uj = new C2970uj(uriF4, 0L, 1, null, r60, zb2.t, zb2.u, null, 0, null);
                                                if (bArr2 != null) {
                                                    bArrF2.getClass();
                                                    c1550g3 = new C1550g2(interfaceC2583qj, bArr2, bArrF2);
                                                } else {
                                                    c1550g3 = interfaceC2583qj;
                                                }
                                                z8 = z16;
                                                interfaceC2583qj2 = c1550g3;
                                            } else {
                                                c2970uj = null;
                                                interfaceC2583qj2 = null;
                                                z8 = false;
                                            }
                                            long j12 = j10 + j2;
                                            long j13 = j12 + abstractC0982aC.n;
                                            i2 = c1177cC.j + abstractC0982aC.f674o;
                                            if (vb2 != null) {
                                                c2970uj2 = vb2.B;
                                                if (c2970uj != c2970uj2 || (c2970uj != null && c2970uj2 != null && c2970uj.a.equals(c2970uj2.a) && c2970uj.f == c2970uj2.f)) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                if (uri.equals(vb2.x) || !vb2.T) {
                                                    z10 = false;
                                                } else {
                                                    z10 = true;
                                                }
                                                if (z9 || !z10 || vb2.V || vb2.w != i2) {
                                                    na1 = null;
                                                } else {
                                                    na1 = vb2.O;
                                                }
                                                me = vb2.J;
                                                c2562qX = vb2.K;
                                                na0 = na1;
                                            } else {
                                                me = new ME(null);
                                                na0 = null;
                                                c2562qX = new C2562qX(10);
                                            }
                                            boolean z17 = !z6;
                                            sparseArray = (SparseArray) qb.d.l;
                                            oj0 = (Oj0) sparseArray.get(i2);
                                            if (oj0 == null) {
                                                oj0 = new Oj0(9223372036854775806L);
                                                sparseArray.put(i2, oj0);
                                            }
                                            c1797ie0 = 
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0483: MOVE (r0v5 'c1797ie0' o.ie0) = (r7v3 o.ie0) (LINE:1156) in method: o.rC.K(long):boolean, file: classes.dex
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v3 o.ie0
                                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                                */
                                            /*
                                                Method dump skipped, instruction units count: 1381
                                                To view this dump change 'Code comments level' option to 'DEBUG'
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: o.C2637rC.K(long):boolean");
                                        }

                                        @Override // o.Ub0
                                        public final void O(long j) {
                                            Na0 na0 = this.u;
                                            if (na0.F() || u()) {
                                                return;
                                            }
                                            boolean zM = na0.M();
                                            QB qb = this.f998o;
                                            List list = this.z;
                                            if (zM) {
                                                this.F.getClass();
                                                if (qb.f470o != null ? false : qb.r.l(j, this.F, list)) {
                                                    na0.r();
                                                    return;
                                                }
                                                return;
                                            }
                                            int size = list.size();
                                            while (size > 0 && qb.b((VB) list.get(size - 1)) == 2) {
                                                size--;
                                            }
                                            if (size < list.size()) {
                                                n(size);
                                            }
                                            int size2 = (qb.f470o != null || qb.r.length() < 2) ? list.size() : qb.r.g(j, list);
                                            if (size2 < this.y.size()) {
                                                n(size2);
                                            }
                                        }

                                        @Override // o.B90
                                        public final void a() {
                                            this.C.post(this.A);
                                        }

                                        @Override // o.Ub0
                                        public final boolean b() {
                                            return this.u.M();
                                        }

                                        @Override // o.InterfaceC1577gL
                                        public final void d() {
                                            for (C2541qC c2541qC : this.G) {
                                                c2541qC.B(true);
                                                InterfaceC3465zo interfaceC3465zo = c2541qC.h;
                                                if (interfaceC3465zo != null) {
                                                    interfaceC3465zo.d(c2541qC.e);
                                                    c2541qC.h = null;
                                                    c2541qC.g = null;
                                                }
                                            }
                                        }

                                        public final void e() {
                                            AbstractC0397Ej.f(this.O);
                                            this.T.getClass();
                                            this.U.getClass();
                                        }

                                        @Override // o.InterfaceC0354Cs
                                        public final void f() {
                                            this.f0 = true;
                                            this.C.post(this.B);
                                        }

                                        @Override // o.InterfaceC1284dL
                                        public final void h(InterfaceC1479fL interfaceC1479fL, long j, long j2, boolean z) {
                                            AbstractC2764sd abstractC2764sd = (AbstractC2764sd) interfaceC1479fL;
                                            this.F = null;
                                            long j3 = abstractC2764sd.l;
                                            Uri uri = abstractC2764sd.t.n;
                                            C0991aL c0991aL = new C0991aL();
                                            this.t.getClass();
                                            this.v.x(c0991aL, abstractC2764sd.n, this.m, abstractC2764sd.f1028o, abstractC2764sd.p, abstractC2764sd.q, abstractC2764sd.r, abstractC2764sd.s);
                                            if (z) {
                                                return;
                                            }
                                            if (u() || this.P == 0) {
                                                y();
                                            }
                                            if (this.P > 0) {
                                                this.n.e(this);
                                            }
                                        }

                                        public final C1031am0 j(Zl0[] zl0Arr) {
                                            for (int i = 0; i < zl0Arr.length; i++) {
                                                Zl0 zl0 = zl0Arr[i];
                                                C0643Nw[] c0643NwArr = new C0643Nw[zl0.l];
                                                for (int i2 = 0; i2 < zl0.l; i2++) {
                                                    C0643Nw c0643Nw = zl0.f665o[i2];
                                                    int iO = this.r.o(c0643Nw);
                                                    C0617Mw c0617MwA = c0643Nw.a();
                                                    c0617MwA.F = iO;
                                                    c0643NwArr[i2] = c0617MwA.a();
                                                }
                                                zl0Arr[i] = new Zl0(zl0.m, c0643NwArr);
                                            }
                                            return new C1031am0(zl0Arr);
                                        }

                                        @Override // o.InterfaceC1284dL
                                        public final ZK k(InterfaceC1479fL interfaceC1479fL, IOException iOException, int i) {
                                            boolean zO;
                                            ZK zk;
                                            int i2;
                                            AbstractC2764sd abstractC2764sd = (AbstractC2764sd) interfaceC1479fL;
                                            boolean z = abstractC2764sd instanceof VB;
                                            if (z && !((VB) abstractC2764sd).W && (iOException instanceof C1472fE) && ((i2 = ((C1472fE) iOException).f770o) == 410 || i2 == 404)) {
                                                return Na0.s;
                                            }
                                            long j = abstractC2764sd.t.m;
                                            Uri uri = abstractC2764sd.t.n;
                                            C0991aL c0991aL = new C0991aL();
                                            Lr0.X(abstractC2764sd.r);
                                            Lr0.X(abstractC2764sd.s);
                                            C2295nk0 c2295nk0 = new C2295nk0(i, 5, iOException);
                                            QB qb = this.f998o;
                                            YK ykO = zy0.o(qb.r);
                                            this.t.getClass();
                                            ZK zkN = C0622Nb.n(ykO, c2295nk0);
                                            if (zkN == null || zkN.a != 2) {
                                                zO = false;
                                            } else {
                                                InterfaceC1920js interfaceC1920js = qb.r;
                                                zO = interfaceC1920js.o(interfaceC1920js.u(qb.h.a(abstractC2764sd.f1028o)), zkN.b);
                                            }
                                            if (zO) {
                                                if (z && j == 0) {
                                                    ArrayList arrayList = this.y;
                                                    AbstractC0397Ej.f(((VB) arrayList.remove(arrayList.size() - 1)) == abstractC2764sd);
                                                    if (arrayList.isEmpty()) {
                                                        this.b0 = this.a0;
                                                    } else {
                                                        ((VB) UK.t(arrayList)).V = true;
                                                    }
                                                }
                                                zk = Na0.t;
                                            } else {
                                                long jW = C0622Nb.w(c2295nk0);
                                                zk = jW != -9223372036854775807L ? new ZK(0, jW, false) : Na0.u;
                                            }
                                            boolean z2 = !zk.a();
                                            this.v.C(c0991aL, abstractC2764sd.n, this.m, abstractC2764sd.f1028o, abstractC2764sd.p, abstractC2764sd.q, abstractC2764sd.r, abstractC2764sd.s, iOException, z2);
                                            if (z2) {
                                                this.F = null;
                                            }
                                            if (zO) {
                                                if (this.O) {
                                                    this.n.e(this);
                                                } else {
                                                    K(this.a0);
                                                }
                                            }
                                            return zk;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // o.InterfaceC1284dL
                                        public final void l(InterfaceC1479fL interfaceC1479fL, long j, long j2) {
                                            AbstractC2764sd abstractC2764sd = (AbstractC2764sd) interfaceC1479fL;
                                            this.F = null;
                                            QB qb = this.f998o;
                                            qb.getClass();
                                            if (abstractC2764sd instanceof MB) {
                                                MB mb = (MB) abstractC2764sd;
                                                qb.n = mb.u;
                                                Uri uri = mb.m.a;
                                                byte[] bArr = mb.w;
                                                bArr.getClass();
                                                C0334By c0334By = qb.j;
                                                c0334By.getClass();
                                                uri.getClass();
                                            }
                                            long j3 = abstractC2764sd.l;
                                            Uri uri2 = abstractC2764sd.t.n;
                                            C0991aL c0991aL = new C0991aL();
                                            this.t.getClass();
                                            this.v.A(c0991aL, abstractC2764sd.n, this.m, abstractC2764sd.f1028o, abstractC2764sd.p, abstractC2764sd.q, abstractC2764sd.r, abstractC2764sd.s);
                                            if (this.O) {
                                                this.n.e(this);
                                            } else {
                                                K(this.a0);
                                            }
                                        }

                                        public final void n(int i) {
                                            ArrayList arrayList;
                                            AbstractC0397Ej.f(!this.u.M());
                                            int i2 = i;
                                            loop0: while (true) {
                                                arrayList = this.y;
                                                if (i2 >= arrayList.size()) {
                                                    i2 = -1;
                                                    break;
                                                }
                                                int i3 = i2;
                                                while (true) {
                                                    if (i3 >= arrayList.size()) {
                                                        VB vb = (VB) arrayList.get(i2);
                                                        int i4 = 0;
                                                        while (true) {
                                                            if (i4 >= this.G.length) {
                                                                break loop0;
                                                            }
                                                            if (this.G[i4].q() > vb.g(i4)) {
                                                                break;
                                                            } else {
                                                                i4++;
                                                            }
                                                        }
                                                    } else if (((VB) arrayList.get(i3)).y) {
                                                        break;
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                                i2++;
                                            }
                                            if (i2 == -1) {
                                                return;
                                            }
                                            long j = q().s;
                                            VB vb2 = (VB) arrayList.get(i2);
                                            Lr0.P(arrayList, i2, arrayList.size());
                                            for (int i5 = 0; i5 < this.G.length; i5++) {
                                                this.G[i5].k(vb2.g(i5));
                                            }
                                            if (arrayList.isEmpty()) {
                                                this.b0 = this.a0;
                                            } else {
                                                ((VB) UK.t(arrayList)).V = true;
                                            }
                                            this.e0 = false;
                                            int i6 = this.L;
                                            long j2 = vb2.r;
                                            C2613qy c2613qy = this.v;
                                            c2613qy.getClass();
                                            c2613qy.L(new C2069lP(1, i6, null, 3, null, Lr0.X(j2), Lr0.X(j)));
                                        }

                                        @Override // o.Ub0
                                        public final long o() {
                                            if (u()) {
                                                return this.b0;
                                            }
                                            if (this.e0) {
                                                return Long.MIN_VALUE;
                                            }
                                            return q().s;
                                        }

                                        public final VB q() {
                                            return (VB) AbstractC1701hf0.c(1, this.y);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object[]] */
                                        /* JADX WARN: Type inference failed for: r2v1, types: [o.qC[]] */
                                        /* JADX WARN: Type inference failed for: r6v0 */
                                        /* JADX WARN: Type inference failed for: r6v1 */
                                        /* JADX WARN: Type inference failed for: r6v2 */
                                        /* JADX WARN: Type inference failed for: r6v3, types: [o.dm0] */
                                        /* JADX WARN: Type inference failed for: r6v4, types: [o.C90, o.qC] */
                                        /* JADX WARN: Type inference failed for: r6v5 */
                                        /* JADX WARN: Type inference failed for: r6v6 */
                                        @Override // o.InterfaceC0354Cs
                                        public final InterfaceC1324dm0 s(int i, int i2) {
                                            Integer numValueOf = Integer.valueOf(i2);
                                            Set set = j0;
                                            boolean zContains = set.contains(numValueOf);
                                            HashSet hashSet = this.I;
                                            SparseIntArray sparseIntArray = this.J;
                                            ?? c2541qC = 0;
                                            c2541qC = 0;
                                            if (zContains) {
                                                AbstractC0397Ej.c(set.contains(Integer.valueOf(i2)));
                                                int i3 = sparseIntArray.get(i2, -1);
                                                if (i3 != -1) {
                                                    if (hashSet.add(Integer.valueOf(i2))) {
                                                        this.H[i3] = i;
                                                    }
                                                    c2541qC = this.H[i3] == i ? this.G[i3] : g(i, i2);
                                                }
                                            } else {
                                                int i4 = 0;
                                                while (true) {
                                                    ?? r2 = this.G;
                                                    if (i4 >= r2.length) {
                                                        break;
                                                    }
                                                    if (this.H[i4] == i) {
                                                        c2541qC = r2[i4];
                                                        break;
                                                    }
                                                    i4++;
                                                }
                                            }
                                            if (c2541qC == 0) {
                                                if (this.f0) {
                                                    return g(i, i2);
                                                }
                                                int length = this.G.length;
                                                boolean z = i2 == 1 || i2 == 2;
                                                c2541qC = new C2541qC(this.p, this.r, this.s, this.E);
                                                c2541qC.t = this.a0;
                                                if (z) {
                                                    c2541qC.I = this.h0;
                                                    c2541qC.z = true;
                                                }
                                                long j = this.g0;
                                                if (c2541qC.F != j) {
                                                    c2541qC.F = j;
                                                    c2541qC.z = true;
                                                }
                                                VB vb = this.i0;
                                                if (vb != null) {
                                                    c2541qC.C = vb.v;
                                                }
                                                c2541qC.f = this;
                                                int i5 = length + 1;
                                                int[] iArrCopyOf = Arrays.copyOf(this.H, i5);
                                                this.H = iArrCopyOf;
                                                iArrCopyOf[length] = i;
                                                C2541qC[] c2541qCArr = this.G;
                                                int i6 = Lr0.a;
                                                ?? CopyOf = Arrays.copyOf(c2541qCArr, c2541qCArr.length + 1);
                                                CopyOf[c2541qCArr.length] = c2541qC;
                                                this.G = (C2541qC[]) CopyOf;
                                                boolean[] zArrCopyOf = Arrays.copyOf(this.Z, i5);
                                                this.Z = zArrCopyOf;
                                                zArrCopyOf[length] = z;
                                                this.X |= z;
                                                hashSet.add(Integer.valueOf(i2));
                                                sparseIntArray.append(i2, length);
                                                if (r(i2) > r(this.L)) {
                                                    this.M = length;
                                                    this.L = i2;
                                                }
                                                this.Y = Arrays.copyOf(this.Y, i5);
                                            }
                                            if (i2 != 5) {
                                                return c2541qC;
                                            }
                                            if (this.K == null) {
                                                this.K = new C2444pC(c2541qC, this.w);
                                            }
                                            return this.K;
                                        }

                                        public final boolean u() {
                                            return this.b0 != -9223372036854775807L;
                                        }

                                        public final void v() {
                                            if (!this.S && this.V == null && this.N) {
                                                for (C2541qC c2541qC : this.G) {
                                                    if (c2541qC.t() == null) {
                                                        return;
                                                    }
                                                }
                                                C1031am0 c1031am0 = this.T;
                                                if (c1031am0 != null) {
                                                    int i = c1031am0.l;
                                                    int[] iArr = new int[i];
                                                    this.V = iArr;
                                                    Arrays.fill(iArr, -1);
                                                    for (int i2 = 0; i2 < i; i2++) {
                                                        int i3 = 0;
                                                        while (true) {
                                                            C2541qC[] c2541qCArr = this.G;
                                                            if (i3 >= c2541qCArr.length) {
                                                                break;
                                                            }
                                                            C0643Nw c0643NwT = c2541qCArr[i3].t();
                                                            AbstractC0397Ej.g(c0643NwT);
                                                            C0643Nw c0643Nw = this.T.a(i2).f665o[0];
                                                            String str = c0643Nw.w;
                                                            String str2 = c0643NwT.w;
                                                            int i4 = IQ.i(str2);
                                                            if (i4 != 3) {
                                                                if (i4 == IQ.i(str)) {
                                                                    this.V[i2] = i3;
                                                                    break;
                                                                }
                                                                i3++;
                                                            } else {
                                                                if (Lr0.a(str2, str) && (!("application/cea-608".equals(str2) || "application/cea-708".equals(str2)) || c0643NwT.O == c0643Nw.O)) {
                                                                    this.V[i2] = i3;
                                                                    break;
                                                                    break;
                                                                }
                                                                i3++;
                                                            }
                                                        }
                                                    }
                                                    Iterator it = this.D.iterator();
                                                    while (it.hasNext()) {
                                                        ((C2250nC) it.next()).b();
                                                    }
                                                    return;
                                                }
                                                int length = this.G.length;
                                                int i5 = 0;
                                                int i6 = -2;
                                                int i7 = -1;
                                                while (true) {
                                                    int i8 = 2;
                                                    if (i5 >= length) {
                                                        break;
                                                    }
                                                    C0643Nw c0643NwT2 = this.G[i5].t();
                                                    AbstractC0397Ej.g(c0643NwT2);
                                                    String str3 = c0643NwT2.w;
                                                    if (!IQ.m(str3)) {
                                                        i8 = IQ.k(str3) ? 1 : IQ.l(str3) ? 3 : -2;
                                                    }
                                                    if (r(i8) > r(i6)) {
                                                        i7 = i5;
                                                        i6 = i8;
                                                    } else if (i8 == i6 && i7 != -1) {
                                                        i7 = -1;
                                                    }
                                                    i5++;
                                                }
                                                Zl0 zl0 = this.f998o.h;
                                                int i9 = zl0.l;
                                                this.W = -1;
                                                this.V = new int[length];
                                                for (int i10 = 0; i10 < length; i10++) {
                                                    this.V[i10] = i10;
                                                }
                                                Zl0[] zl0Arr = new Zl0[length];
                                                int i11 = 0;
                                                while (i11 < length) {
                                                    C0643Nw c0643NwT3 = this.G[i11].t();
                                                    AbstractC0397Ej.g(c0643NwT3);
                                                    String str4 = this.l;
                                                    C0643Nw c0643Nw2 = this.q;
                                                    if (i11 == i7) {
                                                        C0643Nw[] c0643NwArr = new C0643Nw[i9];
                                                        for (int i12 = 0; i12 < i9; i12++) {
                                                            C0643Nw c0643NwD = zl0.f665o[i12];
                                                            if (i6 == 1 && c0643Nw2 != null) {
                                                                c0643NwD = c0643NwD.d(c0643Nw2);
                                                            }
                                                            c0643NwArr[i12] = i9 == 1 ? c0643NwT3.d(c0643NwD) : m(c0643NwD, c0643NwT3, true);
                                                        }
                                                        zl0Arr[i11] = new Zl0(str4, c0643NwArr);
                                                        this.W = i11;
                                                    } else {
                                                        if (i6 != 2 || !IQ.k(c0643NwT3.w)) {
                                                            c0643Nw2 = null;
                                                        }
                                                        StringBuilder sbS = AbstractC1674hK.s(str4, ":muxed:");
                                                        sbS.append(i11 < i7 ? i11 : i11 - 1);
                                                        zl0Arr[i11] = new Zl0(sbS.toString(), m(c0643Nw2, c0643NwT3, false));
                                                    }
                                                    i11++;
                                                }
                                                this.T = j(zl0Arr);
                                                AbstractC0397Ej.f(this.U == null);
                                                this.U = Collections.emptySet();
                                                this.O = true;
                                                this.n.x();
                                            }
                                        }

                                        public final void w() throws IOException {
                                            this.u.a();
                                            QB qb = this.f998o;
                                            B8 b8 = qb.f470o;
                                            if (b8 != null) {
                                                throw b8;
                                            }
                                            Uri uri = qb.p;
                                            if (uri == null || !qb.t) {
                                                return;
                                            }
                                            C0657Ok c0657Ok = (C0657Ok) qb.g.f461o.get(uri);
                                            c0657Ok.m.a();
                                            IOException iOException = c0657Ok.u;
                                            if (iOException != null) {
                                                throw iOException;
                                            }
                                        }

                                        public final void x(Zl0[] zl0Arr, int... iArr) {
                                            this.T = j(zl0Arr);
                                            this.U = new HashSet();
                                            for (int i : iArr) {
                                                this.U.add(this.T.a(i));
                                            }
                                            this.W = 0;
                                            Handler handler = this.C;
                                            C0334By c0334By = this.n;
                                            Objects.requireNonNull(c0334By);
                                            handler.post(new Jj0(20, c0334By));
                                            this.O = true;
                                        }

                                        public final void y() {
                                            for (C2541qC c2541qC : this.G) {
                                                c2541qC.B(this.c0);
                                            }
                                            this.c0 = false;
                                        }

                                        public final boolean z(long j, boolean z) {
                                            this.a0 = j;
                                            if (u()) {
                                                this.b0 = j;
                                                return true;
                                            }
                                            if (this.N && !z) {
                                                int length = this.G.length;
                                                for (int i = 0; i < length; i++) {
                                                    if (this.G[i].E(j, false) || (!this.Z[i] && this.X)) {
                                                    }
                                                }
                                                return false;
                                            }
                                            this.b0 = j;
                                            this.e0 = false;
                                            this.y.clear();
                                            Na0 na0 = this.u;
                                            if (na0.M()) {
                                                if (this.N) {
                                                    for (C2541qC c2541qC : this.G) {
                                                        c2541qC.i();
                                                    }
                                                }
                                                na0.r();
                                            } else {
                                                na0.f414o = null;
                                                y();
                                            }
                                            return true;
                                        }

                                        @Override // o.InterfaceC0354Cs
                                        public final void i(InterfaceC2664rb0 interfaceC2664rb0) {
                                        }
                                    }
