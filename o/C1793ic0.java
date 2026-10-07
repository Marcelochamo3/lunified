package o;

/* JADX INFO: renamed from: o.ic0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1793ic0 {
    public final long a;
    public final long b;

    public C1793ic0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1793ic0)) {
            return false;
        }
        C1793ic0 c1793ic0 = (C1793ic0) obj;
        return this.a == c1793ic0.a && this.b == c1793ic0.b;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Anchor(serverEpochMs=");
        sb.append(this.a);
        sb.append(", elapsedRealtimeMs=");
        return AbstractC1674hK.q(sb, this.b, ")");
    }
}
