package o;

/* JADX INFO: renamed from: o.De, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0366De implements D90 {
    public final D90 l;
    public boolean m;
    public final /* synthetic */ C0392Ee n;

    public C0366De(C0392Ee c0392Ee, D90 d90) {
        this.n = c0392Ee;
        this.l = d90;
    }

    @Override // o.D90
    public final void a() {
        this.l.a();
    }

    @Override // o.D90
    public final boolean e() {
        return !this.n.a() && this.l.e();
    }

    @Override // o.D90
    public final int f(long j) {
        if (this.n.a()) {
            return -3;
        }
        return this.l.f(j);
    }

    @Override // o.D90
    public final int g(C2994uv c2994uv, C0656Oj c0656Oj, int i) {
        C0392Ee c0392Ee = this.n;
        if (c0392Ee.a()) {
            return -3;
        }
        if (this.m) {
            c0656Oj.m = 4;
            return -4;
        }
        long jA = c0392Ee.A();
        int iG = this.l.g(c2994uv, c0656Oj, i);
        if (iG != -5) {
            long j = c0392Ee.q;
            if (j == Long.MIN_VALUE || ((iG != -4 || c0656Oj.q < j) && !(iG == -3 && jA == Long.MIN_VALUE && !c0656Oj.p))) {
                return iG;
            }
            c0656Oj.E();
            c0656Oj.m = 4;
            this.m = true;
            return -4;
        }
        C0643Nw c0643Nw = (C0643Nw) c2994uv.n;
        c0643Nw.getClass();
        int i2 = c0643Nw.N;
        int i3 = c0643Nw.M;
        if (i3 != 0 || i2 != 0) {
            if (c0392Ee.p != 0) {
                i3 = 0;
            }
            if (c0392Ee.q != Long.MIN_VALUE) {
                i2 = 0;
            }
            C0617Mw c0617MwA = c0643Nw.a();
            c0617MwA.A = i3;
            c0617MwA.B = i2;
            c2994uv.n = c0617MwA.a();
        }
        return -5;
    }
}
