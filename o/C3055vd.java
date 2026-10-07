package o;

/* JADX INFO: renamed from: o.vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3055vd implements D90 {
    public final C3249xd l;
    public final C90 m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1076o;
    public final /* synthetic */ C3249xd p;

    public C3055vd(C3249xd c3249xd, C3249xd c3249xd2, C90 c90, int i) {
        this.p = c3249xd;
        this.l = c3249xd2;
        this.m = c90;
        this.n = i;
    }

    public final void b() {
        if (this.f1076o) {
            return;
        }
        C3249xd c3249xd = this.p;
        C2613qy c2613qy = c3249xd.r;
        int[] iArr = c3249xd.m;
        int i = this.n;
        c2613qy.m(iArr[i], c3249xd.n[i], 0, null, c3249xd.E);
        this.f1076o = true;
    }

    @Override // o.D90
    public final boolean e() {
        C3249xd c3249xd = this.p;
        return !c3249xd.n() && this.m.v(c3249xd.H);
    }

    @Override // o.D90
    public final int f(long j) {
        C3249xd c3249xd = this.p;
        if (c3249xd.n()) {
            return 0;
        }
        boolean z = c3249xd.H;
        C90 c90 = this.m;
        int iS = c90.s(j, z);
        AbstractC1269d8 abstractC1269d8 = c3249xd.G;
        if (abstractC1269d8 != null) {
            iS = Math.min(iS, abstractC1269d8.d(this.n + 1) - c90.q());
        }
        c90.F(iS);
        if (iS > 0) {
            b();
        }
        return iS;
    }

    @Override // o.D90
    public final int g(C2994uv c2994uv, C0656Oj c0656Oj, int i) {
        C3249xd c3249xd = this.p;
        if (c3249xd.n()) {
            return -3;
        }
        AbstractC1269d8 abstractC1269d8 = c3249xd.G;
        C90 c90 = this.m;
        if (abstractC1269d8 != null && abstractC1269d8.d(this.n + 1) <= c90.q()) {
            return -3;
        }
        b();
        return c90.A(c2994uv, c0656Oj, i, c3249xd.H);
    }

    @Override // o.D90
    public final void a() {
    }
}
