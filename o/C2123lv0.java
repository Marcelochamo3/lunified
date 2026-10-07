package o;

/* JADX INFO: renamed from: o.lv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2123lv0 {
    public final long a;
    public final long b;
    public final long c;

    public C2123lv0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2123lv0)) {
            return false;
        }
        C2123lv0 c2123lv0 = (C2123lv0) obj;
        return this.a == c2123lv0.a && this.b == c2123lv0.b && this.c == c2123lv0.c;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        return i + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "WatchHistory(lastEngagementTimeUtcMillis=" + this.a + ", lastPlaybackPositionMillis=" + this.b + ", durationMillis=" + this.c + ")";
    }
}
