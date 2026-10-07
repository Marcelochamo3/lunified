package o;

/* JADX INFO: renamed from: o.xQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3233xQ implements D90 {
    public final D90 l;
    public final long m;

    public C3233xQ(D90 d90, long j) {
        this.l = d90;
        this.m = j;
    }

    @Override // o.D90
    public final void a() {
        this.l.a();
    }

    @Override // o.D90
    public final boolean e() {
        return this.l.e();
    }

    @Override // o.D90
    public final int f(long j) {
        return this.l.f(j - this.m);
    }

    @Override // o.D90
    public final int g(C2994uv c2994uv, C0656Oj c0656Oj, int i) {
        int iG = this.l.g(c2994uv, c0656Oj, i);
        if (iG == -4) {
            c0656Oj.q = Math.max(0L, c0656Oj.q + this.m);
        }
        return iG;
    }
}
