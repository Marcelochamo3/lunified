package o;

/* JADX INFO: renamed from: o.hx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1737hx0 {
    public final String a;
    public final int b;

    public C1737hx0(String str, int i) {
        AbstractC1474fG.j(str, "contentId");
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1737hx0)) {
            return false;
        }
        C1737hx0 c1737hx0 = (C1737hx0) obj;
        return AbstractC1474fG.b(this.a, c1737hx0.a) && this.b == c1737hx0.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "SeasonRequest(contentId=" + this.a + ", volumeCount=" + this.b + ")";
    }
}
