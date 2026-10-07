package o;

/* JADX INFO: renamed from: o.su, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2798su {
    public final long a;
    public final long b;
    public final String c;

    public C2798su(long j, long j2, String str) {
        AbstractC1474fG.j(str, "name");
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2798su)) {
            return false;
        }
        C2798su c2798su = (C2798su) obj;
        return this.a == c2798su.a && this.b == c2798su.b && AbstractC1474fG.b(this.c, c2798su.c);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.c.hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        return "StreamInfo(streamId=" + this.a + ", siteType=" + this.b + ", name=" + this.c + ")";
    }
}
