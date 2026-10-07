package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Zd0 implements D90 {
    public int l;
    public boolean m;
    public final /* synthetic */ C1113be0 n;

    public Zd0(C1113be0 c1113be0) {
        this.n = c1113be0;
    }

    @Override // o.D90
    public final void a() throws IOException {
        C1113be0 c1113be0 = this.n;
        if (c1113be0.v) {
            return;
        }
        c1113be0.t.a();
    }

    public final void b() {
        if (this.m) {
            return;
        }
        C1113be0 c1113be0 = this.n;
        c1113be0.p.m(IQ.i(c1113be0.u.w), c1113be0.u, 0, null, 0L);
        this.m = true;
    }

    @Override // o.D90
    public final boolean e() {
        return this.n.w;
    }

    @Override // o.D90
    public final int f(long j) {
        b();
        if (j <= 0 || this.l == 2) {
            return 0;
        }
        this.l = 2;
        return 1;
    }

    @Override // o.D90
    public final int g(C2994uv c2994uv, C0656Oj c0656Oj, int i) {
        b();
        C1113be0 c1113be0 = this.n;
        boolean z = c1113be0.w;
        if (z && c1113be0.x == null) {
            this.l = 2;
        }
        int i2 = this.l;
        if (i2 == 2) {
            c0656Oj.b(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            c2994uv.n = c1113be0.u;
            this.l = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        c1113be0.x.getClass();
        c0656Oj.b(1);
        c0656Oj.q = 0L;
        if ((i & 4) == 0) {
            c0656Oj.H(c1113be0.y);
            c0656Oj.f439o.put(c1113be0.x, 0, c1113be0.y);
        }
        if ((i & 1) == 0) {
            this.l = 2;
        }
        return -4;
    }
}
