package o;

/* JADX INFO: renamed from: o.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1984kb {
    public final String a;
    public final long b;
    public final long c;

    public C1984kb(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1984kb)) {
            return false;
        }
        C1984kb c1984kb = (C1984kb) obj;
        return AbstractC1474fG.b(this.a, c1984kb.a) && this.b == c1984kb.b && this.c == c1984kb.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "DeviceCredential(secret=" + this.a + ", expirySeconds=" + this.b + ", expiresAtMs=" + this.c + ")";
    }
}
