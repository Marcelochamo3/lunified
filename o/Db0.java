package o;

/* JADX INFO: loaded from: classes.dex */
public final class Db0 {
    public final long a;
    public final long b;

    public Db0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Db0.class != obj.getClass()) {
            return false;
        }
        Db0 db0 = (Db0) obj;
        return this.a == db0.a && this.b == db0.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
