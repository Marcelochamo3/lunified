package o;

/* JADX INFO: renamed from: o.am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1030am extends AbstractC0944Zl {
    public final boolean A;
    public final boolean B;
    public final int C;
    public final boolean p;
    public final C0814Ul q;
    public final boolean r;
    public final boolean s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final int z;

    /* JADX WARN: Code duplicated, block: B:31:0x004b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0079  */
    public C1030am(int i, Zl0 zl0, int i2, C0814Ul c0814Ul, int i3, int i4, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        C0643Nw c0643Nw;
        int i5;
        int i6;
        int i7;
        C0643Nw c0643Nw2;
        int i8;
        int i9;
        int i10;
        super(i, zl0, i2);
        this.q = c0814Ul;
        int i11 = c0814Ul.N ? 24 : 16;
        int i12 = 1;
        int i13 = 0;
        this.y = c0814Ul.M && (i4 & i11) != 0;
        if (!z || (((i8 = (c0643Nw2 = this.f664o).B) != -1 && i8 > c0814Ul.l) || ((i9 = c0643Nw2.C) != -1 && i9 > c0814Ul.m))) {
            z2 = false;
        } else {
            float f = c0643Nw2.D;
            if ((f == -1.0f || f <= c0814Ul.n) && ((i10 = c0643Nw2.s) == -1 || i10 <= c0814Ul.f816o)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.p = z2;
        if (!z || (((i5 = (c0643Nw = this.f664o).B) != -1 && i5 < c0814Ul.p) || ((i6 = c0643Nw.C) != -1 && i6 < c0814Ul.q))) {
            z3 = false;
        } else {
            float f2 = c0643Nw.D;
            if ((f2 == -1.0f || f2 >= c0814Ul.r) && ((i7 = c0643Nw.s) == -1 || i7 >= c0814Ul.s)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.r = z3;
        this.s = C1128bm.i(i3, false);
        C0643Nw c0643Nw3 = this.f664o;
        this.t = c0643Nw3.s;
        this.u = c0643Nw3.b();
        this.w = C1128bm.d(this.f664o.p, c0814Ul.x);
        int i14 = this.f664o.p;
        this.x = i14 == 0 || (i14 & 1) != 0;
        int i15 = 0;
        while (true) {
            AbstractC0985aF abstractC0985aF = c0814Ul.w;
            if (i15 >= abstractC0985aF.size()) {
                i15 = Integer.MAX_VALUE;
                break;
            }
            String str = this.f664o.w;
            if (str != null && str.equals(abstractC0985aF.get(i15))) {
                break;
            } else {
                i15++;
            }
        }
        this.v = i15;
        this.A = AbstractC1674hK.f(i3) == 128;
        this.B = AbstractC1674hK.g(i3) == 64;
        this.C = C1128bm.e(this.f664o.w);
        C0643Nw c0643Nw4 = this.f664o;
        if ((c0643Nw4.p & 16384) == 0) {
            C0814Ul c0814Ul2 = this.q;
            if (C1128bm.i(i3, c0814Ul2.V) && ((z4 = this.p) || c0814Ul2.L)) {
                if (C1128bm.i(i3, false) && this.r && z4 && c0643Nw4.s != -1 && !c0814Ul2.I && !c0814Ul2.H && (i11 & i3) != 0) {
                    i12 = 2;
                }
                i13 = i12;
            }
        }
        this.z = i13;
    }

    public static int c(C1030am c1030am, C1030am c1030am2) {
        HW hwA = (c1030am.p && c1030am.s) ? C1128bm.j : C1128bm.j.a();
        C0341Cf c0341Cf = AbstractC0393Ef.a;
        int i = c1030am.t;
        return c0341Cf.b(Integer.valueOf(i), Integer.valueOf(c1030am2.t), c1030am.q.H ? C1128bm.j.a() : C1128bm.k).b(Integer.valueOf(c1030am.u), Integer.valueOf(c1030am2.u), hwA).b(Integer.valueOf(i), Integer.valueOf(c1030am2.t), hwA).e();
    }

    public static int d(C1030am c1030am, C1030am c1030am2) {
        AbstractC0393Ef abstractC0393EfC = AbstractC0393Ef.a.c(c1030am.s, c1030am2.s).a(c1030am.w, c1030am2.w).c(c1030am.x, c1030am2.x).c(c1030am.p, c1030am2.p).c(c1030am.r, c1030am2.r);
        Integer numValueOf = Integer.valueOf(c1030am.v);
        Integer numValueOf2 = Integer.valueOf(c1030am2.v);
        C3333yT.l.getClass();
        AbstractC0393Ef abstractC0393EfB = abstractC0393EfC.b(numValueOf, numValueOf2, C3117w80.l);
        boolean z = c1030am2.A;
        boolean z2 = c1030am.A;
        AbstractC0393Ef abstractC0393EfC2 = abstractC0393EfB.c(z2, z);
        boolean z3 = c1030am2.B;
        boolean z4 = c1030am.B;
        AbstractC0393Ef abstractC0393EfC3 = abstractC0393EfC2.c(z4, z3);
        if (z2 && z4) {
            abstractC0393EfC3 = abstractC0393EfC3.a(c1030am.C, c1030am2.C);
        }
        return abstractC0393EfC3.e();
    }

    @Override // o.AbstractC0944Zl
    public final int a() {
        return this.z;
    }

    @Override // o.AbstractC0944Zl
    public final boolean b(AbstractC0944Zl abstractC0944Zl) {
        C1030am c1030am = (C1030am) abstractC0944Zl;
        if (this.y || Lr0.a(this.f664o.w, c1030am.f664o.w)) {
            if (!this.q.O) {
                if (this.A != c1030am.A || this.B != c1030am.B) {
                }
            }
            return true;
        }
        return false;
    }
}
