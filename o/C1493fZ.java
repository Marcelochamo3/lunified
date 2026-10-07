package o;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: o.fZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1493fZ {
    public static final CP t = new CP(new Object());
    public final Fj0 a;
    public final CP b;
    public final long c;
    public final long d;
    public final int e;
    public final Lr f;
    public final boolean g;
    public final C1031am0 h;
    public final C1909jm0 i;
    public final List j;
    public final CP k;
    public final boolean l;
    public final int m;
    public final C1591gZ n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f774o;
    public volatile long p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public C1493fZ(Fj0 fj0, CP cp, long j, long j2, int i, Lr lr, boolean z, C1031am0 c1031am0, C1909jm0 c1909jm0, List list, CP cp2, boolean z2, int i2, C1591gZ c1591gZ, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = fj0;
        this.b = cp;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = lr;
        this.g = z;
        this.h = c1031am0;
        this.i = c1909jm0;
        this.j = list;
        this.k = cp2;
        this.l = z2;
        this.m = i2;
        this.n = c1591gZ;
        this.p = j3;
        this.q = j4;
        this.r = j5;
        this.s = j6;
        this.f774o = z3;
    }

    public static C1493fZ i(C1909jm0 c1909jm0) {
        Cj0 cj0 = Fj0.l;
        CP cp = t;
        return new C1493fZ(cj0, cp, -9223372036854775807L, 0L, 1, null, false, C1031am0.f678o, c1909jm0, M60.p, cp, false, 0, C1591gZ.f794o, 0L, 0L, 0L, 0L, false);
    }

    public final C1493fZ a() {
        return new C1493fZ(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, j(), SystemClock.elapsedRealtime(), this.f774o);
    }

    public final C1493fZ b(CP cp) {
        return new C1493fZ(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, cp, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.f774o);
    }

    public final C1493fZ c(CP cp, long j, long j2, long j3, long j4, C1031am0 c1031am0, C1909jm0 c1909jm0, List list) {
        return new C1493fZ(this.a, cp, j2, j3, this.e, this.f, this.g, c1031am0, c1909jm0, list, this.k, this.l, this.m, this.n, this.p, j4, j, SystemClock.elapsedRealtime(), this.f774o);
    }

    public final C1493fZ d(int i, boolean z) {
        return new C1493fZ(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, this.n, this.p, this.q, this.r, this.s, this.f774o);
    }

    public final C1493fZ e(Lr lr) {
        return new C1493fZ(this.a, this.b, this.c, this.d, this.e, lr, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.f774o);
    }

    public final C1493fZ f(C1591gZ c1591gZ) {
        return new C1493fZ(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, c1591gZ, this.p, this.q, this.r, this.s, this.f774o);
    }

    public final C1493fZ g(int i) {
        return new C1493fZ(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.f774o);
    }

    public final C1493fZ h(Fj0 fj0) {
        return new C1493fZ(fj0, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.f774o);
    }

    public final long j() {
        long j;
        long j2;
        if (!k()) {
            return this.r;
        }
        do {
            j = this.s;
            j2 = this.r;
        } while (j != this.s);
        return Lr0.K(Lr0.X(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.n.l)));
    }

    public final boolean k() {
        return this.e == 3 && this.l && this.m == 0;
    }
}
