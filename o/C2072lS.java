package o;

import java.util.List;

/* JADX INFO: renamed from: o.lS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2072lS extends AbstractC2169mS {
    public final List a;
    public final boolean b;

    public C2072lS(List list, boolean z) {
        AbstractC1474fG.j(list, "movies");
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2072lS)) {
            return false;
        }
        C2072lS c2072lS = (C2072lS) obj;
        return AbstractC1474fG.b(this.a, c2072lS.a) && this.b == c2072lS.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "SuccessLoading(movies=" + this.a + ", hasMore=" + this.b + ")";
    }
}
