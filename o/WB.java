package o;

import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class WB implements InterfaceC2941uP, InterfaceC2056lC {
    public final C3436zZ A;
    public final C0334By B = new C0334By(3, this);
    public final long C;
    public InterfaceC2844tP D;
    public int E;
    public C1031am0 F;
    public C2637rC[] G;
    public C2637rC[] H;
    public int I;
    public C2133m1 J;
    public final UB l;
    public final C0683Pk m;
    public final C2681rk n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC2590qm0 f589o;
    public final InterfaceC0428Fo p;
    public final C0350Co q;
    public final C0622Nb r;
    public final C2613qy s;
    public final C1562g8 t;
    public final IdentityHashMap u;
    public final L80 v;
    public final C0622Nb w;
    public final boolean x;
    public final int y;
    public final boolean z;

    public WB(UB ub, C0683Pk c0683Pk, C2681rk c2681rk, InterfaceC2590qm0 interfaceC2590qm0, InterfaceC0428Fo interfaceC0428Fo, C0350Co c0350Co, C0622Nb c0622Nb, C2613qy c2613qy, C1562g8 c1562g8, C0622Nb c0622Nb2, boolean z, int i, boolean z2, C3436zZ c3436zZ, long j) {
        this.l = ub;
        this.m = c0683Pk;
        this.n = c2681rk;
        this.f589o = interfaceC2590qm0;
        this.p = interfaceC0428Fo;
        this.q = c0350Co;
        this.r = c0622Nb;
        this.s = c2613qy;
        this.t = c1562g8;
        this.w = c0622Nb2;
        this.x = z;
        this.y = i;
        this.z = z2;
        this.A = c3436zZ;
        this.C = j;
        c0622Nb2.getClass();
        this.J = new C2133m1(10, new Ub0[0]);
        this.u = new IdentityHashMap();
        this.v = new L80(11);
        this.G = new C2637rC[0];
        this.H = new C2637rC[0];
    }

    public static C0643Nw f(C0643Nw c0643Nw, C0643Nw c0643Nw2, boolean z) {
        String strR;
        CQ cq;
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        if (c0643Nw2 != null) {
            strR = c0643Nw2.t;
            cq = c0643Nw2.u;
            i2 = c0643Nw2.J;
            i = c0643Nw2.f421o;
            i3 = c0643Nw2.p;
            str = c0643Nw2.n;
            str2 = c0643Nw2.m;
        } else {
            strR = Lr0.r(1, c0643Nw.t);
            cq = c0643Nw.u;
            if (z) {
                i2 = c0643Nw.J;
                i = c0643Nw.f421o;
                i3 = c0643Nw.p;
                str = c0643Nw.n;
                str2 = c0643Nw.m;
            } else {
                i = 0;
                str = null;
                str2 = null;
                i2 = -1;
                i3 = 0;
            }
        }
        String strE = IQ.e(strR);
        int i4 = z ? c0643Nw.q : -1;
        int i5 = z ? c0643Nw.r : -1;
        C0617Mw c0617Mw = new C0617Mw();
        c0617Mw.a = c0643Nw.l;
        c0617Mw.b = str2;
        c0617Mw.j = c0643Nw.v;
        c0617Mw.k = strE;
        c0617Mw.h = strR;
        c0617Mw.i = cq;
        c0617Mw.f = i4;
        c0617Mw.g = i5;
        c0617Mw.x = i2;
        c0617Mw.d = i;
        c0617Mw.e = i3;
        c0617Mw.c = str;
        return new C0643Nw(c0617Mw);
    }

    @Override // o.Ub0
    public final long A() {
        return this.J.A();
    }

    @Override // o.InterfaceC2941uP
    public final void B() throws IOException {
        for (C2637rC c2637rC : this.G) {
            c2637rC.w();
            if (c2637rC.e0 && !c2637rC.O) {
                throw C2949uX.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // o.InterfaceC2941uP
    public final void E(long j, boolean z) {
        for (C2637rC c2637rC : this.H) {
            if (c2637rC.N && !c2637rC.u()) {
                int length = c2637rC.G.length;
                for (int i = 0; i < length; i++) {
                    c2637rC.G[i].h(j, z, c2637rC.Y[i]);
                }
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 8341. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // o.InterfaceC2941uP
    public final long F(o.InterfaceC1920js[] r38, boolean[] r39, o.D90[] r40, boolean[] r41, long r42) {
        /*
            Method dump skipped, instruction units count: 834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WB.F(o.js[], boolean[], o.D90[], boolean[], long):long");
    }

    @Override // o.InterfaceC2941uP
    public final long I(long j) {
        C2637rC[] c2637rCArr = this.H;
        if (c2637rCArr.length > 0) {
            boolean z = c2637rCArr[0].z(j, false);
            int i = 1;
            while (true) {
                C2637rC[] c2637rCArr2 = this.H;
                if (i >= c2637rCArr2.length) {
                    break;
                }
                c2637rCArr2[i].z(j, z);
                i++;
            }
            if (z) {
                ((SparseArray) this.v.l).clear();
            }
        }
        return j;
    }

    @Override // o.Ub0
    public final boolean K(long j) {
        if (this.F != null) {
            return this.J.K(j);
        }
        for (C2637rC c2637rC : this.G) {
            if (!c2637rC.O) {
                c2637rC.K(c2637rC.a0);
            }
        }
        return false;
    }

    @Override // o.InterfaceC2941uP
    public final long L(long j, C2761sb0 c2761sb0) {
        for (C2637rC c2637rC : this.H) {
            if (c2637rC.L == 2) {
                QB qb = c2637rC.f998o;
                int iN = qb.r.n();
                Uri[] uriArr = qb.e;
                int length = uriArr.length;
                C0683Pk c0683Pk = qb.g;
                C1177cC c1177cCA = (iN >= length || iN == -1) ? null : c0683Pk.a(uriArr[qb.r.i()], true);
                if (c1177cCA == null) {
                    break;
                }
                AbstractC0985aF abstractC0985aF = c1177cCA.r;
                if (abstractC0985aF.isEmpty() || !c1177cCA.c) {
                    break;
                    break;
                }
                long j2 = c1177cCA.h - c0683Pk.y;
                long j3 = j - j2;
                int iC = Lr0.c(abstractC0985aF, Long.valueOf(j3), true);
                long j4 = ((ZB) abstractC0985aF.get(iC)).p;
                return c2761sb0.a(j3, j4, iC != abstractC0985aF.size() - 1 ? ((ZB) abstractC0985aF.get(iC + 1)).p : j4) + j2;
            }
        }
        return j;
    }

    @Override // o.Ub0
    public final void O(long j) {
        this.J.O(j);
    }

    @Override // o.InterfaceC2056lC
    public final void a() {
        for (C2637rC c2637rC : this.G) {
            ArrayList arrayList = c2637rC.y;
            if (!arrayList.isEmpty()) {
                VB vb = (VB) UK.t(arrayList);
                int iB = c2637rC.f998o.b(vb);
                if (iB == 1) {
                    vb.W = true;
                } else if (iB == 2 && !c2637rC.e0) {
                    Na0 na0 = c2637rC.u;
                    if (na0.M()) {
                        na0.r();
                    }
                }
            }
        }
        this.D.e(this);
    }

    @Override // o.Ub0
    public final boolean b() {
        return this.J.b();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0225 A[LOOP:5: B:99:0x021f->B:101:0x0225, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:103:0x0243  */
    /* JADX WARN: Code duplicated, block: B:105:0x024b A[LOOP:6: B:104:0x0249->B:105:0x024b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:58:0x010e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    /* JADX WARN: Code duplicated, block: B:81:0x0162  */
    /* JADX WARN: Code duplicated, block: B:87:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a4 A[LOOP:4: B:88:0x01a2->B:89:0x01a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x021e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Object, o.WB] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map] */
    @Override // o.InterfaceC2941uP
    public final void c(InterfaceC2844tP interfaceC2844tP, long j) {
        ?? EmptyMap;
        List list;
        boolean z;
        ?? r21;
        ArrayList arrayList;
        List list2;
        HashSet hashSet;
        int i;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        Uri[] uriArr;
        C0643Nw[] c0643NwArr;
        int[] iArr;
        int i4;
        int i5;
        int iQ;
        int iQ2;
        int i6;
        ?? r22;
        C2637rC c2637rCE;
        ArrayList arrayList2;
        C0643Nw c0643Nw;
        C0643Nw[] c0643NwArr2;
        int i7;
        C0643Nw[] c0643NwArr3;
        int i8;
        List list3;
        int i9;
        boolean z4;
        int i10;
        int i11;
        this.D = interfaceC2844tP;
        C0683Pk c0683Pk = this.m;
        c0683Pk.getClass();
        c0683Pk.p.add(this);
        C1568gC c1568gC = c0683Pk.u;
        c1568gC.getClass();
        if (this.z) {
            List list4 = c1568gC.k;
            ArrayList arrayList3 = new ArrayList(list4);
            EmptyMap = new HashMap();
            int i12 = 0;
            while (i12 < arrayList3.size()) {
                C3271xo c3271xo = (C3271xo) list4.get(i12);
                String str = c3271xo.n;
                i12++;
                int i13 = i12;
                while (i13 < arrayList3.size()) {
                    C3271xo c3271xo2 = (C3271xo) arrayList3.get(i13);
                    if (TextUtils.equals(c3271xo2.n, str)) {
                        String str2 = c3271xo.n;
                        String str3 = c3271xo2.n;
                        AbstractC0397Ej.f(str2 == null || str3 == null || TextUtils.equals(str2, str3));
                        if (str2 == null) {
                            str2 = str3;
                        }
                        int i14 = Lr0.a;
                        C3174wo[] c3174woArr = c3271xo.l;
                        int length = c3174woArr.length;
                        C3174wo[] c3174woArr2 = c3271xo2.l;
                        Object[] objArrCopyOf = Arrays.copyOf(c3174woArr, length + c3174woArr2.length);
                        System.arraycopy(c3174woArr2, 0, objArrCopyOf, c3174woArr.length, c3174woArr2.length);
                        c3271xo = new C3271xo(str2, true, (C3174wo[]) objArrCopyOf);
                        arrayList3.remove(i13);
                    } else {
                        i13++;
                    }
                }
                EmptyMap.put(str, c3271xo);
            }
        } else {
            EmptyMap = Collections.emptyMap();
        }
        ?? r14 = EmptyMap;
        List list5 = c1568gC.e;
        boolean z5 = !list5.isEmpty();
        this.E = 0;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        boolean z6 = this.x;
        List list6 = c1568gC.f;
        if (z5) {
            int size = list5.size();
            int[] iArr2 = new int[size];
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i15 < list5.size()) {
                C0643Nw c0643Nw2 = ((C1470fC) list5.get(i15)).b;
                if (c0643Nw2.C <= 0) {
                    String str4 = c0643Nw2.t;
                    if (Lr0.r(2, str4) != null) {
                        i11 = 1;
                        iArr2[i15] = 2;
                        i16++;
                    } else {
                        i11 = 1;
                        if (Lr0.r(1, str4) != null) {
                            iArr2[i15] = 1;
                            i17++;
                        } else {
                            iArr2[i15] = -1;
                        }
                    }
                } else {
                    i11 = 1;
                    iArr2[i15] = 2;
                    i16++;
                }
                i15 += i11;
            }
            if (i16 > 0) {
                i3 = i16;
                z2 = true;
            } else {
                if (i17 < size) {
                    i3 = size - i17;
                    z2 = false;
                    z3 = true;
                } else {
                    i3 = size;
                    z2 = false;
                }
                uriArr = new Uri[i3];
                c0643NwArr = new C0643Nw[i3];
                iArr = new int[i3];
                i4 = 0;
                i5 = 0;
                while (i4 < list5.size()) {
                    if (z2) {
                        z4 = z6;
                        if (iArr2[i4] == 2) {
                        }
                        i10 = 1;
                        i4 += i10;
                        z6 = z4;
                    } else {
                        z4 = z6;
                    }
                    if (z3 || iArr2[i4] != 1) {
                        C1470fC c1470fC = (C1470fC) list5.get(i4);
                        uriArr[i5] = c1470fC.a;
                        c0643NwArr[i5] = c1470fC.b;
                        i10 = 1;
                        iArr[i5] = i4;
                        i5++;
                    } else {
                        i10 = 1;
                    }
                    i4 += i10;
                    z6 = z4;
                }
                boolean z7 = z6;
                String str5 = c0643NwArr[0].t;
                iQ = Lr0.q(2, str5);
                iQ2 = Lr0.q(1, str5);
                boolean z8 = (iQ2 != 1 || (iQ2 == 0 && list6.isEmpty())) && iQ <= 1 && iQ2 + iQ > 0;
                if (!z2 || iQ2 <= 0) {
                    i6 = 0;
                } else {
                    i6 = 1;
                }
                list = list6;
                r22 = r14;
                arrayList = arrayList5;
                z = z7;
                c2637rCE = e("main", i6, uriArr, c0643NwArr, c1568gC.h, c1568gC.i, r14, j);
                arrayList4.add(c2637rCE);
                arrayList.add(iArr);
                r21 = r22;
                r21 = r22;
                if (z && z8) {
                    arrayList2 = new ArrayList();
                    c0643Nw = c1568gC.h;
                    if (iQ > 0) {
                        c0643NwArr3 = new C0643Nw[i3];
                        for (i8 = 0; i8 < i3; i8++) {
                            C0643Nw c0643Nw3 = c0643NwArr[i8];
                            String strR = Lr0.r(2, c0643Nw3.t);
                            String strE = IQ.e(strR);
                            C0617Mw c0617Mw = new C0617Mw();
                            c0617Mw.a = c0643Nw3.l;
                            c0617Mw.b = c0643Nw3.m;
                            c0617Mw.j = c0643Nw3.v;
                            c0617Mw.k = strE;
                            c0617Mw.h = strR;
                            c0617Mw.i = c0643Nw3.u;
                            c0617Mw.f = c0643Nw3.q;
                            c0617Mw.g = c0643Nw3.r;
                            c0617Mw.p = c0643Nw3.B;
                            c0617Mw.q = c0643Nw3.C;
                            c0617Mw.r = c0643Nw3.D;
                            c0617Mw.d = c0643Nw3.f421o;
                            c0617Mw.e = c0643Nw3.p;
                            c0643NwArr3[i8] = new C0643Nw(c0617Mw);
                        }
                        arrayList2.add(new Zl0("main", c0643NwArr3));
                        if (iQ2 > 0 && (c0643Nw != null || list.isEmpty())) {
                            arrayList2.add(new Zl0("main:audio", f(c0643NwArr[0], c0643Nw, false)));
                        }
                        list3 = c1568gC.i;
                        if (list3 != null) {
                            for (i9 = 0; i9 < list3.size(); i9++) {
                                arrayList2.add(new Zl0(AbstractC1674hK.n(i9, "main:cc:"), (C0643Nw) list3.get(i9)));
                            }
                        }
                    } else {
                        c0643NwArr2 = new C0643Nw[i3];
                        for (i7 = 0; i7 < i3; i7++) {
                            c0643NwArr2[i7] = f(c0643NwArr[i7], c0643Nw, true);
                        }
                        arrayList2.add(new Zl0("main", c0643NwArr2));
                    }
                    C0617Mw c0617Mw2 = new C0617Mw();
                    c0617Mw2.a = "ID3";
                    c0617Mw2.k = "application/id3";
                    Zl0 zl0 = new Zl0("main:id3", new C0643Nw(c0617Mw2));
                    arrayList2.add(zl0);
                    c2637rCE.x((Zl0[]) arrayList2.toArray(new Zl0[0]), arrayList2.indexOf(zl0));
                    r21 = r22;
                }
            }
            z3 = false;
            uriArr = new Uri[i3];
            c0643NwArr = new C0643Nw[i3];
            iArr = new int[i3];
            i4 = 0;
            i5 = 0;
            while (i4 < list5.size()) {
                if (z2) {
                    z4 = z6;
                    if (iArr2[i4] == 2) {
                    }
                    i10 = 1;
                    i4 += i10;
                    z6 = z4;
                } else {
                    z4 = z6;
                }
                if (z3) {
                }
                C1470fC c1470fC2 = (C1470fC) list5.get(i4);
                uriArr[i5] = c1470fC2.a;
                c0643NwArr[i5] = c1470fC2.b;
                i10 = 1;
                iArr[i5] = i4;
                i5++;
                i4 += i10;
                z6 = z4;
            }
            boolean z9 = z6;
            String str6 = c0643NwArr[0].t;
            iQ = Lr0.q(2, str6);
            iQ2 = Lr0.q(1, str6);
            if (iQ2 != 1) {
            }
            if (z2) {
                i6 = 0;
            } else {
                i6 = 0;
            }
            list = list6;
            r22 = r14;
            arrayList = arrayList5;
            z = z9;
            c2637rCE = e("main", i6, uriArr, c0643NwArr, c1568gC.h, c1568gC.i, r14, j);
            arrayList4.add(c2637rCE);
            arrayList.add(iArr);
            r21 = r22;
            r21 = r22;
            if (z) {
                arrayList2 = new ArrayList();
                c0643Nw = c1568gC.h;
                if (iQ > 0) {
                    c0643NwArr3 = new C0643Nw[i3];
                    while (i8 < i3) {
                        C0643Nw c0643Nw4 = c0643NwArr[i8];
                        String strR2 = Lr0.r(2, c0643Nw4.t);
                        String strE2 = IQ.e(strR2);
                        C0617Mw c0617Mw3 = new C0617Mw();
                        c0617Mw3.a = c0643Nw4.l;
                        c0617Mw3.b = c0643Nw4.m;
                        c0617Mw3.j = c0643Nw4.v;
                        c0617Mw3.k = strE2;
                        c0617Mw3.h = strR2;
                        c0617Mw3.i = c0643Nw4.u;
                        c0617Mw3.f = c0643Nw4.q;
                        c0617Mw3.g = c0643Nw4.r;
                        c0617Mw3.p = c0643Nw4.B;
                        c0617Mw3.q = c0643Nw4.C;
                        c0617Mw3.r = c0643Nw4.D;
                        c0617Mw3.d = c0643Nw4.f421o;
                        c0617Mw3.e = c0643Nw4.p;
                        c0643NwArr3[i8] = new C0643Nw(c0617Mw3);
                    }
                    arrayList2.add(new Zl0("main", c0643NwArr3));
                    if (iQ2 > 0) {
                        arrayList2.add(new Zl0("main:audio", f(c0643NwArr[0], c0643Nw, false)));
                    }
                    list3 = c1568gC.i;
                    if (list3 != null) {
                        while (i9 < list3.size()) {
                            arrayList2.add(new Zl0(AbstractC1674hK.n(i9, "main:cc:"), (C0643Nw) list3.get(i9)));
                        }
                    }
                } else {
                    c0643NwArr2 = new C0643Nw[i3];
                    while (i7 < i3) {
                        c0643NwArr2[i7] = f(c0643NwArr[i7], c0643Nw, true);
                    }
                    arrayList2.add(new Zl0("main", c0643NwArr2));
                }
                C0617Mw c0617Mw4 = new C0617Mw();
                c0617Mw4.a = "ID3";
                c0617Mw4.k = "application/id3";
                Zl0 zl1 = new Zl0("main:id3", new C0643Nw(c0617Mw4));
                arrayList2.add(zl1);
                c2637rCE.x((Zl0[]) arrayList2.toArray(new Zl0[0]), arrayList2.indexOf(zl1));
                r21 = r22;
            }
        } else {
            list = list6;
            z = z6;
            r21 = r14;
            arrayList = arrayList5;
        }
        ArrayList arrayList6 = new ArrayList(list.size());
        ArrayList arrayList7 = new ArrayList(list.size());
        ArrayList arrayList8 = new ArrayList(list.size());
        HashSet hashSet2 = new HashSet();
        int i18 = 0;
        while (i18 < list.size()) {
            List list7 = list;
            String str7 = ((C1372eC) list7.get(i18)).c;
            if (hashSet2.add(str7)) {
                arrayList6.clear();
                arrayList7.clear();
                arrayList8.clear();
                int i19 = 0;
                boolean z10 = true;
                while (i19 < list7.size()) {
                    if (Lr0.a(str7, ((C1372eC) list7.get(i19)).c)) {
                        C1372eC c1372eC = (C1372eC) list7.get(i19);
                        arrayList8.add(Integer.valueOf(i19));
                        arrayList6.add(c1372eC.a);
                        C0643Nw c0643Nw5 = c1372eC.b;
                        arrayList7.add(c0643Nw5);
                        i2 = 1;
                        z10 &= Lr0.q(1, c0643Nw5.t) == 1;
                    } else {
                        i2 = 1;
                    }
                    i19 += i2;
                }
                String strT = AbstractC1701hf0.t("audio:", str7);
                int i20 = Lr0.a;
                list2 = list7;
                hashSet = hashSet2;
                i = i18;
                C2637rC c2637rCE2 = e(strT, 1, (Uri[]) arrayList6.toArray(new Uri[0]), (C0643Nw[]) arrayList7.toArray(new C0643Nw[0]), null, Collections.emptyList(), r21, j);
                arrayList.add(Pu0.v(arrayList8));
                arrayList4.add(c2637rCE2);
                if (z && z10) {
                    c2637rCE2.x(new Zl0[]{new Zl0(strT, (C0643Nw[]) arrayList7.toArray(new C0643Nw[0]))}, new int[0]);
                }
                i18 = i + 1;
                hashSet2 = hashSet;
                list = list2;
            } else {
                list2 = list7;
                hashSet = hashSet2;
                i = i18;
            }
            i18 = i + 1;
            hashSet2 = hashSet;
            list = list2;
        }
        this.I = arrayList4.size();
        int i21 = 0;
        while (true) {
            List list8 = c1568gC.g;
            if (i21 >= list8.size()) {
                break;
            }
            C1372eC c1372eC2 = (C1372eC) list8.get(i21);
            StringBuilder sbR = AbstractC1674hK.r("subtitle:", i21, ":");
            sbR.append(c1372eC2.c);
            String string = sbR.toString();
            Uri[] uriArr2 = {c1372eC2.a};
            C0643Nw c0643Nw6 = c1372eC2.b;
            C2637rC c2637rCE3 = e(string, 3, uriArr2, new C0643Nw[]{c0643Nw6}, null, Collections.emptyList(), r21, j);
            arrayList.add(new int[]{i21});
            arrayList4.add(c2637rCE3);
            c2637rCE3.x(new Zl0[]{new Zl0(string, c0643Nw6)}, new int[0]);
            i21++;
        }
        this.G = (C2637rC[]) arrayList4.toArray(new C2637rC[0]);
        this.E = this.G.length;
        for (int i22 = 0; i22 < this.I; i22++) {
            this.G[i22].f998o.m = true;
        }
        for (C2637rC c2637rC : this.G) {
            if (!c2637rC.O) {
                c2637rC.K(c2637rC.a0);
            }
        }
        this.H = this.G;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052 A[LOOP:1: B:17:0x0043->B:22:0x0052, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:41:0x0096  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0056 A[EDGE_INSN: B:56:0x0056->B:24:0x0056 BREAK  A[LOOP:1: B:17:0x0043->B:22:0x0052], SYNTHETIC] */
    @Override // o.InterfaceC2056lC
    public final boolean d(Uri uri, C2295nk0 c2295nk0, boolean z) {
        long j;
        int i;
        Uri[] uriArr;
        int iU;
        boolean z2;
        C0657Ok c0657Ok;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        for (C2637rC c2637rC : this.G) {
            QB qb = c2637rC.f998o;
            if (Lr0.l(qb.e, uri)) {
                if (!z) {
                    YK ykO = zy0.o(qb.r);
                    c2637rC.t.getClass();
                    ZK zkN = C0622Nb.n(ykO, c2295nk0);
                    if (zkN != null && zkN.a == 2) {
                        j = zkN.b;
                    }
                    i = 0;
                    while (true) {
                        uriArr = qb.e;
                        if (i < uriArr.length) {
                            i = -1;
                            break;
                        }
                        if (uriArr[i].equals(uri)) {
                            break;
                        }
                        i++;
                    }
                    if (i == -1 && (iU = qb.r.u(i)) != -1) {
                        qb.t |= uri.equals(qb.p);
                        if (j == -9223372036854775807L) {
                            if (!qb.r.o(iU, j)) {
                                c0657Ok = (C0657Ok) qb.g.f461o.get(uri);
                                if (c0657Ok != null) {
                                    z3 = !C0657Ok.a(c0657Ok, j);
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                }
                            }
                            z2 = false;
                        }
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (z2 || j == -9223372036854775807L) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                }
                j = -9223372036854775807L;
                i = 0;
                while (true) {
                    uriArr = qb.e;
                    if (i < uriArr.length) {
                        i = -1;
                        break;
                    }
                    if (uriArr[i].equals(uri)) {
                        break;
                        break;
                    }
                    i++;
                }
                if (i == -1) {
                    z2 = true;
                } else {
                    qb.t |= uri.equals(qb.p);
                    if (j == -9223372036854775807L) {
                        if (!qb.r.o(iU, j)) {
                            c0657Ok = (C0657Ok) qb.g.f461o.get(uri);
                            if (c0657Ok != null) {
                                z3 = !C0657Ok.a(c0657Ok, j);
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                            }
                        }
                        z2 = false;
                    }
                    z2 = true;
                }
                if (z2) {
                    z4 = false;
                } else {
                    z4 = false;
                }
            } else {
                z4 = true;
            }
            z5 &= z4;
        }
        this.D.e(this);
        return z5;
    }

    public final C2637rC e(String str, int i, Uri[] uriArr, C0643Nw[] c0643NwArr, C0643Nw c0643Nw, List list, Map map, long j) {
        return new C2637rC(str, i, this.B, new QB(this.l, this.m, uriArr, c0643NwArr, this.n, this.f589o, this.v, this.C, list, this.A), map, this.t, j, c0643Nw, this.p, this.q, this.r, this.s, this.y);
    }

    @Override // o.Ub0
    public final long o() {
        return this.J.o();
    }

    @Override // o.InterfaceC2941uP
    public final long p() {
        return -9223372036854775807L;
    }

    @Override // o.InterfaceC2941uP
    public final C1031am0 t() {
        C1031am0 c1031am0 = this.F;
        c1031am0.getClass();
        return c1031am0;
    }
}
