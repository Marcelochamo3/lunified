package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Da0 extends Ea0 {
    public final List a;
    public final boolean b;

    public Da0(List list, boolean z) {
        AbstractC1474fG.j(list, "results");
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Da0)) {
            return false;
        }
        Da0 da0 = (Da0) obj;
        return AbstractC1474fG.b(this.a, da0.a) && this.b == da0.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "SuccessSearching(results=" + this.a + ", hasMore=" + this.b + ")";
    }
}
