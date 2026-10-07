package o;

import android.net.Uri;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class QB {
    public final UB a;
    public final InterfaceC2583qj b;
    public final InterfaceC2583qj c;
    public final L80 d;
    public final Uri[] e;
    public final C0643Nw[] f;
    public final C0683Pk g;
    public final Zl0 h;
    public final List i;
    public final C3436zZ k;
    public final long l;
    public boolean m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public B8 f470o;
    public Uri p;
    public boolean q;
    public InterfaceC1920js r;
    public boolean t;
    public final C0334By j = new C0334By(0);
    public byte[] n = Lr0.e;
    public long s = -9223372036854775807L;

    public QB(UB ub, C0683Pk c0683Pk, Uri[] uriArr, C0643Nw[] c0643NwArr, C2681rk c2681rk, InterfaceC2590qm0 interfaceC2590qm0, L80 l80, long j, List list, C3436zZ c3436zZ) {
        this.a = ub;
        this.g = c0683Pk;
        this.e = uriArr;
        this.f = c0643NwArr;
        this.d = l80;
        this.l = j;
        this.i = list;
        this.k = c3436zZ;
        InterfaceC2583qj interfaceC2583qjH = c2681rk.a.H();
        this.b = interfaceC2583qjH;
        if (interfaceC2590qm0 != null) {
            interfaceC2583qjH.k(interfaceC2590qm0);
        }
        this.c = c2681rk.a.H();
        this.h = new Zl0("", c0643NwArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((c0643NwArr[i].p & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        Zl0 zl0 = this.h;
        int[] iArrV = Pu0.v(arrayList);
        OB ob = new OB(zl0, iArrV);
        ob.g = ob.a(zl0.f665o[iArrV[0]]);
        this.r = ob;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00df  */
    public final InterfaceC2940uO[] a(VB vb, long j) {
        int i;
        List listUnmodifiableList;
        int iA = vb == null ? -1 : this.h.a(vb.f1028o);
        int length = this.r.length();
        InterfaceC2940uO[] interfaceC2940uOArr = new InterfaceC2940uO[length];
        boolean z = false;
        int i2 = 0;
        while (i2 < length) {
            int iF = this.r.f(i2);
            Uri uri = this.e[iF];
            C0683Pk c0683Pk = this.g;
            if (c0683Pk.c(uri)) {
                C1177cC c1177cCA = c0683Pk.a(uri, z);
                c1177cCA.getClass();
                long j2 = c1177cCA.h - c0683Pk.y;
                i = i2;
                Pair pairC = c(vb, iF != iA, c1177cCA, j2, j);
                long jLongValue = ((Long) pairC.first).longValue();
                int iIntValue = ((Integer) pairC.second).intValue();
                int i3 = (int) (jLongValue - c1177cCA.k);
                if (i3 >= 0) {
                    AbstractC0985aF abstractC0985aF = c1177cCA.r;
                    if (abstractC0985aF.size() < i3) {
                        XE xe = AbstractC0985aF.m;
                        listUnmodifiableList = M60.p;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        if (i3 < abstractC0985aF.size()) {
                            if (iIntValue != -1) {
                                ZB zb = (ZB) abstractC0985aF.get(i3);
                                if (iIntValue == 0) {
                                    arrayList.add(zb);
                                } else if (iIntValue < zb.x.size()) {
                                    AbstractC0985aF abstractC0985aF2 = zb.x;
                                    arrayList.addAll(abstractC0985aF2.subList(iIntValue, abstractC0985aF2.size()));
                                }
                                i3++;
                            }
                            arrayList.addAll(abstractC0985aF.subList(i3, abstractC0985aF.size()));
                            iIntValue = 0;
                        }
                        if (c1177cCA.n != -9223372036854775807L) {
                            if (iIntValue == -1) {
                                iIntValue = 0;
                            }
                            AbstractC0985aF abstractC0985aF3 = c1177cCA.s;
                            if (iIntValue < abstractC0985aF3.size()) {
                                arrayList.addAll(abstractC0985aF3.subList(iIntValue, abstractC0985aF3.size()));
                            }
                        }
                        listUnmodifiableList = Collections.unmodifiableList(arrayList);
                    }
                } else {
                    XE xe2 = AbstractC0985aF.m;
                    listUnmodifiableList = M60.p;
                }
                interfaceC2940uOArr[i] = new NB(j2, listUnmodifiableList);
            } else {
                interfaceC2940uOArr[i2] = InterfaceC2940uO.j;
                i = i2;
            }
            i2 = i + 1;
            z = false;
        }
        return interfaceC2940uOArr;
    }

    public final int b(VB vb) {
        if (vb.z == -1) {
            return 1;
        }
        C1177cC c1177cCA = this.g.a(this.e[this.h.a(vb.f1028o)], false);
        c1177cCA.getClass();
        int i = (int) (vb.u - c1177cCA.k);
        if (i < 0) {
            return 1;
        }
        AbstractC0985aF abstractC0985aF = c1177cCA.r;
        AbstractC0985aF abstractC0985aF2 = i < abstractC0985aF.size() ? ((ZB) abstractC0985aF.get(i)).x : c1177cCA.s;
        int size = abstractC0985aF2.size();
        int i2 = vb.z;
        if (i2 >= size) {
            return 2;
        }
        XB xb = (XB) abstractC0985aF2.get(i2);
        if (xb.x) {
            return 0;
        }
        return Lr0.a(Uri.parse(AbstractC3045vW.C(c1177cCA.a, xb.l)), vb.m.a) ? 1 : 2;
    }

    public final Pair c(VB vb, boolean z, C1177cC c1177cC, long j, long j2) {
        boolean z2 = true;
        int i = -1;
        if (vb != null && !z) {
            boolean z3 = vb.T;
            long jA = vb.u;
            int i2 = vb.z;
            if (!z3) {
                return new Pair(Long.valueOf(jA), Integer.valueOf(i2));
            }
            if (i2 == -1) {
                jA = vb.a();
            }
            return new Pair(Long.valueOf(jA), Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
        }
        long j3 = c1177cC.u + j;
        if (vb != null && !this.q) {
            j2 = vb.r;
        }
        boolean z4 = c1177cC.f710o;
        long j4 = c1177cC.k;
        AbstractC0985aF abstractC0985aF = c1177cC.r;
        if (!z4 && j2 >= j3) {
            return new Pair(Long.valueOf(j4 + ((long) abstractC0985aF.size())), -1);
        }
        long j5 = j2 - j;
        Long lValueOf = Long.valueOf(j5);
        if (this.g.x && vb != null) {
            z2 = false;
        }
        int iC = Lr0.c(abstractC0985aF, lValueOf, z2);
        long j6 = ((long) iC) + j4;
        if (iC >= 0) {
            ZB zb = (ZB) abstractC0985aF.get(iC);
            long j7 = zb.p + zb.n;
            AbstractC0985aF abstractC0985aF2 = c1177cC.s;
            AbstractC0985aF abstractC0985aF3 = j5 < j7 ? zb.x : abstractC0985aF2;
            for (int i3 = 0; i3 < abstractC0985aF3.size(); i3++) {
                XB xb = (XB) abstractC0985aF3.get(i3);
                if (j5 < xb.p + xb.n) {
                    if (!xb.w) {
                        break;
                    }
                    j6 += abstractC0985aF3 == abstractC0985aF2 ? 1L : 0L;
                    i = i3;
                    break;
                }
            }
        }
        return new Pair(Long.valueOf(j6), Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MB d(Uri uri, int i, boolean z) {
        if (uri == null) {
            return null;
        }
        C0334By c0334By = this.j;
        byte[] bArr = (byte[]) ((C0308Ay) c0334By.m).remove(uri);
        if (bArr != null) {
            return null;
        }
        R60 r60 = R60.r;
        Collections.emptyMap();
        C2970uj c2970uj = new C2970uj(uri, 0L, 1, null, r60, 0L, -1L, null, 1, null);
        C0643Nw c0643Nw = this.f[i];
        int iM = this.r.m();
        Object objQ = this.r.q();
        byte[] bArr2 = this.n;
        MB mb = new MB(this.c, c2970uj, 3, c0643Nw, iM, objQ, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = Lr0.e;
        }
        mb.u = bArr2;
        return mb;
    }
}
