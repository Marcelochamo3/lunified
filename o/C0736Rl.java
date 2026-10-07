package o;

import android.text.TextUtils;

/* JADX INFO: renamed from: o.Rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0736Rl extends AbstractC0944Zl implements Comparable {
    public final boolean A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final boolean F;
    public final boolean G;
    public final int p;
    public final boolean q;
    public final String r;
    public final C0814Ul s;
    public final boolean t;
    public final int u;
    public final int v;
    public final int w;
    public final boolean x;
    public final int y;
    public final int z;

    public C0736Rl(int i, Zl0 zl0, int i2, C0814Ul c0814Ul, int i3, boolean z, C0710Ql c0710Ql) {
        int i4;
        int iG;
        int iG2;
        boolean z2;
        super(i, zl0, i2);
        this.s = c0814Ul;
        this.r = C1128bm.k(this.f664o.n);
        int i5 = 0;
        this.t = C1128bm.i(i3, false);
        int i6 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i6 >= c0814Ul.y.size()) {
                i6 = Integer.MAX_VALUE;
                iG = 0;
                break;
            } else {
                iG = C1128bm.g(this.f664o, (String) c0814Ul.y.get(i6), false);
                if (iG > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.v = i6;
        this.u = iG;
        this.w = C1128bm.d(this.f664o.p, c0814Ul.z);
        C0643Nw c0643Nw = this.f664o;
        int i7 = c0643Nw.p;
        this.x = i7 == 0 || (i7 & 1) != 0;
        this.A = (c0643Nw.f421o & 1) != 0;
        int i8 = c0643Nw.J;
        this.B = i8;
        this.C = c0643Nw.K;
        int i9 = c0643Nw.s;
        this.D = i9;
        this.q = (i9 == -1 || i9 <= c0814Ul.B) && (i8 == -1 || i8 <= c0814Ul.A) && c0710Ql.apply(c0643Nw);
        String[] strArrB = Lr0.B();
        int i10 = 0;
        while (true) {
            if (i10 >= strArrB.length) {
                i10 = Integer.MAX_VALUE;
                iG2 = 0;
                break;
            } else {
                iG2 = C1128bm.g(this.f664o, strArrB[i10], false);
                if (iG2 > 0) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.y = i10;
        this.z = iG2;
        int i11 = 0;
        while (true) {
            AbstractC0985aF abstractC0985aF = c0814Ul.C;
            if (i11 < abstractC0985aF.size()) {
                String str = this.f664o.w;
                if (str != null && str.equals(abstractC0985aF.get(i11))) {
                    i4 = i11;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        this.E = i4;
        this.F = AbstractC1674hK.f(i3) == 128;
        this.G = AbstractC1674hK.g(i3) == 64;
        C0814Ul c0814Ul2 = this.s;
        if (C1128bm.i(i3, c0814Ul2.V) && ((z2 = this.q) || c0814Ul2.P)) {
            i5 = (!C1128bm.i(i3, false) || !z2 || this.f664o.s == -1 || c0814Ul2.I || c0814Ul2.H || (!c0814Ul2.X && z)) ? 1 : 2;
        }
        this.p = i5;
    }

    @Override // o.AbstractC0944Zl
    public final int a() {
        return this.p;
    }

    @Override // o.AbstractC0944Zl
    public final boolean b(AbstractC0944Zl abstractC0944Zl) {
        int i;
        String str;
        int i2;
        C0736Rl c0736Rl = (C0736Rl) abstractC0944Zl;
        C0814Ul c0814Ul = this.s;
        boolean z = c0814Ul.S;
        C0643Nw c0643Nw = c0736Rl.f664o;
        C0643Nw c0643Nw2 = this.f664o;
        if ((z || ((i2 = c0643Nw2.J) != -1 && i2 == c0643Nw.J)) && ((c0814Ul.Q || ((str = c0643Nw2.w) != null && TextUtils.equals(str, c0643Nw.w))) && (c0814Ul.R || ((i = c0643Nw2.K) != -1 && i == c0643Nw.K)))) {
            if (!c0814Ul.T) {
                if (this.F != c0736Rl.F || this.G != c0736Rl.G) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0736Rl c0736Rl) {
        boolean z = this.t;
        boolean z2 = this.q;
        HW hwA = (z2 && z) ? C1128bm.j : C1128bm.j.a();
        AbstractC0393Ef abstractC0393EfC = AbstractC0393Ef.a.c(z, c0736Rl.t);
        Integer numValueOf = Integer.valueOf(this.v);
        Integer numValueOf2 = Integer.valueOf(c0736Rl.v);
        C3333yT.l.getClass();
        C3117w80 c3117w80 = C3117w80.l;
        AbstractC0393Ef abstractC0393EfB = abstractC0393EfC.b(numValueOf, numValueOf2, c3117w80).a(this.u, c0736Rl.u).a(this.w, c0736Rl.w).c(this.A, c0736Rl.A).c(this.x, c0736Rl.x).b(Integer.valueOf(this.y), Integer.valueOf(c0736Rl.y), c3117w80).a(this.z, c0736Rl.z).c(z2, c0736Rl.q).b(Integer.valueOf(this.E), Integer.valueOf(c0736Rl.E), c3117w80);
        int i = this.D;
        Integer numValueOf3 = Integer.valueOf(i);
        int i2 = c0736Rl.D;
        AbstractC0393Ef abstractC0393EfB2 = abstractC0393EfB.b(numValueOf3, Integer.valueOf(i2), this.s.H ? C1128bm.j.a() : C1128bm.k).c(this.F, c0736Rl.F).c(this.G, c0736Rl.G).b(Integer.valueOf(this.B), Integer.valueOf(c0736Rl.B), hwA).b(Integer.valueOf(this.C), Integer.valueOf(c0736Rl.C), hwA);
        Integer numValueOf4 = Integer.valueOf(i);
        Integer numValueOf5 = Integer.valueOf(i2);
        if (!Lr0.a(this.r, c0736Rl.r)) {
            hwA = C1128bm.k;
        }
        return abstractC0393EfB2.b(numValueOf4, numValueOf5, hwA).e();
    }
}
