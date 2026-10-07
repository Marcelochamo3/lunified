package o;

/* JADX INFO: renamed from: o.k8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1952k8 implements AZ {
    public final int m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Y60 f862o;
    public int p;
    public C3436zZ q;
    public int r;
    public D90 s;
    public C0643Nw[] t;
    public long u;
    public boolean w;
    public boolean x;
    public X60 y;
    public final Object l = new Object();
    public final C2994uv n = new C2994uv(1, false);
    public long v = Long.MIN_VALUE;

    public AbstractC1952k8(int i) {
        this.m = i;
    }

    public final Lr e(Exception exc, C0643Nw c0643Nw, boolean z, int i) {
        int iY;
        if (c0643Nw == null || this.x) {
            iY = 4;
        } else {
            this.x = true;
            try {
                iY = y(c0643Nw) & 7;
                this.x = false;
            } catch (Lr unused) {
                this.x = false;
                iY = 4;
            } catch (Throwable th) {
                this.x = false;
                throw th;
            }
        }
        return new Lr(1, exc, i, h(), this.p, c0643Nw, c0643Nw == null ? 4 : iY, z);
    }

    public final Lr f(LO lo, C0643Nw c0643Nw) {
        return e(lo, c0643Nw, false, 4002);
    }

    public InterfaceC3037vO g() {
        return null;
    }

    public abstract String h();

    public final boolean i() {
        return this.v == Long.MIN_VALUE;
    }

    public abstract boolean j();

    public abstract boolean k();

    public abstract void l();

    public abstract void n(long j, boolean z);

    public abstract void s(C0643Nw[] c0643NwArr, long j, long j2);

    public final int t(C2994uv c2994uv, C0656Oj c0656Oj, int i) {
        D90 d90 = this.s;
        d90.getClass();
        int iG = d90.g(c2994uv, c0656Oj, i);
        if (iG == -4) {
            if (c0656Oj.j(4)) {
                this.v = Long.MIN_VALUE;
                return this.w ? -4 : -3;
            }
            long j = c0656Oj.q + this.u;
            c0656Oj.q = j;
            this.v = Math.max(this.v, j);
        } else if (iG == -5) {
            C0643Nw c0643Nw = (C0643Nw) c2994uv.n;
            c0643Nw.getClass();
            long j2 = c0643Nw.A;
            if (j2 != Long.MAX_VALUE) {
                C0617Mw c0617MwA = c0643Nw.a();
                c0617MwA.f405o = j2 + this.u;
                c2994uv.n = c0617MwA.a();
            }
        }
        return iG;
    }

    public abstract void u(long j, long j2);

    public final void v(C0643Nw[] c0643NwArr, D90 d90, long j, long j2) {
        AbstractC0397Ej.f(!this.w);
        this.s = d90;
        if (this.v == Long.MIN_VALUE) {
            this.v = j;
        }
        this.t = c0643NwArr;
        this.u = j2;
        s(c0643NwArr, j, j2);
    }

    public final void w() {
        AbstractC0397Ej.f(this.r == 0);
        this.n.u();
        p();
    }

    public void x(float f, float f2) {
    }

    public abstract int y(C0643Nw c0643Nw);

    public int z() {
        return 0;
    }

    public void o() {
    }

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    @Override // o.AZ
    public void c(int i, Object obj) {
    }

    public void m(boolean z, boolean z2) {
    }
}
