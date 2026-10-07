package o;

/* JADX INFO: renamed from: o.on0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2398on0 {
    public final Js0 a;
    public final long b;

    public C2398on0(Js0 js0, long j) {
        this.a = js0;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2398on0)) {
            return false;
        }
        C2398on0 c2398on0 = (C2398on0) obj;
        return AbstractC1474fG.b(this.a, c2398on0.a) && this.b == c2398on0.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "CachedVodResolution(video=" + this.a + ", cachedAtMs=" + this.b + ")";
    }
}
