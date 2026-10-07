package o;

/* JADX INFO: renamed from: o.n50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2239n50 {
    public final int a;
    public final int b;
    public final int c;

    public C2239n50(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2239n50.class != obj.getClass()) {
            return false;
        }
        C2239n50 c2239n50 = (C2239n50) obj;
        return this.a == c2239n50.a && this.b == c2239n50.b && this.c == c2239n50.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return this.b + "," + this.c + ":" + this.a;
    }
}
