package o;

/* JADX INFO: renamed from: o.bj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1123bj0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public C1123bj0(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1123bj0)) {
            return false;
        }
        C1123bj0 c1123bj0 = (C1123bj0) obj;
        return this.a == c1123bj0.a && this.b == c1123bj0.b && this.c == c1123bj0.c && this.d == c1123bj0.d && this.e == c1123bj0.e && this.f == c1123bj0.f;
    }

    public final int hashCode() {
        return (((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f;
    }

    public final String toString() {
        return "Palette(background=" + this.a + ", navigation=" + this.b + ", active=" + this.c + ", inactive=" + this.d + ", primaryText=" + this.e + ", secondaryText=" + this.f + ")";
    }
}
