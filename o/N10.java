package o;

/* JADX INFO: loaded from: classes.dex */
public final class N10 extends O10 {
    public final Js0 a;
    public final Ds0 b;
    public final long c;

    public N10(Js0 js0, Ds0 ds0, long j) {
        AbstractC1474fG.j(ds0, "server");
        this.a = js0;
        this.b = ds0;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N10)) {
            return false;
        }
        N10 n10 = (N10) obj;
        return AbstractC1474fG.b(this.a, n10.a) && AbstractC1474fG.b(this.b, n10.b) && this.c == n10.c;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        long j = this.c;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessLoadingVideo(video=");
        sb.append(this.a);
        sb.append(", server=");
        sb.append(this.b);
        sb.append(", position=");
        return AbstractC1674hK.q(sb, this.c, ")");
    }
}
