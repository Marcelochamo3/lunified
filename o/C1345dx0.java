package o;

/* JADX INFO: renamed from: o.dx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1345dx0 {
    public final long a;
    public final long b;

    public C1345dx0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1345dx0)) {
            return false;
        }
        C1345dx0 c1345dx0 = (C1345dx0) obj;
        return this.a == c1345dx0.a && this.b == c1345dx0.b;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XuperCredentialLease(expiresAtEpochSeconds=");
        sb.append(this.a);
        sb.append(", generation=");
        return AbstractC1674hK.q(sb, this.b, ")");
    }
}
