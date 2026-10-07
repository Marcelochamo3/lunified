package o;

import java.util.List;

/* JADX INFO: renamed from: o.zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3463zn {
    public final List a;
    public final long b;

    public C3463zn(long j, List list) {
        this.a = list;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3463zn)) {
            return false;
        }
        C3463zn c3463zn = (C3463zn) obj;
        return AbstractC1474fG.b(this.a, c3463zn.a) && this.b == c3463zn.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "CachedDns(addresses=" + this.a + ", expiresAtElapsedMs=" + this.b + ")";
    }
}
