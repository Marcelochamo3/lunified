package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3201x2 {
    public final long a;
    public final Fj0 b;
    public final int c;
    public final CP d;
    public final long e;
    public final Fj0 f;
    public final int g;
    public final CP h;
    public final long i;
    public final long j;

    public C3201x2(long j, Fj0 fj0, int i, CP cp, long j2, Fj0 fj1, int i2, CP cp2, long j3, long j4) {
        this.a = j;
        this.b = fj0;
        this.c = i;
        this.d = cp;
        this.e = j2;
        this.f = fj1;
        this.g = i2;
        this.h = cp2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3201x2.class != obj.getClass()) {
            return false;
        }
        C3201x2 c3201x2 = (C3201x2) obj;
        return this.a == c3201x2.a && this.c == c3201x2.c && this.e == c3201x2.e && this.g == c3201x2.g && this.i == c3201x2.i && this.j == c3201x2.j && AbstractC1459f50.p(this.b, c3201x2.b) && AbstractC1459f50.p(this.d, c3201x2.d) && AbstractC1459f50.p(this.f, c3201x2.f) && AbstractC1459f50.p(this.h, c3201x2.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
