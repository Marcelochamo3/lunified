package o;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.b20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1063b20 extends Fj0 {
    public static final /* synthetic */ int v = 0;
    public final int m;
    public final Jd0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f688o;
    public final int p;
    public final int[] q;
    public final int[] r;
    public final Fj0[] s;
    public final Object[] t;
    public final HashMap u;

    public C1063b20(Fj0[] fj0Arr, Object[] objArr, Jd0 jd0) {
        this.n = jd0;
        this.m = jd0.b.length;
        int length = fj0Arr.length;
        this.s = fj0Arr;
        this.q = new int[length];
        this.r = new int[length];
        this.t = objArr;
        this.u = new HashMap();
        int length2 = fj0Arr.length;
        int i = 0;
        int iP = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length2) {
            Fj0 fj0 = fj0Arr[i];
            this.s[i3] = fj0;
            this.r[i3] = iP;
            this.q[i3] = i2;
            iP += fj0.p();
            i2 += this.s[i3].i();
            this.u.put(objArr[i3], Integer.valueOf(i3));
            i++;
            i3++;
        }
        this.f688o = iP;
        this.p = i2;
    }

    @Override // o.Fj0
    public final int a(boolean z) {
        if (this.m == 0) {
            return -1;
        }
        int iR = 0;
        if (z) {
            int[] iArr = this.n.b;
            iR = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            Fj0[] fj0Arr = this.s;
            if (!fj0Arr[iR].q()) {
                return fj0Arr[iR].a(z) + this.r[iR];
            }
            iR = r(iR, z);
        } while (iR != -1);
        return -1;
    }

    @Override // o.Fj0
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.u.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        if (iIntValue == -1 || (iB = this.s[iIntValue].b(obj3)) == -1) {
            return -1;
        }
        return this.q[iIntValue] + iB;
    }

    @Override // o.Fj0
    public final int c(boolean z) {
        int iS;
        int i = this.m;
        if (i == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.n.b;
            iS = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            iS = i - 1;
        }
        do {
            Fj0[] fj0Arr = this.s;
            if (!fj0Arr[iS].q()) {
                return fj0Arr[iS].c(z) + this.r[iS];
            }
            iS = s(iS, z);
        } while (iS != -1);
        return -1;
    }

    @Override // o.Fj0
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.r;
        int iE = Lr0.e(iArr, i + 1, false, false);
        int i3 = iArr[iE];
        Fj0[] fj0Arr = this.s;
        int iE2 = fj0Arr[iE].e(i - i3, i2 != 2 ? i2 : 0, z);
        if (iE2 != -1) {
            return i3 + iE2;
        }
        int iR = r(iE, z);
        while (iR != -1 && fj0Arr[iR].q()) {
            iR = r(iR, z);
        }
        if (iR != -1) {
            return fj0Arr[iR].a(z) + iArr[iR];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // o.Fj0
    public final Dj0 g(int i, Dj0 dj0, boolean z) {
        int[] iArr = this.q;
        int iE = Lr0.e(iArr, i + 1, false, false);
        int i2 = this.r[iE];
        this.s[iE].g(i - iArr[iE], dj0, z);
        dj0.n += i2;
        if (z) {
            Object obj = this.t[iE];
            Object obj2 = dj0.m;
            obj2.getClass();
            dj0.m = Pair.create(obj, obj2);
        }
        return dj0;
    }

    @Override // o.Fj0
    public final Dj0 h(Object obj, Dj0 dj0) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.u.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.r[iIntValue];
        this.s[iIntValue].h(obj3, dj0);
        dj0.n += i;
        dj0.m = obj;
        return dj0;
    }

    @Override // o.Fj0
    public final int i() {
        return this.p;
    }

    @Override // o.Fj0
    public final int l(int i, int i2, boolean z) {
        int[] iArr = this.r;
        int iE = Lr0.e(iArr, i + 1, false, false);
        int i3 = iArr[iE];
        Fj0[] fj0Arr = this.s;
        int iL = fj0Arr[iE].l(i - i3, i2 != 2 ? i2 : 0, z);
        if (iL != -1) {
            return i3 + iL;
        }
        int iS = s(iE, z);
        while (iS != -1 && fj0Arr[iS].q()) {
            iS = s(iS, z);
        }
        if (iS != -1) {
            return fj0Arr[iS].c(z) + iArr[iS];
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // o.Fj0
    public final Object m(int i) {
        int[] iArr = this.q;
        int iE = Lr0.e(iArr, i + 1, false, false);
        return Pair.create(this.t[iE], this.s[iE].m(i - iArr[iE]));
    }

    @Override // o.Fj0
    public final Ej0 n(int i, Ej0 ej0, long j) {
        int[] iArr = this.r;
        int iE = Lr0.e(iArr, i + 1, false, false);
        int i2 = iArr[iE];
        int i3 = this.q[iE];
        this.s[iE].n(i - i2, ej0, j);
        Object objCreate = this.t[iE];
        if (!Ej0.C.equals(ej0.l)) {
            objCreate = Pair.create(objCreate, ej0.l);
        }
        ej0.l = objCreate;
        ej0.z += i3;
        ej0.A += i3;
        return ej0;
    }

    @Override // o.Fj0
    public final int p() {
        return this.f688o;
    }

    public final int r(int i, boolean z) {
        if (!z) {
            if (i < this.m - 1) {
                return i + 1;
            }
            return -1;
        }
        Jd0 jd0 = this.n;
        int i2 = jd0.c[i] + 1;
        int[] iArr = jd0.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int s(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        Jd0 jd0 = this.n;
        int i2 = jd0.c[i] - 1;
        if (i2 >= 0) {
            return jd0.b[i2];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1063b20(List list, Jd0 jd0) {
        Fj0[] fj0Arr = new Fj0[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            fj0Arr[i2] = ((JP) it.next()).b();
            i2++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((JP) it2.next()).a();
            i++;
        }
        this(fj0Arr, objArr, jd0);
    }
}
