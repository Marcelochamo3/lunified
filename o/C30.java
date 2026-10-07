package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class C30 implements D90 {
    public final int l;
    public final /* synthetic */ E30 m;

    public C30(E30 e30, int i) {
        this.m = e30;
        this.l = i;
    }

    @Override // o.D90
    public final void a() throws IOException {
        E30 e30 = this.m;
        e30.D[this.l].x();
        int iV = e30.f228o.v(e30.M);
        Na0 na0 = e30.v;
        IOException iOException = (IOException) na0.f414o;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC1381eL handlerC1381eL = (HandlerC1381eL) na0.n;
        if (handlerC1381eL != null) {
            if (iV == Integer.MIN_VALUE) {
                iV = handlerC1381eL.l;
            }
            IOException iOException2 = handlerC1381eL.p;
            if (iOException2 != null && handlerC1381eL.q > iV) {
                throw iOException2;
            }
        }
    }

    @Override // o.D90
    public final boolean e() {
        E30 e30 = this.m;
        return !e30.w() && e30.D[this.l].v(e30.V);
    }

    @Override // o.D90
    public final int f(long j) {
        E30 e30 = this.m;
        if (e30.w()) {
            return 0;
        }
        int i = this.l;
        e30.q(i);
        C90 c90 = e30.D[i];
        int iS = c90.s(j, e30.V);
        c90.F(iS);
        if (iS != 0) {
            return iS;
        }
        e30.r(i);
        return iS;
    }

    @Override // o.D90
    public final int g(C2994uv c2994uv, C0656Oj c0656Oj, int i) {
        E30 e30 = this.m;
        if (e30.w()) {
            return -3;
        }
        int i2 = this.l;
        e30.q(i2);
        int iA = e30.D[i2].A(c2994uv, c0656Oj, i, e30.V);
        if (iA == -3) {
            e30.r(i2);
        }
        return iA;
    }
}
