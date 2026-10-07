package o;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Vd0 extends Fj0 {
    public static final Object y = new Object();
    public final long m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f577o;
    public final long p;
    public final long q;
    public final long r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final Object v;
    public final C1971kP w;
    public final C1385eP x;

    static {
        YO yo = new YO();
        C1093bP c1093bP = new C1093bP();
        List listEmptyList = Collections.emptyList();
        M60 m60 = M60.p;
        C1581gP c1581gP = C1581gP.n;
        Uri uri = Uri.EMPTY;
        AbstractC0397Ej.f(c1093bP.b == null || c1093bP.a != null);
        if (uri != null) {
            new C1483fP(uri, null, c1093bP.a != null ? new C1190cP(c1093bP) : null, null, listEmptyList, null, m60, null);
        }
        yo.a();
        C2263nP c2263nP = C2263nP.T;
    }

    public Vd0(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, C0519Jb c0519Jb, C1971kP c1971kP, C1385eP c1385eP) {
        this.m = j;
        this.n = j2;
        this.f577o = j3;
        this.p = j4;
        this.q = j5;
        this.r = j6;
        this.s = z;
        this.t = z2;
        this.u = z3;
        this.v = c0519Jb;
        c1971kP.getClass();
        this.w = c1971kP;
        this.x = c1385eP;
    }

    @Override // o.Fj0
    public final int b(Object obj) {
        return y.equals(obj) ? 0 : -1;
    }

    @Override // o.Fj0
    public final Dj0 g(int i, Dj0 dj0, boolean z) {
        AbstractC0397Ej.d(i, 1);
        Object obj = z ? y : null;
        long j = -this.q;
        dj0.getClass();
        dj0.j(null, obj, 0, this.f577o, j, U1.r, false);
        return dj0;
    }

    @Override // o.Fj0
    public final int i() {
        return 1;
    }

    @Override // o.Fj0
    public final Object m(int i) {
        AbstractC0397Ej.d(i, 1);
        return y;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d A[PHI: r1
  0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v5 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.Fj0
    public final Ej0 n(int i, Ej0 ej0, long j) {
        long j2;
        AbstractC0397Ej.d(i, 1);
        long j3 = this.r;
        boolean z = this.t;
        if (!z || this.u || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.p;
            if (j4 != -9223372036854775807L) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        ej0.b(Ej0.C, this.w, this.v, this.m, this.n, -9223372036854775807L, this.s, z, this.x, j2, this.p, 0, 0, this.q);
        return ej0;
    }

    @Override // o.Fj0
    public final int p() {
        return 1;
    }

    public Vd0(long j, boolean z, boolean z2, C1971kP c1971kP) {
        this(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, c1971kP, z2 ? c1971kP.n : null);
    }
}
