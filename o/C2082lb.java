package o;

/* JADX INFO: renamed from: o.lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2082lb {
    public final String a;
    public final long b;

    public C2082lb(long j, String str) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2082lb)) {
            return false;
        }
        C2082lb c2082lb = (C2082lb) obj;
        return AbstractC1474fG.b(this.a, c2082lb.a) && this.b == c2082lb.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "ExpiringToken(value=" + this.a + ", expiresAtMs=" + this.b + ")";
    }
}
