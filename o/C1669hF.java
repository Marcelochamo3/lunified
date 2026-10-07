package o;

/* JADX INFO: renamed from: o.hF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1669hF {
    public final long a;
    public final C1767iF b;

    public C1669hF(long j, C1767iF c1767iF) {
        this.a = j;
        this.b = c1767iF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1669hF)) {
            return false;
        }
        C1669hF c1669hF = (C1669hF) obj;
        return this.a == c1669hF.a && AbstractC1474fG.b(this.b, c1669hF.b);
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        C1767iF c1767iF = this.b;
        return i + (c1767iF == null ? 0 : c1767iF.hashCode());
    }

    public final String toString() {
        return "CachedUpdateCheck(checkedAtElapsedMs=" + this.a + ", release=" + this.b + ")";
    }
}
