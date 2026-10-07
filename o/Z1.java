package o;

/* JADX INFO: loaded from: classes.dex */
public final class Z1 {
    public final long a;
    public final long b;

    public Z1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z1)) {
            return false;
        }
        Z1 z1 = (Z1) obj;
        return this.a == z1.a && this.b == z1.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
