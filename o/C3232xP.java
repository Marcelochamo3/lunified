package o;

/* JADX INFO: renamed from: o.xP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3232xP {
    public final CP a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public C3232xP(CP cp, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        AbstractC0397Ej.c(!z4 || z2);
        AbstractC0397Ej.c(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        AbstractC0397Ej.c(z5);
        this.a = cp;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final C3232xP a(long j) {
        if (j == this.c) {
            return this;
        }
        return new C3232xP(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final C3232xP b(long j) {
        if (j == this.b) {
            return this;
        }
        return new C3232xP(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3232xP.class != obj.getClass()) {
            return false;
        }
        C3232xP c3232xP = (C3232xP) obj;
        return this.b == c3232xP.b && this.c == c3232xP.c && this.d == c3232xP.d && this.e == c3232xP.e && this.f == c3232xP.f && this.g == c3232xP.g && this.h == c3232xP.h && this.i == c3232xP.i && Lr0.a(this.a, c3232xP.a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
