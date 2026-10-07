package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.nZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2273nZ implements T9 {
    public final Object l;
    public final int m;
    public final C1971kP n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f937o;
    public final int p;
    public final long q;
    public final long r;
    public final int s;
    public final int t;

    static {
        int i = Lr0.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public C2273nZ(Object obj, int i, C1971kP c1971kP, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.l = obj;
        this.m = i;
        this.n = c1971kP;
        this.f937o = obj2;
        this.p = i2;
        this.q = j;
        this.r = j2;
        this.s = i3;
        this.t = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2273nZ.class != obj.getClass()) {
            return false;
        }
        C2273nZ c2273nZ = (C2273nZ) obj;
        return this.m == c2273nZ.m && this.p == c2273nZ.p && this.q == c2273nZ.q && this.r == c2273nZ.r && this.s == c2273nZ.s && this.t == c2273nZ.t && AbstractC1459f50.p(this.l, c2273nZ.l) && AbstractC1459f50.p(this.f937o, c2273nZ.f937o) && AbstractC1459f50.p(this.n, c2273nZ.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.l, Integer.valueOf(this.m), this.n, this.f937o, Integer.valueOf(this.p), Long.valueOf(this.q), Long.valueOf(this.r), Integer.valueOf(this.s), Integer.valueOf(this.t)});
    }
}
