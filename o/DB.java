package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DB implements EB {
    public final List a;
    public final List b;

    public DB(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DB)) {
            return false;
        }
        DB db = (DB) obj;
        return AbstractC1474fG.b(this.a, db.a) && AbstractC1474fG.b(this.b, db.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(movies=" + this.a + ", episodes=" + this.b + ")";
    }
}
