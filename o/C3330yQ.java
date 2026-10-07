package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: o.yQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3330yQ implements InterfaceC2941uP, InterfaceC2844tP {
    public final InterfaceC2941uP[] l;
    public final IdentityHashMap m;
    public final C0622Nb n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f1133o = new ArrayList();
    public final HashMap p = new HashMap();
    public InterfaceC2844tP q;
    public C1031am0 r;
    public InterfaceC2941uP[] s;
    public C2133m1 t;

    public C3330yQ(C0622Nb c0622Nb, long[] jArr, InterfaceC2941uP... interfaceC2941uPArr) {
        this.n = c0622Nb;
        this.l = interfaceC2941uPArr;
        c0622Nb.getClass();
        this.t = new C2133m1(10, new Ub0[0]);
        this.m = new IdentityHashMap();
        this.s = new InterfaceC2941uP[0];
        for (int i = 0; i < interfaceC2941uPArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.l[i] = new C3136wQ(interfaceC2941uPArr[i], j);
            }
        }
    }

    @Override // o.Ub0
    public final long A() {
        return this.t.A();
    }

    @Override // o.InterfaceC2941uP
    public final void B() {
        for (InterfaceC2941uP interfaceC2941uP : this.l) {
            interfaceC2941uP.B();
        }
    }

    @Override // o.InterfaceC2941uP
    public final void E(long j, boolean z) {
        for (InterfaceC2941uP interfaceC2941uP : this.s) {
            interfaceC2941uP.E(j, z);
        }
    }

    @Override // o.InterfaceC2941uP
    public final long F(InterfaceC1920js[] interfaceC1920jsArr, boolean[] zArr, D90[] d90Arr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[interfaceC1920jsArr.length];
        int[] iArr2 = new int[interfaceC1920jsArr.length];
        int i = 0;
        while (true) {
            int length = interfaceC1920jsArr.length;
            identityHashMap = this.m;
            if (i >= length) {
                break;
            }
            D90 d90 = d90Arr[i];
            Integer num = d90 == null ? null : (Integer) identityHashMap.get(d90);
            iArr[i] = num == null ? -1 : num.intValue();
            InterfaceC1920js interfaceC1920js = interfaceC1920jsArr[i];
            if (interfaceC1920js != null) {
                String str = interfaceC1920js.j().m;
                iArr2[i] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i] = -1;
            }
            i++;
        }
        identityHashMap.clear();
        int length2 = interfaceC1920jsArr.length;
        D90[] d90Arr2 = new D90[length2];
        D90[] d90Arr3 = new D90[interfaceC1920jsArr.length];
        InterfaceC1920js[] interfaceC1920jsArr2 = new InterfaceC1920js[interfaceC1920jsArr.length];
        InterfaceC2941uP[] interfaceC2941uPArr = this.l;
        ArrayList arrayList = new ArrayList(interfaceC2941uPArr.length);
        long j2 = j;
        int i2 = 0;
        while (i2 < interfaceC2941uPArr.length) {
            int i3 = 0;
            while (i3 < interfaceC1920jsArr.length) {
                d90Arr3[i3] = iArr[i3] == i2 ? d90Arr[i3] : null;
                if (iArr2[i3] == i2) {
                    InterfaceC1920js interfaceC1920js2 = interfaceC1920jsArr[i3];
                    interfaceC1920js2.getClass();
                    Zl0 zl0 = (Zl0) this.p.get(interfaceC1920js2.j());
                    zl0.getClass();
                    interfaceC1920jsArr2[i3] = new C3039vQ(interfaceC1920js2, zl0);
                } else {
                    interfaceC1920jsArr2[i3] = null;
                }
                i3++;
                arrayList = arrayList;
            }
            ArrayList arrayList2 = arrayList;
            int i4 = i2;
            InterfaceC2941uP[] interfaceC2941uPArr2 = interfaceC2941uPArr;
            InterfaceC1920js[] interfaceC1920jsArr3 = interfaceC1920jsArr2;
            long jF = interfaceC2941uPArr[i2].F(interfaceC1920jsArr2, zArr, d90Arr3, zArr2, j2);
            if (i4 == 0) {
                j2 = jF;
            } else if (jF != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < interfaceC1920jsArr.length; i5++) {
                if (iArr2[i5] == i4) {
                    D90 d91 = d90Arr3[i5];
                    d91.getClass();
                    d90Arr2[i5] = d90Arr3[i5];
                    identityHashMap.put(d91, Integer.valueOf(i4));
                    z = true;
                } else if (iArr[i5] == i4) {
                    AbstractC0397Ej.f(d90Arr3[i5] == null);
                }
            }
            if (z) {
                arrayList2.add(interfaceC2941uPArr2[i4]);
            }
            i2 = i4 + 1;
            arrayList = arrayList2;
            interfaceC2941uPArr = interfaceC2941uPArr2;
            interfaceC1920jsArr2 = interfaceC1920jsArr3;
        }
        System.arraycopy(d90Arr2, 0, d90Arr, 0, length2);
        InterfaceC2941uP[] interfaceC2941uPArr3 = (InterfaceC2941uP[]) arrayList.toArray(new InterfaceC2941uP[0]);
        this.s = interfaceC2941uPArr3;
        this.n.getClass();
        this.t = new C2133m1(10, interfaceC2941uPArr3);
        return j2;
    }

    @Override // o.InterfaceC2941uP
    public final long I(long j) {
        long jI = this.s[0].I(j);
        int i = 1;
        while (true) {
            InterfaceC2941uP[] interfaceC2941uPArr = this.s;
            if (i >= interfaceC2941uPArr.length) {
                return jI;
            }
            if (interfaceC2941uPArr[i].I(jI) != jI) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // o.Ub0
    public final boolean K(long j) {
        ArrayList arrayList = this.f1133o;
        if (arrayList.isEmpty()) {
            return this.t.K(j);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC2941uP) arrayList.get(i)).K(j);
        }
        return false;
    }

    @Override // o.InterfaceC2941uP
    public final long L(long j, C2761sb0 c2761sb0) {
        InterfaceC2941uP[] interfaceC2941uPArr = this.s;
        return (interfaceC2941uPArr.length > 0 ? interfaceC2941uPArr[0] : this.l[0]).L(j, c2761sb0);
    }

    @Override // o.Ub0
    public final void O(long j) {
        this.t.O(j);
    }

    @Override // o.Ub0
    public final boolean b() {
        return this.t.b();
    }

    @Override // o.InterfaceC2941uP
    public final void c(InterfaceC2844tP interfaceC2844tP, long j) {
        this.q = interfaceC2844tP;
        ArrayList arrayList = this.f1133o;
        InterfaceC2941uP[] interfaceC2941uPArr = this.l;
        Collections.addAll(arrayList, interfaceC2941uPArr);
        for (InterfaceC2941uP interfaceC2941uP : interfaceC2941uPArr) {
            interfaceC2941uP.c(this, j);
        }
    }

    @Override // o.InterfaceC2844tP
    public final void d(InterfaceC2941uP interfaceC2941uP) {
        ArrayList arrayList = this.f1133o;
        arrayList.remove(interfaceC2941uP);
        if (arrayList.isEmpty()) {
            InterfaceC2941uP[] interfaceC2941uPArr = this.l;
            int i = 0;
            for (InterfaceC2941uP interfaceC2941uP2 : interfaceC2941uPArr) {
                i += interfaceC2941uP2.t().l;
            }
            Zl0[] zl0Arr = new Zl0[i];
            int i2 = 0;
            for (int i3 = 0; i3 < interfaceC2941uPArr.length; i3++) {
                C1031am0 c1031am0T = interfaceC2941uPArr[i3].t();
                int i4 = c1031am0T.l;
                int i5 = 0;
                while (i5 < i4) {
                    Zl0 zl0A = c1031am0T.a(i5);
                    Zl0 zl0 = new Zl0(i3 + ":" + zl0A.m, zl0A.f665o);
                    this.p.put(zl0, zl0A);
                    zl0Arr[i2] = zl0;
                    i5++;
                    i2++;
                }
            }
            this.r = new C1031am0(zl0Arr);
            InterfaceC2844tP interfaceC2844tP = this.q;
            interfaceC2844tP.getClass();
            interfaceC2844tP.d(this);
        }
    }

    @Override // o.Tb0
    public final void e(Ub0 ub0) {
        InterfaceC2844tP interfaceC2844tP = this.q;
        interfaceC2844tP.getClass();
        interfaceC2844tP.e(this);
    }

    @Override // o.Ub0
    public final long o() {
        return this.t.o();
    }

    @Override // o.InterfaceC2941uP
    public final long p() {
        long j = -9223372036854775807L;
        for (InterfaceC2941uP interfaceC2941uP : this.s) {
            long jP = interfaceC2941uP.p();
            if (jP == -9223372036854775807L) {
                if (j != -9223372036854775807L && interfaceC2941uP.I(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (InterfaceC2941uP interfaceC2941uP2 : this.s) {
                    if (interfaceC2941uP2 == interfaceC2941uP) {
                        break;
                    }
                    if (interfaceC2941uP2.I(jP) != jP) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jP;
            } else if (jP != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // o.InterfaceC2941uP
    public final C1031am0 t() {
        C1031am0 c1031am0 = this.r;
        c1031am0.getClass();
        return c1031am0;
    }
}
