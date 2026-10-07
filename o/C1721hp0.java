package o;

import java.util.List;

/* JADX INFO: renamed from: o.hp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1721hp0 extends AbstractC1818ip0 {
    public final List a;
    public final boolean b;

    public C1721hp0(List list, boolean z) {
        AbstractC1474fG.j(list, "tvShows");
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1721hp0)) {
            return false;
        }
        C1721hp0 c1721hp0 = (C1721hp0) obj;
        return AbstractC1474fG.b(this.a, c1721hp0.a) && this.b == c1721hp0.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "SuccessLoading(tvShows=" + this.a + ", hasMore=" + this.b + ")";
    }
}
