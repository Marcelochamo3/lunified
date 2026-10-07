package o;

/* JADX INFO: loaded from: classes.dex */
public final class GN {
    public final String a;
    public final ZF b;

    public GN(String str, ZF zf) {
        this.a = str;
        this.b = zf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GN)) {
            return false;
        }
        GN gn = (GN) obj;
        return AbstractC1474fG.b(this.a, gn.a) && AbstractC1474fG.b(this.b, gn.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
