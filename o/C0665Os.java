package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o.Os, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0665Os {
    public final List a;
    public final Map b;

    public C0665Os(List list, LinkedHashMap linkedHashMap) {
        this.a = list;
        this.b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0665Os)) {
            return false;
        }
        C0665Os c0665Os = (C0665Os) obj;
        return AbstractC1474fG.b(this.a, c0665Os.a) && AbstractC1474fG.b(this.b, c0665Os.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FanaCatalog(filters=" + this.a + ", scenes=" + this.b + ")";
    }
}
