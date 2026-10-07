package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.zB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3412zB {
    public final List a;
    public final List b;

    public C3412zB(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3412zB)) {
            return false;
        }
        C3412zB c3412zB = (C3412zB) obj;
        return AbstractC1474fG.b(this.a, c3412zB.a) && AbstractC1474fG.b(this.b, c3412zB.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProviderHistory(movies=" + this.a + ", episodes=" + this.b + ")";
    }
}
