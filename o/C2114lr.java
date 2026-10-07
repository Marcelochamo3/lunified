package o;

/* JADX INFO: renamed from: o.lr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2114lr implements D90 {
    public final C0643Nw l;
    public long[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f901o;
    public C2211mr p;
    public boolean q;
    public int r;
    public final C2720s4 m = new C2720s4(26, (byte) 0);
    public long s = -9223372036854775807L;

    public C2114lr(C2211mr c2211mr, C0643Nw c0643Nw, boolean z) {
        this.l = c0643Nw;
        this.p = c2211mr;
        this.n = c2211mr.b;
        b(c2211mr, z);
    }

    public final void b(C2211mr c2211mr, boolean z) {
        int i = this.r;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.n[i - 1];
        this.f901o = z;
        this.p = c2211mr;
        long[] jArr = c2211mr.b;
        this.n = jArr;
        long j3 = this.s;
        if (j3 == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                this.r = Lr0.b(jArr, j2, false);
            }
        } else {
            int iB = Lr0.b(jArr, j3, true);
            this.r = iB;
            if (this.f901o && iB == this.n.length) {
                j = j3;
            }
            this.s = j;
        }
    }

    @Override // o.D90
    public final boolean e() {
        return true;
    }

    @Override // o.D90
    public final int f(long j) {
        int iMax = Math.max(this.r, Lr0.b(this.n, j, true));
        int i = iMax - this.r;
        this.r = iMax;
        return i;
    }

    @Override // o.D90
    public final int g(C2994uv c2994uv, C0656Oj c0656Oj, int i) {
        int i2 = this.r;
        boolean z = i2 == this.n.length;
        if (z && !this.f901o) {
            c0656Oj.m = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.q) {
            c2994uv.n = this.l;
            this.q = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.r = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrX = this.m.X(this.p.a[i2]);
            c0656Oj.H(bArrX.length);
            c0656Oj.f439o.put(bArrX);
        }
        c0656Oj.q = this.n[i2];
        c0656Oj.m = 1;
        return -4;
    }

    @Override // o.D90
    public final void a() {
    }
}
