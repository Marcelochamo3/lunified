package o;

import java.util.List;

/* JADX INFO: renamed from: o.du, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1338du implements InterfaceC1436eu {
    public final List a;
    public final List b;
    public final List c;

    public C1338du(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1338du)) {
            return false;
        }
        C1338du c1338du = (C1338du) obj;
        return AbstractC1474fG.b(this.a, c1338du.a) && AbstractC1474fG.b(this.b, c1338du.b) && AbstractC1474fG.b(this.c, c1338du.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + AbstractC1674hK.j(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Success(channels=" + this.a + ", movies=" + this.b + ", tvShows=" + this.c + ")";
    }
}
