package o;

/* JADX INFO: renamed from: o.xY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3241xY extends AbstractC3338yY {
    public final C1688hY a;
    public final boolean b;

    public C3241xY(C1688hY c1688hY, boolean z) {
        AbstractC1474fG.j(c1688hY, "people");
        this.a = c1688hY;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3241xY)) {
            return false;
        }
        C3241xY c3241xY = (C3241xY) obj;
        return AbstractC1474fG.b(this.a, c3241xY.a) && this.b == c3241xY.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "SuccessLoading(people=" + this.a + ", hasMore=" + this.b + ")";
    }
}
