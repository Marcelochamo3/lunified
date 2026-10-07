package o;

import java.util.Comparator;

/* JADX INFO: renamed from: o.Xl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0892Xl extends AbstractC0944Zl implements Comparable {
    public final int p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final boolean x;

    public C0892Xl(int i, Zl0 zl0, int i2, C0814Ul c0814Ul, int i3, String str) {
        int iG;
        super(i, zl0, i2);
        int i4 = 0;
        this.q = C1128bm.i(i3, false);
        int i5 = this.f664o.f421o & (~c0814Ul.F);
        this.r = (i5 & 1) != 0;
        this.s = (i5 & 2) != 0;
        AbstractC0985aF abstractC0985aF = c0814Ul.D;
        AbstractC0985aF abstractC0985aFQ = abstractC0985aF.isEmpty() ? AbstractC0985aF.q("") : abstractC0985aF;
        int i6 = 0;
        while (true) {
            if (i6 >= abstractC0985aFQ.size()) {
                i6 = Integer.MAX_VALUE;
                iG = 0;
                break;
            } else {
                iG = C1128bm.g(this.f664o, (String) abstractC0985aFQ.get(i6), c0814Ul.G);
                if (iG > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.t = i6;
        this.u = iG;
        int iD = C1128bm.d(this.f664o.p, c0814Ul.E);
        this.v = iD;
        this.x = (this.f664o.p & 1088) != 0;
        int iG2 = C1128bm.g(this.f664o, str, C1128bm.k(str) == null);
        this.w = iG2;
        boolean z = iG > 0 || (abstractC0985aF.isEmpty() && iD > 0) || this.r || (this.s && iG2 > 0);
        if (C1128bm.i(i3, c0814Ul.V) && z) {
            i4 = 1;
        }
        this.p = i4;
    }

    @Override // o.AbstractC0944Zl
    public final int a() {
        return this.p;
    }

    @Override // o.AbstractC0944Zl
    public final /* bridge */ /* synthetic */ boolean b(AbstractC0944Zl abstractC0944Zl) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0892Xl c0892Xl) {
        AbstractC0393Ef abstractC0393EfC = AbstractC0393Ef.a.c(this.q, c0892Xl.q);
        Integer numValueOf = Integer.valueOf(this.t);
        Integer numValueOf2 = Integer.valueOf(c0892Xl.t);
        Comparator comparator = C3333yT.l;
        comparator.getClass();
        C3117w80 c3117w80 = C3117w80.l;
        AbstractC0393Ef abstractC0393EfB = abstractC0393EfC.b(numValueOf, numValueOf2, c3117w80);
        int i = this.u;
        AbstractC0393Ef abstractC0393EfA = abstractC0393EfB.a(i, c0892Xl.u);
        int i2 = this.v;
        AbstractC0393Ef abstractC0393EfC2 = abstractC0393EfA.a(i2, c0892Xl.v).c(this.r, c0892Xl.r);
        Boolean boolValueOf = Boolean.valueOf(this.s);
        Boolean boolValueOf2 = Boolean.valueOf(c0892Xl.s);
        if (i != 0) {
            comparator = c3117w80;
        }
        AbstractC0393Ef abstractC0393EfA2 = abstractC0393EfC2.b(boolValueOf, boolValueOf2, comparator).a(this.w, c0892Xl.w);
        if (i2 == 0) {
            abstractC0393EfA2 = abstractC0393EfA2.d(this.x, c0892Xl.x);
        }
        return abstractC0393EfA2.e();
    }
}
