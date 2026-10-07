package o;

import java.util.List;

/* JADX INFO: renamed from: o.fx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1541fx0 {
    public final List a;
    public final int b;

    public C1541fx0(int i, List list) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1541fx0)) {
            return false;
        }
        C1541fx0 c1541fx0 = (C1541fx0) obj;
        return AbstractC1474fG.b(this.a, c1541fx0.a) && this.b == c1541fx0.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "FilterPageResult(assets=" + this.a + ", totalSize=" + this.b + ")";
    }
}
