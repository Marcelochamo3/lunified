package o;

import java.util.List;

/* JADX INFO: renamed from: o.An, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0297An {
    public final String a;
    public final List b;

    public C0297An(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0297An)) {
            return false;
        }
        C0297An c0297An = (C0297An) obj;
        return AbstractC1474fG.b(this.a, c0297An.a) && AbstractC1474fG.b(this.b, c0297An.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DohAnswer(provider=" + this.a + ", addresses=" + this.b + ")";
    }
}
